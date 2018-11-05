/**
 */
package org.wbsilva.bx.class2database.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.wbsilva.bx.class2database.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.class2database/model/Class2database.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.Rules.impl.attribute2columnImpl <em>attribute2column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.Rules.impl.attribute2columnImpl
	 * @see org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl#getattribute2column()
	 * @generated
	 */
	int ATTRIBUTE2COLUMN = 0;

	/**
	 * The number of structural features of the '<em>attribute2column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_FWD__MATCH_ATTRIBUTE_CLAZZ = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ATTRIBUTE_CLAZZ = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ATTRIBUTE_CLAZZ = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABLE_C2T_ATTRIBUTE_CLAZZ = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_BWD__MATCH_COLUMN_TABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COLUMN_TABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COLUMN_TABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COLUMN_TABLE_C2T_CLAZZ = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__COLUMN_TABLE_ATTRIBUTE_CLAZZ_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___CHECK_DEC_FWD__ATTRIBUTE_CLAZZ = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___CHECK_DEC_BWD__COLUMN_TABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_C2T_CLAZZ_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>attribute2column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2COLUMN_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.Rules.impl.cd2dbImpl <em>cd2db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.Rules.impl.cd2dbImpl
	 * @see org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl#getcd2db()
	 * @generated
	 */
	int CD2DB = 1;

	/**
	 * The number of structural features of the '<em>cd2db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_FWD__MATCH_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_BWD__MATCH_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD DB 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_BWD_DB_0__DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Class Diagram 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPROPRIATE_FWD_CLASS_DIAGRAM_0__CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDIAGRAM_DB_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___CHECK_DEC_FWD__CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___CHECK_DEC_BWD__DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>cd2db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD2DB_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.Rules.impl.super2tableImpl <em>super2table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.Rules.impl.super2tableImpl
	 * @see org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl#getsuper2table()
	 * @generated
	 */
	int SUPER2TABLE = 2;

	/**
	 * The number of structural features of the '<em>super2table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_FWD__MATCH_CLAZZ_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABLE_C2T_CLAZZ_CLAZZ_CLASSDIAGRAM_CD2D_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Table 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_BWD_TABLE_0__TABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_CLAZZ_CLAZZ_CLASSDIAGRAM_DB_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___CHECK_DEC_FWD__CLAZZ_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___CHECK_DEC_BWD__TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___GENERATE_MODEL__RULEENTRYCONTAINER_C2T = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_C2T_CLAZZ_CLASSDIAGRAM_CD2D_DB_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>super2table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER2TABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.Rules.impl.selfassoc2columnImpl <em>selfassoc2column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.Rules.impl.selfassoc2columnImpl
	 * @see org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl#getselfassoc2column()
	 * @generated
	 */
	int SELFASSOC2COLUMN = 3;

	/**
	 * The number of structural features of the '<em>selfassoc2column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_FWD__MATCH_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABLE_CLAZZ_C2T_ASSOCIATION_CD2D_DB_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_BWD__MATCH_TABLE_COLUMN_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_COLUMN_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_COLUMN_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_CLAZZ_C2T_CD2D_COLUMN_DB_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_CLAZZ_ASSOCIATION_COLUMN_DB_CLASSDIAGRAM_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___CHECK_DEC_FWD__CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___CHECK_DEC_BWD__TABLE_COLUMN_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_CLAZZ_C2T_CD2D_DB_CLASSDIAGRAM_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>selfassoc2column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFASSOC2COLUMN_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.Rules.impl.association2columnImpl <em>association2column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.Rules.impl.association2columnImpl
	 * @see org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl#getassociation2column()
	 * @generated
	 */
	int ASSOCIATION2COLUMN = 4;

	/**
	 * The number of structural features of the '<em>association2column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_FWD__MATCH_CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_C2T_C2T_TABLE_DB_CLAZZ_TABLE_CLAZZ_ASSOCIATION_CLASSDIAGRAM_CD2D = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_BWD__MATCH_TABLE_DB_TABLE_COLUMN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_DB_TABLE_COLUMN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_DB_TABLE_COLUMN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_C2T_C2T_TABLE_DB_CLAZZ_TABLE_CLAZZ_COLUMN_CLASSDIAGRAM_CD2D = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_DB_CLAZZ_TABLE_CLAZZ_COLUMN_ASSOCIATION_CLASSDIAGRAM_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___CHECK_DEC_FWD__CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___CHECK_DEC_BWD__TABLE_DB_TABLE_COLUMN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_C2T_C2T_TABLE_DB_CLAZZ_TABLE_CLAZZ_CLASSDIAGRAM_CD2D_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>association2column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION2COLUMN_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.class2database.Rules.impl.class2tableImpl <em>class2table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.class2database.Rules.impl.class2tableImpl
	 * @see org.wbsilva.bx.class2database.Rules.impl.RulesPackageImpl#getclass2table()
	 * @generated
	 */
	int CLASS2TABLE = 5;

	/**
	 * The number of structural features of the '<em>class2table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_FWD__MATCH_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLAZZ_CLASSDIAGRAM_DB_CD2D = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_TABLE_DB_CD2D = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_SOLVE_CSP_CC__CLAZZ_CLASSDIAGRAM_TABLE_DB_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___CHECK_DEC_FWD__CLAZZ_CLASSDIAGRAM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___CHECK_DEC_BWD__TABLE_DB = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___GENERATE_MODEL__RULEENTRYCONTAINER_CD2D = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_DB_CD2D_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>class2table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2TABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.Rules.attribute2column <em>attribute2column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attribute2column</em>'.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column
	 * @generated
	 */
	EClass getattribute2column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Attribute, class_.Clazz) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Attribute, class_.Clazz)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_FWD__Match_Attribute_Clazz();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getattribute2column__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Attribute, class_.Clazz) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Attribute, class_.Clazz)
	 * @generated
	 */
	EOperation getattribute2column__RegisterObjectsToMatch_FWD__Match_Attribute_Clazz();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Attribute, class_.Clazz) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Attribute, class_.Clazz)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_solveCsp_FWD__Match_Attribute_Clazz();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Attribute, class_.Clazz) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Attribute, class_.Clazz)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_solveCsp_FWD__IsApplicableMatch_Table_C2T_Attribute_Clazz();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getattribute2column__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getattribute2column__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Column, database.Table) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Column, database.Table)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_BWD__Match_Column_Table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getattribute2column__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Column, database.Table) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Column, database.Table)
	 * @generated
	 */
	EOperation getattribute2column__RegisterObjectsToMatch_BWD__Match_Column_Table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Column, database.Table) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Column, database.Table)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_solveCsp_BWD__Match_Column_Table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Column, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Column, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_solveCsp_BWD__IsApplicableMatch_Column_Table_C2T_Clazz();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getattribute2column__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getattribute2column__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_BWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_BWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getattribute2column__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getattribute2column__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getattribute2column__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_solveCsp_CC(database.Column, database.Table, class_.Attribute, class_.Clazz, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_solveCsp_CC(database.Column, database.Table, class_.Attribute, class_.Clazz, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_solveCsp_CC__Column_Table_Attribute_Clazz_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getattribute2column__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#checkDEC_FWD(class_.Attribute, class_.Clazz) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#checkDEC_FWD(class_.Attribute, class_.Clazz)
	 * @generated
	 */
	EOperation getattribute2column__CheckDEC_FWD__Attribute_Clazz();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#checkDEC_BWD(database.Column, database.Table) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#checkDEC_BWD(database.Column, database.Table)
	 * @generated
	 */
	EOperation getattribute2column__CheckDEC_BWD__Column_Table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T)
	 * @generated
	 */
	EOperation getattribute2column__GenerateModel__RuleEntryContainer_C2T();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getattribute2column__GenerateModel_solveCsp_BWD__IsApplicableMatch_Table_C2T_Clazz_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.attribute2column#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.attribute2column#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getattribute2column__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.Rules.cd2db <em>cd2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cd2db</em>'.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db
	 * @generated
	 */
	EClass getcd2db();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.ClassDiagram) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_FWD__Match_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcd2db__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.ClassDiagram) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getcd2db__RegisterObjectsToMatch_FWD__Match_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.ClassDiagram) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_solveCsp_FWD__Match_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.ClassDiagram) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcd2db__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcd2db__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.DB) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.DB)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_BWD__Match_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcd2db__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.DB) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.DB)
	 * @generated
	 */
	EOperation getcd2db__RegisterObjectsToMatch_BWD__Match_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.DB) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.DB)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_solveCsp_BWD__Match_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.DB) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.DB)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_solveCsp_BWD__IsApplicableMatch_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcd2db__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcd2db__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_BWD_DB_0(database.DB) <em>Is Appropriate BWD DB 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD DB 0</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_BWD_DB_0(database.DB)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_BWD_DB_0__DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_FWD_ClassDiagram_0(class_.ClassDiagram) <em>Is Appropriate FWD Class Diagram 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Class Diagram 0</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isAppropriate_FWD_ClassDiagram_0(class_.ClassDiagram)
	 * @generated
	 */
	EOperation getcd2db__IsAppropriate_FWD_ClassDiagram_0__ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcd2db__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcd2db__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_solveCsp_CC(class_.ClassDiagram, database.DB, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_solveCsp_CC(class_.ClassDiagram, database.DB, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_solveCsp_CC__ClassDiagram_DB_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcd2db__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#checkDEC_FWD(class_.ClassDiagram) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#checkDEC_FWD(class_.ClassDiagram)
	 * @generated
	 */
	EOperation getcd2db__CheckDEC_FWD__ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#checkDEC_BWD(database.DB) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#checkDEC_BWD(database.DB)
	 * @generated
	 */
	EOperation getcd2db__CheckDEC_BWD__DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getcd2db__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getcd2db__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.cd2db#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.cd2db#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcd2db__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.Rules.super2table <em>super2table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>super2table</em>'.
	 * @see org.wbsilva.bx.class2database.Rules.super2table
	 * @generated
	 */
	EClass getsuper2table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.ClassDiagram) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_FWD__Match_Clazz_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getsuper2table__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.ClassDiagram) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getsuper2table__RegisterObjectsToMatch_FWD__Match_Clazz_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.ClassDiagram) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_solveCsp_FWD__Match_Clazz_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz, class_.Clazz, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D, database.DB) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz, class_.Clazz, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D, database.DB)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_solveCsp_FWD__IsApplicableMatch_Table_C2T_Clazz_Clazz_ClassDiagram_CD2D_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getsuper2table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getsuper2table__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_BWD__Match_Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getsuper2table__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB)
	 * @generated
	 */
	EOperation getsuper2table__RegisterObjectsToMatch_BWD__Match_Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_solveCsp_BWD__Match_Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getsuper2table__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_BWD_Table_0(database.Table) <em>Is Appropriate BWD Table 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Table 0</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_BWD_Table_0(database.Table)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_BWD_Table_0__Table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_FWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isAppropriate_FWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getsuper2table__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getsuper2table__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getsuper2table__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_solveCsp_CC(database.Table, class_.Clazz, class_.Clazz, class_.ClassDiagram, database.DB, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_solveCsp_CC(database.Table, class_.Clazz, class_.Clazz, class_.ClassDiagram, database.DB, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_solveCsp_CC__Table_Clazz_Clazz_ClassDiagram_DB_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getsuper2table__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#checkDEC_FWD(class_.Clazz, class_.Clazz, class_.ClassDiagram) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#checkDEC_FWD(class_.Clazz, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getsuper2table__CheckDEC_FWD__Clazz_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#checkDEC_BWD(database.Table, database.DB) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#checkDEC_BWD(database.Table, database.DB)
	 * @generated
	 */
	EOperation getsuper2table__CheckDEC_BWD__Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T)
	 * @generated
	 */
	EOperation getsuper2table__GenerateModel__RuleEntryContainer_C2T();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D, database.DB, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, org.wbsilva.bx.class2database.C2T, class_.Clazz, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D, database.DB, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getsuper2table__GenerateModel_solveCsp_BWD__IsApplicableMatch_Table_C2T_Clazz_ClassDiagram_CD2D_DB_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.super2table#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.super2table#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getsuper2table__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column <em>selfassoc2column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>selfassoc2column</em>'.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column
	 * @generated
	 */
	EClass getselfassoc2column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_FWD__Match_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getselfassoc2column__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getselfassoc2column__RegisterObjectsToMatch_FWD__Match_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_solveCsp_FWD__Match_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, class_.Clazz, org.wbsilva.bx.class2database.C2T, class_.Association, org.wbsilva.bx.class2database.CD2D, database.DB, class_.ClassDiagram) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, class_.Clazz, org.wbsilva.bx.class2database.C2T, class_.Association, org.wbsilva.bx.class2database.CD2D, database.DB, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_solveCsp_FWD__IsApplicableMatch_Table_Clazz_C2T_Association_CD2D_DB_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getselfassoc2column__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselfassoc2column__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.Column, database.DB) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.Column, database.DB)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_BWD__Match_Table_Column_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getselfassoc2column__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.Column, database.DB) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.Column, database.DB)
	 * @generated
	 */
	EOperation getselfassoc2column__RegisterObjectsToMatch_BWD__Match_Table_Column_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.Column, database.DB) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.Column, database.DB)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_solveCsp_BWD__Match_Table_Column_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, class_.Clazz, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.CD2D, database.Column, database.DB, class_.ClassDiagram) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, class_.Clazz, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.CD2D, database.Column, database.DB, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_solveCsp_BWD__IsApplicableMatch_Table_Clazz_C2T_CD2D_Column_DB_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getselfassoc2column__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselfassoc2column__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_BWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_BWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_FWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isAppropriate_FWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getselfassoc2column__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getselfassoc2column__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getselfassoc2column__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_solveCsp_CC(database.Table, class_.Clazz, class_.Association, database.Column, database.DB, class_.ClassDiagram, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_solveCsp_CC(database.Table, class_.Clazz, class_.Association, database.Column, database.DB, class_.ClassDiagram, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_solveCsp_CC__Table_Clazz_Association_Column_DB_ClassDiagram_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselfassoc2column__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#checkDEC_FWD(class_.Clazz, class_.Association, class_.ClassDiagram) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#checkDEC_FWD(class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getselfassoc2column__CheckDEC_FWD__Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#checkDEC_BWD(database.Table, database.Column, database.DB) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#checkDEC_BWD(database.Table, database.Column, database.DB)
	 * @generated
	 */
	EOperation getselfassoc2column__CheckDEC_BWD__Table_Column_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T)
	 * @generated
	 */
	EOperation getselfassoc2column__GenerateModel__RuleEntryContainer_C2T();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, class_.Clazz, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.CD2D, database.DB, class_.ClassDiagram, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, database.Table, class_.Clazz, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.CD2D, database.DB, class_.ClassDiagram, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getselfassoc2column__GenerateModel_solveCsp_BWD__IsApplicableMatch_Table_Clazz_C2T_CD2D_DB_ClassDiagram_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.selfassoc2column#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.selfassoc2column#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselfassoc2column__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.Rules.association2column <em>association2column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>association2column</em>'.
	 * @see org.wbsilva.bx.class2database.Rules.association2column
	 * @generated
	 */
	EClass getassociation2column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_FWD__Match_Clazz_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getassociation2column__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getassociation2column__RegisterObjectsToMatch_FWD__Match_Clazz_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_solveCsp_FWD__Match_Clazz_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.C2T, database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, class_.Association, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.C2T, database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, class_.Association, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_solveCsp_FWD__IsApplicableMatch_C2T_C2T_Table_DB_Clazz_Table_Clazz_Association_ClassDiagram_CD2D();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getassociation2column__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getassociation2column__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB, database.Table, database.Column) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB, database.Table, database.Column)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_BWD__Match_Table_DB_Table_Column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getassociation2column__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB, database.Table, database.Column) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB, database.Table, database.Column)
	 * @generated
	 */
	EOperation getassociation2column__RegisterObjectsToMatch_BWD__Match_Table_DB_Table_Column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB, database.Table, database.Column) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB, database.Table, database.Column)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_solveCsp_BWD__Match_Table_DB_Table_Column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.C2T, database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, database.Column, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.C2T, database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, database.Column, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_solveCsp_BWD__IsApplicableMatch_C2T_C2T_Table_DB_Clazz_Table_Clazz_Column_ClassDiagram_CD2D();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getassociation2column__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getassociation2column__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_BWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_BWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_FWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isAppropriate_FWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getassociation2column__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getassociation2column__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getassociation2column__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_solveCsp_CC(database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, database.Column, class_.Association, class_.ClassDiagram, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_solveCsp_CC(database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, database.Column, class_.Association, class_.ClassDiagram, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_solveCsp_CC__Table_DB_Clazz_Table_Clazz_Column_Association_ClassDiagram_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getassociation2column__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#checkDEC_FWD(class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#checkDEC_FWD(class_.Clazz, class_.Clazz, class_.Association, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getassociation2column__CheckDEC_FWD__Clazz_Clazz_Association_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#checkDEC_BWD(database.Table, database.DB, database.Table, database.Column) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#checkDEC_BWD(database.Table, database.DB, database.Table, database.Column)
	 * @generated
	 */
	EOperation getassociation2column__CheckDEC_BWD__Table_DB_Table_Column();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.C2T)
	 * @generated
	 */
	EOperation getassociation2column__GenerateModel__RuleEntryContainer_C2T();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.C2T, database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.class2database.C2T, org.wbsilva.bx.class2database.C2T, database.Table, database.DB, class_.Clazz, database.Table, class_.Clazz, class_.ClassDiagram, org.wbsilva.bx.class2database.CD2D, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getassociation2column__GenerateModel_solveCsp_BWD__IsApplicableMatch_C2T_C2T_Table_DB_Clazz_Table_Clazz_ClassDiagram_CD2D_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.association2column#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.association2column#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getassociation2column__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.class2database.Rules.class2table <em>class2table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>class2table</em>'.
	 * @see org.wbsilva.bx.class2database.Rules.class2table
	 * @generated
	 */
	EClass getclass2table();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.ClassDiagram) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_FWD__Match_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getclass2table__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.ClassDiagram) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getclass2table__RegisterObjectsToMatch_FWD__Match_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.ClassDiagram) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_solveCsp_FWD__Match_Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.Clazz, class_.ClassDiagram, database.DB, org.wbsilva.bx.class2database.CD2D) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.Clazz, class_.ClassDiagram, database.DB, org.wbsilva.bx.class2database.CD2D)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_solveCsp_FWD__IsApplicableMatch_Clazz_ClassDiagram_DB_CD2D();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getclass2table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getclass2table__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_BWD__Match_Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getclass2table__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB)
	 * @generated
	 */
	EOperation getclass2table__RegisterObjectsToMatch_BWD__Match_Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, database.Table, database.DB)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_solveCsp_BWD__Match_Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.ClassDiagram, database.Table, database.DB, org.wbsilva.bx.class2database.CD2D) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.ClassDiagram, database.Table, database.DB, org.wbsilva.bx.class2database.CD2D)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDiagram_Table_DB_CD2D();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getclass2table__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getclass2table__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_BWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_BWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_FWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isAppropriate_FWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getclass2table__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getclass2table__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getclass2table__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_solveCsp_CC(class_.Clazz, class_.ClassDiagram, database.Table, database.DB, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_solveCsp_CC(class_.Clazz, class_.ClassDiagram, database.Table, database.DB, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_solveCsp_CC__Clazz_ClassDiagram_Table_DB_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getclass2table__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#checkDEC_FWD(class_.Clazz, class_.ClassDiagram) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#checkDEC_FWD(class_.Clazz, class_.ClassDiagram)
	 * @generated
	 */
	EOperation getclass2table__CheckDEC_FWD__Clazz_ClassDiagram();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#checkDEC_BWD(database.Table, database.DB) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#checkDEC_BWD(database.Table, database.DB)
	 * @generated
	 */
	EOperation getclass2table__CheckDEC_BWD__Table_DB();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.CD2D) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.class2database.CD2D)
	 * @generated
	 */
	EOperation getclass2table__GenerateModel__RuleEntryContainer_CD2D();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.ClassDiagram, database.DB, org.wbsilva.bx.class2database.CD2D, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, class_.ClassDiagram, database.DB, org.wbsilva.bx.class2database.CD2D, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getclass2table__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDiagram_DB_CD2D_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.class2database.Rules.class2table#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.class2database.Rules.class2table#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getclass2table__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
