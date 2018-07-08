/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Derivation step of the application of a rule on a vertex of the graph previous, 
 * resulting in the graph next. The unifier propery maps the vertex of the 
 * applied rule to the vertices of the next graph.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getRule <em>Rule</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getVertex <em>Vertex</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getNext <em>Next</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.DerivationStep#getUnifier <em>Unifier</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep()
 * @model
 * @generated
 */
public interface DerivationStep extends EObject {

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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Rule()
	 * @model containment="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' containment reference.
	 * @see #setVertex(Vertex)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Vertex()
	 * @model containment="true"
	 * @generated
	 */
	Vertex getVertex();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getVertex <em>Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex</em>' containment reference.
	 * @see #getVertex()
	 * @generated
	 */
	void setVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(Graph)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Previous()
	 * @model containment="true"
	 * @generated
	 */
	Graph getPrevious();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Graph value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Graph)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Next()
	 * @model containment="true"
	 * @generated
	 */
	Graph getNext();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Graph value);

	/**
	 * Returns the value of the '<em><b>Unifier</b></em>' map.
	 * The key is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * and the value is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unifier</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unifier</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getDerivationStep_Unifier()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;" ordered="false"
	 * @generated
	 */
	EMap<Vertex, Vertex> getUnifier();
} // DerivationStep
