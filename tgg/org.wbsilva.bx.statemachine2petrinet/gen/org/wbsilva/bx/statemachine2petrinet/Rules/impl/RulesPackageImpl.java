/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

import org.wbsilva.bx.statemachine2petrinet.Rules.RulesFactory;
import org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage;

import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage;

import org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl;

import petrinet.PetrinetPackage;

import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass state2placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selftrans2arctransarcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initial2nothingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass final2nothingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transition2arctransarcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statemachine2petrinetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		StatemachinePackage.eINSTANCE.eClass();
		PetrinetPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Statemachine2petrinetPackageImpl theStatemachine2petrinetPackage = (Statemachine2petrinetPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Statemachine2petrinetPackage.eNS_URI) instanceof Statemachine2petrinetPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Statemachine2petrinetPackage.eNS_URI)
						: Statemachine2petrinetPackage.eINSTANCE);

		// Load packages
		theStatemachine2petrinetPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theStatemachine2petrinetPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstate2place() {
		if (state2placeEClass == null) {
			state2placeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return state2placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_FWD__Match_State_SM() {
		return getstate2place().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__Perform_FWD__IsApplicableMatch() {
		return getstate2place().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_FWD__Match() {
		return getstate2place().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__RegisterObjectsToMatch_FWD__Match_State_SM() {
		return getstate2place().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_solveCsp_FWD__Match_State_SM() {
		return getstate2place().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_checkCsp_FWD__CSP() {
		return getstate2place().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_solveCsp_FWD__IsApplicableMatch_SM2PN_State_SM_PNGraph() {
		return getstate2place().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_checkCsp_FWD__CSP() {
		return getstate2place().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getstate2place().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__CheckTypes_FWD__Match() {
		return getstate2place().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_BWD__Match_Place_PNGraph() {
		return getstate2place().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__Perform_BWD__IsApplicableMatch() {
		return getstate2place().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_BWD__Match() {
		return getstate2place().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__RegisterObjectsToMatch_BWD__Match_Place_PNGraph() {
		return getstate2place().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_solveCsp_BWD__Match_Place_PNGraph() {
		return getstate2place().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_checkCsp_BWD__CSP() {
		return getstate2place().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_solveCsp_BWD__IsApplicableMatch_Place_SM2PN_SM_PNGraph() {
		return getstate2place().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_checkCsp_BWD__CSP() {
		return getstate2place().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getstate2place().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__CheckTypes_BWD__Match() {
		return getstate2place().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge() {
		return getstate2place().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsAppropriate_FWD_EMoflonEdge_53__EMoflonEdge() {
		return getstate2place().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__CheckAttributes_FWD__TripleMatch() {
		return getstate2place().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__CheckAttributes_BWD__TripleMatch() {
		return getstate2place().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_CC__Match_Match() {
		return getstate2place().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_solveCsp_CC__Place_State_SM_PNGraph_Match_Match() {
		return getstate2place().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__IsApplicable_checkCsp_CC__CSP() {
		return getstate2place().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__CheckDEC_FWD__State_SM() {
		return getstate2place().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__CheckDEC_BWD__Place_PNGraph() {
		return getstate2place().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__GenerateModel__RuleEntryContainer_SM2PN() {
		return getstate2place().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__GenerateModel_solveCsp_BWD__IsApplicableMatch_SM2PN_SM_PNGraph_ModelgeneratorRuleResult() {
		return getstate2place().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstate2place__GenerateModel_checkCsp_BWD__CSP() {
		return getstate2place().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getselftrans2arctransarc() {
		if (selftrans2arctransarcEClass == null) {
			selftrans2arctransarcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return selftrans2arctransarcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_FWD__Match_SM_Transition_State() {
		return getselftrans2arctransarc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__Perform_FWD__IsApplicableMatch() {
		return getselftrans2arctransarc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_FWD__Match() {
		return getselftrans2arctransarc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__RegisterObjectsToMatch_FWD__Match_SM_Transition_State() {
		return getselftrans2arctransarc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_solveCsp_FWD__Match_SM_Transition_State() {
		return getselftrans2arctransarc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_checkCsp_FWD__CSP() {
		return getselftrans2arctransarc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2P_SM_Transition_Place_State_PNGraph_SM2PN() {
		return getselftrans2arctransarc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_checkCsp_FWD__CSP() {
		return getselftrans2arctransarc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getselftrans2arctransarc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__CheckTypes_FWD__Match() {
		return getselftrans2arctransarc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_BWD__Match_Transition_Place_Arc_PNGraph_Arc() {
		return getselftrans2arctransarc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__Perform_BWD__IsApplicableMatch() {
		return getselftrans2arctransarc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_BWD__Match() {
		return getselftrans2arctransarc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__RegisterObjectsToMatch_BWD__Match_Transition_Place_Arc_PNGraph_Arc() {
		return getselftrans2arctransarc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_solveCsp_BWD__Match_Transition_Place_Arc_PNGraph_Arc() {
		return getselftrans2arctransarc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_checkCsp_BWD__CSP() {
		return getselftrans2arctransarc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2P_SM_Transition_Place_State_Arc_PNGraph_Arc_SM2PN() {
		return getselftrans2arctransarc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_checkCsp_BWD__CSP() {
		return getselftrans2arctransarc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getselftrans2arctransarc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__CheckTypes_BWD__Match() {
		return getselftrans2arctransarc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge() {
		return getselftrans2arctransarc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsAppropriate_FWD_EMoflonEdge_54__EMoflonEdge() {
		return getselftrans2arctransarc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__CheckAttributes_FWD__TripleMatch() {
		return getselftrans2arctransarc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__CheckAttributes_BWD__TripleMatch() {
		return getselftrans2arctransarc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_CC__Match_Match() {
		return getselftrans2arctransarc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_solveCsp_CC__SM_Transition_Transition_Place_State_Arc_PNGraph_Arc_Match_Match() {
		return getselftrans2arctransarc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__IsApplicable_checkCsp_CC__CSP() {
		return getselftrans2arctransarc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__CheckDEC_FWD__SM_Transition_State() {
		return getselftrans2arctransarc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__CheckDEC_BWD__Transition_Place_Arc_PNGraph_Arc() {
		return getselftrans2arctransarc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__GenerateModel__RuleEntryContainer_S2P_SM2PN() {
		return getselftrans2arctransarc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2P_SM_Place_State_PNGraph_SM2PN_ModelgeneratorRuleResult() {
		return getselftrans2arctransarc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselftrans2arctransarc__GenerateModel_checkCsp_BWD__CSP() {
		return getselftrans2arctransarc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinitial2nothing() {
		if (initial2nothingEClass == null) {
			initial2nothingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return initial2nothingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_FWD__Match_State_SM() {
		return getinitial2nothing().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__Perform_FWD__IsApplicableMatch() {
		return getinitial2nothing().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_FWD__Match() {
		return getinitial2nothing().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__RegisterObjectsToMatch_FWD__Match_State_SM() {
		return getinitial2nothing().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_solveCsp_FWD__Match_State_SM() {
		return getinitial2nothing().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_checkCsp_FWD__CSP() {
		return getinitial2nothing().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_solveCsp_FWD__IsApplicableMatch_State_SM_SM2PN_PNGraph_Place_S2P() {
		return getinitial2nothing().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_checkCsp_FWD__CSP() {
		return getinitial2nothing().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getinitial2nothing().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__CheckTypes_FWD__Match() {
		return getinitial2nothing().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_BWD__Match_PNGraph_Place() {
		return getinitial2nothing().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__Perform_BWD__IsApplicableMatch() {
		return getinitial2nothing().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_BWD__Match() {
		return getinitial2nothing().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__RegisterObjectsToMatch_BWD__Match_PNGraph_Place() {
		return getinitial2nothing().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_solveCsp_BWD__Match_PNGraph_Place() {
		return getinitial2nothing().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_checkCsp_BWD__CSP() {
		return getinitial2nothing().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__CheckTypes_BWD__Match() {
		return getinitial2nothing().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_BWD_PNGraph_0__PNGraph() {
		return getinitial2nothing().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsAppropriate_FWD_EMoflonEdge_55__EMoflonEdge() {
		return getinitial2nothing().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__CheckAttributes_FWD__TripleMatch() {
		return getinitial2nothing().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__CheckAttributes_BWD__TripleMatch() {
		return getinitial2nothing().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_CC__Match_Match() {
		return getinitial2nothing().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_solveCsp_CC__State_SM_PNGraph_Place_Match_Match() {
		return getinitial2nothing().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__IsApplicable_checkCsp_CC__CSP() {
		return getinitial2nothing().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__CheckDEC_FWD__State_SM() {
		return getinitial2nothing().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__CheckDEC_BWD__PNGraph_Place() {
		return getinitial2nothing().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__GenerateModel__RuleEntryContainer_SM2PN() {
		return getinitial2nothing().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__GenerateModel_solveCsp_BWD__IsApplicableMatch_State_SM_SM2PN_PNGraph_Place_S2P_ModelgeneratorRuleResult() {
		return getinitial2nothing().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getinitial2nothing__GenerateModel_checkCsp_BWD__CSP() {
		return getinitial2nothing().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfinal2nothing() {
		if (final2nothingEClass == null) {
			final2nothingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return final2nothingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_FWD__Match_SM_State() {
		return getfinal2nothing().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__Perform_FWD__IsApplicableMatch() {
		return getfinal2nothing().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_FWD__Match() {
		return getfinal2nothing().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__RegisterObjectsToMatch_FWD__Match_SM_State() {
		return getfinal2nothing().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_solveCsp_FWD__Match_SM_State() {
		return getfinal2nothing().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_checkCsp_FWD__CSP() {
		return getfinal2nothing().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_solveCsp_FWD__IsApplicableMatch_SM_SM2PN_PNGraph_State_Place_S2P() {
		return getfinal2nothing().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_checkCsp_FWD__CSP() {
		return getfinal2nothing().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfinal2nothing().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__CheckTypes_FWD__Match() {
		return getfinal2nothing().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_BWD__Match_PNGraph_Place() {
		return getfinal2nothing().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__Perform_BWD__IsApplicableMatch() {
		return getfinal2nothing().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_BWD__Match() {
		return getfinal2nothing().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__RegisterObjectsToMatch_BWD__Match_PNGraph_Place() {
		return getfinal2nothing().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_solveCsp_BWD__Match_PNGraph_Place() {
		return getfinal2nothing().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_checkCsp_BWD__CSP() {
		return getfinal2nothing().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__CheckTypes_BWD__Match() {
		return getfinal2nothing().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_BWD_PNGraph_1__PNGraph() {
		return getfinal2nothing().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsAppropriate_FWD_EMoflonEdge_56__EMoflonEdge() {
		return getfinal2nothing().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__CheckAttributes_FWD__TripleMatch() {
		return getfinal2nothing().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__CheckAttributes_BWD__TripleMatch() {
		return getfinal2nothing().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_CC__Match_Match() {
		return getfinal2nothing().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_solveCsp_CC__SM_PNGraph_State_Place_Match_Match() {
		return getfinal2nothing().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__IsApplicable_checkCsp_CC__CSP() {
		return getfinal2nothing().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__CheckDEC_FWD__SM_State() {
		return getfinal2nothing().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__CheckDEC_BWD__PNGraph_Place() {
		return getfinal2nothing().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__GenerateModel__RuleEntryContainer_S2P() {
		return getfinal2nothing().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__GenerateModel_solveCsp_BWD__IsApplicableMatch_SM_SM2PN_PNGraph_State_Place_S2P_ModelgeneratorRuleResult() {
		return getfinal2nothing().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfinal2nothing__GenerateModel_checkCsp_BWD__CSP() {
		return getfinal2nothing().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransition2arctransarc() {
		if (transition2arctransarcEClass == null) {
			transition2arctransarcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return transition2arctransarcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_FWD__Match_Transition_State_State_SM() {
		return gettransition2arctransarc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__Perform_FWD__IsApplicableMatch() {
		return gettransition2arctransarc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_FWD__Match() {
		return gettransition2arctransarc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__RegisterObjectsToMatch_FWD__Match_Transition_State_State_SM() {
		return gettransition2arctransarc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_solveCsp_FWD__Match_Transition_State_State_SM() {
		return gettransition2arctransarc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_checkCsp_FWD__CSP() {
		return gettransition2arctransarc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_solveCsp_FWD__IsApplicableMatch_Transition_State_State_PNGraph_S2P_Place_SM_S2P_Place_SM2PN() {
		return gettransition2arctransarc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_checkCsp_FWD__CSP() {
		return gettransition2arctransarc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return gettransition2arctransarc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__CheckTypes_FWD__Match() {
		return gettransition2arctransarc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_BWD__Match_Transition_PNGraph_Place_Arc_Arc_Place() {
		return gettransition2arctransarc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__Perform_BWD__IsApplicableMatch() {
		return gettransition2arctransarc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_BWD__Match() {
		return gettransition2arctransarc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__RegisterObjectsToMatch_BWD__Match_Transition_PNGraph_Place_Arc_Arc_Place() {
		return gettransition2arctransarc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_solveCsp_BWD__Match_Transition_PNGraph_Place_Arc_Arc_Place() {
		return gettransition2arctransarc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_checkCsp_BWD__CSP() {
		return gettransition2arctransarc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_solveCsp_BWD__IsApplicableMatch_State_State_Transition_PNGraph_S2P_Place_Arc_SM_S2P_Arc_Place_SM2PN() {
		return gettransition2arctransarc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_checkCsp_BWD__CSP() {
		return gettransition2arctransarc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return gettransition2arctransarc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__CheckTypes_BWD__Match() {
		return gettransition2arctransarc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge() {
		return gettransition2arctransarc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsAppropriate_FWD_EMoflonEdge_57__EMoflonEdge() {
		return gettransition2arctransarc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__CheckAttributes_FWD__TripleMatch() {
		return gettransition2arctransarc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__CheckAttributes_BWD__TripleMatch() {
		return gettransition2arctransarc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_CC__Match_Match() {
		return gettransition2arctransarc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_solveCsp_CC__Transition_State_State_Transition_PNGraph_Place_Arc_SM_Arc_Place_Match_Match() {
		return gettransition2arctransarc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__IsApplicable_checkCsp_CC__CSP() {
		return gettransition2arctransarc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__CheckDEC_FWD__Transition_State_State_SM() {
		return gettransition2arctransarc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__CheckDEC_BWD__Transition_PNGraph_Place_Arc_Arc_Place() {
		return gettransition2arctransarc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__GenerateModel__RuleEntryContainer_S2P_S2P_SM2PN() {
		return gettransition2arctransarc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__GenerateModel_solveCsp_BWD__IsApplicableMatch_State_State_PNGraph_S2P_Place_SM_S2P_Place_SM2PN_ModelgeneratorRuleResult() {
		return gettransition2arctransarc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettransition2arctransarc__GenerateModel_checkCsp_BWD__CSP() {
		return gettransition2arctransarc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstatemachine2petrinet() {
		if (statemachine2petrinetEClass == null) {
			statemachine2petrinetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return statemachine2petrinetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_FWD__Match_SM() {
		return getstatemachine2petrinet().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__Perform_FWD__IsApplicableMatch() {
		return getstatemachine2petrinet().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_FWD__Match() {
		return getstatemachine2petrinet().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__RegisterObjectsToMatch_FWD__Match_SM() {
		return getstatemachine2petrinet().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_solveCsp_FWD__Match_SM() {
		return getstatemachine2petrinet().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_checkCsp_FWD__CSP() {
		return getstatemachine2petrinet().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_solveCsp_FWD__IsApplicableMatch_SM() {
		return getstatemachine2petrinet().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_checkCsp_FWD__CSP() {
		return getstatemachine2petrinet().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getstatemachine2petrinet().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__CheckTypes_FWD__Match() {
		return getstatemachine2petrinet().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_BWD__Match_PNGraph() {
		return getstatemachine2petrinet().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__Perform_BWD__IsApplicableMatch() {
		return getstatemachine2petrinet().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_BWD__Match() {
		return getstatemachine2petrinet().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__RegisterObjectsToMatch_BWD__Match_PNGraph() {
		return getstatemachine2petrinet().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_solveCsp_BWD__Match_PNGraph() {
		return getstatemachine2petrinet().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_checkCsp_BWD__CSP() {
		return getstatemachine2petrinet().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_solveCsp_BWD__IsApplicableMatch_PNGraph() {
		return getstatemachine2petrinet().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_checkCsp_BWD__CSP() {
		return getstatemachine2petrinet().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getstatemachine2petrinet().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__CheckTypes_BWD__Match() {
		return getstatemachine2petrinet().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_BWD_PNGraph_2__PNGraph() {
		return getstatemachine2petrinet().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsAppropriate_FWD_SM_0__SM() {
		return getstatemachine2petrinet().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__CheckAttributes_FWD__TripleMatch() {
		return getstatemachine2petrinet().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__CheckAttributes_BWD__TripleMatch() {
		return getstatemachine2petrinet().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_CC__Match_Match() {
		return getstatemachine2petrinet().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_solveCsp_CC__PNGraph_SM_Match_Match() {
		return getstatemachine2petrinet().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__IsApplicable_checkCsp_CC__CSP() {
		return getstatemachine2petrinet().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__CheckDEC_FWD__SM() {
		return getstatemachine2petrinet().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__CheckDEC_BWD__PNGraph() {
		return getstatemachine2petrinet().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__GenerateModel__RuleEntryContainer() {
		return getstatemachine2petrinet().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getstatemachine2petrinet().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstatemachine2petrinet__GenerateModel_checkCsp_BWD__CSP() {
		return getstatemachine2petrinet().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.wbsilva.bx.statemachine2petrinet.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
