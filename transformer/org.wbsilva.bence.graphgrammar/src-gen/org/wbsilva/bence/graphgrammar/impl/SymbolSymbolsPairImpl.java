/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Symbols Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.SymbolSymbolsPairImpl#getEdgeLabel <em>Edge Label</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.SymbolSymbolsPairImpl#getVertexLabels <em>Vertex Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolSymbolsPairImpl extends MinimalEObjectImpl.Container implements SymbolSymbolsPair {
	/**
	 * The cached value of the '{@link #getEdgeLabel() <em>Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected Symbol edgeLabel;

	/**
	 * The cached value of the '{@link #getVertexLabels() <em>Vertex Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> vertexLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolSymbolsPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.SYMBOL_SYMBOLS_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getEdgeLabel() {
		return edgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeLabel(Symbol newEdgeLabel, NotificationChain msgs) {
		Symbol oldEdgeLabel = edgeLabel;
		edgeLabel = newEdgeLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL, oldEdgeLabel, newEdgeLabel);
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
	public void setEdgeLabel(Symbol newEdgeLabel) {
		if (newEdgeLabel != edgeLabel) {
			NotificationChain msgs = null;
			if (edgeLabel != null)
				msgs = ((InternalEObject) edgeLabel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL, null, msgs);
			if (newEdgeLabel != null)
				msgs = ((InternalEObject) newEdgeLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL, null, msgs);
			msgs = basicSetEdgeLabel(newEdgeLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL,
					newEdgeLabel, newEdgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getVertexLabels() {
		if (vertexLabels == null) {
			vertexLabels = new EObjectContainmentEList<Symbol>(Symbol.class, this,
					GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS);
		}
		return vertexLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL:
			return basicSetEdgeLabel(null, msgs);
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS:
			return ((InternalEList<?>) getVertexLabels()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL:
			return getEdgeLabel();
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS:
			return getVertexLabels();
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
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL:
			setEdgeLabel((Symbol) newValue);
			return;
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS:
			getVertexLabels().clear();
			getVertexLabels().addAll((Collection<? extends Symbol>) newValue);
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
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL:
			setEdgeLabel((Symbol) null);
			return;
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS:
			getVertexLabels().clear();
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
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__EDGE_LABEL:
			return edgeLabel != null;
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS:
			return vertexLabels != null && !vertexLabels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SymbolSymbolsPairImpl
