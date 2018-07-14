package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

class ZoneVertexImplTest {

	static private ZoneVertex z0;
	private static ZoneVertex z1;
	private static ZoneVertex z2;
	private static ZoneVertex z3;
	private static ZoneVertex z4;
	private static ZoneVertex z5;
	private static ZoneVertex z6;
	
	@BeforeAll
	static void init() {
		
		Symbol l0 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l0.setName("l0");
		Symbol l1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l1.setName("l1");
		Symbol l2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l2.setName("l2");
		Symbol l3 = GraphgrammarFactory.eINSTANCE.createSymbol();
		l3.setName("l3");
		
		z0 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z0.setId("0");
		z0.setLabel(EcoreUtil.copy(l0));
		
		z1 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z1.setId("1");
		z1.setLabel(EcoreUtil.copy(l0));
		
		z2 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z2.setId("2");
		z2.setLabel(EcoreUtil.copy(l1));
		
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("v0");
		v0.setLabel(EcoreUtil.copy(l2));
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("v1");
		v1.setLabel(EcoreUtil.copy(l2));
		Vertex v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("v2");
		v2.setLabel(EcoreUtil.copy(l3));
		
		z3 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z3.setId("3");
		z3.setLabel(EcoreUtil.copy(l0));
		z3.getVertices().add(EcoreUtil.copy(v0));
		
		z4 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z4.setId("4");
		z4.setLabel(EcoreUtil.copy(l0));
		z4.getVertices().add(EcoreUtil.copy(v0));
		z4.getVertices().add(EcoreUtil.copy(v1));
		
		z5 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z5.setId("5");
		z5.setLabel(EcoreUtil.copy(l0));
		z5.getVertices().add(EcoreUtil.copy(v0));
		z5.getVertices().add(EcoreUtil.copy(v1));
		
		z6 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		z6.setId("6");
		z6.setLabel(EcoreUtil.copy(l0));
		z6.getVertices().add(EcoreUtil.copy(v1));
		z6.getVertices().add(EcoreUtil.copy(v2));
	}

	@Test
	void testEquivalatesNull() {
		assertFalse(z0.equivalates(null));
	}
	
	@Test
	void testEquivalatesSame() {
		assertTrue(z0.equivalates(z0));
	}
	
	@Test
	void testEquivalatesSameLabel() {
		assertTrue(z0.equivalates(z1));
	}

	@Test
	void testEquivalatesDifferentLabel() {
		assertFalse(z0.equivalates(z2));
	}
	
	@Test
	void testEquivalatesDifferentVertices() {
		assertFalse(z0.equivalates(z3));
		assertFalse(z3.equivalates(z4));
		assertFalse(z4.equivalates(z6));
		assertFalse(z3.equivalates(z0));
		assertFalse(z4.equivalates(z3));
		assertFalse(z6.equivalates(z4));
	}
	
	@Test
	void testEquivalatesEqualVertices() {
		assertTrue(z4.equivalates(z5));
		assertTrue(z5.equivalates(z4));
	}
}
