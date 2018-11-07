/**
 */
package org.wbsilva.bx.class2database.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import class_.ClassPackage;

import database.DatabasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

import org.wbsilva.bx.class2database.Class2databasePackage;

import org.wbsilva.bx.class2database.Rules.RulesFactory;
import org.wbsilva.bx.class2database.Rules.RulesPackage;

import org.wbsilva.bx.class2database.impl.Class2databasePackageImpl;

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
	private EClass cd2dbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class2tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass super2tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfassoc2columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute2columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass association2columnEClass = null;

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
	 * @see org.wbsilva.bx.class2database.Rules.RulesPackage#eNS_URI
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
		ClassPackage.eINSTANCE.eClass();
		DatabasePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Class2databasePackageImpl theClass2databasePackage = (Class2databasePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Class2databasePackage.eNS_URI) instanceof Class2databasePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Class2databasePackage.eNS_URI)
						: Class2databasePackage.eINSTANCE);

		// Load packages
		theClass2databasePackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theClass2databasePackage.fixPackageContents();

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
	public EClass getcd2db() {
		if (cd2dbEClass == null) {
			cd2dbEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return cd2dbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_FWD__Match_ClassDiagram() {
		return getcd2db().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__Perform_FWD__IsApplicableMatch() {
		return getcd2db().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_FWD__Match() {
		return getcd2db().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__RegisterObjectsToMatch_FWD__Match_ClassDiagram() {
		return getcd2db().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_solveCsp_FWD__Match_ClassDiagram() {
		return getcd2db().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_checkCsp_FWD__CSP() {
		return getcd2db().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDiagram() {
		return getcd2db().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_checkCsp_FWD__CSP() {
		return getcd2db().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getcd2db().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__CheckTypes_FWD__Match() {
		return getcd2db().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_BWD__Match_DB() {
		return getcd2db().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__Perform_BWD__IsApplicableMatch() {
		return getcd2db().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_BWD__Match() {
		return getcd2db().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__RegisterObjectsToMatch_BWD__Match_DB() {
		return getcd2db().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_solveCsp_BWD__Match_DB() {
		return getcd2db().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_checkCsp_BWD__CSP() {
		return getcd2db().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_solveCsp_BWD__IsApplicableMatch_DB() {
		return getcd2db().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_checkCsp_BWD__CSP() {
		return getcd2db().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getcd2db().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__CheckTypes_BWD__Match() {
		return getcd2db().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_BWD_DB_1__DB() {
		return getcd2db().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsAppropriate_FWD_ClassDiagram_1__ClassDiagram() {
		return getcd2db().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__CheckAttributes_FWD__TripleMatch() {
		return getcd2db().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__CheckAttributes_BWD__TripleMatch() {
		return getcd2db().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_CC__Match_Match() {
		return getcd2db().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_solveCsp_CC__ClassDiagram_DB_Match_Match() {
		return getcd2db().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__IsApplicable_checkCsp_CC__CSP() {
		return getcd2db().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__CheckDEC_FWD__ClassDiagram() {
		return getcd2db().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__CheckDEC_BWD__DB() {
		return getcd2db().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__GenerateModel__RuleEntryContainer() {
		return getcd2db().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getcd2db().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcd2db__GenerateModel_checkCsp_BWD__CSP() {
		return getcd2db().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclass2table() {
		if (class2tableEClass == null) {
			class2tableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return class2tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_FWD__Match_ClassDiagram_Clazz() {
		return getclass2table().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__Perform_FWD__IsApplicableMatch() {
		return getclass2table().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_FWD__Match() {
		return getclass2table().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__RegisterObjectsToMatch_FWD__Match_ClassDiagram_Clazz() {
		return getclass2table().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_solveCsp_FWD__Match_ClassDiagram_Clazz() {
		return getclass2table().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_checkCsp_FWD__CSP() {
		return getclass2table().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_solveCsp_FWD__IsApplicableMatch_DB_ClassDiagram_CD2D_Clazz() {
		return getclass2table().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_checkCsp_FWD__CSP() {
		return getclass2table().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getclass2table().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__CheckTypes_FWD__Match() {
		return getclass2table().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_BWD__Match_DB_Table() {
		return getclass2table().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__Perform_BWD__IsApplicableMatch() {
		return getclass2table().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_BWD__Match() {
		return getclass2table().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__RegisterObjectsToMatch_BWD__Match_DB_Table() {
		return getclass2table().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_solveCsp_BWD__Match_DB_Table() {
		return getclass2table().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_checkCsp_BWD__CSP() {
		return getclass2table().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_solveCsp_BWD__IsApplicableMatch_DB_Table_ClassDiagram_CD2D() {
		return getclass2table().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_checkCsp_BWD__CSP() {
		return getclass2table().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getclass2table().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__CheckTypes_BWD__Match() {
		return getclass2table().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge() {
		return getclass2table().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsAppropriate_FWD_EMoflonEdge_64__EMoflonEdge() {
		return getclass2table().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__CheckAttributes_FWD__TripleMatch() {
		return getclass2table().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__CheckAttributes_BWD__TripleMatch() {
		return getclass2table().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_CC__Match_Match() {
		return getclass2table().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_solveCsp_CC__DB_Table_ClassDiagram_Clazz_Match_Match() {
		return getclass2table().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__IsApplicable_checkCsp_CC__CSP() {
		return getclass2table().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__CheckDEC_FWD__ClassDiagram_Clazz() {
		return getclass2table().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__CheckDEC_BWD__DB_Table() {
		return getclass2table().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__GenerateModel__RuleEntryContainer_CD2D() {
		return getclass2table().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__GenerateModel_solveCsp_BWD__IsApplicableMatch_DB_ClassDiagram_CD2D_ModelgeneratorRuleResult() {
		return getclass2table().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getclass2table__GenerateModel_checkCsp_BWD__CSP() {
		return getclass2table().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsuper2table() {
		if (super2tableEClass == null) {
			super2tableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(2);
		}
		return super2tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_FWD__Match_Clazz_Clazz_ClassDiagram() {
		return getsuper2table().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__Perform_FWD__IsApplicableMatch() {
		return getsuper2table().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_FWD__Match() {
		return getsuper2table().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__RegisterObjectsToMatch_FWD__Match_Clazz_Clazz_ClassDiagram() {
		return getsuper2table().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_solveCsp_FWD__Match_Clazz_Clazz_ClassDiagram() {
		return getsuper2table().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_checkCsp_FWD__CSP() {
		return getsuper2table().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_solveCsp_FWD__IsApplicableMatch_DB_C2T_Table_Clazz_CD2D_Clazz_ClassDiagram() {
		return getsuper2table().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_checkCsp_FWD__CSP() {
		return getsuper2table().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getsuper2table().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__CheckTypes_FWD__Match() {
		return getsuper2table().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_BWD__Match_DB_Table() {
		return getsuper2table().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__Perform_BWD__IsApplicableMatch() {
		return getsuper2table().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_BWD__Match() {
		return getsuper2table().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__RegisterObjectsToMatch_BWD__Match_DB_Table() {
		return getsuper2table().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_solveCsp_BWD__Match_DB_Table() {
		return getsuper2table().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_checkCsp_BWD__CSP() {
		return getsuper2table().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__CheckTypes_BWD__Match() {
		return getsuper2table().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_BWD_DB_2__DB() {
		return getsuper2table().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsAppropriate_FWD_EMoflonEdge_65__EMoflonEdge() {
		return getsuper2table().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__CheckAttributes_FWD__TripleMatch() {
		return getsuper2table().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__CheckAttributes_BWD__TripleMatch() {
		return getsuper2table().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_CC__Match_Match() {
		return getsuper2table().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_solveCsp_CC__DB_Table_Clazz_Clazz_ClassDiagram_Match_Match() {
		return getsuper2table().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__IsApplicable_checkCsp_CC__CSP() {
		return getsuper2table().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__CheckDEC_FWD__Clazz_Clazz_ClassDiagram() {
		return getsuper2table().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__CheckDEC_BWD__DB_Table() {
		return getsuper2table().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__GenerateModel__RuleEntryContainer_C2T() {
		return getsuper2table().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__GenerateModel_solveCsp_BWD__IsApplicableMatch_DB_C2T_Table_Clazz_CD2D_ClassDiagram_ModelgeneratorRuleResult() {
		return getsuper2table().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsuper2table__GenerateModel_checkCsp_BWD__CSP() {
		return getsuper2table().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getselfassoc2column() {
		if (selfassoc2columnEClass == null) {
			selfassoc2columnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return selfassoc2columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_FWD__Match_Clazz_Association_ClassDiagram() {
		return getselfassoc2column().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__Perform_FWD__IsApplicableMatch() {
		return getselfassoc2column().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_FWD__Match() {
		return getselfassoc2column().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__RegisterObjectsToMatch_FWD__Match_Clazz_Association_ClassDiagram() {
		return getselfassoc2column().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_solveCsp_FWD__Match_Clazz_Association_ClassDiagram() {
		return getselfassoc2column().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_checkCsp_FWD__CSP() {
		return getselfassoc2column().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_solveCsp_FWD__IsApplicableMatch_Clazz_DB_Table_Association_C2T_CD2D_ClassDiagram() {
		return getselfassoc2column().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_checkCsp_FWD__CSP() {
		return getselfassoc2column().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getselfassoc2column().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__CheckTypes_FWD__Match() {
		return getselfassoc2column().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_BWD__Match_Column_DB_Table() {
		return getselfassoc2column().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__Perform_BWD__IsApplicableMatch() {
		return getselfassoc2column().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_BWD__Match() {
		return getselfassoc2column().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__RegisterObjectsToMatch_BWD__Match_Column_DB_Table() {
		return getselfassoc2column().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_solveCsp_BWD__Match_Column_DB_Table() {
		return getselfassoc2column().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_checkCsp_BWD__CSP() {
		return getselfassoc2column().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_solveCsp_BWD__IsApplicableMatch_Clazz_Column_DB_Table_C2T_CD2D_ClassDiagram() {
		return getselfassoc2column().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_checkCsp_BWD__CSP() {
		return getselfassoc2column().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getselfassoc2column().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__CheckTypes_BWD__Match() {
		return getselfassoc2column().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge() {
		return getselfassoc2column().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsAppropriate_FWD_EMoflonEdge_66__EMoflonEdge() {
		return getselfassoc2column().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__CheckAttributes_FWD__TripleMatch() {
		return getselfassoc2column().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__CheckAttributes_BWD__TripleMatch() {
		return getselfassoc2column().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_CC__Match_Match() {
		return getselfassoc2column().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_solveCsp_CC__Clazz_Column_DB_Table_Association_ClassDiagram_Match_Match() {
		return getselfassoc2column().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__IsApplicable_checkCsp_CC__CSP() {
		return getselfassoc2column().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__CheckDEC_FWD__Clazz_Association_ClassDiagram() {
		return getselfassoc2column().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__CheckDEC_BWD__Column_DB_Table() {
		return getselfassoc2column().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__GenerateModel__RuleEntryContainer_C2T() {
		return getselfassoc2column().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__GenerateModel_solveCsp_BWD__IsApplicableMatch_Clazz_DB_Table_C2T_CD2D_ClassDiagram_ModelgeneratorRuleResult() {
		return getselfassoc2column().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getselfassoc2column__GenerateModel_checkCsp_BWD__CSP() {
		return getselfassoc2column().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattribute2column() {
		if (attribute2columnEClass == null) {
			attribute2columnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return attribute2columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_FWD__Match_Clazz_Attribute() {
		return getattribute2column().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__Perform_FWD__IsApplicableMatch() {
		return getattribute2column().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_FWD__Match() {
		return getattribute2column().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__RegisterObjectsToMatch_FWD__Match_Clazz_Attribute() {
		return getattribute2column().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_solveCsp_FWD__Match_Clazz_Attribute() {
		return getattribute2column().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_checkCsp_FWD__CSP() {
		return getattribute2column().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_solveCsp_FWD__IsApplicableMatch_Clazz_Table_C2T_Attribute() {
		return getattribute2column().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_checkCsp_FWD__CSP() {
		return getattribute2column().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getattribute2column().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__CheckTypes_FWD__Match() {
		return getattribute2column().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_BWD__Match_Column_Table() {
		return getattribute2column().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__Perform_BWD__IsApplicableMatch() {
		return getattribute2column().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_BWD__Match() {
		return getattribute2column().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__RegisterObjectsToMatch_BWD__Match_Column_Table() {
		return getattribute2column().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_solveCsp_BWD__Match_Column_Table() {
		return getattribute2column().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_checkCsp_BWD__CSP() {
		return getattribute2column().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_solveCsp_BWD__IsApplicableMatch_Column_Clazz_Table_C2T() {
		return getattribute2column().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_checkCsp_BWD__CSP() {
		return getattribute2column().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getattribute2column().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__CheckTypes_BWD__Match() {
		return getattribute2column().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge() {
		return getattribute2column().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsAppropriate_FWD_EMoflonEdge_67__EMoflonEdge() {
		return getattribute2column().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__CheckAttributes_FWD__TripleMatch() {
		return getattribute2column().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__CheckAttributes_BWD__TripleMatch() {
		return getattribute2column().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_CC__Match_Match() {
		return getattribute2column().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_solveCsp_CC__Column_Clazz_Table_Attribute_Match_Match() {
		return getattribute2column().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__IsApplicable_checkCsp_CC__CSP() {
		return getattribute2column().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__CheckDEC_FWD__Clazz_Attribute() {
		return getattribute2column().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__CheckDEC_BWD__Column_Table() {
		return getattribute2column().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__GenerateModel__RuleEntryContainer_C2T() {
		return getattribute2column().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__GenerateModel_solveCsp_BWD__IsApplicableMatch_Clazz_Table_C2T_ModelgeneratorRuleResult() {
		return getattribute2column().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getattribute2column__GenerateModel_checkCsp_BWD__CSP() {
		return getattribute2column().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getassociation2column() {
		if (association2columnEClass == null) {
			association2columnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return association2columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_FWD__Match_Association_Clazz_ClassDiagram_Clazz() {
		return getassociation2column().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__Perform_FWD__IsApplicableMatch() {
		return getassociation2column().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_FWD__Match() {
		return getassociation2column().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__RegisterObjectsToMatch_FWD__Match_Association_Clazz_ClassDiagram_Clazz() {
		return getassociation2column().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_solveCsp_FWD__Match_Association_Clazz_ClassDiagram_Clazz() {
		return getassociation2column().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_checkCsp_FWD__CSP() {
		return getassociation2column().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_solveCsp_FWD__IsApplicableMatch_C2T_Association_C2T_Clazz_DB_Table_ClassDiagram_Table_Clazz_CD2D() {
		return getassociation2column().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_checkCsp_FWD__CSP() {
		return getassociation2column().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getassociation2column().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__CheckTypes_FWD__Match() {
		return getassociation2column().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_BWD__Match_Column_DB_Table_Table() {
		return getassociation2column().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__Perform_BWD__IsApplicableMatch() {
		return getassociation2column().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_BWD__Match() {
		return getassociation2column().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__RegisterObjectsToMatch_BWD__Match_Column_DB_Table_Table() {
		return getassociation2column().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_solveCsp_BWD__Match_Column_DB_Table_Table() {
		return getassociation2column().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_checkCsp_BWD__CSP() {
		return getassociation2column().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_solveCsp_BWD__IsApplicableMatch_C2T_Column_C2T_Clazz_DB_Table_ClassDiagram_Table_Clazz_CD2D() {
		return getassociation2column().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_checkCsp_BWD__CSP() {
		return getassociation2column().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getassociation2column().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__CheckTypes_BWD__Match() {
		return getassociation2column().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge() {
		return getassociation2column().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsAppropriate_FWD_EMoflonEdge_68__EMoflonEdge() {
		return getassociation2column().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__CheckAttributes_FWD__TripleMatch() {
		return getassociation2column().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__CheckAttributes_BWD__TripleMatch() {
		return getassociation2column().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_CC__Match_Match() {
		return getassociation2column().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_solveCsp_CC__Association_Column_Clazz_DB_Table_ClassDiagram_Table_Clazz_Match_Match() {
		return getassociation2column().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__IsApplicable_checkCsp_CC__CSP() {
		return getassociation2column().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__CheckDEC_FWD__Association_Clazz_ClassDiagram_Clazz() {
		return getassociation2column().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__CheckDEC_BWD__Column_DB_Table_Table() {
		return getassociation2column().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__GenerateModel__RuleEntryContainer_C2T() {
		return getassociation2column().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__GenerateModel_solveCsp_BWD__IsApplicableMatch_C2T_C2T_Clazz_DB_Table_ClassDiagram_Table_Clazz_CD2D_ModelgeneratorRuleResult() {
		return getassociation2column().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getassociation2column__GenerateModel_checkCsp_BWD__CSP() {
		return getassociation2column().getEOperations().get(31);
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
			eClassifier.setInstanceClassName("org.wbsilva.bx.class2database.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
