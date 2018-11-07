/**
 */
package org.wbsilva.bx.class2database;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.class2database.Class2databasePackage
 * @generated
 */
public interface Class2databaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Class2databaseFactory eINSTANCE = org.wbsilva.bx.class2database.impl.Class2databaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CD2D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD2D</em>'.
	 * @generated
	 */
	CD2D createCD2D();

	/**
	 * Returns a new object of class '<em>AS2C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AS2C</em>'.
	 * @generated
	 */
	AS2C createAS2C();

	/**
	 * Returns a new object of class '<em>A2C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A2C</em>'.
	 * @generated
	 */
	A2C createA2C();

	/**
	 * Returns a new object of class '<em>C2T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C2T</em>'.
	 * @generated
	 */
	C2T createC2T();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Class2databasePackage getClass2databasePackage();

} //Class2databaseFactory
