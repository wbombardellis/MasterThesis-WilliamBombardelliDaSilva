/**
  	Copyright © 2018 William Bombardelli da Silva
  	
 	This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
			final String inputModelPath;
			final String inputMetamodelPath;
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
				
				if (args.length == i+4) {
					logger.debug("Path to triple graph grammar: " + args[i]);
					logger.debug("Path to input metamodel: " + args[i+1]);
					logger.debug("Path to input model: " + args[i+2]);
					logger.debug("Path to output graph: " + args[i+3]);
					tripleGrammarPath = args[i];
					inputMetamodelPath = args[i+1];
					inputModelPath = args[i+2];
					outputGraphPath = args[i+3];
				} else {
					logger.error("Wrong amoung of input arguments. Got "+args.length+" arguments. Aborting");
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
			assert inputMetamodelPath != null;
			assert inputModelPath != null;
			assert outputGraphPath != null;
			
			UIUtil.printStartReading();
			
			//Bureaucratic tasks of initialization
			TransformerUtil.registerFactories();
			final ResourceSet resSet = new ResourceSetImpl();
			try {
				TransformerUtil.registerPackages(resSet);
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
				
				if (tripleGrammarResource.getContents().size() > 1) {
					logger.warn("The grammar file has more than one root element. Only the first one will be used. Ignoring the others.");
				}
				
				if (root instanceof TripleGrammar) {
					tripleGrammar = (TripleGrammar) root;
					logger.debug("Triple Grammar model read successfully. Using: "+ tripleGrammar.getName());
				} else {
					logger.error("Missing triple grammar model. The resource file's first element should be a triple grammar, found a "+ root.eClass()+ ". Aborting");
					UIUtil.printFail();
					return;
				}
			}
			assert tripleGrammar != null;
			
			//More Bureaucracy for reading input model with correct metamodel
			try {
				TransformerUtil.registerPackages(resSet, inputMetamodelPath);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			// Read graph model
			final Resource inputGraphResource;
			try {
				inputGraphResource = TransformerUtil.getResourceFromFile(resSet, inputModelPath);
			} catch (Exception e) {
				UIUtil.printFail();
				return;
			}
			final EObject inputModel;
			
			if (inputGraphResource.getContents().size() < 1){
				logger.error("The input graph model is empty. Aborting. Used URL: "+ inputModelPath);
				UIUtil.printFail();
				return;
			} else {
				if (inputGraphResource.getContents().size() > 1) {
					logger.warn("The input graph file has more than one root element. Only the first one will be used. Ignoring the others.");
				}
				
				//Graph resource's first element is the model
				inputModel = inputGraphResource.getContents().get(0);
				
				logger.debug("Graph model read successfully. Using model: "+ inputModel);
			}
			assert inputModel != null;
			
			UIUtil.printAdaptingInput();
			
			//Transform the instance of the input model into a graph
			final Graph inputGraph = new ECore2GraphTransformer().transform(inputModel);
			
			UIUtil.printStartTransforming();
			
			//The actual TGG-driven transformation
			final BeNCETransformer transformer = new BeNCETransformer(tripleGrammar, forward);
			final Optional<TransformationResult> result = transformer.transform(inputGraph);
			
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
