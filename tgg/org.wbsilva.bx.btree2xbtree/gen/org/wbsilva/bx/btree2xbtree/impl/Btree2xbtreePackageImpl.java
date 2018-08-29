/**
 */
package org.wbsilva.bx.btree2xbtree.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import btree.BtreePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

import org.wbsilva.bx.btree2xbtree.BTNode2XBTnode;
import org.wbsilva.bx.btree2xbtree.Btree2xbtreeFactory;
import org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage;

import org.wbsilva.bx.btree2xbtree.Rules.RulesPackage;

import org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl;

import xbtree.XbtreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Btree2xbtreePackageImpl extends EPackageImpl implements Btree2xbtreePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btNode2XBTnodeEClass = null;

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
	 * @see org.wbsilva.bx.btree2xbtree.Btree2xbtreePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Btree2xbtreePackageImpl() {
		super(eNS_URI, Btree2xbtreeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Btree2xbtreePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Btree2xbtreePackage init() {
		if (isInited)
			return (Btree2xbtreePackage) EPackage.Registry.INSTANCE.getEPackage(Btree2xbtreePackage.eNS_URI);

		// Obtain or create and register package
		Btree2xbtreePackageImpl theBtree2xbtreePackage = (Btree2xbtreePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Btree2xbtreePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Btree2xbtreePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		BtreePackage.eINSTANCE.eClass();
		XbtreePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Create package meta-data objects
		theBtree2xbtreePackage.createPackageContents();
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theBtree2xbtreePackage.initializePackageContents();
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtree2xbtreePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Btree2xbtreePackage.eNS_URI, theBtree2xbtreePackage);
		return theBtree2xbtreePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTNode2XBTnode() {
		return btNode2XBTnodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTNode2XBTnode_Source() {
		return (EReference) btNode2XBTnodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTNode2XBTnode_Target() {
		return (EReference) btNode2XBTnodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Btree2xbtreeFactory getBtree2xbtreeFactory() {
		return (Btree2xbtreeFactory) getEFactoryInstance();
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
		btNode2XBTnodeEClass = createEClass(BT_NODE2_XB_TNODE);
		createEReference(btNode2XBTnodeEClass, BT_NODE2_XB_TNODE__SOURCE);
		createEReference(btNode2XBTnodeEClass, BT_NODE2_XB_TNODE__TARGET);
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
		RulesPackage theRulesPackage = (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);
		BtreePackage theBtreePackage = (BtreePackage) EPackage.Registry.INSTANCE.getEPackage(BtreePackage.eNS_URI);
		XbtreePackage theXbtreePackage = (XbtreePackage) EPackage.Registry.INSTANCE.getEPackage(XbtreePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRulesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		btNode2XBTnodeEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(btNode2XBTnodeEClass, BTNode2XBTnode.class, "BTNode2XBTnode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTNode2XBTnode_Source(), theBtreePackage.getBTNode(), null, "source", null, 1, 1,
				BTNode2XBTnode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTNode2XBTnode_Target(), theXbtreePackage.getXBTNode(), null, "target", null, 1, 1,
				BTNode2XBTnode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Btree2xbtreePackageImpl
