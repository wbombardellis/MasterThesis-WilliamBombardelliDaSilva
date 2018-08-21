package org.wbsilva.bence.transformer.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.ZoneVertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

class BupTest {

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
		
		zv1.setLabel(l1);
		zv2.setLabel(l2);
		zv3.setLabel(l3);
		
		set1.add(zv1);
		
		set2.add(zv1);
		set2.add(zv2);
		set2.add(zv3);
		
		GraphgrammarUtil.ensureUniqueIds(set2);
	}

	@Test
	void testBupNull() {
		Bup bup = new Bup(null, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testBupNonEmptyZero() {
		Bup bup = new Bup(set1, 0, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testBupNonEmpty() {
		Bup bup = new Bup(set1, 1, zv1);
		assertTrue(bup.next().isPresent());
	}

	@Test
	void testHasNextEmpty() {
		Bup bup = new Bup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testHasNextAfterAdd() {
		Bup bup = new Bup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
		
		bup.add(zv1);
		assertTrue(bup.next().isPresent());
	}
	
	@Test
	void testNextEmpty() {
		Bup bup = new Bup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextNonEmpty() {
		Bup bup = new Bup(set1, 1, zv1);
		assertEquals(0, bup.next().get().size());

		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
	}
	
	@Test
	void testNextAfterAdd() {
		Bup bup = new Bup(set0, 1, zv1);
		assertEquals(0, bup.next().get().size());
		bup.add(zv1);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
	}
	
	@Test
	void testNextAfterNextAfterAdd() {
		Bup bup = new Bup(set1, 2, zv1);
		assertEquals(0, bup.next().get().size());
		
		bup.add(zv2);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1) || next.get().contains(zv2));
		
		Optional<Set<ZoneVertex>> newNext = bup.next();
		assertEquals(1, newNext.get().size());
		assertTrue(newNext.get().contains(zv1) || newNext.get().contains(zv2));
		assertNotEquals(newNext.get(), next.get());
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv1) && next.get().contains(zv2));
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextAfterAddNextAfter() {
		Bup bup = new Bup(set1, 3, zv1);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1));
		
		bup.add(zv2);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> newNext = bup.next();
		assertEquals(1, newNext.get().size());
		assertTrue(newNext.get().contains(zv2));
		
		next = bup.next();
		assertEquals(2, next.get().size());
		assertTrue(next.get().contains(zv1) && next.get().contains(zv2));
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testNextBigSet() {
		Bup bup = new Bup(set2, 3, zv1);
		assertEquals(0, bup.next().get().size());
		
		Optional<Set<ZoneVertex>> next = bup.next();
		assertEquals(1, next.get().size());
		assertTrue(next.get().contains(zv1) || next.get().contains(zv2) || next.get().contains(zv3));
		
		Optional<Set<ZoneVertex>> newNext = bup.next();
		assertEquals(1, newNext.get().size());
		assertTrue(newNext.get().contains(zv1) || newNext.get().contains(zv2) || newNext.get().contains(zv3));
		assertNotEquals(newNext.get(), next.get());
		
		Optional<Set<ZoneVertex>> anotherNewnext = bup.next();
		assertEquals(1, anotherNewnext.get().size());
		assertTrue(anotherNewnext.get().contains(zv1) || anotherNewnext.get().contains(zv2) || anotherNewnext.get().contains(zv3));
		assertNotEquals(anotherNewnext.get(), next.get());
		assertNotEquals(anotherNewnext.get(), newNext.get());
		
		next = bup.next();
		assertEquals(2, next.get().size());
		
		next = bup.next();
		assertEquals(2, next.get().size());
		
		next = bup.next();
		assertEquals(2, next.get().size());
		
		next = bup.next();
		assertEquals(3, next.get().size());
		assertTrue(next.get().contains(zv1) && next.get().contains(zv2) && next.get().contains(zv3));
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testContainsTrue() {
		Bup bup = new Bup(set1, 1, zv1);
		assertTrue(bup.contains(zv1));
	}
	
	@Test
	void testContainsTrueAfterAdd() {
		Bup bup = new Bup(set0, 1, zv1);
		bup.add(zv1);
		assertTrue(bup.contains(zv1));
	}
	
	@Test
	void testContainsTrueAfterNext() {
		Bup bup = new Bup(set1, 1, zv1);
		bup.next();
		assertTrue(bup.contains(zv1));
	}
	
	@Test
	void testContainsFalse() {
		Bup bup = new Bup(set1, 1, zv1);
		assertFalse(bup.contains(zv2));
	}
	
	@Test
	void testContainsFalseEmpty() {
		Bup bup = new Bup(set0, 1, zv1);
		assertFalse(bup.contains(zv1));
	}
	
	@Test
	void testAddExistant() {
		Bup bup = new Bup(set1, 1, zv1);
		bup.add(zv1);
		bup.next();
		bup.next();
		assertFalse(bup.next().isPresent());
	}
	
	@Test
	void testIsParsedTrue() {
		Bup bup = new Bup(set0, 1, zv1);
		bup.add(zv1);
		assertTrue(bup.isParsed());
	}
	
	@Test
	void testIsParsedFalse() {
		Bup bup = new Bup(set0, 1, zv1);
		bup.add(zv2);
		assertFalse(bup.isParsed());
	}

}
