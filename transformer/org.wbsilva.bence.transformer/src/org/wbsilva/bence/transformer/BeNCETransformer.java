package org.wbsilva.bence.transformer;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleGraph;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.transformer.parser.BeNCEParser;

import javafx.util.Pair;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class BeNCETransformer {
	
	static final Logger logger = LogManager.getLogger(BeNCETransformer.class);
	final TripleGrammar tripleGrammar;
	
	public BeNCETransformer(final TripleGrammar tripleGrammar){
		this.tripleGrammar = tripleGrammar;
	}
	
	/**
	 * TODO
	 * @param inputGraph
	 * @param forward
	 */
	public Optional<TransformationResult> transform (final Graph inputGraph, boolean forward){
		//TODO: Assert grammar is valid
		GraphgrammarUtil.ensureUniqueIds(inputGraph, tripleGrammar);
		
		if (forward)
			logger.debug(String.format("Stating forward transformation with input graph %s", inputGraph.getId()));
		else
			logger.debug(String.format("Stating backward transformation with input graph %s", inputGraph.getId()));
		
		//Construct source (or target) input grammar for the parsing of the input graph
		final Grammar inputGrammar;
		inputGrammar = GraphgrammarFactory.eINSTANCE.createGrammar();
		inputGrammar.getTerminals().addAll(EcoreUtil.copyAll(tripleGrammar.getTerminals()));
		inputGrammar.getNonterminals().addAll(EcoreUtil.copyAll(tripleGrammar.getNonterminals()));
		inputGrammar.getAlphabet().addAll(inputGrammar.getTerminals());
		inputGrammar.getAlphabet().addAll(inputGrammar.getNonterminals());
		inputGrammar.setInitial(inputGrammar.getNonterminals().parallelStream()
				.filter(s -> EcoreUtil.equals(s, tripleGrammar.getInitial()))
				.findAny()
				.orElse(null));
		assert inputGrammar.getInitial() != null;
		
		if (forward) {
			inputGrammar.setName(tripleGrammar.getName().concat(" - source"));
			
			for (TripleRule tr : tripleGrammar.getTripleRules()) {
				inputGrammar.getRules().add(EcoreUtil.copy(tr.getSource())); //TODO: Assure deeeeep copy here
			}
			logger.debug("Source grammar generated");
		} else {				
			inputGrammar.setName(tripleGrammar.getName().concat(" - target"));
			
			for (TripleRule tr : tripleGrammar.getTripleRules()) {
				inputGrammar.getRules().add(EcoreUtil.copy(tr.getTarget())); //TODO: Assure deeeeep copy here
			}
			logger.debug("Target grammar generated");
		}
		
		//Parse input graph
		final BeNCEParser parser = new BeNCEParser(inputGrammar);
		final Optional<ParsingTree> parsingTree = parser.parse(inputGraph);
		assert parsingTree != null;
		
		//Construct output graph in form of a triple graph
		if (parsingTree.isPresent()) {
			final Derivation derivation = parsingTree.get().derivation();
			//TODO: Asserts to derivation (at least one step)
			
			logger.debug("Starting final triple graph assembly");
			
			//Set initial state of tripleGraph with initial symbols
			final TripleGraph tripleGraph = createInitialTripleGraph(derivation, forward);
			assert tripleGraph != null;
			
			//Produce for each rule used in the parsing the respective target (or source) part of the triple graph
			for (DerivationStep dStep : derivation.getSteps()) {
				
				tripleGrammar.produce(tripleGraph, dStep, forward);
				
				if (forward)
					logger.debug(String.format("Rule [id= %s, name= %s] applied to the triple graph. Target graph size= %s", dStep.getRule().getId(), dStep.getRule().getName(), tripleGraph.getTarget().getVertices().size()));
				else
					logger.debug(String.format("Rule [id= %s, name= %s] applied to the triple graph. Source graph size= %s", dStep.getRule().getId(), dStep.getRule().getName(), tripleGraph.getSource().getVertices().size()));
	
			}
			
			//TODO: Transform terminal vertices into non-zone-vertices
			
			logger.debug("Final triple grammar assembly finished");
			logger.debug("Transformation finished successfully");
			return Optional.of(new TransformationResult(tripleGraph, parsingTree.get()));
		} else {
			logger.debug("Could not parse input graph using the input grammar");
			logger.debug("Transformation finished without success");
			return Optional.empty();
		}
	}

	private TripleGraph createInitialTripleGraph(final Derivation derivation, final boolean forward) {
		//Input graph set-up
		final Graph inputGraph = EcoreUtil.copy(derivation.getSteps().get(0).getPrevious());
		final TripleGraph tripleGraph = GraphgrammarFactory.eINSTANCE.createTripleGraph();
		if (forward)
			tripleGraph.setSource(inputGraph);
		else
			tripleGraph.setTarget(inputGraph);
		
		
		//Correspondence graph set-up
		final Vertex rootCorrVertex = GraphgrammarFactory.eINSTANCE.createVertex();
		rootCorrVertex.setId(EcoreUtil.generateUUID());
		rootCorrVertex.setLabel(EcoreUtil.copy(this.tripleGrammar.getInitial()));
		
		final Graph initialCorrGraph = GraphgrammarFactory.eINSTANCE.createGraph();
		initialCorrGraph.setId(EcoreUtil.generateUUID());
		initialCorrGraph.getVertices().add(rootCorrVertex);
		
		tripleGraph.setCorr(initialCorrGraph);
		
		//Output graph set-up
		final Vertex rootOutputVertex = GraphgrammarFactory.eINSTANCE.createVertex();
		rootOutputVertex.setId(EcoreUtil.generateUUID());
		rootOutputVertex.setLabel(EcoreUtil.copy(this.tripleGrammar.getInitial()));
		
		final Graph initialOutputGraph = GraphgrammarFactory.eINSTANCE.createGraph();
		initialOutputGraph.setId(EcoreUtil.generateUUID());
		initialOutputGraph.getVertices().add(rootOutputVertex);
		
		if (forward)
			tripleGraph.setTarget(initialOutputGraph);
		else
			tripleGraph.setSource(initialOutputGraph);
		
		//ms and mt morphisms set-up
		//TODO: Assert input graph has only one vertex
		final EMap<Vertex,Vertex> inputMorphism = forward ? tripleGraph.getMs() : tripleGraph.getMt();
		final EMap<Vertex,Vertex> outputMorphism = forward ? tripleGraph.getMt() : tripleGraph.getMs();
		
		inputMorphism.put(rootCorrVertex, inputGraph.getVertices().get(0));
		outputMorphism.put(rootCorrVertex, rootOutputVertex);
		
		return tripleGraph;
	}
}
