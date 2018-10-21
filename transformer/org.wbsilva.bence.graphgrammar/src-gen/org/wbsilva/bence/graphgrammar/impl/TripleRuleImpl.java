/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl#getCorr <em>Corr</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl#getMs <em>Ms</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl#getMt <em>Mt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripleRuleImpl extends MinimalEObjectImpl.Container implements TripleRule {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Rule source;

	/**
	 * The cached value of the '{@link #getCorr() <em>Corr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorr()
	 * @generated
	 * @ordered
	 */
	protected Rule corr;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Rule target;

	/**
	 * The cached value of the '{@link #getMs() <em>Ms</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMs()
	 * @generated
	 * @ordered
	 */
	protected EMap<Vertex, Vertex> ms;

	/**
	 * The cached value of the '{@link #getMt() <em>Mt</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMt()
	 * @generated
	 * @ordered
	 */
	protected EMap<Vertex, Vertex> mt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.TRIPLE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Rule newSource, NotificationChain msgs) {
		Rule oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.TRIPLE_RULE__SOURCE, oldSource, newSource);
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
	public void setSource(Rule newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.TRIPLE_RULE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.TRIPLE_RULE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.TRIPLE_RULE__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getCorr() {
		return corr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorr(Rule newCorr, NotificationChain msgs) {
		Rule oldCorr = corr;
		corr = newCorr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.TRIPLE_RULE__CORR, oldCorr, newCorr);
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
	public void setCorr(Rule newCorr) {
		if (newCorr != corr) {
			NotificationChain msgs = null;
			if (corr != null)
				msgs = ((InternalEObject) corr).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.TRIPLE_RULE__CORR, null, msgs);
			if (newCorr != null)
				msgs = ((InternalEObject) newCorr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.TRIPLE_RULE__CORR, null, msgs);
			msgs = basicSetCorr(newCorr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.TRIPLE_RULE__CORR, newCorr,
					newCorr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Rule newTarget, NotificationChain msgs) {
		Rule oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.TRIPLE_RULE__TARGET, oldTarget, newTarget);
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
	public void setTarget(Rule newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.TRIPLE_RULE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.TRIPLE_RULE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.TRIPLE_RULE__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Vertex, Vertex> getMs() {
		if (ms == null) {
			ms = new EcoreEMap<Vertex, Vertex>(GraphgrammarPackage.Literals.VERTEX_TO_VERTEX_MAP,
					VertexToVertexMapImpl.class, this, GraphgrammarPackage.TRIPLE_RULE__MS);
		}
		return ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Vertex, Vertex> getMt() {
		if (mt == null) {
			mt = new EcoreEMap<Vertex, Vertex>(GraphgrammarPackage.Literals.VERTEX_TO_VERTEX_MAP,
					VertexToVertexMapImpl.class, this, GraphgrammarPackage.TRIPLE_RULE__MT);
		}
		return mt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vertex invMs(Vertex sourceVertex) {
		for (Entry<Vertex, Vertex> entry : this.getMs().entrySet()) {
			if (entry.getValue() == sourceVertex) {
				return entry.getKey();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vertex invMt(Vertex targetVertex) {
		for (Entry<Vertex, Vertex> entry : this.getMt().entrySet()) {
			if (entry.getValue() == targetVertex) {
				return entry.getKey();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.TRIPLE_RULE__SOURCE:
			return basicSetSource(null, msgs);
		case GraphgrammarPackage.TRIPLE_RULE__CORR:
			return basicSetCorr(null, msgs);
		case GraphgrammarPackage.TRIPLE_RULE__TARGET:
			return basicSetTarget(null, msgs);
		case GraphgrammarPackage.TRIPLE_RULE__MS:
			return ((InternalEList<?>) getMs()).basicRemove(otherEnd, msgs);
		case GraphgrammarPackage.TRIPLE_RULE__MT:
			return ((InternalEList<?>) getMt()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.TRIPLE_RULE__SOURCE:
			return getSource();
		case GraphgrammarPackage.TRIPLE_RULE__CORR:
			return getCorr();
		case GraphgrammarPackage.TRIPLE_RULE__TARGET:
			return getTarget();
		case GraphgrammarPackage.TRIPLE_RULE__MS:
			if (coreType)
				return getMs();
			else
				return getMs().map();
		case GraphgrammarPackage.TRIPLE_RULE__MT:
			if (coreType)
				return getMt();
			else
				return getMt().map();
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
		case GraphgrammarPackage.TRIPLE_RULE__SOURCE:
			setSource((Rule) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__CORR:
			setCorr((Rule) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__TARGET:
			setTarget((Rule) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__MS:
			((EStructuralFeature.Setting) getMs()).set(newValue);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__MT:
			((EStructuralFeature.Setting) getMt()).set(newValue);
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
		case GraphgrammarPackage.TRIPLE_RULE__SOURCE:
			setSource((Rule) null);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__CORR:
			setCorr((Rule) null);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__TARGET:
			setTarget((Rule) null);
			return;
		case GraphgrammarPackage.TRIPLE_RULE__MS:
			getMs().clear();
			return;
		case GraphgrammarPackage.TRIPLE_RULE__MT:
			getMt().clear();
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
		case GraphgrammarPackage.TRIPLE_RULE__SOURCE:
			return source != null;
		case GraphgrammarPackage.TRIPLE_RULE__CORR:
			return corr != null;
		case GraphgrammarPackage.TRIPLE_RULE__TARGET:
			return target != null;
		case GraphgrammarPackage.TRIPLE_RULE__MS:
			return ms != null && !ms.isEmpty();
		case GraphgrammarPackage.TRIPLE_RULE__MT:
			return mt != null && !mt.isEmpty();
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
		case GraphgrammarPackage.TRIPLE_RULE___INV_MS__VERTEX:
			return invMs((Vertex) arguments.get(0));
		case GraphgrammarPackage.TRIPLE_RULE___INV_MT__VERTEX:
			return invMt((Vertex) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TripleRuleImpl
