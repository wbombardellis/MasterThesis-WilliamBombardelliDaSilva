package org.wbsilva.bence.evaluation.adapter;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.wbsilva.bence.transformer.TransformationResult;

/**
 * TODO
 * @author wbombardellis
 *
 */
public class EMoflonAdapter {
	static final Logger logger = LogManager.getLogger(EMoflonAdapter.class);

	private SynchronizationHelper transformer;
	private final boolean forward;

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
	 * TODO
	 * @param inputModel
	 * @return
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
