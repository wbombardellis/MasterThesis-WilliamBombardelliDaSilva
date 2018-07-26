/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Symbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.SymbolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.SymbolImpl#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.SymbolImpl#getSuperscript <em>Superscript</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolImpl extends MinimalEObjectImpl.Container implements Symbol {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscript() <em>Subscript</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subscript;

	/**
	 * The cached value of the '{@link #getSuperscript() <em>Superscript</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperscript()
	 * @generated
	 * @ordered
	 */
	protected EList<String> superscript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.SYMBOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubscript() {
		if (subscript == null) {
			subscript = new EDataTypeUniqueEList<String>(String.class, this, GraphgrammarPackage.SYMBOL__SUBSCRIPT);
		}
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSuperscript() {
		if (superscript == null) {
			superscript = new EDataTypeUniqueEList<String>(String.class, this, GraphgrammarPackage.SYMBOL__SUPERSCRIPT);
		}
		return superscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equivalates(Symbol other) {
		if (other == null) {
			return false;
		}
		if (this.getName() != null) {
			if (other.getName() == null) {
				return false;
			} else if (!this.getName().equals(other.getName())) {
				return false;
			}
		} else if (other.getName() != null) {
			return false;
		}
		if (this.getSubscript() != null) {
			if (other.getSubscript() == null) {
				return false;
			} else {
				if (!this.getSubscript().equals(other.getSubscript())) {
					return false;
				}
			}
		} else if (other.getSubscript() != null) {
			return false;
		}
		if (this.getSuperscript() != null) {
			if (other.getSuperscript() == null) {
				return false;
			} else {
				if (!this.getSuperscript().equals(other.getSuperscript())) {
					return false;
				}
			}
		} else if (other.getSuperscript() != null) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int compareTo(Symbol other) {
		assert other != null;
		assert this.getName() != null;
		assert other.getName() != null;
		
		//If this.name < other.name
		if (this.getName().compareTo(other.getName()) < 0) {
			return -1;
		}
		//If this.name > other.name
		else if (this.getName().compareTo(other.getName()) > 0) {
			return 1;
		}
		//If this.name == other.name
		else {
			//this.subscript against other.subscript
			int i;
			for (i = 0; i < other.getSubscript().size(); i++) {
				if (i >= this.getSubscript().size())
					return -1;
				
				int c = this.getSubscript().get(i).compareTo(other.getSubscript().get(i));
				if (c != 0)
					return c;
			}
			if (i < this.getSubscript().size())
				return 1;
			
			//this.superscript against other.superscript
			int j;
			for (j = 0; j < other.getSuperscript().size(); j++) {
				if (j >= this.getSuperscript().size())
					return -1;
				
				int c = this.getSuperscript().get(j).compareTo(other.getSuperscript().get(j));
				if (c != 0)
					return c;
			}
			if (j < this.getSuperscript().size())
				return 1;
			
			//this == other
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphgrammarPackage.SYMBOL__NAME:
			return getName();
		case GraphgrammarPackage.SYMBOL__SUBSCRIPT:
			return getSubscript();
		case GraphgrammarPackage.SYMBOL__SUPERSCRIPT:
			return getSuperscript();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphgrammarPackage.SYMBOL__NAME:
			setName((String) newValue);
			return;
		case GraphgrammarPackage.SYMBOL__SUBSCRIPT:
			getSubscript().clear();
			getSubscript().addAll((Collection<? extends String>) newValue);
			return;
		case GraphgrammarPackage.SYMBOL__SUPERSCRIPT:
			getSuperscript().clear();
			getSuperscript().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GraphgrammarPackage.SYMBOL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GraphgrammarPackage.SYMBOL__SUBSCRIPT:
			getSubscript().clear();
			return;
		case GraphgrammarPackage.SYMBOL__SUPERSCRIPT:
			getSuperscript().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GraphgrammarPackage.SYMBOL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GraphgrammarPackage.SYMBOL__SUBSCRIPT:
			return subscript != null && !subscript.isEmpty();
		case GraphgrammarPackage.SYMBOL__SUPERSCRIPT:
			return superscript != null && !superscript.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GraphgrammarPackage.SYMBOL___EQUIVALATES__SYMBOL:
			return equivalates((Symbol) arguments.get(0));
		case GraphgrammarPackage.SYMBOL___COMPARE_TO__SYMBOL:
			return compareTo((Symbol) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		/*StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", subscript: ");
		result.append(subscript);
		result.append(", superscript: ");
		result.append(superscript);
		result.append(')');
		return result.toString();*/
		final String superS = this.getSuperscript().isEmpty() ? ""
				: String.format("^{%s}",
						this.getSuperscript().stream().reduce((a, b) -> a.concat(", ").concat(b)).orElse(""));

		final String subS = this.getSubscript().isEmpty() ? ""
				: String.format("^{%s}",
						this.getSubscript().stream().reduce((a, b) -> a.concat(", ").concat(b)).orElse(""));

		return this.getName() + superS + subS;
	}

} //SymbolImpl
