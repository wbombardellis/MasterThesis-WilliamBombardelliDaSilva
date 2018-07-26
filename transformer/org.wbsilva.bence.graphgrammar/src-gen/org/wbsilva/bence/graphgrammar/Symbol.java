/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Symbol of a grammar
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Symbol#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Symbol#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.Symbol#getSuperscript <em>Superscript</em>}</li>
 * </ul>
 *
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends EObject {

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
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbol_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wbsilva.bence.graphgrammar.Symbol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscript</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' attribute list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbol_Subscript()
	 * @model
	 * @generated
	 */
	EList<String> getSubscript();

	/**
	 * Returns the value of the '<em><b>Superscript</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superscript</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscript</em>' attribute list.
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#getSymbol_Superscript()
	 * @model
	 * @generated
	 */
	EList<String> getSuperscript();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return true iff this symbol is equivalent to the other
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean equivalates(Symbol other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compare this symbol to other, creating a total order.
	 * If this < other then return -1
	 * if this > other then return 1
	 * else return 0
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	int compareTo(Symbol other);
} // Symbol
