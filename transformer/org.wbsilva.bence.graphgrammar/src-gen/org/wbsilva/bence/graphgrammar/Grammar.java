/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getAlphabet <em>Alphabet</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getNonterminals <em>Nonterminals</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getRules <em>Rules</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Grammar#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends EObject {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Id()
	 * @model default="" id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Grammar#getId <em>Id</em>}' attribute.
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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Grammar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alphabet</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabet</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Alphabet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Symbol> getAlphabet();

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Terminals()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Symbol> getTerminals();

	/**
	 * Returns the value of the '<em><b>Nonterminals</b></em>' reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonterminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonterminals</em>' reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Nonterminals()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Symbol> getNonterminals();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.wbsilva.bence.graphgrammar.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Rules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(Symbol)
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getGrammar_Initial()
	 * @model
	 * @generated
	 */
	Symbol getInitial();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Grammar#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Symbol value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rule derives(Graph prev, Graph next, Vertex vertex, Graph rhs);
} // Grammar
