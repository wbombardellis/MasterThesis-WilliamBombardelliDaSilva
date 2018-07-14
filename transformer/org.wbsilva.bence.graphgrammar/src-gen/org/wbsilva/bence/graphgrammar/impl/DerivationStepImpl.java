/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Graph;
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
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl#getUnifier <em>Unifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivationStepImpl extends MinimalEObjectImpl.Container implements DerivationStep {
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
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Graph previous;
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Graph next;

	/**
	 * The cached value of the '{@link #getUnifier() <em>Unifier</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnifier()
	 * @generated
	 * @ordered
	 */
	protected EMap<Vertex, Vertex> unifier;

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
	public Graph getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Graph newPrevious, NotificationChain msgs) {
		Graph oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.DERIVATION_STEP__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(Graph newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.DERIVATION_STEP__PREVIOUS,
					newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Graph newNext, NotificationChain msgs) {
		Graph oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.DERIVATION_STEP__NEXT, oldNext, newNext);
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
	public void setNext(Graph newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.DERIVATION_STEP__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.DERIVATION_STEP__NEXT, newNext,
					newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Vertex, Vertex> getUnifier() {
		if (unifier == null) {
			unifier = new EcoreEMap<Vertex, Vertex>(GraphgrammarPackage.Literals.VERTEX_TO_VERTEX_MAP,
					VertexToVertexMapImpl.class, this, GraphgrammarPackage.DERIVATION_STEP__UNIFIER);
		}
		return unifier;
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
		case GraphgrammarPackage.DERIVATION_STEP__PREVIOUS:
			return basicSetPrevious(null, msgs);
		case GraphgrammarPackage.DERIVATION_STEP__NEXT:
			return basicSetNext(null, msgs);
		case GraphgrammarPackage.DERIVATION_STEP__UNIFIER:
			return ((InternalEList<?>) getUnifier()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			return getRule();
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			return getVertex();
		case GraphgrammarPackage.DERIVATION_STEP__PREVIOUS:
			return getPrevious();
		case GraphgrammarPackage.DERIVATION_STEP__NEXT:
			return getNext();
		case GraphgrammarPackage.DERIVATION_STEP__UNIFIER:
			if (coreType)
				return getUnifier();
			else
				return getUnifier().map();
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
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			setRule((Rule) newValue);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			setVertex((Vertex) newValue);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__PREVIOUS:
			setPrevious((Graph) newValue);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__NEXT:
			setNext((Graph) newValue);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__UNIFIER:
			((EStructuralFeature.Setting) getUnifier()).set(newValue);
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
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			setRule((Rule) null);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			setVertex((Vertex) null);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__PREVIOUS:
			setPrevious((Graph) null);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__NEXT:
			setNext((Graph) null);
			return;
		case GraphgrammarPackage.DERIVATION_STEP__UNIFIER:
			getUnifier().clear();
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
		case GraphgrammarPackage.DERIVATION_STEP__RULE:
			return rule != null;
		case GraphgrammarPackage.DERIVATION_STEP__VERTEX:
			return vertex != null;
		case GraphgrammarPackage.DERIVATION_STEP__PREVIOUS:
			return previous != null;
		case GraphgrammarPackage.DERIVATION_STEP__NEXT:
			return next != null;
		case GraphgrammarPackage.DERIVATION_STEP__UNIFIER:
			return unifier != null && !unifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivationStepImpl
