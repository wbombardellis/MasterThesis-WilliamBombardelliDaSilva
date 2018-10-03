/**
 */
package org.wbsilva.bx.sourcecode2controlflow;

import controlflow.Node;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import sourcecode.Statement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S2N</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.sourcecode2controlflow.S2N#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.sourcecode2controlflow.S2N#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getS2N()
 * @model
 * @generated
 */
public interface S2N extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Statement)
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getS2N_Source()
	 * @model required="true"
	 * @generated
	 */
	Statement getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.sourcecode2controlflow.S2N#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Statement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getS2N_Target()
	 * @model required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.sourcecode2controlflow.S2N#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // S2N
