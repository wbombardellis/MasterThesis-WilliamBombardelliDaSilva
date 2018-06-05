/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derivation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getVertex <em>Vertex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivationStepImpl extends MinimalEObjectImpl.Container implements DerivationStep {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;
	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex vertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.DERIVATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.DERIVATION_STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.DERIVATION_STEP__RULE, oldRule, newRule);
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
	public void setRule(Rule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.DERIVATION_STEP__RULE, newRule,
					newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getVertex() {
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertex(Vertex newVertex, NotificationChain msgs) {
		Vertex oldVertex = vertex;
		vertex = newVertex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.DERIVATION_STEP__VERTEX, oldVertex, newVertex);
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
	public void setVertex(Vertex newVertex) {
		if (newVertex != vertex) {
			NotificationChain msgs = null;
			if (vertex != null)
				msgs = ((InternalEObject) vertex).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__VERTEX, null, msgs);
			if (newVertex != null)
				msgs = ((InternalEObject) newVertex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__VERTEX, null, msgs);
			msgs = basicSetVertex(newVertex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.DERIVATION_STEP__VERTEX,
					newVertex, newVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			return basicSetRule(null, msgs);
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			return basicSetVertex(null, msgs);
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
		case GraphgrammarPackage.DERIVATION_STEP__ID:
			return getId();
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			return getRule();
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			return getVertex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphgrammarPackage.DERIVATION_STEP__ID:
			setId((String) newValue);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			setRule((Rule) newValue);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			setVertex((Vertex) newValue);
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
		case GraphgrammarPackage.DERIVATION_STEP__ID:
			setId(ID_EDEFAULT);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			setRule((Rule) null);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			setVertex((Vertex) null);
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
		case GraphgrammarPackage.DERIVATION_STEP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			return rule != null;
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			return vertex != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DerivationStepImpl
