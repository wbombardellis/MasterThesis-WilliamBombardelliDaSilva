/**
 */
package org.wbsilva.bx.statemachine2petrinet.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

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

import org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage;

import org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl;

import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetFactory;
import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage;

import petrinet.PetrinetPackage;

import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Statemachine2petrinetPackageImpl extends EPackageImpl implements Statemachine2petrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "statemachine2petrinet.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2TEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2AEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s2PEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sm2PNEClass = null;

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
	 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Statemachine2petrinetPackageImpl() {
		super(eNS_URI, Statemachine2petrinetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Statemachine2petrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Statemachine2petrinetPackage init() {
		if (isInited)
			return (Statemachine2petrinetPackage) EPackage.Registry.INSTANCE
					.getEPackage(Statemachine2petrinetPackage.eNS_URI);

		// Obtain or create and register package
		Statemachine2petrinetPackageImpl theStatemachine2petrinetPackage = (Statemachine2petrinetPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Statemachine2petrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Statemachine2petrinetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		StatemachinePackage.eINSTANCE.eClass();
		PetrinetPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Load packages
		theStatemachine2petrinetPackage.loadPackage();

		// Fix loaded packages
		theStatemachine2petrinetPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachine2petrinetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Statemachine2petrinetPackage.eNS_URI, theStatemachine2petrinetPackage);
		return theStatemachine2petrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2T() {
		if (t2TEClass == null) {
			t2TEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Statemachine2petrinetPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return t2TEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT2T_Source() {
		return (EReference) getT2T().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT2T_Target() {
		return (EReference) getT2T().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2A() {
		if (t2AEClass == null) {
			t2AEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Statemachine2petrinetPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return t2AEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT2A_Source() {
		return (EReference) getT2A().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT2A_Target() {
		return (EReference) getT2A().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS2P() {
		if (s2PEClass == null) {
			s2PEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Statemachine2petrinetPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return s2PEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS2P_Source() {
		return (EReference) getS2P().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getS2P_Target() {
		return (EReference) getS2P().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSM2PN() {
		if (sm2PNEClass == null) {
			sm2PNEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Statemachine2petrinetPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return sm2PNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSM2PN_Source() {
		return (EReference) getSM2PN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSM2PN_Target() {
		return (EReference) getSM2PN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statemachine2petrinetFactory getStatemachine2petrinetFactory() {
		return (Statemachine2petrinetFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.wbsilva.bx.statemachine2petrinet." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Statemachine2petrinetPackageImpl
