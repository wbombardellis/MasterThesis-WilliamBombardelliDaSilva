/**
 */
package org.wbsilva.bx.class2database;

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
 * @see org.wbsilva.bx.class2database.Class2databaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.wbsilva.bx'"
 * @generated
 */
public interface Class2databasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "class2database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.class2database/model/Class2database.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.wbsilva.bx.class2database";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Class2databasePackage eINSTANCE = org.wbsilva.bx.class2database.impl.Class2databasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.impl.CD2DImpl <em>CD2D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.impl.CD2DImpl
	 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getCD2D()
	 * @generated
	 */
	int CD2D = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2D__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2D__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CD2D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2D_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CD2D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2D_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.impl.AS2CImpl <em>AS2C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.impl.AS2CImpl
	 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getAS2C()
	 * @generated
	 */
	int AS2C = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS2C__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS2C__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AS2C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS2C_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AS2C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS2C_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.impl.A2CImpl <em>A2C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.impl.A2CImpl
	 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getA2C()
	 * @generated
	 */
	int A2C = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2C__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2C__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>A2C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2C_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>A2C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2C_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.impl.C2TImpl <em>C2T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.impl.C2TImpl
	 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getC2T()
	 * @generated
	 */
	int C2T = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2T__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2T__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>C2T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2T_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>C2T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2T_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.CD2D <em>CD2D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD2D</em>'.
	 * @see org.wbsilva.bx.class2database.CD2D
	 * @generated
	 */
	EClass getCD2D();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.CD2D#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.class2database.CD2D#getSource()
	 * @see #getCD2D()
	 * @generated
	 */
	EReference getCD2D_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.CD2D#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.class2database.CD2D#getTarget()
	 * @see #getCD2D()
	 * @generated
	 */
	EReference getCD2D_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.AS2C <em>AS2C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AS2C</em>'.
	 * @see org.wbsilva.bx.class2database.AS2C
	 * @generated
	 */
	EClass getAS2C();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.AS2C#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.class2database.AS2C#getSource()
	 * @see #getAS2C()
	 * @generated
	 */
	EReference getAS2C_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.AS2C#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.class2database.AS2C#getTarget()
	 * @see #getAS2C()
	 * @generated
	 */
	EReference getAS2C_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.A2C <em>A2C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A2C</em>'.
	 * @see org.wbsilva.bx.class2database.A2C
	 * @generated
	 */
	EClass getA2C();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.A2C#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.class2database.A2C#getSource()
	 * @see #getA2C()
	 * @generated
	 */
	EReference getA2C_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.A2C#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.class2database.A2C#getTarget()
	 * @see #getA2C()
	 * @generated
	 */
	EReference getA2C_Target();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.C2T <em>C2T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2T</em>'.
	 * @see org.wbsilva.bx.class2database.C2T
	 * @generated
	 */
	EClass getC2T();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.C2T#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.wbsilva.bx.class2database.C2T#getSource()
	 * @see #getC2T()
	 * @generated
	 */
	EReference getC2T_Source();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bx.class2database.C2T#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.wbsilva.bx.class2database.C2T#getTarget()
	 * @see #getC2T()
	 * @generated
	 */
	EReference getC2T_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Class2databaseFactory getClass2databaseFactory();

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
		 * The meta object literal for the '{@link org.wbsilva.bx.class2database.impl.CD2DImpl <em>CD2D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.class2database.impl.CD2DImpl
		 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getCD2D()
		 * @generated
		 */
		EClass CD2D = eINSTANCE.getCD2D();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD2D__SOURCE = eINSTANCE.getCD2D_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD2D__TARGET = eINSTANCE.getCD2D_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.class2database.impl.AS2CImpl <em>AS2C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.class2database.impl.AS2CImpl
		 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getAS2C()
		 * @generated
		 */
		EClass AS2C = eINSTANCE.getAS2C();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS2C__SOURCE = eINSTANCE.getAS2C_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS2C__TARGET = eINSTANCE.getAS2C_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.class2database.impl.A2CImpl <em>A2C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.class2database.impl.A2CImpl
		 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getA2C()
		 * @generated
		 */
		EClass A2C = eINSTANCE.getA2C();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A2C__SOURCE = eINSTANCE.getA2C_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A2C__TARGET = eINSTANCE.getA2C_Target();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.class2database.impl.C2TImpl <em>C2T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.class2database.impl.C2TImpl
		 * @see org.wbsilva.bx.class2database.impl.Class2databasePackageImpl#getC2T()
		 * @generated
		 */
		EClass C2T = eINSTANCE.getC2T();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2T__SOURCE = eINSTANCE.getC2T_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C2T__TARGET = eINSTANCE.getC2T_Target();

	}

} //Class2databasePackage
