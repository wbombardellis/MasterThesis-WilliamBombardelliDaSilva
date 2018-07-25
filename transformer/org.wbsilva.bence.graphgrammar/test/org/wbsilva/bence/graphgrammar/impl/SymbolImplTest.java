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
		l1.getSubscript().add("B");
		l2.getSubscript().add("A");
		l2.getSubscript().add("B");
		
		assertTrue(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesTrueWithSubscriptUnordered() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSubscript().add("B");
		l2.getSubscript().add("B");
		l2.getSubscript().add("A");
		
		assertTrue(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesFalseWithSubscript() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l1.getSubscript().add("B");
		l2.getSubscript().add("A");
		
		assertFalse(l1.equivalates(l2));
	}
	
	@Test
	void testEquivalatesFalseWithSubscriptsDifferent() {
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		
		l1.setName("L");
		l2.setName("L");
		
		l1.getSubscript().add("A");
		l2.getSubscript().add("B");
		
		assertFalse(l1.equivalates(l2));
	}

}
