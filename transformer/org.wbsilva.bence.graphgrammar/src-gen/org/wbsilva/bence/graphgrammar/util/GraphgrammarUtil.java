package org.wbsilva.bence.graphgrammar.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
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
		return anyBijectiveMapping(new ArrayList<Vertex>(0), candidates);
	}
	
	/**
	 * Return true iff the edges {@code e} and {@code f} are isomorphic. Edges are compared one-by-one according to their order.
	 * If any of them is null, return false.
	 * 
	 * @param e		One list of edges
	 * @param f		Other list of edges
	 * @return		True if the list of edges {@code e} and {@code f} are isomorphic one-by-one, false otherwise.
	 * @see Edge#compareTo(Edge)
	 */
	public static boolean isomorphicEdges(final List<Edge> e, final List<Edge> f) {
		//TODO: asserts
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
		graph.setId(EcoreUtil.generateUUID());
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
		grammar.setId(EcoreUtil.generateUUID());
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

	public static boolean isValidGrammar(final Grammar grammar) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isValidGraph(final Graph graph) {
		// TODO Auto-generated method stub
		return false;
	}

}
