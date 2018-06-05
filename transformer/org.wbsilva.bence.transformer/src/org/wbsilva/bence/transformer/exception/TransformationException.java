package org.wbsilva.bence.transformer.exception;

/**
 * This Exception can represent any general exception that occurs during a
 * transformation
 * 
 * @author wbombardellis
 *
 */
public class TransformationException extends Exception {

	private static final long serialVersionUID = 1L;

	public TransformationException(final String message) {
		super(message);
	}

}
