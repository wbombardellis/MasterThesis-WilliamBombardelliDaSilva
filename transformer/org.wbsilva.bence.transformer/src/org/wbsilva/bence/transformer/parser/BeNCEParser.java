package org.wbsilva.bence.transformer.parser;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class BeNCEParser {
	
	final Grammar grammar;
	
	public BeNCEParser(final Grammar grammar){
		this.grammar = grammar;
	}
	
	/**
	 * TODO
	 * @param graph
	 * @return
	 */
	public Derivation parse(final Graph graph){
		assert graph != null;
		
		final EList<Symbol> alphabet = grammar.getAlphabet();
		
		//Create bottom-up parse set
		Set<ZoneVertex> bup = graph.getVertices().stream()
			.map((Vertex v) -> {
				final ZoneVertex z = GraphgrammarFactory.eINSTANCE.createZoneVertex();
				z.getVertices().add(EcoreUtil.copy(v));
				return z;
			})
			.collect(Collectors.toSet());
		
		//TODO: return case that graph is empty (or invalid)
		
		Set<Set<Vertex>> bups = powerset(bup);
		
		//Bottom-up loop to create all possible derivations
		do {
			//Select a handle
			Set<ZoneVertex> handle = selectAnyBup(bups);
			//TODO: remove it from bups
			
			for (final Symbol d : alphabet) {
				final Graph handleGraph = zoneGraph(handle);
				final Graph rhs = induce(handleGraph, handle);
				
				final ZoneVertex lhs = contract(d, handle);
				final Graph reducedGraph = zoneGraph(new HashSet<ZoneVertex>(Arrays.asList(lhs)));
				
				//if handle can be reduced with rule (lhs -> rhs). I.e. if derivedGraph=>handleGraph
				if (grammar.derives(reducedGraph, handleGraph, lhs, rhs)) {
					//possible derivation step found
					bup.add(lhs);
					//TODO update bups
				}
			}
		} while(!bups.isEmpty());
		
		final ZoneVertex rootZV = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		rootZV.setLabel(grammar.getInitial());
		rootZV.getVertices().addAll(graph.getVertices());
		
		bup.contains(rootZV); //TODO: compare with equals?

		return null;
	}

	private Set<Set<Vertex>> powerset(Set<ZoneVertex> bup) {
		// TODO Auto-generated method stub
		return null;
	}

	private Graph zoneGraph(Set<ZoneVertex> handle) {
		// TODO Auto-generated method stub
		return null;
	}

	private Graph induce(Graph handleGraph, Set<ZoneVertex> handle) {
		// TODO Auto-generated method stub
		return null;
	}

	private ZoneVertex contract(final Symbol label, final Set<ZoneVertex> zoneVertexes) {
		ZoneVertex zone = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		zone.setLabel(EcoreUtil.copy(label));
		//TODO copy vertices
		zone.getVertices();
		return zone;
	}

	private Set<ZoneVertex> selectAnyBup(Set<Set<Vertex>> bups) {
		// TODO Auto-generated method stub
		return null;
	}
}
