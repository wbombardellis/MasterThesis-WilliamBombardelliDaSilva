/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triple Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A triple rule of a triple graph grammar
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleRule#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleRule#getCorr <em>Corr</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleRule#getTarget <em>Target</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleRule#getMs <em>Ms</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.TripleRule#getMt <em>Mt</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleRule()
 * @model
 * @generated
 */
public interface TripleRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Rule)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleRule_Source()
	 * @model containment="true"
	 * @generated
	 */
	Rule getSource();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.TripleRule#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Rule value);

	/**
	 * Returns the value of the '<em><b>Corr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corr</em>' containment reference.
	 * @see #setCorr(Rule)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleRule_Corr()
	 * @model containment="true"
	 * @generated
	 */
	Rule getCorr();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.TripleRule#getCorr <em>Corr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corr</em>' containment reference.
	 * @see #getCorr()
	 * @generated
	 */
	void setCorr(Rule value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Rule)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleRule_Target()
	 * @model containment="true"
	 * @generated
	 */
	Rule getTarget();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.TripleRule#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Rule value);

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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleRule_Ms()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;" ordered="false"
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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getTripleRule_Mt()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;" ordered="false"
	 * @generated
	 */
	EMap<Vertex, Vertex> getMt();

} // TripleRule
