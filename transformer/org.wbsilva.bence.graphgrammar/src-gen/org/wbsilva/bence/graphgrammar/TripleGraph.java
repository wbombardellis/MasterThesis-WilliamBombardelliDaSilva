/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triple Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A triple edge and node labeled graph
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleGraph#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleGraph#getCorr <em>Corr</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleGraph#getTarget <em>Target</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleGraph#getMs <em>Ms</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleGraph#getMt <em>Mt</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleGraph()
 * @model
 * @generated
 */
public interface TripleGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Graph)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleGraph_Source()
	 * @model containment="true"
	 * @generated
	 */
	Graph getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Graph value);

	/**
	 * Returns the value of the '<em><b>Corr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corr</em>' containment reference.
	 * @see #setCorr(Graph)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleGraph_Corr()
	 * @model containment="true"
	 * @generated
	 */
	Graph getCorr();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getCorr <em>Corr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corr</em>' containment reference.
	 * @see #getCorr()
	 * @generated
	 */
	void setCorr(Graph value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Graph)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleGraph_Target()
	 * @model containment="true"
	 * @generated
	 */
	Graph getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Graph value);

	/**
	 * Returns the value of the '<em><b>Ms</b></em>' map.
	 * The key is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * and the value is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ms</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ms</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleGraph_Ms()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;"
	 * @generated
	 */
	EMap<Vertex, Vertex> getMs();

	/**
	 * Returns the value of the '<em><b>Mt</b></em>' map.
	 * The key is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * and the value is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mt</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mt</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleGraph_Mt()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;"
	 * @generated
	 */
	EMap<Vertex, Vertex> getMt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The image of inverse function of the morphism ms applied to sourceVertex. 
	 * As ms is bijective, this inverse exists, is unique and also bijective.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Vertex> invMs(Vertex sourceVertex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The image of the inverse function of the morphism mt applied to targetVertex.
	 * As mt is bijective, this inverse exists, is unique and bijective.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Vertex> invMt(Vertex targetVertex);

} // TripleGraph
