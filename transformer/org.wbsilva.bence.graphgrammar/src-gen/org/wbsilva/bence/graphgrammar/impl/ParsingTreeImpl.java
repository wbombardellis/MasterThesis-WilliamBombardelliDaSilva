/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parsing Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl#getZoneVertex <em>Zone Vertex</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl#getDerivationStep <em>Derivation Step</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParsingTreeImpl extends MinimalEObjectImpl.Container implements ParsingTree {
	/**
	 * The cached value of the '{@link #getZoneVertex() <em>Zone Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneVertex()
	 * @generated
	 * @ordered
	 */
	protected ZoneVertex zoneVertex;

	/**
	 * The cached value of the '{@link #getDerivationStep() <em>Derivation Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationStep()
	 * @generated
	 * @ordered
	 */
	protected DerivationStep derivationStep;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ParsingTree> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParsingTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.PARSING_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneVertex getZoneVertex() {
		return zoneVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZoneVertex(ZoneVertex newZoneVertex, NotificationChain msgs) {
		ZoneVertex oldZoneVertex = zoneVertex;
		zoneVertex = newZoneVertex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX, oldZoneVertex, newZoneVertex);
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
	public void setZoneVertex(ZoneVertex newZoneVertex) {
		if (newZoneVertex != zoneVertex) {
			NotificationChain msgs = null;
			if (zoneVertex != null)
				msgs = ((InternalEObject) zoneVertex).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX, null, msgs);
			if (newZoneVertex != null)
				msgs = ((InternalEObject) newZoneVertex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX, null, msgs);
			msgs = basicSetZoneVertex(newZoneVertex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX,
					newZoneVertex, newZoneVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationStep getDerivationStep() {
		return derivationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationStep(DerivationStep newDerivationStep, NotificationChain msgs) {
		DerivationStep oldDerivationStep = derivationStep;
		derivationStep = newDerivationStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP, oldDerivationStep, newDerivationStep);
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
	public void setDerivationStep(DerivationStep newDerivationStep) {
		if (newDerivationStep != derivationStep) {
			NotificationChain msgs = null;
			if (derivationStep != null)
				msgs = ((InternalEObject) derivationStep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP, null, msgs);
			if (newDerivationStep != null)
				msgs = ((InternalEObject) newDerivationStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP, null, msgs);
			msgs = basicSetDerivationStep(newDerivationStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP,
					newDerivationStep, newDerivationStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParsingTree> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ParsingTree>(ParsingTree.class, this,
					GraphgrammarPackage.PARSING_TREE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Derivation derivation() {
		assert this.getZoneVertex() != null;

		if (this.getDerivationStep() != null) {
			final Derivation derivation = GraphgrammarFactory.eINSTANCE.createDerivation();

			derivation.getSteps().add(EcoreUtil.copy(this.getDerivationStep()));
			derivation.getSteps().addAll(this.getChildren().stream().map(pt -> pt.derivation()).filter(d -> d != null)
					.flatMap(d -> d.getSteps().stream()).collect(Collectors.toList()));

			return derivation;
		} else {
			return null;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX:
			return basicSetZoneVertex(null, msgs);
		case GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP:
			return basicSetDerivationStep(null, msgs);
		case GraphgrammarPackage.PARSING_TREE__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX:
			return getZoneVertex();
		case GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP:
			return getDerivationStep();
		case GraphgrammarPackage.PARSING_TREE__CHILDREN:
			return getChildren();
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
		case GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX:
			setZoneVertex((ZoneVertex) newValue);
			return;
		case GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP:
			setDerivationStep((DerivationStep) newValue);
			return;
		case GraphgrammarPackage.PARSING_TREE__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends ParsingTree>) newValue);
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
		case GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX:
			setZoneVertex((ZoneVertex) null);
			return;
		case GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP:
			setDerivationStep((DerivationStep) null);
			return;
		case GraphgrammarPackage.PARSING_TREE__CHILDREN:
			getChildren().clear();
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
		case GraphgrammarPackage.PARSING_TREE__ZONE_VERTEX:
			return zoneVertex != null;
		case GraphgrammarPackage.PARSING_TREE__DERIVATION_STEP:
			return derivationStep != null;
		case GraphgrammarPackage.PARSING_TREE__CHILDREN:
			return children != null && !children.isEmpty();
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
		case GraphgrammarPackage.PARSING_TREE___DERIVATION:
			return derivation();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParsingTreeImpl
