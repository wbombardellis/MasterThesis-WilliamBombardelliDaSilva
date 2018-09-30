package org.wbsilva.bence.graphgrammar.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
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
		
		assertFalse(GraphgrammarUtil.isomorphicEdges(l0, l1));
	}
	
	@Test
	void testAnyBijectiveMappingOneTrivial() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates).isPresent());
	}
	
	@Test
	void testAnyBijectiveMappingManyTrivial() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0)));
		candidates.add(1, new HashSet<Vertex>(Arrays.asList(v1)));
		candidates.add(2, new HashSet<Vertex>(Arrays.asList(v2)));
		candidates.add(3, new HashSet<Vertex>(Arrays.asList(v3)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates).isPresent());
	}
	
	@Test
	void testAnyBijectiveMappingManyNoConstraints() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(1, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(2, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(3, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates).isPresent());
	}
	
	@Test
	void testAnyBijectiveMappingManyWithConstraints() {
		List<Set<Vertex>> candidates = new ArrayList<Set<Vertex>>();
		candidates.add(0, new HashSet<Vertex>(Arrays.asList(v0, v1, v2, v3)));
		candidates.add(1, new HashSet<Vertex>(Arrays.asList(v0)));
		candidates.add(2, new HashSet<Vertex>(Arrays.asList(v0, v2)));
		candidates.add(3, new HashSet<Vertex>(Arrays.asList(v3, v0)));
		
		assertTrue(GraphgrammarUtil.anyBijectiveMapping(candidates).isPresent());
	}
	
	@Test
	void testDistanceEmpty() {
		Graph g = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Map<String, Map<String, Integer>> d = GraphgrammarUtil.distance(g);
		assertEquals(0, d.size());
	}
	
	@Test
	void testDistanceWithOneVertex() {
		Graph g = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex gv0 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv0.setId("v0");
		g.getVertices().add(gv0);
		
		Map<String, Map<String, Integer>> d = GraphgrammarUtil.distance(g);
		assertEquals(1, d.size());
		assertEquals(new Integer(0), d.get(gv0.getId()).get(gv0.getId()));
	}
	
	@Test
	void testDistanceWithMoreVertices() {
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		
		Graph g = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex gv0 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv0.setId("v0");
		gv0.setLabel(EcoreUtil.copy(l));
		Vertex gv1 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv1.setId("v1");
		gv1.setLabel(EcoreUtil.copy(l));
		Vertex gv2 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv2.setId("v2");
		gv2.setLabel(EcoreUtil.copy(l));
		Vertex gv3 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv3.setId("v3");
		gv3.setLabel(EcoreUtil.copy(l));
		Vertex gv4 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv4.setId("v4");
		gv4.setLabel(EcoreUtil.copy(l));
		
		Edge e0_1 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_1.setFrom(gv0);
		e0_1.setTo(gv1);
		e0_1.setLabel(EcoreUtil.copy(l));
		Edge e0_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_2.setFrom(gv0);
		e0_2.setTo(gv2);
		e0_2.setLabel(EcoreUtil.copy(l));
		Edge e1_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1_2.setFrom(gv1);
		e1_2.setTo(gv2);
		e1_2.setLabel(EcoreUtil.copy(l));
		Edge e2_3 = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_3.setFrom(gv2);
		e2_3.setTo(gv3);
		e2_3.setLabel(EcoreUtil.copy(l));
		Edge e3_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_2.setFrom(gv3);
		e3_2.setTo(gv2);
		e3_2.setLabel(EcoreUtil.copy(l));
		Edge e3_4 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_4.setFrom(gv3);
		e3_4.setTo(gv4);
		e3_4.setLabel(EcoreUtil.copy(l));
		
		g.getVertices().add(gv0);
		g.getVertices().add(gv1);
		g.getVertices().add(gv2);
		g.getVertices().add(gv3);
		g.getVertices().add(gv4);
		
		g.getEdges().add(e0_1);
		g.getEdges().add(e0_2);
		g.getEdges().add(e1_2);
		g.getEdges().add(e2_3);
		g.getEdges().add(e3_2);
		g.getEdges().add(e3_4);
		
		Map<String, Map<String, Integer>> d = GraphgrammarUtil.distance(g);
		assertEquals(g.getVertices().size(), d.size());
		assertEquals(new Integer(1), d.get(gv0.getId()).get(gv1.getId()));
		assertEquals(new Integer(1), d.get(gv0.getId()).get(gv2.getId()));
		assertEquals(null, d.get(gv0.getId()).get(gv4.getId()));
		assertEquals(new Integer(3), d.get(gv1.getId()).get(gv3.getId()));
		assertEquals(new Integer(1), d.get(gv2.getId()).get(gv1.getId()));
		
		
	}
}
