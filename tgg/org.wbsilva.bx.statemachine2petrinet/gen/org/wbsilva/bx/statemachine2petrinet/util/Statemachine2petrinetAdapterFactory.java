/**
 */
package org.wbsilva.bx.statemachine2petrinet.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import org.wbsilva.bx.statemachine2petrinet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage
 * @generated
 */
public class Statemachine2petrinetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Statemachine2petrinetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statemachine2petrinetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Statemachine2petrinetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statemachine2petrinetSwitch<Adapter> modelSwitch = new Statemachine2petrinetSwitch<Adapter>() {
		@Override
		public Adapter caseT2T(T2T object) {
			return createT2TAdapter();
		}

		@Override
		public Adapter caseT2A(T2A object) {
			return createT2AAdapter();
		}

		@Override
		public Adapter caseS2P(S2P object) {
			return createS2PAdapter();
		}

		@Override
		public Adapter caseSM2PN(SM2PN object) {
			return createSM2PNAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.T2T <em>T2T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2T
	 * @generated
	 */
	public Adapter createT2TAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.T2A <em>T2A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2A
	 * @generated
	 */
	public Adapter createT2AAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.S2P <em>S2P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.S2P
	 * @generated
	 */
	public Adapter createS2PAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.SM2PN <em>SM2PN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.SM2PN
	 * @generated
	 */
	public Adapter createSM2PNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Statemachine2petrinetAdapterFactory
