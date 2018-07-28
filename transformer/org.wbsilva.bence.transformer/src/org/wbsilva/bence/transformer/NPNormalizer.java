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
				
				//For each missing context
				for (Entry<Symbol, SymbolSet> cEntry : missingContext.entrySet()) {
					for (Symbol ignoringLabel : cEntry.getValue()) {
						//Fix the actual non neighborhood preserving rule
						final Entry<Rule, Map<String, Vertex>> newGuest = createNewGuestRule(nonNPRule, cEntry.getKey(), ignoringLabel);
						assert newGuest != null;
						
						final Map<Rule, Map<String, Vertex>> nREntry = newRules.get(nonNPRule);
						if (nREntry == null) {
							final Map<Rule, Map<String, Vertex>> m = new HashMap<>();
							m.put(newGuest.getKey(), newGuest.getValue());
							newRules.put(nonNPRule, m);
						}
						else
							nREntry.put(newGuest.getKey(), newGuest.getValue());
					}
				}
				
				logger.debug(String.format("Fixing non NP rule [id= %s, name= %s]: %d new guest rule(s) to be added", nonNPRule.getId(), 
						nonNPRule.getName(), newRules.get(nonNPRule).size()));
			}

			assert newRules.size() == nonNPRulesContext.size();
			assert rulesToProcess.size() == grammar.getRules().size();
			
			//If there are rules to be processed (at first, there is always the grammar rules)
			while(!rulesToProcess.isEmpty()) {
				final ArrayList<Rule> nextRulesToProcess = new ArrayList<>();
				
				//For each non neighborhood preserving rule A->R (again)
				for (Entry<Rule, SymbolMap<SymbolSet>> rEntry : nonNPRulesContext.entrySet()) {
					final Rule nonNPRule = rEntry.getKey();
					final SymbolMap<SymbolSet> missingContext = rEntry.getValue();
					int numCreatedRules = 0;
					
					logger.debug(String.format("Fixing occurrences of LHS %s (rule [id= %s, name= %s]). %s rules to evaluate", nonNPRule.getLhs(),
							nonNPRule.getId(), nonNPRule.getName(), rulesToProcess.size()));
					 
					//For each rule to be processed
					for (Rule rule: rulesToProcess) {
						for (Vertex v: rule.getRhs().getVertices()) {
							//Occurrence of label A
							if (v.getLabel().equivalates(nonNPRule.getLhs())) {
								
								//Fix the rule where this vertex occurs for this missing context
								final Map<Rule, Map<String, Vertex>> newHosts = fixHostRule(rule, v, missingContext);

								newRules.merge(rule, newHosts, (a,b) -> {
									a.putAll(b);
									return a;
								});
								numCreatedRules += newHosts.size();
							}
						}
					}
	
					//Add new fixed rules to the grammar
					final Set<Rule> newRs = newRules.values().stream()
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
					
					nextRulesToProcess.addAll(newRs);
					
					//Add new fixed rules to the triple grammar
					//For each old/ modified rule
					for (Entry<Rule,Map<Rule,Map<String,Vertex>>> oREntry : newRules.entrySet()) {
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
					
					logger.debug(String.format("%d new rules created for the LHS %s", numCreatedRules, nonNPRule.getLhs()));
					newRules.clear();
				}

				rulesToProcess.clear();
				rulesToProcess.addAll(nextRulesToProcess);
			}
			
			//Remove non neighborhood preserving rules from grammars
			logger.debug(String.format("Removing the %d non NP rules", nonNPRulesContext.size()));
			for (Rule removedRule : nonNPRulesContext.keySet()) {
				boolean removed = grammar.getRules().remove(removedRule);
				assert removed;

				//May only remove here, because it can be used in the creation of new rules in the TGG
				removed = tripleGrammar.getTripleRules()
					.removeIf(tr -> forward ? tr.getSource().getId().equals(removedRule.getId()) 
							: tr.getTarget().getId().equals(removedRule.getId()));
				assert removed;
			}
			
			assert GraphgrammarUtil.isValidGrammar(grammar);
			assert GraphgrammarUtil.isBoundaryGrammar(grammar);
			assert GraphgrammarUtil.isValidTripleGrammar(tripleGrammar);
			assert GraphgrammarUtil.isBoundaryTripleGrammar(tripleGrammar);
			
			//Get new non neighborhood preserving rules
			nonNPRulesContext = NPUtil.getNonNPRules(grammar);
		}
		assert grammar.getRules().size() == tripleGrammar.getTripleRules().size();
		
		logger.debug(String.format("NP normalization for grammar %s finished with success. New size %s", grammar.getName(), grammar.getRules().size()));

		assert NPUtil.isNeighborhoodPreserving(grammar);
	}
	
	/**
	 * Given a host {@code rule} containing a {@code vertex} that contains at least one of the missing context
	 * in {@code context}, creates the necessary new rules without such missing contexts.
	 *  
	 * @param rule		The host rule containing the vertex to be modified
	 * @param vertex	The vertex which to change its context, to fix the rule 
	 * @param context	The missing context of the {@code vertex}'s label
	 * @return			One new rule for each missing context removal from {@code vertex}
	 * 					mapped to the respective map between the old vertices's id to the new vertices
	 * 					of its RHS
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	private Map<Rule, Map<String, Vertex>> fixHostRule(final Rule rule, final Vertex vertex, final SymbolMap<SymbolSet> context) {
		assert rule.getRhs().getVertices().contains(vertex);
		
		//Remember of what is still to be processed 
		final SymbolMap<SymbolSet> toProccessContext = new SymbolMap<>(context.size());
		for (Entry<Symbol, SymbolSet> c : context.entrySet()) {
			toProccessContext.put(c.getKey(), new SymbolSet(c.getValue()));
		}
		
		//For each edge of this vertex
		final List<Edge> vEdges = rule.getRhs().edges(vertex);
		final Map<Rule, Map<String, Vertex>> newFixedRules = new HashMap<>();
		for (Edge e : vEdges) {
			final Symbol ignoredLabel = e.getFrom() == vertex ? 
					e.getTo().getLabel() : e.getFrom().getLabel();
					
			//If it connects to one of the missing contexts	
			final SymbolSet missingLabels = context.get(e.getLabel());
			if (missingLabels != null && missingLabels.contains(ignoredLabel)) {
				//New fix
				final Entry<Rule, Map<String, Vertex>> newEntry = createNewHostRule(rule, vertex, ignoredLabel, e);
				newFixedRules.put(newEntry.getKey(), newEntry.getValue());
				//Context processed
				toProccessContext.get(e.getLabel()).remove(ignoredLabel);
			}
		}
		
		//For each embedding of this vertex
		final EList<SymbolSymbolsPair> embedding = rule.getEmbedding().get(vertex);
		if (embedding != null) {
			for (SymbolSymbolsPair embeds : embedding) {
				
				//If it connects to one of the missing contexts	
				final SymbolSet missingLabels = toProccessContext.get(embeds.getEdgeLabel());
				if (missingLabels != null) {
					final SymbolSet missIntersection = missingLabels.intersect(embeds.getVertexLabels());
					
					for (Symbol ignoredLabel : missIntersection) {
						final Entry<Rule, Map<String, Vertex>> newEntry = createNewHostRule(rule, vertex, ignoredLabel, embeds.getEdgeLabel()); 
						newFixedRules.put(newEntry.getKey(), newEntry.getValue());
					}
				}
			}
		}
		assert !newFixedRules.isEmpty();
		
		return newFixedRules;
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an symbol to it, without an edge.
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
	Entry<Rule,Map<String, Vertex>> createNewHostRule(final Rule rule, final Vertex vertex, final Symbol vertexLabel, final Symbol edgeLabel) {
		return createNewHostRule(rule, vertex, vertexLabel, null, edgeLabel);
	}
	
	/**
	 * Same method as {@link NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)},
	 * with the difference that it sends only an edge to it, without sending an extra symbol.
	 * @see NPNormalizer#createNewHostRule(Rule, Vertex, Symbol, Edge, Symbol)
	 */
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
