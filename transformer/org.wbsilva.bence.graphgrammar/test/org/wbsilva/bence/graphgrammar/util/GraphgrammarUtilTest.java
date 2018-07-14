package org.wbsilva.bence.graphgrammar.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;

class GraphgrammarUtilTest {
	
	private static Edge e0;
	private static Edge e00;
	private static Edge e1;
	private static Vertex v0;
	private static Vertex v1;
	private static Vertex v2;
	private static Vertex v3;

	@BeforeAll
	static void init() {
		e0 = GraphgrammarFactory.eINSTANCE.createEdge();
		e00 = GraphgrammarFactory.eINSTANCE.createEdge();
		
		e1 = GraphgrammarFactory.eINSTANCE.createEdge();
		
		Symbol s0 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s0.setName("e0");
		Symbol s1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s1.setName("a");
		Symbol s2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s2.setName("b");
		
		v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(s1);
		
		v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("1");
		v1.setLabel(s2);
		
		e0.setLabel(s0);
		e0.setFrom(v0);
		e0.setTo(v1);
		
		
		v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("2");
		v2.setLabel(EcoreUtil.copy(s1));
		
		v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("3");
		v3.setLabel(EcoreUtil.copy(s2));
		
		e00.setLabel(EcoreUtil.copy(s0));
		e00.setFrom(v2);
		e00.setTo(v3);
		
		
		Vertex v4 = GraphgrammarFactory.eINSTANCE.createVertex();
		v4.setId("4");
		v4.setLabel(EcoreUtil.copy(s1));
		
		Vertex v5 = GraphgrammarFactory.eINSTANCE.createVertex();
		v5.setId("5");
		v5.setLabel(EcoreUtil.copy(s1));
		
		e1.setLabel(EcoreUtil.copy(s0));
		e1.setFrom(v4);
		e1.setTo(v5);
	}

	@Test
	void testIsomorphicEdgesNull() {
		assertFalse(GraphgrammarUtil.isomorphicEdges(null, null));
	}
	
	@Test
	void testIsomorphicEdgesEmpty() {
		assertTrue(GraphgrammarUtil.isomorphicEdges(new ArrayList<Edge>(), new ArrayList<Edge>()));
	}
	
	@Test
	void testIsomorphicEdgesDifferentSizesEmpty() {
		ArrayList<Edge> l0 = new ArrayList<Edge>(); 
		l0.add(e0);
		
		assertFalse(GraphgrammarUtil.isomorphicEdges(l0, new ArrayList<Edge>()));
	}
	
	@Test
	void testIsomorphicEdgesDifferentSizes() {
		ArrayList<Edge> l0 = new ArrayList<Edge>(); 
		l0.add(e0);
		
		ArrayList<Edge> l1 = new ArrayList<Edge>(); 
		l1.add(e0);
		l1.add(e00);
		
		assertFalse(GraphgrammarUtil.isomorphicEdges(l0, l1));
	}
	
	@Test
	void testIsomorphicOneEqual() {
		ArrayList<Edge> l0 = new ArrayList<Edge>(); 
		l0.add(e0);
		
		ArrayList<Edge> l1 = new ArrayList<Edge>(); 
		l1.add(e0);
		
		assertTrue(GraphgrammarUtil.isomorphicEdges(l0, l1));
	}
	
	@Test
	void testIsomorphicOneIsomorphic() {
		ArrayList<Edge> l0 = new ArrayList<Edge>(); 
		l0.add(e0);
		
		ArrayList<Edge> l1 = new ArrayList<Edge>(); 
		l1.add(e00);
		
		assertTrue(GraphgrammarUtil.isomorphicEdges(l0, l1));
	}
	
	@Test
	void testIsomorphicOneNotIsomorphic() {
		ArrayList<Edge> l0 = new ArrayList<Edge>(); 
		l0.add(e0);
		
		ArrayList<Edge> l1 = new ArrayList<Edge>(); 
		l1.add(e1);
		
		assertTrue(GraphgrammarUtil.isomorphicEdges(l0, l1));
	}
	
	@Test
	void testAnyBijectiveMappingOneTrivial() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates));
	}
	
	@Test
	void testAnyBijectiveMappingManyTrivial() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0)));
		candidates.add(1, new HashSet<Vertex>(Arrays.asList(v1)));
		candidates.add(2, new HashSet<Vertex>(Arrays.asList(v2)));
		candidates.add(3, new HashSet<Vertex>(Arrays.asList(v3)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates));
	}
	
	@Test
	void testAnyBijectiveMappingManyNoConstraints() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(1, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(2, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(3, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates));
	}
	
	@Test
	void testAnyBijectiveMappingManyWithConstraints() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(1, new HashSet<Vertex>(Arrays.asList(v0)));
		candidates.add(2, new HashSet<Vertex>(Arrays.asList(v0, v2)));
		candidates.add(3, new HashSet<Vertex>(Arrays.asList(v3, v0)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates));
	}


}
