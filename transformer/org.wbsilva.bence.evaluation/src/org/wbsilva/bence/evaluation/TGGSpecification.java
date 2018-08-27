package org.wbsilva.bence.evaluation;

/**
 * TODO
 * @author wbombardellis
 * Immutable
 */
public class TGGSpecification {
	
	private final String benceTGGPath;
	private final String mmPath;
	private final boolean forward;
	
	public TGGSpecification(final String benceTGGPath, final String mmPath, final boolean forward) {
		this.benceTGGPath = benceTGGPath;
		this.mmPath = mmPath;
		this.forward = forward;
	}

	public String getBenceTGGPath() {
		return benceTGGPath;
	}

	public String getMmPath() {
		return mmPath;
	}

	public boolean getForward() {
		return forward;
	}
}
