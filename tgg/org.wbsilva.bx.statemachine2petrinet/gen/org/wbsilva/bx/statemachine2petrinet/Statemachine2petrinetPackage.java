/**
 */
package org.wbsilva.bx.statemachine2petrinet;

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
 * @see org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.wbsilva.bx'"
 * @generated
 */
public interface Statemachine2petrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statemachine2petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.statemachine2petrinet/model/Statemachine2petrinet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.wbsilva.bx.statemachine2petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Statemachine2petrinetPackage eINSTANCE = org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.T2AImpl <em>T2A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.T2AImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getT2A()
	 * @generated
	 */
	int T2A = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2A__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2A__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>T2A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2A_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>T2A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2A_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.S2PImpl <em>S2P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.S2PImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getS2P()
	 * @generated
	 */
	int S2P = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2P__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2P__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>S2P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2P_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>S2P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S2P_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.SM2PNImpl <em>SM2PN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.SM2PNImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getSM2PN()
	 * @generated
	 */
	int SM2PN = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2PN__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2PN__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SM2PN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2PN_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SM2PN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2PN_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.T2TImpl <em>T2T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.T2TImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getT2T()
	 * @generated
	 */
	int T2T = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2T__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2T__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>T2T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2T_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>T2T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2T_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.T2A <em>T2A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2A</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2A
	 * @generated
	 */
	EClass getT2A();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.T2A#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2A#getSource()
	 * @see #getT2A()
	 * @generated
	 */
	EReference getT2A_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.T2A#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2A#getTarget()
	 * @see #getT2A()
	 * @generated
	 */
	EReference getT2A_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.S2P <em>S2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>S2P</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.S2P
	 * @generated
	 */
	EClass getS2P();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.S2P#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.S2P#getSource()
	 * @see #getS2P()
	 * @generated
	 */
	EReference getS2P_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.S2P#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.S2P#getTarget()
	 * @see #getS2P()
	 * @generated
	 */
	EReference getS2P_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.SM2PN <em>SM2PN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM2PN</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.SM2PN
	 * @generated
	 */
	EClass getSM2PN();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.SM2PN#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.SM2PN#getSource()
	 * @see #getSM2PN()
	 * @generated
	 */
	EReference getSM2PN_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.SM2PN#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.SM2PN#getTarget()
	 * @see #getSM2PN()
	 * @generated
	 */
	EReference getSM2PN_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.T2T <em>T2T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2T</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2T
	 * @generated
	 */
	EClass getT2T();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.T2T#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2T#getSource()
	 * @see #getT2T()
	 * @generated
	 */
	EReference getT2T_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.statemachine2petrinet.T2T#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.T2T#getTarget()
	 * @see #getT2T()
	 * @generated
	 */
	EReference getT2T_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Statemachine2petrinetFactory getStatemachine2petrinetFactory();

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
		 * The meta object literal for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.T2AImpl <em>T2A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.T2AImpl
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getT2A()
		 * @generated
		 */
		EClass T2A = eINSTANCE.getT2A();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T2A__SOURCE = eINSTANCE.getT2A_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T2A__TARGET = eINSTANCE.getT2A_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.S2PImpl <em>S2P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.S2PImpl
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getS2P()
		 * @generated
		 */
		EClass S2P = eINSTANCE.getS2P();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference S2P__SOURCE = eINSTANCE.getS2P_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference S2P__TARGET = eINSTANCE.getS2P_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.SM2PNImpl <em>SM2PN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.SM2PNImpl
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getSM2PN()
		 * @generated
		 */
		EClass SM2PN = eINSTANCE.getSM2PN();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM2PN__SOURCE = eINSTANCE.getSM2PN_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM2PN__TARGET = eINSTANCE.getSM2PN_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.statemachine2petrinet.impl.T2TImpl <em>T2T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.T2TImpl
		 * @see org.wbsilva.bx.statemachine2petrinet.impl.Statemachine2petrinetPackageImpl#getT2T()
		 * @generated
		 */
		EClass T2T = eINSTANCE.getT2T();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T2T__SOURCE = eINSTANCE.getT2T_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference T2T__TARGET = eINSTANCE.getT2T_Target();

	}

} //Statemachine2petrinetPackage
