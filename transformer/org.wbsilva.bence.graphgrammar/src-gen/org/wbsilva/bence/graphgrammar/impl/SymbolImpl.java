/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
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
			subscript = new EDataTypeEList<String>(String.class, this, GraphgrammarPackage.SYMBOL__SUBSCRIPT);
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
			superscript = new EDataTypeEList<String>(String.class, this, GraphgrammarPackage.SYMBOL__SUPERSCRIPT);
		}
		return superscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equivalates(Symbol other) {
		return this.compareTo(other) == 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int compareTo(Symbol other) {
		if (other == null) {
			return 1;
		}
		if (this.getName() != null) {
			if (other.getName() == null) {
				return -1;
			}
			//If this.name < other.name
			else if (this.getName().compareTo(other.getName()) < 0) {
				return -1;
			}
			//If this.name > other.name
			else if (this.getName().compareTo(other.getName()) > 0) {
				return 1;
			}
			//If this.name == other.name
			else {
				assert this.getSubscript().size() == this.getSuperscript().size();
				assert other.getSubscript().size() == other.getSuperscript().size();
				//this.subscript against other.subscript - Compare using the pairs of respective sub and superscripts

				final ArrayList<Entry<String, String>> thisPairs = new ArrayList<>(this.getSubscript().size());
				for (int i = 0; i < this.getSubscript().size(); i++) {
					thisPairs.add(
							new AbstractMap.SimpleEntry<>(this.getSubscript().get(i), this.getSuperscript().get(i)));
				}

				final ArrayList<Entry<String, String>> otherPairs = new ArrayList<>(this.getSubscript().size());
				for (int i = 0; i < other.getSubscript().size(); i++) {
					otherPairs.add(
							new AbstractMap.SimpleEntry<>(other.getSubscript().get(i), other.getSuperscript().get(i)));
				}

				final List<Entry<String, String>> thisPairsSorted = thisPairs.stream().distinct().sorted((a, b) -> {
					if (a.getKey().compareTo(b.getKey()) == 0)
						return a.getValue().compareTo(b.getValue());
					else
						return a.getKey().compareTo(b.getKey());
				}).collect(Collectors.toList());
				final List<Entry<String, String>> otherPairsSorted = otherPairs.stream().distinct().sorted((a, b) -> {
					if (a.getKey().compareTo(b.getKey()) == 0)
						return a.getValue().compareTo(b.getValue());
					else
						return a.getKey().compareTo(b.getKey());
				}).collect(Collectors.toList());

				//thisPairsSorted against otherPairsSorted
				int j;
				for (j = 0; j < otherPairsSorted.size(); j++) {
					if (j >= thisPairsSorted.size())
						return -1;

					int c = thisPairsSorted.get(j).getKey().compareTo(otherPairsSorted.get(j).getKey());
					if (c == 0) {
						int d = thisPairsSorted.get(j).getValue().compareTo(otherPairsSorted.get(j).getValue());
						if (d != 0)
							return d;
					} else
						return c;
				}
				if (j < thisPairsSorted.size())
					return 1;
			}
		} else if (other.getName() != null) {
			return 1;
		}
		//this == other
		return 0;
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
				: String.format("_{%s}",
						this.getSubscript().stream().reduce((a, b) -> a.concat(", ").concat(b)).orElse(""));

		return this.getName() + superS + subS;
	}

} //SymbolImpl
