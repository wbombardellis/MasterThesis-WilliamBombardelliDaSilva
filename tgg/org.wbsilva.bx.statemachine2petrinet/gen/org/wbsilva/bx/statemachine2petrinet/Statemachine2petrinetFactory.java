/**
 */
package org.wbsilva.bx.statemachine2petrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage
 * @generated
 */
public interface Statemachine2petrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Statemachine2petrinetFactory eINSTANCE = org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>T2A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2A</em>'.
	 * @generated
	 */
	T2A createT2A();

	/**
	 * Returns a new object of class '<em>S2P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>S2P</em>'.
	 * @generated
	 */
	S2P createS2P();

	/**
	 * Returns a new object of class '<em>SM2PN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM2PN</em>'.
	 * @generated
	 */
	SM2PN createSM2PN();

	/**
	 * Returns a new object of class '<em>T2T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2T</em>'.
	 * @generated
	 */
	T2T createT2T();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Statemachine2petrinetPackage getStatemachine2petrinetPackage();

} //Statemachine2petrinetFactory
