package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;

class GraphImplTest {

	private static Graph g0;
	private static Graph g1;
	private static Graph g2;

	private static Vertex v0;
	private static Vertex v1;
	private static Vertex v2;
	private static Vertex v3;
	private static Vertex v4;
	
	private static Edge e2_3;
	private static Edge e4_2;
	private static Edge e3_2;
	private static Edge e3_4;
	private static Vertex v5;
	private static Vertex v6;
	private static Vertex v7;
	private static Vertex v8;
	private static Edge e6_7;
	private static Edge e7_6;
	private static Edge e7_8;
	private static Edge e8_6;
	
	@BeforeAll
	static void init() {
		g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		g1 = GraphgrammarFactory.eINSTANCE.createGraph();
		g2 = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("l1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("l2");
		Symbol la = GraphgrammarFactory.eINSTANCE.createSymbol();
		la.setName("la");
		Symbol lb = GraphgrammarFactory.eINSTANCE.createSymbol();
		lb.setName("ld");
		Symbol lc = GraphgrammarFactory.eINSTANCE.createSymbol();
		lc.setName("lc");
		Symbol ld = GraphgrammarFactory.eINSTANCE.createSymbol();
		ld.setName("ld");
		
		v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("v1");
		v1.setLabel(EcoreUtil.copy(l1));
		v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("v2");
		v2.setLabel(EcoreUtil.copy(l1));
		v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("v3");
		v3.setLabel(EcoreUtil.copy(l2));
		v4 = GraphgrammarFactory.eINSTANCE.createVertex();
		v4.setId("v4");
		v4.setLabel(EcoreUtil.copy(l2));
		
		g0.getVertices().add(v1);
		g0.getVertices().add(v2);
		g0.getVertices().add(v3);
		g0.getVertices().add(v4);
		
		e2_3 = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_3.setFrom(v2);
		e2_3.setTo(v3);
		e2_3.setLabel(EcoreUtil.copy(la));
		e3_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_2.setFrom(v3);
		e3_2.setTo(v2);
		e3_2.setLabel(EcoreUtil.copy(lb));
		e3_4 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_4.setFrom(v3);
		e3_4.setTo(v4);
		e3_4.setLabel(EcoreUtil.copy(lc));
		e4_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e4_2.setFrom(v4);
		e4_2.setTo(v2);
		e4_2.setLabel(EcoreUtil.copy(ld));
		
		g0.getEdges().add(e2_3);
		g0.getEdges().add(e3_2);
		g0.getEdges().add(e4_2);
		g0.getEdges().add(e3_4);
		
		
		/////
		v5 = GraphgrammarFactory.eINSTANCE.createVertex();
		v5.setId("v5");
		v5.setLabel(EcoreUtil.copy(l1));
		v6 = GraphgrammarFactory.eINSTANCE.createVertex();
		v6.setId("v6");
		v6.setLabel(EcoreUtil.copy(l1));
		v7 = GraphgrammarFactory.eINSTANCE.createVertex();
		v7.setId("v7");
		v7.setLabel(EcoreUtil.copy(l2));
		v8 = GraphgrammarFactory.eINSTANCE.createVertex();
		v8.setId("v8");
		v8.setLabel(EcoreUtil.copy(l2));
		
		g2.getVertices().add(v5);
		g2.getVertices().add(v6);
		g2.getVertices().add(v7);
		g2.getVertices().add(v8);
		
		e6_7 = GraphgrammarFactory.eINSTANCE.createEdge();
		e6_7.setFrom(v6);
		e6_7.setTo(v7);
		e6_7.setLabel(EcoreUtil.copy(la));
		e7_6 = GraphgrammarFactory.eINSTANCE.createEdge();
		e7_6.setFrom(v7);
		e7_6.setTo(v6);
		e7_6.setLabel(EcoreUtil.copy(lb));
		e7_8 = GraphgrammarFactory.eINSTANCE.createEdge();
		e7_8.setFrom(v7);
		e7_8.setTo(v8);
		e7_8.setLabel(EcoreUtil.copy(lc));
		e8_6 = GraphgrammarFactory.eINSTANCE.createEdge();
		e8_6.setFrom(v8);
		e8_6.setTo(v6);
		e8_6.setLabel(EcoreUtil.copy(ld));
		
		g2.getEdges().add(e6_7);
		g2.getEdges().add(e7_6);
		g2.getEdges().add(e8_6);
		g2.getEdges().add(e7_8);
	}
	
	@Test
	void testInEdgesNone() {
		assertTrue(g0.inEdges(v0).isEmpty());
		assertTrue(g0.inEdges(v1).isEmpty());
	}
	
	@Test
	void testInEdgesOne() {
		EList<Edge> in = g0.inEdges(v3);
		assertEquals(1, in.size());
		assertEquals(e2_3, in.get(0));
	}
	
	@Test
	void testInEdgesMany() {
		EList<Edge> in = g0.inEdges(v2);
		assertEquals(2, in.size());
		assertTrue(in.contains(e3_2));
		assertTrue(in.contains(e4_2));
	}
	
	@Test
	void testOutEdgesNone() {
		assertTrue(g0.outEdges(v0).isEmpty());
		assertTrue(g0.outEdges(v1).isEmpty());
	}
	
	@Test
	void testOutEdgesOne() {
		EList<Edge> in = g0.outEdges(v2);
		assertEquals(1, in.size());
		assertEquals(e2_3, in.get(0));
	}
	
	@Test
	void testOutEdgesMany() {
		EList<Edge> in = g0.outEdges(v3);
		assertEquals(2, in.size());
		assertTrue(in.contains(e3_2));
		assertTrue(in.contains(e3_4));
	}
	
	@Test
	void testNeighborhoodEmptyExtern() {
		EList<Vertex> n = g0.neighborhood(v0);
		assertTrue(n.isEmpty());
	}
	
	@Test
	void testNeighborhoodEmptyIntern() {
		EList<Vertex> n = g0.neighborhood(v1);
		assertTrue(n.isEmpty());
	}
	
	@Test
	void testNeighborhoodSimple() {
		EList<Vertex> n = g0.neighborhood(new BasicEList<Vertex>(Arrays.asList(v2)));
		assertEquals(2, n.size());
		assertTrue(n.contains(v3));
		assertTrue(n.contains(v4));
		
		n = g0.neighborhood(new BasicEList<Vertex>(Arrays.asList(v3)));
		assertEquals(2, n.size());
		assertTrue(n.contains(v2));
		assertTrue(n.contains(v4));
	}
	
	@Test
	void testNeighborhoodMany() {
		EList<Vertex> n = g0.neighborhood(new BasicEList<Vertex>(Arrays.asList(v1, v2, v3)));
		assertEquals(1, n.size());
		assertTrue(n.contains(v4));
		
		n = g0.neighborhood(new BasicEList<Vertex>(Arrays.asList(v2,v3,v4)));
		assertTrue(n.isEmpty());
	}
	
	@Test
	void testNeighborhoodManyNone() {
		EList<Vertex> n = g0.neighborhood(new BasicEList<Vertex>(Arrays.asList(v2,v3,v4)));
		assertTrue(n.isEmpty());
	}
	
	@Test
	void testIsomorphicToEmpty() {
		assertFalse(g0.isomorphicTo(g1));
		assertFalse(g1.isomorphicTo(g0));
		
		assertTrue(g0.isomorphism(g1) == null);
		assertTrue(g1.isomorphism(g0) == null);
	}
	
	@Test
	void testIsomorphicToTrue() {
		assertTrue(g0.isomorphicTo(g2));
		assertTrue(g2.isomorphicTo(g0));
		
		EMap<Vertex, Vertex> i = g0.isomorphism(g2);
		assertTrue(i != null);
		assertTrue(i.get(v1) == v5);
		assertTrue(i.get(v2) == v6);
		assertTrue(i.get(v3) == v7);
		assertTrue(i.get(v4) == v8);
		assertEquals(4, i.size());
		
		EMap<Vertex, Vertex> j = g2.isomorphism(g0);
		assertTrue(j != null);
		assertTrue(j.get(v5) == v1);
		assertTrue(j.get(v6) == v2);
		assertTrue(j.get(v7) == v3);
		assertTrue(j.get(v8) == v4);
		assertEquals(4, j.size());
	}
	
	@Test
	void testIsomorphicToTrueMultipleIsomorphisms() {
		Graph g3 = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("l1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("l2");
		
		Vertex va = GraphgrammarFactory.eINSTANCE.createVertex();
		va.setId("va");
		va.setLabel(EcoreUtil.copy(l1));
		Vertex vb = GraphgrammarFactory.eINSTANCE.createVertex();
		vb.setId("vb");
		vb.setLabel(EcoreUtil.copy(l1));
		
		g3.getVertices().add(va);
		g3.getVertices().add(vb);
		
		Edge ea_b = GraphgrammarFactory.eINSTANCE.createEdge();
		ea_b.setFrom(va);
		ea_b.setTo(vb);
		ea_b.setLabel(EcoreUtil.copy(l2));
		Edge eb_a = GraphgrammarFactory.eINSTANCE.createEdge();
		eb_a.setFrom(vb);
		eb_a.setTo(va);
		eb_a.setLabel(EcoreUtil.copy(l2));
		
		g3.getEdges().add(ea_b);
		g3.getEdges().add(eb_a);
		
		///
		
		Graph g4 = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Vertex vc = GraphgrammarFactory.eINSTANCE.createVertex();
		vc.setId("vc");
		vc.setLabel(EcoreUtil.copy(l1));
		Vertex vd = GraphgrammarFactory.eINSTANCE.createVertex();
		vd.setId("vd");
		vd.setLabel(EcoreUtil.copy(l1));
		
		g4.getVertices().add(vd);
		g4.getVertices().add(vc);
		
		Edge ec_d = GraphgrammarFactory.eINSTANCE.createEdge();
		ec_d.setFrom(vc);
		ec_d.setTo(vd);
		ec_d.setLabel(EcoreUtil.copy(l1));
		Edge ed_c = GraphgrammarFactory.eINSTANCE.createEdge();
		ed_c.setFrom(vd);
		ed_c.setTo(vc);
		ed_c.setLabel(EcoreUtil.copy(l1));
		
		g4.getEdges().add(ec_d);
		g4.getEdges().add(ed_c);
		
		assertTrue(g3.isomorphicTo(g4));
		assertTrue(g4.isomorphicTo(g3));
		
		EMap<Vertex, Vertex> i = g3.isomorphism(g4);
		assertTrue(i != null);
		assertTrue(i.get(va) == vc || i.get(va) == vd);
		assertTrue(i.get(vb) == vc || i.get(vb) == vd);
		assertEquals(2, i.size());
	}
	
	@Test
	void testIsomorphicToFalseMultipleIsomorphisms() {
		Graph g3 = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("l1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("l2");
		
		Vertex va = GraphgrammarFactory.eINSTANCE.createVertex();
		va.setId("va");
		va.setLabel(EcoreUtil.copy(l2));
		Vertex vb = GraphgrammarFactory.eINSTANCE.createVertex();
		vb.setId("vb");
		vb.setLabel(EcoreUtil.copy(l2));
		
		g3.getVertices().add(va);
		g3.getVertices().add(vb);
		
		Edge ea_b = GraphgrammarFactory.eINSTANCE.createEdge();
		ea_b.setFrom(va);
		ea_b.setTo(vb);
		ea_b.setLabel(EcoreUtil.copy(l2));
		Edge eb_a = GraphgrammarFactory.eINSTANCE.createEdge();
		eb_a.setFrom(vb);
		eb_a.setTo(va);
		eb_a.setLabel(EcoreUtil.copy(l2));
		
		g3.getEdges().add(ea_b);
		g3.getEdges().add(eb_a);
		
		///
		
		Graph g4 = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Vertex vc = GraphgrammarFactory.eINSTANCE.createVertex();
		vc.setId("vc");
		vc.setLabel(EcoreUtil.copy(l1));
		Vertex vd = GraphgrammarFactory.eINSTANCE.createVertex();
		vd.setId("vd");
		vd.setLabel(EcoreUtil.copy(l1));
		
		g4.getVertices().add(vd);
		g4.getVertices().add(vc);
		
		Edge ec_d = GraphgrammarFactory.eINSTANCE.createEdge();
		ec_d.setFrom(vc);
		ec_d.setTo(vd);
		ec_d.setLabel(EcoreUtil.copy(l1));
		Edge ed_c = GraphgrammarFactory.eINSTANCE.createEdge();
		ed_c.setFrom(vd);
		ed_c.setTo(vc);
		ed_c.setLabel(EcoreUtil.copy(l1));
		
		g4.getEdges().add(ec_d);
		g4.getEdges().add(ed_c);
		
		assertFalse(g3.isomorphicTo(g4));
		assertFalse(g4.isomorphicTo(g3));
		
		assertTrue(g3.isomorphism(g4) == null);
	}
	
	@Test
	void testIsomorphicToTrueMultipleIsomorphismsOneVertexNoEdges() {
		Graph g = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("l1");
		
		Vertex va = GraphgrammarFactory.eINSTANCE.createVertex();
		va.setId("va");
		va.setLabel(EcoreUtil.copy(l1));
		
		g.getVertices().add(va);
		
		///
		
		Graph h = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Vertex vc = GraphgrammarFactory.eINSTANCE.createVertex();
		vc.setId("vc");
		vc.setLabel(EcoreUtil.copy(l1));
		
		h.getVertices().add(vc);
		
		assertTrue(g.isomorphicTo(h));
		assertTrue(h.isomorphicTo(g));
		
		EMap<Vertex, Vertex> i = g.isomorphism(h);
		assertTrue(i != null);
		assertTrue(i.get(va) == vc);
		assertEquals(1, i.size());
	}
	
	@Test
	void testIsomorphicToTrueMultipleIsomorphismsNoEdges() {
		Graph g = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("l1");
		
		Vertex va = GraphgrammarFactory.eINSTANCE.createVertex();
		va.setId("va");
		va.setLabel(EcoreUtil.copy(l1));
		Vertex vb = GraphgrammarFactory.eINSTANCE.createVertex();
		vb.setId("vb");
		vb.setLabel(EcoreUtil.copy(l1));
		
		g.getVertices().add(va);
		g.getVertices().add(vb);
		
		///
		
		Graph h = GraphgrammarFactory.eINSTANCE.createGraph();
		
		Vertex vc = GraphgrammarFactory.eINSTANCE.createVertex();
		vc.setId("vc");
		vc.setLabel(EcoreUtil.copy(l1));
		Vertex vd = GraphgrammarFactory.eINSTANCE.createVertex();
		vd.setId("vd");
		vd.setLabel(EcoreUtil.copy(l1));
		
		h.getVertices().add(vc);
		h.getVertices().add(vd);
		
		assertTrue(g.isomorphicTo(h));
		assertTrue(h.isomorphicTo(g));
		
		EMap<Vertex, Vertex> i = g.isomorphism(h);
		assertTrue(i != null);
		assertTrue(i.get(va) == vc || i.get(va) == vd);
		assertTrue(i.get(vb) == vc || i.get(vb) == vd);
		assertEquals(2, i.size());
	}

}
