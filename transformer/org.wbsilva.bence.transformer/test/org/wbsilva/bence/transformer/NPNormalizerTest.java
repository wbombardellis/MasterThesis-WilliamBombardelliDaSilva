package org.wbsilva.bence.transformer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
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
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

class NPNormalizerTest {

	static final NPNormalizer npn = new NPNormalizer();
	private static Symbol lS;
	private static Symbol lA;
	private static Symbol ln;
	private static Symbol lm;
	private static Symbol l1;
	private static Symbol lA_n1;
	private static Vertex v0;
	private static Vertex v1;
	private static Edge e0_1;
	private static Graph g0;
	private static Rule r0;
	private static Vertex v2;
	private static Graph g1;
	private static Rule r1;
	private static Vertex v3;
	private static Vertex v4;
	private static Edge e3_4;
	private static Graph g2;
	private static Rule r2;
	private static Symbol l2;
	private static Symbol lB;
	private static Vertex v5;
	private static Graph g3;
	private static Rule r3;
	private static Symbol lC;
	private static Edge e4_3;
	private static SymbolSymbolsPair ssP2_n;
	private static Symbol lB_n1;
	private static SymbolSymbolsPair ssP1_n;
	private static Vertex v6;
	private static Vertex v7;
	private static Graph g4;
	private static Rule r4;
	private static Symbol lD;
	private static Symbol lE;
	private static Symbol lB_m2;
	private static SymbolSymbolsPair ssP6_m;
	private static SymbolSymbolsPair ssP7_m;
	private static Grammar gg0;
	
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
		lA_n1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		lA_n1.setName("A");
		lA_n1.getSuperscript().add("1");
		lA_n1.getSubscript().add("n");
		lB_n1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		lB_n1.setName("B");
		lB_n1.getSuperscript().add("1");
		lB_n1.getSubscript().add("n");
		lB_m2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		lB_m2.setName("B");
		lB_m2.getSuperscript().add("2");
		lB_m2.getSubscript().add("m");
		lB = GraphgrammarFactory.eINSTANCE.createSymbol();
		lB.setName("B");
		lC = GraphgrammarFactory.eINSTANCE.createSymbol();
		lC.setName("C");
		lD = GraphgrammarFactory.eINSTANCE.createSymbol();
		lD.setName("D");
		lE = GraphgrammarFactory.eINSTANCE.createSymbol();
		lE.setName("E");
		
		v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("v0");
		v0.setLabel(EcoreUtil.copy(ln));
		v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("v1");
		v1.setLabel(EcoreUtil.copy(lA));
		
		e0_1 = GraphgrammarFactory.eINSTANCE.createEdge();
		e0_1.setLabel(EcoreUtil.copy(l1));
		e0_1.setFrom(v0);
		e0_1.setTo(v1);
		
		g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		g0.getVertices().add(v0);
		g0.getVertices().add(v1);
		g0.getEdges().add(e0_1);
		
		r0 = GraphgrammarFactory.eINSTANCE.createRule();
		r0.setId("r0");
		r0.setLhs(EcoreUtil.copy(lS));
		r0.setRhs(g0);
		
		//
		
		v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("v2");
		v2.setLabel(EcoreUtil.copy(lm));
		
		g1 = GraphgrammarFactory.eINSTANCE.createGraph();
		g1.getVertices().add(v2);
		
		r1 = GraphgrammarFactory.eINSTANCE.createRule();
		r1.setId("r1");
		r1.setLhs(EcoreUtil.copy(lA));
		r1.setRhs(g1);
		
		//
		v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("v3");
		v3.setLabel(EcoreUtil.copy(lm));
		v4 = GraphgrammarFactory.eINSTANCE.createVertex();
		v4.setId("v4");
		v4.setLabel(EcoreUtil.copy(lB));
		
		e3_4 = GraphgrammarFactory.eINSTANCE.createEdge();
		e3_4.setLabel(EcoreUtil.copy(l1));
		e3_4.setFrom(v3);
		e3_4.setTo(v4);
		e4_3 = GraphgrammarFactory.eINSTANCE.createEdge();
		e4_3.setLabel(EcoreUtil.copy(l2));
		e4_3.setTo(v3);
		e4_3.setFrom(v4);
		
		g2 = GraphgrammarFactory.eINSTANCE.createGraph();
		g2.getVertices().add(v3);
		g2.getVertices().add(v4);
		g2.getEdges().add(e3_4);
		g2.getEdges().add(e4_3);
		
		r2 = GraphgrammarFactory.eINSTANCE.createRule();
		r2.setId("r2");
		r2.setLhs(EcoreUtil.copy(lA));
		r2.setRhs(g2);
		ssP1_n = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP1_n.setEdgeLabel(EcoreUtil.copy(l1));
		ssP1_n.getVertexLabels().add(EcoreUtil.copy(ln));
		ssP2_n = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP2_n.setEdgeLabel(EcoreUtil.copy(l2));
		ssP2_n.getVertexLabels().add(EcoreUtil.copy(ln));
		r2.getEmbedding().put(v4, new BasicEList<>(Arrays.asList(ssP1_n, ssP2_n)));
		
		//
		v5 = GraphgrammarFactory.eINSTANCE.createVertex();
		v5.setId("v5");
		v5.setLabel(EcoreUtil.copy(lC));
		
		g3 = GraphgrammarFactory.eINSTANCE.createGraph();
		g3.getVertices().add(v5);
		
		r3 = GraphgrammarFactory.eINSTANCE.createRule();
		r3.setId("r3");
		r3.setLhs(EcoreUtil.copy(lB));
		r3.setRhs(g3);
		
		//
		v6 = GraphgrammarFactory.eINSTANCE.createVertex();
		v6.setId("v6");
		v6.setLabel(EcoreUtil.copy(lD));
		v7 = GraphgrammarFactory.eINSTANCE.createVertex();
		v7.setId("v7");
		v7.setLabel(EcoreUtil.copy(lE));
		
		g4 = GraphgrammarFactory.eINSTANCE.createGraph();
		g4.getVertices().add(v6);
		g4.getVertices().add(v7);
		
		r4 = GraphgrammarFactory.eINSTANCE.createRule();
		r4.setId("r4");
		r4.setLhs(EcoreUtil.copy(lB));
		r4.setRhs(g4);
		ssP6_m = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP6_m.setEdgeLabel(EcoreUtil.copy(l1));
		ssP6_m.getVertexLabels().add(EcoreUtil.copy(lm));
		ssP7_m = GraphgrammarFactory.eINSTANCE.createSymbolSymbolsPair();
		ssP7_m.setEdgeLabel(EcoreUtil.copy(l2));
		ssP7_m.getVertexLabels().add(EcoreUtil.copy(lm));
		r4.getEmbedding().put(v6, new BasicEList<>(Arrays.asList(ssP6_m)));
		r4.getEmbedding().put(v7, new BasicEList<>(Arrays.asList(ssP7_m)));
		
		//
		gg0 = GraphgrammarFactory.eINSTANCE.createGrammar();
		gg0.getAlphabet().add(lS);
		gg0.getAlphabet().add(lA);
		gg0.getAlphabet().add(lB);
		gg0.getAlphabet().add(lC);
		gg0.getAlphabet().add(ln);
		gg0.getAlphabet().add(lm);
		gg0.getAlphabet().add(l1);
		gg0.getAlphabet().add(l2);
		gg0.getNonterminals().add(lA);
		gg0.getNonterminals().add(lB);
		gg0.getNonterminals().add(lC);
		gg0.getTerminals().add(ln);
		gg0.getTerminals().add(lm);
		gg0.getTerminals().add(l1);
		gg0.getTerminals().add(l2);
		gg0.setInitial(lS);
		gg0.getRules().add(EcoreUtil.copy(r0));
		gg0.getRules().add(EcoreUtil.copy(r1));
		gg0.getRules().add(EcoreUtil.copy(r2));
		gg0.getRules().add(EcoreUtil.copy(r3));
	}
	
	@Test
	void testCreateNewRulesWithOneEdge() {
		Rule cr1 = EcoreUtil.copy(r1);
		List<Rule> newRs = npn.createNewRules(cr1, r0, v1, ln, e0_1);
		
		assertTrue(EcoreUtil.equals(r1, cr1));
		Rule mr0 = newRs.get(0);
		assertTrue(mr0.getLhs().equivalates(r0.getLhs()));
		assertEquals(2, mr0.getRhs().getVertices().size());
		assertEquals(0, mr0.getRhs().getEdges().size());
		assertEquals(0, mr0.getEmbedding().size());
		assertTrue(mr0.getRhs().getVertices().stream()
				.allMatch(v -> v.getLabel().equivalates(lA_n1) || v.getLabel().equivalates(ln)));
		
		Rule nr1 = newRs.get(1);
		assertTrue(nr1.getLhs().getName().equals("A"));
		assertTrue(nr1.getLhs().getSuperscript().get(0).equals(e0_1.getLabel().getName()));
		assertTrue(nr1.getLhs().getSubscript().get(0).equals("n"));
		assertEquals(1, nr1.getRhs().getVertices().size());
		assertEquals(0, nr1.getRhs().getEdges().size());
		assertEquals(0, nr1.getEmbedding().size());
		assertTrue(nr1.getRhs().getVertices().get(0).getLabel().equivalates(lm));
	}
	
	@Test
	void testCreateNewRulesWithEmbedding() {
		Rule cr3 = EcoreUtil.copy(r3);
		List<Rule> newRs = npn.createNewRules(cr3, r2, v4, ln, l1);
		
		assertTrue(EcoreUtil.equals(r3, cr3));
		Rule mr2 = newRs.get(0);
		assertTrue(mr2.getLhs().equivalates(r2.getLhs()));
		assertEquals(2, mr2.getRhs().getVertices().size());
		assertEquals(2, mr2.getRhs().getEdges().size());
		assertEquals(1, mr2.getEmbedding().size());
		assertTrue(mr2.getEmbedding().entrySet().stream()
							.allMatch(e -> e.getValue().size() == 2));
		assertTrue(mr2.getRhs().getVertices().stream()
				.allMatch(v -> v.getLabel().equivalates(lB_n1) || v.getLabel().equivalates(lm)));
		
		Rule nr3 = newRs.get(1);
		assertTrue(nr3.getLhs().getName().equals("B"));
		assertTrue(nr3.getLhs().getSuperscript().get(0).equals(l1.getName()));
		assertTrue(nr3.getLhs().getSubscript().get(0).equals("n"));
		assertEquals(1, nr3.getRhs().getVertices().size());
		assertEquals(0, nr3.getRhs().getEdges().size());
		assertEquals(0, nr3.getEmbedding().size());
		assertTrue(nr3.getRhs().getVertices().get(0).getLabel().equivalates(lC));
	}
	
	@Test
	void testCreateNewRulesWithTwoEdges() {
		Rule cr4 = EcoreUtil.copy(r4);
		List<Rule> newRs = npn.createNewRules(cr4, r2, v4, lm, e4_3);
		
		assertTrue(EcoreUtil.equals(r4, cr4));
		Rule mr2 = newRs.get(0);
		assertTrue(mr2.getLhs().equivalates(r2.getLhs()));
		assertEquals(2, mr2.getRhs().getVertices().size());
		assertEquals(1, mr2.getRhs().getEdges().size());
		assertEquals(1, mr2.getEmbedding().size());
		assertEquals(1, mr2.getEmbedding().entrySet().stream()
							.map(e -> e.getKey().getId())
							.distinct()
							.count());
		assertTrue(mr2.getEmbedding().entrySet().stream()
							.allMatch(e -> e.getValue().size() == 2));
		assertTrue(mr2.getRhs().getVertices().stream()
				.allMatch(v -> v.getLabel().equivalates(lB_m2) || v.getLabel().equivalates(lm)));
		
		Rule nr4 = newRs.get(1);
		assertTrue(nr4.getLhs().getName().equals("B"));
		assertTrue(nr4.getLhs().getSubscript().get(0).equals("m"));
		assertTrue(nr4.getLhs().getSuperscript().get(0).equals(e4_3.getLabel().getName()));
		assertEquals(2, nr4.getRhs().getVertices().size());
		assertEquals(0, nr4.getRhs().getEdges().size());
		assertEquals(1, nr4.getEmbedding().entrySet().stream()
							.filter(e -> !e.getValue().isEmpty())
							.map(e -> e.getKey().getId())
							.distinct()
							.count());
		assertTrue(nr4.getEmbedding().entrySet().stream()
							.allMatch(e -> e.getValue().size() <= 1));
		assertTrue(nr4.getEmbedding().entrySet().stream()
							.allMatch(e -> e.getValue().parallelStream()
									.allMatch(ssP -> !ssP.getEdgeLabel().equivalates(l2))));
		assertTrue(nr4.getRhs().getVertices().stream()
							.allMatch(v -> v.getLabel().equivalates(lD) || v.getLabel().equivalates(lE)));
	}

	@Test
	void testNormalize() {
		npn.normalize(gg0);
	}
}
