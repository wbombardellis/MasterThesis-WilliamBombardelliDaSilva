/**
 */
package org.wbsilva.bx.class2database;

import class_.ClassDiagram;

import database.DB;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD2D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.class2database.CD2D#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.class2database.CD2D#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.class2database.Class2databasePackage#getCD2D()
 * @model
 * @generated
 */
public interface CD2D extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ClassDiagram)
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#getCD2D_Source()
	 * @model required="true"
	 * @generated
	 */
	ClassDiagram getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.class2database.CD2D#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ClassDiagram value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DB)
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#getCD2D_Target()
	 * @model required="true"
	 * @generated
	 */
	DB getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.class2database.CD2D#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DB value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CD2D
