/**
 */
package org.wbsilva.bx.class2database;

import class_.Clazz;

import database.Table;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C2T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.class2database.C2T#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.class2database.C2T#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.class2database.Class2databasePackage#getC2T()
 * @model
 * @generated
 */
public interface C2T extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Clazz)
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#getC2T_Source()
	 * @model required="true"
	 * @generated
	 */
	Clazz getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.class2database.C2T#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Clazz value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Table)
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#getC2T_Target()
	 * @model required="true"
	 * @generated
	 */
	Table getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.class2database.C2T#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Table value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // C2T
