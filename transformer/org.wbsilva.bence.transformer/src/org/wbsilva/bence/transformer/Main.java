package org.wbsilva.bence.transformer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;
import org.wbsilva.bence.transformer.parser.BeNCEParser;
import org.wbsilva.bence.transformer.util.TransformerUtil;
import org.wbsilva.bence.transformer.util.UIUtil;

/**
 * Starting point of the application that transforms an input graph into another graph according to a triple graph grammar
 * @author wbombardellis
 *
 */
public class Main {
	
	static final Logger logger = LogManager.getLogger(Main.class);
	
	/**
	 * Path to the graph grammar metamodel file.
	 * Important: It has to be in the class path
	 */
	private static final String GRAPHGRAMMAR_MM_PATH = "graphgrammar.ecore";
	
	public static void main(String[] args) {
		
			final String tripleGrammarPath;
			final String inputGraphPath;
			boolean backward = false;
			final boolean forward;
			
			logger.debug("=========== Starting Application ===========");
			
			//Input arguments treatment
			if (args.length >= 1) {	
				int i = 0;
				while(UIUtil.isOptionArgument(args[i])) {
					if (args[i].contentEquals(UIUtil.HELP_OPTION)) {
						UIUtil.printUsage();
						return;
					} else if (args[i].contentEquals(UIUtil.BWD_OPTION)){
						backward = true;
					} else if (args[i].contentEquals(UIUtil.FWD_OPTION) ){
						backward = false;
					}
					i++;
				}
				
				if (args.length == i+2) {
					logger.debug("Path to triple graph grammar: " + args[i]);
					logger.debug("Path to input graph: " + args[i+1]);
					tripleGrammarPath = args[i];
					inputGraphPath = args[i+1];
				} else {
					logger.error("Too much input arguments. Got "+args.length+" arguments. Aborting");
					UIUtil.printUsage();
					return;
				}
			} else {
				logger.error("Missing input arguments. Got "+args.length+" arguments. Aborting");
				UIUtil.printUsage();
				return;
			}
			forward = !backward;
			assert tripleGrammarPath != null;
			assert inputGraphPath != null;
			
			UIUtil.printStartReading();
			
			//Bureaucratic tasks of initialization
			TransformerUtil.registerFactories();
			final ResourceSet resSet = new ResourceSetImpl();
			try {
				TransformerUtil.registerPackages(resSet, GRAPHGRAMMAR_MM_PATH);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			
			// Read the triple graph grammar model
			final Resource tripleGrammarResource;
			try {
				tripleGrammarResource = TransformerUtil.getResourceFromFile(resSet, tripleGrammarPath);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			final TripleGrammar tripleGrammar;
			
			if (tripleGrammarResource.getContents().size() < 1){
				logger.error("The grammar model is empty. Aborting. Used URL: "+ tripleGrammarPath);
				UIUtil.printFail();
				return;
			} else {
				//Grammar resource's first element must be a grammar
				final EObject root = tripleGrammarResource.getContents().get(0);
				
				if (root instanceof TripleGrammar) {
					tripleGrammar = (TripleGrammar) root;
					logger.debug("Triple Grammar model read successfully. Using: "+ tripleGrammar.getId() +", name: "+ tripleGrammar.getName());
				} else {
					logger.error("Missing triple grammar model. The resource file's first element should be a triple grammar, found a "+ root.eClass()+ ". Aborting");
					UIUtil.printFail();
					return;
				}
			}
			assert tripleGrammar != null;
			
			//TODO: Read an instance of a model and transform it into a graph
			
			// Read graph model
			final Resource inputGraphResource;
			try {
				inputGraphResource = TransformerUtil.getResourceFromFile(resSet, inputGraphPath);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			final Graph inputGraph;
			
			if (inputGraphResource.getContents().size() < 1){
				logger.error("The input graph model is empty. Aborting. Used URL: "+ inputGraphPath);
				UIUtil.printFail();
				return;
			} else {
				//Graph resource's first element must be a graph
				final EObject root = inputGraphResource.getContents().get(0);
				
				if (root instanceof Graph) {
					inputGraph = (Graph) root;
					logger.debug("Graph model read successfully. Using graph: "+ inputGraph.getId());
				} else {
					logger.error("Missing graph model. The graph resource file's first element should be a graph, found a "+ root.eClass()+ ". Aborting");
					UIUtil.printFail();
					return;
				}
			}
			assert inputGraph != null;
			
			//TODO: Assert grammar is valid
			GraphgrammarUtil.ensureUniqueIds(inputGraph, tripleGrammar);
			
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
			final ParsingTree parsingTree = parser.parse(inputGraph);
			
			//Construct output graph in form of a triple graph
			if (parsingTree != null) {
				final Derivation derivation = parsingTree.derivation();
				
				final TripleGraph tripleGraph = GraphgrammarFactory.eINSTANCE.createTripleGraph();
				logger.debug("Starting final triple graph assembly");
				if (forward) {
					tripleGraph.setSource(inputGraph);
					logger.debug(String.format("Source part added to triple graph: id= %s", inputGraph.getId()));
				} else {
					tripleGraph.setTarget(inputGraph);
					logger.debug(String.format("Target part added to triple graph: id= %s", inputGraph.getId()));
				}
				
				//Produce for each rule used in the parsing the respective target (or source) part of the triple graph
				for (DerivationStep dStep : derivation.getSteps()) {
					final TripleRule tripleRule = tripleGrammar.getTripleRules().parallelStream()
						.filter(tr -> forward ? 
								tr.getSource().getId().equals(dStep.getRule().getId())
								: tr.getTarget().getId().equals(dStep.getRule().getId()))
						.findAny()
						.orElse(null);
					assert tripleRule != null;
					
					tripleGrammar.produce(tripleGraph, tripleRule, forward);
					
					if (forward)
						logger.debug(String.format("Rule [id= %s, name= %s] applied to the triple graph. Target graph size= %s", tripleRule.getSource().getId(), tripleRule.getSource().getName(), tripleGraph.getTarget().getVertices().size()));
					else
						logger.debug(String.format("Rule [id= %s, name= %s] applied to the triple graph. Source graph size= %s", tripleRule.getTarget().getId(), tripleRule.getTarget().getName(), tripleGraph.getSource().getVertices().size()));
					

					//TODO: Save triple graph to file
					//TODO: Save Derivation to file
				}
			} else {
				logger.debug("Could not parse input graph using the input grammar");
			}
			
			UIUtil.printSuccess();
			logger.debug("=========== Ending Application Successfully ===========");
	}
}
