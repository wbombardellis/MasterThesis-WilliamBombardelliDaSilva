package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;

class VertexImplTest {

	private static Vertex v0;
	private static Vertex cv0;
	private static Vertex v2;
	private static Vertex v3;
	private static Vertex v4;
	private static Symbol lA_n1;
	private static Symbol lB_n1;
	private static Symbol lB_m2;
	private static Symbol lB_n1m2;
	private static Vertex v5;

	@BeforeAll
	static void init() {
		
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
		lB_n1m2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		lB_n1m2.setName("B");
		lB_n1m2.getSuperscript().add("1");
		lB_n1m2.getSubscript().add("n");
		lB_n1m2.getSuperscript().add("2");
		lB_n1m2.getSubscript().add("m");
		
		v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("v0");
		v0.setLabel(EcoreUtil.copy(lA_n1));
		cv0 = GraphgrammarFactory.eINSTANCE.createVertex();
		cv0.setId("v0");
		cv0.setLabel(EcoreUtil.copy(lA_n1));
		v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("v0");
		v2.setLabel(EcoreUtil.copy(lB_n1));
		v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("v0");
		v3.setLabel(EcoreUtil.copy(lB_m2));
		v4 = GraphgrammarFactory.eINSTANCE.createVertex();
		v4.setId("v0");
		v4.setLabel(EcoreUtil.copy(lB_n1m2));
		v5 = GraphgrammarFactory.eINSTANCE.createVertex();
		v5.setId("v0");
		v5.setLabel(EcoreUtil.copy(lB_n1m2));
	}
	
	@Test
	void testEquivalatesTrueOne() {
		assertTrue(v0.equivalates(cv0));
		assertTrue(cv0.equivalates(v0));
		
		assertTrue(v4.equivalates(v5));
		assertTrue(v5.equivalates(v4));
	}
	
	@Test
	void testEquivalatesFalseOne() {
		assertFalse(v0.equivalates(v2));
		assertFalse(v2.equivalates(v0));
		
		assertFalse(v2.equivalates(v3));
		assertFalse(v3.equivalates(v2));
		
		assertFalse(v2.equivalates(v4));
		assertFalse(v4.equivalates(v2));
		
		assertFalse(v3.equivalates(v4));
		assertFalse(v4.equivalates(v3));
	}

}
