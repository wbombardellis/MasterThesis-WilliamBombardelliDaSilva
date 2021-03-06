/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zone vertex of a zone graph, containing zero or more vetices
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.ZoneVertex#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.ZoneVertex#getPac <em>Pac</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getZoneVertex()
 * @model
 * @generated
 */
public interface ZoneVertex extends Vertex {

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getZoneVertex_Vertices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Pac</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pac</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pac</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getZoneVertex_Pac()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getPac();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return true iff this zone vertex is equivalent to other
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean equivalates(ZoneVertex other);
} // ZoneVertex
