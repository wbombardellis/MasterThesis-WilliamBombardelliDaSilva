package org.wbsilva.bence.transformer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

class ECore2GraphTransformerTest {

	private static EObject obj1;
	private static EObject obj2;
	private static EObject obj3;
	private static EObject obj4;
	private static EObject obj5;

	@SuppressWarnings("unchecked")
	@BeforeAll
	static void init() {
		EPackage pkg = EcoreFactory.eINSTANCE.createEPackage();
		pkg.setName("PKG");
		pkg.setNsPrefix("org.wbsilva.mm.test");
		
		EClass clazzA = EcoreFactory.eINSTANCE.createEClass();
		clazzA.setName("A");
		
		pkg.getEClassifiers().add(clazzA);
		
		EReference refB = EcoreFactory.eINSTANCE.createEReference();
		refB.setName("B");
		refB.setContainment(true);
		refB.setChangeable(true);
		refB.setEType(clazzA);
		refB.setUpperBound(-1);
		
		EReference refC = EcoreFactory.eINSTANCE.createEReference();
		refC.setName("C");
		refC.setContainment(false);
		refC.setChangeable(true);
		refC.setEType(clazzA);
		refC.setUpperBound(1);
		
		clazzA.getEStructuralFeatures().add(refB);
		clazzA.getEStructuralFeatures().add(refC);
		
		obj1 = pkg.getEFactoryInstance().create(clazzA);
		
		obj2 = pkg.getEFactoryInstance().create(clazzA);
		obj2.eSet(refC, obj1);
		
		obj3 = pkg.getEFactoryInstance().create(clazzA);
		((List<EObject>)obj3.eGet(refB)).add(obj1);
		obj3.eSet(refC, obj2);
		
		obj4 = pkg.getEFactoryInstance().create(clazzA);
		((List<EObject>)obj4.eGet(refB)).add(obj3);
		((List<EObject>)obj4.eGet(refB)).add(obj4);
		
		obj5 = pkg.getEFactoryInstance().create(clazzA);
	}
	
	
	@Test
	void testTransformOne() {
		ECore2GraphTransformer transformer = new ECore2GraphTransformer();
		E2GTransformationResult r = transformer.transform(obj1);
		Graph g0 = r.getGraph();
		Map<String, Integer> d = r.getDepths();
		
		assertTrue(GraphgrammarUtil.isValidGraph(g0));
		assertEquals(1, g0.getVertices().size());
		assertEquals("A", g0.getVertices().get(0).getLabel().getName());
		assertTrue(0 == d.get(g0.getVertices().get(0).getId()));
	}

	@Test
	void testTransformWithOneChild() {
		ECore2GraphTransformer transformer = new ECore2GraphTransformer();
		E2GTransformationResult r = transformer.transform(obj2);
		Graph g0 = r.getGraph();
		Map<String, Integer> d = r.getDepths();
		
		assertTrue(GraphgrammarUtil.isValidGraph(g0));
		assertEquals(2, g0.getVertices().size());
		assertTrue(g0.getVertices().stream().allMatch(v -> v.getLabel().getName().equals("A")));
		
		assertEquals(1, g0.getEdges().size());
		assertEquals("C", g0.getEdges().get(0).getLabel().getName());
		assertTrue(0 == d.get(g0.getEdges().get(0).getFrom().getId()));
		assertTrue(1 == d.get(g0.getEdges().get(0).getTo().getId()));
	}
	
	@Test
	void testTransformWithNonContainedChildAndLists() {
		ECore2GraphTransformer transformer = new ECore2GraphTransformer();
		E2GTransformationResult r = transformer.transform(obj3);
		Graph g0 = r.getGraph(); 
		Map<String, Integer> d = r.getDepths();
				
		assertTrue(GraphgrammarUtil.isValidGraph(g0));
		assertEquals(3, g0.getVertices().size());
		assertTrue(g0.getVertices().stream().allMatch(v -> v.getLabel().getName().equals("A")));
		
		assertEquals(3, g0.getEdges().size());
		assertTrue(g0.getEdges().stream()
				.allMatch(e -> e.getLabel().getName().equals("B") || e.getLabel().getName().equals("C")));
		
		assertTrue(d.entrySet().stream()
				.noneMatch(e -> !g0.getVertices().stream()
						.map(v -> v.getId())
						.collect(Collectors.toSet())
						.contains(e.getKey())));
	}
	
	@Test
	void testTransformLoop() {
		ECore2GraphTransformer transformer = new ECore2GraphTransformer();
		E2GTransformationResult r = transformer.transform(obj4);
		Graph g0 = r.getGraph();
		Map<String, Integer> d = r.getDepths();
		
		assertTrue(GraphgrammarUtil.isValidGraph(g0, true));
		assertEquals(4, g0.getVertices().size());
		assertTrue(g0.getVertices().stream().allMatch(v -> v.getLabel().getName().equals("A")));
		
		assertEquals(5, g0.getEdges().size());
		assertTrue(g0.getEdges().stream()
				.allMatch(e -> e.getLabel().getName().equals("B") || e.getLabel().getName().equals("C")));
		
		assertTrue(d.entrySet().stream()
					.noneMatch(e -> !g0.getVertices().stream()
							.map(v -> v.getId())
							.collect(Collectors.toSet())
							.contains(e.getKey())));
	}
	
	@Test
	void testTransformNonconnectedGraph() {
		List<EObject> components = new ArrayList<>();
		components.add(obj1);
		components.add(obj5);
		
		ECore2GraphTransformer transformer = new ECore2GraphTransformer();
		E2GTransformationResult r = transformer.transform(components);
		
		Graph g0 = r.getGraph();
		Map<String, Integer> d = r.getDepths();
		
		assertTrue(GraphgrammarUtil.isValidGraph(g0, true));
		assertEquals(2, g0.getVertices().size());
		assertTrue(g0.getVertices().stream().allMatch(v -> v.getLabel().getName().equals("A")));
		
		assertEquals(0, g0.getEdges().size());
		
		assertTrue(d.entrySet().stream()
					.noneMatch(e -> !g0.getVertices().stream()
							.map(v -> v.getId())
							.collect(Collectors.toSet())
							.contains(e.getKey())));
	}
}
