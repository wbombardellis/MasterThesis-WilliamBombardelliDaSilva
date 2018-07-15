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
 * <!-- begin-model-doc -->
 * Rule of a graph grammar
 * <!-- end-model-doc -->
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
	 * The key is of type {@link org.wbsilva.bence.graphgrammar.Vertex},
	 * and the value is of type list of {@link org.wbsilva.bence.graphgrammar.SymbolSymbolsPair},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding</em>' map.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getRule_Embedding()
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToSymbolSymbolsPairMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.SymbolSymbolsPair&gt;"
	 * @generated
	 */
	EMap<Vertex, EList<SymbolSymbolsPair>> getEmbedding();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given the graph and a list of edges (possibly not belonging to it),
	 * and a vertex (possibly not belonging to it), return a list of edges
	 * that should be added to it for the embedding of the application of this rule
	 * on the vertex.
	 * This method can be used after adding the RHS of this rule to the graph to
	 * connect it with the rest of the graph. The unifier maps between the rule's 
	 * and the graph's vertices.
	 * <!-- end-model-doc -->
	 * @model ordered="false" edgesMany="true" edgesOrdered="false" unifierMapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;"
	 * @generated
	 */
	EList<Edge> embed(Graph graph, Vertex vertex, EList<Edge> edges, EMap<Vertex, Vertex> unifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply this rule to the graph, substituting vertex by the RHS of this rule and
	 * embedding it to the rest of the graph
	 * <!-- end-model-doc -->
	 * @model mapType="org.wbsilva.bence.graphgrammar.VertexToVertexMap&lt;org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Vertex&gt;" ordered="false"
	 * @generated
	 */
	EMap<Vertex, Vertex> apply(Graph graph, Vertex vertex);

} // Rule
