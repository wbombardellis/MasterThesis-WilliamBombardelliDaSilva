package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.VertexLabelPair;

class RuleImplTest {

	static private Rule r0;
	private static Symbol sR;
	private static Symbol sT;
	private static Symbol sM;
	private static Symbol sU;
	private static Symbol sF;
	private static Edge ea_c;
	private static Edge ea_b;
	private static Edge eb_d;
	private static Symbol s1;
	private static Symbol s2;
	private static Vertex va;
	private static Vertex vb;
	private static Vertex vc;
	private static Vertex vd;
	
	@BeforeAll
	static void init() {
		r0 = GraphgrammarFactory.eINSTANCE.createRule();
		sR = GraphgrammarFactory.eINSTANCE.createSymbol();
		sR.setName("R");
		sT = GraphgrammarFactory.eINSTANCE.createSymbol();
		sT.setName("T");
		sF = GraphgrammarFactory.eINSTANCE.createSymbol();
		sF.setName("f");
		sM = GraphgrammarFactory.eINSTANCE.createSymbol();
		sM.setName("m");
		sU = GraphgrammarFactory.eINSTANCE.createSymbol();
		sU.setName("u");
		
		s1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s1.setName("1");
		s2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s2.setName("2");
		
		
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		va = GraphgrammarFactory.eINSTANCE.createVertex();
		va.setId("va");
		va.setLabel(EcoreUtil.copy(sT));
		vb = GraphgrammarFactory.eINSTANCE.createVertex();
		vb.setId("vb");
		vb.setLabel(EcoreUtil.copy(sT));
		vc = GraphgrammarFactory.eINSTANCE.createVertex();
		vc.setId("vc");
		vc.setLabel(EcoreUtil.copy(sT));
		vd = GraphgrammarFactory.eINSTANCE.createVertex();
		vd.setId("vd");
		vd.setLabel(EcoreUtil.copy(sT));
		
		g0.getVertices().add(va);
		g0.getVertices().add(vb);
		g0.getVertices().add(vc);
		g0.getVertices().add(vd);
		
		ea_b = GraphgrammarFactory.eINSTANCE.createEdge();
		ea_b.setFrom(va);
		ea_b.setTo(vb);
		ea_b.setLabel(EcoreUtil.copy(sT));
		ea_c = GraphgrammarFactory.eINSTANCE.createEdge();
		ea_c.setFrom(va);
		ea_c.setTo(vc);
		ea_c.setLabel(EcoreUtil.copy(sT));
		eb_d = GraphgrammarFactory.eINSTANCE.createEdge();
		eb_d.setFrom(vb);
		eb_d.setTo(vd);
		eb_d.setLabel(EcoreUtil.copy(sT));
		
		g0.getEdges().add(ea_b);
		g0.getEdges().add(ea_c);
		g0.getEdges().add(eb_d);
		
		r0.setId("r0");
		r0.setLhs(EcoreUtil.copy(sR));
		r0.setRhs(g0);
		
		SymbolSymbolsPair kva0 = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		kva0.setEdgeLabel(EcoreUtil.copy(sF));
		kva0.getVertexLabels().add(EcoreUtil.copy(s1));
		
		SymbolSymbolsPair kvb0 = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		kvb0.setEdgeLabel(EcoreUtil.copy(sF));
		kvb0.getVertexLabels().add(EcoreUtil.copy(s1));
		SymbolSymbolsPair kvb1 = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		kvb1.setEdgeLabel(EcoreUtil.copy(sM));
		kvb1.getVertexLabels().add(EcoreUtil.copy(s1));
		kvb1.getVertexLabels().add(EcoreUtil.copy(s2));
		SymbolSymbolsPair kvc0 = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		kvc0.setEdgeLabel(EcoreUtil.copy(sU));
		kvc0.getVertexLabels().add(EcoreUtil.copy(sR));
		kvc0.getVertexLabels().add(EcoreUtil.copy(sT));
		
		r0.getEmbedding().put(va, new BasicEList<SymbolSymbolsPair>(Arrays.asList(kva0)));
		r0.getEmbedding().put(vb, new BasicEList<SymbolSymbolsPair>(Arrays.asList(kvb0, kvb1)));
		r0.getEmbedding().put(vc, new BasicEList<SymbolSymbolsPair>(Arrays.asList(kvc0))); 
	}

	@Test
	void testEmbedEmpty() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		
		Vertex v9 = GraphgrammarFactory.eINSTANCE.createVertex();
		v9.setId("9");
		v9.setLabel(EcoreUtil.copy(sT));
		
		h0.getVertices().add(v9);
		
		BasicEMap<Vertex, Vertex> un0 = new BasicEMap<Vertex, Vertex>();
		un0.put(va, v9);
		un0.put(vb, v9);
		un0.put(vc, v9);
		un0.put(vd, v9);
		
		EList<Edge> fs0 = r0.embed(h0, v0, new BasicEList<Edge>(), un0);
		assertTrue(fs0.isEmpty());
	}
	
	@Test
	void testEmbedOneEmptyWithEdge() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("1");
		v1.setLabel(EcoreUtil.copy(sT));
		Vertex v9 = GraphgrammarFactory.eINSTANCE.createVertex();
		v9.setId("9");
		v9.setLabel(EcoreUtil.copy(sR));
		
		//h0.getVertices().add(v0);
		h0.getVertices().add(v1);
		h0.getVertices().add(v9);
		
		Edge e0_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_9.setFrom(v0);
		e0_9.setTo(v9);
		e0_9.setLabel(EcoreUtil.copy(sT));
		
		//h0.getEdges().add(e0_9);
		
		BasicEList<Edge> es0 = new BasicEList<Edge>();
		es0.add(e0_9);
		
		BasicEMap<Vertex, Vertex> un0 = new BasicEMap<Vertex, Vertex>();
		un0.put(va, v1);
		un0.put(vb, v1);
		un0.put(vc, v1);
		un0.put(vd, v1);
		
		EList<Edge> fs0 = r0.embed(h0, v0, es0, un0);
		assertTrue(fs0.isEmpty());
	}
	
	@Test
	void testEmbedOneNonEmptyWithEdge() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("1");
		v1.setLabel(EcoreUtil.copy(sT));
		Vertex v9 = GraphgrammarFactory.eINSTANCE.createVertex();
		v9.setId("9");
		v9.setLabel(EcoreUtil.copy(s1));
		
		//h0.getVertices().add(v0);
		h0.getVertices().add(v1);
		h0.getVertices().add(v9);
		
		Edge e0_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_9.setFrom(v0);
		e0_9.setTo(v9);
		e0_9.setLabel(EcoreUtil.copy(sF));
		
		//h0.getEdges().add(e0_9);
		
		BasicEList<Edge> es0 = new BasicEList<Edge>();
		es0.add(e0_9);
		
		BasicEMap<Vertex, Vertex> un0 = new BasicEMap<Vertex, Vertex>();
		un0.put(va, v1);
		un0.put(vb, v1);
		un0.put(vc, v1);
		un0.put(vd, v1);
		
		EList<Edge> fs0 = r0.embed(h0, v0, es0, un0);
		assertEquals(2, fs0.size());
		
		Edge e1_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1_9.setFrom(v1);
		e1_9.setTo(v9);
		e1_9.setLabel(EcoreUtil.copy(sF));
		
		assertTrue(EcoreUtil.equals(e1_9, fs0.get(0)));
		assertTrue(EcoreUtil.equals(e1_9, fs0.get(1)));
	}
	
	@Test
	void testEmbedManyNonEmptyWithEdge() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("1");
		v1.setLabel(EcoreUtil.copy(sT));
		Vertex v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("2");
		v2.setLabel(EcoreUtil.copy(sT));
		Vertex v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("3");
		v3.setLabel(EcoreUtil.copy(sT));
		Vertex v4 = GraphgrammarFactory.eINSTANCE.createVertex();
		v4.setId("4");
		v4.setLabel(EcoreUtil.copy(sT));
		
		Vertex v9 = GraphgrammarFactory.eINSTANCE.createVertex();
		v9.setId("9");
		v9.setLabel(EcoreUtil.copy(s1));
		Vertex v8 = GraphgrammarFactory.eINSTANCE.createVertex();
		v8.setId("8");
		v8.setLabel(EcoreUtil.copy(s2));
		Vertex v7 = GraphgrammarFactory.eINSTANCE.createVertex();
		v7.setId("7");
		v7.setLabel(EcoreUtil.copy(sT));
		
		//h0.getVertices().add(v0);
		h0.getVertices().add(v1);
		h0.getVertices().add(v2);
		h0.getVertices().add(v3);
		h0.getVertices().add(v4);
		
		h0.getVertices().add(v9);
		h0.getVertices().add(v8);
		h0.getVertices().add(v7);
		
		Edge e0_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_9.setFrom(v0);
		e0_9.setTo(v9);
		e0_9.setLabel(EcoreUtil.copy(sF));
		Edge e0_9M = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_9M.setFrom(v0);
		e0_9M.setTo(v9);
		e0_9M.setLabel(EcoreUtil.copy(sM));
		Edge e8_0 = GraphgrammarFactory.eINSTANCE.createEdge();
		e8_0.setFrom(v8);
		e8_0.setTo(v0);
		e8_0.setLabel(EcoreUtil.copy(sM));
		Edge e0_7 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_7.setFrom(v0);
		e0_7.setTo(v7);
		e0_7.setLabel(EcoreUtil.copy(sU));
		
		/*h0.getEdges().add(e0_9);
		h0.getEdges().add(e0_9M);
		h0.getEdges().add(e8_0);
		h0.getEdges().add(e0_7);*/
		
		BasicEList<Edge> es0 = new BasicEList<Edge>();
		es0.add(e0_9);
		es0.add(e0_9M);
		es0.add(e8_0);
		es0.add(e0_7);
		
		BasicEMap<Vertex, Vertex> un0 = new BasicEMap<Vertex, Vertex>();
		un0.put(va, v1);
		un0.put(vb, v2);
		un0.put(vc, v3);
		un0.put(vd, v4);
		
		EList<Edge> fs0 = r0.embed(h0, v0, es0, un0);
		assertEquals(5, fs0.size());
		
		Edge e1_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1_9.setFrom(v1);
		e1_9.setTo(v9);
		e1_9.setLabel(EcoreUtil.copy(sF));
		Edge e2_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_9.setFrom(v2);
		e2_9.setTo(v9);
		e2_9.setLabel(EcoreUtil.copy(sF));
		Edge e2_9M = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_9M.setFrom(v2);
		e2_9M.setTo(v9);
		e2_9M.setLabel(EcoreUtil.copy(sM));
		Edge e8_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e8_2.setFrom(v8);
		e8_2.setTo(v2);
		e8_2.setLabel(EcoreUtil.copy(sM));
		Edge e3_7 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_7.setFrom(v3);
		e3_7.setTo(v7);
		e3_7.setLabel(EcoreUtil.copy(sU));
		
		assertTrue(fs0.stream().allMatch(f -> EcoreUtil.equals(e1_9, f) || EcoreUtil.equals(e2_9, f) ||
				 EcoreUtil.equals(e2_9M, f) || EcoreUtil.equals(e8_2, f) || EcoreUtil.equals(e3_7, f)));
	}
	
	@Test
	void testApplyEmpty() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		
		Graph i0 = EcoreUtil.copy(h0);
		EMap<Vertex, Vertex> un = r0.apply(i0, v0);
		assertTrue(un.isEmpty());
		assertTrue(EcoreUtil.equals(h0, i0));
	}
	
	@Test
	void testApplyOne() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		
		h0.getVertices().add(v0);
		
		EMap<Vertex, Vertex> un = r0.apply(h0, v0);
		assertEquals(4, un.size());
		assertEquals(4, un.values().stream().distinct().count());
		assertTrue(r0.getRhs().getVertices().stream()
					.allMatch(v -> h0.getVertices().contains(un.get(v))));

		assertTrue(h0.isomorphicTo(r0.getRhs()));
	}
	
	@Test
	void testApplyOneWithNeighbors() {
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		v0.setLabel(EcoreUtil.copy(sR));
		
		Vertex v9 = GraphgrammarFactory.eINSTANCE.createVertex();
		v9.setId("9");
		v9.setLabel(EcoreUtil.copy(s1));
		Vertex v8 = GraphgrammarFactory.eINSTANCE.createVertex();
		v8.setId("8");
		v8.setLabel(EcoreUtil.copy(s2));
		Vertex v7 = GraphgrammarFactory.eINSTANCE.createVertex();
		v7.setId("7");
		v7.setLabel(EcoreUtil.copy(sT));
		
		h0.getVertices().add(v0);
		h0.getVertices().add(v9);
		h0.getVertices().add(v8);
		h0.getVertices().add(v7);
		
		Edge e0_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_9.setFrom(v0);
		e0_9.setTo(v9);
		e0_9.setLabel(EcoreUtil.copy(sF));
		Edge e0_9M = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_9M.setFrom(v0);
		e0_9M.setTo(v9);
		e0_9M.setLabel(EcoreUtil.copy(sM));
		Edge e8_0 = GraphgrammarFactory.eINSTANCE.createEdge();
		e8_0.setFrom(v8);
		e8_0.setTo(v0);
		e8_0.setLabel(EcoreUtil.copy(sM));
		Edge e0_7 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_7.setFrom(v0);
		e0_7.setTo(v7);
		e0_7.setLabel(EcoreUtil.copy(sU));
		
		h0.getEdges().add(e0_9);
		h0.getEdges().add(e0_9M);
		h0.getEdges().add(e8_0);
		h0.getEdges().add(e0_7);
		
		Graph i0 = EcoreUtil.copy(h0);
		
		EMap<Vertex, Vertex> un = r0.apply(h0, v0);
		assertEquals(4, un.size());
		assertEquals(4, un.values().stream().distinct().count());
		assertTrue(r0.getRhs().getVertices().stream()
					.allMatch(v -> h0.getVertices().contains(un.get(v))));
		
		
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("1");
		v1.setLabel(EcoreUtil.copy(sT));
		Vertex v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("2");
		v2.setLabel(EcoreUtil.copy(sT));
		Vertex v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("3");
		v3.setLabel(EcoreUtil.copy(sT));
		Vertex v4 = GraphgrammarFactory.eINSTANCE.createVertex();
		v4.setId("4");
		v4.setLabel(EcoreUtil.copy(sT));
		
		Vertex vv0 = i0.getVertices().stream().filter(v -> v.getId().equals("0")).findAny().orElse(null);
		Vertex vv7 = i0.getVertices().stream().filter(v -> v.getId().equals("7")).findAny().orElse(null);
		Vertex vv8 = i0.getVertices().stream().filter(v -> v.getId().equals("8")).findAny().orElse(null);
		Vertex vv9 = i0.getVertices().stream().filter(v -> v.getId().equals("9")).findAny().orElse(null);
		
		Edge e1_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1_9.setFrom(v1);
		e1_9.setTo(vv9);
		e1_9.setLabel(EcoreUtil.copy(sF));
		Edge e2_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_9.setFrom(v2);
		e2_9.setTo(vv9);
		e2_9.setLabel(EcoreUtil.copy(sF));
		Edge e2_9M = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_9M.setFrom(v2);
		e2_9M.setTo(vv9);
		e2_9M.setLabel(EcoreUtil.copy(sM));
		Edge e8_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e8_2.setFrom(vv8);
		e8_2.setTo(v2);
		e8_2.setLabel(EcoreUtil.copy(sM));
		Edge e3_7 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_7.setFrom(v3);
		e3_7.setTo(vv7);
		e3_7.setLabel(EcoreUtil.copy(sU));
		
		Edge e1_2 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1_2.setFrom(v1);
		e1_2.setTo(v2);
		e1_2.setLabel(EcoreUtil.copy(sT));
		Edge e1_3 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1_3.setFrom(v1);
		e1_3.setTo(v3);
		e1_3.setLabel(EcoreUtil.copy(sT));
		Edge e2_4 = GraphgrammarFactory.eINSTANCE.createEdge();
		e2_4.setFrom(v2);
		e2_4.setTo(v4);
		e2_4.setLabel(EcoreUtil.copy(sT));
		
		
		i0.getVertices().remove(vv0);
		i0.getVertices().add(v1);
		i0.getVertices().add(v2);
		i0.getVertices().add(v3);
		i0.getVertices().add(v4);
		
		i0.getEdges().removeAll(i0.getEdges().stream().filter(e -> e.getFrom() == vv0 || e.getTo() == vv0).collect(Collectors.toList()));
		i0.getEdges().add(e1_9);
		i0.getEdges().add(e2_9);
		i0.getEdges().add(e2_9M);
		i0.getEdges().add(e8_2);
		i0.getEdges().add(e3_7);
		i0.getEdges().add(e1_2);
		i0.getEdges().add(e1_3);
		i0.getEdges().add(e2_4);
		
		assertTrue(h0.isomorphicTo(i0));
	}

}
