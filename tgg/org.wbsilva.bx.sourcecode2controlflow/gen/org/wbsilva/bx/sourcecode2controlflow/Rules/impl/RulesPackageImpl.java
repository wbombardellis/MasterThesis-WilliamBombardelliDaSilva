/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import controlflow.ControlflowPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesFactory;
import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;

import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage;

import org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl;

import sourcecode.SourcecodePackage;

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
	private EClass whilela2branchbcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileld2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whilea2branchcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass while2branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiledd2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decla2branchbcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextd2nextbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decision2branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declul2branchbubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileaa2branchccEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstuwhile2rootubranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileul2branchubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileal2branchcbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileula2branchubcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileda2branchbcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decdecdec2branchbranchbranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstwhile2rootbranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileuld2branchubbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignment2commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileulul2branchububEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileull2branchubbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decll2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstdecision2firstbranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decassdec2branchcmdbranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decal2branchcbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiledul2branchbubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiledl2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deculd2branchubbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decdul2branchbubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass program2graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whilell2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decassass2branchcmdcmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deculul2branchububEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decdl2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstass2rootcmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileaul2branchcubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uwhile2ubranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whilelul2branchbubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decdecass2branchbranchcmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decull2branchubbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decld2branchbbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decaul2branchcubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whilel2branchbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass next2nextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decula2branchubcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whilead2branchcbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiled2branchbEClass = null;

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
	 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage#eNS_URI
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
		SourcecodePackage.eINSTANCE.eClass();
		ControlflowPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Sourcecode2controlflowPackageImpl theSourcecode2controlflowPackage = (Sourcecode2controlflowPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Sourcecode2controlflowPackage.eNS_URI) instanceof Sourcecode2controlflowPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Sourcecode2controlflowPackage.eNS_URI)
						: Sourcecode2controlflowPackage.eINSTANCE);

		// Load packages
		theSourcecode2controlflowPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theSourcecode2controlflowPackage.fixPackageContents();

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
	public EClass getwhilela2branchbc() {
		if (whilela2branchbcEClass == null) {
			whilela2branchbcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return whilela2branchbcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_FWD__Match_While_While_Assignment_Assignment() {
		return getwhilela2branchbc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__Perform_FWD__IsApplicableMatch() {
		return getwhilela2branchbc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_FWD__Match() {
		return getwhilela2branchbc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__RegisterObjectsToMatch_FWD__Match_While_While_Assignment_Assignment() {
		return getwhilela2branchbc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_solveCsp_FWD__Match_While_While_Assignment_Assignment() {
		return getwhilela2branchbc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhilela2branchbc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_While_Branch_While_Assignment_Assignment() {
		return getwhilela2branchbc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_checkCsp_FWD__CSP() {
		return getwhilela2branchbc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilela2branchbc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__CheckTypes_FWD__Match() {
		return getwhilela2branchbc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_BWD__Match_Branch_Branch_Command_Command() {
		return getwhilela2branchbc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__Perform_BWD__IsApplicableMatch() {
		return getwhilela2branchbc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_BWD__Match() {
		return getwhilela2branchbc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Command() {
		return getwhilela2branchbc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Command() {
		return getwhilela2branchbc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhilela2branchbc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Branch_While_Branch_Command_Command() {
		return getwhilela2branchbc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_checkCsp_BWD__CSP() {
		return getwhilela2branchbc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilela2branchbc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__CheckTypes_BWD__Match() {
		return getwhilela2branchbc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge() {
		return getwhilela2branchbc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsAppropriate_FWD_EMoflonEdge_69__EMoflonEdge() {
		return getwhilela2branchbc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__CheckAttributes_FWD__TripleMatch() {
		return getwhilela2branchbc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__CheckAttributes_BWD__TripleMatch() {
		return getwhilela2branchbc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_CC__Match_Match() {
		return getwhilela2branchbc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_solveCsp_CC__Branch_While_Branch_While_Command_Assignment_Command_Assignment_Match_Match() {
		return getwhilela2branchbc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__IsApplicable_checkCsp_CC__CSP() {
		return getwhilela2branchbc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__CheckDEC_FWD__While_While_Assignment_Assignment() {
		return getwhilela2branchbc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__CheckDEC_BWD__Branch_Branch_Command_Command() {
		return getwhilela2branchbc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__GenerateModel__RuleEntryContainer_S2B() {
		return getwhilela2branchbc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_While_Branch_ModelgeneratorRuleResult() {
		return getwhilela2branchbc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilela2branchbc__GenerateModel_checkCsp_BWD__CSP() {
		return getwhilela2branchbc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileld2branchbb() {
		if (whileld2branchbbEClass == null) {
			whileld2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return whileld2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_FWD__Match_While_Decision_While_Assignment() {
		return getwhileld2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__Perform_FWD__IsApplicableMatch() {
		return getwhileld2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_FWD__Match() {
		return getwhileld2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__RegisterObjectsToMatch_FWD__Match_While_Decision_While_Assignment() {
		return getwhileld2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_solveCsp_FWD__Match_While_Decision_While_Assignment() {
		return getwhileld2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileld2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_While_Decision_S2B_While_Assignment() {
		return getwhileld2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileld2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileld2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__CheckTypes_FWD__Match() {
		return getwhileld2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_BWD__Match_Branch_Branch_Branch_Command() {
		return getwhileld2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__Perform_BWD__IsApplicableMatch() {
		return getwhileld2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_BWD__Match() {
		return getwhileld2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Branch_Command() {
		return getwhileld2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Branch_Command() {
		return getwhileld2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileld2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_While_S2B_Branch_Command() {
		return getwhileld2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileld2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileld2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__CheckTypes_BWD__Match() {
		return getwhileld2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_BWD_EMoflonEdge_64__EMoflonEdge() {
		return getwhileld2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsAppropriate_FWD_EMoflonEdge_70__EMoflonEdge() {
		return getwhileld2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getwhileld2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getwhileld2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_CC__Match_Match() {
		return getwhileld2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_solveCsp_CC__Branch_Branch_While_Decision_While_Branch_Command_Assignment_Match_Match() {
		return getwhileld2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getwhileld2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__CheckDEC_FWD__While_Decision_While_Assignment() {
		return getwhileld2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__CheckDEC_BWD__Branch_Branch_Branch_Command() {
		return getwhileld2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileld2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_While_S2B_ModelgeneratorRuleResult() {
		return getwhileld2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileld2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileld2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhilea2branchc() {
		if (whilea2branchcEClass == null) {
			whilea2branchcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return whilea2branchcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_FWD__Match_While_Assignment() {
		return getwhilea2branchc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__Perform_FWD__IsApplicableMatch() {
		return getwhilea2branchc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_FWD__Match() {
		return getwhilea2branchc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__RegisterObjectsToMatch_FWD__Match_While_Assignment() {
		return getwhilea2branchc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_solveCsp_FWD__Match_While_Assignment() {
		return getwhilea2branchc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhilea2branchc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Branch_While_Assignment() {
		return getwhilea2branchc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_checkCsp_FWD__CSP() {
		return getwhilea2branchc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilea2branchc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__CheckTypes_FWD__Match() {
		return getwhilea2branchc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_BWD__Match_Branch_Command() {
		return getwhilea2branchc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__Perform_BWD__IsApplicableMatch() {
		return getwhilea2branchc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_BWD__Match() {
		return getwhilea2branchc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__RegisterObjectsToMatch_BWD__Match_Branch_Command() {
		return getwhilea2branchc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_solveCsp_BWD__Match_Branch_Command() {
		return getwhilea2branchc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhilea2branchc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Command_While() {
		return getwhilea2branchc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_checkCsp_BWD__CSP() {
		return getwhilea2branchc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilea2branchc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__CheckTypes_BWD__Match() {
		return getwhilea2branchc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_BWD_EMoflonEdge_65__EMoflonEdge() {
		return getwhilea2branchc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsAppropriate_FWD_EMoflonEdge_71__EMoflonEdge() {
		return getwhilea2branchc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__CheckAttributes_FWD__TripleMatch() {
		return getwhilea2branchc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__CheckAttributes_BWD__TripleMatch() {
		return getwhilea2branchc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_CC__Match_Match() {
		return getwhilea2branchc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_solveCsp_CC__Branch_Command_While_Assignment_Match_Match() {
		return getwhilea2branchc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__IsApplicable_checkCsp_CC__CSP() {
		return getwhilea2branchc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__CheckDEC_FWD__While_Assignment() {
		return getwhilea2branchc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__CheckDEC_BWD__Branch_Command() {
		return getwhilea2branchc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__GenerateModel__RuleEntryContainer_S2B() {
		return getwhilea2branchc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_While_ModelgeneratorRuleResult() {
		return getwhilea2branchc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilea2branchc__GenerateModel_checkCsp_BWD__CSP() {
		return getwhilea2branchc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhile2branch() {
		if (while2branchEClass == null) {
			while2branchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return while2branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_FWD__Match_Assignment_While_Statement() {
		return getwhile2branch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__Perform_FWD__IsApplicableMatch() {
		return getwhile2branch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_FWD__Match() {
		return getwhile2branch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__RegisterObjectsToMatch_FWD__Match_Assignment_While_Statement() {
		return getwhile2branch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_solveCsp_FWD__Match_Assignment_While_Statement() {
		return getwhile2branch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhile2branch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_While_S2N_Statement_Node() {
		return getwhile2branch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_checkCsp_FWD__CSP() {
		return getwhile2branch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhile2branch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__CheckTypes_FWD__Match() {
		return getwhile2branch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_BWD__Match_Branch_Command_Node() {
		return getwhile2branch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__Perform_BWD__IsApplicableMatch() {
		return getwhile2branch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_BWD__Match() {
		return getwhile2branch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__RegisterObjectsToMatch_BWD__Match_Branch_Command_Node() {
		return getwhile2branch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Node() {
		return getwhile2branch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhile2branch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Command_S2N_Statement_Node() {
		return getwhile2branch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_checkCsp_BWD__CSP() {
		return getwhile2branch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhile2branch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__CheckTypes_BWD__Match() {
		return getwhile2branch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_BWD_EMoflonEdge_66__EMoflonEdge() {
		return getwhile2branch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsAppropriate_FWD_EMoflonEdge_72__EMoflonEdge() {
		return getwhile2branch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__CheckAttributes_FWD__TripleMatch() {
		return getwhile2branch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__CheckAttributes_BWD__TripleMatch() {
		return getwhile2branch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_CC__Match_Match() {
		return getwhile2branch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_solveCsp_CC__Branch_Command_Assignment_While_Statement_Node_Match_Match() {
		return getwhile2branch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__IsApplicable_checkCsp_CC__CSP() {
		return getwhile2branch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__CheckDEC_FWD__Assignment_While_Statement() {
		return getwhile2branch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__CheckDEC_BWD__Branch_Command_Node() {
		return getwhile2branch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__GenerateModel__RuleEntryContainer_S2N() {
		return getwhile2branch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2N_Statement_Node_ModelgeneratorRuleResult() {
		return getwhile2branch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhile2branch__GenerateModel_checkCsp_BWD__CSP() {
		return getwhile2branch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhiledd2branchbb() {
		if (whiledd2branchbbEClass == null) {
			whiledd2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return whiledd2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_FWD__Match_Decision_While_Decision() {
		return getwhiledd2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__Perform_FWD__IsApplicableMatch() {
		return getwhiledd2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_FWD__Match() {
		return getwhiledd2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__RegisterObjectsToMatch_FWD__Match_Decision_While_Decision() {
		return getwhiledd2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_solveCsp_FWD__Match_Decision_While_Decision() {
		return getwhiledd2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhiledd2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Decision_Branch_While_Decision() {
		return getwhiledd2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhiledd2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiledd2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__CheckTypes_FWD__Match() {
		return getwhiledd2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_BWD__Match_Branch_Branch_Branch() {
		return getwhiledd2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__Perform_BWD__IsApplicableMatch() {
		return getwhiledd2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_BWD__Match() {
		return getwhiledd2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Branch() {
		return getwhiledd2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Branch() {
		return getwhiledd2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhiledd2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Branch_While_Branch() {
		return getwhiledd2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhiledd2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiledd2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__CheckTypes_BWD__Match() {
		return getwhiledd2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_BWD_EMoflonEdge_67__EMoflonEdge() {
		return getwhiledd2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsAppropriate_FWD_EMoflonEdge_73__EMoflonEdge() {
		return getwhiledd2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getwhiledd2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getwhiledd2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_CC__Match_Match() {
		return getwhiledd2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_solveCsp_CC__Decision_Branch_Branch_While_Branch_Decision_Match_Match() {
		return getwhiledd2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getwhiledd2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__CheckDEC_FWD__Decision_While_Decision() {
		return getwhiledd2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__CheckDEC_BWD__Branch_Branch_Branch() {
		return getwhiledd2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhiledd2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_While_ModelgeneratorRuleResult() {
		return getwhiledd2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledd2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhiledd2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecla2branchbc() {
		if (decla2branchbcEClass == null) {
			decla2branchbcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return decla2branchbcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_FWD__Match_Assignment_Assignment_While_Decision() {
		return getdecla2branchbc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__Perform_FWD__IsApplicableMatch() {
		return getdecla2branchbc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_FWD__Match() {
		return getdecla2branchbc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__RegisterObjectsToMatch_FWD__Match_Assignment_Assignment_While_Decision() {
		return getdecla2branchbc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_solveCsp_FWD__Match_Assignment_Assignment_While_Decision() {
		return getdecla2branchbc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecla2branchbc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_Assignment_Branch_While_Decision_S2B() {
		return getdecla2branchbc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_checkCsp_FWD__CSP() {
		return getdecla2branchbc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecla2branchbc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__CheckTypes_FWD__Match() {
		return getdecla2branchbc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_BWD__Match_Branch_Branch_Command_Command() {
		return getdecla2branchbc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__Perform_BWD__IsApplicableMatch() {
		return getdecla2branchbc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_BWD__Match() {
		return getdecla2branchbc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Command() {
		return getdecla2branchbc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Command() {
		return getdecla2branchbc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecla2branchbc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_Command_Decision_S2B_Command() {
		return getdecla2branchbc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_checkCsp_BWD__CSP() {
		return getdecla2branchbc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecla2branchbc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__CheckTypes_BWD__Match() {
		return getdecla2branchbc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_BWD_EMoflonEdge_68__EMoflonEdge() {
		return getdecla2branchbc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsAppropriate_FWD_EMoflonEdge_74__EMoflonEdge() {
		return getdecla2branchbc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__CheckAttributes_FWD__TripleMatch() {
		return getdecla2branchbc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__CheckAttributes_BWD__TripleMatch() {
		return getdecla2branchbc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_CC__Match_Match() {
		return getdecla2branchbc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_solveCsp_CC__Assignment_Branch_Assignment_Branch_Command_While_Decision_Command_Match_Match() {
		return getdecla2branchbc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__IsApplicable_checkCsp_CC__CSP() {
		return getdecla2branchbc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__CheckDEC_FWD__Assignment_Assignment_While_Decision() {
		return getdecla2branchbc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__CheckDEC_BWD__Branch_Branch_Command_Command() {
		return getdecla2branchbc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__GenerateModel__RuleEntryContainer_S2B() {
		return getdecla2branchbc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_Decision_S2B_ModelgeneratorRuleResult() {
		return getdecla2branchbc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecla2branchbc__GenerateModel_checkCsp_BWD__CSP() {
		return getdecla2branchbc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnextd2nextb() {
		if (nextd2nextbEClass == null) {
			nextd2nextbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(6);
		}
		return nextd2nextbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_FWD__Match_Statement_Assignment() {
		return getnextd2nextb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__Perform_FWD__IsApplicableMatch() {
		return getnextd2nextb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_FWD__Match() {
		return getnextd2nextb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__RegisterObjectsToMatch_FWD__Match_Statement_Assignment() {
		return getnextd2nextb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_solveCsp_FWD__Match_Statement_Assignment() {
		return getnextd2nextb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_checkCsp_FWD__CSP() {
		return getnextd2nextb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_S2N_Statement_S2B_Assignment_Command() {
		return getnextd2nextb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_checkCsp_FWD__CSP() {
		return getnextd2nextb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getnextd2nextb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__CheckTypes_FWD__Match() {
		return getnextd2nextb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_BWD__Match_Branch_Command() {
		return getnextd2nextb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__Perform_BWD__IsApplicableMatch() {
		return getnextd2nextb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_BWD__Match() {
		return getnextd2nextb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__RegisterObjectsToMatch_BWD__Match_Branch_Command() {
		return getnextd2nextb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_solveCsp_BWD__Match_Branch_Command() {
		return getnextd2nextb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_checkCsp_BWD__CSP() {
		return getnextd2nextb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_S2N_Statement_S2B_Assignment_Command() {
		return getnextd2nextb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_checkCsp_BWD__CSP() {
		return getnextd2nextb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getnextd2nextb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__CheckTypes_BWD__Match() {
		return getnextd2nextb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_BWD_EMoflonEdge_69__EMoflonEdge() {
		return getnextd2nextb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsAppropriate_FWD_EMoflonEdge_75__EMoflonEdge() {
		return getnextd2nextb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__CheckAttributes_FWD__TripleMatch() {
		return getnextd2nextb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__CheckAttributes_BWD__TripleMatch() {
		return getnextd2nextb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_CC__Match_Match() {
		return getnextd2nextb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_solveCsp_CC__Branch_Statement_Assignment_Command_Match_Match() {
		return getnextd2nextb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__IsApplicable_checkCsp_CC__CSP() {
		return getnextd2nextb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__CheckDEC_FWD__Statement_Assignment() {
		return getnextd2nextb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__CheckDEC_BWD__Branch_Command() {
		return getnextd2nextb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__GenerateModel__RuleEntryContainer_S2B_S2N() {
		return getnextd2nextb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2N_Statement_S2B_Assignment_Command_ModelgeneratorRuleResult() {
		return getnextd2nextb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnextd2nextb__GenerateModel_checkCsp_BWD__CSP() {
		return getnextd2nextb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecision2branch() {
		if (decision2branchEClass == null) {
			decision2branchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return decision2branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_FWD__Match_Decision_Statement() {
		return getdecision2branch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__Perform_FWD__IsApplicableMatch() {
		return getdecision2branch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_FWD__Match() {
		return getdecision2branch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__RegisterObjectsToMatch_FWD__Match_Decision_Statement() {
		return getdecision2branch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_solveCsp_FWD__Match_Decision_Statement() {
		return getdecision2branch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecision2branch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Node_Decision_S2N_Statement() {
		return getdecision2branch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_checkCsp_FWD__CSP() {
		return getdecision2branch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecision2branch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__CheckTypes_FWD__Match() {
		return getdecision2branch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_BWD__Match_Node_Branch() {
		return getdecision2branch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__Perform_BWD__IsApplicableMatch() {
		return getdecision2branch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_BWD__Match() {
		return getdecision2branch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__RegisterObjectsToMatch_BWD__Match_Node_Branch() {
		return getdecision2branch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_solveCsp_BWD__Match_Node_Branch() {
		return getdecision2branch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecision2branch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_solveCsp_BWD__IsApplicableMatch_Node_S2N_Branch_Statement() {
		return getdecision2branch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_checkCsp_BWD__CSP() {
		return getdecision2branch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecision2branch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__CheckTypes_BWD__Match() {
		return getdecision2branch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_BWD_EMoflonEdge_70__EMoflonEdge() {
		return getdecision2branch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsAppropriate_FWD_EMoflonEdge_76__EMoflonEdge() {
		return getdecision2branch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__CheckAttributes_FWD__TripleMatch() {
		return getdecision2branch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__CheckAttributes_BWD__TripleMatch() {
		return getdecision2branch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_CC__Match_Match() {
		return getdecision2branch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_solveCsp_CC__Node_Decision_Branch_Statement_Match_Match() {
		return getdecision2branch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__IsApplicable_checkCsp_CC__CSP() {
		return getdecision2branch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__CheckDEC_FWD__Decision_Statement() {
		return getdecision2branch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__CheckDEC_BWD__Node_Branch() {
		return getdecision2branch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__GenerateModel__RuleEntryContainer_S2N() {
		return getdecision2branch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__GenerateModel_solveCsp_BWD__IsApplicableMatch_Node_S2N_Statement_ModelgeneratorRuleResult() {
		return getdecision2branch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecision2branch__GenerateModel_checkCsp_BWD__CSP() {
		return getdecision2branch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeclul2branchbub() {
		if (declul2branchbubEClass == null) {
			declul2branchbubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return declul2branchbubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_FWD__Match_Assignment_While_While_Assignment_Decision() {
		return getdeclul2branchbub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__Perform_FWD__IsApplicableMatch() {
		return getdeclul2branchbub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_FWD__Match() {
		return getdeclul2branchbub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__RegisterObjectsToMatch_FWD__Match_Assignment_While_While_Assignment_Decision() {
		return getdeclul2branchbub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_solveCsp_FWD__Match_Assignment_While_While_Assignment_Decision() {
		return getdeclul2branchbub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_checkCsp_FWD__CSP() {
		return getdeclul2branchbub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_While_While_Assignment_Decision_S2B_Branch() {
		return getdeclul2branchbub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_checkCsp_FWD__CSP() {
		return getdeclul2branchbub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdeclul2branchbub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__CheckTypes_FWD__Match() {
		return getdeclul2branchbub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_BWD__Match_Command_Branch_Command_Branch_Branch() {
		return getdeclul2branchbub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__Perform_BWD__IsApplicableMatch() {
		return getdeclul2branchbub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_BWD__Match() {
		return getdeclul2branchbub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__RegisterObjectsToMatch_BWD__Match_Command_Branch_Command_Branch_Branch() {
		return getdeclul2branchbub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Command_Branch_Branch() {
		return getdeclul2branchbub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_checkCsp_BWD__CSP() {
		return getdeclul2branchbub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_Branch_Decision_Command_S2B_Branch_Branch() {
		return getdeclul2branchbub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_checkCsp_BWD__CSP() {
		return getdeclul2branchbub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdeclul2branchbub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__CheckTypes_BWD__Match() {
		return getdeclul2branchbub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_BWD_EMoflonEdge_71__EMoflonEdge() {
		return getdeclul2branchbub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsAppropriate_FWD_EMoflonEdge_77__EMoflonEdge() {
		return getdeclul2branchbub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__CheckAttributes_FWD__TripleMatch() {
		return getdeclul2branchbub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__CheckAttributes_BWD__TripleMatch() {
		return getdeclul2branchbub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_CC__Match_Match() {
		return getdeclul2branchbub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_solveCsp_CC__Command_Assignment_While_Branch_While_Assignment_Decision_Command_Branch_Branch_Match_Match() {
		return getdeclul2branchbub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__IsApplicable_checkCsp_CC__CSP() {
		return getdeclul2branchbub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__CheckDEC_FWD__Assignment_While_While_Assignment_Decision() {
		return getdeclul2branchbub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__CheckDEC_BWD__Command_Branch_Command_Branch_Branch() {
		return getdeclul2branchbub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__GenerateModel__RuleEntryContainer_S2B() {
		return getdeclul2branchbub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__GenerateModel_solveCsp_BWD__IsApplicableMatch_Decision_S2B_Branch_ModelgeneratorRuleResult() {
		return getdeclul2branchbub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeclul2branchbub__GenerateModel_checkCsp_BWD__CSP() {
		return getdeclul2branchbub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileaa2branchcc() {
		if (whileaa2branchccEClass == null) {
			whileaa2branchccEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return whileaa2branchccEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_FWD__Match_While_Assignment_Assignment() {
		return getwhileaa2branchcc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__Perform_FWD__IsApplicableMatch() {
		return getwhileaa2branchcc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_FWD__Match() {
		return getwhileaa2branchcc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__RegisterObjectsToMatch_FWD__Match_While_Assignment_Assignment() {
		return getwhileaa2branchcc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_solveCsp_FWD__Match_While_Assignment_Assignment() {
		return getwhileaa2branchcc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileaa2branchcc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_S2B_Assignment_Assignment_Branch() {
		return getwhileaa2branchcc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileaa2branchcc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileaa2branchcc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__CheckTypes_FWD__Match() {
		return getwhileaa2branchcc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_BWD__Match_Command_Command_Branch() {
		return getwhileaa2branchcc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__Perform_BWD__IsApplicableMatch() {
		return getwhileaa2branchcc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_BWD__Match() {
		return getwhileaa2branchcc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__RegisterObjectsToMatch_BWD__Match_Command_Command_Branch() {
		return getwhileaa2branchcc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_solveCsp_BWD__Match_Command_Command_Branch() {
		return getwhileaa2branchcc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileaa2branchcc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_solveCsp_BWD__IsApplicableMatch_While_Command_S2B_Command_Branch() {
		return getwhileaa2branchcc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileaa2branchcc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileaa2branchcc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__CheckTypes_BWD__Match() {
		return getwhileaa2branchcc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_BWD_EMoflonEdge_72__EMoflonEdge() {
		return getwhileaa2branchcc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsAppropriate_FWD_EMoflonEdge_78__EMoflonEdge() {
		return getwhileaa2branchcc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__CheckAttributes_FWD__TripleMatch() {
		return getwhileaa2branchcc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__CheckAttributes_BWD__TripleMatch() {
		return getwhileaa2branchcc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_CC__Match_Match() {
		return getwhileaa2branchcc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_solveCsp_CC__While_Command_Assignment_Command_Assignment_Branch_Match_Match() {
		return getwhileaa2branchcc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__IsApplicable_checkCsp_CC__CSP() {
		return getwhileaa2branchcc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__CheckDEC_FWD__While_Assignment_Assignment() {
		return getwhileaa2branchcc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__CheckDEC_BWD__Command_Command_Branch() {
		return getwhileaa2branchcc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileaa2branchcc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__GenerateModel_solveCsp_BWD__IsApplicableMatch_While_S2B_Branch_ModelgeneratorRuleResult() {
		return getwhileaa2branchcc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaa2branchcc__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileaa2branchcc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfirstuwhile2rootubranch() {
		if (firstuwhile2rootubranchEClass == null) {
			firstuwhile2rootubranchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return firstuwhile2rootubranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_FWD__Match_While_Program_Assignment() {
		return getfirstuwhile2rootubranch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__Perform_FWD__IsApplicableMatch() {
		return getfirstuwhile2rootubranch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_FWD__Match() {
		return getfirstuwhile2rootubranch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__RegisterObjectsToMatch_FWD__Match_While_Program_Assignment() {
		return getfirstuwhile2rootubranch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_solveCsp_FWD__Match_While_Program_Assignment() {
		return getfirstuwhile2rootubranch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_checkCsp_FWD__CSP() {
		return getfirstuwhile2rootubranch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Graph_While_Program_Assignment_P2G() {
		return getfirstuwhile2rootubranch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_checkCsp_FWD__CSP() {
		return getfirstuwhile2rootubranch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstuwhile2rootubranch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__CheckTypes_FWD__Match() {
		return getfirstuwhile2rootubranch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_BWD__Match_Graph_Branch_Command() {
		return getfirstuwhile2rootubranch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__Perform_BWD__IsApplicableMatch() {
		return getfirstuwhile2rootubranch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_BWD__Match() {
		return getfirstuwhile2rootubranch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__RegisterObjectsToMatch_BWD__Match_Graph_Branch_Command() {
		return getfirstuwhile2rootubranch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_solveCsp_BWD__Match_Graph_Branch_Command() {
		return getfirstuwhile2rootubranch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_checkCsp_BWD__CSP() {
		return getfirstuwhile2rootubranch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_solveCsp_BWD__IsApplicableMatch_Graph_Branch_Command_Program_P2G() {
		return getfirstuwhile2rootubranch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_checkCsp_BWD__CSP() {
		return getfirstuwhile2rootubranch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstuwhile2rootubranch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__CheckTypes_BWD__Match() {
		return getfirstuwhile2rootubranch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_BWD_EMoflonEdge_73__EMoflonEdge() {
		return getfirstuwhile2rootubranch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsAppropriate_FWD_EMoflonEdge_79__EMoflonEdge() {
		return getfirstuwhile2rootubranch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__CheckAttributes_FWD__TripleMatch() {
		return getfirstuwhile2rootubranch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__CheckAttributes_BWD__TripleMatch() {
		return getfirstuwhile2rootubranch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_CC__Match_Match() {
		return getfirstuwhile2rootubranch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_solveCsp_CC__Graph_Branch_Command_While_Program_Assignment_Match_Match() {
		return getfirstuwhile2rootubranch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__IsApplicable_checkCsp_CC__CSP() {
		return getfirstuwhile2rootubranch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__CheckDEC_FWD__While_Program_Assignment() {
		return getfirstuwhile2rootubranch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__CheckDEC_BWD__Graph_Branch_Command() {
		return getfirstuwhile2rootubranch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__GenerateModel__RuleEntryContainer_P2G() {
		return getfirstuwhile2rootubranch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__GenerateModel_solveCsp_BWD__IsApplicableMatch_Graph_Program_P2G_ModelgeneratorRuleResult() {
		return getfirstuwhile2rootubranch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstuwhile2rootubranch__GenerateModel_checkCsp_BWD__CSP() {
		return getfirstuwhile2rootubranch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileul2branchub() {
		if (whileul2branchubEClass == null) {
			whileul2branchubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return whileul2branchubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_FWD__Match_While_Assignment_While() {
		return getwhileul2branchub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__Perform_FWD__IsApplicableMatch() {
		return getwhileul2branchub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_FWD__Match() {
		return getwhileul2branchub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__RegisterObjectsToMatch_FWD__Match_While_Assignment_While() {
		return getwhileul2branchub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_solveCsp_FWD__Match_While_Assignment_While() {
		return getwhileul2branchub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileul2branchub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Assignment_S2B_While_Branch() {
		return getwhileul2branchub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileul2branchub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileul2branchub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__CheckTypes_FWD__Match() {
		return getwhileul2branchub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_BWD__Match_Command_Branch_Branch() {
		return getwhileul2branchub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__Perform_BWD__IsApplicableMatch() {
		return getwhileul2branchub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_BWD__Match() {
		return getwhileul2branchub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__RegisterObjectsToMatch_BWD__Match_Command_Branch_Branch() {
		return getwhileul2branchub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Branch() {
		return getwhileul2branchub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileul2branchub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_solveCsp_BWD__IsApplicableMatch_While_Command_Branch_S2B_Branch() {
		return getwhileul2branchub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileul2branchub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileul2branchub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__CheckTypes_BWD__Match() {
		return getwhileul2branchub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_BWD_EMoflonEdge_74__EMoflonEdge() {
		return getwhileul2branchub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsAppropriate_FWD_EMoflonEdge_80__EMoflonEdge() {
		return getwhileul2branchub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__CheckAttributes_FWD__TripleMatch() {
		return getwhileul2branchub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__CheckAttributes_BWD__TripleMatch() {
		return getwhileul2branchub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_CC__Match_Match() {
		return getwhileul2branchub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_solveCsp_CC__While_Command_Branch_Assignment_While_Branch_Match_Match() {
		return getwhileul2branchub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__IsApplicable_checkCsp_CC__CSP() {
		return getwhileul2branchub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__CheckDEC_FWD__While_Assignment_While() {
		return getwhileul2branchub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__CheckDEC_BWD__Command_Branch_Branch() {
		return getwhileul2branchub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileul2branchub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__GenerateModel_solveCsp_BWD__IsApplicableMatch_While_S2B_Branch_ModelgeneratorRuleResult() {
		return getwhileul2branchub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileul2branchub__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileul2branchub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileal2branchcb() {
		if (whileal2branchcbEClass == null) {
			whileal2branchcbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return whileal2branchcbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_FWD__Match_While_Assignment_While_Assignment() {
		return getwhileal2branchcb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__Perform_FWD__IsApplicableMatch() {
		return getwhileal2branchcb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_FWD__Match() {
		return getwhileal2branchcb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__RegisterObjectsToMatch_FWD__Match_While_Assignment_While_Assignment() {
		return getwhileal2branchcb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_solveCsp_FWD__Match_While_Assignment_While_Assignment() {
		return getwhileal2branchcb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileal2branchcb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_S2B_While_Assignment_While_Assignment() {
		return getwhileal2branchcb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileal2branchcb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileal2branchcb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__CheckTypes_FWD__Match() {
		return getwhileal2branchcb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_BWD__Match_Command_Branch_Branch_Command() {
		return getwhileal2branchcb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__Perform_BWD__IsApplicableMatch() {
		return getwhileal2branchcb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_BWD__Match() {
		return getwhileal2branchcb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__RegisterObjectsToMatch_BWD__Match_Command_Branch_Branch_Command() {
		return getwhileal2branchcb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Branch_Command() {
		return getwhileal2branchcb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileal2branchcb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_Branch_Branch_S2B_Command_While() {
		return getwhileal2branchcb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileal2branchcb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileal2branchcb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__CheckTypes_BWD__Match() {
		return getwhileal2branchcb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_BWD_EMoflonEdge_75__EMoflonEdge() {
		return getwhileal2branchcb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsAppropriate_FWD_EMoflonEdge_81__EMoflonEdge() {
		return getwhileal2branchcb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__CheckAttributes_FWD__TripleMatch() {
		return getwhileal2branchcb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__CheckAttributes_BWD__TripleMatch() {
		return getwhileal2branchcb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_CC__Match_Match() {
		return getwhileal2branchcb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_solveCsp_CC__Command_Branch_Branch_While_Assignment_Command_While_Assignment_Match_Match() {
		return getwhileal2branchcb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__IsApplicable_checkCsp_CC__CSP() {
		return getwhileal2branchcb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__CheckDEC_FWD__While_Assignment_While_Assignment() {
		return getwhileal2branchcb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__CheckDEC_BWD__Command_Branch_Branch_Command() {
		return getwhileal2branchcb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileal2branchcb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_While_ModelgeneratorRuleResult() {
		return getwhileal2branchcb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileal2branchcb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileal2branchcb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileula2branchubc() {
		if (whileula2branchubcEClass == null) {
			whileula2branchubcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return whileula2branchubcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_FWD__Match_While_Assignment_While_Assignment() {
		return getwhileula2branchubc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__Perform_FWD__IsApplicableMatch() {
		return getwhileula2branchubc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_FWD__Match() {
		return getwhileula2branchubc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__RegisterObjectsToMatch_FWD__Match_While_Assignment_While_Assignment() {
		return getwhileula2branchubc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_solveCsp_FWD__Match_While_Assignment_While_Assignment() {
		return getwhileula2branchubc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileula2branchubc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Branch_Assignment_S2B_While_Assignment() {
		return getwhileula2branchubc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileula2branchubc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileula2branchubc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__CheckTypes_FWD__Match() {
		return getwhileula2branchubc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_BWD__Match_Branch_Branch_Command_Command() {
		return getwhileula2branchubc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__Perform_BWD__IsApplicableMatch() {
		return getwhileula2branchubc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_BWD__Match() {
		return getwhileula2branchubc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Command() {
		return getwhileula2branchubc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Command() {
		return getwhileula2branchubc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileula2branchubc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_Command_Command_S2B_While() {
		return getwhileula2branchubc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileula2branchubc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileula2branchubc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__CheckTypes_BWD__Match() {
		return getwhileula2branchubc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_BWD_EMoflonEdge_76__EMoflonEdge() {
		return getwhileula2branchubc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsAppropriate_FWD_EMoflonEdge_82__EMoflonEdge() {
		return getwhileula2branchubc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__CheckAttributes_FWD__TripleMatch() {
		return getwhileula2branchubc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__CheckAttributes_BWD__TripleMatch() {
		return getwhileula2branchubc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_CC__Match_Match() {
		return getwhileula2branchubc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_solveCsp_CC__While_Branch_Branch_Command_Assignment_Command_While_Assignment_Match_Match() {
		return getwhileula2branchubc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__IsApplicable_checkCsp_CC__CSP() {
		return getwhileula2branchubc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__CheckDEC_FWD__While_Assignment_While_Assignment() {
		return getwhileula2branchubc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__CheckDEC_BWD__Branch_Branch_Command_Command() {
		return getwhileula2branchubc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileula2branchubc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_While_ModelgeneratorRuleResult() {
		return getwhileula2branchubc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileula2branchubc__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileula2branchubc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileda2branchbc() {
		if (whileda2branchbcEClass == null) {
			whileda2branchbcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return whileda2branchbcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_FWD__Match_While_Decision_Assignment() {
		return getwhileda2branchbc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__Perform_FWD__IsApplicableMatch() {
		return getwhileda2branchbc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_FWD__Match() {
		return getwhileda2branchbc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__RegisterObjectsToMatch_FWD__Match_While_Decision_Assignment() {
		return getwhileda2branchbc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_solveCsp_FWD__Match_While_Decision_Assignment() {
		return getwhileda2branchbc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileda2branchbc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Branch_While_Decision_Assignment() {
		return getwhileda2branchbc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileda2branchbc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileda2branchbc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__CheckTypes_FWD__Match() {
		return getwhileda2branchbc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_BWD__Match_Branch_Branch_Command() {
		return getwhileda2branchbc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__Perform_BWD__IsApplicableMatch() {
		return getwhileda2branchbc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_BWD__Match() {
		return getwhileda2branchbc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command() {
		return getwhileda2branchbc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command() {
		return getwhileda2branchbc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileda2branchbc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Branch_While_Command() {
		return getwhileda2branchbc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileda2branchbc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileda2branchbc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__CheckTypes_BWD__Match() {
		return getwhileda2branchbc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_BWD_EMoflonEdge_77__EMoflonEdge() {
		return getwhileda2branchbc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsAppropriate_FWD_EMoflonEdge_83__EMoflonEdge() {
		return getwhileda2branchbc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__CheckAttributes_FWD__TripleMatch() {
		return getwhileda2branchbc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__CheckAttributes_BWD__TripleMatch() {
		return getwhileda2branchbc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_CC__Match_Match() {
		return getwhileda2branchbc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_solveCsp_CC__Branch_Branch_While_Decision_Assignment_Command_Match_Match() {
		return getwhileda2branchbc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__IsApplicable_checkCsp_CC__CSP() {
		return getwhileda2branchbc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__CheckDEC_FWD__While_Decision_Assignment() {
		return getwhileda2branchbc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__CheckDEC_BWD__Branch_Branch_Command() {
		return getwhileda2branchbc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileda2branchbc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_While_ModelgeneratorRuleResult() {
		return getwhileda2branchbc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileda2branchbc__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileda2branchbc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecdecdec2branchbranchbranch() {
		if (decdecdec2branchbranchbranchEClass == null) {
			decdecdec2branchbranchbranchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return decdecdec2branchbranchbranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_FWD__Match_Decision_Decision_Decision() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__Perform_FWD__IsApplicableMatch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_FWD__Match() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__RegisterObjectsToMatch_FWD__Match_Decision_Decision_Decision() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_solveCsp_FWD__Match_Decision_Decision_Decision() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Decision_S2B_Decision_Decision_Branch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_checkCsp_FWD__CSP() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__CheckTypes_FWD__Match() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_BWD__Match_Branch_Branch_Branch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__Perform_BWD__IsApplicableMatch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_BWD__Match() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Branch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Branch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Decision_Branch_Branch_Branch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_checkCsp_BWD__CSP() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__CheckTypes_BWD__Match() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_BWD_EMoflonEdge_78__EMoflonEdge() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsAppropriate_FWD_EMoflonEdge_84__EMoflonEdge() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__CheckAttributes_FWD__TripleMatch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__CheckAttributes_BWD__TripleMatch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_CC__Match_Match() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_solveCsp_CC__Decision_Decision_Decision_Branch_Branch_Branch_Match_Match() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__IsApplicable_checkCsp_CC__CSP() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__CheckDEC_FWD__Decision_Decision_Decision() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__CheckDEC_BWD__Branch_Branch_Branch() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__GenerateModel__RuleEntryContainer_S2B() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Decision_Branch_ModelgeneratorRuleResult() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecdec2branchbranchbranch__GenerateModel_checkCsp_BWD__CSP() {
		return getdecdecdec2branchbranchbranch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfirstwhile2rootbranch() {
		if (firstwhile2rootbranchEClass == null) {
			firstwhile2rootbranchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return firstwhile2rootbranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_FWD__Match_While_Assignment_Program() {
		return getfirstwhile2rootbranch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__Perform_FWD__IsApplicableMatch() {
		return getfirstwhile2rootbranch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_FWD__Match() {
		return getfirstwhile2rootbranch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__RegisterObjectsToMatch_FWD__Match_While_Assignment_Program() {
		return getfirstwhile2rootbranch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_solveCsp_FWD__Match_While_Assignment_Program() {
		return getfirstwhile2rootbranch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_checkCsp_FWD__CSP() {
		return getfirstwhile2rootbranch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_P2G_Assignment_Program_Graph() {
		return getfirstwhile2rootbranch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_checkCsp_FWD__CSP() {
		return getfirstwhile2rootbranch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstwhile2rootbranch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__CheckTypes_FWD__Match() {
		return getfirstwhile2rootbranch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_BWD__Match_Branch_Command_Graph() {
		return getfirstwhile2rootbranch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__Perform_BWD__IsApplicableMatch() {
		return getfirstwhile2rootbranch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_BWD__Match() {
		return getfirstwhile2rootbranch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__RegisterObjectsToMatch_BWD__Match_Branch_Command_Graph() {
		return getfirstwhile2rootbranch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Graph() {
		return getfirstwhile2rootbranch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_checkCsp_BWD__CSP() {
		return getfirstwhile2rootbranch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_P2G_Command_Program_Graph() {
		return getfirstwhile2rootbranch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_checkCsp_BWD__CSP() {
		return getfirstwhile2rootbranch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstwhile2rootbranch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__CheckTypes_BWD__Match() {
		return getfirstwhile2rootbranch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_BWD_EMoflonEdge_79__EMoflonEdge() {
		return getfirstwhile2rootbranch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsAppropriate_FWD_EMoflonEdge_85__EMoflonEdge() {
		return getfirstwhile2rootbranch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__CheckAttributes_FWD__TripleMatch() {
		return getfirstwhile2rootbranch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__CheckAttributes_BWD__TripleMatch() {
		return getfirstwhile2rootbranch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_CC__Match_Match() {
		return getfirstwhile2rootbranch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_solveCsp_CC__Branch_While_Assignment_Command_Program_Graph_Match_Match() {
		return getfirstwhile2rootbranch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__IsApplicable_checkCsp_CC__CSP() {
		return getfirstwhile2rootbranch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__CheckDEC_FWD__While_Assignment_Program() {
		return getfirstwhile2rootbranch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__CheckDEC_BWD__Branch_Command_Graph() {
		return getfirstwhile2rootbranch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__GenerateModel__RuleEntryContainer_P2G() {
		return getfirstwhile2rootbranch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__GenerateModel_solveCsp_BWD__IsApplicableMatch_P2G_Program_Graph_ModelgeneratorRuleResult() {
		return getfirstwhile2rootbranch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstwhile2rootbranch__GenerateModel_checkCsp_BWD__CSP() {
		return getfirstwhile2rootbranch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileuld2branchubb() {
		if (whileuld2branchubbEClass == null) {
			whileuld2branchubbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return whileuld2branchubbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_FWD__Match_While_While_Decision_Assignment() {
		return getwhileuld2branchubb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__Perform_FWD__IsApplicableMatch() {
		return getwhileuld2branchubb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_FWD__Match() {
		return getwhileuld2branchubb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__RegisterObjectsToMatch_FWD__Match_While_While_Decision_Assignment() {
		return getwhileuld2branchubb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_solveCsp_FWD__Match_While_While_Decision_Assignment() {
		return getwhileuld2branchubb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileuld2branchubb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_While_While_Decision_Assignment_Branch() {
		return getwhileuld2branchubb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileuld2branchubb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileuld2branchubb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__CheckTypes_FWD__Match() {
		return getwhileuld2branchubb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_BWD__Match_Command_Branch_Branch_Branch() {
		return getwhileuld2branchubb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__Perform_BWD__IsApplicableMatch() {
		return getwhileuld2branchubb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_BWD__Match() {
		return getwhileuld2branchubb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__RegisterObjectsToMatch_BWD__Match_Command_Branch_Branch_Branch() {
		return getwhileuld2branchubb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Branch_Branch() {
		return getwhileuld2branchubb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileuld2branchubb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_While_Command_Branch_Branch_Branch() {
		return getwhileuld2branchubb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileuld2branchubb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileuld2branchubb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__CheckTypes_BWD__Match() {
		return getwhileuld2branchubb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_BWD_EMoflonEdge_80__EMoflonEdge() {
		return getwhileuld2branchubb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsAppropriate_FWD_EMoflonEdge_86__EMoflonEdge() {
		return getwhileuld2branchubb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__CheckAttributes_FWD__TripleMatch() {
		return getwhileuld2branchubb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__CheckAttributes_BWD__TripleMatch() {
		return getwhileuld2branchubb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_CC__Match_Match() {
		return getwhileuld2branchubb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_solveCsp_CC__While_Command_While_Branch_Decision_Assignment_Branch_Branch_Match_Match() {
		return getwhileuld2branchubb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__IsApplicable_checkCsp_CC__CSP() {
		return getwhileuld2branchubb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__CheckDEC_FWD__While_While_Decision_Assignment() {
		return getwhileuld2branchubb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__CheckDEC_BWD__Command_Branch_Branch_Branch() {
		return getwhileuld2branchubb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileuld2branchubb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_While_Branch_ModelgeneratorRuleResult() {
		return getwhileuld2branchubb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileuld2branchubb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileuld2branchubb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getassignment2command() {
		if (assignment2commandEClass == null) {
			assignment2commandEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return assignment2commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_FWD__Match_Assignment_Statement() {
		return getassignment2command().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__Perform_FWD__IsApplicableMatch() {
		return getassignment2command().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_FWD__Match() {
		return getassignment2command().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__RegisterObjectsToMatch_FWD__Match_Assignment_Statement() {
		return getassignment2command().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_solveCsp_FWD__Match_Assignment_Statement() {
		return getassignment2command().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_checkCsp_FWD__CSP() {
		return getassignment2command().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_solveCsp_FWD__IsApplicableMatch_Node_S2N_Assignment_Statement() {
		return getassignment2command().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_checkCsp_FWD__CSP() {
		return getassignment2command().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getassignment2command().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__CheckTypes_FWD__Match() {
		return getassignment2command().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_BWD__Match_Node_Command() {
		return getassignment2command().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__Perform_BWD__IsApplicableMatch() {
		return getassignment2command().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_BWD__Match() {
		return getassignment2command().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__RegisterObjectsToMatch_BWD__Match_Node_Command() {
		return getassignment2command().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_solveCsp_BWD__Match_Node_Command() {
		return getassignment2command().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_checkCsp_BWD__CSP() {
		return getassignment2command().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_solveCsp_BWD__IsApplicableMatch_Node_S2N_Statement_Command() {
		return getassignment2command().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_checkCsp_BWD__CSP() {
		return getassignment2command().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getassignment2command().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__CheckTypes_BWD__Match() {
		return getassignment2command().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_BWD_EMoflonEdge_81__EMoflonEdge() {
		return getassignment2command().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsAppropriate_FWD_EMoflonEdge_87__EMoflonEdge() {
		return getassignment2command().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__CheckAttributes_FWD__TripleMatch() {
		return getassignment2command().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__CheckAttributes_BWD__TripleMatch() {
		return getassignment2command().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_CC__Match_Match() {
		return getassignment2command().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_solveCsp_CC__Node_Assignment_Statement_Command_Match_Match() {
		return getassignment2command().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__IsApplicable_checkCsp_CC__CSP() {
		return getassignment2command().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__CheckDEC_FWD__Assignment_Statement() {
		return getassignment2command().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__CheckDEC_BWD__Node_Command() {
		return getassignment2command().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__GenerateModel__RuleEntryContainer_S2N() {
		return getassignment2command().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__GenerateModel_solveCsp_BWD__IsApplicableMatch_Node_S2N_Statement_ModelgeneratorRuleResult() {
		return getassignment2command().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassignment2command__GenerateModel_checkCsp_BWD__CSP() {
		return getassignment2command().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileulul2branchubub() {
		if (whileulul2branchububEClass == null) {
			whileulul2branchububEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return whileulul2branchububEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_FWD__Match_While_Assignment_While_Assignment_While() {
		return getwhileulul2branchubub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__Perform_FWD__IsApplicableMatch() {
		return getwhileulul2branchubub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_FWD__Match() {
		return getwhileulul2branchubub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__RegisterObjectsToMatch_FWD__Match_While_Assignment_While_Assignment_While() {
		return getwhileulul2branchubub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_solveCsp_FWD__Match_While_Assignment_While_Assignment_While() {
		return getwhileulul2branchubub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileulul2branchubub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Assignment_S2B_While_Assignment_While_Branch() {
		return getwhileulul2branchubub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileulul2branchubub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileulul2branchubub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__CheckTypes_FWD__Match() {
		return getwhileulul2branchubub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_BWD__Match_Command_Branch_Branch_Command_Branch() {
		return getwhileulul2branchubub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__Perform_BWD__IsApplicableMatch() {
		return getwhileulul2branchubub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_BWD__Match() {
		return getwhileulul2branchubub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__RegisterObjectsToMatch_BWD__Match_Command_Branch_Branch_Command_Branch() {
		return getwhileulul2branchubub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Branch_Command_Branch() {
		return getwhileulul2branchubub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileulul2branchubub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_Branch_Branch_S2B_Command_While_Branch() {
		return getwhileulul2branchubub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileulul2branchubub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileulul2branchubub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__CheckTypes_BWD__Match() {
		return getwhileulul2branchubub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_BWD_EMoflonEdge_82__EMoflonEdge() {
		return getwhileulul2branchubub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsAppropriate_FWD_EMoflonEdge_88__EMoflonEdge() {
		return getwhileulul2branchubub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__CheckAttributes_FWD__TripleMatch() {
		return getwhileulul2branchubub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__CheckAttributes_BWD__TripleMatch() {
		return getwhileulul2branchubub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_CC__Match_Match() {
		return getwhileulul2branchubub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_solveCsp_CC__While_Command_Assignment_Branch_Branch_Command_While_Assignment_While_Branch_Match_Match() {
		return getwhileulul2branchubub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__IsApplicable_checkCsp_CC__CSP() {
		return getwhileulul2branchubub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__CheckDEC_FWD__While_Assignment_While_Assignment_While() {
		return getwhileulul2branchubub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__CheckDEC_BWD__Command_Branch_Branch_Command_Branch() {
		return getwhileulul2branchubub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileulul2branchubub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_While_Branch_ModelgeneratorRuleResult() {
		return getwhileulul2branchubub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileulul2branchubub__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileulul2branchubub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileull2branchubb() {
		if (whileull2branchubbEClass == null) {
			whileull2branchubbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return whileull2branchubbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_FWD__Match_While_While_Assignment_Assignment_While() {
		return getwhileull2branchubb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__Perform_FWD__IsApplicableMatch() {
		return getwhileull2branchubb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_FWD__Match() {
		return getwhileull2branchubb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__RegisterObjectsToMatch_FWD__Match_While_While_Assignment_Assignment_While() {
		return getwhileull2branchubb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_solveCsp_FWD__Match_While_While_Assignment_Assignment_While() {
		return getwhileull2branchubb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileull2branchubb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Branch_While_Assignment_S2B_Assignment_While() {
		return getwhileull2branchubb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileull2branchubb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileull2branchubb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__CheckTypes_FWD__Match() {
		return getwhileull2branchubb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_BWD__Match_Command_Branch_Command_Branch_Branch() {
		return getwhileull2branchubb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__Perform_BWD__IsApplicableMatch() {
		return getwhileull2branchubb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_BWD__Match() {
		return getwhileull2branchubb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__RegisterObjectsToMatch_BWD__Match_Command_Branch_Command_Branch_Branch() {
		return getwhileull2branchubb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Command_Branch_Branch() {
		return getwhileull2branchubb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileull2branchubb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_solveCsp_BWD__IsApplicableMatch_While_Command_Branch_Command_S2B_Branch_Branch() {
		return getwhileull2branchubb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileull2branchubb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileull2branchubb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__CheckTypes_BWD__Match() {
		return getwhileull2branchubb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_BWD_EMoflonEdge_83__EMoflonEdge() {
		return getwhileull2branchubb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsAppropriate_FWD_EMoflonEdge_89__EMoflonEdge() {
		return getwhileull2branchubb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__CheckAttributes_FWD__TripleMatch() {
		return getwhileull2branchubb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__CheckAttributes_BWD__TripleMatch() {
		return getwhileull2branchubb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_CC__Match_Match() {
		return getwhileull2branchubb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_solveCsp_CC__While_Command_Branch_Command_While_Assignment_Branch_Assignment_While_Branch_Match_Match() {
		return getwhileull2branchubb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__IsApplicable_checkCsp_CC__CSP() {
		return getwhileull2branchubb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__CheckDEC_FWD__While_While_Assignment_Assignment_While() {
		return getwhileull2branchubb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__CheckDEC_BWD__Command_Branch_Command_Branch_Branch() {
		return getwhileull2branchubb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileull2branchubb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__GenerateModel_solveCsp_BWD__IsApplicableMatch_While_Branch_S2B_ModelgeneratorRuleResult() {
		return getwhileull2branchubb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileull2branchubb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileull2branchubb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecll2branchbb() {
		if (decll2branchbbEClass == null) {
			decll2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return decll2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_FWD__Match_While_While_Assignment_Decision_Assignment() {
		return getdecll2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__Perform_FWD__IsApplicableMatch() {
		return getdecll2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_FWD__Match() {
		return getdecll2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__RegisterObjectsToMatch_FWD__Match_While_While_Assignment_Decision_Assignment() {
		return getdecll2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_solveCsp_FWD__Match_While_While_Assignment_Decision_Assignment() {
		return getdecll2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecll2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_While_While_S2B_Assignment_Decision_Assignment() {
		return getdecll2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getdecll2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecll2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__CheckTypes_FWD__Match() {
		return getdecll2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_BWD__Match_Branch_Command_Branch_Command_Branch() {
		return getdecll2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__Perform_BWD__IsApplicableMatch() {
		return getdecll2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_BWD__Match() {
		return getdecll2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__RegisterObjectsToMatch_BWD__Match_Branch_Command_Branch_Command_Branch() {
		return getdecll2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Branch_Command_Branch() {
		return getdecll2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecll2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Command_S2B_Branch_Decision_Command_Branch() {
		return getdecll2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getdecll2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecll2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__CheckTypes_BWD__Match() {
		return getdecll2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_BWD_EMoflonEdge_84__EMoflonEdge() {
		return getdecll2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsAppropriate_FWD_EMoflonEdge_90__EMoflonEdge() {
		return getdecll2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getdecll2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getdecll2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_CC__Match_Match() {
		return getdecll2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_solveCsp_CC__Branch_While_While_Command_Assignment_Branch_Decision_Assignment_Command_Branch_Match_Match() {
		return getdecll2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getdecll2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__CheckDEC_FWD__While_While_Assignment_Decision_Assignment() {
		return getdecll2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__CheckDEC_BWD__Branch_Command_Branch_Command_Branch() {
		return getdecll2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getdecll2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Decision_ModelgeneratorRuleResult() {
		return getdecll2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecll2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getdecll2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfirstdecision2firstbranch() {
		if (firstdecision2firstbranchEClass == null) {
			firstdecision2firstbranchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return firstdecision2firstbranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_FWD__Match_Decision_Program() {
		return getfirstdecision2firstbranch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__Perform_FWD__IsApplicableMatch() {
		return getfirstdecision2firstbranch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_FWD__Match() {
		return getfirstdecision2firstbranch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__RegisterObjectsToMatch_FWD__Match_Decision_Program() {
		return getfirstdecision2firstbranch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_solveCsp_FWD__Match_Decision_Program() {
		return getfirstdecision2firstbranch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_checkCsp_FWD__CSP() {
		return getfirstdecision2firstbranch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_solveCsp_FWD__IsApplicableMatch_P2G_Decision_Program_Graph() {
		return getfirstdecision2firstbranch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_checkCsp_FWD__CSP() {
		return getfirstdecision2firstbranch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstdecision2firstbranch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__CheckTypes_FWD__Match() {
		return getfirstdecision2firstbranch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_BWD__Match_Branch_Graph() {
		return getfirstdecision2firstbranch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__Perform_BWD__IsApplicableMatch() {
		return getfirstdecision2firstbranch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_BWD__Match() {
		return getfirstdecision2firstbranch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__RegisterObjectsToMatch_BWD__Match_Branch_Graph() {
		return getfirstdecision2firstbranch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_solveCsp_BWD__Match_Branch_Graph() {
		return getfirstdecision2firstbranch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_checkCsp_BWD__CSP() {
		return getfirstdecision2firstbranch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_solveCsp_BWD__IsApplicableMatch_P2G_Branch_Program_Graph() {
		return getfirstdecision2firstbranch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_checkCsp_BWD__CSP() {
		return getfirstdecision2firstbranch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstdecision2firstbranch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__CheckTypes_BWD__Match() {
		return getfirstdecision2firstbranch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_BWD_EMoflonEdge_85__EMoflonEdge() {
		return getfirstdecision2firstbranch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsAppropriate_FWD_EMoflonEdge_91__EMoflonEdge() {
		return getfirstdecision2firstbranch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__CheckAttributes_FWD__TripleMatch() {
		return getfirstdecision2firstbranch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__CheckAttributes_BWD__TripleMatch() {
		return getfirstdecision2firstbranch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_CC__Match_Match() {
		return getfirstdecision2firstbranch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_solveCsp_CC__Branch_Decision_Program_Graph_Match_Match() {
		return getfirstdecision2firstbranch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__IsApplicable_checkCsp_CC__CSP() {
		return getfirstdecision2firstbranch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__CheckDEC_FWD__Decision_Program() {
		return getfirstdecision2firstbranch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__CheckDEC_BWD__Branch_Graph() {
		return getfirstdecision2firstbranch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__GenerateModel__RuleEntryContainer_P2G() {
		return getfirstdecision2firstbranch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__GenerateModel_solveCsp_BWD__IsApplicableMatch_P2G_Program_Graph_ModelgeneratorRuleResult() {
		return getfirstdecision2firstbranch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstdecision2firstbranch__GenerateModel_checkCsp_BWD__CSP() {
		return getfirstdecision2firstbranch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecassdec2branchcmdbranch() {
		if (decassdec2branchcmdbranchEClass == null) {
			decassdec2branchcmdbranchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return decassdec2branchcmdbranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_FWD__Match_Decision_Decision_Assignment() {
		return getdecassdec2branchcmdbranch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__Perform_FWD__IsApplicableMatch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_FWD__Match() {
		return getdecassdec2branchcmdbranch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__RegisterObjectsToMatch_FWD__Match_Decision_Decision_Assignment() {
		return getdecassdec2branchcmdbranch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_solveCsp_FWD__Match_Decision_Decision_Assignment() {
		return getdecassdec2branchcmdbranch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecassdec2branchcmdbranch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Decision_Decision_Assignment_Branch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_checkCsp_FWD__CSP() {
		return getdecassdec2branchcmdbranch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecassdec2branchcmdbranch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__CheckTypes_FWD__Match() {
		return getdecassdec2branchcmdbranch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_BWD__Match_Branch_Command_Branch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__Perform_BWD__IsApplicableMatch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_BWD__Match() {
		return getdecassdec2branchcmdbranch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__RegisterObjectsToMatch_BWD__Match_Branch_Command_Branch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Branch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecassdec2branchcmdbranch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Decision_Branch_Command_Branch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_checkCsp_BWD__CSP() {
		return getdecassdec2branchcmdbranch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecassdec2branchcmdbranch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__CheckTypes_BWD__Match() {
		return getdecassdec2branchcmdbranch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_BWD_EMoflonEdge_86__EMoflonEdge() {
		return getdecassdec2branchcmdbranch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsAppropriate_FWD_EMoflonEdge_92__EMoflonEdge() {
		return getdecassdec2branchcmdbranch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__CheckAttributes_FWD__TripleMatch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__CheckAttributes_BWD__TripleMatch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_CC__Match_Match() {
		return getdecassdec2branchcmdbranch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_solveCsp_CC__Decision_Branch_Decision_Assignment_Command_Branch_Match_Match() {
		return getdecassdec2branchcmdbranch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__IsApplicable_checkCsp_CC__CSP() {
		return getdecassdec2branchcmdbranch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__CheckDEC_FWD__Decision_Decision_Assignment() {
		return getdecassdec2branchcmdbranch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__CheckDEC_BWD__Branch_Command_Branch() {
		return getdecassdec2branchcmdbranch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__GenerateModel__RuleEntryContainer_S2B() {
		return getdecassdec2branchcmdbranch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Decision_Branch_ModelgeneratorRuleResult() {
		return getdecassdec2branchcmdbranch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassdec2branchcmdbranch__GenerateModel_checkCsp_BWD__CSP() {
		return getdecassdec2branchcmdbranch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecal2branchcb() {
		if (decal2branchcbEClass == null) {
			decal2branchcbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return decal2branchcbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_FWD__Match_Decision_Assignment_Assignment_While() {
		return getdecal2branchcb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__Perform_FWD__IsApplicableMatch() {
		return getdecal2branchcb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_FWD__Match() {
		return getdecal2branchcb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__RegisterObjectsToMatch_FWD__Match_Decision_Assignment_Assignment_While() {
		return getdecal2branchcb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_solveCsp_FWD__Match_Decision_Assignment_Assignment_While() {
		return getdecal2branchcb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecal2branchcb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Decision_Assignment_Branch_Assignment_S2B_While() {
		return getdecal2branchcb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_checkCsp_FWD__CSP() {
		return getdecal2branchcb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecal2branchcb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__CheckTypes_FWD__Match() {
		return getdecal2branchcb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_BWD__Match_Command_Branch_Command_Branch() {
		return getdecal2branchcb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__Perform_BWD__IsApplicableMatch() {
		return getdecal2branchcb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_BWD__Match() {
		return getdecal2branchcb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__RegisterObjectsToMatch_BWD__Match_Command_Branch_Command_Branch() {
		return getdecal2branchcb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Command_Branch() {
		return getdecal2branchcb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecal2branchcb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Decision_Command_Branch_Command_Branch_S2B() {
		return getdecal2branchcb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_checkCsp_BWD__CSP() {
		return getdecal2branchcb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecal2branchcb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__CheckTypes_BWD__Match() {
		return getdecal2branchcb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_BWD_EMoflonEdge_87__EMoflonEdge() {
		return getdecal2branchcb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsAppropriate_FWD_EMoflonEdge_93__EMoflonEdge() {
		return getdecal2branchcb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__CheckAttributes_FWD__TripleMatch() {
		return getdecal2branchcb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__CheckAttributes_BWD__TripleMatch() {
		return getdecal2branchcb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_CC__Match_Match() {
		return getdecal2branchcb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_solveCsp_CC__Decision_Command_Assignment_Branch_Command_Branch_Assignment_While_Match_Match() {
		return getdecal2branchcb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__IsApplicable_checkCsp_CC__CSP() {
		return getdecal2branchcb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__CheckDEC_FWD__Decision_Assignment_Assignment_While() {
		return getdecal2branchcb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__CheckDEC_BWD__Command_Branch_Command_Branch() {
		return getdecal2branchcb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__GenerateModel__RuleEntryContainer_S2B() {
		return getdecal2branchcb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Decision_Branch_S2B_ModelgeneratorRuleResult() {
		return getdecal2branchcb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecal2branchcb__GenerateModel_checkCsp_BWD__CSP() {
		return getdecal2branchcb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhiledul2branchbub() {
		if (whiledul2branchbubEClass == null) {
			whiledul2branchbubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(25);
		}
		return whiledul2branchbubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_FWD__Match_Assignment_While_Decision_While() {
		return getwhiledul2branchbub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__Perform_FWD__IsApplicableMatch() {
		return getwhiledul2branchbub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_FWD__Match() {
		return getwhiledul2branchbub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__RegisterObjectsToMatch_FWD__Match_Assignment_While_Decision_While() {
		return getwhiledul2branchbub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_solveCsp_FWD__Match_Assignment_While_Decision_While() {
		return getwhiledul2branchbub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhiledul2branchbub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Branch_Assignment_While_Decision_While() {
		return getwhiledul2branchbub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_checkCsp_FWD__CSP() {
		return getwhiledul2branchbub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiledul2branchbub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__CheckTypes_FWD__Match() {
		return getwhiledul2branchbub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_BWD__Match_Branch_Branch_Command_Branch() {
		return getwhiledul2branchbub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__Perform_BWD__IsApplicableMatch() {
		return getwhiledul2branchbub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_BWD__Match() {
		return getwhiledul2branchbub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Branch() {
		return getwhiledul2branchbub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Branch() {
		return getwhiledul2branchbub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhiledul2branchbub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Branch_While_Command_Branch() {
		return getwhiledul2branchbub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_checkCsp_BWD__CSP() {
		return getwhiledul2branchbub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiledul2branchbub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__CheckTypes_BWD__Match() {
		return getwhiledul2branchbub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_BWD_EMoflonEdge_88__EMoflonEdge() {
		return getwhiledul2branchbub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsAppropriate_FWD_EMoflonEdge_94__EMoflonEdge() {
		return getwhiledul2branchbub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__CheckAttributes_FWD__TripleMatch() {
		return getwhiledul2branchbub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__CheckAttributes_BWD__TripleMatch() {
		return getwhiledul2branchbub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_CC__Match_Match() {
		return getwhiledul2branchbub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_solveCsp_CC__Branch_Assignment_While_Branch_Decision_While_Command_Branch_Match_Match() {
		return getwhiledul2branchbub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__IsApplicable_checkCsp_CC__CSP() {
		return getwhiledul2branchbub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__CheckDEC_FWD__Assignment_While_Decision_While() {
		return getwhiledul2branchbub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__CheckDEC_BWD__Branch_Branch_Command_Branch() {
		return getwhiledul2branchbub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__GenerateModel__RuleEntryContainer_S2B() {
		return getwhiledul2branchbub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_While_ModelgeneratorRuleResult() {
		return getwhiledul2branchbub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledul2branchbub__GenerateModel_checkCsp_BWD__CSP() {
		return getwhiledul2branchbub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhiledl2branchbb() {
		if (whiledl2branchbbEClass == null) {
			whiledl2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return whiledl2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_FWD__Match_While_Assignment_While_Decision() {
		return getwhiledl2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__Perform_FWD__IsApplicableMatch() {
		return getwhiledl2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_FWD__Match() {
		return getwhiledl2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__RegisterObjectsToMatch_FWD__Match_While_Assignment_While_Decision() {
		return getwhiledl2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_solveCsp_FWD__Match_While_Assignment_While_Decision() {
		return getwhiledl2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhiledl2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_S2B_Assignment_Branch_While_Decision() {
		return getwhiledl2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhiledl2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiledl2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__CheckTypes_FWD__Match() {
		return getwhiledl2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_BWD__Match_Command_Branch_Branch_Branch() {
		return getwhiledl2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__Perform_BWD__IsApplicableMatch() {
		return getwhiledl2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_BWD__Match() {
		return getwhiledl2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__RegisterObjectsToMatch_BWD__Match_Command_Branch_Branch_Branch() {
		return getwhiledl2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Branch_Branch() {
		return getwhiledl2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhiledl2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_While_S2B_Branch_Branch_Branch() {
		return getwhiledl2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhiledl2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiledl2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__CheckTypes_BWD__Match() {
		return getwhiledl2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_BWD_EMoflonEdge_89__EMoflonEdge() {
		return getwhiledl2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsAppropriate_FWD_EMoflonEdge_95__EMoflonEdge() {
		return getwhiledl2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getwhiledl2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getwhiledl2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_CC__Match_Match() {
		return getwhiledl2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_solveCsp_CC__Command_While_Assignment_Branch_Branch_Branch_While_Decision_Match_Match() {
		return getwhiledl2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getwhiledl2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__CheckDEC_FWD__While_Assignment_While_Decision() {
		return getwhiledl2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__CheckDEC_BWD__Command_Branch_Branch_Branch() {
		return getwhiledl2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhiledl2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_While_S2B_Branch_ModelgeneratorRuleResult() {
		return getwhiledl2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiledl2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhiledl2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeculd2branchubb() {
		if (deculd2branchubbEClass == null) {
			deculd2branchubbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(27);
		}
		return deculd2branchubbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_FWD__Match_While_Decision_Decision_Assignment() {
		return getdeculd2branchubb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__Perform_FWD__IsApplicableMatch() {
		return getdeculd2branchubb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_FWD__Match() {
		return getdeculd2branchubb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__RegisterObjectsToMatch_FWD__Match_While_Decision_Decision_Assignment() {
		return getdeculd2branchubb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_solveCsp_FWD__Match_While_Decision_Decision_Assignment() {
		return getdeculd2branchubb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_checkCsp_FWD__CSP() {
		return getdeculd2branchubb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_S2B_Decision_Decision_Assignment_Branch() {
		return getdeculd2branchubb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_checkCsp_FWD__CSP() {
		return getdeculd2branchubb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdeculd2branchubb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__CheckTypes_FWD__Match() {
		return getdeculd2branchubb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_BWD__Match_Branch_Command_Branch_Branch() {
		return getdeculd2branchubb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__Perform_BWD__IsApplicableMatch() {
		return getdeculd2branchubb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_BWD__Match() {
		return getdeculd2branchubb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__RegisterObjectsToMatch_BWD__Match_Branch_Command_Branch_Branch() {
		return getdeculd2branchubb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Branch_Branch() {
		return getdeculd2branchubb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_checkCsp_BWD__CSP() {
		return getdeculd2branchubb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Decision_Command_Branch_Branch() {
		return getdeculd2branchubb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_checkCsp_BWD__CSP() {
		return getdeculd2branchubb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdeculd2branchubb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__CheckTypes_BWD__Match() {
		return getdeculd2branchubb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_BWD_EMoflonEdge_90__EMoflonEdge() {
		return getdeculd2branchubb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsAppropriate_FWD_EMoflonEdge_96__EMoflonEdge() {
		return getdeculd2branchubb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__CheckAttributes_FWD__TripleMatch() {
		return getdeculd2branchubb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__CheckAttributes_BWD__TripleMatch() {
		return getdeculd2branchubb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_CC__Match_Match() {
		return getdeculd2branchubb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_solveCsp_CC__Branch_While_Decision_Command_Decision_Branch_Assignment_Branch_Match_Match() {
		return getdeculd2branchubb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__IsApplicable_checkCsp_CC__CSP() {
		return getdeculd2branchubb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__CheckDEC_FWD__While_Decision_Decision_Assignment() {
		return getdeculd2branchubb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__CheckDEC_BWD__Branch_Command_Branch_Branch() {
		return getdeculd2branchubb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__GenerateModel__RuleEntryContainer_S2B() {
		return getdeculd2branchubb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Decision_Branch_ModelgeneratorRuleResult() {
		return getdeculd2branchubb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculd2branchubb__GenerateModel_checkCsp_BWD__CSP() {
		return getdeculd2branchubb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecdul2branchbub() {
		if (decdul2branchbubEClass == null) {
			decdul2branchbubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(28);
		}
		return decdul2branchbubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_FWD__Match_Decision_While_Decision_Assignment() {
		return getdecdul2branchbub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__Perform_FWD__IsApplicableMatch() {
		return getdecdul2branchbub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_FWD__Match() {
		return getdecdul2branchbub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__RegisterObjectsToMatch_FWD__Match_Decision_While_Decision_Assignment() {
		return getdecdul2branchbub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_solveCsp_FWD__Match_Decision_While_Decision_Assignment() {
		return getdecdul2branchbub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecdul2branchbub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_solveCsp_FWD__IsApplicableMatch_Decision_While_Decision_Branch_S2B_Assignment() {
		return getdecdul2branchbub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_checkCsp_FWD__CSP() {
		return getdecdul2branchbub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdul2branchbub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__CheckTypes_FWD__Match() {
		return getdecdul2branchbub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_BWD__Match_Branch_Branch_Branch_Command() {
		return getdecdul2branchbub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__Perform_BWD__IsApplicableMatch() {
		return getdecdul2branchbub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_BWD__Match() {
		return getdecdul2branchbub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Branch_Command() {
		return getdecdul2branchbub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Branch_Command() {
		return getdecdul2branchbub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecdul2branchbub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_solveCsp_BWD__IsApplicableMatch_Decision_Branch_Branch_S2B_Branch_Command() {
		return getdecdul2branchbub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_checkCsp_BWD__CSP() {
		return getdecdul2branchbub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdul2branchbub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__CheckTypes_BWD__Match() {
		return getdecdul2branchbub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_BWD_EMoflonEdge_91__EMoflonEdge() {
		return getdecdul2branchbub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsAppropriate_FWD_EMoflonEdge_97__EMoflonEdge() {
		return getdecdul2branchbub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__CheckAttributes_FWD__TripleMatch() {
		return getdecdul2branchbub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__CheckAttributes_BWD__TripleMatch() {
		return getdecdul2branchbub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_CC__Match_Match() {
		return getdecdul2branchbub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_solveCsp_CC__Decision_While_Decision_Branch_Branch_Branch_Assignment_Command_Match_Match() {
		return getdecdul2branchbub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__IsApplicable_checkCsp_CC__CSP() {
		return getdecdul2branchbub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__CheckDEC_FWD__Decision_While_Decision_Assignment() {
		return getdecdul2branchbub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__CheckDEC_BWD__Branch_Branch_Branch_Command() {
		return getdecdul2branchbub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__GenerateModel__RuleEntryContainer_S2B() {
		return getdecdul2branchbub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__GenerateModel_solveCsp_BWD__IsApplicableMatch_Decision_Branch_S2B_ModelgeneratorRuleResult() {
		return getdecdul2branchbub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdul2branchbub__GenerateModel_checkCsp_BWD__CSP() {
		return getdecdul2branchbub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprogram2graph() {
		if (program2graphEClass == null) {
			program2graphEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(29);
		}
		return program2graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_FWD__Match_Program() {
		return getprogram2graph().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__Perform_FWD__IsApplicableMatch() {
		return getprogram2graph().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_FWD__Match() {
		return getprogram2graph().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__RegisterObjectsToMatch_FWD__Match_Program() {
		return getprogram2graph().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_solveCsp_FWD__Match_Program() {
		return getprogram2graph().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_checkCsp_FWD__CSP() {
		return getprogram2graph().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Program() {
		return getprogram2graph().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_checkCsp_FWD__CSP() {
		return getprogram2graph().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getprogram2graph().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__CheckTypes_FWD__Match() {
		return getprogram2graph().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_BWD__Match_Graph() {
		return getprogram2graph().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__Perform_BWD__IsApplicableMatch() {
		return getprogram2graph().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_BWD__Match() {
		return getprogram2graph().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__RegisterObjectsToMatch_BWD__Match_Graph() {
		return getprogram2graph().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_solveCsp_BWD__Match_Graph() {
		return getprogram2graph().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_checkCsp_BWD__CSP() {
		return getprogram2graph().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_solveCsp_BWD__IsApplicableMatch_Graph() {
		return getprogram2graph().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_checkCsp_BWD__CSP() {
		return getprogram2graph().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getprogram2graph().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__CheckTypes_BWD__Match() {
		return getprogram2graph().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_BWD_Graph_1__Graph() {
		return getprogram2graph().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsAppropriate_FWD_Program_1__Program() {
		return getprogram2graph().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__CheckAttributes_FWD__TripleMatch() {
		return getprogram2graph().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__CheckAttributes_BWD__TripleMatch() {
		return getprogram2graph().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_CC__Match_Match() {
		return getprogram2graph().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_solveCsp_CC__Program_Graph_Match_Match() {
		return getprogram2graph().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__IsApplicable_checkCsp_CC__CSP() {
		return getprogram2graph().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__CheckDEC_FWD__Program() {
		return getprogram2graph().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__CheckDEC_BWD__Graph() {
		return getprogram2graph().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__GenerateModel__RuleEntryContainer() {
		return getprogram2graph().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getprogram2graph().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprogram2graph__GenerateModel_checkCsp_BWD__CSP() {
		return getprogram2graph().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhilell2branchbb() {
		if (whilell2branchbbEClass == null) {
			whilell2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(30);
		}
		return whilell2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_FWD__Match_Assignment_While_While_Assignment_While() {
		return getwhilell2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__Perform_FWD__IsApplicableMatch() {
		return getwhilell2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_FWD__Match() {
		return getwhilell2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__RegisterObjectsToMatch_FWD__Match_Assignment_While_While_Assignment_While() {
		return getwhilell2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_solveCsp_FWD__Match_Assignment_While_While_Assignment_While() {
		return getwhilell2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhilell2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_While_S2B_Branch_While_Assignment_While() {
		return getwhilell2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhilell2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilell2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__CheckTypes_FWD__Match() {
		return getwhilell2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_BWD__Match_Branch_Branch_Command_Command_Branch() {
		return getwhilell2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__Perform_BWD__IsApplicableMatch() {
		return getwhilell2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_BWD__Match() {
		return getwhilell2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Command_Branch() {
		return getwhilell2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Command_Branch() {
		return getwhilell2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhilell2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Branch_While_Command_Command_Branch() {
		return getwhilell2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhilell2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilell2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__CheckTypes_BWD__Match() {
		return getwhilell2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_BWD_EMoflonEdge_92__EMoflonEdge() {
		return getwhilell2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsAppropriate_FWD_EMoflonEdge_98__EMoflonEdge() {
		return getwhilell2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getwhilell2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getwhilell2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_CC__Match_Match() {
		return getwhilell2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_solveCsp_CC__Branch_Assignment_While_Branch_While_Command_Command_Assignment_While_Branch_Match_Match() {
		return getwhilell2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getwhilell2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__CheckDEC_FWD__Assignment_While_While_Assignment_While() {
		return getwhilell2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__CheckDEC_BWD__Branch_Branch_Command_Command_Branch() {
		return getwhilell2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhilell2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_While_ModelgeneratorRuleResult() {
		return getwhilell2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilell2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhilell2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecassass2branchcmdcmd() {
		if (decassass2branchcmdcmdEClass == null) {
			decassass2branchcmdcmdEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(31);
		}
		return decassass2branchcmdcmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_FWD__Match_Decision_Assignment_Assignment() {
		return getdecassass2branchcmdcmd().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__Perform_FWD__IsApplicableMatch() {
		return getdecassass2branchcmdcmd().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_FWD__Match() {
		return getdecassass2branchcmdcmd().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__RegisterObjectsToMatch_FWD__Match_Decision_Assignment_Assignment() {
		return getdecassass2branchcmdcmd().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_solveCsp_FWD__Match_Decision_Assignment_Assignment() {
		return getdecassass2branchcmdcmd().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecassass2branchcmdcmd().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_solveCsp_FWD__IsApplicableMatch_Decision_Assignment_Assignment_Branch_S2B() {
		return getdecassass2branchcmdcmd().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_checkCsp_FWD__CSP() {
		return getdecassass2branchcmdcmd().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecassass2branchcmdcmd().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__CheckTypes_FWD__Match() {
		return getdecassass2branchcmdcmd().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_BWD__Match_Command_Branch_Command() {
		return getdecassass2branchcmdcmd().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__Perform_BWD__IsApplicableMatch() {
		return getdecassass2branchcmdcmd().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_BWD__Match() {
		return getdecassass2branchcmdcmd().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__RegisterObjectsToMatch_BWD__Match_Command_Branch_Command() {
		return getdecassass2branchcmdcmd().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Command() {
		return getdecassass2branchcmdcmd().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecassass2branchcmdcmd().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_solveCsp_BWD__IsApplicableMatch_Decision_Command_Branch_Command_S2B() {
		return getdecassass2branchcmdcmd().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_checkCsp_BWD__CSP() {
		return getdecassass2branchcmdcmd().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecassass2branchcmdcmd().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__CheckTypes_BWD__Match() {
		return getdecassass2branchcmdcmd().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_BWD_EMoflonEdge_93__EMoflonEdge() {
		return getdecassass2branchcmdcmd().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsAppropriate_FWD_EMoflonEdge_99__EMoflonEdge() {
		return getdecassass2branchcmdcmd().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__CheckAttributes_FWD__TripleMatch() {
		return getdecassass2branchcmdcmd().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__CheckAttributes_BWD__TripleMatch() {
		return getdecassass2branchcmdcmd().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_CC__Match_Match() {
		return getdecassass2branchcmdcmd().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_solveCsp_CC__Decision_Assignment_Command_Assignment_Branch_Command_Match_Match() {
		return getdecassass2branchcmdcmd().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__IsApplicable_checkCsp_CC__CSP() {
		return getdecassass2branchcmdcmd().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__CheckDEC_FWD__Decision_Assignment_Assignment() {
		return getdecassass2branchcmdcmd().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__CheckDEC_BWD__Command_Branch_Command() {
		return getdecassass2branchcmdcmd().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__GenerateModel__RuleEntryContainer_S2B() {
		return getdecassass2branchcmdcmd().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__GenerateModel_solveCsp_BWD__IsApplicableMatch_Decision_Branch_S2B_ModelgeneratorRuleResult() {
		return getdecassass2branchcmdcmd().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecassass2branchcmdcmd__GenerateModel_checkCsp_BWD__CSP() {
		return getdecassass2branchcmdcmd().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeculul2branchubub() {
		if (deculul2branchububEClass == null) {
			deculul2branchububEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(32);
		}
		return deculul2branchububEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_FWD__Match_Assignment_While_Assignment_While_Decision() {
		return getdeculul2branchubub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__Perform_FWD__IsApplicableMatch() {
		return getdeculul2branchubub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_FWD__Match() {
		return getdeculul2branchubub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__RegisterObjectsToMatch_FWD__Match_Assignment_While_Assignment_While_Decision() {
		return getdeculul2branchubub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_solveCsp_FWD__Match_Assignment_While_Assignment_While_Decision() {
		return getdeculul2branchubub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_checkCsp_FWD__CSP() {
		return getdeculul2branchubub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Assignment_While_Assignment_While_Branch_Decision() {
		return getdeculul2branchubub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_checkCsp_FWD__CSP() {
		return getdeculul2branchubub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdeculul2branchubub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__CheckTypes_FWD__Match() {
		return getdeculul2branchubub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_BWD__Match_Command_Branch_Branch_Branch_Command() {
		return getdeculul2branchubub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__Perform_BWD__IsApplicableMatch() {
		return getdeculul2branchubub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_BWD__Match() {
		return getdeculul2branchubub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__RegisterObjectsToMatch_BWD__Match_Command_Branch_Branch_Branch_Command() {
		return getdeculul2branchubub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Branch_Branch_Command() {
		return getdeculul2branchubub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_checkCsp_BWD__CSP() {
		return getdeculul2branchubub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Command_Branch_Branch_Branch_Command_Decision() {
		return getdeculul2branchubub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_checkCsp_BWD__CSP() {
		return getdeculul2branchubub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdeculul2branchubub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__CheckTypes_BWD__Match() {
		return getdeculul2branchubub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_BWD_EMoflonEdge_94__EMoflonEdge() {
		return getdeculul2branchubub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsAppropriate_FWD_EMoflonEdge_100__EMoflonEdge() {
		return getdeculul2branchubub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__CheckAttributes_FWD__TripleMatch() {
		return getdeculul2branchubub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__CheckAttributes_BWD__TripleMatch() {
		return getdeculul2branchubub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_CC__Match_Match() {
		return getdeculul2branchubub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_solveCsp_CC__Assignment_Command_While_Branch_Assignment_Branch_While_Branch_Command_Decision_Match_Match() {
		return getdeculul2branchubub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__IsApplicable_checkCsp_CC__CSP() {
		return getdeculul2branchubub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__CheckDEC_FWD__Assignment_While_Assignment_While_Decision() {
		return getdeculul2branchubub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__CheckDEC_BWD__Command_Branch_Branch_Branch_Command() {
		return getdeculul2branchubub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__GenerateModel__RuleEntryContainer_S2B() {
		return getdeculul2branchubub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Decision_ModelgeneratorRuleResult() {
		return getdeculul2branchubub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdeculul2branchubub__GenerateModel_checkCsp_BWD__CSP() {
		return getdeculul2branchubub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecdl2branchbb() {
		if (decdl2branchbbEClass == null) {
			decdl2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(33);
		}
		return decdl2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_FWD__Match_Decision_Assignment_Decision_While() {
		return getdecdl2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__Perform_FWD__IsApplicableMatch() {
		return getdecdl2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_FWD__Match() {
		return getdecdl2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__RegisterObjectsToMatch_FWD__Match_Decision_Assignment_Decision_While() {
		return getdecdl2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_solveCsp_FWD__Match_Decision_Assignment_Decision_While() {
		return getdecdl2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecdl2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_S2B_Decision_Assignment_Decision_While() {
		return getdecdl2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getdecdl2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdl2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__CheckTypes_FWD__Match() {
		return getdecdl2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_BWD__Match_Branch_Branch_Branch_Command() {
		return getdecdl2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__Perform_BWD__IsApplicableMatch() {
		return getdecdl2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_BWD__Match() {
		return getdecdl2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Branch_Command() {
		return getdecdl2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Branch_Command() {
		return getdecdl2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecdl2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_Branch_S2B_Command_Decision() {
		return getdecdl2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getdecdl2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdl2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__CheckTypes_BWD__Match() {
		return getdecdl2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_BWD_EMoflonEdge_95__EMoflonEdge() {
		return getdecdl2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsAppropriate_FWD_EMoflonEdge_101__EMoflonEdge() {
		return getdecdl2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getdecdl2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getdecdl2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_CC__Match_Match() {
		return getdecdl2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_solveCsp_CC__Branch_Branch_Branch_Command_Decision_Assignment_Decision_While_Match_Match() {
		return getdecdl2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getdecdl2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__CheckDEC_FWD__Decision_Assignment_Decision_While() {
		return getdecdl2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__CheckDEC_BWD__Branch_Branch_Branch_Command() {
		return getdecdl2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getdecdl2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Decision_ModelgeneratorRuleResult() {
		return getdecdl2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdl2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getdecdl2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfirstass2rootcmd() {
		if (firstass2rootcmdEClass == null) {
			firstass2rootcmdEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(34);
		}
		return firstass2rootcmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_FWD__Match_Assignment_Program() {
		return getfirstass2rootcmd().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__Perform_FWD__IsApplicableMatch() {
		return getfirstass2rootcmd().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_FWD__Match() {
		return getfirstass2rootcmd().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__RegisterObjectsToMatch_FWD__Match_Assignment_Program() {
		return getfirstass2rootcmd().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_solveCsp_FWD__Match_Assignment_Program() {
		return getfirstass2rootcmd().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_checkCsp_FWD__CSP() {
		return getfirstass2rootcmd().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_solveCsp_FWD__IsApplicableMatch_Graph_Assignment_P2G_Program() {
		return getfirstass2rootcmd().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_checkCsp_FWD__CSP() {
		return getfirstass2rootcmd().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstass2rootcmd().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__CheckTypes_FWD__Match() {
		return getfirstass2rootcmd().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_BWD__Match_Graph_Command() {
		return getfirstass2rootcmd().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__Perform_BWD__IsApplicableMatch() {
		return getfirstass2rootcmd().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_BWD__Match() {
		return getfirstass2rootcmd().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__RegisterObjectsToMatch_BWD__Match_Graph_Command() {
		return getfirstass2rootcmd().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_solveCsp_BWD__Match_Graph_Command() {
		return getfirstass2rootcmd().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_checkCsp_BWD__CSP() {
		return getfirstass2rootcmd().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_solveCsp_BWD__IsApplicableMatch_Graph_P2G_Command_Program() {
		return getfirstass2rootcmd().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_checkCsp_BWD__CSP() {
		return getfirstass2rootcmd().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getfirstass2rootcmd().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__CheckTypes_BWD__Match() {
		return getfirstass2rootcmd().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_BWD_EMoflonEdge_96__EMoflonEdge() {
		return getfirstass2rootcmd().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsAppropriate_FWD_EMoflonEdge_102__EMoflonEdge() {
		return getfirstass2rootcmd().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__CheckAttributes_FWD__TripleMatch() {
		return getfirstass2rootcmd().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__CheckAttributes_BWD__TripleMatch() {
		return getfirstass2rootcmd().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_CC__Match_Match() {
		return getfirstass2rootcmd().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_solveCsp_CC__Graph_Assignment_Command_Program_Match_Match() {
		return getfirstass2rootcmd().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__IsApplicable_checkCsp_CC__CSP() {
		return getfirstass2rootcmd().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__CheckDEC_FWD__Assignment_Program() {
		return getfirstass2rootcmd().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__CheckDEC_BWD__Graph_Command() {
		return getfirstass2rootcmd().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__GenerateModel__RuleEntryContainer_P2G() {
		return getfirstass2rootcmd().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__GenerateModel_solveCsp_BWD__IsApplicableMatch_Graph_P2G_Program_ModelgeneratorRuleResult() {
		return getfirstass2rootcmd().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getfirstass2rootcmd__GenerateModel_checkCsp_BWD__CSP() {
		return getfirstass2rootcmd().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhileaul2branchcub() {
		if (whileaul2branchcubEClass == null) {
			whileaul2branchcubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(35);
		}
		return whileaul2branchcubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_FWD__Match_Assignment_While_While_Assignment() {
		return getwhileaul2branchcub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__Perform_FWD__IsApplicableMatch() {
		return getwhileaul2branchcub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_FWD__Match() {
		return getwhileaul2branchcub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__RegisterObjectsToMatch_FWD__Match_Assignment_While_While_Assignment() {
		return getwhileaul2branchcub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_solveCsp_FWD__Match_Assignment_While_While_Assignment() {
		return getwhileaul2branchcub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhileaul2branchcub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_S2B_While_While_Branch_Assignment() {
		return getwhileaul2branchcub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_checkCsp_FWD__CSP() {
		return getwhileaul2branchcub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileaul2branchcub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__CheckTypes_FWD__Match() {
		return getwhileaul2branchcub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_BWD__Match_Branch_Command_Command_Branch() {
		return getwhileaul2branchcub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__Perform_BWD__IsApplicableMatch() {
		return getwhileaul2branchcub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_BWD__Match() {
		return getwhileaul2branchcub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__RegisterObjectsToMatch_BWD__Match_Branch_Command_Command_Branch() {
		return getwhileaul2branchcub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Command_Branch() {
		return getwhileaul2branchcub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhileaul2branchcub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Command_While_Command_Branch() {
		return getwhileaul2branchcub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_checkCsp_BWD__CSP() {
		return getwhileaul2branchcub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhileaul2branchcub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__CheckTypes_BWD__Match() {
		return getwhileaul2branchcub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_BWD_EMoflonEdge_97__EMoflonEdge() {
		return getwhileaul2branchcub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsAppropriate_FWD_EMoflonEdge_103__EMoflonEdge() {
		return getwhileaul2branchcub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__CheckAttributes_FWD__TripleMatch() {
		return getwhileaul2branchcub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__CheckAttributes_BWD__TripleMatch() {
		return getwhileaul2branchcub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_CC__Match_Match() {
		return getwhileaul2branchcub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_solveCsp_CC__Branch_Assignment_Command_While_While_Command_Branch_Assignment_Match_Match() {
		return getwhileaul2branchcub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__IsApplicable_checkCsp_CC__CSP() {
		return getwhileaul2branchcub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__CheckDEC_FWD__Assignment_While_While_Assignment() {
		return getwhileaul2branchcub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__CheckDEC_BWD__Branch_Command_Command_Branch() {
		return getwhileaul2branchcub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__GenerateModel__RuleEntryContainer_S2B() {
		return getwhileaul2branchcub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_While_Branch_ModelgeneratorRuleResult() {
		return getwhileaul2branchcub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhileaul2branchcub__GenerateModel_checkCsp_BWD__CSP() {
		return getwhileaul2branchcub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuwhile2ubranch() {
		if (uwhile2ubranchEClass == null) {
			uwhile2ubranchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(36);
		}
		return uwhile2ubranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_FWD__Match_Assignment_Statement_While() {
		return getuwhile2ubranch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__Perform_FWD__IsApplicableMatch() {
		return getuwhile2ubranch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_FWD__Match() {
		return getuwhile2ubranch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__RegisterObjectsToMatch_FWD__Match_Assignment_Statement_While() {
		return getuwhile2ubranch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_solveCsp_FWD__Match_Assignment_Statement_While() {
		return getuwhile2ubranch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_checkCsp_FWD__CSP() {
		return getuwhile2ubranch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_Statement_S2N_Node_While() {
		return getuwhile2ubranch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_checkCsp_FWD__CSP() {
		return getuwhile2ubranch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getuwhile2ubranch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__CheckTypes_FWD__Match() {
		return getuwhile2ubranch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_BWD__Match_Branch_Node_Command() {
		return getuwhile2ubranch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__Perform_BWD__IsApplicableMatch() {
		return getuwhile2ubranch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_BWD__Match() {
		return getuwhile2ubranch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__RegisterObjectsToMatch_BWD__Match_Branch_Node_Command() {
		return getuwhile2ubranch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_solveCsp_BWD__Match_Branch_Node_Command() {
		return getuwhile2ubranch().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_checkCsp_BWD__CSP() {
		return getuwhile2ubranch().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_solveCsp_BWD__IsApplicableMatch_Statement_S2N_Branch_Node_Command() {
		return getuwhile2ubranch().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_checkCsp_BWD__CSP() {
		return getuwhile2ubranch().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getuwhile2ubranch().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__CheckTypes_BWD__Match() {
		return getuwhile2ubranch().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_BWD_EMoflonEdge_98__EMoflonEdge() {
		return getuwhile2ubranch().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsAppropriate_FWD_EMoflonEdge_104__EMoflonEdge() {
		return getuwhile2ubranch().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__CheckAttributes_FWD__TripleMatch() {
		return getuwhile2ubranch().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__CheckAttributes_BWD__TripleMatch() {
		return getuwhile2ubranch().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_CC__Match_Match() {
		return getuwhile2ubranch().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_solveCsp_CC__Assignment_Statement_Branch_Node_While_Command_Match_Match() {
		return getuwhile2ubranch().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__IsApplicable_checkCsp_CC__CSP() {
		return getuwhile2ubranch().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__CheckDEC_FWD__Assignment_Statement_While() {
		return getuwhile2ubranch().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__CheckDEC_BWD__Branch_Node_Command() {
		return getuwhile2ubranch().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__GenerateModel__RuleEntryContainer_S2N() {
		return getuwhile2ubranch().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__GenerateModel_solveCsp_BWD__IsApplicableMatch_Statement_S2N_Node_ModelgeneratorRuleResult() {
		return getuwhile2ubranch().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuwhile2ubranch__GenerateModel_checkCsp_BWD__CSP() {
		return getuwhile2ubranch().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhilelul2branchbub() {
		if (whilelul2branchbubEClass == null) {
			whilelul2branchbubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(37);
		}
		return whilelul2branchbubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_FWD__Match_Assignment_Assignment_While_While_While() {
		return getwhilelul2branchbub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__Perform_FWD__IsApplicableMatch() {
		return getwhilelul2branchbub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_FWD__Match() {
		return getwhilelul2branchbub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__RegisterObjectsToMatch_FWD__Match_Assignment_Assignment_While_While_While() {
		return getwhilelul2branchbub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_solveCsp_FWD__Match_Assignment_Assignment_While_While_While() {
		return getwhilelul2branchbub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhilelul2branchbub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_Assignment_Branch_S2B_While_While_While() {
		return getwhilelul2branchbub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_checkCsp_FWD__CSP() {
		return getwhilelul2branchbub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilelul2branchbub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__CheckTypes_FWD__Match() {
		return getwhilelul2branchbub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_BWD__Match_Branch_Branch_Command_Branch_Command() {
		return getwhilelul2branchbub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__Perform_BWD__IsApplicableMatch() {
		return getwhilelul2branchbub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_BWD__Match() {
		return getwhilelul2branchbub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Branch_Command() {
		return getwhilelul2branchbub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Branch_Command() {
		return getwhilelul2branchbub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhilelul2branchbub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_S2B_Command_Branch_Command_While() {
		return getwhilelul2branchbub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_checkCsp_BWD__CSP() {
		return getwhilelul2branchbub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilelul2branchbub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__CheckTypes_BWD__Match() {
		return getwhilelul2branchbub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_BWD_EMoflonEdge_99__EMoflonEdge() {
		return getwhilelul2branchbub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsAppropriate_FWD_EMoflonEdge_105__EMoflonEdge() {
		return getwhilelul2branchbub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__CheckAttributes_FWD__TripleMatch() {
		return getwhilelul2branchbub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__CheckAttributes_BWD__TripleMatch() {
		return getwhilelul2branchbub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_CC__Match_Match() {
		return getwhilelul2branchbub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_solveCsp_CC__Assignment_Assignment_Branch_Branch_While_While_Command_Branch_Command_While_Match_Match() {
		return getwhilelul2branchbub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__IsApplicable_checkCsp_CC__CSP() {
		return getwhilelul2branchbub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__CheckDEC_FWD__Assignment_Assignment_While_While_While() {
		return getwhilelul2branchbub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__CheckDEC_BWD__Branch_Branch_Command_Branch_Command() {
		return getwhilelul2branchbub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__GenerateModel__RuleEntryContainer_S2B() {
		return getwhilelul2branchbub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_While_ModelgeneratorRuleResult() {
		return getwhilelul2branchbub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilelul2branchbub__GenerateModel_checkCsp_BWD__CSP() {
		return getwhilelul2branchbub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecdecass2branchbranchcmd() {
		if (decdecass2branchbranchcmdEClass == null) {
			decdecass2branchbranchcmdEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(38);
		}
		return decdecass2branchbranchcmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_FWD__Match_Assignment_Decision_Decision() {
		return getdecdecass2branchbranchcmd().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__Perform_FWD__IsApplicableMatch() {
		return getdecdecass2branchbranchcmd().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_FWD__Match() {
		return getdecdecass2branchbranchcmd().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__RegisterObjectsToMatch_FWD__Match_Assignment_Decision_Decision() {
		return getdecdecass2branchbranchcmd().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_solveCsp_FWD__Match_Assignment_Decision_Decision() {
		return getdecdecass2branchbranchcmd().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecdecass2branchbranchcmd().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2B_Assignment_Branch_Decision_Decision() {
		return getdecdecass2branchbranchcmd().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_checkCsp_FWD__CSP() {
		return getdecdecass2branchbranchcmd().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdecass2branchbranchcmd().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__CheckTypes_FWD__Match() {
		return getdecdecass2branchbranchcmd().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_BWD__Match_Branch_Branch_Command() {
		return getdecdecass2branchbranchcmd().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__Perform_BWD__IsApplicableMatch() {
		return getdecdecass2branchbranchcmd().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_BWD__Match() {
		return getdecdecass2branchbranchcmd().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command() {
		return getdecdecass2branchbranchcmd().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command() {
		return getdecdecass2branchbranchcmd().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecdecass2branchbranchcmd().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Branch_Decision_Command() {
		return getdecdecass2branchbranchcmd().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_checkCsp_BWD__CSP() {
		return getdecdecass2branchbranchcmd().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecdecass2branchbranchcmd().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__CheckTypes_BWD__Match() {
		return getdecdecass2branchbranchcmd().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_BWD_EMoflonEdge_100__EMoflonEdge() {
		return getdecdecass2branchbranchcmd().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsAppropriate_FWD_EMoflonEdge_106__EMoflonEdge() {
		return getdecdecass2branchbranchcmd().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__CheckAttributes_FWD__TripleMatch() {
		return getdecdecass2branchbranchcmd().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__CheckAttributes_BWD__TripleMatch() {
		return getdecdecass2branchbranchcmd().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_CC__Match_Match() {
		return getdecdecass2branchbranchcmd().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_solveCsp_CC__Assignment_Branch_Branch_Decision_Decision_Command_Match_Match() {
		return getdecdecass2branchbranchcmd().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__IsApplicable_checkCsp_CC__CSP() {
		return getdecdecass2branchbranchcmd().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__CheckDEC_FWD__Assignment_Decision_Decision() {
		return getdecdecass2branchbranchcmd().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__CheckDEC_BWD__Branch_Branch_Command() {
		return getdecdecass2branchbranchcmd().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__GenerateModel__RuleEntryContainer_S2B() {
		return getdecdecass2branchbranchcmd().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2B_Branch_Decision_ModelgeneratorRuleResult() {
		return getdecdecass2branchbranchcmd().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecdecass2branchbranchcmd__GenerateModel_checkCsp_BWD__CSP() {
		return getdecdecass2branchbranchcmd().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecull2branchubb() {
		if (decull2branchubbEClass == null) {
			decull2branchubbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(39);
		}
		return decull2branchubbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_FWD__Match_While_Assignment_While_Decision_Assignment() {
		return getdecull2branchubb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__Perform_FWD__IsApplicableMatch() {
		return getdecull2branchubb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_FWD__Match() {
		return getdecull2branchubb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__RegisterObjectsToMatch_FWD__Match_While_Assignment_While_Decision_Assignment() {
		return getdecull2branchubb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_solveCsp_FWD__Match_While_Assignment_While_Decision_Assignment() {
		return getdecull2branchubb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecull2branchubb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Assignment_Branch_S2B_While_Decision_Assignment() {
		return getdecull2branchubb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_checkCsp_FWD__CSP() {
		return getdecull2branchubb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecull2branchubb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__CheckTypes_FWD__Match() {
		return getdecull2branchubb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_BWD__Match_Command_Command_Branch_Branch_Branch() {
		return getdecull2branchubb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__Perform_BWD__IsApplicableMatch() {
		return getdecull2branchubb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_BWD__Match() {
		return getdecull2branchubb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__RegisterObjectsToMatch_BWD__Match_Command_Command_Branch_Branch_Branch() {
		return getdecull2branchubb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_solveCsp_BWD__Match_Command_Command_Branch_Branch_Branch() {
		return getdecull2branchubb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecull2branchubb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_Command_Branch_S2B_Branch_Decision_Branch() {
		return getdecull2branchubb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_checkCsp_BWD__CSP() {
		return getdecull2branchubb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecull2branchubb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__CheckTypes_BWD__Match() {
		return getdecull2branchubb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_BWD_EMoflonEdge_101__EMoflonEdge() {
		return getdecull2branchubb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsAppropriate_FWD_EMoflonEdge_107__EMoflonEdge() {
		return getdecull2branchubb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__CheckAttributes_FWD__TripleMatch() {
		return getdecull2branchubb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__CheckAttributes_BWD__TripleMatch() {
		return getdecull2branchubb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_CC__Match_Match() {
		return getdecull2branchubb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_solveCsp_CC__While_Assignment_Command_Command_Branch_Branch_While_Decision_Assignment_Branch_Match_Match() {
		return getdecull2branchubb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__IsApplicable_checkCsp_CC__CSP() {
		return getdecull2branchubb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__CheckDEC_FWD__While_Assignment_While_Decision_Assignment() {
		return getdecull2branchubb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__CheckDEC_BWD__Command_Command_Branch_Branch_Branch() {
		return getdecull2branchubb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__GenerateModel__RuleEntryContainer_S2B() {
		return getdecull2branchubb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Decision_ModelgeneratorRuleResult() {
		return getdecull2branchubb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecull2branchubb__GenerateModel_checkCsp_BWD__CSP() {
		return getdecull2branchubb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecld2branchbb() {
		if (decld2branchbbEClass == null) {
			decld2branchbbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(40);
		}
		return decld2branchbbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_FWD__Match_While_Decision_Assignment_Decision() {
		return getdecld2branchbb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__Perform_FWD__IsApplicableMatch() {
		return getdecld2branchbb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_FWD__Match() {
		return getdecld2branchbb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__RegisterObjectsToMatch_FWD__Match_While_Decision_Assignment_Decision() {
		return getdecld2branchbb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_solveCsp_FWD__Match_While_Decision_Assignment_Decision() {
		return getdecld2branchbb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecld2branchbb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Branch_Decision_Assignment_Decision_S2B() {
		return getdecld2branchbb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_checkCsp_FWD__CSP() {
		return getdecld2branchbb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecld2branchbb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__CheckTypes_FWD__Match() {
		return getdecld2branchbb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_BWD__Match_Branch_Branch_Command_Branch() {
		return getdecld2branchbb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__Perform_BWD__IsApplicableMatch() {
		return getdecld2branchbb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_BWD__Match() {
		return getdecld2branchbb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command_Branch() {
		return getdecld2branchbb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command_Branch() {
		return getdecld2branchbb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecld2branchbb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_Decision_Command_Branch_S2B() {
		return getdecld2branchbb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_checkCsp_BWD__CSP() {
		return getdecld2branchbb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecld2branchbb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__CheckTypes_BWD__Match() {
		return getdecld2branchbb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_BWD_EMoflonEdge_102__EMoflonEdge() {
		return getdecld2branchbb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsAppropriate_FWD_EMoflonEdge_108__EMoflonEdge() {
		return getdecld2branchbb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__CheckAttributes_FWD__TripleMatch() {
		return getdecld2branchbb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__CheckAttributes_BWD__TripleMatch() {
		return getdecld2branchbb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_CC__Match_Match() {
		return getdecld2branchbb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_solveCsp_CC__While_Branch_Branch_Decision_Command_Branch_Assignment_Decision_Match_Match() {
		return getdecld2branchbb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__IsApplicable_checkCsp_CC__CSP() {
		return getdecld2branchbb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__CheckDEC_FWD__While_Decision_Assignment_Decision() {
		return getdecld2branchbb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__CheckDEC_BWD__Branch_Branch_Command_Branch() {
		return getdecld2branchbb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__GenerateModel__RuleEntryContainer_S2B() {
		return getdecld2branchbb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_Decision_S2B_ModelgeneratorRuleResult() {
		return getdecld2branchbb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecld2branchbb__GenerateModel_checkCsp_BWD__CSP() {
		return getdecld2branchbb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecaul2branchcub() {
		if (decaul2branchcubEClass == null) {
			decaul2branchcubEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(41);
		}
		return decaul2branchcubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_FWD__Match_Decision_Assignment_Assignment_While() {
		return getdecaul2branchcub().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__Perform_FWD__IsApplicableMatch() {
		return getdecaul2branchcub().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_FWD__Match() {
		return getdecaul2branchcub().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__RegisterObjectsToMatch_FWD__Match_Decision_Assignment_Assignment_While() {
		return getdecaul2branchcub().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_solveCsp_FWD__Match_Decision_Assignment_Assignment_While() {
		return getdecaul2branchcub().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecaul2branchcub().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_Decision_Assignment_S2B_Assignment_While() {
		return getdecaul2branchcub().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_checkCsp_FWD__CSP() {
		return getdecaul2branchcub().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecaul2branchcub().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__CheckTypes_FWD__Match() {
		return getdecaul2branchcub().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_BWD__Match_Command_Branch_Command_Branch() {
		return getdecaul2branchcub().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__Perform_BWD__IsApplicableMatch() {
		return getdecaul2branchcub().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_BWD__Match() {
		return getdecaul2branchcub().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__RegisterObjectsToMatch_BWD__Match_Command_Branch_Command_Branch() {
		return getdecaul2branchcub().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_solveCsp_BWD__Match_Command_Branch_Command_Branch() {
		return getdecaul2branchcub().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecaul2branchcub().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_Branch_Command_Decision_S2B_Branch() {
		return getdecaul2branchcub().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_checkCsp_BWD__CSP() {
		return getdecaul2branchcub().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecaul2branchcub().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__CheckTypes_BWD__Match() {
		return getdecaul2branchcub().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_BWD_EMoflonEdge_103__EMoflonEdge() {
		return getdecaul2branchcub().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge() {
		return getdecaul2branchcub().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__CheckAttributes_FWD__TripleMatch() {
		return getdecaul2branchcub().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__CheckAttributes_BWD__TripleMatch() {
		return getdecaul2branchcub().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_CC__Match_Match() {
		return getdecaul2branchcub().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_solveCsp_CC__Command_Branch_Command_Decision_Assignment_Assignment_While_Branch_Match_Match() {
		return getdecaul2branchcub().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__IsApplicable_checkCsp_CC__CSP() {
		return getdecaul2branchcub().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__CheckDEC_FWD__Decision_Assignment_Assignment_While() {
		return getdecaul2branchcub().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__CheckDEC_BWD__Command_Branch_Command_Branch() {
		return getdecaul2branchcub().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__GenerateModel__RuleEntryContainer_S2B() {
		return getdecaul2branchcub().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_Decision_S2B_ModelgeneratorRuleResult() {
		return getdecaul2branchcub().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecaul2branchcub__GenerateModel_checkCsp_BWD__CSP() {
		return getdecaul2branchcub().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhilel2branchb() {
		if (whilel2branchbEClass == null) {
			whilel2branchbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(42);
		}
		return whilel2branchbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_FWD__Match_Assignment_While_While() {
		return getwhilel2branchb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__Perform_FWD__IsApplicableMatch() {
		return getwhilel2branchb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_FWD__Match() {
		return getwhilel2branchb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__RegisterObjectsToMatch_FWD__Match_Assignment_While_While() {
		return getwhilel2branchb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_solveCsp_FWD__Match_Assignment_While_While() {
		return getwhilel2branchb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhilel2branchb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_Branch_S2B_While_While() {
		return getwhilel2branchb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhilel2branchb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilel2branchb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__CheckTypes_FWD__Match() {
		return getwhilel2branchb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_BWD__Match_Branch_Branch_Command() {
		return getwhilel2branchb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__Perform_BWD__IsApplicableMatch() {
		return getwhilel2branchb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_BWD__Match() {
		return getwhilel2branchb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command() {
		return getwhilel2branchb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command() {
		return getwhilel2branchb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhilel2branchb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_S2B_While_Branch_Command() {
		return getwhilel2branchb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhilel2branchb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilel2branchb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__CheckTypes_BWD__Match() {
		return getwhilel2branchb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_BWD_EMoflonEdge_104__EMoflonEdge() {
		return getwhilel2branchb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge() {
		return getwhilel2branchb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__CheckAttributes_FWD__TripleMatch() {
		return getwhilel2branchb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__CheckAttributes_BWD__TripleMatch() {
		return getwhilel2branchb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_CC__Match_Match() {
		return getwhilel2branchb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_solveCsp_CC__Assignment_Branch_While_Branch_While_Command_Match_Match() {
		return getwhilel2branchb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__IsApplicable_checkCsp_CC__CSP() {
		return getwhilel2branchb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__CheckDEC_FWD__Assignment_While_While() {
		return getwhilel2branchb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__CheckDEC_BWD__Branch_Branch_Command() {
		return getwhilel2branchb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhilel2branchb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_While_ModelgeneratorRuleResult() {
		return getwhilel2branchb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilel2branchb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhilel2branchb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnext2next() {
		if (next2nextEClass == null) {
			next2nextEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(43);
		}
		return next2nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_FWD__Match_Assignment_Statement() {
		return getnext2next().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__Perform_FWD__IsApplicableMatch() {
		return getnext2next().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_FWD__Match() {
		return getnext2next().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__RegisterObjectsToMatch_FWD__Match_Assignment_Statement() {
		return getnext2next().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_solveCsp_FWD__Match_Assignment_Statement() {
		return getnext2next().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_checkCsp_FWD__CSP() {
		return getnext2next().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_solveCsp_FWD__IsApplicableMatch_Command_S2N_Assignment_S2N_Statement_Node() {
		return getnext2next().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_checkCsp_FWD__CSP() {
		return getnext2next().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getnext2next().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__CheckTypes_FWD__Match() {
		return getnext2next().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_BWD__Match_Command_Node() {
		return getnext2next().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__Perform_BWD__IsApplicableMatch() {
		return getnext2next().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_BWD__Match() {
		return getnext2next().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__RegisterObjectsToMatch_BWD__Match_Command_Node() {
		return getnext2next().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_solveCsp_BWD__Match_Command_Node() {
		return getnext2next().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_checkCsp_BWD__CSP() {
		return getnext2next().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_solveCsp_BWD__IsApplicableMatch_Command_S2N_Assignment_S2N_Statement_Node() {
		return getnext2next().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_checkCsp_BWD__CSP() {
		return getnext2next().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getnext2next().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__CheckTypes_BWD__Match() {
		return getnext2next().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_BWD_EMoflonEdge_105__EMoflonEdge() {
		return getnext2next().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsAppropriate_FWD_EMoflonEdge_111__EMoflonEdge() {
		return getnext2next().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__CheckAttributes_FWD__TripleMatch() {
		return getnext2next().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__CheckAttributes_BWD__TripleMatch() {
		return getnext2next().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_CC__Match_Match() {
		return getnext2next().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_solveCsp_CC__Command_Assignment_Statement_Node_Match_Match() {
		return getnext2next().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__IsApplicable_checkCsp_CC__CSP() {
		return getnext2next().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__CheckDEC_FWD__Assignment_Statement() {
		return getnext2next().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__CheckDEC_BWD__Command_Node() {
		return getnext2next().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__GenerateModel__RuleEntryContainer_S2N_S2N() {
		return getnext2next().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__GenerateModel_solveCsp_BWD__IsApplicableMatch_Command_S2N_Assignment_S2N_Statement_Node_ModelgeneratorRuleResult() {
		return getnext2next().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnext2next__GenerateModel_checkCsp_BWD__CSP() {
		return getnext2next().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecula2branchubc() {
		if (decula2branchubcEClass == null) {
			decula2branchubcEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(44);
		}
		return decula2branchubcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_FWD__Match_Assignment_While_Assignment_Decision() {
		return getdecula2branchubc().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__Perform_FWD__IsApplicableMatch() {
		return getdecula2branchubc().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_FWD__Match() {
		return getdecula2branchubc().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__RegisterObjectsToMatch_FWD__Match_Assignment_While_Assignment_Decision() {
		return getdecula2branchubc().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_solveCsp_FWD__Match_Assignment_While_Assignment_Decision() {
		return getdecula2branchubc().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_checkCsp_FWD__CSP() {
		return getdecula2branchubc().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_solveCsp_FWD__IsApplicableMatch_Assignment_Branch_While_Assignment_S2B_Decision() {
		return getdecula2branchubc().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_checkCsp_FWD__CSP() {
		return getdecula2branchubc().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecula2branchubc().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__CheckTypes_FWD__Match() {
		return getdecula2branchubc().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_BWD__Match_Branch_Command_Command_Branch() {
		return getdecula2branchubc().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__Perform_BWD__IsApplicableMatch() {
		return getdecula2branchubc().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_BWD__Match() {
		return getdecula2branchubc().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__RegisterObjectsToMatch_BWD__Match_Branch_Command_Command_Branch() {
		return getdecula2branchubc().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_solveCsp_BWD__Match_Branch_Command_Command_Branch() {
		return getdecula2branchubc().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_checkCsp_BWD__CSP() {
		return getdecula2branchubc().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Command_Command_S2B_Decision_Branch() {
		return getdecula2branchubc().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_checkCsp_BWD__CSP() {
		return getdecula2branchubc().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getdecula2branchubc().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__CheckTypes_BWD__Match() {
		return getdecula2branchubc().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_BWD_EMoflonEdge_106__EMoflonEdge() {
		return getdecula2branchubc().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsAppropriate_FWD_EMoflonEdge_112__EMoflonEdge() {
		return getdecula2branchubc().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__CheckAttributes_FWD__TripleMatch() {
		return getdecula2branchubc().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__CheckAttributes_BWD__TripleMatch() {
		return getdecula2branchubc().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_CC__Match_Match() {
		return getdecula2branchubc().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_solveCsp_CC__Assignment_Branch_Command_Command_While_Assignment_Decision_Branch_Match_Match() {
		return getdecula2branchubc().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__IsApplicable_checkCsp_CC__CSP() {
		return getdecula2branchubc().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__CheckDEC_FWD__Assignment_While_Assignment_Decision() {
		return getdecula2branchubc().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__CheckDEC_BWD__Branch_Command_Command_Branch() {
		return getdecula2branchubc().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__GenerateModel__RuleEntryContainer_S2B() {
		return getdecula2branchubc().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_Decision_ModelgeneratorRuleResult() {
		return getdecula2branchubc().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdecula2branchubc__GenerateModel_checkCsp_BWD__CSP() {
		return getdecula2branchubc().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhilead2branchcb() {
		if (whilead2branchcbEClass == null) {
			whilead2branchcbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(45);
		}
		return whilead2branchcbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_FWD__Match_While_Decision_Assignment() {
		return getwhilead2branchcb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__Perform_FWD__IsApplicableMatch() {
		return getwhilead2branchcb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_FWD__Match() {
		return getwhilead2branchcb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__RegisterObjectsToMatch_FWD__Match_While_Decision_Assignment() {
		return getwhilead2branchcb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_solveCsp_FWD__Match_While_Decision_Assignment() {
		return getwhilead2branchcb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhilead2branchcb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_solveCsp_FWD__IsApplicableMatch_Branch_S2B_While_Decision_Assignment() {
		return getwhilead2branchcb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhilead2branchcb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilead2branchcb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__CheckTypes_FWD__Match() {
		return getwhilead2branchcb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_BWD__Match_Branch_Branch_Command() {
		return getwhilead2branchcb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__Perform_BWD__IsApplicableMatch() {
		return getwhilead2branchcb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_BWD__Match() {
		return getwhilead2branchcb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__RegisterObjectsToMatch_BWD__Match_Branch_Branch_Command() {
		return getwhilead2branchcb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch_Command() {
		return getwhilead2branchcb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhilead2branchcb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_Branch_S2B_Command_While() {
		return getwhilead2branchcb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhilead2branchcb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhilead2branchcb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__CheckTypes_BWD__Match() {
		return getwhilead2branchcb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_BWD_EMoflonEdge_107__EMoflonEdge() {
		return getwhilead2branchcb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsAppropriate_FWD_EMoflonEdge_113__EMoflonEdge() {
		return getwhilead2branchcb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__CheckAttributes_FWD__TripleMatch() {
		return getwhilead2branchcb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__CheckAttributes_BWD__TripleMatch() {
		return getwhilead2branchcb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_CC__Match_Match() {
		return getwhilead2branchcb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_solveCsp_CC__Branch_Branch_Command_While_Decision_Assignment_Match_Match() {
		return getwhilead2branchcb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__IsApplicable_checkCsp_CC__CSP() {
		return getwhilead2branchcb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__CheckDEC_FWD__While_Decision_Assignment() {
		return getwhilead2branchcb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__CheckDEC_BWD__Branch_Branch_Command() {
		return getwhilead2branchcb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhilead2branchcb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__GenerateModel_solveCsp_BWD__IsApplicableMatch_Branch_S2B_While_ModelgeneratorRuleResult() {
		return getwhilead2branchcb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhilead2branchcb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhilead2branchcb().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhiled2branchb() {
		if (whiled2branchbEClass == null) {
			whiled2branchbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(46);
		}
		return whiled2branchbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_FWD__Match_While_Decision() {
		return getwhiled2branchb().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__Perform_FWD__IsApplicableMatch() {
		return getwhiled2branchb().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_FWD__Match() {
		return getwhiled2branchb().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__RegisterObjectsToMatch_FWD__Match_While_Decision() {
		return getwhiled2branchb().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_solveCsp_FWD__Match_While_Decision() {
		return getwhiled2branchb().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_checkCsp_FWD__CSP() {
		return getwhiled2branchb().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_solveCsp_FWD__IsApplicableMatch_While_Decision_S2B_Branch() {
		return getwhiled2branchb().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_checkCsp_FWD__CSP() {
		return getwhiled2branchb().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiled2branchb().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__CheckTypes_FWD__Match() {
		return getwhiled2branchb().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_BWD__Match_Branch_Branch() {
		return getwhiled2branchb().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__Perform_BWD__IsApplicableMatch() {
		return getwhiled2branchb().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_BWD__Match() {
		return getwhiled2branchb().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__RegisterObjectsToMatch_BWD__Match_Branch_Branch() {
		return getwhiled2branchb().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_solveCsp_BWD__Match_Branch_Branch() {
		return getwhiled2branchb().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_checkCsp_BWD__CSP() {
		return getwhiled2branchb().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_solveCsp_BWD__IsApplicableMatch_Branch_While_S2B_Branch() {
		return getwhiled2branchb().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_checkCsp_BWD__CSP() {
		return getwhiled2branchb().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getwhiled2branchb().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__CheckTypes_BWD__Match() {
		return getwhiled2branchb().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_BWD_EMoflonEdge_108__EMoflonEdge() {
		return getwhiled2branchb().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsAppropriate_FWD_EMoflonEdge_114__EMoflonEdge() {
		return getwhiled2branchb().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__CheckAttributes_FWD__TripleMatch() {
		return getwhiled2branchb().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__CheckAttributes_BWD__TripleMatch() {
		return getwhiled2branchb().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_CC__Match_Match() {
		return getwhiled2branchb().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_solveCsp_CC__Branch_While_Decision_Branch_Match_Match() {
		return getwhiled2branchb().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__IsApplicable_checkCsp_CC__CSP() {
		return getwhiled2branchb().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__CheckDEC_FWD__While_Decision() {
		return getwhiled2branchb().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__CheckDEC_BWD__Branch_Branch() {
		return getwhiled2branchb().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__GenerateModel__RuleEntryContainer_S2B() {
		return getwhiled2branchb().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__GenerateModel_solveCsp_BWD__IsApplicableMatch_While_S2B_Branch_ModelgeneratorRuleResult() {
		return getwhiled2branchb().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwhiled2branchb__GenerateModel_checkCsp_BWD__CSP() {
		return getwhiled2branchb().getEOperations().get(31);
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
			eClassifier.setInstanceClassName("org.wbsilva.bx.sourcecode2controlflow.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
