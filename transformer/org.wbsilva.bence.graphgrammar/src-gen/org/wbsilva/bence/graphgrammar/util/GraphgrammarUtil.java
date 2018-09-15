package org.wbsilva.bence.graphgrammar.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleGraph;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

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
				if (e.get(i).compareTo(f.get(i)) != 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Calculates swiftly the 2-distance between all vertices of {@code graph}.
	 * The 2-distance d(v,w) between two vertices v and w is as follows:
	 * d(v,v) = 0
	 * if the least path between v and w is of size 1 (i.e. v and w are immediate neighbors), then d(v,w) = 1
	 * if the least path between v and w is of size 2, (i.e. v and w are 2-neighbors), then d(v,w) = 3
	 * otherwise d(v,w) is undefined
	 * @param graph		The graph to calculate the 2-distance
	 * @return			A map from the vertices' ids to a map from vertices' ids to an integer containing the 2-distance between the former and the latter
	 */
	public static Map<String, Map<String, Integer>> distance(final Graph graph){
		assert graph != null;
		
		final Map<String, Map<String, Integer>> distance = new HashMap<>(graph.getVertices().size());
		
		Vertex[] vArray = new Vertex[graph.getVertices().size()];
		vArray = graph.getVertices().toArray(vArray);
		
		//For each vertex, without repetition
		for (int i = 0; i < vArray.length; i++) {
			final Vertex v = vArray[i];
			
			//Reflexive case 
			final Map<String, Integer> m = new HashMap<>();
			m.put(v.getId(), 0);
			distance.merge(v.getId(), m, (a,b) -> {
				a.putAll(b);
				return a;
			});
			
			for (int j = i+1; j < vArray.length; j++) {
				final Vertex w = vArray[j];
				
				//If w is an immediate(one-) neighbor of v
				if (graph.getEdges().stream().anyMatch(e -> e.getFrom() == v && e.getTo() == w)
					|| graph.getEdges().stream().anyMatch(e -> e.getTo() == v && e.getFrom() == w)){
					
					//Index distance in the map (also with symmetry)
					final Map<String, Integer> wM = new HashMap<>();
					wM.put(w.getId(), 1);
					distance.merge(v.getId(), wM, (a,b) -> {
						a.putAll(b);
						return a;
					});
					final Map<String, Integer> vM = new HashMap<>();
					vM.put(v.getId(), 1);
					distance.merge(w.getId(), vM, (a,b) -> {
						a.putAll(b);
						return a;
					});
				
				//If w is a two-neighbor of v
				} else if (graph.getEdges().stream()
								.anyMatch(e -> e.getFrom() == v &&  graph.neighborhood(e.getTo()).contains(w))
							|| graph.getEdges().stream()
								.anyMatch(e -> e.getTo() == v &&  graph.neighborhood(e.getFrom()).contains(w))){
					
					//Index distance in the map
					final Map<String, Integer> wM = new HashMap<>();
					wM.put(w.getId(), 3);
					distance.merge(v.getId(), wM, (a,b) -> {
						a.putAll(b);
						return a;
					});
					final Map<String, Integer> vM = new HashMap<>();
					vM.put(v.getId(), 3);
					distance.merge(w.getId(), vM, (a,b) -> {
						a.putAll(b);
						return a;
					});
				}
			}
		}

		return distance;
	}

	/**
	 * Set new unique IDs for each vertex in {@code vertices}
	 * @param vertices		Vertices which IDs are to be set uniquely
	 * @return				A map from the old ids to the respective vertices
	 */
	public static Map<String, Vertex> ensureUniqueIds(final Collection<? extends Vertex> vertices) {
		final Map<String, Vertex> old2newMap = new HashMap<>(vertices.size());
		for (Vertex v : vertices) {
			old2newMap.put(v.getId(), v);
			v.setId(EcoreUtil.generateUUID());
		}
		return old2newMap;
	}
	
	/**
	 * Set new unique ID for the graph {@code graph} and its vertices
	 * @param graph			Graph to be set with unique IDs
	 * @return				A map from the old ids to the respective vertices
	 * @see GraphgrammarUtil#ensureUniqueIds(Collection)
	 */
	public static Map<String, Vertex> ensureUniqueIds(Graph graph) {
		return ensureUniqueIds(graph.getVertices());
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
		
		List<Symbol> ab = grammar.getAlphabet();
		if (ab == null || ab.isEmpty())
			return false;
		
		List<Symbol> n = grammar.getNonterminals();
		if (n == null || n.isEmpty())
			return false;
		
		List<Symbol> t = grammar.getTerminals();
		if (t == null)
			return false;
		
		if (n.stream().anyMatch(s -> !contains(ab, s)) || t.stream().anyMatch(s -> !contains(ab, s)))
			return false;
		
		Symbol ini = grammar.getInitial();
		if (ini == null || ini.getName() == null || ini.getName().isEmpty() || !n.contains(ini))
			return false;
		
		if (t.stream().anyMatch(l -> !l.getSubscript().isEmpty() || !l.getSuperscript().isEmpty()))
			return false;
		
		if (n.stream().anyMatch(l -> l.getSubscript().stream().anyMatch(s -> !contains(t, s)) 
								  || l.getSuperscript().stream().anyMatch(s -> !contains(t, s))))
			return false;
		
		List<Rule> r = grammar.getRules();
		if (r == null)
			return false;
		
		if (r.stream().map(rr -> rr.getId()).distinct().count() != r.size())
			return false;
		if (r.stream().anyMatch(rr -> !isValidRule(ab, rr)))
			return false;
		
		return true;
	}

	/**
	 * Return true if collection {@code c} contains the symbol {@code s} or any equivalent symbol,
	 * false otherwise. If {@code s} is null, look for a null entry in {@code c}.
	 * 
	 * @param c			The collection to test for containment. Never null
	 * @param s			The symbol to test
	 * @return			Return true iff {@code c} contains {@code s} using the equivalence relation in {@link Symbol#equivalates(Symbol)}
	 * @see Symbol#equivalates(Symbol)
	 */
	private static boolean contains(final Collection<Symbol> c, final Symbol s) {
		return c.stream()
				.anyMatch(t -> s == null ? t == null : s.equivalates(t));
	}
	
	/**
	 * Return true if collection {@code c} contains the symbol with name {@code s},
	 * false otherwise. If {@code s} is null, look for a null entry in {@code c}.
	 * 
	 * @param c			The collection to test for containment. Never null
	 * @param s			The string to test
	 * @return			Return true iff {@code c} contains a symbol named {@code s}
	 * @see GraphgrammarUtil#contains(Collection, Symbol)
	 */
	private static boolean contains(final Collection<Symbol> c, final String s) {
		return c.stream()
				.anyMatch(t -> s == null ? t == null : s.equals(t.getName()));
	}

	/**
	 * Checks if a rule is concise, also checking it against the grammar's alphabet
	 * @param alphabet		The alphabet to which the rule refers 
	 * @param rule			The rule to test		
	 * @return				True iff {@code rule} is valid
	 */
	public static boolean isValidRule(final List<Symbol> alphabet, final Rule rule) {
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
	private static boolean inAlphabet(final List<Symbol> alphabet, final Symbol symbol) {
		return alphabet.stream().anyMatch(s -> symbol == null ? s == null : symbol.equivalates(s));
	}

	/**
	 * Checks if all symbols are in the alphabet (compares using the name of the symbol, not the object)
	 * @param alphabet	Alphabet to test
	 * @param symbols	Symbols to test
	 * @return			True iff all {@code symbols} are in the {@code alphabet}
	 */
	private static boolean inAlphabet(final List<Symbol> alphabet, final List<Symbol> symbols) {
		return symbols.stream().allMatch(s -> inAlphabet(alphabet, s));
	}

	/**
	 * Checks that a graph is concise
	 * @param graph			Graph to test
	 * @param acceptLoops 	If true, than loops are allowed to occur (A loop is an edge from and to the same vertex)
	 * @return			True iff {@code graph} is valid
	 */
	public static boolean isValidGraph(final Graph graph, boolean acceptLoops) {
		if (graph == null)
			return false;
		
		if (graph.getVertices() == null || 
				graph.getVertices().stream().anyMatch(v -> v.getLabel() == null || v.getLabel().getName() == null || v.getLabel().getName().isEmpty()))
			return false;
		if (graph.getVertices().stream().map(v -> v.getId()).distinct().count() != graph.getVertices().size())
			return false;
		
		if (graph.getEdges().stream()
				.anyMatch(e -> !graph.getVertices().contains(e.getFrom()) 
							|| !graph.getVertices().contains(e.getTo())
							|| e.getLabel() == null || e.getLabel().getName().isEmpty() 
							|| !e.getLabel().getSubscript().isEmpty()
							|| !e.getLabel().getSuperscript().isEmpty()
							|| (!acceptLoops && e.getFrom() == e.getTo())))
			return false;
		
		return true;
	}
	
	/**
	 * Checks that a grammar is simple labeled. I.e. no vertex of no rule has sub or super scripts in its label
	 * @param grammar			Grammar to test. Has to be valid.
	 * @return					True iff {@code grammar} has only simple labels
	 */
	public static boolean isSimpleLabeledGrammar(final Grammar grammar) {
		if (grammar.getAlphabet().stream()
				.anyMatch(l -> !l.getSubscript().isEmpty() || !l.getSuperscript().isEmpty()))
			return false;

		if (grammar.getRules().stream()
				.anyMatch(r -> r.getRhs().getVertices().stream()
									.anyMatch(v -> !v.getLabel().getSubscript().isEmpty() 
												|| !v.getLabel().getSuperscript().isEmpty())))
			return false;
		return true;
	}
	
	/**
	 * Checks that a graph is concise. Does not accept loops
	 * @param graph			Graph to test
	 * @return			True iff {@code graph} is valid
	 */
	public static boolean isValidGraph(final Graph graph) {
		return isValidGraph(graph, false);
	}

	/**
	 * Checks if a triple grammar is concise
	 * @param tripleGrammar		The triple grammar to test
	 * @return					True iff {@code tripleGrammar} is valid
	 */
	public static boolean isValidTripleGrammar(final TripleGrammar tripleGrammar) {
		if (tripleGrammar == null)
			return false;
		
		List<Symbol> ab = tripleGrammar.getAlphabet();
		if (ab == null || ab.isEmpty())
			return false;
		
		List<Symbol> n = tripleGrammar.getNonterminals();
		if (n == null || n.isEmpty())
			return false;
		
		List<Symbol> t = tripleGrammar.getTerminals();
		if (t == null)
			return false;
		
		if (n.stream().anyMatch(s -> !contains(ab, s)) || t.stream().anyMatch(s -> !contains(ab, s)))
			return false;
		
		Symbol ini = tripleGrammar.getInitial();
		if (ini == null || ini.getName() == null || ini.getName().isEmpty() || !n.contains(ini))
			return false;
		
		List<TripleRule> r = tripleGrammar.getTripleRules();
		if (r == null || r.stream().anyMatch(rr -> !isValidTripleRule(ab, n, rr)))
			return false;
		
		if (!r.isEmpty() && !r.stream().anyMatch(rr -> rr.getSource().getLhs().equivalates(tripleGrammar.getInitial())
									&& rr.getCorr().getLhs().equivalates(tripleGrammar.getInitial())
									&& rr.getTarget().getLhs().equivalates(tripleGrammar.getInitial())))
			return false;
		
		return true;
	}

	/**
	 * Checks if a triple grammar rule is concise
	 * @param ab				The alphabet of the grammar
	 * @param nt				The non terminal symbols of the grammar
	 * @param rr				The triple rule to test
	 * @return					True iff {@code rr} is valid
	 */
	private static boolean isValidTripleRule(final List<Symbol> ab, final List<Symbol> nt, final TripleRule rr) {
		if (!isValidRule(ab, rr.getSource()) || !isValidRule(ab, rr.getCorr()) || !isValidRule(ab, rr.getTarget()))
			return false;
		
		if (!rr.getSource().getId().equals(rr.getTarget().getId()))
			return false;
		
		//LHS names' must be equals, but sup and superscripts can be ignored
		if (! (rr.getSource().getLhs().getName().equals(rr.getCorr().getLhs().getName()) 
				&& rr.getCorr().getLhs().getName().equals(rr.getTarget().getLhs().getName())))
			return false;
		
		if (!isTotal(rr.getCorr().getRhs().getVertices(), rr.getMs()) ||
			!isInjective(rr.getMs()) ||
			!isSurjective(rr.getSource().getRhs().getVertices(), rr.getMs()) || 
			!isTotal(rr.getCorr().getRhs().getVertices(), rr.getMt()) ||
			!isInjective(rr.getMt()) ||
			!isSurjective(rr.getTarget().getRhs().getVertices(), rr.getMt()))
				return false;
		
		if (!isNonTerminalConsistent(nt, rr))
			return false;
		
		return true;
	}

	/**
	 * Checks if the triple rule {@code rr} is non-terminal consistent (NTC), supposing {@code rr} has bijective mappings 
	 * @param nt				The non terminal symbols of the grammar
	 * @param rr				The triple rule to test
	 * @return					True iff {@code rr} is NTC
	 */
	private static boolean isNonTerminalConsistent(final List<Symbol> nt, final TripleRule rr) {
		//If any mapping to a non-terminal has different names, then it is not NTC 
		if (rr.getCorr().getRhs().getVertices().stream()
				.anyMatch(c -> (contains(nt, rr.getMs().get(c).getLabel()) && !rr.getMs().get(c).getLabel().getName().equals(c.getLabel().getName())) 
							|| (contains(nt, rr.getMt().get(c).getLabel()) && !rr.getMt().get(c).getLabel().getName().equals(c.getLabel().getName()))))
			return false;
		
		return true;
	}

	/**
	 * Checks is a mapping is surjective
	 * @param counterDomain		The counter domain
	 * @param map				The function
	 * @return					True iff {@code map} is surjective
	 */
	private static boolean isSurjective(final List<Vertex> counterDomain, final EMap<Vertex, Vertex> map) {
		return counterDomain.stream().anyMatch(cd -> !map.containsValue(cd)) ? false : true;
	}

	/**
	 * Checks is a mapping is total
	 * @param domain			The domain
	 * @param map				The function
	 * @return					True iff {@code map} is total
	 */
	private static boolean isTotal(final List<Vertex> domain, final EMap<Vertex, Vertex> map) {
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
	public static boolean isBoundaryGraph(final Graph graph, final List<Symbol> g) {
		//if the graph has G-labeled vertices as neighbors
		if(graph.getEdges().stream()
				.anyMatch(e -> inAlphabet(g, e.getFrom().getLabel()) &&
						inAlphabet(g, e.getTo().getLabel())))
			//then it is not G-boundary
			return false;
		
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
		
		for (int i = 0; i < derivation.getSteps().size() - 1; i++) {
			DerivationStep dStep = derivation.getSteps().get(i);
			
			//Get empty zone vertices's ids (they correspond to application of empty productions)
			final Set<String> emptyZVs = dStep.getNext().getVertices().stream()
				.filter(v -> v instanceof ZoneVertex)
				.filter(zv -> ((ZoneVertex)zv).getVertices().isEmpty())
				.map(zv -> zv.getId())
				.collect(Collectors.toSet());
			
			//If this derivation step has empty zone vertices, they have to be solved in the next derivation steps
			if (!emptyZVs.isEmpty()) {
				if (!emptyZVs.contains(derivation.getSteps().get(i+1).getVertex().getId()))
					return false;
			}
		}
		
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
		if (dS.getVertex() == null || !dS.getPrevious().getVertices().stream().anyMatch(v -> v.equivalates(dS.getVertex())))
			return false;
		if (dS.getUnifier() == null || dS.getUnifier().size() != dS.getRule().getRhs().getVertices().size()
				|| !isInjective(dS.getUnifier())
				|| !isTotal(dS.getRule().getRhs().getVertices(), dS.getUnifier())
				|| !dS.getUnifier().stream().allMatch(u -> dS.getNext().getVertices().contains(u.getValue())))
			return false;
		return true;
	}

}
