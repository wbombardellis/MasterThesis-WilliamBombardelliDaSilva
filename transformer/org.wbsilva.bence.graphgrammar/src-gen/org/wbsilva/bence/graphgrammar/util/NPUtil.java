package org.wbsilva.bence.graphgrammar.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * A Utilities class for the calculation of the neighborhood preserving proprerty
 * @author wbombardellis
 *
 */
public class NPUtil {
	
	/**
	 * Returns the rules of the {@code grammar} that are not neighborhood preserving (NP) together with
	 * their respective missing contexts in form of a {@link SymbolMap} from edge labels to a set
	 * of vertex labels in a {@link SymbolSet}.
	 * So for example, if a vertex with label A is connected to another with label n by edge 1 (or has no embedding 1-n), 
	 * but a rule A->R does not include the embedding 1-n, then this rule is non NP and this method
	 * gives it together with the missing embedding 1-n
	 * 
	 * @param grammar		The grammar to check. Has to be valid
	 * @return				A map from each non neighborhood preserving {@link Rule} in {@code grammar}
	 * 						accompanied with the missing embeddings of it (that make it non NP)
	 * @see SymbolMap
	 * @see SymbolSet
	 */
	static public Map<Rule, SymbolMap<SymbolSet>> getNonNPRules(final Grammar grammar){
		final SymbolMap<SymbolMap<SymbolSet>> maxContext = new SymbolMap<>(grammar.getNonterminals().size());
		final HashMap<Vertex, SymbolMap<SymbolSet>> embeddingContext = new HashMap<>();

		for (Symbol l: grammar.getNonterminals()) {
			maxContext.put(l, new SymbolMap<SymbolSet>());
		}
		
		//Determine the maximal context of each nonterminal symbol
		for (Rule r : grammar.getRules()) {
			for (Vertex v : r.getRhs().getVertices()) {
				
				//The embedding context of each vertex of the RHS of each rule
				final SymbolMap<SymbolSet> vContext = getEmbeddingContext(r, v);
				embeddingContext.put(v, vContext);
				
				if (grammar.getNonterminals().stream().anyMatch(l -> l.equivalates(v.getLabel()))) {
					final SymbolMap<SymbolSet> ntContext = maxContext.get(v.getLabel());
					
					//The real context of each nonterminal vertex of the RHS of each rule
					final SymbolMap<SymbolSet> rContext = getRealContext(r.getRhs(), v);
					
					//Add the contexts to the non terminal context
					for (Entry<Symbol,SymbolSet> vContextEntry : vContext.entrySet()) {
						final SymbolSet context = ntContext.get(vContextEntry.getKey());
						if (context == null) {
							ntContext.put(vContextEntry.getKey(), vContextEntry.getValue());
						}
						else 
							context.addAll(vContextEntry.getValue());
					}
					for (Entry<Symbol,SymbolSet> rContextEntry : rContext.entrySet()) {
						final SymbolSet context = ntContext.get(rContextEntry.getKey());
						if (context == null) {
							ntContext.put(rContextEntry.getKey(), rContextEntry.getValue());
						}
						else 
							context.addAll(rContextEntry.getValue());
					}
					
				}
			}
		}
		
		//Build rule's embedding context
		final HashMap<Rule, SymbolMap<SymbolSet>> nonNPRulesContext = new HashMap<>(grammar.getRules().size());
		for (Rule r : grammar.getRules()) {
			final SymbolMap<SymbolSet> ruleContext = getEmbeddingcontext(r, embeddingContext);
			
			//If the rule's embedding context does not contain all LHS's maximal context
			for (Entry<Symbol,SymbolSet> maxContextEntry : maxContext.get(r.getLhs()).entrySet()) {
				
				final SymbolMap<SymbolSet> missingRuleContext = nonNPRulesContext.get(r);
				
				final SymbolSet context = ruleContext.get(maxContextEntry.getKey());
				if (context == null && maxContextEntry.getValue() != null) {
					//non neighborhood preserving
					if (missingRuleContext == null) {
						final SymbolMap<SymbolSet> sMap = new SymbolMap<>();
						sMap.put(maxContextEntry.getKey(), maxContextEntry.getValue());
						nonNPRulesContext.put(r, sMap);
					}
					else 
						missingRuleContext.put(maxContextEntry.getKey(), maxContextEntry.getValue());
					
				} else {
					if (maxContextEntry.getValue() != null) {

						//Calculate the missing context
						final SymbolSet missingContextLabels = maxContextEntry.getValue().subtract(context);
						if (!missingContextLabels.isEmpty()) {
							//non neighborhood preserving
						
							if (missingRuleContext == null) {
								final SymbolMap<SymbolSet> sMap = new SymbolMap<>();
								sMap.put(maxContextEntry.getKey(), missingContextLabels);
								nonNPRulesContext.put(r, sMap);
							}
							else 
								missingRuleContext.put(maxContextEntry.getKey(), missingContextLabels);
						}
					}
				}
			}
		}
		return nonNPRulesContext;
	}

	/**
	 * Return the embedding context of {@code vertex} in the rule {@code rule} 
	 * @param rule		The rule containing {@code vertex}
	 * @param vertex	The vertex from which to retrieve the embedding context
	 * @return			A {@link SymbolMap} from the edge labels to the vertex labels corresponding to the
	 * 					embedding of {@code vertex} in form of a SymbolMap and SymbolSet
	 * @see SymbolMap
	 * @see SymbolSet
	 */
	static SymbolMap<SymbolSet> getEmbeddingContext(final Rule rule, final Vertex vertex){
		assert rule.getRhs().getVertices().contains(vertex);
		
		final EList<SymbolSymbolsPair> embedding = rule.getEmbedding().get(vertex);
		final SymbolMap<SymbolSet> vContext = new SymbolMap<>();
		if (embedding != null) {
			for (SymbolSymbolsPair ssP : embedding) {
				if (!ssP.getVertexLabels().isEmpty()) {
					final SymbolSet vLabels = new SymbolSet(ssP.getVertexLabels());
					
					final SymbolSet context = vContext.get(ssP.getEdgeLabel());
					if (context == null) {
						vContext.put(ssP.getEdgeLabel(), vLabels);
					} else {
						context.addAll(vLabels);
					}
				}
			}
		}
		return vContext;
	}
	
	/**
	 * Merge the embedding contexts of each vertex of {@code rule}, which are in the mapping
	 * {@code embeddingContext}, into one {@link SymbolMap}
	 * @param rule				The rule to which the {@code embeddingContext} belongs
	 * @param embeddingContext	The embedding context of each vertex of {@code rule}. If a vertex has no embedding,
	 * 							then it need not be in the mapping
	 * @return					A {@link SymbolMap} from the edge labels to the vertex labels corresponding to the
	 * 							embedding of each vertex of {@code rule} in form of a SymbolMap and SymbolSet,
	 * 							obtained from {@code embeddingContext} 
	 * @see SymbolMap
	 * @see SymbolSet
	 */
	private static SymbolMap<SymbolSet> getEmbeddingcontext(final Rule rule, final Map<Vertex, SymbolMap<SymbolSet>> embeddingContext) {
		final SymbolMap<SymbolSet> ruleContext = new SymbolMap<>();
		for (Vertex v : rule.getRhs().getVertices()) {
			final SymbolMap<SymbolSet> vContext = embeddingContext.get(v);
			for (Entry<Symbol,SymbolSet> vContextEntry : vContext.entrySet()) {
				final SymbolSet context = ruleContext.get(vContextEntry.getKey());
				if (context == null) {
					ruleContext.put(vContextEntry.getKey(), vContextEntry.getValue());
				}
				else 
					context.addAll(vContextEntry.getValue());
			}	
		}
		
		return ruleContext;
	}
	
	/**
	 * Return the complete embedding context of the rule {@code rule} 
	 * @param rule		The rule from which to obtain the embedding context
	 * @return			A {@link SymbolMap} from the edge labels to the vertex labels corresponding to the
	 * 					embeddings of each vertex of {@code rule} in form of a SymbolMap and SymbolSet
	 * @see SymbolMap
	 * @see SymbolSet
	 */
	static SymbolMap<SymbolSet> getEmbeddingcontext(final Rule rule) {
		final HashMap<Vertex, SymbolMap<SymbolSet>> embeddingContext = new HashMap<>(rule.getRhs().getVertices().size());
		for (Vertex v : rule.getRhs().getVertices()) {
			final SymbolMap<SymbolSet> vContext = getEmbeddingContext(rule, v);
			embeddingContext.put(v, vContext);
		}
		return getEmbeddingcontext(rule, embeddingContext);
	}
	
	/**
	 * Return the real context of {@code vertex} in the graph {@code graph}. That is, the context
	 * inferred directly from the edges of {@code vertex}. 
	 * @param graph		The graph containing {@code vertex}
	 * @param vertex	The vertex from which to retrieve the real context
	 * @return			A {@link SymbolMap} from the edge labels to the vertex labels corresponding to the
	 * 					context of {@code vertex} in form of a SymbolMap and SymbolSet
	 * @see SymbolMap
	 * @see SymbolSet
	 */
	static SymbolMap<SymbolSet> getRealContext(final Graph graph, final Vertex vertex){
		final SymbolMap<SymbolSet> rContext = new SymbolMap<>();
		for(Edge e: graph.inEdges(vertex)) {
			final SymbolSet context = rContext.get(e.getLabel());
			if (context == null) {
				rContext.put(e.getLabel(), 
						new SymbolSet(Arrays.asList(e.getFrom().getLabel())));
			}
			else 
				context.add(e.getFrom().getLabel());
		}
		for(Edge e: graph.outEdges(vertex)) {
			final SymbolSet context = rContext.get(e.getLabel());
			if (context == null) {
				rContext.put(e.getLabel(), 
						new SymbolSet(Arrays.asList(e.getTo().getLabel())));
			}
			else 
				context.add(e.getTo().getLabel());
		}
		return rContext;
	}

	/**
	 * Checks a sufficient (but not necessary) condition for a grammar to be neighborhood preserving.
	 * Does not say anything about it not being neighborhood preserving.
	 * 
	 * @param grammar		The grammar to check. Has to be valid
	 * @return				If True, then {@code grammar} is neighborhood preserving.
	 * 						If False, then {@code grammar} may or may not be neighborhood preserving.
	 */
	public static boolean isNeighborhoodPreserving(final Grammar grammar) {
		if(!getNonNPRules(grammar).isEmpty())
			return false;
		
		//Help variables to spare time
		final Symbol superr = GraphgrammarFactory.eINSTANCE.createSymbol();
		final Symbol sub = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		//For each vertex in each rule, verify its context and sub/ superscripts
		for (Rule r : grammar.getRules()) {
			for (Vertex v : r.getRhs().getVertices()) {
				//The embedding context of this vertex
				final SymbolMap<SymbolSet> eContext = getEmbeddingContext(r, v);
				//The real context
				final SymbolMap<SymbolSet> rContext = getRealContext(r.getRhs(), v);
				
				//If context includes any of the super/ sub scripts then it is not neighborhood preserving
				for (int i = 0; i < v.getLabel().getSuperscript().size(); i ++) {
					sub.setName(v.getLabel().getSubscript().get(i));
					superr.setName(v.getLabel().getSuperscript().get(i));
					
					if (eContext.get(superr) != null) {
						if (eContext.get(superr).contains(sub))
							return false;
					}
					if (rContext.get(superr) != null) {
						if (rContext.get(superr).contains(sub))
							return false;
					}
				}
				
				//If context includes any of the LHS's super/ sub scripts then it is not neighborhood preserving
				for (int i = 0; i < r.getLhs().getSuperscript().size(); i ++) {
					sub.setName(r.getLhs().getSubscript().get(i));
					superr.setName(r.getLhs().getSuperscript().get(i));
				
					if (eContext.get(superr) != null) {
						if (eContext.get(superr).contains(sub))
							return false;
					}
					/*if (rContext.get(superr) != null) {
						if (rContext.get(superr).contains(sub))
							return false;
					}*/
				}
			}
		}
		return true;
	}

	/**
	 * Checks if {@code ds} is neighborhood preserving
	 * @param ds		The derivation step to be checked. Has to be valid
	 * @return			True iff {@code ds} is neighborhood preserving.
	 */
	public static boolean isNeighborhoodPreserving(final DerivationStep ds) {
		final Vertex vertex = ds.getPrevious().getVertices().stream().filter(w -> w.getId().equals(ds.getVertex().getId())).findAny().orElse(null);
		assert vertex != null;
		
		//iff neighbors of vertex are equal to neighbors of the RHS neigh_prev(vertex) = neigh_next(V_Y)
		final EList<Vertex> n1 = ds.getPrevious().neighborhood(vertex);
		final EList<Vertex> n2 = ds.getNext().neighborhood(new BasicEList<>(ds.getRule().getRhs().getVertices().stream()
				.map(v -> ds.getUnifier().get(v))
				.collect(Collectors.toSet())));
		
		final Graph g1 = GraphgrammarFactory.eINSTANCE.createGraph();
		g1.getVertices().addAll(EcoreUtil.copyAll(n1));
		final Graph g2 = GraphgrammarFactory.eINSTANCE.createGraph();
		g2.getVertices().addAll(EcoreUtil.copyAll(n2));
		
		return g1.isomorphicTo(g2);
	}

	/**
	 * Return true iff {@code rule} misses the whole {@code contextToTest}. I.e. If any entry of 
	 * {@code contextToTest} is in any embedding context of any vertex in {@code rule}, then return false,
	 * because then the rule contains part of the context to test, and thus, it does not miss the whole of it.
	 * Otherwise, all entries of the context to test do not occur in the rule, thus the rule misses the whole of it,
	 * and this method returns true.
	 * 
	 * @param rule				The rule to be tested
	 * @param contextToTest		A {@link SymbolMap} from the edge labels to the vertex labels corresponding to the
	 * 							embedding context to be tested
	 * @return					False if {@code rule}'s embedding has at least one vertex label and edge label from
	 * 							the embedding context {@code contextToTest}, false otherwise  
	 * @see SymbolMap
	 * @see SymbolSet
	 */
	public static boolean missesContext(final Rule rule, final SymbolMap<SymbolSet> contextToTest) {
		assert rule != null;
		assert contextToTest != null;
		final SymbolMap<SymbolSet> ruleContext = getEmbeddingcontext(rule);
		
		//Test for each entry of the context to test
		for (Entry<Symbol,SymbolSet> contextEntry : contextToTest.entrySet()) {
			final Symbol eLabel = contextEntry.getKey();
			final SymbolSet testVLabels = contextEntry.getValue();
			
			if (testVLabels != null && !testVLabels.isEmpty()) {
				final SymbolSet ruleVLabels = ruleContext.get(eLabel);
				//If this rule's context contains the whole test entry, then the rule does not miss the context to test 
				if (ruleVLabels != null) {
					if (ruleVLabels.containsAll(testVLabels)) {
						return false;
					}
				}
			}
		}
		//If for all test entries, none is full contained by the rule's context, then the rule misses the whole context to test
		return true;
	}
	
}
