/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Symbols Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.SymbolSymbolsPair#getEdgeLabel <em>Edge Label</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.SymbolSymbolsPair#getVertexLabels <em>Vertex Labels</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbolSymbolsPair()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel documenation='A pair of an edge label and a vertex labels'"
 * @generated
 */
public interface SymbolSymbolsPair extends EObject {
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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbolSymbolsPair_EdgeLabel()
	 * @model containment="true"
	 * @generated
	 */
	Symbol getEdgeLabel();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.SymbolSymbolsPair#getEdgeLabel <em>Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Label</em>' containment reference.
	 * @see #getEdgeLabel()
	 * @generated
	 */
	void setEdgeLabel(Symbol value);

	/**
	 * Returns the value of the '<em><b>Vertex Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex Labels</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbolSymbolsPair_VertexLabels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Symbol> getVertexLabels();

} // SymbolSymbolsPair
