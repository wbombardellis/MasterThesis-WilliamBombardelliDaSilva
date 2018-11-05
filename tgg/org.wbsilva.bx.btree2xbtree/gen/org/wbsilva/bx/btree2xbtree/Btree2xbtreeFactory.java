/**
 */
package org.wbsilva.bx.btree2xbtree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage
 * @generated
 */
public interface Btree2xbtreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Btree2xbtreeFactory eINSTANCE = org.wbsilva.bx.btree2xbtree.impl.Btree2xbtreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BT Node2 XB Tnode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BT Node2 XB Tnode</em>'.
	 * @generated
	 */
	BTNode2XBTnode createBTNode2XBTnode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Btree2xbtreePackage getBtree2xbtreePackage();

} //Btree2xbtreeFactory
