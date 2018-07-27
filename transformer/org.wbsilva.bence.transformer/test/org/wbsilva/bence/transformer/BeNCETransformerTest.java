package org.wbsilva.bence.transformer;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleGraph;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.transformer.parser.BeNCEParser;

class BeNCETransformerTest {

	private static BeNCETransformer ftransformer;
	private static BeNCETransformer btransformer;
	
	static private TripleGrammar tgg0 = GraphgrammarFactory.eINSTANCE.createTripleGrammar();

	private static Derivation d0;
	
	@BeforeAll
	static void init() {
		Symbol i = GraphgrammarFactory.eINSTANCE.createSymbol();
		i.setName("S");
		Symbol t = GraphgrammarFactory.eINSTANCE.createSymbol();
		t.setName("t");
		tgg0.getAlphabet().add(i);
		tgg0.getAlphabet().add(t);
		tgg0.getNonterminals().add(i);
		tgg0.getTerminals().add(t);
		tgg0.setInitial(i);
		
		ftransformer = new BeNCETransformer(tgg0, true);
		btransformer = new BeNCETransformer(tgg0, false);
		
		d0 = GraphgrammarFactory.eINSTANCE.createDerivation();
		
		DerivationStep s0 = GraphgrammarFactory.eINSTANCE.createDerivationStep();
		Graph g0 = GraphgrammarFactory.eINSTANCE.createGraph();
		Vertex v0 = GraphgrammarFactory.eINSTANCE.createVertex();
		v0.setLabel(EcoreUtil.copy(tgg0.getInitial()));
		v0.setId(EcoreUtil.generateUUID());
		
		g0.getVertices().add(v0);
		
		s0.setPrevious(g0);
		s0.setVertex(EcoreUtil.copy(v0));
		d0.getSteps().add(s0);
	}
	
	@Test
	void testCreateInitialTripleGraphForward() {
		
		TripleGraph tgg = ftransformer.createInitialTripleGraph(d0);
		
		assertTrue(GraphgrammarUtil.isValidTripleGraph(tgg));
		
		assertTrue(tgg.getSource().isomorphicTo(d0.getSteps().get(0).getPrevious()));
		
		assertEquals(1, tgg.getSource().getVertices().size());
		assertEquals(1, tgg.getCorr().getVertices().size());
		assertEquals(1, tgg.getTarget().getVertices().size());
		
		assertTrue(EcoreUtil.equals(tgg0.getInitial(), tgg.getSource().getVertices().get(0).getLabel()));
		assertTrue(EcoreUtil.equals(tgg0.getInitial(), tgg.getCorr().getVertices().get(0).getLabel()));
		assertTrue(EcoreUtil.equals(tgg0.getInitial(), tgg.getTarget().getVertices().get(0).getLabel()));
		
		assertEquals(tgg.getSource().getVertices().get(0), tgg.getMs().get(tgg.getCorr().getVertices().get(0)));
		assertEquals(tgg.getTarget().getVertices().get(0), tgg.getMt().get(tgg.getCorr().getVertices().get(0)));		
	}

	@Test
	void testCreateInitialTripleGraphBackward() {
		
		
		TripleGraph tgg = btransformer.createInitialTripleGraph(d0);
		
		assertTrue(GraphgrammarUtil.isValidTripleGraph(tgg));
		
		assertTrue(tgg.getTarget().isomorphicTo(d0.getSteps().get(0).getPrevious()));
		
		assertEquals(1, tgg.getSource().getVertices().size());
		assertEquals(1, tgg.getCorr().getVertices().size());
		assertEquals(1, tgg.getTarget().getVertices().size());
		
		assertTrue(EcoreUtil.equals(tgg0.getInitial(), tgg.getSource().getVertices().get(0).getLabel()));
		assertTrue(EcoreUtil.equals(tgg0.getInitial(), tgg.getCorr().getVertices().get(0).getLabel()));
		assertTrue(EcoreUtil.equals(tgg0.getInitial(), tgg.getTarget().getVertices().get(0).getLabel()));
		
		assertEquals(tgg.getSource().getVertices().get(0), tgg.getMs().get(tgg.getCorr().getVertices().get(0)));
		assertEquals(tgg.getTarget().getVertices().get(0), tgg.getMt().get(tgg.getCorr().getVertices().get(0)));		
	}
}
