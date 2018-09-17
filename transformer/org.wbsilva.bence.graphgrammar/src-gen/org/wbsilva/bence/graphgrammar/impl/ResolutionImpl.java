/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Resolution;
import org.wbsilva.bence.graphgrammar.ResolutionStep;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.ResolutionImpl#getReferenceIds <em>Reference Ids</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.ResolutionImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolutionImpl extends MinimalEObjectImpl.Container implements Resolution {
	/**
	 * The cached value of the '{@link #getReferenceIds() <em>Reference Ids</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceIds()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Vertex> referenceIds;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolutionStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Vertex> getReferenceIds() {
		if (referenceIds == null) {
			referenceIds = new EcoreEMap<String, Vertex>(GraphgrammarPackage.Literals.STRING_TO_VERTEX_MAP,
					StringToVertexMapImpl.class, this, GraphgrammarPackage.RESOLUTION__REFERENCE_IDS);
		}
		return referenceIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResolutionStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<ResolutionStep>(ResolutionStep.class, this,
					GraphgrammarPackage.RESOLUTION__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.RESOLUTION__REFERENCE_IDS:
			return ((InternalEList<?>) getReferenceIds()).basicRemove(otherEnd, msgs);
		case GraphgrammarPackage.RESOLUTION__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.RESOLUTION__REFERENCE_IDS:
			if (coreType)
				return getReferenceIds();
			else
				return getReferenceIds().map();
		case GraphgrammarPackage.RESOLUTION__STEPS:
			return getSteps();
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
		case GraphgrammarPackage.RESOLUTION__REFERENCE_IDS:
			((EStructuralFeature.Setting) getReferenceIds()).set(newValue);
			return;
		case GraphgrammarPackage.RESOLUTION__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends ResolutionStep>) newValue);
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
		case GraphgrammarPackage.RESOLUTION__REFERENCE_IDS:
			getReferenceIds().clear();
			return;
		case GraphgrammarPackage.RESOLUTION__STEPS:
			getSteps().clear();
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
		case GraphgrammarPackage.RESOLUTION__REFERENCE_IDS:
			return referenceIds != null && !referenceIds.isEmpty();
		case GraphgrammarPackage.RESOLUTION__STEPS:
			return steps != null && !steps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResolutionImpl
