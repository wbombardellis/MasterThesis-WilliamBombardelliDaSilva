/**
 */
package org.wbsilva.bx.btree2xbtree.Rules;

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
 * @see org.wbsilva.bx.btree2xbtree.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.btree2xbtree/model/Btree2xbtree.ecore#//Rules";

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
	RulesPackage eINSTANCE = org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.node2nodeImpl <em>node2node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.node2nodeImpl
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getnode2node()
	 * @generated
	 */
	int NODE2NODE = 0;

	/**
	 * The number of structural features of the '<em>node2node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_FWD__MATCH_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_BWD__MATCH_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD XBT Node 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_BWD_XBT_NODE_0__XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD BT Node 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPROPRIATE_FWD_BT_NODE_0__BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_BTNODE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___CHECK_DEC_FWD__BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___CHECK_DEC_BWD__XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>node2node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE2NODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.left2southwestImpl <em>left2southwest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.left2southwestImpl
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getleft2southwest()
	 * @generated
	 */
	int LEFT2SOUTHWEST = 1;

	/**
	 * The number of structural features of the '<em>left2southwest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 50</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_XBTNODE_BTNODE_XBTNODE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___CHECK_DEC_FWD__BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>left2southwest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT2SOUTHWEST_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.right2southeastImpl <em>right2southeast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.right2southeastImpl
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getright2southeast()
	 * @generated
	 */
	int RIGHT2SOUTHEAST = 2;

	/**
	 * The number of structural features of the '<em>right2southeast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_BTNODE2XBTNODE_BTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_BTNODE_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 51</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_BTNODE_XBTNODE_XBTNODE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___CHECK_DEC_FWD__BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___CHECK_DEC_BWD__XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_BTNODE_XBTNODE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>right2southeast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT2SOUTHEAST_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.rightleft2eastwestImpl <em>rightleft2eastwest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.rightleft2eastwestImpl
	 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getrightleft2eastwest()
	 * @generated
	 */
	int RIGHTLEFT2EASTWEST = 3;

	/**
	 * The number of structural features of the '<em>rightleft2eastwest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XBTNODE_BTNODE_BTNODE_BTNODE_BTNODE2XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE_XBTNODE_BTNODE_XBTNODE_BTNODE2XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 52</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_XBTNODE_BTNODE_XBTNODE_BTNODE_BTNODE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___CHECK_DEC_FWD__BTNODE_BTNODE_BTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE_XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE_BTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>rightleft2eastwest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTLEFT2EASTWEST_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node <em>node2node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>node2node</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node
	 * @generated
	 */
	EClass getnode2node();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_FWD__Match_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getnode2node__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode)
	 * @generated
	 */
	EOperation getnode2node__RegisterObjectsToMatch_FWD__Match_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_solveCsp_FWD__Match_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getnode2node__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getnode2node__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_BWD__Match_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getnode2node__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getnode2node__RegisterObjectsToMatch_BWD__Match_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_solveCsp_BWD__Match_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_solveCsp_BWD__IsApplicableMatch_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getnode2node__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getnode2node__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_BWD_XBTNode_0(xbtree.XBTNode) <em>Is Appropriate BWD XBT Node 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD XBT Node 0</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_BWD_XBTNode_0(xbtree.XBTNode)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_BWD_XBTNode_0__XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_FWD_BTNode_0(btree.BTNode) <em>Is Appropriate FWD BT Node 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD BT Node 0</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isAppropriate_FWD_BTNode_0(btree.BTNode)
	 * @generated
	 */
	EOperation getnode2node__IsAppropriate_FWD_BTNode_0__BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getnode2node__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getnode2node__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_solveCsp_CC(xbtree.XBTNode, btree.BTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_solveCsp_CC(xbtree.XBTNode, btree.BTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_solveCsp_CC__XBTNode_BTNode_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getnode2node__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#checkDEC_FWD(btree.BTNode) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#checkDEC_FWD(btree.BTNode)
	 * @generated
	 */
	EOperation getnode2node__CheckDEC_FWD__BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#checkDEC_BWD(xbtree.XBTNode) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#checkDEC_BWD(xbtree.XBTNode)
	 * @generated
	 */
	EOperation getnode2node__CheckDEC_BWD__XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getnode2node__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getnode2node__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.node2node#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.node2node#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getnode2node__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest <em>left2southwest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>left2southwest</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest
	 * @generated
	 */
	EClass getleft2southwest();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_FWD__Match_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getleft2southwest__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getleft2southwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getleft2southwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getleft2southwest__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_BWD__Match_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getleft2southwest__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getleft2southwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, xbtree.XBTNode) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getleft2southwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getleft2southwest__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_BWD_EMoflonEdge_49(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 49</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_BWD_EMoflonEdge_49(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_FWD_EMoflonEdge_50(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 50</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 50</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isAppropriate_FWD_EMoflonEdge_50(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getleft2southwest__IsAppropriate_FWD_EMoflonEdge_50__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getleft2southwest__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getleft2southwest__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_solveCsp_CC(btree.BTNode, xbtree.XBTNode, btree.BTNode, xbtree.XBTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_solveCsp_CC(btree.BTNode, xbtree.XBTNode, btree.BTNode, xbtree.XBTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_solveCsp_CC__BTNode_XBTNode_BTNode_XBTNode_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getleft2southwest__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkDEC_FWD(btree.BTNode, btree.BTNode) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkDEC_FWD(btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getleft2southwest__CheckDEC_FWD__BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkDEC_BWD(xbtree.XBTNode, xbtree.XBTNode) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#checkDEC_BWD(xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getleft2southwest__CheckDEC_BWD__XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode)
	 * @generated
	 */
	EOperation getleft2southwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getleft2southwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.left2southwest#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.left2southwest#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getleft2southwest__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast <em>right2southeast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>right2southeast</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast
	 * @generated
	 */
	EClass getright2southeast();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_FWD__Match_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getright2southeast__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getright2southeast__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode, xbtree.XBTNode) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, btree.BTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_BTNode2XBTnode_BTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getright2southeast__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getright2southeast__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_BWD__Match_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getright2southeast__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getright2southeast__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode, xbtree.XBTNode, xbtree.XBTNode) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_BTNode_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getright2southeast__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getright2southeast__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_BWD_EMoflonEdge_50(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 50</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_BWD_EMoflonEdge_50(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_FWD_EMoflonEdge_51(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 51</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 51</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isAppropriate_FWD_EMoflonEdge_51(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getright2southeast__IsAppropriate_FWD_EMoflonEdge_51__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getright2southeast__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getright2southeast__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_solveCsp_CC(btree.BTNode, btree.BTNode, xbtree.XBTNode, xbtree.XBTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_solveCsp_CC(btree.BTNode, btree.BTNode, xbtree.XBTNode, xbtree.XBTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_solveCsp_CC__BTNode_BTNode_XBTNode_XBTNode_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getright2southeast__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkDEC_FWD(btree.BTNode, btree.BTNode) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkDEC_FWD(btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getright2southeast__CheckDEC_FWD__BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkDEC_BWD(xbtree.XBTNode, xbtree.XBTNode) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#checkDEC_BWD(xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getright2southeast__CheckDEC_BWD__XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode)
	 * @generated
	 */
	EOperation getright2southeast__GenerateModel__RuleEntryContainer_BTNode2XBTnode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode, xbtree.XBTNode, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, btree.BTNode, xbtree.XBTNode, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getright2southeast__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_BTNode_XBTNode_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.right2southeast#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.right2southeast#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getright2southeast__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest <em>rightleft2eastwest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rightleft2eastwest</em>'.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest
	 * @generated
	 */
	EClass getrightleft2eastwest();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode, btree.BTNode) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_FWD__Match_BTNode_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getrightleft2eastwest__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode, btree.BTNode) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode, btree.BTNode) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, btree.BTNode, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode, btree.BTNode, btree.BTNode, btree.BTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode, btree.BTNode, btree.BTNode, btree.BTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_XBTNode_BTNode_BTNode_BTNode_BTNode2XBTnode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getrightleft2eastwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getrightleft2eastwest__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_BWD__Match_XBTNode_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getrightleft2eastwest__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode, xbtree.XBTNode, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode, xbtree.XBTNode, btree.BTNode, xbtree.XBTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_XBTNode_XBTNode_BTNode_XBTNode_BTNode2XBTnode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getrightleft2eastwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getrightleft2eastwest__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_BWD_EMoflonEdge_51(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 51</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_BWD_EMoflonEdge_51(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_FWD_EMoflonEdge_52(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 52</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 52</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isAppropriate_FWD_EMoflonEdge_52(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsAppropriate_FWD_EMoflonEdge_52__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getrightleft2eastwest__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getrightleft2eastwest__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_solveCsp_CC(xbtree.XBTNode, xbtree.XBTNode, btree.BTNode, xbtree.XBTNode, btree.BTNode, btree.BTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_solveCsp_CC(xbtree.XBTNode, xbtree.XBTNode, btree.BTNode, xbtree.XBTNode, btree.BTNode, btree.BTNode, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_solveCsp_CC__XBTNode_XBTNode_BTNode_XBTNode_BTNode_BTNode_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getrightleft2eastwest__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkDEC_FWD(btree.BTNode, btree.BTNode, btree.BTNode) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkDEC_FWD(btree.BTNode, btree.BTNode, btree.BTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__CheckDEC_FWD__BTNode_BTNode_BTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkDEC_BWD(xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#checkDEC_BWD(xbtree.XBTNode, xbtree.XBTNode, xbtree.XBTNode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__CheckDEC_BWD__XBTNode_XBTNode_XBTNode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode)
	 * @generated
	 */
	EOperation getrightleft2eastwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode, btree.BTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xbtree.XBTNode, btree.BTNode, org.wbsilva.bx.btree2xbtree.BTNode2XBTnode, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getrightleft2eastwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_XBTNode_BTNode_BTNode2XBTnode_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getrightleft2eastwest__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

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
		 * The meta object literal for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.node2nodeImpl <em>node2node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.node2nodeImpl
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getnode2node()
		 * @generated
		 */
		EClass NODE2NODE = eINSTANCE.getnode2node();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_FWD__MATCH_BTNODE = eINSTANCE
				.getnode2node__IsAppropriate_FWD__Match_BTNode();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getnode2node__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_FWD__MATCH = eINSTANCE.getnode2node__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE = eINSTANCE
				.getnode2node__RegisterObjectsToMatch_FWD__Match_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE = eINSTANCE
				.getnode2node__IsAppropriate_solveCsp_FWD__Match_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getnode2node__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE = eINSTANCE
				.getnode2node__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getnode2node__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getnode2node__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___CHECK_TYPES_FWD__MATCH = eINSTANCE.getnode2node__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_BWD__MATCH_XBTNODE = eINSTANCE
				.getnode2node__IsAppropriate_BWD__Match_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getnode2node__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_BWD__MATCH = eINSTANCE.getnode2node__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE = eINSTANCE
				.getnode2node__RegisterObjectsToMatch_BWD__Match_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE = eINSTANCE
				.getnode2node__IsAppropriate_solveCsp_BWD__Match_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getnode2node__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE = eINSTANCE
				.getnode2node__IsApplicable_solveCsp_BWD__IsApplicableMatch_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getnode2node__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getnode2node__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___CHECK_TYPES_BWD__MATCH = eINSTANCE.getnode2node__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD XBT Node 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_BWD_XBT_NODE_0__XBTNODE = eINSTANCE
				.getnode2node__IsAppropriate_BWD_XBTNode_0__XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD BT Node 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPROPRIATE_FWD_BT_NODE_0__BTNODE = eINSTANCE
				.getnode2node__IsAppropriate_FWD_BTNode_0__BTNode();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getnode2node__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getnode2node__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE.getnode2node__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_BTNODE_MATCH_MATCH = eINSTANCE
				.getnode2node__IsApplicable_solveCsp_CC__XBTNode_BTNode_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getnode2node__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___CHECK_DEC_FWD__BTNODE = eINSTANCE.getnode2node__CheckDEC_FWD__BTNode();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___CHECK_DEC_BWD__XBTNODE = eINSTANCE.getnode2node__CheckDEC_BWD__XBTNode();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___GENERATE_MODEL__RULEENTRYCONTAINER = eINSTANCE
				.getnode2node__GenerateModel__RuleEntryContainer();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = eINSTANCE
				.getnode2node__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE2NODE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getnode2node__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.left2southwestImpl <em>left2southwest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.left2southwestImpl
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getleft2southwest()
		 * @generated
		 */
		EClass LEFT2SOUTHWEST = eINSTANCE.getleft2southwest();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE = eINSTANCE
				.getleft2southwest__IsAppropriate_FWD__Match_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getleft2southwest__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_FWD__MATCH = eINSTANCE.getleft2southwest__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE = eINSTANCE
				.getleft2southwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE = eINSTANCE
				.getleft2southwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getleft2southwest__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_BTNODE = eINSTANCE
				.getleft2southwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getleft2southwest__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getleft2southwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___CHECK_TYPES_FWD__MATCH = eINSTANCE.getleft2southwest__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE = eINSTANCE
				.getleft2southwest__IsAppropriate_BWD__Match_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getleft2southwest__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_BWD__MATCH = eINSTANCE.getleft2southwest__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE = eINSTANCE
				.getleft2southwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE = eINSTANCE
				.getleft2southwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getleft2southwest__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_XBTNODE = eINSTANCE
				.getleft2southwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getleft2southwest__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getleft2southwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___CHECK_TYPES_BWD__MATCH = eINSTANCE.getleft2southwest__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 49</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE = eINSTANCE
				.getleft2southwest__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 50</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE = eINSTANCE
				.getleft2southwest__IsAppropriate_FWD_EMoflonEdge_50__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getleft2southwest__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getleft2southwest__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getleft2southwest__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_XBTNODE_BTNODE_XBTNODE_MATCH_MATCH = eINSTANCE
				.getleft2southwest__IsApplicable_solveCsp_CC__BTNode_XBTNode_BTNode_XBTNode_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getleft2southwest__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___CHECK_DEC_FWD__BTNODE_BTNODE = eINSTANCE
				.getleft2southwest__CheckDEC_FWD__BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE = eINSTANCE
				.getleft2southwest__CheckDEC_BWD__XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE = eINSTANCE
				.getleft2southwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT = eINSTANCE
				.getleft2southwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode_XBTNode_BTNode2XBTnode_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEFT2SOUTHWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getleft2southwest__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.right2southeastImpl <em>right2southeast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.right2southeastImpl
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getright2southeast()
		 * @generated
		 */
		EClass RIGHT2SOUTHEAST = eINSTANCE.getright2southeast();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE = eINSTANCE
				.getright2southeast__IsAppropriate_FWD__Match_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getright2southeast__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_FWD__MATCH = eINSTANCE.getright2southeast__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE = eINSTANCE
				.getright2southeast__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE = eINSTANCE
				.getright2southeast__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getright2southeast__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_BTNODE2XBTNODE_BTNODE_XBTNODE = eINSTANCE
				.getright2southeast__IsApplicable_solveCsp_FWD__IsApplicableMatch_BTNode_BTNode2XBTnode_BTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getright2southeast__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getright2southeast__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___CHECK_TYPES_FWD__MATCH = eINSTANCE.getright2southeast__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE = eINSTANCE
				.getright2southeast__IsAppropriate_BWD__Match_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getright2southeast__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_BWD__MATCH = eINSTANCE.getright2southeast__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE = eINSTANCE
				.getright2southeast__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE = eINSTANCE
				.getright2southeast__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getright2southeast__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_BTNODE_XBTNODE_XBTNODE = eINSTANCE
				.getright2southeast__IsApplicable_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_BTNode_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getright2southeast__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getright2southeast__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___CHECK_TYPES_BWD__MATCH = eINSTANCE.getright2southeast__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 50</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE = eINSTANCE
				.getright2southeast__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 51</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE = eINSTANCE
				.getright2southeast__IsAppropriate_FWD_EMoflonEdge_51__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getright2southeast__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getright2southeast__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getright2southeast__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_BTNODE_XBTNODE_XBTNODE_MATCH_MATCH = eINSTANCE
				.getright2southeast__IsApplicable_solveCsp_CC__BTNode_BTNode_XBTNode_XBTNode_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getright2southeast__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___CHECK_DEC_FWD__BTNODE_BTNODE = eINSTANCE
				.getright2southeast__CheckDEC_FWD__BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___CHECK_DEC_BWD__XBTNODE_XBTNODE = eINSTANCE
				.getright2southeast__CheckDEC_BWD__XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE = eINSTANCE
				.getright2southeast__GenerateModel__RuleEntryContainer_BTNode2XBTnode();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_BTNODE_XBTNODE_MODELGENERATORRULERESULT = eINSTANCE
				.getright2southeast__GenerateModel_solveCsp_BWD__IsApplicableMatch_BTNode2XBTnode_BTNode_XBTNode_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHT2SOUTHEAST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getright2southeast__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link org.wbsilva.bx.btree2xbtree.Rules.impl.rightleft2eastwestImpl <em>rightleft2eastwest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.rightleft2eastwestImpl
		 * @see org.wbsilva.bx.btree2xbtree.Rules.impl.RulesPackageImpl#getrightleft2eastwest()
		 * @generated
		 */
		EClass RIGHTLEFT2EASTWEST = eINSTANCE.getrightleft2eastwest();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE_BTNODE = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_FWD__Match_BTNode_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getrightleft2eastwest__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getrightleft2eastwest__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE_BTNODE = eINSTANCE
				.getrightleft2eastwest__RegisterObjectsToMatch_FWD__Match_BTNode_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE_BTNODE = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_solveCsp_FWD__Match_BTNode_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XBTNODE_BTNODE_BTNODE_BTNODE_BTNODE2XBTNODE = eINSTANCE
				.getrightleft2eastwest__IsApplicable_solveCsp_FWD__IsApplicableMatch_XBTNode_BTNode_BTNode_BTNode_BTNode2XBTnode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getrightleft2eastwest__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getrightleft2eastwest__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getrightleft2eastwest__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_BWD__Match_XBTNode_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getrightleft2eastwest__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getrightleft2eastwest__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE = eINSTANCE
				.getrightleft2eastwest__RegisterObjectsToMatch_BWD__Match_XBTNode_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_solveCsp_BWD__Match_XBTNode_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE_XBTNODE_BTNODE_XBTNODE_BTNODE2XBTNODE = eINSTANCE
				.getrightleft2eastwest__IsApplicable_solveCsp_BWD__IsApplicableMatch_XBTNode_XBTNode_BTNode_XBTNode_BTNode2XBTnode();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getrightleft2eastwest__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getrightleft2eastwest__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getrightleft2eastwest__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 51</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 52</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE = eINSTANCE
				.getrightleft2eastwest__IsAppropriate_FWD_EMoflonEdge_52__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getrightleft2eastwest__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getrightleft2eastwest__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getrightleft2eastwest__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_XBTNODE_BTNODE_XBTNODE_BTNODE_BTNODE_MATCH_MATCH = eINSTANCE
				.getrightleft2eastwest__IsApplicable_solveCsp_CC__XBTNode_XBTNode_BTNode_XBTNode_BTNode_BTNode_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getrightleft2eastwest__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___CHECK_DEC_FWD__BTNODE_BTNODE_BTNODE = eINSTANCE
				.getrightleft2eastwest__CheckDEC_FWD__BTNode_BTNode_BTNode();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE_XBTNODE = eINSTANCE
				.getrightleft2eastwest__CheckDEC_BWD__XBTNode_XBTNode_XBTNode();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE = eINSTANCE
				.getrightleft2eastwest__GenerateModel__RuleEntryContainer_BTNode2XBTnode();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE_BTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT = eINSTANCE
				.getrightleft2eastwest__GenerateModel_solveCsp_BWD__IsApplicableMatch_XBTNode_BTNode_BTNode2XBTnode_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGHTLEFT2EASTWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getrightleft2eastwest__GenerateModel_checkCsp_BWD__CSP();

	}

} //RulesPackage
