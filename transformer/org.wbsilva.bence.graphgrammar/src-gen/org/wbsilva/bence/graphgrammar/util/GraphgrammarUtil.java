package org.wbsilva.bence.graphgrammar.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class GraphgrammarUtil {

	public static boolean anyBijectiveMapping(final List<Set<Vertex>> candidates) {
		return anyBijectiveMapping(new ArrayList<Vertex>(0), candidates);
	}
	
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

	public static void ensureUniqueIds(Graph graph) {
		graph.setId(EcoreUtil.generateUUID());
		for (Vertex v : graph.getVertices()) {
			v.setId(EcoreUtil.generateUUID());
		}
	}
	
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
			
			r.getSource().getRhs().setId(EcoreUtil.generateUUID());
			for (Vertex v : r.getSource().getRhs().getVertices()) {
				v.setId(EcoreUtil.generateUUID());
			}
			r.getCorr().getRhs().setId(EcoreUtil.generateUUID());
			for (Vertex v : r.getCorr().getRhs().getVertices()) {
				v.setId(EcoreUtil.generateUUID());
			}
			r.getTarget().getRhs().setId(EcoreUtil.generateUUID());
			for (Vertex v : r.getTarget().getRhs().getVertices()) {
				v.setId(EcoreUtil.generateUUID());
			}
		}
	}
}
