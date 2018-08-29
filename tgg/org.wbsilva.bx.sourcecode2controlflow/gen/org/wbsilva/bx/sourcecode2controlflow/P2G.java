/**
 */
package org.wbsilva.bx.sourcecode2controlflow;

import controlflow.Graph;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import sourcecode.Program;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P2G</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.sourcecode2controlflow.P2G#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.sourcecode2controlflow.P2G#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getP2G()
 * @model
 * @generated
 */
public interface P2G extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Program)
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getP2G_Source()
	 * @model required="true"
	 * @generated
	 */
	Program getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.sourcecode2controlflow.P2G#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Program value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Graph)
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#getP2G_Target()
	 * @model required="true"
	 * @generated
	 */
	Graph getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.sourcecode2controlflow.P2G#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Graph value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // P2G
