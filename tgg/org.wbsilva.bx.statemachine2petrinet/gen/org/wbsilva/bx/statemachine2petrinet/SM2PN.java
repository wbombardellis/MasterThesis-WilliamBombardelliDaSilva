/**
 */
package org.wbsilva.bx.statemachine2petrinet;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import petrinet.PNGraph;

import statemachine.SM;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM2PN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.statemachine2petrinet.SM2PN#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.statemachine2petrinet.SM2PN#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getSM2PN()
 * @model
 * @generated
 */
public interface SM2PN extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SM)
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getSM2PN_Source()
	 * @model required="true"
	 * @generated
	 */
	SM getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.statemachine2petrinet.SM2PN#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SM value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PNGraph)
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getSM2PN_Target()
	 * @model required="true"
	 * @generated
	 */
	PNGraph getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.statemachine2petrinet.SM2PN#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PNGraph value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SM2PN
