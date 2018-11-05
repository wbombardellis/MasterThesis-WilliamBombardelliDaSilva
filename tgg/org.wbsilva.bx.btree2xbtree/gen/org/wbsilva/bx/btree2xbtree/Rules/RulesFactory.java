/**
 */
package org.wbsilva.bx.btree2xbtree.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.btree2xbtree.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.wbsilva.bx.btree2xbtree.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>node2node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>node2node</em>'.
	 * @generated
	 */
	node2node createnode2node();

	/**
	 * Returns a new object of class '<em>rightleft2eastwest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>rightleft2eastwest</em>'.
	 * @generated
	 */
	rightleft2eastwest createrightleft2eastwest();

	/**
	 * Returns a new object of class '<em>left2southwest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>left2southwest</em>'.
	 * @generated
	 */
	left2southwest createleft2southwest();

	/**
	 * Returns a new object of class '<em>right2southeast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>right2southeast</em>'.
	 * @generated
	 */
	right2southeast createright2southeast();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
