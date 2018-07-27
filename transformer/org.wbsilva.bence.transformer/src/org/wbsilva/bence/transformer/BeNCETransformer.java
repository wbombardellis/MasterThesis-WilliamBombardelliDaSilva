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
import org.wbsilva.bence.graphgrammar.util.NPUtil;
import org.wbsilva.bence.transformer.parser.BeNCEParser;

/**
 * This class implements a B-eNCE triple graph grammar transformer, that transforms an input graph (source or target)
 * into an output graph (target or source) according to the relations described by a triple graph grammar.
 * @author wbombardellis
 *
 */
public class BeNCETransformer {
	
	static final Logger logger = LogManager.getLogger(BeNCETransformer.class);
	private final TripleGrammar tripleGrammar;
	
	public BeNCETransformer(final TripleGrammar tripleGrammar){
		assert tripleGrammar != null;
		this.tripleGrammar = tripleGrammar;
	}
	
	/**
	 * Use {@code inputGraph} to create an output graph such that the triple graph composed of these graphs 
	 * conforms to the {@code tripleGrammar} of this class.
	 * That is, this method transforms the {@code inputGraph} into an output graph and returns 
	 * the triple graph containing a copy of boths. The id's of the {@code inputGraph}'s copy are changed and unique, 
	 * so this transformation is not incremental because both sides are created from scratch.
	 * If {@code forward} is true, then {@code inputGraph} is used as source graph and it creates a target graph.
	 * Otherwise, {@code inputGraph} is used as target graph and a source graph is created.
	 * Important: This transformer can only work with boundary triple graph grammar and graphs. 
	 * So, if its TGG or the input graph is not boundary, then it returns empty.
	 * 
	 * @param inputGraph		The input graph to be transformed. Cannot be null.
	 * @param forward			Flag to signalize whether it is a forward or backward transformation 
	 * @return 					An optional of a transformation result containing the created triple graph and 
	 * 							the parsing tree generated during parsing of the input, in case of success. Empty otherwise.
	 */
	public Optional<TransformationResult> transform (final Graph inputGraph, boolean forward){
		assert inputGraph != null;
		
		//GraphgrammarUtil.ensureUniqueIds(inputGraph, tripleGrammar);
		
		if (!GraphgrammarUtil.isValidTripleGrammar(tripleGrammar)) {
			logger.warn(String.format("Triple Grammar %s is not valid. Cannot transform. Aborting.", tripleGrammar.getName()));
			return Optional.empty();
		} else if (!GraphgrammarUtil.isBoundaryTripleGrammar(tripleGrammar)) {
			logger.warn(String.format("Triple Grammar %s is not boundary. Cannot transform. Aborting.", tripleGrammar.getName()));
			return Optional.empty();
		} else if (!GraphgrammarUtil.isValidGraph(inputGraph)) {
			logger.warn(String.format("Input graph %s is not valid. Cannot transform. Aborting.", inputGraph));
			return Optional.empty();
		} else if (!GraphgrammarUtil.isBoundaryGraph(inputGraph, tripleGrammar.getNonterminals())) {
			logger.warn(String.format("Input graph %s is not boundary. Cannot transform. Aborting.", inputGraph));
			return Optional.empty();
		} else {
			
			if (!GraphgrammarUtil.isWeaklyConnectedGraph(inputGraph)) {
				logger.warn(String.format("Input graph %s is not weakly connected. Transformation in polynomial time not guaranteed. Continuing.", inputGraph));
			}			
			
			if (forward)
				logger.debug(String.format("Stating forward transformation with input graph %s", inputGraph));
			else
				logger.debug(String.format("Stating backward transformation with input graph %s", inputGraph));
			
			//Construct source (or target) input grammar for the parsing of the input graph
			final Grammar inputGrammar;
			inputGrammar = GraphgrammarFactory.eINSTANCE.createGrammar();
			inputGrammar.getTerminals().addAll(EcoreUtil.copyAll(tripleGrammar.getTerminals()));
			inputGrammar.getNonterminals().addAll(EcoreUtil.copyAll(tripleGrammar.getNonterminals()));
			inputGrammar.getAlphabet().addAll(inputGrammar.getTerminals());
			inputGrammar.getAlphabet().addAll(inputGrammar.getNonterminals());
			inputGrammar.setInitial(inputGrammar.getNonterminals().stream()
					.filter(s -> s.equivalates(tripleGrammar.getInitial()))
					.findAny()
					.orElse(null));
			
			if (forward) {
				inputGrammar.setName(tripleGrammar.getName().concat(" - source"));
				
				for (TripleRule tr : tripleGrammar.getTripleRules()) {
					inputGrammar.getRules().add(EcoreUtil.copy(tr.getSource()));
				}
				logger.debug("Source grammar generated");
			} else {				
				inputGrammar.setName(tripleGrammar.getName().concat(" - target"));
				
				for (TripleRule tr : tripleGrammar.getTripleRules()) {
					inputGrammar.getRules().add(EcoreUtil.copy(tr.getTarget()));
				}
				logger.debug("Target grammar generated");
			}
			
			//Make grammar neighborhood preserving
			new NPNormalizer().normalize(inputGrammar);
			
			assert GraphgrammarUtil.isValidGrammar(inputGrammar);
			assert GraphgrammarUtil.isBoundaryGrammar(inputGrammar);
			assert NPUtil.isNeighborhoodPreserving(inputGrammar);
			
			//Parse input graph
			final BeNCEParser parser = new BeNCEParser(inputGrammar);
			final Optional<ParsingTree> parsingTree = parser.parse(inputGraph);
			assert parsingTree != null;
			
			//Construct output graph in form of a triple graph
			if (parsingTree.isPresent()) {
				final Derivation derivation = parsingTree.get().derivation();
				assert GraphgrammarUtil.isValidDerivation(derivation);
				
				logger.debug("Starting final triple graph assembly");
				
				//Set initial state of tripleGraph with initial symbols
				final TripleGraph tripleGraph = createInitialTripleGraph(derivation, forward);
				assert tripleGraph != null;
				assert GraphgrammarUtil.isValidTripleGraph(tripleGraph);
				
				//Produce for each rule used in the parsing the respective target (or source) part of the triple graph
				for (DerivationStep dStep : derivation.getSteps()) {
					assert dStep != null;
					
					final int oldTargetSize = forward ? tripleGraph.getTarget().getVertices().size()
							: tripleGraph.getSource().getVertices().size();
					
					tripleGrammar.produce(tripleGraph, dStep, forward);
					
					assert forward ? tripleGraph.getTarget().getVertices().size() >= oldTargetSize 
							: tripleGraph.getSource().getVertices().size()  >= oldTargetSize;
					
					if (forward)
						logger.debug(String.format("Rule [id = %s, name = %s] applied to the triple graph. Target graph size = %s", dStep.getRule().getId(), dStep.getRule().getName(), tripleGraph.getTarget().getVertices().size()));
					else
						logger.debug(String.format("Rule [id = %s, name = %s] applied to the triple graph. Source graph size = %s", dStep.getRule().getId(), dStep.getRule().getName(), tripleGraph.getSource().getVertices().size()));
		
				}
				
				logger.debug("Final triple grammar assembly finished");
				logger.debug("Transformation finished successfully");
				return Optional.of(new TransformationResult(tripleGraph, parsingTree.get()));
			} else {
				logger.debug("Could not parse input graph using the input grammar");
				logger.debug("Transformation finished without success");
				return Optional.empty();
			}
			
		}
	}

	/**
	 * Create a trivial consistent triple graph containing a copy of the first graph of the correct {@code derivation}
	 * as the source part if {@code forward} is true and as the target part otherwise. IDs are maintained equal.
	 * Notice that the if the derivation is correct, the first graph should be a graph with only one vertex labeled with the initial symbol.
	 * 
	 * The resulting triple graph contains also the correspondence part and morphisms.
	 * 
	 * @param derivation		The derivation of a parsing, from which the source or target graph are obtained. Cannot be null.
	 * @param forward			Flag to signalize whether to use the first graph from the {@code derivation} as source or target.
	 * 							If true, than as source. Otherwise as target 
	 * @return					The created triple graph
	 */
	TripleGraph createInitialTripleGraph(final Derivation derivation, final boolean forward) {
		assert derivation != null;
		assert !derivation.getSteps().isEmpty();
		assert tripleGrammar.getInitial().equivalates(derivation.getSteps().get(0).getVertex().getLabel());
		assert derivation.getSteps().get(0).getPrevious().getVertices().size() == 1;
		assert derivation.getSteps().get(0).getPrevious().getVertices().get(0).equivalates(derivation.getSteps().get(0).getVertex());
		
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
		initialCorrGraph.getVertices().add(rootCorrVertex);
		
		tripleGraph.setCorr(initialCorrGraph);
		
		//Output graph set-up
		final Vertex rootOutputVertex = GraphgrammarFactory.eINSTANCE.createVertex();
		rootOutputVertex.setId(EcoreUtil.generateUUID());
		rootOutputVertex.setLabel(EcoreUtil.copy(this.tripleGrammar.getInitial()));
		
		final Graph initialOutputGraph = GraphgrammarFactory.eINSTANCE.createGraph();
		initialOutputGraph.getVertices().add(rootOutputVertex);
		
		if (forward)
			tripleGraph.setTarget(initialOutputGraph);
		else
			tripleGraph.setSource(initialOutputGraph);
		
		//ms and mt morphisms set-up
		final EMap<Vertex,Vertex> inputMorphism = forward ? tripleGraph.getMs() : tripleGraph.getMt();
		final EMap<Vertex,Vertex> outputMorphism = forward ? tripleGraph.getMt() : tripleGraph.getMs();
		
		inputMorphism.put(rootCorrVertex, inputGraph.getVertices().get(0));
		outputMorphism.put(rootCorrVertex, rootOutputVertex);
		
		return tripleGraph;
	}
}
