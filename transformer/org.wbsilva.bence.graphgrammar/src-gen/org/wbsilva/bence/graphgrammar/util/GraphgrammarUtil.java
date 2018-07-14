package org.wbsilva.bence.graphgrammar.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
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
	 * Return true iff a {@code mapping} represents part of a bijective mapping constructed from the list of candidates 
	 * for each vertex {@code candidates}.
	 * Each element i of this list holds the set of candidate vertices for the mapping's image of the i-th vertex
	 * and each element i of the list {@code mapping} holds the chosen image for the i-th vertex.
	 * This method supposes that the union of all candidate vertices belongs to the n vertices of the mapping's domain.
	 * 
	 * @param mapping			The partial mapping constructed so far
	 * @param candidates		The set of candidate vertices for image of each of the n vertices 
	 * @return					True if mapping is part of a bijection from the n vertices (each one represented 
	 * 							by each position of the candidates list) to the candidate vertices, false otherwise.
	 */
	private static boolean anyBijectiveMapping(final List<Vertex> mapping, final List<Set<Vertex>> candidates) {
		//if mapping is complete (it got to a leaf of the search space)
		if (mapping.size() == candidates.size()) {
			//if mapping is bijective
			if (mapping.stream().distinct().count() == mapping.size()) {
				//then it is an isomorphism
				return true;
			} else {
				return false;
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
				if (anyBijectiveMapping(newMapping, candidates))
					return true;				
			}
			//all possibilities exhausted
			return false;
		}
	}
	
	/**
	 * Return true iff a bijective mapping can be constructed from the list of candidates for each vertex {@code candidates}.
	 * Each element i of this list holds the set of candidate vertices for the mapping's image of the i-th vertex.
	 * This method supposes that the union of all candidate vertices belongs to the n vertices of the mapping's domain.
	 * 
	 * @param candidates		The set of candidate vertices for image of each of the n vertices 
	 * @return					True if there is a bijection from the n vertices (each one represented 
	 * 							by each position of the candidates list) to the candidate vertices, false otherwise. 
	 */
	public static boolean anyBijectiveMapping(final List<Set<Vertex>> candidates) {
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
		
		if (n.parallelStream().anyMatch(s -> !ab.contains(s)) || t.parallelStream().anyMatch(s -> !ab.contains(s)))
			return false;
		
		Symbol ini = grammar.getInitial();
		if (ini == null || ini.getName() == null || ini.getName().isEmpty() || !n.contains(ini))
			return false;
		
		EList<Rule> r = grammar.getRules();
		if (r == null || r.isEmpty())
			return false;
		
		if (r.parallelStream().map(rr -> rr.getId()).distinct().count() != r.size())
			return false;
		if (r.parallelStream().anyMatch(rr -> !isValidRule(ab, rr)))
			return false;
		
		return true;
	}

	/**
	 * Checks if a rule is concise
	 * @param alphabet		The alphabet to which the rule refers 
	 * @param rule			The rule to test		
	 * @return				True iff {@code rule} is valid
	 */
	private static boolean isValidRule(final EList<Symbol> alphabet, final Rule rule) {
		if (rule.getLhs() == null || rule.getRhs() == null || !isValidGraph(rule.getRhs()))
			return false;
		if (rule.getEmbedding() == null || 
				rule.getEmbedding().entrySet().parallelStream()
					.anyMatch(e -> e.getValue() == null || e.getValue().isEmpty() || !inAlphabet(alphabet, e.getValue())) ||
					rule.getEmbedding().entrySet().parallelStream()
					.anyMatch(e -> !rule.getRhs().getVertices().contains(e.getKey().getVertex()) || !inAlphabet(alphabet, e.getKey().getEdgeLabel())))
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
		return alphabet.parallelStream().anyMatch(s -> s.getName().equals(symbol.getName()));
	}

	/**
	 * Checks if all symbols are in the alphabet (compares using the name of the symbol, not the object)
	 * @param alphabet	Alphabet to test
	 * @param symbols	Symbols to test
	 * @return			True iff all {@code symbols} are in the {@code alphabet}
	 */
	private static boolean inAlphabet(final EList<Symbol> alphabet, final EList<Symbol> symbols) {
		return symbols.parallelStream().allMatch(s -> inAlphabet(alphabet, s));
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
				graph.getVertices().parallelStream().anyMatch(v -> v.getLabel() == null || v.getLabel().getName().isEmpty()))
			return false;
		if (graph.getVertices().parallelStream().map(v -> v.getId()).distinct().count() != graph.getVertices().size())
			return false;
		
		if (graph.getEdges().parallelStream().anyMatch(e -> !graph.getVertices().contains(e.getFrom()) || !graph.getVertices().contains(e.getTo())))
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
		
		if (n.parallelStream().anyMatch(s -> !ab.contains(s)) || t.parallelStream().anyMatch(s -> !ab.contains(s)))
			return false;
		
		Symbol ini = tripleGrammar.getInitial();
		if (ini == null || ini.getName() == null || ini.getName().isEmpty() || !n.contains(ini))
			return false;
		
		EList<TripleRule> r = tripleGrammar.getTripleRules();
		if (r == null || r.isEmpty())
			return false;
		
		if (r.parallelStream().anyMatch(rr -> !isValidRule(ab, rr.getSource()) || !isValidRule(ab, rr.getCorr()) || !isValidRule(ab, rr.getTarget())))
				return false;
		
		if (r.parallelStream().anyMatch(rr -> !isTotal(rr.getCorr().getRhs().getVertices(), rr.getMs()) ||
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
		return counterDomain.parallelStream().anyMatch(cd -> !map.containsValue(cd)) ? false : true;
	}

	/**
	 * Checks is a mapping is total
	 * @param domain			The domain
	 * @param map				The function
	 * @return					True iff {@code map} is total
	 */
	private static boolean isTotal(final EList<Vertex> domain, final EMap<Vertex, Vertex> map) {
		return domain.parallelStream().anyMatch(d -> !map.containsKey(d)) ? false : true;
	}

	/**
	 * Checks is a mapping is injective
	 * @param map				The function
	 * @return					True iff {@code map} is injective
	 */
	private static boolean isInjective(final EMap<Vertex, Vertex> map) {
		return map.values().parallelStream().distinct().count() != map.size() ? false : true;
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
	 * @param grammar		The grammar to check
	 * @return				True iff {@code grammar} is boundary
	 */
	public static boolean isBoundaryGrammar(final Grammar grammar) {
		
		//if any rule's graph is not boundary 
		if (grammar.getRules().parallelStream()
			.anyMatch(r -> !isBoundaryGraph(r.getRhs(), grammar.getNonterminals())))
			return false;
		
		return true;
	}

	/**
	 * Checks if a graph is a G-boundary graph
	 * @param grammar		The graph to check
	 * @param g				The G set used to check the boundaryness
	 * @return				True iff {@code graph} is {@code g}-boundary
	 */
	public static boolean isBoundaryGraph(final Graph graph, final EList<Symbol> g) {
		//if the graph has G-labeled vertices as neighbors
		if(graph.getEdges().parallelStream()
				.anyMatch(e -> inAlphabet(g, e.getFrom().getLabel()) &&
						inAlphabet(g, e.getTo().getLabel()))
				//or it is not (weakly) connected
				|| !isWeaklyConnectedGraph(graph))
			//then it is not G-boundary
			return false;
		
		return true;
	}
	
	/**
	 * Checks if a directed graph is weakly connected
	 * @param grammar		The graph to check
	 * @return				True iff {@code graph} is weakly connected
	 */
	private static boolean isWeaklyConnectedGraph(final Graph graph) {
		//TODO
		return true;
	}

}
