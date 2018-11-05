/**
 */
package org.wbsilva.bx.btree2xbtree;

import btree.BTNode;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import xbtree.XBTNode;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BT Node2 XB Tnode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage#getBTNode2XBTnode()
 * @model
 * @generated
 */
public interface BTNode2XBTnode extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BTNode)
	 * @see org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage#getBTNode2XBTnode_Source()
	 * @model required="true"
	 * @generated
	 */
	BTNode getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BTNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(XBTNode)
	 * @see org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage#getBTNode2XBTnode_Target()
	 * @model required="true"
	 * @generated
	 */
	XBTNode getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bx.btree2xbtree.BTNode2XBTnode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(XBTNode value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // BTNode2XBTnode
