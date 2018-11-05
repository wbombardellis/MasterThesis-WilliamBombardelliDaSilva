/**
 */
package org.wbsilva.bx.class2database;

import class_.Association;

import database.Column;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AS2C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.class2database.AS2C#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.class2database.AS2C#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.class2database.Class2databasePackage#getAS2C()
 * @model
 * @generated
 */
public interface AS2C extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Association)
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#getAS2C_Source()
	 * @model required="true"
	 * @generated
	 */
	Association getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.class2database.AS2C#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Association value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Column)
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#getAS2C_Target()
	 * @model required="true"
	 * @generated
	 */
	Column getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.class2database.AS2C#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Column value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AS2C
