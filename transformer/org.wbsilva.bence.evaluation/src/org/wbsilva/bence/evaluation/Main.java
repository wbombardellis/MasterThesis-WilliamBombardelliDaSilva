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
import org.wbsilva.bence.evaluation.adapter.EMoflonAdapter;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.transformer.BeNCETransformationRequest;
import org.wbsilva.bence.transformer.BeNCETransformer;
import org.wbsilva.bence.transformer.E2GTransformationResult;
import org.wbsilva.bence.transformer.ECore2GraphTransformer;
import org.wbsilva.bence.transformer.BeNCETransformationResult;
import org.wbsilva.bence.transformer.util.TransformerUtil;
import org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage;
import org.wbsilva.bx.class2database.Class2databasePackage;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage;
import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage;

import btree.BtreePackage;
import class_.ClassPackage;
import controlflow.ControlflowPackage;
import database.DatabasePackage;
import graph.GraphPackage;
import petrinet.PetrinetPackage;
import sourcecode.SourcecodePackage;
import statemachine.StatemachinePackage;
import xbtree.XbtreePackage;

/**
 * Starting point of the evaluation application for the {@link BeNCETransformer}
 * @author wbombardellis
 *
 */
public class Main {
	static final Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		Map<TGGSpecification, IInputSpecification> workLoad = new HashMap<>();
		
		//Bureaucratic tasks of initialization
		TransformerUtil.registerFactories();
		final ResourceSet resSet = new ResourceSetImpl();
		try {
			TransformerUtil.registerPackages(resSet);
			
			workLoad.put(new TGGSpecification(GraphPackage.eINSTANCE, GraphPackage.eINSTANCE,
						"../../bence/org.wbsilva.bence.bx.star2wheel/model/Star2wheel.xmi",
						null, null, true),
						new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.star2wheel/instances/evaluation/Src00.xmi")));
			workLoad.put(new TGGSpecification(SourcecodePackage.eINSTANCE, ControlflowPackage.eINSTANCE,
							"../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/model/Sourcecode2controlflow.xmi",
							Sourcecode2controlflowPackage.eINSTANCE, "../../tgg/org.wbsilva.bx.sourcecode2controlflow", true),
						new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/instances/evaluation/Src00.xmi",
																		   "../../bence/org.wbsilva.bence.bx.sourcecode2controlflow/instances/evaluation/Src01.xmi")));
			workLoad.put(new TGGSpecification(BtreePackage.eINSTANCE, XbtreePackage.eINSTANCE,
						"../../bence/org.wbsilva.bence.bx.btree2xbtree/model/Btree2xbtree.xmi",
						Btree2xbtreePackage.eINSTANCE, "../../tgg/org.wbsilva.bx.btree2xbtree", true),
						new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.btree2xbtree/instances/evaluation/Src00.xmi",
																	   "../../bence/org.wbsilva.bence.bx.btree2xbtree/instances/evaluation/Src01.xmi")));
			workLoad.put(new TGGSpecification(ClassPackage.eINSTANCE, DatabasePackage.eINSTANCE,
					"../../bence/org.wbsilva.bence.bx.class2database/model/Class2database.xmi",
					Class2databasePackage.eINSTANCE, "../../tgg/org.wbsilva.bx.class2database", true),
				new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.class2database/instances/evaluation/Src00.xmi")));
			workLoad.put(new TGGSpecification(StatemachinePackage.eINSTANCE, PetrinetPackage.eINSTANCE,
					"../../bence/org.wbsilva.bence.bx.statemachine2petrinet/model/Statemachine2petrinet.xmi",
					Statemachine2petrinetPackage.eINSTANCE, "../../tgg/org.wbsilva.bx.statemachine2petrinet", true),
				new StaticInputSpecification(resSet, Arrays.asList("../../bence/org.wbsilva.bence.bx.statemachine2petrinet/instances/evaluation/Src00.xmi")));
		} catch (Exception e) {
			workLoad = null;
		}
				
		logger.debug("========================= Starting Evaluation =========================");
		
		if (workLoad == null) {
			logger.error("Initialization failed. Work load is null. Aborting.");
			return;
		}
		
		long benceTime = 0;
		int benceRuns = 0;
		int benceSuccess = 0;
		int benceUnsuccess = 0;
		
		long eMoflonTime = 0;
		int eMoflonRuns = 0;
		int eMoflonSuccess = 0;
		int eMoflonUnsuccess = 0;
		
		//For each transformation job
		for (Entry<TGGSpecification, IInputSpecification> job : workLoad.entrySet()) {
			try {
				logger.debug("================ Begin Job ================");
				final TGGSpecification tggSpec = job.getKey();
				
				//Read input grammar
				final Optional<TripleGrammar> benceTGGOpt = TransformerUtil.loadModel(resSet, tggSpec.getBenceTGGPath(), TripleGrammar.class);
				
				if (benceTGGOpt.isPresent()) {
					final TripleGrammar benceTGG = benceTGGOpt.get();
					assert benceTGG != null;
					logger.debug("Triple graph grammar model read successfully. Using: "+ benceTGG.getName());
					
					TransformerUtil.registerPackages(resSet, tggSpec.getSourcePackage());
					TransformerUtil.registerPackages(resSet, tggSpec.getTargetPackage());
					
					///////Evaluate BeNCE TGG transformer
					final BeNCETransformer benceTransformer = new BeNCETransformer(benceTGG, tggSpec.getForward());
					int run = 0;
					
					final Iterator<Optional<EObject>> it = job.getValue().iterator();
					while(it.hasNext()) {
						final Optional<EObject> inputModelOpt = it.next();
						
						if (inputModelOpt.isPresent()) {
							final EObject inputModel = inputModelOpt.get();
							try {
								assert inputModel != null;
								logger.debug("Graph model read successfully. Using model: "+ inputModel);
								logger.debug(String.format("=== Starting BeNCE Evaluation %d ===", run));
								
								final E2GTransformationResult e2g = new ECore2GraphTransformer().transform(inputModel);
								final BeNCETransformationRequest request = new BeNCETransformationRequest(e2g.getGraph(), e2g.getDepths());
								
								//Actual transformation and time measurement
								long start = getTime();
								final Optional<BeNCETransformationResult> benceResult = benceTransformer.transform(request);
								long elapsedTime = getTime() - start;
								
								benceTime += elapsedTime;
								benceRuns++;
								if (benceResult.isPresent()) {
									logger.info(String.format("BeNCE transformation of %s with grammar %s finished successfully.", inputModel, benceTGG.getName()));
									benceSuccess++;
								} else {
									logger.info(String.format("BeNCE transformation of %s with grammar %s finished withouth success.", inputModel, benceTGG.getName()));
									benceUnsuccess++;
								}
								logger.info(String.format("BeNCE transformation, elapsed time: %f s", elapsedTime / 1e9));
								logger.debug(String.format("=== Finished BeNCE Evaluation %d ===", run));								
							} catch (Exception ex) {
								logger.error(String.format("A unexpected exception occurred during the transformation of model %s"
										+ ". Skipping it. Exception: %s", inputModel, ex));
							}
						} else {
							logger.warn(String.format("Run %d. Skipping evaluation for an input model. Was empty.", run));
						}

						run++;
					}

					///////Evaluate eMoflon TGG transformer
					if (tggSpec.getEMoflonTGGPackage() != null && tggSpec.getEMoflonTGGPath() != null) {
						final EMoflonAdapter eMoflonTransformer = new EMoflonAdapter(resSet, tggSpec.getEMoflonTGGPackage(), tggSpec.getEMoflonTGGPath(), tggSpec.getForward());
						
						run = 0;
						final Iterator<Optional<EObject>> eit = job.getValue().iterator();
						while(eit.hasNext()) {
							final Optional<EObject> inputModelOpt = eit.next();
							
							if (inputModelOpt.isPresent()) {
								final EObject inputModel = inputModelOpt.get();
								try {
									assert inputModel != null;
									logger.debug("Graph model read successfully. Using model: "+ inputModel);
									logger.debug(String.format("=== Starting eMoflon Evaluation %d ===", run));
									
									//Actual transformation and time measurement
									long start = getTime();
									final Optional<BeNCETransformationResult> eMoflonResult = eMoflonTransformer.transform(inputModel);
									long elapsedTime = getTime() - start;
									
									eMoflonTime += elapsedTime;
									eMoflonRuns++;
									if (eMoflonResult.isPresent()) {
										logger.info(String.format("eMoflon transformation of %s with grammar %s finished successfully.", inputModel, benceTGG.getName()));
										eMoflonSuccess++;
									} else {
										logger.info(String.format("eMoflon transformation of %s with grammar %s finished withouth success.", inputModel, benceTGG.getName()));
										eMoflonUnsuccess++;
									}
									logger.info(String.format("eMoflon transformation, elapsed time: %f s", elapsedTime / 1e9));
									logger.debug(String.format("=== Finished eMoflon Evaluation %d ===", run));
								} catch (Exception ex) {
									logger.error(String.format("A unexpected exception occurred during the transformation of model %s"
											+ ". Skipping it. Exception: %s", inputModel, ex));
								}
							} else {
								logger.warn(String.format("Run %d. Skipping evaluation for an input model. Was empty.", run));
							}
	
							run++;
						}
					} else {
						logger.warn("Skipping evaluation for eMoflon comparable to " + tggSpec.getBenceTGGPath());
					}
				
					///////Future work: Compare results using isomorphism check
					
				} else {
					logger.warn("Skipping evaluation for triple graph grammar in file "+ tggSpec.getBenceTGGPath());
				}
				logger.debug("================ End Job ================");
			} catch (Exception e) {
				//Errors has been logged in the read method
				continue;
			}
		}

		logger.debug("##############################");
		logger.debug("### Results for BeNCE ###");
		logger.debug(String.format("Total runs: %d", benceRuns));
		logger.debug(String.format("Total successful: %d", benceSuccess));
		logger.debug(String.format("Total unsuccessful: %d", benceUnsuccess));
		logger.debug(String.format("Total time: %f s", benceTime / 1e9));
		logger.debug(benceRuns > 0 ?
				String.format("Average time: %f s", (benceTime / 1e9 / benceRuns)) 
				: "Average time: -");
		
		logger.debug("### Results for eMoflon ###");
		logger.debug(String.format("Total runs: %d", eMoflonRuns));
		logger.debug(String.format("Total successful: %d", eMoflonSuccess));
		logger.debug(String.format("Total unsuccessful: %d", eMoflonUnsuccess));
		logger.debug(String.format("Total time: %f s", eMoflonTime / 1e9));
		logger.debug(eMoflonRuns > 0 ?
				String.format("Average time: %f s", (eMoflonTime / 1e9 / eMoflonRuns)) 
				: "Average time: -");
		logger.debug("##############################");
		
		logger.debug("========================= Ending Evaluation Successfully =========================");
	}

	/**
	 * Return the current time to be used in the elapsed time measurement
	 * @return		The current time for this thread
	 */
	private static long getTime() {
		//ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		//return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadCpuTime() : System.nanoTime();
		return System.nanoTime();
	}

}
