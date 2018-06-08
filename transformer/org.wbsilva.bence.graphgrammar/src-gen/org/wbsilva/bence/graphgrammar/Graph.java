/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Graph#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Graph#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {

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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGraph_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Graph#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGraph_Vertices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGraph_Edges()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" verticesMany="true" verticesOrdered="false"
	 * @generated
	 */
	EList<Vertex> neighbors(EList<Vertex> vertices);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isomorphicTo(Graph graph);
} // Graph
