/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bx.statemachine2petrinet.Rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.INITIAL2NOTHING:
			return createinitial2nothing();
		case RulesPackage.TRANSITION2ARCTRANSARC:
			return createtransition2arctransarc();
		case RulesPackage.STATE2PLACE:
			return createstate2place();
		case RulesPackage.SELFTRANS2ARCTRANSARC:
			return createselftrans2arctransarc();
		case RulesPackage.FINAL2NOTHING:
			return createfinal2nothing();
		case RulesPackage.STATEMACHINE2PETRINET:
			return createstatemachine2petrinet();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public initial2nothing createinitial2nothing() {
		initial2nothingImpl initial2nothing = new initial2nothingImpl();
		return initial2nothing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transition2arctransarc createtransition2arctransarc() {
		transition2arctransarcImpl transition2arctransarc = new transition2arctransarcImpl();
		return transition2arctransarc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public state2place createstate2place() {
		state2placeImpl state2place = new state2placeImpl();
		return state2place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public selftrans2arctransarc createselftrans2arctransarc() {
		selftrans2arctransarcImpl selftrans2arctransarc = new selftrans2arctransarcImpl();
		return selftrans2arctransarc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public final2nothing createfinal2nothing() {
		final2nothingImpl final2nothing = new final2nothingImpl();
		return final2nothing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statemachine2petrinet createstatemachine2petrinet() {
		statemachine2petrinetImpl statemachine2petrinet = new statemachine2petrinetImpl();
		return statemachine2petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
