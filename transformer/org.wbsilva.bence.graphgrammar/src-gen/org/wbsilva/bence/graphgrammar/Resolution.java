/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete resolution composed of a sequence of steps and a mapping
 * from reference ids to actual vertices that are to be used as substitutions
 * for the pac vertices of each resolution step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Resolution#getReferenceIds <em>Reference Ids</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Resolution#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getResolution()
 * @model
 * @generated
 */
public interface Resolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Ids</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Ids</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Ids</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getResolution_ReferenceIds()
	 * @model mapType="org.wbsilva.bence.graphgrammar.StringToVertexMap&lt;org.eclipse.emf.ecore.EString, org.wbsilva.bence.graphgrammar.Vertex&gt;" ordered="false"
	 * @generated
	 */
	EMap<String, Vertex> getReferenceIds();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.ResolutionStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getResolution_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResolutionStep> getSteps();

} // Resolution
