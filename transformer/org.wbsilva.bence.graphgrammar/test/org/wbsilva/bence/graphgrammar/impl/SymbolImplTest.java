package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;

class SymbolImplTest {

	@Test
	void testEquivalatesTrueEmpty() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		assertTrue(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesFalseName() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("M");
		
		assertFalse(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesTrueName() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		assertTrue(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesTrueWithSubscript() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l1.getSubscript().add("B");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		l2.getSubscript().add("B");
		l2.getSuperscript().add("1");
		
		assertTrue(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesTrueWithSubscriptUnordered() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l1.getSubscript().add("B");
		l1.getSuperscript().add("2");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		l2.getSubscript().add("B");
		l2.getSuperscript().add("2");
		
		assertTrue(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesFalseWithSubscript() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l1.getSubscript().add("B");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		
		assertFalse(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesFalseWithSubscriptsDifferent() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("B");
		l2.getSuperscript().add("A");
		
		assertFalse(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesFalseWithSuperscriptsDifferent() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("2");
		
		assertFalse(l1.equivalates(l2));
	}
	
	@Test
	void testCompareToEqual() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		
		assertEquals(0, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToEqualMany() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l1.getSubscript().add("B");
		l1.getSuperscript().add("2");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		l2.getSubscript().add("B");
		l2.getSuperscript().add("2");
		
		assertEquals(0, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToDifferentOrderMany() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("2");
		l1.getSubscript().add("B");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		l2.getSubscript().add("B");
		l2.getSuperscript().add("2");
		
		assertEquals(1, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToEqualsDifferentOrderMany() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("2");
		l1.getSubscript().add("B");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("B");
		l2.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("2");
		
		assertEquals(0, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToLessThan() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("M");
		
		assertEquals(-1, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToLessThanWithSuperSubScripts() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("2");
		
		assertEquals(-1, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToGreaterThanWithSuperSubScripts() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("0");
		
		assertEquals(1, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToLessThanWithSuperSubScriptsDifferentSizes() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("1");
		l2.getSubscript().add("A");
		l2.getSuperscript().add("2");
		
		assertEquals(-1, l1.compareTo(l2));
	}
	
	@Test
	void testCompareToGreaterThanWithSuperSubScriptsDifferentSizes() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l2.getSubscript().add("A");
		l2.getSuperscript().add("0");
		
		assertEquals(-1, l1.compareTo(l2));
	}

}
