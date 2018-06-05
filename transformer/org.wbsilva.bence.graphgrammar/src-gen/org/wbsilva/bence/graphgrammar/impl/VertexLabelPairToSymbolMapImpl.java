/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.VertexLabelPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex Label Pair To Symbol Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairToSymbolMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairToSymbolMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexLabelPairToSymbolMapImpl extends MinimalEObjectImpl.Container
		implements BasicEMap.Entry<VertexLabelPair, EList<Symbol>> {
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected VertexLabelPair key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexLabelPairToSymbolMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexLabelPair getTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedKey(VertexLabelPair newKey, NotificationChain msgs) {
		VertexLabelPair oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY, oldKey, newKey);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(VertexLabelPair newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject) key).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject) newKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY, null, msgs);
			msgs = basicSetTypedKey(newKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getTypedValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Symbol>(Symbol.class, this,
					GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY:
			return basicSetTypedKey(null, msgs);
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE:
			return ((InternalEList<?>) getTypedValue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY:
			return getTypedKey();
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE:
			return getTypedValue();
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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY:
			setTypedKey((VertexLabelPair) newValue);
			return;
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE:
			getTypedValue().clear();
			getTypedValue().addAll((Collection<? extends Symbol>) newValue);
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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY:
			setTypedKey((VertexLabelPair) null);
			return;
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE:
			getTypedValue().clear();
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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY:
			return key != null;
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE:
			return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexLabelPair getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(VertexLabelPair key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> setValue(EList<Symbol> value) {
		EList<Symbol> oldValue = getValue();
		getTypedValue().clear();
		getTypedValue().addAll(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<VertexLabelPair, EList<Symbol>> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<VertexLabelPair, EList<Symbol>>) container.eGet(eContainmentFeature());
	}

} //VertexLabelPairToSymbolMapImpl
