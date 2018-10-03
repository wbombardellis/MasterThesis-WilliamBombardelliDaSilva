/**
 */
package org.wbsilva.bx.sourcecode2controlflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bx.sourcecode2controlflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sourcecode2controlflowFactoryImpl extends EFactoryImpl implements Sourcecode2controlflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sourcecode2controlflowFactory init() {
		try {
			Sourcecode2controlflowFactory theSourcecode2controlflowFactory = (Sourcecode2controlflowFactory) EPackage.Registry.INSTANCE
					.getEFactory(Sourcecode2controlflowPackage.eNS_URI);
			if (theSourcecode2controlflowFactory != null) {
				return theSourcecode2controlflowFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sourcecode2controlflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sourcecode2controlflowFactoryImpl() {
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
		case Sourcecode2controlflowPackage.S2B:
			return createS2B();
		case Sourcecode2controlflowPackage.S2N:
			return createS2N();
		case Sourcecode2controlflowPackage.P2G:
			return createP2G();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S2B createS2B() {
		S2BImpl s2B = new S2BImpl();
		return s2B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S2N createS2N() {
		S2NImpl s2N = new S2NImpl();
		return s2N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2G createP2G() {
		P2GImpl p2G = new P2GImpl();
		return p2G;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sourcecode2controlflowPackage getSourcecode2controlflowPackage() {
		return (Sourcecode2controlflowPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sourcecode2controlflowPackage getPackage() {
		return Sourcecode2controlflowPackage.eINSTANCE;
	}

} //Sourcecode2controlflowFactoryImpl
