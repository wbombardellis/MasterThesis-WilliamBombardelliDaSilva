package org.wbsilva.bence.graphgrammar.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;

class EdgeImplTest {

	private static Edge e0;
	private static Vertex v0;
	private static Vertex v1;
	private static Vertex v2;
	private static Vertex v3;
	private static Edge e00;
	private static Edge e1;
	private static Edge e2;


	@BeforeAll
	static void init() {
		e0 = GraphgrammarFactory.eINSTANCE.createEdge();
		e00 = GraphgrammarFactory.eINSTANCE.createEdge();
		e1 = GraphgrammarFactory.eINSTANCE.createEdge();
		e2 = GraphgrammarFactory.eINSTANCE.createEdge();
		
		Symbol s0 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s0.setName("e0");
		Symbol s1 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s1.setName("a");
		Symbol s2 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s2.setName("b");
		Symbol s3 = GraphgrammarFactory.eINSTANCE.createSymbol();
		s3.setName("e1");
		
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
		
		e1.setLabel(EcoreUtil.copy(s3));
		e1.setFrom(v0);
		e1.setTo(v1);
		
		e2.setLabel(EcoreUtil.copy(s0));
		e2.setFrom(v1);
		e2.setTo(v1);
	}
	
	
	@Test
	void testCompareToSame() {		
		assertEquals(0, e0.compareTo(e0));
	}
	
	@Test
	void testCompareToEquals() {		
		assertEquals(0, e0.compareTo(e00));
	}
	
	@Test
	void testCompareToSmallerEdgeLabel() {		
		assertEquals(-1, e0.compareTo(e1));
	}
	
	@Test
	void testCompareToSmallerVertexLabel() {		
		assertEquals(-1, e0.compareTo(e2));
	}
	
	@Test
	void testCompareToGreaterEdgeLabel() {		
		assertEquals(1, e1.compareTo(e0));
	}
	
	@Test
	void testCompareToGreaterVertexLabel() {		
		assertEquals(1, e2.compareTo(e0));
	}

}
