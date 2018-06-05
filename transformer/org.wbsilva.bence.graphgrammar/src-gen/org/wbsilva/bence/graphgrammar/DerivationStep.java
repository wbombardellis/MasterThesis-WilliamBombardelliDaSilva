/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getRule <em>Rule</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getVertex <em>Vertex</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep()
 * @model
 * @generated
 */
public interface DerivationStep extends EObject {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Rule()
	 * @model containment="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' containment reference.
	 * @see #setVertex(Vertex)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Vertex()
	 * @model containment="true"
	 * @generated
	 */
	Vertex getVertex();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getVertex <em>Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex</em>' containment reference.
	 * @see #getVertex()
	 * @generated
	 */
	void setVertex(Vertex value);
} // DerivationStep
