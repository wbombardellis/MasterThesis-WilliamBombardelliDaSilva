/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.ResolutionStep;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.ResolutionStepImpl#getPac <em>Pac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolutionStepImpl extends MinimalEObjectImpl.Container implements ResolutionStep {
	/**
	 * The cached value of the '{@link #getPac() <em>Pac</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPac()
	 * @generated
	 * @ordered
	 */
	protected EMap<Vertex, String> pac;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.RESOLUTION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Vertex, String> getPac() {
		if (pac == null) {
			pac = new EcoreEMap<Vertex, String>(GraphgrammarPackage.Literals.VERTEX_TO_STRING_MAP,
					VertexToStringMapImpl.class, this, GraphgrammarPackage.RESOLUTION_STEP__PAC);
		}
		return pac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.RESOLUTION_STEP__PAC:
			return ((InternalEList<?>) getPac()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.RESOLUTION_STEP__PAC:
			if (coreType)
				return getPac();
			else
				return getPac().map();
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
		case GraphgrammarPackage.RESOLUTION_STEP__PAC:
			((EStructuralFeature.Setting) getPac()).set(newValue);
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
		case GraphgrammarPackage.RESOLUTION_STEP__PAC:
			getPac().clear();
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
		case GraphgrammarPackage.RESOLUTION_STEP__PAC:
			return pac != null && !pac.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResolutionStepImpl
