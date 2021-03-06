package org.wbsilva.bence.graphgrammar.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
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

class NPUtilTest {

	private static Symbol lS;
	private static Symbol lA;
	private static Symbol ln;
	private static Symbol lm;
	private static Symbol l1;
	private static Symbol l2;
	private static Symbol lB;
	private static Symbol lC;
	private static Vertex v00;
	private static Vertex v01;
	private static Graph g0;
	private static Rule r0;
	private static Vertex v02;
	private static Rule r1;
	private static Graph g1;
	private static Vertex v03;
	private static Vertex v04;
	private static Graph g2;
	private static Rule r2;
	private static Vertex v05;
	private static Graph g3;
	private static Rule r3;
	private static Grammar gg0;
	private static Graph g4;
	private static Rule r4;
	private static Vertex v06;
	private static Vertex v07;
	private static Vertex v08;
	private static Graph g5;
	private static Rule r5;

	@BeforeAll
	static void init() {
		lS = GraphgrammarFactory.eINSTANCE.createSymbol();
		lS.setName("S");
		lA = GraphgrammarFactory.eINSTANCE.createSymbol();
		lA.setName("A");
		ln = GraphgrammarFactory.eINSTANCE.createSymbol();
		ln.setName("n");
		lm = GraphgrammarFactory.eINSTANCE.createSymbol();
		lm.setName("m");
		l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("1");
		l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("2");
		lB = GraphgrammarFactory.eINSTANCE.createSymbol();
		lB.setName("B");
		lC = GraphgrammarFactory.eINSTANCE.createSymbol();
		lC.setName("C");
		
		v00 = GraphgrammarFactory.eINSTANCE.createVertex();
		v00.setId("v0");
		v00.setLabel(EcoreUtil.copy(ln));
		v01 = GraphgrammarFactory.eINSTANCE.createVertex();
		v01.setId("v1");
		v01.setLabel(EcoreUtil.copy(lA));
		
		Edge e00_01 = GraphgrammarFactory.eINSTANCE.createEdge();
		e00_01.setLabel(EcoreUtil.copy(l1));
		e00_01.setFrom(v00);
		e00_01.setTo(v01);
		
		g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		g0.getVertices().add(v00);
		g0.getVertices().add(v01);
		g0.getEdges().add(e00_01);
		
		r0 = GraphgrammarFactory.eINSTANCE.createRule();
		r0.setId("r0");
		r0.setLhs(EcoreUtil.copy(lS));
		r0.setRhs(g0);
		
		//
		
		v02 = GraphgrammarFactory.eINSTANCE.createVertex();
		v02.setId("v2");
		v02.setLabel(EcoreUtil.copy(lm));
		
		g1 = GraphgrammarFactory.eINSTANCE.createGraph();
		g1.getVertices().add(v02);
		
		r1 = GraphgrammarFactory.eINSTANCE.createRule();
		r1.setId("r1");
		r1.setLhs(EcoreUtil.copy(lA));
		r1.setRhs(g1);
		
		//
		v03 = GraphgrammarFactory.eINSTANCE.createVertex();
		v03.setId("v3");
		v03.setLabel(EcoreUtil.copy(lm));
		v04 = GraphgrammarFactory.eINSTANCE.createVertex();
		v04.setId("v4");
		v04.setLabel(EcoreUtil.copy(lB));
		
		Edge e03_04 = GraphgrammarFactory.eINSTANCE.createEdge();
		e03_04.setLabel(EcoreUtil.copy(l1));
		e03_04.setFrom(v03);
		e03_04.setTo(v04);
		Edge e04_03 = GraphgrammarFactory.eINSTANCE.createEdge();
		e04_03.setLabel(EcoreUtil.copy(l2));
		e04_03.setTo(v03);
		e04_03.setFrom(v04);
		
		g2 = GraphgrammarFactory.eINSTANCE.createGraph();
		g2.getVertices().add(v03);
		g2.getVertices().add(v04);
		g2.getEdges().add(e03_04);
		g2.getEdges().add(e04_03);
		
		r2 = GraphgrammarFactory.eINSTANCE.createRule();
		r2.setId("r2");
		r2.setLhs(EcoreUtil.copy(lA));
		r2.setRhs(g2);
		SymbolSymbolsPair ssP1_n = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP1_n.setEdgeLabel(EcoreUtil.copy(l1));
		ssP1_n.getVertexLabels().add(EcoreUtil.copy(ln));
		SymbolSymbolsPair ssP2_n = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP2_n.setEdgeLabel(EcoreUtil.copy(l2));
		ssP2_n.getVertexLabels().add(EcoreUtil.copy(ln));
		r2.getEmbedding().put(v04, new BasicEList<>(Arrays.asList(ssP1_n, ssP2_n)));
		
		//
		v05 = GraphgrammarFactory.eINSTANCE.createVertex();
		v05.setId("v5");
		v05.setLabel(EcoreUtil.copy(lC));
		
		g3 = GraphgrammarFactory.eINSTANCE.createGraph();
		g3.getVertices().add(v05);
		
		r3 = GraphgrammarFactory.eINSTANCE.createRule();
		r3.setId("r3");
		r3.setLhs(EcoreUtil.copy(lB));
		r3.setRhs(g3);
		
		gg0 = GraphgrammarFactory.eINSTANCE.createGrammar();
		gg0.getAlphabet().add(lS);
		gg0.getAlphabet().add(lA);
		gg0.getAlphabet().add(lB);
		gg0.getAlphabet().add(lC);
		gg0.getAlphabet().add(ln);
		gg0.getAlphabet().add(lm);
		gg0.getAlphabet().add(l1);
		gg0.getAlphabet().add(l2);
		gg0.getNonterminals().add(lS);
		gg0.getNonterminals().add(lA);
		gg0.getNonterminals().add(lB);
		gg0.getNonterminals().add(lC);
		gg0.getTerminals().add(ln);
		gg0.getTerminals().add(lm);
		gg0.getTerminals().add(l1);
		gg0.getTerminals().add(l2);
		gg0.setInitial(lS);
		gg0.getRules().add(r0);
		gg0.getRules().add(r1);
		gg0.getRules().add(r2);
		gg0.getRules().add(r3);
		//
		
		v06 = GraphgrammarFactory.eINSTANCE.createVertex();
		v06.setId("v6");
		v06.setLabel(EcoreUtil.copy(lC));
		v07 = GraphgrammarFactory.eINSTANCE.createVertex();
		v07.setId("v7");
		v07.setLabel(EcoreUtil.copy(lC));
		g4 = GraphgrammarFactory.eINSTANCE.createGraph();
		g4.getVertices().add(v06);
		g4.getVertices().add(v07);
		
		r4 = GraphgrammarFactory.eINSTANCE.createRule();
		r4.setId("r4");
		r4.setLhs(EcoreUtil.copy(lA));
		r4.setRhs(g4);
		SymbolSymbolsPair ssP1_nm = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP1_nm.setEdgeLabel(EcoreUtil.copy(l1));
		ssP1_nm.getVertexLabels().add(EcoreUtil.copy(ln));
		ssP1_nm.getVertexLabels().add(EcoreUtil.copy(lm));
		SymbolSymbolsPair ssP2_m = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP2_m.setEdgeLabel(EcoreUtil.copy(l2));
		ssP2_m.getVertexLabels().add(EcoreUtil.copy(lm));
		r4.getEmbedding().put(v06, new BasicEList<>(
				Arrays.asList(EcoreUtil.copy(ssP1_n), ssP2_m)));
		r4.getEmbedding().put(v07, new BasicEList<>(Arrays.asList(ssP1_nm)));
		
		//
		
		v08 = GraphgrammarFactory.eINSTANCE.createVertex();
		v08.setId("v8");
		v08.setLabel(EcoreUtil.copy(lC));
		g5 = GraphgrammarFactory.eINSTANCE.createGraph();
		g5.getVertices().add(v08);
		
		r5 = GraphgrammarFactory.eINSTANCE.createRule();
		r5.setId("r5");
		r5.setLhs(EcoreUtil.copy(lA));
		r5.setRhs(g5);
		SymbolSymbolsPair ssP1_ = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP1_nm.setEdgeLabel(EcoreUtil.copy(l1));
		r5.getEmbedding().put(v08, new BasicEList<>(
				Arrays.asList(EcoreUtil.copy(ssP2_m), ssP1_)));
	}
	
	@Test
	void testGetNonNPRules() {
		Map<Rule, SymbolMap<SymbolSet>> map = NPUtil.getNonNPRules(gg0);
		
		assertEquals(2, map.size());
		
		assertEquals(1, map.get(r1).entrySet().size());
		assertEquals(1, map.get(r1).get(l1).size());
		assertTrue(map.get(r1).get(l1).contains(ln));
		
		assertEquals(2, map.get(r3).entrySet().size());
		assertEquals(2, map.get(r3).get(l1).size());
		assertTrue(map.get(r3).get(l1).contains(ln));
		assertTrue(map.get(r3).get(l1).contains(lm));
		assertEquals(2, map.get(r3).get(l2).size());
		assertTrue(map.get(r3).get(l2).contains(ln));
		assertTrue(map.get(r3).get(l2).contains(lm));
	}

	@Test
	void testGetEmbeddingContextEmpty() {
		SymbolMap<SymbolSet> c = NPUtil.getEmbeddingContext(r0, v00);
		
		assertEquals(0, c.size());
	}
	
	@Test
	void testGetEmbeddingContextWithTwoEmbeddings() {
		SymbolMap<SymbolSet> c = NPUtil.getEmbeddingContext(r2, v04);
		
		assertEquals(2, c.size());
		assertEquals(1, c.get(l1).size());
		assertTrue(c.get(l1).contains(ln));
		assertEquals(1, c.get(l2).size());
		assertTrue(c.get(l2).contains(ln));
	}
	
	
	@Test
	void testGetRealContextEmpty() {
		SymbolMap<SymbolSet> c = NPUtil.getRealContext(g3, v05);
		
		assertEquals(0, c.size());
	}
	
	@Test
	void testGetRealContextWithTwoEdges() {
		SymbolMap<SymbolSet> c = NPUtil.getRealContext(r2.getRhs(), v04);
		
		assertEquals(2, c.size());
		assertEquals(1, c.get(l1).size());
		assertTrue(c.get(l1).contains(lm));
		assertEquals(1, c.get(l2).size());
		assertTrue(c.get(l2).contains(lm));
	}
	
	@Test
	void testGetRuleEmbeddingContextEmpty() {
		SymbolMap<SymbolSet> c = NPUtil.getEmbeddingcontext(r0);
		assertEquals(0, c.size());
		
		c = NPUtil.getEmbeddingcontext(r1);
		assertEquals(0, c.size());
		
		c = NPUtil.getEmbeddingcontext(r3);
		assertEquals(0, c.size());
	}
	
	@Test
	void testGetRuleEmbeddingContextWithTwoEmbeddings() {
		SymbolMap<SymbolSet> c = NPUtil.getEmbeddingcontext(r2);
		assertEquals(2, c.size());
		assertEquals(1, c.get(l1).size());
		assertTrue(c.get(l1).contains(ln));
		assertEquals(1, c.get(l2).size());
		assertTrue(c.get(l2).contains(ln));
	}
	
	@Test
	void testGetRuleEmbeddingContextWithEmbeddingsInSeveralVertices() {
		SymbolMap<SymbolSet> c = NPUtil.getEmbeddingcontext(r4);
		assertEquals(2, c.size());
		assertEquals(2, c.get(l1).size());
		assertTrue(c.get(l1).contains(ln));
		assertTrue(c.get(l1).contains(lm));
		assertEquals(1, c.get(l2).size());
		assertTrue(c.get(l2).contains(lm));
	}
	
	@Test
	void testGetRuleEmbeddingContextWithIrregularEmbeddings() {
		SymbolMap<SymbolSet> c = NPUtil.getEmbeddingcontext(r5);
		assertEquals(1, c.size());
		assertEquals(1, c.get(l2).size());
		assertTrue(c.get(l2).contains(lm));
	}
	
	@Test
	void testMissesContextEmptyContext() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		
		assertTrue(NPUtil.missesContext(r0, e0));
	}
	
	@Test
	void testMissesContextTrueEmptyRule() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		e0.put(l1, new SymbolSet(Arrays.asList(ln)));
		
		assertTrue(NPUtil.missesContext(r0, e0));
		assertTrue(NPUtil.missesContext(r1, e0));
		assertTrue(NPUtil.missesContext(r3, e0));
	}
	
	@Test
	void testMissesContextTrueNonEmptyRuleHasEdgeLabel() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		e0.put(l1, new SymbolSet(Arrays.asList(lm)));
		
		assertTrue(NPUtil.missesContext(r2, e0));
		assertTrue(NPUtil.missesContext(r5, e0));
		
		SymbolMap<SymbolSet> e1 = new SymbolMap<>();
		e1.put(l2, new SymbolSet(Arrays.asList(ln)));
		assertTrue(NPUtil.missesContext(r4, e1));
	}
	
	@Test
	void testMissesContextTrueNonEmptyRuleDoesntHaveEdgeLabel() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		e0.put(l2, new SymbolSet(Arrays.asList(lm)));
		
		assertTrue(NPUtil.missesContext(r2, e0));
		
		SymbolMap<SymbolSet> e1 = new SymbolMap<>();
		e1.put(lA, new SymbolSet(Arrays.asList(lm)));
		assertTrue(NPUtil.missesContext(r4, e1));
		assertTrue(NPUtil.missesContext(r5, e1));
	}
	
	@Test
	void testMissesContextFalseNonEmptyRuleSimpleContext() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		e0.put(l1, new SymbolSet(Arrays.asList(ln)));
		
		assertFalse(NPUtil.missesContext(r2, e0));
		assertFalse(NPUtil.missesContext(r4, e0));
		
		SymbolMap<SymbolSet> e1 = new SymbolMap<>();
		e1.put(l2, new SymbolSet(Arrays.asList(ln)));
		assertFalse(NPUtil.missesContext(r2, e1));
		
		SymbolMap<SymbolSet> e2 = new SymbolMap<>();
		e2.put(l2, new SymbolSet(Arrays.asList(lm)));
		assertFalse(NPUtil.missesContext(r5, e2));
	}
	
	@Test
	void testMissesContextTrueNonEmptyRuleContextWithTwoEntries() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		e0.put(l1, new SymbolSet(Arrays.asList(lm)));
		e0.put(l2, new SymbolSet(Arrays.asList(lm)));
		
		assertTrue(NPUtil.missesContext(r2, e0));
		
		SymbolMap<SymbolSet> e1 = new SymbolMap<>();
		e1.put(l1, new SymbolSet(Arrays.asList(lA)));
		e1.put(l2, new SymbolSet(Arrays.asList(ln)));
		assertTrue(NPUtil.missesContext(r4, e1));
		
		SymbolMap<SymbolSet> e2 = new SymbolMap<>();
		e2.put(lA, new SymbolSet(Arrays.asList(lA)));
		e2.put(l2, new SymbolSet(Arrays.asList(ln)));
		assertTrue(NPUtil.missesContext(r5, e2));
	}
	
	@Test
	void testMissesContextFalseNonEmptyRuleContextWithTwoEntries() {
		SymbolMap<SymbolSet> e0 = new SymbolMap<>();
		e0.put(l1, new SymbolSet(Arrays.asList(lm)));
		e0.put(l2, new SymbolSet(Arrays.asList(ln)));
		
		assertFalse(NPUtil.missesContext(r2, e0));
		
		SymbolMap<SymbolSet> e1 = new SymbolMap<>();
		e1.put(l1, new SymbolSet(Arrays.asList(ln)));
		e1.put(l2, new SymbolSet(Arrays.asList(lm)));
		assertFalse(NPUtil.missesContext(r4, e1));
		assertFalse(NPUtil.missesContext(r5, e1));
	}

}
