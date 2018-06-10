/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parsing Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.ParsingTree#getZoneVertex <em>Zone Vertex</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.ParsingTree#getDerivationStep <em>Derivation Step</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.ParsingTree#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getParsingTree()
 * @model
 * @generated
 */
public interface ParsingTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Zone Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Vertex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Vertex</em>' containment reference.
	 * @see #setZoneVertex(ZoneVertex)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getParsingTree_ZoneVertex()
	 * @model containment="true"
	 * @generated
	 */
	ZoneVertex getZoneVertex();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.ParsingTree#getZoneVertex <em>Zone Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Vertex</em>' containment reference.
	 * @see #getZoneVertex()
	 * @generated
	 */
	void setZoneVertex(ZoneVertex value);

	/**
	 * Returns the value of the '<em><b>Derivation Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Step</em>' containment reference.
	 * @see #setDerivationStep(DerivationStep)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getParsingTree_DerivationStep()
	 * @model containment="true"
	 * @generated
	 */
	DerivationStep getDerivationStep();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.ParsingTree#getDerivationStep <em>Derivation Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Step</em>' containment reference.
	 * @see #getDerivationStep()
	 * @generated
	 */
	void setDerivationStep(DerivationStep value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.ParsingTree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getParsingTree_Children()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParsingTree> getChildren();

} // ParsingTree
