/**
 */
package org.wbsilva.bx.sourcecode2controlflow;

import controlflow.Branch;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import sourcecode.Statement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S2B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.sourcecode2controlflow.S2B#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.sourcecode2controlflow.S2B#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getS2B()
 * @model
 * @generated
 */
public interface S2B extends EObject, AbstractCorrespondence {
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
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getS2B_Source()
	 * @model required="true"
	 * @generated
	 */
	Statement getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.sourcecode2controlflow.S2B#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(Branch)
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getS2B_Target()
	 * @model required="true"
	 * @generated
	 */
	Branch getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.sourcecode2controlflow.S2B#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Branch value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // S2B
