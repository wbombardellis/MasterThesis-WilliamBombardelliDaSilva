package org.wbsilva.bence.transformer.parser;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

class GreedyBupTest {

	final static private Set<ZoneVertex> set0 = new HashSet<ZoneVertex>(0);
	final static private Set<ZoneVertex> set1 = new HashSet<ZoneVertex>(1);
	final static private Set<ZoneVertex> set2 = new HashSet<ZoneVertex>(3);
	
	final static private ZoneVertex zv1 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv2 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	final static private ZoneVertex zv3 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
	
	@BeforeAll
	static void init() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("2");
		Symbol l3 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l3.setName("3");
		
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
	}

	@Test
	void testGreedyBupNull() {
		GreedyBup bup = new GreedyBup(null, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testGreedyBupNonEmptyZero() {
		GreedyBup bup = new GreedyBup(set1, 0, zv1);
		assertEquals(0, bup.next().get().size());
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testGreedyBupNonEmpty() {
		GreedyBup bup = new GreedyBup(set1, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertEquals(1, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextEmptySimple() {
		GreedyBup bup = new GreedyBup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextNonEmptySimple() {
		GreedyBup bup = new GreedyBup(set1, 1, zv1);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextNonEmptyOrdered() {
		GreedyBup bup = new GreedyBup(set2, 2, zv1);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv2));
		
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));

		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv3));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv2));
		assertTrue(next.get().contains(zv1));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv2));
		assertTrue(next.get().contains(zv3));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv1));
		assertTrue(next.get().contains(zv3));
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testAddEmptySimple() {
		GreedyBup bup = new GreedyBup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
		
		bup.add(zv3);
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertTrue(next.isPresent());
		
		next = bup.next();
		assertTrue(next.isPresent());
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testAddNonEmptySimple() {
		GreedyBup bup = new GreedyBup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
		
		bup.add(zv1);
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
		
		next = bup.next();
		assertEquals(0, next.get().size());
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testAddNonEmptySimpleAddFirst() {
		GreedyBup bup = new GreedyBup(set0, 1, zv1);		
		bup.add(zv1);
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
		
		next = bup.next();
		assertEquals(0, next.get().size());
		
		next = bup.next();
		assertEquals(0, next.get().size());
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testAddNonEmptyOrdered() {
		GreedyBup bup = new GreedyBup(set0, 3, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
		
		bup.add(zv1);
		bup.add(zv2);
		bup.add(zv3);
		
		Optional<Set<ZoneVertex>> next = bup.next();
		//assertEquals(3, next.get().size());		
		assertTrue(next.get().contains(zv2));
		assertTrue(next.get().contains(zv1));
		
		next = bup.next();
		//assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv2));
		assertTrue(next.get().contains(zv1));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv2));
		assertTrue(next.get().contains(zv3));
		
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv2));
		
		next = bup.next();
		//assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv1) || (next.get().contains(zv3)));
		
		next = bup.next();
		//assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1) || (next.get().contains(zv3)));
		
		next = bup.next();
		//assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1) || (next.get().contains(zv3)));
		
		assertEquals(0, bup.next().get().size());
		assertEquals(0, bup.next().get().size());
		assertEquals(0, bup.next().get().size());
		
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testAddNonEmptyOrderedWithInitial() {
		GreedyBup bup = new GreedyBup(set1, 3, zv1);
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(0, next.get().size());
		
		bup.add(zv2);
		bup.add(zv3);
		
		next = bup.next();
		//assertEquals(2, next.get().size());		
		assertTrue(next.get().contains(zv2));
		
		next = bup.next();
		//assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv2));
		
		next = bup.next();
		assertTrue(next.isPresent());
		
		next = bup.next();
		assertTrue(next.isPresent());
		
		next = bup.next();
		assertTrue(next.isPresent());
		
		next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv1));
		assertTrue(next.get().contains(zv2) || (next.get().contains(zv3)));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv1));
		assertTrue(next.get().contains(zv2) || (next.get().contains(zv3)));
		
		next = bup.next();
		assertEquals(3, next.get().size());
		assertTrue(next.get().contains(zv1));
		assertTrue(next.get().contains(zv2));
		assertTrue(next.get().contains(zv3));
		
		assertFalse(bup.next().isPresent());
	}
}
