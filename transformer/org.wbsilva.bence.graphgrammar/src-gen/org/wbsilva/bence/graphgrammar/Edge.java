/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Edge#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Edge#getFrom <em>From</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Edge#getTo <em>To</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Edge#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getEdge_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Edge#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Vertex)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getEdge_From()
	 * @model
	 * @generated
	 */
	Vertex getFrom();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Edge#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Vertex value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Vertex)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getEdge_To()
	 * @model
	 * @generated
	 */
	Vertex getTo();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Edge#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Vertex value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Symbol)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getEdge_Label()
	 * @model containment="true"
	 * @generated
	 */
	Symbol getLabel();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Edge#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Symbol value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int compareTo(Edge other);
} // Edge
