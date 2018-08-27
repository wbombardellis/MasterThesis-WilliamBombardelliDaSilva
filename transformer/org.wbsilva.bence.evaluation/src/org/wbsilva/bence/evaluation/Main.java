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

package org.wbsilva.bence.evaluation;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.transformer.BeNCETransformer;
import org.wbsilva.bence.transformer.ECore2GraphTransformer;
import org.wbsilva.bence.transformer.TransformationResult;
import org.wbsilva.bence.transformer.util.TransformerUtil;

/**
 * Starting point of the evaluation application for the {@link BeNCETransformer}
 * @author wbombardellis
 *
 */
public class Main {
	static final Logger logger = LogManager.getLogger(Main.class);
	
	private static Map<TGGSpecification, IInputSpecification> workLoad = new HashMap<>();
	private final static ResourceSet resSet; 
	
	static {
		//Bureaucratic tasks of initialization
		TransformerUtil.registerFactories();
		resSet = new ResourceSetImpl();
		try {
			TransformerUtil.registerPackages(resSet);
			
			workLoad.put(
					new TGGSpecification("../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/model/Sourcecode2controlflow.xmi",
							"../../metamodels/org.wbsilva.mm.sourcecode/model/Sourcecode.ecore", true),
					new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/instances/evaluation/Src00.xmi"))
					);
			/*workLoad.put(
					new TGGSpecification("../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/model/Sourcecode2controlflow.xmi",
							"../../metamodels/org.wbsilva.mm.controlflow/model/Controlflow.ecore", false),
					new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/instances/evaluation/Trg00.xmi"))
					);*/
		} catch (Exception e) {
			workLoad = null;
		}
	}

	public static void main(String[] args) {
		logger.debug("=========== Starting Evaluation ===========");
		
		if (workLoad == null) {
			logger.error("Initialization failed. Work load is null. Aborting.");
			return;
		}
		
		//For each transformation job
		for (Entry<TGGSpecification, IInputSpecification> job : workLoad.entrySet()) {
			try {
				
				
				//Read input grammar
				final Optional<TripleGrammar> benceTGGOpt = TransformerUtil.loadModel(resSet, job.getKey().getBenceTGGPath(), TripleGrammar.class);
				
				if (benceTGGOpt.isPresent()) {
					final TripleGrammar benceTGG = benceTGGOpt.get();
					assert benceTGG != null;
					logger.debug("Triple graph grammar model read successfully. Using: "+ benceTGG.getName());
					
					
					
					//The transformer eagerly initialized
					final BeNCETransformer transformer = new BeNCETransformer(benceTGG, job.getKey().getForward());
					
					TransformerUtil.registerPackages(resSet, job.getKey().getMmPath());
					
					
					//Obtain input model
					final Iterator<Optional<EObject>> it = job.getValue().iterator();
					while(it.hasNext()) {
						final Optional<EObject> inputModelOpt = it.next();
						
						if (inputModelOpt.isPresent()) {
							final EObject inputModel = inputModelOpt.get();
							assert inputModel != null;
							logger.debug("Graph model read successfully. Using model: "+ inputModel);
							
							
							
							///////Evaluate BeNCE TGG transformer
							logger.debug("=== Starting BeNCE Evaluation ===");
							final Graph inputGraph = new ECore2GraphTransformer().transform(inputModel);
							
							//Actual transformation and time measurement
							ThreadMXBean bean = ManagementFactory.getThreadMXBean();
							long start = bean.getCurrentThreadCpuTime();
							final Optional<TransformationResult> result = transformer.transform(inputGraph);
							long elapsedTime = bean.getCurrentThreadCpuTime() - start;
							
							if (result.isPresent()) {
								logger.info(String.format("BeNCE transformation of %s with grammar %s finished successfully.", inputModel, benceTGG.getName()));
							} else {
								logger.info(String.format("BeNCE transformation of %s with grammar %s finished withouth success.", inputModel, benceTGG.getName()));
							}
							logger.info(String.format("BeNCE transformation, elapsed time: %f s", elapsedTime / 1000000000.0));
							logger.debug("=== Finihed BeNCE Evaluation ===");
							
							
							
							
							///////Evaluate eMoflon TGG transformer
							//TODO:
							
							
							
							
							///////Future work: Compare results using isomorphism check
							
						} else {
							logger.warn("Skipping evaluation for an input model");
						}
					}
				} else {
					logger.warn("Skipping evaluation for triple graph grammar in file"+ job.getKey().getBenceTGGPath());
				}
			} catch (Exception e) {
				//Errors has been logged in the read method
				continue;
			}
		}
		//TODO: Log total tests
		logger.debug("=========== Ending Evaluation Successfully ===========");
	}

}
