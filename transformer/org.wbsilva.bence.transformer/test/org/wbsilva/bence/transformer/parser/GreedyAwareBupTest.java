package org.wbsilva.bence.transformer.parser;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

class GreedyAwareBupTest {

	final static private Set<ZoneVertex> set0 = new HashSet<ZoneVertex>(0);
	final static private Set<ZoneVertex> set1 = new HashSet<ZoneVertex>(1);
	final static private Set<ZoneVertex> set2 = new HashSet<ZoneVertex>(3);
	
	final static private ZoneVertex zv1 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv2 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv3 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv4 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv5 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv6 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	private static Grammar gg0;
	private static Graph g0;
	private static Symbol i;
	private static Grammar gg1;
	
	@BeforeAll
	static void init() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("2");
		Symbol l3 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l3.setName("3");
		i = GraphgrammarFactory.eINSTANCE.createSymbol();
		i.setName("S");
		
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId(EcoreUtil.generateUUID());
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId(EcoreUtil.generateUUID());
		Vertex v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId(EcoreUtil.generateUUID());
		
		zv1.setLabel(l1);
		zv1.getVertices().add(v0);
		zv2.setLabel(l2);
		zv2.getVertices().add(v1);
		zv2.getVertices().add(v2);
		zv3.setLabel(l3);
		
		set1.add(zv1);
		
		set2.add(zv1);
		set2.add(zv2);
		set2.add(zv3);
		
		GraphgrammarUtil.ensureUniqueIds(set2);
		
		////
		gg0 = GraphgrammarFactory.eINSTANCE.createGrammar();
		
		Graph gr0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex gr0v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		gr0v0.setId("gr0v0");
		gr0v0.setLabel(EcoreUtil.copy(l1));
		gr0.getVertices().add(gr0v0);
		
		Rule r0 = GraphgrammarFactory.eINSTANCE.createRule();
		r0.setId("r0");
		r0.setLhs(EcoreUtil.copy(i));
		r0.setRhs(gr0);
		
		Graph gr1 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex gr1v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		gr1v0.setId("gr1v0");
		gr1v0.setLabel(EcoreUtil.copy(l1));
		Vertex gr1v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		gr1v1.setId("gr1v1");
		gr1v1.setLabel(EcoreUtil.copy(l1));
		Vertex gr1v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		gr1v2.setId("gr1v2");
		gr1v2.setLabel(EcoreUtil.copy(l1));
		
		gr1.getVertices().add(gr1v0);
		gr1.getVertices().add(gr1v1);
		gr1.getVertices().add(gr1v2);
		
		Rule r1 = GraphgrammarFactory.eINSTANCE.createRule();
		r1.setId("r1");
		r1.setLhs(EcoreUtil.copy(i));
		r1.setRhs(gr1);
		
		gg0.getRules().add(r0);
		gg0.getRules().add(r1);
		
		///
		gg1 = GraphgrammarFactory.eINSTANCE.createGrammar();
		
		Graph gr2 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex gr2v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		gr2v0.setId("gr2v0");
		gr2v0.setLabel(EcoreUtil.copy(l1));
		Vertex gr2v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		gr2v1.setId("gr2v1");
		gr2v1.setLabel(EcoreUtil.copy(l1));
		
		gr2.getVertices().add(gr2v0);
		gr2.getVertices().add(gr2v1);
		
		Rule r2 = GraphgrammarFactory.eINSTANCE.createRule();
		r2.setId("r2");
		r2.setLhs(EcoreUtil.copy(i));
		r2.setRhs(gr2);
		
		gg1.getRules().add(r2);
		
		g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex gv0 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv0.setId("gv0");
		gv0.setLabel(EcoreUtil.copy(l1));
		Vertex gv1 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv1.setId("gv1");
		gv1.setLabel(EcoreUtil.copy(l1));
		Vertex gv2 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv2.setId("gv2");
		gv2.setLabel(EcoreUtil.copy(l1));
		Vertex gv3 = GraphgrammarFactory.eINSTANCE.createVertex();
		gv3.setId("gv3");
		gv3.setLabel(EcoreUtil.copy(l1));
		Edge gve0_1 = GraphgrammarFactory.eINSTANCE.createEdge();
		gve0_1.setFrom(gv0);
		gve0_1.setTo(gv1);
		gve0_1.setLabel(EcoreUtil.copy(l1));
		
		g0.getVertices().add(gv0);
		g0.getVertices().add(gv1);
		g0.getVertices().add(gv2);
		g0.getVertices().add(gv3);
		g0.getEdges().add(gve0_1);
		
		zv4.setLabel(EcoreUtil.copy(l1));
		zv4.getVertices().add(EcoreUtil.copy(gv0));
		zv4.getVertices().add(EcoreUtil.copy(gv2));
		zv5.setLabel(EcoreUtil.copy(l2));
		zv5.getVertices().add(EcoreUtil.copy(gv1));
		zv6.setLabel(EcoreUtil.copy(l2));
		zv6.getVertices().add(EcoreUtil.copy(gv3));
	}
	
	@Test
	void testGreedyAwareBupNull() {
		GreedyAwareBup bup = new GreedyAwareBup(null, 0, zv1, gg0, g0, new HashMap<String, Integer>());
		
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}

	@Test
	void testGreedyAwareBupEmpty() {
		GreedyAwareBup bup = new GreedyAwareBup(set0, 1, zv1, gg0, g0, new HashMap<String, Integer>());
		
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testGreedyAwareBupOne() {
		GreedyAwareBup bup = new GreedyAwareBup(set1, 1, zv1, gg0, g0, new HashMap<String, Integer>());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
		
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextNonEmptyTabooForSize2() {
		GreedyAwareBup bup = new GreedyAwareBup(set2, 3, zv1, gg0, g0, new HashMap<String, Integer>());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv2));
		
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
				
		next = bup.next();
		assertTrue(next.isPresent());
		
		next = bup.next();
		assertTrue(next.isPresent());
		
		//No subset with size 2
		
		next = bup.next();
		assertEquals(3, next.get().size());
		assertTrue(next.get().contains(zv1) && next.get().contains(zv2) && next.get().contains(zv3));
		
		next = bup.next();
		assertFalse(next.isPresent());
	}
	
	@Test
	void testAddNonEmptyOrdered() {
		GreedyAwareBup bup = new GreedyAwareBup(set0, 2, zv1, gg1, g0, new HashMap<String, Integer>());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(0, next.get().size());
		assertFalse(bup.next().isPresent());
		
		bup.add(zv4);
		bup.add(zv5);
		bup.add(zv6);
		
		//Bigger zonevertex gets higher priority
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv4));
		
		//Bigger zonevertex and zone vertex closer to it get higher priority
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv4) && next.get().contains(zv5));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv4) && next.get().contains(zv6));
		
		
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv5) || next.get().contains(zv6));
		
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv5) || next.get().contains(zv6));
		
		assertTrue(bup.next().isPresent());
		assertTrue(bup.next().isPresent());
		assertTrue(bup.next().isPresent());
		assertTrue(bup.next().isPresent());
		
		assertFalse(bup.next().isPresent());
	}
	
}
