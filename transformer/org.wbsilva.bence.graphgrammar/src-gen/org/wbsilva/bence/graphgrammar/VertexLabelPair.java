/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex Label Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.VertexLabelPair#getVertex <em>Vertex</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.VertexLabelPair#getEdgeLabel <em>Edge Label</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getVertexLabelPair()
 * @model
 * @generated
 */
public interface VertexLabelPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' reference.
	 * @see #setVertex(Vertex)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getVertexLabelPair_Vertex()
	 * @model
	 * @generated
	 */
	Vertex getVertex();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.VertexLabelPair#getVertex <em>Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex</em>' reference.
	 * @see #getVertex()
	 * @generated
	 */
	void setVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Edge Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Label</em>' containment reference.
	 * @see #setEdgeLabel(Symbol)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getVertexLabelPair_EdgeLabel()
	 * @model containment="true"
	 * @generated
	 */
	Symbol getEdgeLabel();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.VertexLabelPair#getEdgeLabel <em>Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Label</em>' containment reference.
	 * @see #getEdgeLabel()
	 * @generated
	 */
	void setEdgeLabel(Symbol value);

} // VertexLabelPair
