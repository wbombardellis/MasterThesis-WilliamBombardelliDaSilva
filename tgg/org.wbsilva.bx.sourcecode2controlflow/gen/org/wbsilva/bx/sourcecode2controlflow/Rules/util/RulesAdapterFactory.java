/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

import org.wbsilva.bx.sourcecode2controlflow.Rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage
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
		public Adapter casewhileula2branchubc(whileula2branchubc object) {
			return createwhileula2branchubcAdapter();
		}

		@Override
		public Adapter casewhile2branch(while2branch object) {
			return createwhile2branchAdapter();
		}

		@Override
		public Adapter casewhiled2branchb(whiled2branchb object) {
			return createwhiled2branchbAdapter();
		}

		@Override
		public Adapter casewhiledul2branchbub(whiledul2branchbub object) {
			return createwhiledul2branchbubAdapter();
		}

		@Override
		public Adapter casewhileaul2branchcub(whileaul2branchcub object) {
			return createwhileaul2branchcubAdapter();
		}

		@Override
		public Adapter casedecassass2branchcmdcmd(decassass2branchcmdcmd object) {
			return createdecassass2branchcmdcmdAdapter();
		}

		@Override
		public Adapter casedecla2branchbc(decla2branchbc object) {
			return createdecla2branchbcAdapter();
		}

		@Override
		public Adapter casefirstdecision2firstbranch(firstdecision2firstbranch object) {
			return createfirstdecision2firstbranchAdapter();
		}

		@Override
		public Adapter casedecdecass2branchbranchcmd(decdecass2branchbranchcmd object) {
			return createdecdecass2branchbranchcmdAdapter();
		}

		@Override
		public Adapter casefirstwhile2rootbranch(firstwhile2rootbranch object) {
			return createfirstwhile2rootbranchAdapter();
		}

		@Override
		public Adapter casedecal2branchcb(decal2branchcb object) {
			return createdecal2branchcbAdapter();
		}

		@Override
		public Adapter casewhilel2branchb(whilel2branchb object) {
			return createwhilel2branchbAdapter();
		}

		@Override
		public Adapter casedecull2branchubb(decull2branchubb object) {
			return createdecull2branchubbAdapter();
		}

		@Override
		public Adapter casewhileaa2branchcc(whileaa2branchcc object) {
			return createwhileaa2branchccAdapter();
		}

		@Override
		public Adapter caseuwhile2ubranch(uwhile2ubranch object) {
			return createuwhile2ubranchAdapter();
		}

		@Override
		public Adapter casewhilell2branchbb(whilell2branchbb object) {
			return createwhilell2branchbbAdapter();
		}

		@Override
		public Adapter casedecdecdec2branchbranchbranch(decdecdec2branchbranchbranch object) {
			return createdecdecdec2branchbranchbranchAdapter();
		}

		@Override
		public Adapter casewhiledd2branchbb(whiledd2branchbb object) {
			return createwhiledd2branchbbAdapter();
		}

		@Override
		public Adapter casedeculul2branchubub(deculul2branchubub object) {
			return createdeculul2branchububAdapter();
		}

		@Override
		public Adapter casedecassdec2branchcmdbranch(decassdec2branchcmdbranch object) {
			return createdecassdec2branchcmdbranchAdapter();
		}

		@Override
		public Adapter casewhilead2branchcb(whilead2branchcb object) {
			return createwhilead2branchcbAdapter();
		}

		@Override
		public Adapter casewhileld2branchbb(whileld2branchbb object) {
			return createwhileld2branchbbAdapter();
		}

		@Override
		public Adapter casedecld2branchbb(decld2branchbb object) {
			return createdecld2branchbbAdapter();
		}

		@Override
		public Adapter casedecdul2branchbub(decdul2branchbub object) {
			return createdecdul2branchbubAdapter();
		}

		@Override
		public Adapter casewhilea2branchc(whilea2branchc object) {
			return createwhilea2branchcAdapter();
		}

		@Override
		public Adapter casedecision2branch(decision2branch object) {
			return createdecision2branchAdapter();
		}

		@Override
		public Adapter casedecula2branchubc(decula2branchubc object) {
			return createdecula2branchubcAdapter();
		}

		@Override
		public Adapter casedecaul2branchcub(decaul2branchcub object) {
			return createdecaul2branchcubAdapter();
		}

		@Override
		public Adapter casedeculd2branchubb(deculd2branchubb object) {
			return createdeculd2branchubbAdapter();
		}

		@Override
		public Adapter caseassignment2command(assignment2command object) {
			return createassignment2commandAdapter();
		}

		@Override
		public Adapter casefirstass2rootcmd(firstass2rootcmd object) {
			return createfirstass2rootcmdAdapter();
		}

		@Override
		public Adapter casewhileul2branchub(whileul2branchub object) {
			return createwhileul2branchubAdapter();
		}

		@Override
		public Adapter casedeclul2branchbub(declul2branchbub object) {
			return createdeclul2branchbubAdapter();
		}

		@Override
		public Adapter casewhileull2branchubb(whileull2branchubb object) {
			return createwhileull2branchubbAdapter();
		}

		@Override
		public Adapter casewhileuld2branchubb(whileuld2branchubb object) {
			return createwhileuld2branchubbAdapter();
		}

		@Override
		public Adapter casewhilelul2branchbub(whilelul2branchbub object) {
			return createwhilelul2branchbubAdapter();
		}

		@Override
		public Adapter casenext2next(next2next object) {
			return createnext2nextAdapter();
		}

		@Override
		public Adapter casewhileal2branchcb(whileal2branchcb object) {
			return createwhileal2branchcbAdapter();
		}

		@Override
		public Adapter casefirstuwhile2rootubranch(firstuwhile2rootubranch object) {
			return createfirstuwhile2rootubranchAdapter();
		}

		@Override
		public Adapter casedecll2branchbb(decll2branchbb object) {
			return createdecll2branchbbAdapter();
		}

		@Override
		public Adapter casewhilela2branchbc(whilela2branchbc object) {
			return createwhilela2branchbcAdapter();
		}

		@Override
		public Adapter casewhiledl2branchbb(whiledl2branchbb object) {
			return createwhiledl2branchbbAdapter();
		}

		@Override
		public Adapter casedecdl2branchbb(decdl2branchbb object) {
			return createdecdl2branchbbAdapter();
		}

		@Override
		public Adapter caseprogram2graph(program2graph object) {
			return createprogram2graphAdapter();
		}

		@Override
		public Adapter casewhileda2branchbc(whileda2branchbc object) {
			return createwhileda2branchbcAdapter();
		}

		@Override
		public Adapter casewhileulul2branchubub(whileulul2branchubub object) {
			return createwhileulul2branchububAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileula2branchubc <em>whileula2branchubc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileula2branchubc
	 * @generated
	 */
	public Adapter createwhileula2branchubcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.while2branch <em>while2branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.while2branch
	 * @generated
	 */
	public Adapter createwhile2branchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whiled2branchb <em>whiled2branchb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whiled2branchb
	 * @generated
	 */
	public Adapter createwhiled2branchbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whiledul2branchbub <em>whiledul2branchbub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whiledul2branchbub
	 * @generated
	 */
	public Adapter createwhiledul2branchbubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileaul2branchcub <em>whileaul2branchcub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileaul2branchcub
	 * @generated
	 */
	public Adapter createwhileaul2branchcubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decassass2branchcmdcmd <em>decassass2branchcmdcmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decassass2branchcmdcmd
	 * @generated
	 */
	public Adapter createdecassass2branchcmdcmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decla2branchbc <em>decla2branchbc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decla2branchbc
	 * @generated
	 */
	public Adapter createdecla2branchbcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.firstdecision2firstbranch <em>firstdecision2firstbranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.firstdecision2firstbranch
	 * @generated
	 */
	public Adapter createfirstdecision2firstbranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decdecass2branchbranchcmd <em>decdecass2branchbranchcmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decdecass2branchbranchcmd
	 * @generated
	 */
	public Adapter createdecdecass2branchbranchcmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.firstwhile2rootbranch <em>firstwhile2rootbranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.firstwhile2rootbranch
	 * @generated
	 */
	public Adapter createfirstwhile2rootbranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decal2branchcb <em>decal2branchcb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decal2branchcb
	 * @generated
	 */
	public Adapter createdecal2branchcbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whilel2branchb <em>whilel2branchb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whilel2branchb
	 * @generated
	 */
	public Adapter createwhilel2branchbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decull2branchubb <em>decull2branchubb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decull2branchubb
	 * @generated
	 */
	public Adapter createdecull2branchubbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileaa2branchcc <em>whileaa2branchcc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileaa2branchcc
	 * @generated
	 */
	public Adapter createwhileaa2branchccAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.uwhile2ubranch <em>uwhile2ubranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.uwhile2ubranch
	 * @generated
	 */
	public Adapter createuwhile2ubranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whilell2branchbb <em>whilell2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whilell2branchbb
	 * @generated
	 */
	public Adapter createwhilell2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decdecdec2branchbranchbranch <em>decdecdec2branchbranchbranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decdecdec2branchbranchbranch
	 * @generated
	 */
	public Adapter createdecdecdec2branchbranchbranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whiledd2branchbb <em>whiledd2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whiledd2branchbb
	 * @generated
	 */
	public Adapter createwhiledd2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.deculul2branchubub <em>deculul2branchubub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.deculul2branchubub
	 * @generated
	 */
	public Adapter createdeculul2branchububAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decassdec2branchcmdbranch <em>decassdec2branchcmdbranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decassdec2branchcmdbranch
	 * @generated
	 */
	public Adapter createdecassdec2branchcmdbranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whilead2branchcb <em>whilead2branchcb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whilead2branchcb
	 * @generated
	 */
	public Adapter createwhilead2branchcbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileld2branchbb <em>whileld2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileld2branchbb
	 * @generated
	 */
	public Adapter createwhileld2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decld2branchbb <em>decld2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decld2branchbb
	 * @generated
	 */
	public Adapter createdecld2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decdul2branchbub <em>decdul2branchbub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decdul2branchbub
	 * @generated
	 */
	public Adapter createdecdul2branchbubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whilea2branchc <em>whilea2branchc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whilea2branchc
	 * @generated
	 */
	public Adapter createwhilea2branchcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decision2branch <em>decision2branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decision2branch
	 * @generated
	 */
	public Adapter createdecision2branchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decula2branchubc <em>decula2branchubc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decula2branchubc
	 * @generated
	 */
	public Adapter createdecula2branchubcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decaul2branchcub <em>decaul2branchcub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decaul2branchcub
	 * @generated
	 */
	public Adapter createdecaul2branchcubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.deculd2branchubb <em>deculd2branchubb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.deculd2branchubb
	 * @generated
	 */
	public Adapter createdeculd2branchubbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.assignment2command <em>assignment2command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.assignment2command
	 * @generated
	 */
	public Adapter createassignment2commandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.firstass2rootcmd <em>firstass2rootcmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.firstass2rootcmd
	 * @generated
	 */
	public Adapter createfirstass2rootcmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileul2branchub <em>whileul2branchub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileul2branchub
	 * @generated
	 */
	public Adapter createwhileul2branchubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.declul2branchbub <em>declul2branchbub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.declul2branchbub
	 * @generated
	 */
	public Adapter createdeclul2branchbubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileull2branchubb <em>whileull2branchubb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileull2branchubb
	 * @generated
	 */
	public Adapter createwhileull2branchubbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileuld2branchubb <em>whileuld2branchubb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileuld2branchubb
	 * @generated
	 */
	public Adapter createwhileuld2branchubbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whilelul2branchbub <em>whilelul2branchbub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whilelul2branchbub
	 * @generated
	 */
	public Adapter createwhilelul2branchbubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.next2next <em>next2next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.next2next
	 * @generated
	 */
	public Adapter createnext2nextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileal2branchcb <em>whileal2branchcb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileal2branchcb
	 * @generated
	 */
	public Adapter createwhileal2branchcbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.firstuwhile2rootubranch <em>firstuwhile2rootubranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.firstuwhile2rootubranch
	 * @generated
	 */
	public Adapter createfirstuwhile2rootubranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decll2branchbb <em>decll2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decll2branchbb
	 * @generated
	 */
	public Adapter createdecll2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whilela2branchbc <em>whilela2branchbc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whilela2branchbc
	 * @generated
	 */
	public Adapter createwhilela2branchbcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whiledl2branchbb <em>whiledl2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whiledl2branchbb
	 * @generated
	 */
	public Adapter createwhiledl2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.decdl2branchbb <em>decdl2branchbb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.decdl2branchbb
	 * @generated
	 */
	public Adapter createdecdl2branchbbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.program2graph <em>program2graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.program2graph
	 * @generated
	 */
	public Adapter createprogram2graphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileda2branchbc <em>whileda2branchbc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileda2branchbc
	 * @generated
	 */
	public Adapter createwhileda2branchbcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bx.sourcecode2controlflow.Rules.whileulul2branchubub <em>whileulul2branchubub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.whileulul2branchubub
	 * @generated
	 */
	public Adapter createwhileulul2branchububAdapter() {
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
