/**
 */
package org.wbsilva.bx.class2database.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bx.class2database.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Class2databaseFactoryImpl extends EFactoryImpl implements Class2databaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Class2databaseFactory init() {
		try {
			Class2databaseFactory theClass2databaseFactory = (Class2databaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(Class2databasePackage.eNS_URI);
			if (theClass2databaseFactory != null) {
				return theClass2databaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Class2databaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2databaseFactoryImpl() {
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
		case Class2databasePackage.CD2D:
			return createCD2D();
		case Class2databasePackage.AS2C:
			return createAS2C();
		case Class2databasePackage.A2C:
			return createA2C();
		case Class2databasePackage.C2T:
			return createC2T();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD2D createCD2D() {
		CD2DImpl cd2D = new CD2DImpl();
		return cd2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AS2C createAS2C() {
		AS2CImpl as2C = new AS2CImpl();
		return as2C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A2C createA2C() {
		A2CImpl a2C = new A2CImpl();
		return a2C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2T createC2T() {
		C2TImpl c2T = new C2TImpl();
		return c2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2databasePackage getClass2databasePackage() {
		return (Class2databasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Class2databasePackage getPackage() {
		return Class2databasePackage.eINSTANCE;
	}

} //Class2databaseFactoryImpl
