/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Rule#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Rule#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Rule#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Rule#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Rule#getEmbedding <em>Embedding</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Rule#getPac <em>Pac</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Rule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Symbol)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	Symbol getLhs();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Rule#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Symbol value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Graph)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	Graph getRhs();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Rule#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Graph value);

	/**
	 * Returns the value of the '<em><b>Embedding</b></em>' map.
	 * The key is of type {@link org.wbsilva.bence.graphgrammar.VertexLabelPair},
	 * and the value is of type list of {@link org.wbsilva.bence.graphgrammar.Symbol},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Embedding()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexLabelPairToSymbolMap&lt;org.wbsilva.bence.graphgrammar.VertexLabelPair, org.wbsilva.bence.graphgrammar.Symbol&gt;"
	 * @generated
	 */
	EMap<VertexLabelPair, EList<Symbol>> getEmbedding();

	/**
	 * Returns the value of the '<em><b>Pac</b></em>' reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pac</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pac</em>' reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Pac()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Vertex> getPac();

} // Rule
