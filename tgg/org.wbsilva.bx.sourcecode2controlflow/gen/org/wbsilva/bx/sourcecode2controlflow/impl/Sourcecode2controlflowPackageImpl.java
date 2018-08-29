/**
 */
package org.wbsilva.bx.sourcecode2controlflow.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import controlflow.ControlflowPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;

import org.wbsilva.bx.sourcecode2controlflow.Rules.impl.RulesPackageImpl;

import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage;

import sourcecode.SourcecodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sourcecode2controlflowPackageImpl extends EPackageImpl implements Sourcecode2controlflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "sourcecode2controlflow.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s2NEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s2BEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2GEClass = null;

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
	 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sourcecode2controlflowPackageImpl() {
		super(eNS_URI, Sourcecode2controlflowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sourcecode2controlflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Sourcecode2controlflowPackage init() {
		if (isInited)
			return (Sourcecode2controlflowPackage) EPackage.Registry.INSTANCE
					.getEPackage(Sourcecode2controlflowPackage.eNS_URI);

		// Obtain or create and register package
		Sourcecode2controlflowPackageImpl theSourcecode2controlflowPackage = (Sourcecode2controlflowPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Sourcecode2controlflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Sourcecode2controlflowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		SourcecodePackage.eINSTANCE.eClass();
		ControlflowPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Load packages
		theSourcecode2controlflowPackage.loadPackage();

		// Fix loaded packages
		theSourcecode2controlflowPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theSourcecode2controlflowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sourcecode2controlflowPackage.eNS_URI, theSourcecode2controlflowPackage);
		return theSourcecode2controlflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS2N() {
		if (s2NEClass == null) {
			s2NEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Sourcecode2controlflowPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return s2NEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS2N_Source() {
		return (EReference) getS2N().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS2N_Target() {
		return (EReference) getS2N().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS2B() {
		if (s2BEClass == null) {
			s2BEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Sourcecode2controlflowPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return s2BEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS2B_Source() {
		return (EReference) getS2B().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS2B_Target() {
		return (EReference) getS2B().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2G() {
		if (p2GEClass == null) {
			p2GEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Sourcecode2controlflowPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return p2GEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP2G_Source() {
		return (EReference) getP2G().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP2G_Target() {
		return (EReference) getP2G().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sourcecode2controlflowFactory getSourcecode2controlflowFactory() {
		return (Sourcecode2controlflowFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("org.wbsilva.bx.sourcecode2controlflow." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Sourcecode2controlflowPackageImpl
