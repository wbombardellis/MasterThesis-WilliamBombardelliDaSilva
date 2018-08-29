/**
 */
package org.wbsilva.bx.sourcecode2controlflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage
 * @generated
 */
public interface Sourcecode2controlflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sourcecode2controlflowFactory eINSTANCE = org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>S2B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>S2B</em>'.
	 * @generated
	 */
	S2B createS2B();

	/**
	 * Returns a new object of class '<em>P2G</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P2G</em>'.
	 * @generated
	 */
	P2G createP2G();

	/**
	 * Returns a new object of class '<em>S2N</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>S2N</em>'.
	 * @generated
	 */
	S2N createS2N();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Sourcecode2controlflowPackage getSourcecode2controlflowPackage();

} //Sourcecode2controlflowFactory
