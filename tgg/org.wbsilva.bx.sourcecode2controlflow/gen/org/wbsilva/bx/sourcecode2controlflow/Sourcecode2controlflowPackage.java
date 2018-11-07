/**
 */
package org.wbsilva.bx.sourcecode2controlflow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.wbsilva.bx'"
 * @generated
 */
public interface Sourcecode2controlflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sourcecode2controlflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.sourcecode2controlflow/model/Sourcecode2controlflow.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.wbsilva.bx.sourcecode2controlflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sourcecode2controlflowPackage eINSTANCE = org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.sourcecode2controlflow.impl.S2BImpl <em>S2B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.sourcecode2controlflow.impl.S2BImpl
	 * @see org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl#getS2B()
	 * @generated
	 */
	int S2B = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2B__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2B__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>S2B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2B_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>S2B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2B_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.sourcecode2controlflow.impl.P2GImpl <em>P2G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.sourcecode2controlflow.impl.P2GImpl
	 * @see org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl#getP2G()
	 * @generated
	 */
	int P2G = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2G__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2G__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>P2G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2G_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>P2G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2G_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.sourcecode2controlflow.impl.S2NImpl <em>S2N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.sourcecode2controlflow.impl.S2NImpl
	 * @see org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl#getS2N()
	 * @generated
	 */
	int S2N = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2N__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2N__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>S2N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2N_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>S2N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2N_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.sourcecode2controlflow.S2B <em>S2B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>S2B</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.S2B
	 * @generated
	 */
	EClass getS2B();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.sourcecode2controlflow.S2B#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.S2B#getSource()
	 * @see #getS2B()
	 * @generated
	 */
	EReference getS2B_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.sourcecode2controlflow.S2B#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.S2B#getTarget()
	 * @see #getS2B()
	 * @generated
	 */
	EReference getS2B_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.sourcecode2controlflow.P2G <em>P2G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P2G</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.P2G
	 * @generated
	 */
	EClass getP2G();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.sourcecode2controlflow.P2G#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.P2G#getSource()
	 * @see #getP2G()
	 * @generated
	 */
	EReference getP2G_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.sourcecode2controlflow.P2G#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.P2G#getTarget()
	 * @see #getP2G()
	 * @generated
	 */
	EReference getP2G_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.sourcecode2controlflow.S2N <em>S2N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>S2N</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.S2N
	 * @generated
	 */
	EClass getS2N();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.sourcecode2controlflow.S2N#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.S2N#getSource()
	 * @see #getS2N()
	 * @generated
	 */
	EReference getS2N_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.sourcecode2controlflow.S2N#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.sourcecode2controlflow.S2N#getTarget()
	 * @see #getS2N()
	 * @generated
	 */
	EReference getS2N_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sourcecode2controlflowFactory getSourcecode2controlflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.sourcecode2controlflow.impl.S2BImpl <em>S2B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.sourcecode2controlflow.impl.S2BImpl
		 * @see org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl#getS2B()
		 * @generated
		 */
		EClass S2B = eINSTANCE.getS2B();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference S2B__SOURCE = eINSTANCE.getS2B_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference S2B__TARGET = eINSTANCE.getS2B_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.sourcecode2controlflow.impl.P2GImpl <em>P2G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.sourcecode2controlflow.impl.P2GImpl
		 * @see org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl#getP2G()
		 * @generated
		 */
		EClass P2G = eINSTANCE.getP2G();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P2G__SOURCE = eINSTANCE.getP2G_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P2G__TARGET = eINSTANCE.getP2G_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.sourcecode2controlflow.impl.S2NImpl <em>S2N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.sourcecode2controlflow.impl.S2NImpl
		 * @see org.wbsilva.bx.sourcecode2controlflow.impl.Sourcecode2controlflowPackageImpl#getS2N()
		 * @generated
		 */
		EClass S2N = eINSTANCE.getS2N();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference S2N__SOURCE = eINSTANCE.getS2N_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference S2N__TARGET = eINSTANCE.getS2N_Target();

	}

} //Sourcecode2controlflowPackage
