package org.wbsilva.bence.evaluation;

import org.eclipse.emf.ecore.EPackage;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage;

/**
 * 
 * @author wbombardellis
 * Immutable
 */
public class TGGSpecification {
	
	private final String benceTGGPath;
	private final String mmPath;
	private final EPackage eMoflonTGGPackage;
	private final String eMoflonTGGPath;
	private final boolean forward;
	
	public TGGSpecification(final String benceTGGPath, final String mmPath, final EPackage eMoflonTGGPackage, final String eMoflonTGGPath, final boolean forward) {
		this.benceTGGPath = benceTGGPath;
		this.mmPath = mmPath;
		this.eMoflonTGGPackage = eMoflonTGGPackage;
		this.eMoflonTGGPath = eMoflonTGGPath;
		this.forward = forward;
	}

	public String getBenceTGGPath() {
		return benceTGGPath;
	}
	
	public String getMmPath() {
		return mmPath;
	}

	public EPackage getEMoflonTGGPackage() {
		return eMoflonTGGPackage;
	}
	
	public String getEMoflonTGGPath() {
		return eMoflonTGGPath;
	}

	public boolean getForward() {
		return forward;
	}
}
