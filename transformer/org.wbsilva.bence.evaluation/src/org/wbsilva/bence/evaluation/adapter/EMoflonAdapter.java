package org.wbsilva.bence.evaluation.adapter;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.wbsilva.bence.transformer.BeNCETransformer;
import org.wbsilva.bence.transformer.TransformationResult;

/**
 * This class is an adapter for the eMoflon transformer
 * @author wbombardellis
 *
 */
public class EMoflonAdapter {
	static final Logger logger = LogManager.getLogger(EMoflonAdapter.class);

	private SynchronizationHelper transformer;
	private final boolean forward;

	/**
	 * eMoflon transformer adapter. If any error occurs, this adapter will not be able to transform anything and will return empty always
	 * in the method {@link EMoflonAdapter#transform(EObject)}. A log message is accordingly reported.
	 * 
	 * @param resSet				The resource set containing the necessary metamodel's ePackage and input model with packages and factories registered
	 * @param eMoflonTGGPackage		The ePackage of the eMoflon TGG, generated by eMoflon
	 * @param eMoflonTGGPath		The relative path to the eMoflon project
	 * @param forward				Flag to determine if it is a forward (true) or backward (false) transformer
	 */
	public EMoflonAdapter(final ResourceSet resSet, final EPackage eMoflonTGGPackage, final String eMoflonTGGPath, final boolean forward) {
		try {
			this.transformer = new SynchronizationHelper(eMoflonTGGPackage, eMoflonTGGPath, resSet);
		} catch (Exception e) {
			logger.error(String.format("Could not instanceiate eMoflon transformer for TGG %s with path %s. Message: %s", 
					eMoflonTGGPackage.getName(), eMoflonTGGPath, e.getMessage()));
			this.transformer = null;
		}
		
		this.forward = forward;
	}

	/**
	 * Transform the {@code inputModel} into an output model contained in a triple graph in the {@link TransformationResult} of the return.
	 * Or return empty if transformation failed or if transformer was constructed badly.
	 * 
	 * @param inputModel		The input model to be transformed (source or target, dependent on the {@code forward} value
	 * 							given in the construction of this object)
	 * @return					The transformation result with the transformed model or empty
	 * @see BeNCETransformer#transform(org.wbsilva.bence.graphgrammar.Graph)
	 */
	public Optional<TransformationResult> transform(final EObject inputModel) {
		if (this.transformer != null) {
			if (this.forward) {
				transformer.setSrc(inputModel);
				transformer.integrateForward();
				return transformer.getTrg() != null ? 
						Optional.of(new TransformationResult(null, null)) : Optional.empty(); 
			} else {
				transformer.setTrg(inputModel);
				transformer.integrateBackward();
				return transformer.getSrc() != null ? 
						Optional.of(new TransformationResult(null, null)) : Optional.empty();
			}
		} else {
			return Optional.empty();
		}
	}

}
