/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>state2place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>state2place</em>'.
	 * @generated
	 */
	state2place createstate2place();

	/**
	 * Returns a new object of class '<em>selftrans2arctransarc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>selftrans2arctransarc</em>'.
	 * @generated
	 */
	selftrans2arctransarc createselftrans2arctransarc();

	/**
	 * Returns a new object of class '<em>initial2nothing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>initial2nothing</em>'.
	 * @generated
	 */
	initial2nothing createinitial2nothing();

	/**
	 * Returns a new object of class '<em>final2nothing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>final2nothing</em>'.
	 * @generated
	 */
	final2nothing createfinal2nothing();

	/**
	 * Returns a new object of class '<em>transition2arctransarc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transition2arctransarc</em>'.
	 * @generated
	 */
	transition2arctransarc createtransition2arctransarc();

	/**
	 * Returns a new object of class '<em>statemachine2petrinet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>statemachine2petrinet</em>'.
	 * @generated
	 */
	statemachine2petrinet createstatemachine2petrinet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
