/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resolution step for the pac vertices in the mapping pac. This map takes
 * from a pac vertex to a reference id, that can be resolved by another mapping
 * in the complete resolution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.ResolutionStep#getPac <em>Pac</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getResolutionStep()
 * @model
 * @generated
 */
public interface ResolutionStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Pac</b></em>' map.
	 * The key is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pac</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pac</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getResolutionStep_Pac()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToStringMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.eclipse.emf.ecore.EString&gt;" ordered="false"
	 * @generated
	 */
	EMap<Vertex, String> getPac();

} // ResolutionStep
