/**
 */
package org.wbsilva.bx.btree2xbtree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bx.btree2xbtree.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Btree2xbtreeFactoryImpl extends EFactoryImpl implements Btree2xbtreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Btree2xbtreeFactory init() {
		try {
			Btree2xbtreeFactory theBtree2xbtreeFactory = (Btree2xbtreeFactory) EPackage.Registry.INSTANCE
					.getEFactory(Btree2xbtreePackage.eNS_URI);
			if (theBtree2xbtreeFactory != null) {
				return theBtree2xbtreeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Btree2xbtreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Btree2xbtreeFactoryImpl() {
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
		case Btree2xbtreePackage.BT_NODE2_XB_TNODE:
			return createBTNode2XBTnode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTNode2XBTnode createBTNode2XBTnode() {
		BTNode2XBTnodeImpl btNode2XBTnode = new BTNode2XBTnodeImpl();
		return btNode2XBTnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Btree2xbtreePackage getBtree2xbtreePackage() {
		return (Btree2xbtreePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Btree2xbtreePackage getPackage() {
		return Btree2xbtreePackage.eINSTANCE;
	}

} //Btree2xbtreeFactoryImpl
