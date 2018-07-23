package org.wbsilva.bence.graphgrammar.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleGraph;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * Utilities for the graph grammar metamodel
 * @author wbombardellis
 *
 */
public class GraphgrammarUtil {

	/**
	 * Iff a {@code mapping} represents part of a bijective mapping constructed from the list of candidates 
	 * for each vertex {@code candidates}, then return {@code mapping} in an optional. Otherwise empty
	 * Each element i of this list holds the set of candidate vertices for the mapping's image of the i-th vertex
	 * and each element i of the list {@code mapping} holds the chosen image for the i-th vertex.
	 * This method supposes that the union of all candidate vertices belongs to the n vertices of the mapping's domain.
	 * 
	 * @param mapping			The partial mapping constructed so far
	 * @param candidates		The set of candidate vertices for image of each of the n vertices 
	 * @return					If {@code mapping} is part of a bijection from the n vertices (each one represented 
	 * 							by each position of the candidates list) to the candidate vertices, 
	 * 							then return an optional with mapping inside, empty otherwise.
	 */
	private static Optional<List<Vertex>> anyBijectiveMapping(final List<Vertex> mapping, final List<Set<Vertex>> candidates) {
		//if mapping is complete (it got to a leaf of the search space)
		if (mapping.size() == candidates.size()) {
			//if mapping is bijective
			if (mapping.stream().distinct().count() == mapping.size()) {
				//then it is an isomorphism
				return Optional.of(mapping);
			} else {
				return Optional.empty();
			}
		}
		//if mapping still not ready
		else {
			//contribute to the mapping
			ArrayList<Vertex> newMapping = new ArrayList<>(mapping);
			//this method call is responsible for the mapping possibilities of the index-th vertex
			int index = mapping.size();
			
			//Add dummy element just to be able to set afterwards
			if (!candidates.get(index).isEmpty())
				newMapping.add(GraphgrammarFactory.eINSTANCE.createVertex());
			
			//keep exploring search space by trying different candidates
			for (Vertex c : candidates.get(index)) {
				newMapping.set(index, c);
				//if this mapping works, return true, otherwise keep trying
				final Optional<List<Vertex>> m = anyBijectiveMapping(newMapping, candidates);
				if (m.isPresent())
					return m;				
			}
			//all possibilities exhausted
			return Optional.empty();
		}
	}
	
	/**
	 * If a bijective mapping can be constructed from the list of candidates for each vertex {@code candidates},
	 * then return it, otherwise return empty.
	 * Each element i of this list holds the set of candidate vertices for the mapping's image of the i-th vertex.
	 * This method supposes that the union of all candidate vertices belongs to the n vertices of the mapping's domain.
	 * 
	 * @param candidates		The set of candidate vertices for image of each of the n vertices 
	 * @return					A bijection from the n vertices (each one represented 
	 * 							by each position of the candidates list) to the candidate vertices, if it is an isomorphism,
	 * 							empty if none exists. 
	 */
	public static Optional<List<Vertex>> anyBijectiveMapping(final List<Set<Vertex>> candidates) {
		assert candidates != null;
		return anyBijectiveMapping(new ArrayList<Vertex>(0), candidates);
	}
	
	/**
	 * Return true iff the edges {@code e} and {@code f} are isomorphic. Edges are compared one-by-one according to their order.
	 * Two edges are isomorphic, iff they have the equal label and their incident vertices have also equal labels.
	 * If any of them is null, return false.
	 * 
	 * @param e		One list of edges
	 * @param f		Other list of edges
	 * @return		True if the list of edges {@code e} and {@code f} are isomorphic one-by-one, false otherwise.
	 * @see Edge#compareTo(Edge)
	 */
	public static boolean isomorphicEdges(final List<Edge> e, final List<Edge> f) {
		if (e != null && f != null && e.size() == f.size()) {
			//Since edges can be canonically ordered, it suffices to order them and check each one for equality
			e.sort(Edge::compareTo);
			f.sort(Edge::compareTo);
			for (int i = 0; i < e.size(); i++) {
				if (e.get(i).compareTo(e.get(i)) != 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Set new unique IDs for each vertex in {@code vertices}
	 * @param vertices		Vertices which IDs are to be set uniquely
	 */
	public static void ensureUniqueIds(final Collection<? extends Vertex> vertices) {
		for (Vertex v : vertices) {
			v.setId(EcoreUtil.generateUUID());
		}
	}
	
	/**
	 * Set new unique ID for the graph {@code graph} and its vertices
	 * @param graph			Graph to be set with unique IDs
	 * @see GraphgrammarUtil#ensureUniqueIds(Collection)
	 */
	public static void ensureUniqueIds(Graph graph) {
		ensureUniqueIds(graph.getVertices());
	}
	
	/**
	 * Set new unique ID for the graph {@code graph} and for the grammar {@code grammar} as well as for its rules.
	 * @param graph			Graph to be set with unique IDs
	 * @param grammar		Grammar to be set with unique IDs
	 */
	public static void ensureUniqueIds(final Graph graph, final TripleGrammar grammar) {
		//IDs for the host graph
		GraphgrammarUtil.ensureUniqueIds(graph);
		
		//IDs for the right hand side of grammar rules
		for (TripleRule r : grammar.getTripleRules()) {
			final String id = EcoreUtil.generateUUID();
			
			r.getSource().setId(id);
			r.getCorr().setId(id);
			r.getTarget().setId(id);
			
			ensureUniqueIds(r.getSource().getRhs());
			ensureUniqueIds(r.getCorr().getRhs());
			ensureUniqueIds(r.getTarget().getRhs());
		}
	}

	/**
	 * Checks that a grammar is concise
	 * @param grammar	Grammar to test
	 * @return			True iff {@code grammar} is valid
	 */
	public static boolean isValidGrammar(final Grammar grammar) {
		if (grammar == null)
			return false;
		
		EList<Symbol> ab = grammar.getAlphabet();
		if (ab == null || ab.isEmpty())
			return false;
		
		EList<Symbol> n = grammar.getNonterminals();
		if (n == null || n.isEmpty())
			return false;
		
		EList<Symbol> t = grammar.getTerminals();
		if (t == null || t.isEmpty())
			return false;
		
		if (n.stream().anyMatch(s -> !ab.contains(s)) || t.stream().anyMatch(s -> !ab.contains(s)))
			return false;
		
		Symbol ini = grammar.getInitial();
		if (ini == null || ini.getName() == null || ini.getName().isEmpty() || !n.contains(ini))
			return false;
		
		EList<Rule> r = grammar.getRules();
		if (r == null || r.isEmpty())
			return false;
		
		if (r.stream().map(rr -> rr.getId()).distinct().count() != r.size())
			return false;
		if (r.stream().anyMatch(rr -> !isValidRule(ab, rr)))
			return false;
		
		return true;
	}

	/**
	 * Checks if a rule is concise, also checking it against the grammar's alphabet
	 * @param alphabet		The alphabet to which the rule refers 
	 * @param rule			The rule to test		
	 * @return				True iff {@code rule} is valid
	 */
	public static boolean isValidRule(final EList<Symbol> alphabet, final Rule rule) {
		if (rule.getId() == null)
			return false;
		if (rule.getLhs() == null || rule.getRhs() == null || !isValidGraph(rule.getRhs()))
			return false;
		if (rule.getEmbedding() == null || 
				rule.getEmbedding().entrySet().stream()
					.anyMatch(e -> !rule.getRhs().getVertices().contains(e.getKey()) 
							|| e.getValue() == null || e.getValue().isEmpty()
							|| e.getValue().stream().anyMatch(ss -> !inAlphabet(alphabet, ss.getEdgeLabel())
									|| !inAlphabet(alphabet, ss.getVertexLabels()))))
				return false;
		return true;
	}
	
	/**
	 * Checks if a rule is concise 
	 * @param rule			The rule to test		
	 * @return				True iff {@code rule} is valid
	 */
	public static boolean isValidRule(final Rule rule) {
		if (rule.getLhs() == null || rule.getRhs() == null || !isValidGraph(rule.getRhs()))
			return false;
		if (rule.getEmbedding() == null || 
				rule.getEmbedding().entrySet().stream()
					.anyMatch(e -> !rule.getRhs().getVertices().contains(e.getKey())
							|| e.getValue() == null || e.getValue().isEmpty()))
				return false;
		return true;
	}

	/**
	 * Checks if a symbol is in the alphabet (compares using the name of the symbol, not the object)
	 * @param alphabet	Alphabet to test
	 * @param symbol	Symbol to test
	 * @return			True iff {@code symbol} is in the {@code alphabet}
	 */
	private static boolean inAlphabet(final EList<Symbol> alphabet, final Symbol symbol) {
		return alphabet.stream().anyMatch(s -> s.getName().equals(symbol.getName()));
	}

	/**
	 * Checks if all symbols are in the alphabet (compares using the name of the symbol, not the object)
	 * @param alphabet	Alphabet to test
	 * @param symbols	Symbols to test
	 * @return			True iff all {@code symbols} are in the {@code alphabet}
	 */
	private static boolean inAlphabet(final EList<Symbol> alphabet, final EList<Symbol> symbols) {
		return symbols.stream().allMatch(s -> inAlphabet(alphabet, s));
	}

	/**
	 * Checks that a graph is concise
	 * @param graph		Graph to test
	 * @return			True iff {@code graph} is valid
	 */
	public static boolean isValidGraph(final Graph graph) {
		if (graph == null)
			return false;
		
		if (graph.getVertices() == null || 
				graph.getVertices().stream().anyMatch(v -> v.getLabel() == null || v.getLabel().getName().isEmpty()))
			return false;
		if (graph.getVertices().stream().map(v -> v.getId()).distinct().count() != graph.getVertices().size())
			return false;
		
		if (graph.getEdges().stream()
				.anyMatch(e -> !graph.getVertices().contains(e.getFrom()) 
							|| !graph.getVertices().contains(e.getTo())
							|| e.getLabel() == null || e.getLabel().getName().isEmpty()
							|| e.getFrom() == e.getTo()))
			return false;
		
		return true;
	}

	/**
	 * Checks if a triple grammar is concise
	 * @param tripleGrammar		The triple grammar to test
	 * @return					True iff {@code tripleGrammar} is valid
	 */
	public static boolean isValidTripleGrammar(final TripleGrammar tripleGrammar) {
		if (tripleGrammar == null)
			return false;
		
		EList<Symbol> ab = tripleGrammar.getAlphabet();
		if (ab == null || ab.isEmpty())
			return false;
		
		EList<Symbol> n = tripleGrammar.getNonterminals();
		if (n == null || n.isEmpty())
			return false;
		
		EList<Symbol> t = tripleGrammar.getTerminals();
		if (t == null || t.isEmpty())
			return false;
		
		if (n.stream().anyMatch(s -> !ab.contains(s)) || t.stream().anyMatch(s -> !ab.contains(s)))
			return false;
		
		Symbol ini = tripleGrammar.getInitial();
		if (ini == null || ini.getName() == null || ini.getName().isEmpty() || !n.contains(ini))
			return false;
		
		EList<TripleRule> r = tripleGrammar.getTripleRules();
		if (r == null || r.isEmpty())
			return false;
		
		if (r.stream().anyMatch(rr -> !isValidRule(ab, rr.getSource()) || !isValidRule(ab, rr.getCorr()) || !isValidRule(ab, rr.getTarget())))
				return false;
		
		if (r.stream().anyMatch(rr -> !isTotal(rr.getCorr().getRhs().getVertices(), rr.getMs()) ||
				!isInjective(rr.getMs()) ||
				!isSurjective(rr.getSource().getRhs().getVertices(), rr.getMs()) || 
				!isTotal(rr.getCorr().getRhs().getVertices(), rr.getMt()) ||
				!isInjective(rr.getMt()) ||
				!isSurjective(rr.getTarget().getRhs().getVertices(), rr.getMt())))
				return false;
		return true;
	}

	/**
	 * Checks is a mapping is surjective
	 * @param counterDomain		The counter domain
	 * @param map				The function
	 * @return					True iff {@code map} is surjective
	 */
	private static boolean isSurjective(final EList<Vertex> counterDomain, final EMap<Vertex, Vertex> map) {
		return counterDomain.stream().anyMatch(cd -> !map.containsValue(cd)) ? false : true;
	}

	/**
	 * Checks is a mapping is total
	 * @param domain			The domain
	 * @param map				The function
	 * @return					True iff {@code map} is total
	 */
	private static boolean isTotal(final EList<Vertex> domain, final EMap<Vertex, Vertex> map) {
		return domain.stream().anyMatch(d -> !map.containsKey(d)) ? false : true;
	}

	/**
	 * Checks is a mapping is injective
	 * @param map				The function
	 * @return					True iff {@code map} is injective
	 */
	private static boolean isInjective(final EMap<Vertex, Vertex> map) {
		return map.values().stream().distinct().count() != map.size() ? false : true;
	}

	/**
	 * Checks if a triple graph is concise
	 * @param tripleGraph		The triple graph to test
	 * @return					True iff {@code tripleGraph} is valid
	 */
	public static boolean isValidTripleGraph(final TripleGraph tripleGraph) {
		if (tripleGraph == null)
			return false;
		
		if (!isValidGraph(tripleGraph.getCorr()) || !isValidGraph(tripleGraph.getSource()) || !isValidGraph(tripleGraph.getTarget()))
			return false;
		
		if (!isTotal(tripleGraph.getCorr().getVertices(), tripleGraph.getMs()) ||
				!isInjective(tripleGraph.getMs()) ||
				!isSurjective(tripleGraph.getSource().getVertices(), tripleGraph.getMs()) || 
				!isTotal(tripleGraph.getCorr().getVertices(),tripleGraph.getMt()) ||
				!isInjective(tripleGraph.getMt()) ||
				!isSurjective(tripleGraph.getTarget().getVertices(), tripleGraph.getMt()))
				return false;
		
		return true;
	}

	/**
	 * Checks if a grammar is a boundary grammar
	 * @param grammar		The grammar to check. Has to be valid
	 * @return				True iff {@code grammar} is boundary
	 */
	public static boolean isBoundaryGrammar(final Grammar grammar) {
		final Set<String> terminals = grammar.getTerminals().stream()
				.map(l -> l.getName())
				.collect(Collectors.toSet());
		
		//if any rule's graph is not boundary 
		if (grammar.getRules().stream()
			.anyMatch(r -> !isBoundaryGraph(r.getRhs(), grammar.getNonterminals())					
					//Check range of the embedding function
					|| !r.getEmbedding().values().stream()
							.allMatch(e -> e.stream()
									.allMatch(ssP -> ssP
											.getVertexLabels().stream()
												.allMatch(l -> terminals.contains(l.getName()))))))
			return false;
		
		return true;
	}

	/**
	 * Checks if a graph is a G-boundary graph
	 * @param grammar		The graph to check. Has to be valid
	 * @param g				The G set used to check the boundaryness
	 * @return				True iff {@code graph} is {@code g}-boundary
	 */
	public static boolean isBoundaryGraph(final Graph graph, final EList<Symbol> g) {
		//if the graph has G-labeled vertices as neighbors
		if(graph.getEdges().stream()
				.anyMatch(e -> inAlphabet(g, e.getFrom().getLabel()) &&
						inAlphabet(g, e.getTo().getLabel())))
			//then it is not G-boundary
			return false;
		
		return true;
	}
	
	/**
	 * Checks if a directed graph is weakly connected
	 * @param grammar		The graph to check. Has to be valid
	 * @return				True iff {@code graph} is weakly connected
	 */
	public static boolean isWeaklyConnectedGraph(final Graph graph) {
		//TODO
		return true;
	}

	/**
	 * Checks if a triple grammar is a boundary triple grammar
	 * @param tripleGrammar		The triple grammar to check. Has to be valid
	 * @return					True iff {@code tripleGrammar} is boundary
	 */
	public static boolean isBoundaryTripleGrammar(final TripleGrammar tripleGrammar) {
		//if any triple rule's graph is not boundary 
		if (tripleGrammar.getTripleRules().stream()
			.anyMatch(tr -> !isBoundaryGraph(tr.getSource().getRhs(), tripleGrammar.getNonterminals())
					|| !isBoundaryGraph(tr.getCorr().getRhs(), tripleGrammar.getNonterminals())
					|| !isBoundaryGraph(tr.getTarget().getRhs(), tripleGrammar.getNonterminals())))
			return false;
		
		return true;
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
		final HashMap<String, Set<String>> maxContext = new HashMap<>(grammar.getNonterminals().size());
		final HashMap<Vertex, Set<String>> embeddingContext = new HashMap<>();

		for (Symbol l: grammar.getNonterminals()) {
			maxContext.put(l.getName(), new HashSet<String>());
		}
		
		//Determine the maximal context of each nonterminal symbol
		for (Rule r : grammar.getRules()) {
			for (Vertex v : r.getRhs().getVertices()) {
				
				//The embedding context of each vertex of the RHS of each rule
				final EList<SymbolSymbolsPair> embedding = r.getEmbedding().get(v);
				final Set<String> vertexEmbeddingContext;
				if (embedding == null) {
					vertexEmbeddingContext = new HashSet<>(0);
				} else {
					vertexEmbeddingContext = embedding.stream()
						.flatMap(ssp -> ssp.getVertexLabels().stream()
								.map(s -> s.getName()))
						.collect(Collectors.toSet());
				}
				embeddingContext.put(v, vertexEmbeddingContext);
				
				if (grammar.getNonterminals().stream().anyMatch(l -> EcoreUtil.equals(l, v.getLabel()))) {
					final Set<String> ntContext = maxContext.get(v.getLabel().getName());
					
					//The real context of each nonterminal vertex of the RHS of each rule
					ntContext.addAll(r.getRhs().neighborhood(v).stream()
							.map(w -> w.getLabel().getName())
							.collect(Collectors.toSet()));
					
					ntContext.addAll(vertexEmbeddingContext);
				}
			}
		}
		
		//If any rule's embedding context does not contain all LHS's maximal context
		if (grammar.getRules().stream()
				.anyMatch(r -> !r.getRhs().getVertices().stream()
						.flatMap(v -> embeddingContext.get(v).stream())
						.collect(Collectors.toSet())
						.containsAll(maxContext.get(r.getLhs().getName()))))
			//Then it may not be a neighborhood preserving grammar
			return false;
		else
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
	 * Checks if a derivation is valid or not (It does not check each derivation step fully validity)
	 * @param derivation		The derivation to check
	 * @return
	 */
	public static boolean isValidDerivation(final Derivation derivation) {
		if (derivation == null)
			return false;
		if (derivation.getSteps().isEmpty())
			return false;
		
		if (derivation.getSteps().stream().anyMatch(dS -> !GraphgrammarUtil.isValidDerivationStep(dS)))
			return false;
		
		return true;
	}

	/**
	 * Checks if a derivation step is valid or not
	 * 
	 * @param dS		The derivation step to check
	 * @return			True iff {@code dS} is valid
	 */
	public static boolean isValidDerivationStep(final DerivationStep dS) {
		if (!GraphgrammarUtil.isValidGraph(dS.getPrevious()))
			return false;
		if (!GraphgrammarUtil.isValidGraph(dS.getNext()))
			return false;
		if (!GraphgrammarUtil.isValidRule(dS.getRule()))
			return false;
		if (dS.getVertex() == null || !dS.getPrevious().getVertices().stream().anyMatch(v -> EcoreUtil.equals(v, dS.getVertex())))
			return false;
		if (dS.getUnifier() == null || dS.getUnifier().size() != dS.getRule().getRhs().getVertices().size()
				|| !isInjective(dS.getUnifier())
				|| !isTotal(dS.getRule().getRhs().getVertices(), dS.getUnifier())
				|| !dS.getUnifier().stream().allMatch(u -> dS.getNext().getVertices().contains(u.getValue())))
			return false;
		return true;
	}

}
