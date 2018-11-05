/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

import org.wbsilva.bx.statemachine2petrinet.Rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.STATE2PLACE: {
			state2place state2place = (state2place) theEObject;
			T result = casestate2place(state2place);
			if (result == null)
				result = caseAbstractRule(state2place);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SELFTRANS2ARCTRANSARC: {
			selftrans2arctransarc selftrans2arctransarc = (selftrans2arctransarc) theEObject;
			T result = caseselftrans2arctransarc(selftrans2arctransarc);
			if (result == null)
				result = caseAbstractRule(selftrans2arctransarc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INITIAL2NOTHING: {
			initial2nothing initial2nothing = (initial2nothing) theEObject;
			T result = caseinitial2nothing(initial2nothing);
			if (result == null)
				result = caseAbstractRule(initial2nothing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FINAL2NOTHING: {
			final2nothing final2nothing = (final2nothing) theEObject;
			T result = casefinal2nothing(final2nothing);
			if (result == null)
				result = caseAbstractRule(final2nothing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TRANSITION2ARCTRANSARC: {
			transition2arctransarc transition2arctransarc = (transition2arctransarc) theEObject;
			T result = casetransition2arctransarc(transition2arctransarc);
			if (result == null)
				result = caseAbstractRule(transition2arctransarc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.STATEMACHINE2PETRINET: {
			statemachine2petrinet statemachine2petrinet = (statemachine2petrinet) theEObject;
			T result = casestatemachine2petrinet(statemachine2petrinet);
			if (result == null)
				result = caseAbstractRule(statemachine2petrinet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>state2place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>state2place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestate2place(state2place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>selftrans2arctransarc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>selftrans2arctransarc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseselftrans2arctransarc(selftrans2arctransarc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>initial2nothing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>initial2nothing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinitial2nothing(initial2nothing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>final2nothing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>final2nothing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefinal2nothing(final2nothing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transition2arctransarc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transition2arctransarc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransition2arctransarc(transition2arctransarc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>statemachine2petrinet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>statemachine2petrinet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestatemachine2petrinet(statemachine2petrinet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
