/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

import org.wbsilva.bx.statemachine2petrinet.Rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter casefinal2nothing(final2nothing object) {
			return createfinal2nothingAdapter();
		}

		@Override
		public Adapter casestatemachine2petrinet(statemachine2petrinet object) {
			return createstatemachine2petrinetAdapter();
		}

		@Override
		public Adapter casetransition2arctransarc(transition2arctransarc object) {
			return createtransition2arctransarcAdapter();
		}

		@Override
		public Adapter caseselftrans2arctransarc(selftrans2arctransarc object) {
			return createselftrans2arctransarcAdapter();
		}

		@Override
		public Adapter casestate2place(state2place object) {
			return createstate2placeAdapter();
		}

		@Override
		public Adapter caseinitial2nothing(initial2nothing object) {
			return createinitial2nothingAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing <em>final2nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing
	 * @generated
	 */
	public Adapter createfinal2nothingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet <em>statemachine2petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet
	 * @generated
	 */
	public Adapter createstatemachine2petrinetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc <em>transition2arctransarc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc
	 * @generated
	 */
	public Adapter createtransition2arctransarcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc <em>selftrans2arctransarc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc
	 * @generated
	 */
	public Adapter createselftrans2arctransarcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place <em>state2place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place
	 * @generated
	 */
	public Adapter createstate2placeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing <em>initial2nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing
	 * @generated
	 */
	public Adapter createinitial2nothingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
