/**
 */
package org.wbsilva.bx.class2database.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.class2database.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.wbsilva.bx.class2database.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>attribute2column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attribute2column</em>'.
	 * @generated
	 */
	attribute2column createattribute2column();

	/**
	 * Returns a new object of class '<em>cd2db</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cd2db</em>'.
	 * @generated
	 */
	cd2db createcd2db();

	/**
	 * Returns a new object of class '<em>super2table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>super2table</em>'.
	 * @generated
	 */
	super2table createsuper2table();

	/**
	 * Returns a new object of class '<em>selfassoc2column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>selfassoc2column</em>'.
	 * @generated
	 */
	selfassoc2column createselfassoc2column();

	/**
	 * Returns a new object of class '<em>association2column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>association2column</em>'.
	 * @generated
	 */
	association2column createassociation2column();

	/**
	 * Returns a new object of class '<em>class2table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>class2table</em>'.
	 * @generated
	 */
	class2table createclass2table();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
