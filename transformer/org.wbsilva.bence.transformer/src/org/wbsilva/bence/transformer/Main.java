package org.wbsilva.bence.transformer;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
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
			final String outputGraphPath;
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
				
				if (args.length == i+3) {
					logger.debug("Path to triple graph grammar: " + args[i]);
					logger.debug("Path to input graph: " + args[i+1]);
					logger.debug("Path to output graph: " + args[i+2]);
					tripleGrammarPath = args[i];
					inputGraphPath = args[i+1];
					outputGraphPath = args[i+2];
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
			assert outputGraphPath != null;
			
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
			
			final BeNCETransformer transformer = new BeNCETransformer(tripleGrammar);
			final Optional<TransformationResult> result = transformer.transform(inputGraph, forward);
			
			//Save generated triple graph to file
			if (result.isPresent()) {
				final Resource outputGraphResource = resSet.createResource(URI.createURI(outputGraphPath));
				outputGraphResource.getContents().add(result.get().getTripleGraph());
				outputGraphResource.getContents().add(result.get().getParsingTree());
				
				logger.debug(String.format("Saving generated output triple graph and parsing tree to file %s", outputGraphPath));
				
				try {
					TransformerUtil.saveResourceToFile(outputGraphResource);
				} catch (Exception e) {
					UIUtil.printFail();
					return;
				}
				logger.debug("Results saved successfully to output file");
				
				UIUtil.printFinishSaving();				
			} else {
				logger.debug("Transformation finished withouth success. Nothing to save as output.");
				
				UIUtil.printTransformationFail();
			}
			
			UIUtil.printSuccess();
			logger.debug("=========== Ending Application Successfully ===========");
	}
}
