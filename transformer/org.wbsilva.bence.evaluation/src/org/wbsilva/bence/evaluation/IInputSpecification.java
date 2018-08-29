package org.wbsilva.bence.evaluation;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

/**
 * The specification of a series of input models to be transformed
 * @author wbombardellis
 *
 */
public interface IInputSpecification extends Iterable<Optional<EObject>>{

}
