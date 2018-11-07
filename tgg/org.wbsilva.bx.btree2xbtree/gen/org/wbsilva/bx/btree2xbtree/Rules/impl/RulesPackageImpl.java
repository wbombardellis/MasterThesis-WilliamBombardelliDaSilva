/**
 */
package org.wbsilva.bx.btree2xbtree.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import btree.BtreePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.language.csp.CspPackage;

import org.moflon.tgg.language.modelgenerator.ModelgeneratorPackage;

import org.moflon.tgg.runtime.RuntimePackage;

import org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage;

import org.wbsilva.bx.btree2xbtree.Rules.RulesFactory;
import org.wbsilva.bx.btree2xbtree.Rules.RulesPackage;
import org.wbsilva.bx.btree2xbtree.Rules.left2southwest;
import org.wbsilva.bx.btree2xbtree.Rules.node2node;
import org.wbsilva.bx.btree2xbtree.Rules.right2southeast;
import org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest;

import org.wbsilva.bx.btree2xbtree.impl.Btree2xbtreePackageImpl;

import xbtree.XbtreePackage;

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
	private EClass left2southwestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass node2nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightleft2eastwestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass right2southeastEClass = null;

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
	 * @see org.wbsilva.bx.btree2xbtree.Rules.RulesPackage#eNS_URI
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
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
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
		BtreePackage.eINSTANCE.eClass();
		XbtreePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Btree2xbtreePackageImpl theBtree2xbtreePackage = (Btree2xbtreePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Btree2xbtreePackage.eNS_URI) instanceof Btree2xbtreePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Btree2xbtreePackage.eNS_URI)
						: Btree2xbtreePackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theBtree2xbtreePackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theBtree2xbtreePackage.initializePackageContents();

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
	public EClass getleft2southwest() {
		return left2southwestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_FWD__Match_BTNode_BTNode() {
		return left2southwestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__Perform_FWD__IsApplicableMatch() {
		return left2southwestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_FWD__Match() {
		return left2southwestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode() {
		return left2southwestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode() {
		return left2southwestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_checkCsp_FWD__CSP() {
		return left2southwestEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_BTNode_XBTNode_BTNode2XBTnode() {
		return left2southwestEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_checkCsp_FWD__CSP() {
		return left2southwestEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return left2southwestEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__CheckTypes_FWD__Match() {
		return left2southwestEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_BWD__Match_XBTNode_XBTNode() {
		return left2southwestEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__Perform_BWD__IsApplicableMatch() {
		return left2southwestEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_BWD__Match() {
		return left2southwestEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode() {
		return left2southwestEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode() {
		return left2southwestEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_checkCsp_BWD__CSP() {
		return left2southwestEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_XBTNode_BTNode2XBTnode() {
		return left2southwestEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_checkCsp_BWD__CSP() {
		return left2southwestEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return left2southwestEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__CheckTypes_BWD__Match() {
		return left2southwestEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_BWD_EMoflonEdge_112__EMoflonEdge() {
		return left2southwestEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsAppropriate_FWD_EMoflonEdge_120__EMoflonEdge() {
		return left2southwestEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__CheckAttributes_FWD__TripleMatch() {
		return left2southwestEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__CheckAttributes_BWD__TripleMatch() {
		return left2southwestEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_CC__Match_Match() {
		return left2southwestEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_solveCsp_CC__BTNode_BTNode_XBTNode_XBTNode_Match_Match() {
		return left2southwestEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__IsApplicable_checkCsp_CC__CSP() {
		return left2southwestEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__CheckDEC_FWD__BTNode_BTNode() {
		return left2southwestEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__CheckDEC_BWD__XBTNode_XBTNode() {
		return left2southwestEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode() {
		return left2southwestEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_ModelgeneratorRuleResult() {
		return left2southwestEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getleft2southwest__GenerateModel_checkCsp_BWD__CSP() {
		return left2southwestEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnode2node() {
		return node2nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_FWD__Match_BTNode() {
		return node2nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__Perform_FWD__IsApplicableMatch() {
		return node2nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_FWD__Match() {
		return node2nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__RegisterObjectsToMatch_FWD__Match_BTNode() {
		return node2nodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_solveCsp_FWD__Match_BTNode() {
		return node2nodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_checkCsp_FWD__CSP() {
		return node2nodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode() {
		return node2nodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_checkCsp_FWD__CSP() {
		return node2nodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return node2nodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__CheckTypes_FWD__Match() {
		return node2nodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_BWD__Match_XBTNode() {
		return node2nodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__Perform_BWD__IsApplicableMatch() {
		return node2nodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_BWD__Match() {
		return node2nodeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__RegisterObjectsToMatch_BWD__Match_XBTNode() {
		return node2nodeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_solveCsp_BWD__Match_XBTNode() {
		return node2nodeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_checkCsp_BWD__CSP() {
		return node2nodeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_solveCsp_BWD__IsApplicableMatch_XBTNode() {
		return node2nodeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_checkCsp_BWD__CSP() {
		return node2nodeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return node2nodeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__CheckTypes_BWD__Match() {
		return node2nodeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_BWD_XBTNode_1__XBTNode() {
		return node2nodeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsAppropriate_FWD_BTNode_1__BTNode() {
		return node2nodeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__CheckAttributes_FWD__TripleMatch() {
		return node2nodeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__CheckAttributes_BWD__TripleMatch() {
		return node2nodeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_CC__Match_Match() {
		return node2nodeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_solveCsp_CC__XBTNode_BTNode_Match_Match() {
		return node2nodeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__IsApplicable_checkCsp_CC__CSP() {
		return node2nodeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__CheckDEC_FWD__BTNode() {
		return node2nodeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__CheckDEC_BWD__XBTNode() {
		return node2nodeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__GenerateModel__RuleEntryContainer() {
		return node2nodeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return node2nodeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnode2node__GenerateModel_checkCsp_BWD__CSP() {
		return node2nodeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrightleft2eastwest() {
		return rightleft2eastwestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_FWD__Match_BTNode_BTNode_BTNode() {
		return rightleft2eastwestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__Perform_FWD__IsApplicableMatch() {
		return rightleft2eastwestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_FWD__Match() {
		return rightleft2eastwestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode_BTNode() {
		return rightleft2eastwestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode_BTNode() {
		return rightleft2eastwestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_checkCsp_FWD__CSP() {
		return rightleft2eastwestEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode2XBTnode_BTNode_XBTNode_BTNode_BTNode() {
		return rightleft2eastwestEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_checkCsp_FWD__CSP() {
		return rightleft2eastwestEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return rightleft2eastwestEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__CheckTypes_FWD__Match() {
		return rightleft2eastwestEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_BWD__Match_XBTNode_XBTNode_XBTNode() {
		return rightleft2eastwestEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__Perform_BWD__IsApplicableMatch() {
		return rightleft2eastwestEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_BWD__Match() {
		return rightleft2eastwestEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode_XBTNode() {
		return rightleft2eastwestEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode_XBTNode() {
		return rightleft2eastwestEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_checkCsp_BWD__CSP() {
		return rightleft2eastwestEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_XBTNode_XBTNode_BTNode_XBTNode() {
		return rightleft2eastwestEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_checkCsp_BWD__CSP() {
		return rightleft2eastwestEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return rightleft2eastwestEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__CheckTypes_BWD__Match() {
		return rightleft2eastwestEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_BWD_EMoflonEdge_113__EMoflonEdge() {
		return rightleft2eastwestEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsAppropriate_FWD_EMoflonEdge_121__EMoflonEdge() {
		return rightleft2eastwestEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__CheckAttributes_FWD__TripleMatch() {
		return rightleft2eastwestEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__CheckAttributes_BWD__TripleMatch() {
		return rightleft2eastwestEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_CC__Match_Match() {
		return rightleft2eastwestEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_solveCsp_CC__BTNode_XBTNode_XBTNode_BTNode_BTNode_XBTNode_Match_Match() {
		return rightleft2eastwestEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__IsApplicable_checkCsp_CC__CSP() {
		return rightleft2eastwestEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__CheckDEC_FWD__BTNode_BTNode_BTNode() {
		return rightleft2eastwestEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__CheckDEC_BWD__XBTNode_XBTNode_XBTNode() {
		return rightleft2eastwestEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode() {
		return rightleft2eastwestEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_XBTNode_BTNode_ModelgeneratorRuleResult() {
		return rightleft2eastwestEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrightleft2eastwest__GenerateModel_checkCsp_BWD__CSP() {
		return rightleft2eastwestEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getright2southeast() {
		return right2southeastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_FWD__Match_BTNode_BTNode() {
		return right2southeastEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__Perform_FWD__IsApplicableMatch() {
		return right2southeastEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_FWD__Match() {
		return right2southeastEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode() {
		return right2southeastEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode() {
		return right2southeastEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_checkCsp_FWD__CSP() {
		return right2southeastEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_BTNode_BTNode2XBTnode_XBTNode() {
		return right2southeastEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_checkCsp_FWD__CSP() {
		return right2southeastEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return right2southeastEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__CheckTypes_FWD__Match() {
		return right2southeastEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_BWD__Match_XBTNode_XBTNode() {
		return right2southeastEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__Perform_BWD__IsApplicableMatch() {
		return right2southeastEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_BWD__Match() {
		return right2southeastEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode() {
		return right2southeastEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode() {
		return right2southeastEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_checkCsp_BWD__CSP() {
		return right2southeastEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode_BTNode2XBTnode_XBTNode_XBTNode() {
		return right2southeastEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_checkCsp_BWD__CSP() {
		return right2southeastEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return right2southeastEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__CheckTypes_BWD__Match() {
		return right2southeastEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_BWD_EMoflonEdge_114__EMoflonEdge() {
		return right2southeastEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsAppropriate_FWD_EMoflonEdge_122__EMoflonEdge() {
		return right2southeastEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__CheckAttributes_FWD__TripleMatch() {
		return right2southeastEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__CheckAttributes_BWD__TripleMatch() {
		return right2southeastEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_CC__Match_Match() {
		return right2southeastEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_solveCsp_CC__BTNode_BTNode_XBTNode_XBTNode_Match_Match() {
		return right2southeastEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__IsApplicable_checkCsp_CC__CSP() {
		return right2southeastEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__CheckDEC_FWD__BTNode_BTNode() {
		return right2southeastEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__CheckDEC_BWD__XBTNode_XBTNode() {
		return right2southeastEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__GenerateModel__RuleEntryContainer_BTNode2XBTnode() {
		return right2southeastEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode_BTNode2XBTnode_XBTNode_ModelgeneratorRuleResult() {
		return right2southeastEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getright2southeast__GenerateModel_checkCsp_BWD__CSP() {
		return right2southeastEClass.getEOperations().get(31);
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
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		left2southwestEClass = createEClass(LEFT2SOUTHWEST);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPLICABLE_FWD__MATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(left2southwestEClass,
				LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_BTNODE_XBTNODE_BTNODE2XBTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(left2southwestEClass,
				LEFT2SOUTHWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___CHECK_TYPES_FWD__MATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPLICABLE_BWD__MATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(left2southwestEClass,
				LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_XBTNODE_BTNODE2XBTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(left2southwestEClass,
				LEFT2SOUTHWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___CHECK_TYPES_BWD__MATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_112__EMOFLONEDGE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_120__EMOFLONEDGE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(left2southwestEClass,
				LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_BTNODE_XBTNODE_XBTNODE_MATCH_MATCH);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___CHECK_DEC_FWD__BTNODE_BTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE);
		createEOperation(left2southwestEClass,
				LEFT2SOUTHWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT);
		createEOperation(left2southwestEClass, LEFT2SOUTHWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		node2nodeEClass = createEClass(NODE2NODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_FWD__MATCH_BTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(node2nodeEClass, NODE2NODE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(node2nodeEClass, NODE2NODE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(node2nodeEClass, NODE2NODE___CHECK_TYPES_FWD__MATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_BWD__MATCH_XBTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(node2nodeEClass, NODE2NODE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(node2nodeEClass, NODE2NODE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(node2nodeEClass, NODE2NODE___CHECK_TYPES_BWD__MATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_BWD_XBT_NODE_1__XBTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPROPRIATE_FWD_BT_NODE_1__BTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(node2nodeEClass, NODE2NODE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_BTNODE_MATCH_MATCH);
		createEOperation(node2nodeEClass, NODE2NODE___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(node2nodeEClass, NODE2NODE___CHECK_DEC_FWD__BTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___CHECK_DEC_BWD__XBTNODE);
		createEOperation(node2nodeEClass, NODE2NODE___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(node2nodeEClass,
				NODE2NODE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT);
		createEOperation(node2nodeEClass, NODE2NODE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		rightleft2eastwestEClass = createEClass(RIGHTLEFT2EASTWEST);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE_BTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPLICABLE_FWD__MATCH);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE_BTNODE);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE_BTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_BTNODE_XBTNODE_BTNODE_BTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___CHECK_TYPES_FWD__MATCH);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPLICABLE_BWD__MATCH);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_XBTNODE_XBTNODE_BTNODE_XBTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___CHECK_TYPES_BWD__MATCH);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_113__EMOFLONEDGE);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_XBTNODE_XBTNODE_BTNODE_BTNODE_XBTNODE_MATCH_MATCH);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___CHECK_DEC_FWD__BTNODE_BTNODE_BTNODE);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE_XBTNODE);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE);
		createEOperation(rightleft2eastwestEClass,
				RIGHTLEFT2EASTWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_XBTNODE_BTNODE_MODELGENERATORRULERESULT);
		createEOperation(rightleft2eastwestEClass, RIGHTLEFT2EASTWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		right2southeastEClass = createEClass(RIGHT2SOUTHEAST);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPLICABLE_FWD__MATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(right2southeastEClass,
				RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_BTNODE_BTNODE2XBTNODE_XBTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(right2southeastEClass,
				RIGHT2SOUTHEAST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___CHECK_TYPES_FWD__MATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPLICABLE_BWD__MATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(right2southeastEClass,
				RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_BTNODE2XBTNODE_XBTNODE_XBTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(right2southeastEClass,
				RIGHT2SOUTHEAST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___CHECK_TYPES_BWD__MATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_114__EMOFLONEDGE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(right2southeastEClass,
				RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_BTNODE_XBTNODE_XBTNODE_MATCH_MATCH);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___CHECK_DEC_FWD__BTNODE_BTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___CHECK_DEC_BWD__XBTNODE_XBTNODE);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE);
		createEOperation(right2southeastEClass,
				RIGHT2SOUTHEAST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_BTNODE2XBTNODE_XBTNODE_MODELGENERATORRULERESULT);
		createEOperation(right2southeastEClass, RIGHT2SOUTHEAST___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);
		BtreePackage theBtreePackage = (BtreePackage) EPackage.Registry.INSTANCE.getEPackage(BtreePackage.eNS_URI);
		CspPackage theCspPackage = (CspPackage) EPackage.Registry.INSTANCE.getEPackage(CspPackage.eNS_URI);
		XbtreePackage theXbtreePackage = (XbtreePackage) EPackage.Registry.INSTANCE.getEPackage(XbtreePackage.eNS_URI);
		Btree2xbtreePackage theBtree2xbtreePackage = (Btree2xbtreePackage) EPackage.Registry.INSTANCE
				.getEPackage(Btree2xbtreePackage.eNS_URI);
		ModelgeneratorPackage theModelgeneratorPackage = (ModelgeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelgeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		left2southwestEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		node2nodeEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		rightleft2eastwestEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		right2southeastEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(left2southwestEClass, left2southwest.class, "left2southwest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getleft2southwest__IsAppropriate_FWD__Match_BTNode_BTNode(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_FWD__Match(), theRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getleft2southwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_BTNode_XBTNode_BTNode2XBTnode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getleft2southwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "l2sw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(), "checkTypes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_BWD__Match_XBTNode_XBTNode(), ecorePackage.getEBoolean(),
				"isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_BWD__Match(), theRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getleft2southwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_XBTNode_BTNode2XBTnode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getleft2southwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "l2sw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(), "checkTypes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_BWD_EMoflonEdge_112__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_EMoflonEdge_112", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_sw", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsAppropriate_FWD_EMoflonEdge_120__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_EMoflonEdge_120", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_solveCsp_CC__BTNode_BTNode_XBTNode_XBTNode_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__CheckDEC_FWD__BTNode_BTNode(), ecorePackage.getEBoolean(),
				"checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__CheckDEC_BWD__XBTNode_XBTNode(), ecorePackage.getEBoolean(),
				"checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xnParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getleft2southwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getleft2southwest__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(node2nodeEClass, node2node.class, "node2node", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getnode2node__IsAppropriate_FWD__Match_BTNode(), ecorePackage.getEBoolean(),
				"isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__Perform_FWD__IsApplicableMatch(), theRuntimePackage.getPerformRuleResult(),
				"perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_FWD__Match(), theRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__RegisterObjectsToMatch_FWD__Match_BTNode(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_solveCsp_FWD__Match_BTNode(), theCspPackage.getCSP(),
				"isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode(), theCspPackage.getCSP(),
				"isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject(), null,
				"registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_BWD__Match_XBTNode(), ecorePackage.getEBoolean(),
				"isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__Perform_BWD__IsApplicableMatch(), theRuntimePackage.getPerformRuleResult(),
				"perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_BWD__Match(), theRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__RegisterObjectsToMatch_BWD__Match_XBTNode(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_solveCsp_BWD__Match_XBTNode(), theCspPackage.getCSP(),
				"isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_solveCsp_BWD__IsApplicableMatch_XBTNode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject(), null,
				"registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_BWD_XBTNode_1__XBTNode(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_XBTNode_1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsAppropriate_FWD_BTNode_1__BTNode(), theRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_BTNode_1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_CC__Match_Match(), theRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_solveCsp_CC__XBTNode_BTNode_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__CheckDEC_FWD__BTNode(), ecorePackage.getEBoolean(), "checkDEC_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__CheckDEC_BWD__XBTNode(), ecorePackage.getEBoolean(), "checkDEC_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__GenerateModel__RuleEntryContainer(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getnode2node__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnode2node__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rightleft2eastwestEClass, rightleft2eastwest.class, "rightleft2eastwest", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_FWD__Match_BTNode_BTNode_BTNode(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode_BTNode(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode_BTNode(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getrightleft2eastwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode2XBTnode_BTNode_XBTNode_BTNode_BTNode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getrightleft2eastwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cr2xcse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cl2xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_BWD__Match_XBTNode_XBTNode_XBTNode(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode_XBTNode(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode_XBTNode(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getrightleft2eastwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_XBTNode_XBTNode_BTNode_XBTNode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getrightleft2eastwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cr2xcse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cl2xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_BWD_EMoflonEdge_113__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_EMoflonEdge_113", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_sw", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsAppropriate_FWD_EMoflonEdge_121__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_EMoflonEdge_121", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getrightleft2eastwest__IsApplicable_solveCsp_CC__BTNode_XBTNode_XBTNode_BTNode_BTNode_XBTNode_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__CheckDEC_FWD__BTNode_BTNode_BTNode(), ecorePackage.getEBoolean(),
				"checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "cr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__CheckDEC_BWD__XBTNode_XBTNode_XBTNode(), ecorePackage.getEBoolean(),
				"checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcsw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xcse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xnParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getrightleft2eastwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_XBTNode_BTNode_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getrightleft2eastwest__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(right2southeastEClass, right2southeast.class, "right2southeast", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getright2southeast__IsAppropriate_FWD__Match_BTNode_BTNode(), ecorePackage.getEBoolean(),
				"isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getright2southeast__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_BTNode_BTNode2XBTnode_XBTNode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getright2southeast__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "l2se", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(), "checkTypes_FWD",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_BWD__Match_XBTNode_XBTNode(), ecorePackage.getEBoolean(),
				"isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getright2southeast__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode_BTNode2XBTnode_XBTNode_XBTNode(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getright2southeast__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "l2se", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(), "checkTypes_BWD",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_BWD_EMoflonEdge_114__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_EMoflonEdge_114", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_se", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsAppropriate_FWD_EMoflonEdge_122__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_EMoflonEdge_122", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_solveCsp_CC__BTNode_BTNode_XBTNode_XBTNode_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__CheckDEC_FWD__BTNode_BTNode(), ecorePackage.getEBoolean(),
				"checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__CheckDEC_BWD__XBTNode_XBTNode(), ecorePackage.getEBoolean(),
				"checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__GenerateModel__RuleEntryContainer_BTNode2XBTnode(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xnParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getright2southeast__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode_BTNode2XBTnode_XBTNode_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtreePackage.getBTNode(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBtree2xbtreePackage.getBTNode2XBTnode(), "n2xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXbtreePackage.getXBTNode(), "xn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getright2southeast__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //RulesPackageImpl
