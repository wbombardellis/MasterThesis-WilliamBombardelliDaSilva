package org.wbsilva.bence.transformer.parser;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

class BeNCEParserTest {
	
	private static BeNCEParser parser;
	
	static private Grammar gg0 = GraphgrammarFactory.eINSTANCE.createGrammar();

	private static Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
	private static Vertex v2 = GraphgrammarFactory.eINSTANCE.createVertex();
	private static Vertex v3 = GraphgrammarFactory.eINSTANCE.createVertex();
	
	final static private Set<ZoneVertex> set0 = new HashSet<ZoneVertex>(0);
	final static private Set<ZoneVertex> set1 = new HashSet<ZoneVertex>(1);
	final static private Set<ZoneVertex> set2 = new HashSet<ZoneVertex>(3);
	final static private Set<ZoneVertex> set3 = new HashSet<ZoneVertex>(1);
	final static private Set<ZoneVertex> set4 = new HashSet<ZoneVertex>(2);
	
	final static private ZoneVertex zv1 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv2 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv3 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	
	@BeforeAll
	static void init() {
		
		parser = new BeNCEParser(gg0);
		
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("2");
		Symbol l3 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l3.setName("3");
		
		Symbol l11 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l11.setName("v1");
		Symbol l22 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l22.setName("v2");
		Symbol l33 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l33.setName("v3");
		
		zv1.setLabel(l1);
		zv2.setLabel(l2);
		zv2.getVertices().add(v1);
		zv2.getVertices().add(v2);
		zv3.setLabel(l3);
		zv3.getVertices().add(v3);
		
		v1.setLabel(l11);
		v2.setLabel(l22);
		v3.setLabel(l33);
		
		set1.add(zv1);
		
		set2.add(zv1);
		set2.add(zv2);
		set2.add(zv3);
		
		set3.add(zv3);
		
		set4.add(zv1);
		set4.add(zv2);
		
		GraphgrammarUtil.ensureUniqueIds(Arrays.asList(v1, v2, v3));
		GraphgrammarUtil.ensureUniqueIds(set2);
	}

	@Test
	void testBeNCEParser() {
		new BeNCEParser(gg0);
	}

	@Test
	void testMergeEmpty() {
		Set<Vertex> s = parser.merge(set0);
		assertTrue(s.isEmpty());
	}
	
	@Test
	void testMergeNonEmptyZVEmpty() {
		Set<Vertex> s = parser.merge(set1);
		assertTrue(s.isEmpty());
	}

	@Test
	void testMergeNonEmpty() {
		Set<Vertex> s = parser.merge(set2);
		assertEquals(3, s.size());
		
		assertTrue(s.stream().allMatch(v -> EcoreUtil.equals(v1, v) || EcoreUtil.equals(v2, v) || EcoreUtil.equals(v3, v)));
		assertTrue(s.stream().allMatch(v -> v1 != v && v2 !=  v && v3 != v));
	}
	
	@Test
	void testEdgeBetweenTrue() {
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		Vertex v = GraphgrammarFactory.eINSTANCE.createVertex();
		Vertex w = GraphgrammarFactory.eINSTANCE.createVertex();
		GraphgrammarUtil.ensureUniqueIds(Arrays.asList(v,w));
		e.setFrom(v);
		e.setTo(w);
		
		assertTrue(parser.edgeBetween(e, v, w));
	}
	
	@Test
	void testEdgeBetweenCopyTrue() {
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		Vertex v = GraphgrammarFactory.eINSTANCE.createVertex();
		Vertex w = GraphgrammarFactory.eINSTANCE.createVertex();
		GraphgrammarUtil.ensureUniqueIds(Arrays.asList(v,w));
		e.setFrom(v);
		e.setTo(w);
		
		assertTrue(parser.edgeBetween(e, EcoreUtil.copy(v), w));
	}
	
	@Test
	void testEdgeBetweenFalse() {
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		Vertex v = GraphgrammarFactory.eINSTANCE.createVertex();
		Vertex w = GraphgrammarFactory.eINSTANCE.createVertex();
		GraphgrammarUtil.ensureUniqueIds(Arrays.asList(v,w));
		e.setFrom(v);
		e.setTo(v);
		
		assertFalse(parser.edgeBetween(e, v, w));
	}
	
	@Test
	void testZoneVerticesEmpty() {
		BasicEList<Vertex> sV = new BasicEList<Vertex>();
		Set<ZoneVertex> zv = parser.zoneVertices(sV);
		assertTrue(zv.isEmpty());
	}
	
	@Test
	void testZoneVerticesOne() {
		BasicEList<Vertex> sV = new BasicEList<Vertex>();
		sV.add(v1);
		sV.add(v2);
		Set<ZoneVertex> zV = parser.zoneVertices(sV);
		
		assertEquals(2, zV.size());
		assertTrue(zV.stream()
				.allMatch(z -> z.getVertices().size() == 1));
		assertTrue(zV.stream()
				.allMatch(z -> EcoreUtil.equals(z.getLabel(), v1.getLabel()) && EcoreUtil.equals(z.getVertices().get(0), v1)
						|| EcoreUtil.equals(z.getLabel(), v2.getLabel()) && EcoreUtil.equals(z.getVertices().get(0), v2)));
	}
	
	@Test
	void testContractEmpty() {		
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		
		ZoneVertex z = parser.contract(l, set0);
		
		assertTrue(EcoreUtil.equals(l, z.getLabel()));
		assertTrue(z.getVertices().isEmpty());
	}
	
	@Test
	void testContractOneEmpty() {		
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		
		ZoneVertex z = parser.contract(l, set1);
		
		assertTrue(EcoreUtil.equals(l, z.getLabel()));
		assertEquals(0, z.getVertices().size());
	}
	
	@Test
	void testContractNonEmpty() {		
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		
		ZoneVertex z = parser.contract(l, set2);
		
		assertTrue(EcoreUtil.equals(l, z.getLabel()));
		assertEquals(3, z.getVertices().size());
		assertTrue(z.getVertices().stream()
				.allMatch(v -> EcoreUtil.equals(v1, v) 
						|| EcoreUtil.equals(v2, v)
						|| EcoreUtil.equals(v3, v)));
	}
	
	@Test
	void testZoneGraphEmpty() {		
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Graph zG = parser.zoneGraph(g0, set0);
		
		assertTrue(zG.getVertices().isEmpty());
	}
	
	@Test
	void testZoneGraphOne() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Graph zG = parser.zoneGraph(g0, set1);
		
		assertEquals(1, zG.getVertices().size());
		assertTrue(EcoreUtil.equals(zv1, zG.getVertices().get(0)));
	}
	
	@Test
	void testZoneGraphOneWithoutNeighbors() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		g0.getVertices().add(EcoreUtil.copy(v3));
		
		Graph zG = parser.zoneGraph(g0, set3);
		
		assertEquals(1, zG.getVertices().size());
		assertTrue(EcoreUtil.equals(zv3, zG.getVertices().get(0)));
	}
	
	@Test
	void testZoneGraphOneWithNeighbors() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v2c = EcoreUtil.copy(v2);
		Vertex v3c = EcoreUtil.copy(v3);
		g0.getVertices().add(v2c);
		g0.getVertices().add(v3c);
		
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		e.setFrom(v2c);
		e.setTo(v3c);
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		e.setLabel(l);
		g0.getEdges().add(e);
		
		Graph zG = parser.zoneGraph(g0, set3);
		
		assertEquals(2, zG.getVertices().size());
		assertTrue(EcoreUtil.equals(zv3, zG.getVertices().get(0)));
		assertTrue(EcoreUtil.equals(v2c, ((ZoneVertex)zG.getVertices().get(1)).getVertices().get(0)));
	}
	
	@Test
	void testZoneGraphTwoWithNeighbors() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v2c = EcoreUtil.copy(v2);
		Vertex v3c = EcoreUtil.copy(v3);
		g0.getVertices().add(v2c);
		g0.getVertices().add(v3c);
		
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		e.setFrom(v2c);
		e.setTo(v3c);
		Symbol l = GraphgrammarFactory.eINSTANCE.createSymbol();
		l.setName("l");
		e.setLabel(l);
		g0.getEdges().add(e);
		
		Graph zG = parser.zoneGraph(g0, set2);
		
		assertEquals(3, zG.getVertices().size());
		assertTrue(zG.getVertices().stream()
				.allMatch(z -> EcoreUtil.equals(zv1, z) || EcoreUtil.equals(zv2, z) || EcoreUtil.equals(zv3, z)));
	}
	
	@Test
	void testInduceEmpty() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Graph i = parser.induce(g0, set0);
		
		assertTrue(i.getVertices().isEmpty());
	}
	
	@Test
	void testInduceOne() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		ZoneVertex zv3c = EcoreUtil.copy(zv3);
		g0.getVertices().add(zv3c);
		
		Graph i = parser.induce(g0, set3);
		
		assertEquals(1, i.getVertices().size());
		assertTrue(EcoreUtil.equals(zv3c, i.getVertices().get(0)));
	}
	
	@Test
	void testInduceOneWithNeighbors() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		ZoneVertex zv3c = EcoreUtil.copy(zv3);
		ZoneVertex zv2c = EcoreUtil.copy(zv2);
		g0.getVertices().add(zv3c);
		g0.getVertices().add(zv2c);
		
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		e.setFrom(zv2c);
		e.setTo(zv3c);
		g0.getEdges().add(e);
		
		
		Graph i = parser.induce(g0, set3);
		
		assertEquals(1, i.getVertices().size());
		assertTrue(EcoreUtil.equals(zv3c, i.getVertices().get(0)));
	}
	
	@Test
	void testInduceTwoWithNeighbors() {
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		ZoneVertex zv1c = EcoreUtil.copy(zv1);
		ZoneVertex zv2c = EcoreUtil.copy(zv2);
		g0.getVertices().add(zv1c);
		g0.getVertices().add(zv2c);
		
		Edge e = GraphgrammarFactory.eINSTANCE.createEdge();
		e.setFrom(zv1c);
		e.setTo(zv2c);
		g0.getEdges().add(e);
		
		Graph i = parser.induce(g0, set4);
		
		assertEquals(2, i.getVertices().size());
		assertTrue(i.getVertices().stream()
				.allMatch(z -> EcoreUtil.equals(zv1, z) || EcoreUtil.equals(zv2, z)));
	}
}
