/**
 */
package org.wbsilva.bx.btree2xbtree;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.btree2xbtree.Btree2xbtreeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.wbsilva.bx'"
 * @generated
 */
public interface Btree2xbtreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btree2xbtree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.btree2xbtree/model/Btree2xbtree.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.wbsilva.bx.btree2xbtree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Btree2xbtreePackage eINSTANCE = org.wbsilva.bx.btree2xbtree.impl.Btree2xbtreePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.btree2xbtree.impl.BTNode2XBTnodeImpl <em>BT Node2 XB Tnode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.btree2xbtree.impl.BTNode2XBTnodeImpl
	 * @see org.wbsilva.bx.btree2xbtree.impl.Btree2xbtreePackageImpl#getBTNode2XBTnode()
	 * @generated
	 */
	int BT_NODE2_XB_TNODE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_NODE2_XB_TNODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_NODE2_XB_TNODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BT Node2 XB Tnode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_NODE2_XB_TNODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BT Node2 XB Tnode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_NODE2_XB_TNODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode <em>BT Node2 XB Tnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BT Node2 XB Tnode</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.BTNode2XBTnode
	 * @generated
	 */
	EClass getBTNode2XBTnode();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getSource()
	 * @see #getBTNode2XBTnode()
	 * @generated
	 */
	EReference getBTNode2XBTnode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getTarget()
	 * @see #getBTNode2XBTnode()
	 * @generated
	 */
	EReference getBTNode2XBTnode_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Btree2xbtreeFactory getBtree2xbtreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.btree2xbtree.impl.BTNode2XBTnodeImpl <em>BT Node2 XB Tnode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.btree2xbtree.impl.BTNode2XBTnodeImpl
		 * @see org.wbsilva.bx.btree2xbtree.impl.Btree2xbtreePackageImpl#getBTNode2XBTnode()
		 * @generated
		 */
		EClass BT_NODE2_XB_TNODE = eINSTANCE.getBTNode2XBTnode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BT_NODE2_XB_TNODE__SOURCE = eINSTANCE.getBTNode2XBTnode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BT_NODE2_XB_TNODE__TARGET = eINSTANCE.getBTNode2XBTnode_Target();

	}

} //Btree2xbtreePackage
