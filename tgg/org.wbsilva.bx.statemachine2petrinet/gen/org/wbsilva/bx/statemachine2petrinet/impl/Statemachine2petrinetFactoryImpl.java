/**
 */
package org.wbsilva.bx.statemachine2petrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bx.statemachine2petrinet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Statemachine2petrinetFactoryImpl extends EFactoryImpl implements Statemachine2petrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Statemachine2petrinetFactory init() {
		try {
			Statemachine2petrinetFactory theStatemachine2petrinetFactory = (Statemachine2petrinetFactory) EPackage.Registry.INSTANCE
					.getEFactory(Statemachine2petrinetPackage.eNS_URI);
			if (theStatemachine2petrinetFactory != null) {
				return theStatemachine2petrinetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Statemachine2petrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statemachine2petrinetFactoryImpl() {
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
		case Statemachine2petrinetPackage.T2A:
			return createT2A();
		case Statemachine2petrinetPackage.S2P:
			return createS2P();
		case Statemachine2petrinetPackage.SM2PN:
			return createSM2PN();
		case Statemachine2petrinetPackage.T2T:
			return createT2T();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2A createT2A() {
		T2AImpl t2A = new T2AImpl();
		return t2A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S2P createS2P() {
		S2PImpl s2P = new S2PImpl();
		return s2P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SM2PN createSM2PN() {
		SM2PNImpl sm2PN = new SM2PNImpl();
		return sm2PN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2T createT2T() {
		T2TImpl t2T = new T2TImpl();
		return t2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statemachine2petrinetPackage getStatemachine2petrinetPackage() {
		return (Statemachine2petrinetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Statemachine2petrinetPackage getPackage() {
		return Statemachine2petrinetPackage.eINSTANCE;
	}

} //Statemachine2petrinetFactoryImpl
