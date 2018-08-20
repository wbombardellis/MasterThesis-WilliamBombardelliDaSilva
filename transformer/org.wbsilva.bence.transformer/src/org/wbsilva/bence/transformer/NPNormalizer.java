package org.wbsilva.bence.transformer;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.graphgrammar.util.NPUtil;
import org.wbsilva.bence.graphgrammar.util.SymbolMap;
import org.wbsilva.bence.graphgrammar.util.SymbolSet;

/**
 * This class implements a neighborhood preserving (NP) normalizer, that is able to transform
 * any valid boundary grammar into an equivalent valid boundary neighborhood preserving grammar.
 * Moreover, it also normalizes the correspondent valid boundary triple graph grammar (TGG) to make it 
 * a valid boundary TGG with a neighborhood preserving input part.
 * 
 * @author wbombardellis
 *
 */
public class NPNormalizer {
	
	static final Logger logger = LogManager.getLogger(NPNormalizer.class);

	/**
	 * Transform {@code grammar} into its neighborhood preserving (NP) normal form.
	 * Moreover plugs correctly the fixed NP grammar into its corresponding triple grammar {@code tripleGrammar}
	 * Where it is plugged depends on the value of {@code forward}. If true, then it is plugged in the source part,
	 * otherwise in the target part.
	 * Attention: This method possibly modifies the original grammar and triple grammar 
	 * adding and removing rules and symbols to the alphabet.
	 * 
	 * @param tripleGrammar		A valid triple graph grammar
	 * @param grammar			A valid boundary grammar that is part (source or target) of the {@code tripleGrammar}
	 * @param forward			Signalizes in which part of the {@code tripleGrammar} {@code grammar} is,
	 * 							If true, then in the source part, otherwise in the target part
	 * @see NPUtil#getNonNPRules(Grammar)
	 */
	public void normalize(final TripleGrammar tripleGrammar, final Grammar grammar, final boolean forward){	
		assert GraphgrammarUtil.isValidTripleGrammar(tripleGrammar);
		assert GraphgrammarUtil.isValidGrammar(grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(grammar);
		assert GraphgrammarUtil.isSimpleLabeledGrammar(grammar);
		
		logger.debug(String.format("Starting neighborhood preserving (NP) normalization for grammar %s", grammar.getName()));

		Map<Rule, SymbolMap<SymbolSet>> nonNPRulesContext = NPUtil.getNonNPRules(grammar);
		while (!nonNPRulesContext.isEmpty()) {
			assert nonNPRulesContext.size() <= grammar.getRules().size();
			
			logger.debug(String.format("Found %d non NP rules. Fixing it", nonNPRulesContext.size()));
			
			Map<Rule, Map<Rule, Map<String, Vertex>>> newRules = new HashMap<>();
			final ArrayList<Rule> rulesToProcess = new ArrayList<>(grammar.getRules());
			
			//For each non neighborhood preserving rule A->R
			for (Entry<Rule, SymbolMap<SymbolSet>> rEntry : nonNPRulesContext.entrySet()) {
				final Rule nonNPRule = rEntry.getKey();
				final SymbolMap<SymbolSet> missingContext = rEntry.getValue();
				
				//Fix the actual non neighborhood preserving rule
				final Entry<Rule, Map<String, Vertex>> newGuest = fixGuestRule(nonNPRule, missingContext);
				assert newGuest != null;
				
				final Map<Rule, Map<String, Vertex>> m = new HashMap<>();
				m.put(newGuest.getKey(), newGuest.getValue());
				newRules.put(nonNPRule, m);
				
				//No need to process non NP rule. Only has to process its new versions
				rulesToProcess.remove(nonNPRule);
				
				logger.debug(String.format("Fixing non NP rule [id= %s, name= %s]: %d new guest rule(s) to be added", nonNPRule.getId(), 
						nonNPRule.getName(), newRules.get(nonNPRule).size()));
			}

			assert newRules.size() == nonNPRulesContext.size();
			assert rulesToProcess.size() == grammar.getRules().size() - nonNPRulesContext.size();
			
			//Get a distinct set of nonNP contexts (to avoid unnecessary addition of duplicate rules)
			final SymbolMap<Set<SymbolMap<SymbolSet>>> nonNPContexts = getNonNPContexts(nonNPRulesContext);
			
			//If there are rules to be processed (at first, there is always rules)
			while(!(rulesToProcess.isEmpty() && newRules.isEmpty())) {
				final ArrayList<Rule> nextRulesToProcess = new ArrayList<>();
				
				//For each non neighborhood preserving LHS
				for (Entry<Symbol, Set<SymbolMap<SymbolSet>>> rEntry : nonNPContexts.entrySet()) {
					final Symbol nonNPLhs = rEntry.getKey();
					final Set<SymbolMap<SymbolSet>> missingContexts = rEntry.getValue();
					int numCreatedRules = 0;
					
					logger.debug(String.format("Fixing occurrences of LHS %s. %s rules to evaluate", nonNPLhs, rulesToProcess.size()));
					
					//For each missing context
					for (SymbolMap<SymbolSet> missingContext : missingContexts) {
						//For each rule to be processed
						for (Rule rule: rulesToProcess) {
							for (Vertex v: rule.getRhs().getVertices()) {
								//Occurrence of label A
								if (v.getLabel().equivalates(nonNPLhs)) {
									
									//Fix the rule where this vertex occurs for this missing context
									final Entry<Rule, Map<String, Vertex>> newHost = fixHostRule(rule, v, missingContext);
									assert newHost != null;
									
									final Map<Rule, Map<String, Vertex>> m = new HashMap<>();
									m.put(newHost.getKey(), newHost.getValue());
									
									newRules.merge(rule, m, (a,b) -> {
										a.putAll(b);
										return a;
									});
									numCreatedRules ++;
								}
							}
						}
					}
					 
					final Set<Rule> newRs = fixGrammar(tripleGrammar, grammar, newRules, forward);
					
					nextRulesToProcess.addAll(newRs);
					
					logger.debug(String.format("%d new rules created for the LHS %s", numCreatedRules, nonNPLhs));
					newRules.clear();
				}

				rulesToProcess.clear();
				rulesToProcess.addAll(nextRulesToProcess);
			}
			
			//Remove non neighborhood preserving rules from grammars
			//May only remove here, because it can be used in the creation of new rules in the TGG
			removeRules(tripleGrammar, grammar, nonNPRulesContext.keySet(), forward);
			
			//Get new non neighborhood preserving rules
			nonNPRulesContext = NPUtil.getNonNPRules(grammar);
		}
		assert grammar.getRules().size() == tripleGrammar.getTripleRules().size();
		
		removeUselessRules(tripleGrammar, grammar);
		
		assureStartRule(tripleGrammar, grammar);
		
		assert GraphgrammarUtil.isValidGrammar(grammar);
		assert GraphgrammarUtil.isBoundaryGrammar(grammar);
		assert GraphgrammarUtil.isValidTripleGrammar(tripleGrammar);
		assert GraphgrammarUtil.isBoundaryTripleGrammar(tripleGrammar);
		assert NPUtil.isNeighborhoodPreserving(grammar);
		
		logger.debug(String.format("NP normalization for grammar %s finished with success. New size %s", grammar.getName(), grammar.getRules().size()));
	}

	/**
	 * Transform the map from rules to their missing contexts at {@code nonNPRulesContext}
	 * into a map from their left-hand side symbols to the missing contexts
	 * @param nonNPRulesContext		The map to be transformed
	 * @return						The map from LHSs to contexts transformed from {@code nonNPRulesContext}
	 */
	private SymbolMap<Set<SymbolMap<SymbolSet>>> getNonNPContexts(final Map<Rule, SymbolMap<SymbolSet>> nonNPRulesContext) {
		final SymbolMap<Set<SymbolMap<SymbolSet>>> nonNPContexts = new SymbolMap<>(nonNPRulesContext.size());
		for (Entry<Rule, SymbolMap<SymbolSet>> rEntry : nonNPRulesContext.entrySet()) {
			final Rule nonNPRule = rEntry.getKey();
			final SymbolMap<SymbolSet> missingContext = rEntry.getValue();
			
			final Set<SymbolMap<SymbolSet>> mcSet = new HashSet<>(1);
			mcSet.add(missingContext);
			//TODO: implement equals in the SymbolMap
			nonNPContexts.merge(nonNPRule.getLhs(), mcSet, (a,b) -> {
				a.addAll(b);
				return a;
			});
		}
		return nonNPContexts;
	}

	/**
	 * Remove the old rules in the {@code rulesToRemove} from {@code grammar} and {@code tripleGrammar},
	 * given that {@code grammar} is either the source or target of {@code tripleGrammar},
	 * according to the value of {@code forward}
	 * 
	 * @param tripleGrammar		The triple grammar from which to remove old rules
	 * @param grammar			The grammar from which to remove old rules
	 * @param rulesToRemove		The set of rules of {@code grammar} to be removed
	 * @param forward			Flag that indicates whether {@code grammar} is the source or target of {@code tripleGrammar}
	 * @see NPNormalizer#fixGrammar(TripleGrammar, Grammar, Map, boolean)
	 */
	private void removeRules(final TripleGrammar tripleGrammar, final Grammar grammar, 
			final Set<Rule> rulesToRemove, final boolean forward) {
		logger.debug(String.format("Removing the %d non NP rules", rulesToRemove.size()));
		
		for (Rule removedRule : rulesToRemove) {
			boolean removed = grammar.getRules().remove(removedRule);
			assert removed;

			removed = tripleGrammar.getTripleRules()
				.removeIf(tr -> forward ? tr.getSource().getId().equals(removedRule.getId()) 
						: tr.getTarget().getId().equals(removedRule.getId()));
			assert removed;
		}
	}
	
	/**
	 * Remove from {@code tripleGrammar} and from {@code grammar} useless rules where there is at least one
	 * vertex in the RHS whose label does not occur in any rule.
	 * This method potentially modifies the parameters @code tripleGrammar} and {@code grammar}.
	 * Moreover, remove also from the alphabets these vertices' labels.
	 * 
	 * @param tripleGrammar			A valid triple grammar to be minimized
	 * @param grammar				A valid grammar that is part (source or target) of the {@code tripleGrammar} to be minimized
	 */
	void removeUselessRules(final TripleGrammar tripleGrammar, final Grammar grammar) {
		final SymbolSet orphanLabels = new SymbolSet();
		final Set<String> rulesToRemove = new HashSet<>();
		
		final Symbol initial = grammar.getInitial();
		assert tripleGrammar.getInitial().equivalates(initial);
		
		for (Rule r : grammar.getRules()) {
			for (Vertex v : r.getRhs().getVertices()) {
				//If v is a non terminal vertex with label A, where no rule A->R exists in the grammar
				if (grammar.getNonterminals().stream().anyMatch(s -> s.equivalates(v.getLabel())
						&& grammar.getRules().stream().noneMatch(t -> t.getLhs().equivalates(v.getLabel())))) {
					
					if (!v.getLabel().equivalates(grammar.getInitial())) {
						orphanLabels.add(v.getLabel());
					}
					rulesToRemove.add(r.getId());
				}
			}
		}
		
		logger.debug(String.format("Removing %d useless rules", rulesToRemove.size()));
		
		grammar.getRules()
			.removeIf(r -> rulesToRemove.contains(r.getId()));
		tripleGrammar.getTripleRules()
			.removeIf(tr -> rulesToRemove.contains(tr.getSource().getId()));
		
		logger.debug(String.format("Removing %d useless non-terminal symbols", orphanLabels.size()));
		
		grammar.getAlphabet()
			.removeIf(nt -> orphanLabels.contains(nt));
		tripleGrammar.getAlphabet()
			.removeIf(nt -> orphanLabels.contains(nt));
		grammar.getNonterminals()
			.removeIf(nt -> orphanLabels.contains(nt));
		tripleGrammar.getNonterminals()
			.removeIf(nt -> orphanLabels.contains(nt));
	}
	

	/**
	 * Create new rules of the form S -> (S^x_y), where S is the initial symbol of {@code grammar} and S^x_y is in the alphabet.
	 * Perform the analogous operation also in the {@code tripleGrammar}.
	 * This is necessary when the initial symbol was in a non NP rule and was added with a sub and superscript.
	 * 
	 * @param tripleGrammar			A valid triple grammar to be fixed
	 * @param grammar				A valid grammar that is part (source or target) of the {@code tripleGrammar} to be fixed
	 */
	void assureStartRule(final TripleGrammar tripleGrammar, final Grammar grammar) {
		final Symbol initial = grammar.getInitial();
		assert tripleGrammar.getInitial().equivalates(initial);
		
		final Set<Symbol> pseudoInitials = grammar.getNonterminals().stream()
			.filter(nt -> !nt.equivalates(initial))
			.filter(nt -> nt.getName().equals(initial.getName()))
			.collect(Collectors.toSet());
		
	
		for (Symbol pInitial : pseudoInitials) {
			logger.debug(String.format("Creating new initial rule %s -> (%s)", initial, pInitial));
			
			//New source rule S -> v(S^l_n)
			final Rule newRule = GraphgrammarFactory.eINSTANCE.createRule();
			newRule.setLhs(EcoreUtil.copy(initial));
			newRule.setId(EcoreUtil.generateUUID());
			newRule.setName("i");
			
			final Graph newG = GraphgrammarFactory.eINSTANCE.createGraph();
			final Vertex newV = GraphgrammarFactory.eINSTANCE.createVertex();
			newV.setId("s_"+newRule.getId());
			newV.setLabel(EcoreUtil.copy(pInitial));
			
			newG.getVertices().add(newV);
			newRule.setRhs(newG);
			
			grammar.getRules().add(newRule);
			
			//New triple rule analogous to the new rule
			final TripleRule newTR = GraphgrammarFactory.eINSTANCE.createTripleRule();
			final Rule newS = EcoreUtil.copy(newRule);
			final Vertex s = newS.getRhs().getVertices().get(0);
			
			final Rule newC = EcoreUtil.copy(newRule);
			final Vertex c = newC.getRhs().getVertices().get(0);
			c.setId("c_"+newC.getId());
			
			final Rule newT = EcoreUtil.copy(newRule);
			final Vertex t = newT.getRhs().getVertices().get(0);
			t.setId("t_"+newT.getId());
			
			newTR.setSource(newS);
			newTR.setCorr(newC);
			newTR.setTarget(newT);
			
			newTR.getMs().put(c, s);
			newTR.getMt().put(c, t);
			
			tripleGrammar.getTripleRules().add(newTR);
		}
	}

	/**
	 * Add the new rules in the values of {@code newRules} to {@code grammar} and {@code tripleGrammar},
	 * given that {@code grammar} is either the source or target of {@code tripleGrammar},
	 * according to the value of {@code forward}
	 * 
	 * @param tripleGrammar		The triple grammar to which to add new rules
	 * @param grammar			The grammar to which to add new rules
	 * @param old2newRules			The map from old modified rules to new rules and the mapping between their vertices
	 * @param forward			Flag that indicates whether {@code grammar} is the source or target of {@code tripleGrammar}
	 * @return					The set of rules effectively added to {@code grammar} and {@code tripleGrammar}
	 */
	private Set<Rule> fixGrammar(final TripleGrammar tripleGrammar, final Grammar grammar,
			final Map<Rule, Map<Rule, Map<String, Vertex>>> old2newRules, final boolean forward) {
		
		//Add new fixed rules to the grammar
		final Set<Rule> newRs = old2newRules.values().stream()
				.flatMap(m -> m.keySet().stream())
				.collect(Collectors.toSet());
		grammar.getRules().addAll(EcoreUtil.copyAll(newRs));
		//Adapt alphabet
		for (Rule r : newRs) {
			assert GraphgrammarUtil.isValidRule(r);
			if (!grammar.getNonterminals().stream().anyMatch(n -> n.equivalates(r.getLhs()))){
				grammar.getNonterminals().add(EcoreUtil.copy(r.getLhs()));
				grammar.getAlphabet().add(EcoreUtil.copy(r.getLhs()));
			}
		}
		
		//Add new fixed rules to the triple grammar
		//For each old/ modified rule
		for (Entry<Rule,Map<Rule,Map<String,Vertex>>> oREntry : old2newRules.entrySet()) {
			final String oldId = oREntry.getKey().getId();
			final TripleRule oldTR = tripleGrammar.getTripleRules().stream()
				.filter(tr -> forward ? tr.getSource().getId()==oldId : tr.getTarget().getId()==oldId)
				.findAny()
				.orElse(null);
			assert oldTR != null;
			
			//For each new/ fixed rule of this old rule
			for (Entry<Rule,Map<String,Vertex>> nREntry : oREntry.getValue().entrySet()) {
				//Create respective new triple rule
				final TripleRule newTR = EcoreUtil.copy(oldTR);
				final Rule newR = nREntry.getKey();
				
				//With fixed morphism
				final Map<String, Vertex> oldId2Vertex = nREntry.getValue();
				for (Vertex cV : newTR.getCorr().getRhs().getVertices()) {
					final Vertex newRV = forward ? oldId2Vertex.get(newTR.getMs().get(cV).getId())
							: oldId2Vertex.get(newTR.getMt().get(cV).getId());
					assert newRV != null && newR.getRhs().getVertices().contains(newRV);
					
					if (forward)
						newTR.getMs().put(cV, newRV);
					else 
						newTR.getMt().put(cV, newRV);
				}
				//Fixed graph
				if (forward)
					newTR.setSource(newR);
				else 
					newTR.setTarget(newR);
				//Fixed Ids
				newTR.getSource().setId(newR.getId());
				newTR.getCorr().setId(newR.getId());
				newTR.getTarget().setId(newR.getId());
				//Add it to the triple grammar
				tripleGrammar.getTripleRules().add(EcoreUtil.copy(newTR));
				//Adapt alphabet
				if (!tripleGrammar.getNonterminals().stream().anyMatch(n -> n.equivalates(newR.getLhs()))){
					tripleGrammar.getNonterminals().add(EcoreUtil.copy(newR.getLhs()));
					tripleGrammar.getAlphabet().add(EcoreUtil.copy(newR.getLhs()));
				}
			}
		}
		
		return newRs;
	}

	/**
	 * Given a host {@code rule} containing a {@code vertex} that potentially contains one of the missing context
	 * in {@code context}, creates one new rule without such missing contexts at {@code vertex}.
	 *  
	 * @param rule				The host rule containing the vertex to be modified
	 * @param vertex			The vertex which to be fixed 
	 * @param missingContext	The missing context for the {@code vertex}'s label
	 * @return					One new rule for {@code vertex}
	 * 							mapped to the respective map between the old vertices's id to the new vertices
	 * 							of its RHS
	 * @see NPNormalizer#fixGuestRule(Rule, SymbolMap)
	 */
	Entry<Rule, Map<String, Vertex>> fixHostRule(final Rule rule, final Vertex vertex, final SymbolMap<SymbolSet> missingContext) {
		assert rule.getRhs().getVertices().contains(vertex);
		
		final Rule modifiedRule = EcoreUtil.copy(rule);
		final Vertex v = modifiedRule.getRhs().getVertices().stream()
				.filter(w -> w.getId().equals(vertex.getId()))
				.findAny()
				.orElse(null);
		assert v != null;
		
		final Map<String, Vertex> old2newMap = GraphgrammarUtil.ensureUniqueIds(modifiedRule.getRhs());
		
		//Remove the edge of this vertex for this context
		final List<Edge> vEdges = modifiedRule.getRhs().edges(v);
		final Set<Edge> edgesToRemove = new HashSet<>(vEdges.size());
		for (Edge e : vEdges) {
			final Symbol ignoredLabel = e.getFrom() == v ? 
					e.getTo().getLabel() : e.getFrom().getLabel();
					
			//If it connects to one of the missing contexts	
			final SymbolSet missingLabels = missingContext.get(e.getLabel());
			if (missingLabels != null && missingLabels.contains(ignoredLabel)) {
				edgesToRemove.add(e);
			}
		}
		modifiedRule.getRhs().getEdges().removeAll(edgesToRemove);
		
		//Remove the embeddings for this context
		final EList<SymbolSymbolsPair> embedding = modifiedRule.getEmbedding().get(v);
		if (embedding != null) {
			for (SymbolSymbolsPair embeds : embedding) {
				//If it connects to one of the missing contexts	
				final SymbolSet missingLabels = missingContext.get(embeds.getEdgeLabel());
				if (missingLabels != null) {
					final SymbolSet missIntersection = missingLabels.intersect(embeds.getVertexLabels());
					
					for (Symbol ignoredLabel : missIntersection) {
						embeds.getVertexLabels().removeIf(l -> l.equivalates(ignoredLabel));
					}
				}
			}
		}
		
		//For each missing context
		for (Entry<Symbol, SymbolSet> cEntry : missingContext.entrySet()) {
			final Symbol edgeLabel = cEntry.getKey();
			for (Symbol vertexLabel : cEntry.getValue()) {
				//Add respective super and subscript
				v.getLabel().getSuperscript().add(edgeLabel.getName());
				v.getLabel().getSubscript().add(vertexLabel.getName());
			}
		}

		modifiedRule.setId(modifiedRule.getId().concat("___"+EcoreUtil.generateUUID()));
		
		assert GraphgrammarUtil.isValidRule(modifiedRule);
		
		return new AbstractMap.SimpleEntry<>(modifiedRule, old2newMap);
	}
	
	/**
	 * Given a guest rule {@code nonNPRule} which misses a the context {@code missingContext}
	 * creates one new rule with a correct left-hand side symbol
	 *  
	 * @param nonNPRule			The guest rule with a missing context, to be fixed 
	 * @param missingContext	The missing context of the {@code nonNPRule}
	 * @return					One new rule created from {@code nonNPRule}
	 * 							mapped to the respective map between the old vertices's id to the new vertices
	 * 							of its RHS
	 * @see NPNormalizer#fixHostRule(Rule, Vertex, SymbolMap)
	 */
	Entry<Rule, Map<String, Vertex>> fixGuestRule(final Rule nonNPRule, final SymbolMap<SymbolSet> missingContext) {
		//Add new neighborhood preserving rule for the new label
		final Rule newRule = EcoreUtil.copy(nonNPRule);
		//For each missing context
		for (Entry<Symbol, SymbolSet> cEntry : missingContext.entrySet()) {
			final Symbol edgeLabel = cEntry.getKey();
			for (Symbol vertexLabel : cEntry.getValue()) {
				//Add respective super and subscript
				newRule.getLhs().getSuperscript().add(edgeLabel.getName());
				newRule.getLhs().getSubscript().add(vertexLabel.getName());
				
				//Remove embeddings to make it surely neighborhood preserving
				final HashSet<Vertex> embedRemoval = new HashSet<>();
				for (Entry<Vertex, EList<SymbolSymbolsPair>> embedding : newRule.getEmbedding().entrySet()) {
					final HashSet<SymbolSymbolsPair> ssPRemoval = new HashSet<>();
					
					for (SymbolSymbolsPair ssP : embedding.getValue()) {
						if (ssP.getEdgeLabel().equivalates(edgeLabel)) {
							ssP.getVertexLabels().removeIf(vL -> vL.equivalates(vertexLabel));
							
							if (ssP.getVertexLabels().isEmpty())
								ssPRemoval.add(ssP);
						}
					}
					ssPRemoval.forEach(ssP -> embedding.getValue().remove(ssP));
					if (embedding.getValue().isEmpty())
						embedRemoval.add(embedding.getKey());
				}
				embedRemoval.forEach(w -> newRule.getEmbedding().removeKey(w));
			}
		}
		
		newRule.setId(newRule.getId().concat("___("+newRule.getLhs()+")"));
		
		final Map<String, Vertex> old2newMap = GraphgrammarUtil.ensureUniqueIds(newRule.getRhs());
		
		assert GraphgrammarUtil.isValidRule(newRule);
		
		return new AbstractMap.SimpleEntry<>(newRule, old2newMap);
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an symbol to it, without an edge.
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	@Deprecated
	Entry<Rule,Map<String, Vertex>> createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Symbol edgeLabel) {
		return createNewHostRule(rule, vertex, vertexLabel, null, edgeLabel);
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an edge to it, without sending an extra symbol.
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	@Deprecated
	Entry<Rule,Map<String, Vertex>> createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Edge edge) {
		return createNewHostRule(rule, vertex, vertexLabel, edge, null);
	}
	
	/**
	 * Effectively create a new rule for the host rule {@code rule} containing {@code vertex} with context
	 * {@code edgeLabel}-{@code vertexLabel} (i.e. an edge or embedding with label {@code edgeLabel} to a vertex 
	 * with label {@code vertexLabel}).
	 * If {@code edge} is not null, then create new rule without it. Otherwise only remove the embedding.
	 * 	 
	 * @param rule			The host rule containing the vertex to be modified
	 * @param vertex		The vertex which to change its context (embedding and optionally edge)
	 * @param vertexLabel	The part of the missing context corresponding to the vertex
	 * @param edge			The edge with label {@code edgeLabel} to/from a vertex  with label {@code vertexLabel}
	 * 						adjacent to {@code vertex}, to be removed in the new rule
	 * @param edgeLabel		The part of the missing context corresponding to the edge
	 * @return				A new rule corresponding to the modification of {@code rule} without the missing context
	 * 						on {@code vertex} with {@code edgeLabel} and {@code vertexLabel} accompanied of the 
	 * 						respective map between the old vertices's id to the new vertices of its RHS
	 * @see NPNormalizer#createNewGuestRule(Rule, Symbol, Symbol)
	 */
	@Deprecated
	private Entry<Rule, Map<String, Vertex>> createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Edge edge, Symbol edgeLabel) {
		assert rule.getRhs().getVertices().contains(vertex);
		assert edge == null || rule.getRhs().getEdges().contains(edge);
		assert edge == null || edge.getFrom().getLabel().equivalates(vertexLabel) || edge.getTo().getLabel().equivalates(vertexLabel);
		
		final Rule modifiedRule = EcoreUtil.copy(rule);
		final Vertex v = modifiedRule.getRhs().getVertices().stream()
				.filter(w -> w.getId().equals(vertex.getId()))
				.findAny()
				.orElse(null);
		assert v != null;
		
		final Map<String, Vertex> old2newMap = GraphgrammarUtil.ensureUniqueIds(modifiedRule.getRhs());
		
		if (edge != null) {
			//Remove the edge
			final Edge edgeToRemove = modifiedRule.getRhs().edges(v).stream()
				.filter(e -> e.compareTo(edge) == 0)
				.findAny()
				.orElse(null);
			assert edgeToRemove != null;
			
			modifiedRule.getRhs().getEdges().remove(edgeToRemove);
			
			edgeLabel = edge.getLabel();
		}
		assert edgeLabel != null;
		
		//Remove the embedding for this edge and vertex labels
		if (modifiedRule.getEmbedding().get(v) != null) {
			for (SymbolSymbolsPair embeds : modifiedRule.getEmbedding().get(v)) {
				if (embeds.getEdgeLabel().equivalates(edgeLabel)) {
					embeds.getVertexLabels().removeIf(l -> l.equivalates(vertexLabel));
				}
			}
		}
		
		//Change v's label
		v.getLabel().getSuperscript().add(edgeLabel.getName());
		v.getLabel().getSubscript().add(vertexLabel.getName());

		modifiedRule.setId(modifiedRule.getId().concat("___"+EcoreUtil.generateUUID()));
		
		assert GraphgrammarUtil.isValidRule(modifiedRule);
		
		return new AbstractMap.SimpleEntry<>(modifiedRule, old2newMap);
	}
	
	/**
	 * Effectively create a new rule for the guest non neighborhood preserving rule {@code nonNPRule} 
	 * and missing context consisting of {@code edgeLabel}-{@code vertexLabel}. That is, this rule
	 * lacks the an embedding with edge label {@code edgeLabel} to a vertex with label {@code vertexLabel}).
	 * 
	 * @param nonNPRule		The guest rule to be modified with new LHS, so that it does not miss the context anymore
	 * @param edgeLabel		The part of the missing context corresponding to the edge
	 * @param vertexLabel	The part of the missing context corresponding to the vertex
	 * @return				A new rule corresponding to the modification of {@code nonNPRule} 
	 * 						with modified LHS and without the missing context {@code edgeLabel} 
	 * 						and {@code vertexLabel} accompanied of the respective map between 
	 * 						the old vertices's id to the new vertices of its RHS
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	@Deprecated
	Entry<Rule, Map<String, Vertex>> createNewGuestRule(final Rule nonNPRule, final Symbol edgeLabel, final Symbol vertexLabel){		
		//Add new neighborhood preserving rule for the new label
		final Rule newRule = EcoreUtil.copy(nonNPRule);
		newRule.getLhs().getSuperscript().add(edgeLabel.getName());
		newRule.getLhs().getSubscript().add(vertexLabel.getName());
		
		newRule.setId(newRule.getId().concat("___("+newRule.getLhs()+")"));
		
		final Map<String, Vertex> old2newMap = GraphgrammarUtil.ensureUniqueIds(newRule.getRhs());
		
		final HashSet<Vertex> embedRemoval = new HashSet<>();
		//Remove embeddings to make it surely neighborhood preserving
		for (Entry<Vertex, EList<SymbolSymbolsPair>> embedding : newRule.getEmbedding().entrySet()) {
			final HashSet<SymbolSymbolsPair> ssPRemoval = new HashSet<>();
			
			for (SymbolSymbolsPair ssP : embedding.getValue()) {
				if (ssP.getEdgeLabel().equivalates(edgeLabel)) {
					ssP.getVertexLabels().removeIf(vL -> vL.equivalates(vertexLabel));
					
					if (ssP.getVertexLabels().isEmpty())
						ssPRemoval.add(ssP);
				}
			}
			ssPRemoval.forEach(ssP -> embedding.getValue().remove(ssP));
			if (embedding.getValue().isEmpty())
				embedRemoval.add(embedding.getKey());
		}
		embedRemoval.forEach(w -> newRule.getEmbedding().removeKey(w));
		
		assert GraphgrammarUtil.isValidRule(newRule);
		
		return new AbstractMap.SimpleEntry<>(newRule, old2newMap);
	}
}
