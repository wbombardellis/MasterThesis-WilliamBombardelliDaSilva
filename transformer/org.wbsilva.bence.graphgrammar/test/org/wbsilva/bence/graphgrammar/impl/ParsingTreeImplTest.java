package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

class ParsingTreeImplTest {

	static private DerivationStep dS0;
	static private ParsingTree pt0;
	static private ParsingTree pt1;
	static private ParsingTree pt2;
	static private ParsingTree pt3;
	static private DerivationStep dS1;
	static private DerivationStep dS2;
	static private DerivationStep dS3;
	
	@BeforeAll
	static void init() {
		dS0 = GraphgrammarFactory.eINSTANCE.createDerivationStep();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setId("0");
		dS0.setVertex(v0);
		dS1 = GraphgrammarFactory.eINSTANCE.createDerivationStep();
		Vertex v1 = GraphgrammarFactory.eINSTANCE.createVertex();
		v1.setId("1");
		dS0.setVertex(v1);
		dS2 = GraphgrammarFactory.eINSTANCE.createDerivationStep();
		Vertex v2 = GraphgrammarFactory.eINSTANCE.createVertex();
		v2.setId("2");
		dS0.setVertex(v2);
		dS3 = GraphgrammarFactory.eINSTANCE.createDerivationStep();
		Vertex v3 = GraphgrammarFactory.eINSTANCE.createVertex();
		v3.setId("3");
		dS0.setVertex(v3);
		
		pt0 = GraphgrammarFactory.eINSTANCE.createParsingTree();
		ZoneVertex z0 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		pt0.setZoneVertex(z0);
		pt1 = GraphgrammarFactory.eINSTANCE.createParsingTree();
		ZoneVertex z1 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		pt1.setZoneVertex(z1);
		pt2 = GraphgrammarFactory.eINSTANCE.createParsingTree();
		ZoneVertex z2 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		pt2.setZoneVertex(z2);
		pt3 = GraphgrammarFactory.eINSTANCE.createParsingTree();
		ZoneVertex z3 = GraphgrammarFactory.eINSTANCE.createZoneVertex();
		pt3.setZoneVertex(z3);
		
		pt0.setDerivationStep(dS0);
		pt1.setDerivationStep(dS1);
		pt2.setDerivationStep(dS2);
		pt3.setDerivationStep(dS3);
		
		pt0.getChildren().add(pt1);
		pt0.getChildren().add(pt2);
		pt2.getChildren().add(pt3);
	}

	@Test
	void testDerivationEmpty() {
		Derivation d = pt3.derivation();
		
		assertEquals(1, d.getSteps().size());
		assertTrue(EcoreUtil.equals(dS3, d.getSteps().get(0)));
	}
	
	@Test
	void testDerivationOne() {
		Derivation d = pt2.derivation();
		
		assertEquals(2, d.getSteps().size());
		assertTrue(EcoreUtil.equals(dS2, d.getSteps().get(0)));
		assertTrue(EcoreUtil.equals(dS3, d.getSteps().get(1)));
	}
	
	@Test
	void testDerivationMany() {
		Derivation d = pt0.derivation();
		
		assertEquals(4, d.getSteps().size());
		assertTrue(EcoreUtil.equals(dS0, d.getSteps().get(0)));
		assertTrue(EcoreUtil.equals(dS1, d.getSteps().get(1)) || EcoreUtil.equals(dS1, d.getSteps().get(2)) || EcoreUtil.equals(dS1, d.getSteps().get(3)));
		assertTrue(EcoreUtil.equals(dS2, d.getSteps().get(1)) || EcoreUtil.equals(dS2, d.getSteps().get(2)));
		assertTrue(EcoreUtil.equals(dS2, d.getSteps().get(2)) || EcoreUtil.equals(dS3, d.getSteps().get(3)));
	}

}
