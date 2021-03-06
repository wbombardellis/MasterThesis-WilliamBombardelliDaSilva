/**
 */
package org.wbsilva.bx.statemachine2petrinet;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import petrinet.Place;

import statemachine.State;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S2P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.statemachine2petrinet.S2P#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.statemachine2petrinet.S2P#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getS2P()
 * @model
 * @generated
 */
public interface S2P extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getS2P_Source()
	 * @model required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.statemachine2petrinet.S2P#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Place)
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getS2P_Target()
	 * @model required="true"
	 * @generated
	 */
	Place getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.statemachine2petrinet.S2P#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Place value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // S2P
