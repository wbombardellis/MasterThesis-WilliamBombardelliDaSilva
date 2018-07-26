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
		
		assertTrue(GraphgrammarUtil.isomorphicEdges(l0, l1));
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
	void testGetNonNPRules() {
		Symbol lS = GraphgrammarFactory.eINSTANCE.createSymbol();
		lS.setName("S");
		Symbol lA = GraphgrammarFactory.eINSTANCE.createSymbol();
		lA.setName("A");
		Symbol ln = GraphgrammarFactory.eINSTANCE.createSymbol();
		ln.setName("n");
		Symbol lm = GraphgrammarFactory.eINSTANCE.createSymbol();
		lm.setName("m");
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("2");
		Symbol lB = GraphgrammarFactory.eINSTANCE.createSymbol();
		lB.setName("B");
		Symbol lC = GraphgrammarFactory.eINSTANCE.createSymbol();
		lC.setName("C");
		
		Vertex v00 = GraphgrammarFactory.eINSTANCE.createVertex();
		v00.setId("v0");
		v00.setLabel(EcoreUtil.copy(ln));
		Vertex v01 = GraphgrammarFactory.eINSTANCE.createVertex();
		v01.setId("v1");
		v01.setLabel(EcoreUtil.copy(lA));
		
		Edge e00_01 = GraphgrammarFactory.eINSTANCE.createEdge();
		e00_01.setLabel(EcoreUtil.copy(l1));
		e00_01.setFrom(v00);
		e00_01.setTo(v01);
		
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		g0.getVertices().add(v00);
		g0.getVertices().add(v01);
		g0.getEdges().add(e00_01);
		
		Rule r0 = GraphgrammarFactory.eINSTANCE.createRule();
		r0.setId("r0");
		r0.setLhs(EcoreUtil.copy(lS));
		r0.setRhs(g0);
		
		//
		
		Vertex v02 = GraphgrammarFactory.eINSTANCE.createVertex();
		v02.setId("v2");
		v02.setLabel(EcoreUtil.copy(lm));
		
		Graph g1 = GraphgrammarFactory.eINSTANCE.createGraph();
		g1.getVertices().add(v02);
		
		Rule r1 = GraphgrammarFactory.eINSTANCE.createRule();
		r1.setId("r1");
		r1.setLhs(EcoreUtil.copy(lA));
		r1.setRhs(g1);
		
		//
		Vertex v03 = GraphgrammarFactory.eINSTANCE.createVertex();
		v03.setId("v3");
		v03.setLabel(EcoreUtil.copy(lm));
		Vertex v04 = GraphgrammarFactory.eINSTANCE.createVertex();
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
		
		Graph g2 = GraphgrammarFactory.eINSTANCE.createGraph();
		g2.getVertices().add(v03);
		g2.getVertices().add(v04);
		g2.getEdges().add(e03_04);
		g2.getEdges().add(e04_03);
		
		Rule r2 = GraphgrammarFactory.eINSTANCE.createRule();
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
		Vertex v05 = GraphgrammarFactory.eINSTANCE.createVertex();
		v05.setId("v5");
		v05.setLabel(EcoreUtil.copy(lC));
		
		Graph g3 = GraphgrammarFactory.eINSTANCE.createGraph();
		g3.getVertices().add(v05);
		
		Rule r3 = GraphgrammarFactory.eINSTANCE.createRule();
		r3.setId("r3");
		r3.setLhs(EcoreUtil.copy(lB));
		r3.setRhs(g3);
		
		Grammar gg0 = GraphgrammarFactory.eINSTANCE.createGrammar();
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
		
		Map<Rule, SymbolMap<SymbolSet>> map = GraphgrammarUtil.getNonNPRules(gg0);
		
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
}
