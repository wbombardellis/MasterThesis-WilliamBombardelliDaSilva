package org.wbsilva.bence.transformer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
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
		
			final String grammarPath;
			final String inputGraphPath;
			boolean backward = false;
			
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
					logger.debug("Path to graph grammar: " + args[i]);
					logger.debug("Path to input source graph: " + args[i+1]);
					grammarPath = args[i];
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
			assert grammarPath != null;
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
			
			// Read grammar model
			final Resource grammarResource;
			try {
				grammarResource = TransformerUtil.getResourceFromFile(resSet, grammarPath);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			final Grammar grammar;
			
			if (grammarResource.getContents().size() < 1){
				logger.error("The grammar model is empty. Aborting. Used URL: "+ grammarPath);
				UIUtil.printFail();
				return;
			} else {
				//Grammar resource's first element must be a grammar
				final EObject root = grammarResource.getContents().get(0);
				
				if (root instanceof Grammar) {
					grammar = (Grammar) root;
					logger.debug("Grammar model read successfully. Using grammar: "+ grammar.getId() +", name: "+ grammar.getName());
				} else {
					logger.error("Missing grammar model. The grammar resource file's first element should be a grammar, found a "+ root.eClass()+ ". Aborting");
					UIUtil.printFail();
					return;
				}
			}
			assert grammar != null;
			
			//TODO: Read an instance of a model and transform it into a graph
			
			// Read graph model
			final Resource inputGraphResource;
			try {
				inputGraphResource = TransformerUtil.getResourceFromFile(resSet, inputGraphPath);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			final Graph graph;
			
			if (inputGraphResource.getContents().size() < 1){
				logger.error("The input graph model is empty. Aborting. Used URL: "+ inputGraphPath);
				UIUtil.printFail();
				return;
			} else {
				//Graph resource's first element must be a graph
				final EObject root = inputGraphResource.getContents().get(0);
				
				if (root instanceof Graph) {
					graph = (Graph) root;
					logger.debug("Graph model read successfully. Using graph: "+ graph.getId());
				} else {
					logger.error("Missing graph model. The graph resource file's first element should be a graph, found a "+ root.eClass()+ ". Aborting");
					UIUtil.printFail();
					return;
				}
			}
			assert graph != null;
			
			//TODO: Call transformer
			
			
			UIUtil.printSuccess();
	}
}
