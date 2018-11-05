/**
 */
package org.wbsilva.bx.statemachine2petrinet;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import statemachine.Transition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>T2T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.statemachine2petrinet.T2T#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.statemachine2petrinet.T2T#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getT2T()
 * @model
 * @generated
 */
public interface T2T extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Transition)
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getT2T_Source()
	 * @model required="true"
	 * @generated
	 */
	Transition getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.statemachine2petrinet.T2T#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Transition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(petrinet.Transition)
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#getT2T_Target()
	 * @model required="true"
	 * @generated
	 */
	petrinet.Transition getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.statemachine2petrinet.T2T#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(petrinet.Transition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // T2T
