package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.Vertex;

class GrammarImplTest {

	static private Grammar gg0;
	static private Rule r0;
	private static Symbol sR;
	private static Symbol sT;
	private static Symbol sM;
	private static Symbol sU;
	private static Symbol sF;
	private static Symbol s1;
	private static Symbol s2;
	private static Edge ea_c;
	private static Edge ea_b;
	private static Edge eb_d;
	private static Vertex va;
	private static Vertex vb;
	private static Vertex vc;
	private static Vertex vd;

	@BeforeAll
	static void init() {
		gg0 = GraphgrammarFactory.eINSTANCE.createGrammar();
		r0 = GraphgrammarFactory.eINSTANCE.createRule();
		
		sR = GraphgrammarFactory.eINSTANCE.createSymbol();
		sR.setName("R");
		sT = GraphgrammarFactory.eINSTANCE.createSymbol();
		sT.setName("t");
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
		
		gg0.getAlphabet().add(sR);
		gg0.getAlphabet().add(sT);
		gg0.getAlphabet().add(sF);
		gg0.getAlphabet().add(sM);
		gg0.getAlphabet().add(sU);
		gg0.getAlphabet().add(s1);
		gg0.getAlphabet().add(s2);
		gg0.getNonterminals().add(sR);
		gg0.getTerminals().add(sT);
		gg0.getTerminals().add(sF);
		gg0.getTerminals().add(sM);
		gg0.getTerminals().add(sU);
		gg0.getTerminals().add(s1);
		gg0.getTerminals().add(s2);
		
		gg0.setInitial(sR);
		

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
		
		gg0.getRules().add(r0);
	}
	
	@Test
	void testDerivesNull() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Graph h0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setLabel(EcoreUtil.copy(s1));
		Graph i0 = GraphgrammarFactory.eINSTANCE.createGraph();
		
		assertEquals(null, gg0.derives(g0, h0, v0, i0));
	}
	
	@Test
	void testDerivesTrue() {
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
		
		///		
		Graph i0 = EcoreUtil.copy(h0);
		//EMap<Vertex, Vertex> un = r0.apply(h0, v0, true);
		
		Graph rhs = EcoreUtil.copy(r0.getRhs());
		Vertex hva = EcoreUtil.copy(va);
		Vertex hvb = EcoreUtil.copy(vb);
		Vertex hvc = EcoreUtil.copy(vc);
		Vertex hvd = EcoreUtil.copy(vd);
		h0.getVertices().add(hva);
		h0.getVertices().add(hvb);
		h0.getVertices().add(hvc);
		h0.getVertices().add(hvd);
		h0.getVertices().remove(v0);
			
		Edge hea_b = GraphgrammarFactory.eINSTANCE.createEdge();
		hea_b.setFrom(hva);
		hea_b.setTo(hvb);
		hea_b.setLabel(EcoreUtil.copy(sT));
		Edge hea_c = GraphgrammarFactory.eINSTANCE.createEdge();
		hea_c.setFrom(hva);
		hea_c.setTo(hvc);
		hea_c.setLabel(EcoreUtil.copy(sT));
		Edge heb_d = GraphgrammarFactory.eINSTANCE.createEdge();
		heb_d.setFrom(hvb);
		heb_d.setTo(hvd);
		heb_d.setLabel(EcoreUtil.copy(sT));
		Edge hea_9 = GraphgrammarFactory.eINSTANCE.createEdge();
		hea_9.setFrom(hva);
		hea_9.setTo(v9);
		hea_9.setLabel(EcoreUtil.copy(sF));
		Edge heb_9F = GraphgrammarFactory.eINSTANCE.createEdge();
		heb_9F.setFrom(hvb);
		heb_9F.setTo(v9);
		heb_9F.setLabel(EcoreUtil.copy(sF));
		Edge heb_9M = GraphgrammarFactory.eINSTANCE.createEdge();
		heb_9M.setFrom(hvb);
		heb_9M.setTo(v9);
		heb_9M.setLabel(EcoreUtil.copy(sM));
		Edge he8_b = GraphgrammarFactory.eINSTANCE.createEdge();
		he8_b.setFrom(v8);
		he8_b.setTo(hvb);
		he8_b.setLabel(EcoreUtil.copy(sM));
		Edge hec_7 = GraphgrammarFactory.eINSTANCE.createEdge();
		hec_7.setFrom(hvc);
		hec_7.setTo(v7);
		hec_7.setLabel(EcoreUtil.copy(sU));
		
		h0.getEdges().clear();
		h0.getEdges().add(hea_b);
		h0.getEdges().add(hea_c);
		h0.getEdges().add(heb_d);
		h0.getEdges().add(hea_9);
		h0.getEdges().add(heb_9F);
		h0.getEdges().add(heb_9M);
		h0.getEdges().add(he8_b);
		h0.getEdges().add(hec_7);
		
		////
		
		DerivationStep dStep = gg0.derives(i0, h0, v0, rhs);
		
		assertTrue(dStep != null);
		assertTrue(EcoreUtil.equals(i0 , dStep.getPrevious()));
		assertTrue(dStep.getNext().isomorphicTo(h0));
		assertTrue(EcoreUtil.equals(v0 , dStep.getVertex()));
		assertTrue(EcoreUtil.equals(r0 , dStep.getRule()));

		assertEquals(4, dStep.getUnifier().size());
		assertEquals(4, dStep.getUnifier().values().stream().distinct().count());
		assertTrue(dStep.getRule().getRhs().getVertices().stream()
					.allMatch(v -> dStep.getNext().getVertices().contains(dStep.getUnifier().get(v))));
	}

}

