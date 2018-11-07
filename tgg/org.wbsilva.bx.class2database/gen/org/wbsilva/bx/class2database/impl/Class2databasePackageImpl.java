/**
 */
package org.wbsilva.bx.class2database.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import class_.ClassPackage;

import database.DatabasePackage;

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

import org.wbsilva.bx.class2database.Class2databaseFactory;
import org.wbsilva.bx.class2database.Class2databasePackage;

import org.wbsilva.bx.class2database.Rules.RulesPackage;

import org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Class2databasePackageImpl extends EPackageImpl implements Class2databasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "class2database.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cd2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as2CEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a2CEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c2TEClass = null;

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
	 * @see org.wbsilva.bx.class2database.Class2databasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Class2databasePackageImpl() {
		super(eNS_URI, Class2databaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Class2databasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Class2databasePackage init() {
		if (isInited)
			return (Class2databasePackage) EPackage.Registry.INSTANCE.getEPackage(Class2databasePackage.eNS_URI);

		// Obtain or create and register package
		Class2databasePackageImpl theClass2databasePackage = (Class2databasePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Class2databasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Class2databasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		ClassPackage.eINSTANCE.eClass();
		DatabasePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Load packages
		theClass2databasePackage.loadPackage();

		// Fix loaded packages
		theClass2databasePackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theClass2databasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Class2databasePackage.eNS_URI, theClass2databasePackage);
		return theClass2databasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCD2D() {
		if (cd2DEClass == null) {
			cd2DEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Class2databasePackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return cd2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD2D_Source() {
		return (EReference) getCD2D().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD2D_Target() {
		return (EReference) getCD2D().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAS2C() {
		if (as2CEClass == null) {
			as2CEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Class2databasePackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return as2CEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAS2C_Source() {
		return (EReference) getAS2C().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAS2C_Target() {
		return (EReference) getAS2C().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA2C() {
		if (a2CEClass == null) {
			a2CEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Class2databasePackage.eNS_URI).getEClassifiers()
					.get(2);
		}
		return a2CEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA2C_Source() {
		return (EReference) getA2C().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA2C_Target() {
		return (EReference) getA2C().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC2T() {
		if (c2TEClass == null) {
			c2TEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Class2databasePackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return c2TEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC2T_Source() {
		return (EReference) getC2T().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC2T_Target() {
		return (EReference) getC2T().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2databaseFactory getClass2databaseFactory() {
		return (Class2databaseFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.wbsilva.bx.class2database." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Class2databasePackageImpl
