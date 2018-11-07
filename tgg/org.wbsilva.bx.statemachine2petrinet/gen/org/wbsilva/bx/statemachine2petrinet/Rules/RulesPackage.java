/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules;

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
 * @see org.wbsilva.bx.statemachine2petrinet.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/org.wbsilva.bx.statemachine2petrinet/model/Statemachine2petrinet.ecore#//Rules";

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
	RulesPackage eINSTANCE = org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.impl.initial2nothingImpl <em>initial2nothing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.initial2nothingImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl#getinitial2nothing()
	 * @generated
	 */
	int INITIAL2NOTHING = 0;

	/**
	 * The number of structural features of the '<em>initial2nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_FWD__MATCH_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PNGRAPH_PLACE_SM2PN_S2P_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_BWD__MATCH_PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD PN Graph 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_BWD_PN_GRAPH_5__PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 115</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPROPRIATE_FWD_EMOFLON_EDGE_115__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_SOLVE_CSP_CC__PNGRAPH_PLACE_SM_STATE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___CHECK_DEC_FWD__SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___CHECK_DEC_BWD__PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___GENERATE_MODEL__RULEENTRYCONTAINER_S2P = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PNGRAPH_PLACE_SM2PN_S2P_SM_STATE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>initial2nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL2NOTHING_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.impl.transition2arctransarcImpl <em>transition2arctransarc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.transition2arctransarcImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl#gettransition2arctransarc()
	 * @generated
	 */
	int TRANSITION2ARCTRANSARC = 1;

	/**
	 * The number of structural features of the '<em>transition2arctransarc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_FWD__MATCH_TRANSITION_SM_STATE_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TRANSITION_SM_STATE_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TRANSITION_SM_STATE_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2P_PLACE_S2P_SM2PN_PNGRAPH_PLACE_TRANSITION_SM_STATE_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_BWD__MATCH_TRANSITION_PLACE_PNGRAPH_PLACE_ARC_ARC = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TRANSITION_PLACE_PNGRAPH_PLACE_ARC_ARC = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TRANSITION_PLACE_PNGRAPH_PLACE_ARC_ARC = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2P_TRANSITION_PLACE_S2P_SM2PN_PNGRAPH_PLACE_SM_ARC_ARC_STATE_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 109</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_109__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 116</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_116__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_CC__TRANSITION_PLACE_PNGRAPH_PLACE_TRANSITION_SM_ARC_ARC_STATE_STATE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___CHECK_DEC_FWD__TRANSITION_SM_STATE_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___CHECK_DEC_BWD__TRANSITION_PLACE_PNGRAPH_PLACE_ARC_ARC = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___GENERATE_MODEL__RULEENTRYCONTAINER_S2P_S2P_SM2PN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2P_PLACE_S2P_SM2PN_PNGRAPH_PLACE_SM_STATE_STATE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>transition2arctransarc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION2ARCTRANSARC_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.impl.state2placeImpl <em>state2place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.state2placeImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl#getstate2place()
	 * @generated
	 */
	int STATE2PLACE = 2;

	/**
	 * The number of structural features of the '<em>state2place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_FWD__MATCH_STATE_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATE_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATE_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SM2PN_STATE_SM_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_BWD__MATCH_PLACE_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PLACE_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PLACE_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SM2PN_SM_PLACE_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 110</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_110__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 117</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_117__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_SOLVE_CSP_CC__STATE_SM_PLACE_PNGRAPH_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___CHECK_DEC_FWD__STATE_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___CHECK_DEC_BWD__PLACE_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2PN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SM2PN_SM_PNGRAPH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>state2place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE2PLACE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.impl.selftrans2arctransarcImpl <em>selftrans2arctransarc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.selftrans2arctransarcImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl#getselftrans2arctransarc()
	 * @generated
	 */
	int SELFTRANS2ARCTRANSARC = 3;

	/**
	 * The number of structural features of the '<em>selftrans2arctransarc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_FWD__MATCH_STATE_SM_TRANSITION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATE_SM_TRANSITION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATE_SM_TRANSITION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STATE_SM2PN_PNGRAPH_SM_TRANSITION_PLACE_S2P = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_BWD__MATCH_TRANSITION_PNGRAPH_ARC_ARC_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TRANSITION_PNGRAPH_ARC_ARC_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TRANSITION_PNGRAPH_ARC_ARC_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TRANSITION_STATE_SM2PN_PNGRAPH_ARC_SM_ARC_PLACE_S2P = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 111</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_111__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 118</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_118__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_CC__TRANSITION_STATE_PNGRAPH_ARC_SM_TRANSITION_ARC_PLACE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___CHECK_DEC_FWD__STATE_SM_TRANSITION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___CHECK_DEC_BWD__TRANSITION_PNGRAPH_ARC_ARC_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___GENERATE_MODEL__RULEENTRYCONTAINER_S2P_SM2PN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STATE_SM2PN_PNGRAPH_SM_PLACE_S2P_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>selftrans2arctransarc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFTRANS2ARCTRANSARC_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.impl.final2nothingImpl <em>final2nothing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.final2nothingImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl#getfinal2nothing()
	 * @generated
	 */
	int FINAL2NOTHING = 4;

	/**
	 * The number of structural features of the '<em>final2nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_FWD__MATCH_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PNGRAPH_S2P_SM2PN_SM_STATE_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_BWD__MATCH_PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD PN Graph 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_BWD_PN_GRAPH_6__PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 119</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPROPRIATE_FWD_EMOFLON_EDGE_119__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_SOLVE_CSP_CC__PNGRAPH_SM_STATE_PLACE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___CHECK_DEC_FWD__SM_STATE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___CHECK_DEC_BWD__PNGRAPH_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___GENERATE_MODEL__RULEENTRYCONTAINER_S2P = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PNGRAPH_S2P_SM2PN_SM_STATE_PLACE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>final2nothing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL2NOTHING_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.impl.statemachine2petrinetImpl <em>statemachine2petrinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.statemachine2petrinetImpl
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.impl.RulesPackageImpl#getstatemachine2petrinet()
	 * @generated
	 */
	int STATEMACHINE2PETRINET = 5;

	/**
	 * The number of structural features of the '<em>statemachine2petrinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_FWD__MATCH_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_BWD__MATCH_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD PN Graph 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_BWD_PN_GRAPH_7__PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD SM 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPROPRIATE_FWD_SM_2__SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_SOLVE_CSP_CC__PNGRAPH_SM_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___CHECK_DEC_FWD__SM = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___CHECK_DEC_BWD__PNGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>statemachine2petrinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMACHINE2PETRINET_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing <em>initial2nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>initial2nothing</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing
	 * @generated
	 */
	EClass getinitial2nothing();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_FWD__Match_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getinitial2nothing__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getinitial2nothing__RegisterObjectsToMatch_FWD__Match_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_solveCsp_FWD__Match_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.SM2PN, org.wbsilva.bx.statemachine2petrinet.S2P, statemachine.SM, statemachine.State) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.SM2PN, org.wbsilva.bx.statemachine2petrinet.S2P, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_solveCsp_FWD__IsApplicableMatch_PNGraph_Place_SM2PN_S2P_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getinitial2nothing__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getinitial2nothing__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_BWD__Match_PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getinitial2nothing__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getinitial2nothing__RegisterObjectsToMatch_BWD__Match_PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_solveCsp_BWD__Match_PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getinitial2nothing__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_BWD_PNGraph_5(petrinet.PNGraph) <em>Is Appropriate BWD PN Graph 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD PN Graph 5</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_BWD_PNGraph_5(petrinet.PNGraph)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_BWD_PNGraph_5__PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_FWD_EMoflonEdge_115(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 115</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 115</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isAppropriate_FWD_EMoflonEdge_115(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getinitial2nothing__IsAppropriate_FWD_EMoflonEdge_115__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getinitial2nothing__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getinitial2nothing__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_solveCsp_CC(petrinet.PNGraph, petrinet.Place, statemachine.SM, statemachine.State, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_solveCsp_CC(petrinet.PNGraph, petrinet.Place, statemachine.SM, statemachine.State, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_solveCsp_CC__PNGraph_Place_SM_State_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getinitial2nothing__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkDEC_FWD(statemachine.SM, statemachine.State) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkDEC_FWD(statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getinitial2nothing__CheckDEC_FWD__SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkDEC_BWD(petrinet.PNGraph, petrinet.Place) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#checkDEC_BWD(petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getinitial2nothing__CheckDEC_BWD__PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P)
	 * @generated
	 */
	EOperation getinitial2nothing__GenerateModel__RuleEntryContainer_S2P();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.SM2PN, org.wbsilva.bx.statemachine2petrinet.S2P, statemachine.SM, statemachine.State, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.SM2PN, org.wbsilva.bx.statemachine2petrinet.S2P, statemachine.SM, statemachine.State, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getinitial2nothing__GenerateModel_solveCsp_BWD__IsApplicableMatch_PNGraph_Place_SM2PN_S2P_SM_State_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getinitial2nothing__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc <em>transition2arctransarc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition2arctransarc</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc
	 * @generated
	 */
	EClass gettransition2arctransarc();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_FWD__Match_Transition_SM_State_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation gettransition2arctransarc__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation gettransition2arctransarc__RegisterObjectsToMatch_FWD__Match_Transition_SM_State_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_solveCsp_FWD__Match_Transition_SM_State_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.S2P, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Place, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.S2P, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Place, statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_solveCsp_FWD__IsApplicableMatch_S2P_Place_S2P_SM2PN_PNGraph_Place_Transition_SM_State_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation gettransition2arctransarc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation gettransition2arctransarc__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_BWD__Match_Transition_Place_PNGraph_Place_Arc_Arc();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation gettransition2arctransarc__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc)
	 * @generated
	 */
	EOperation gettransition2arctransarc__RegisterObjectsToMatch_BWD__Match_Transition_Place_PNGraph_Place_Arc_Arc();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_solveCsp_BWD__Match_Transition_Place_PNGraph_Place_Arc_Arc();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.S2P, petrinet.Transition, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Place, statemachine.SM, petrinet.Arc, petrinet.Arc, statemachine.State, statemachine.State) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.S2P, petrinet.Transition, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Place, statemachine.SM, petrinet.Arc, petrinet.Arc, statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_solveCsp_BWD__IsApplicableMatch_S2P_Transition_Place_S2P_SM2PN_PNGraph_Place_SM_Arc_Arc_State_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation gettransition2arctransarc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation gettransition2arctransarc__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_BWD_EMoflonEdge_109(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 109</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 109</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_BWD_EMoflonEdge_109(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_BWD_EMoflonEdge_109__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_FWD_EMoflonEdge_116(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 116</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 116</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isAppropriate_FWD_EMoflonEdge_116(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsAppropriate_FWD_EMoflonEdge_116__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation gettransition2arctransarc__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation gettransition2arctransarc__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_solveCsp_CC(petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, statemachine.Transition, statemachine.SM, petrinet.Arc, petrinet.Arc, statemachine.State, statemachine.State, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_solveCsp_CC(petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, statemachine.Transition, statemachine.SM, petrinet.Arc, petrinet.Arc, statemachine.State, statemachine.State, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_solveCsp_CC__Transition_Place_PNGraph_Place_Transition_SM_Arc_Arc_State_State_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation gettransition2arctransarc__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkDEC_FWD(statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkDEC_FWD(statemachine.Transition, statemachine.SM, statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation gettransition2arctransarc__CheckDEC_FWD__Transition_SM_State_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkDEC_BWD(petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#checkDEC_BWD(petrinet.Transition, petrinet.Place, petrinet.PNGraph, petrinet.Place, petrinet.Arc, petrinet.Arc)
	 * @generated
	 */
	EOperation gettransition2arctransarc__CheckDEC_BWD__Transition_Place_PNGraph_Place_Arc_Arc();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN)
	 * @generated
	 */
	EOperation gettransition2arctransarc__GenerateModel__RuleEntryContainer_S2P_S2P_SM2PN();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.S2P, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Place, statemachine.SM, statemachine.State, statemachine.State, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.S2P, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Place, statemachine.SM, statemachine.State, statemachine.State, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation gettransition2arctransarc__GenerateModel_solveCsp_BWD__IsApplicableMatch_S2P_Place_S2P_SM2PN_PNGraph_Place_SM_State_State_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation gettransition2arctransarc__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place <em>state2place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>state2place</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place
	 * @generated
	 */
	EClass getstate2place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_FWD__Match_State_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getstate2place__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM)
	 * @generated
	 */
	EOperation getstate2place__RegisterObjectsToMatch_FWD__Match_State_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_solveCsp_FWD__Match_State_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.State, statemachine.SM, petrinet.PNGraph) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.State, statemachine.SM, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_solveCsp_FWD__IsApplicableMatch_SM2PN_State_SM_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getstate2place__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstate2place__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.Place, petrinet.PNGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.Place, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_BWD__Match_Place_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getstate2place__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.Place, petrinet.PNGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.Place, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstate2place__RegisterObjectsToMatch_BWD__Match_Place_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.Place, petrinet.PNGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.Place, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_solveCsp_BWD__Match_Place_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, petrinet.Place, petrinet.PNGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, petrinet.Place, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_solveCsp_BWD__IsApplicableMatch_SM2PN_SM_Place_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getstate2place__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstate2place__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_BWD_EMoflonEdge_110(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 110</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_BWD_EMoflonEdge_110(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_BWD_EMoflonEdge_110__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_FWD_EMoflonEdge_117(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 117</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 117</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isAppropriate_FWD_EMoflonEdge_117(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getstate2place__IsAppropriate_FWD_EMoflonEdge_117__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getstate2place__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getstate2place__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_solveCsp_CC(statemachine.State, statemachine.SM, petrinet.Place, petrinet.PNGraph, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_solveCsp_CC(statemachine.State, statemachine.SM, petrinet.Place, petrinet.PNGraph, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_solveCsp_CC__State_SM_Place_PNGraph_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstate2place__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkDEC_FWD(statemachine.State, statemachine.SM) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkDEC_FWD(statemachine.State, statemachine.SM)
	 * @generated
	 */
	EOperation getstate2place__CheckDEC_FWD__State_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkDEC_BWD(petrinet.Place, petrinet.PNGraph) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#checkDEC_BWD(petrinet.Place, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstate2place__CheckDEC_BWD__Place_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.SM2PN) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.SM2PN)
	 * @generated
	 */
	EOperation getstate2place__GenerateModel__RuleEntryContainer_SM2PN();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, petrinet.PNGraph, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, petrinet.PNGraph, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getstate2place__GenerateModel_solveCsp_BWD__IsApplicableMatch_SM2PN_SM_PNGraph_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.state2place#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.state2place#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstate2place__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc <em>selftrans2arctransarc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>selftrans2arctransarc</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc
	 * @generated
	 */
	EClass getselftrans2arctransarc();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM, statemachine.Transition) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM, statemachine.Transition)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_FWD__Match_State_SM_Transition();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM, statemachine.Transition) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM, statemachine.Transition)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__RegisterObjectsToMatch_FWD__Match_State_SM_Transition();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM, statemachine.Transition) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.State, statemachine.SM, statemachine.Transition)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_solveCsp_FWD__Match_State_SM_Transition();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, statemachine.State, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, statemachine.SM, statemachine.Transition, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, statemachine.State, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, statemachine.SM, statemachine.Transition, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_solveCsp_FWD__IsApplicableMatch_State_SM2PN_PNGraph_SM_Transition_Place_S2P();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_BWD__Match_Transition_PNGraph_Arc_Arc_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__RegisterObjectsToMatch_BWD__Match_Transition_PNGraph_Arc_Arc_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_solveCsp_BWD__Match_Transition_PNGraph_Arc_Arc_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.Transition, statemachine.State, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Arc, statemachine.SM, petrinet.Arc, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.Transition, statemachine.State, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, petrinet.Arc, statemachine.SM, petrinet.Arc, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_solveCsp_BWD__IsApplicableMatch_Transition_State_SM2PN_PNGraph_Arc_SM_Arc_Place_S2P();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_BWD_EMoflonEdge_111(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 111</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 111</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_BWD_EMoflonEdge_111(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_BWD_EMoflonEdge_111__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_FWD_EMoflonEdge_118(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 118</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 118</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isAppropriate_FWD_EMoflonEdge_118(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsAppropriate_FWD_EMoflonEdge_118__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_solveCsp_CC(petrinet.Transition, statemachine.State, petrinet.PNGraph, petrinet.Arc, statemachine.SM, statemachine.Transition, petrinet.Arc, petrinet.Place, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_solveCsp_CC(petrinet.Transition, statemachine.State, petrinet.PNGraph, petrinet.Arc, statemachine.SM, statemachine.Transition, petrinet.Arc, petrinet.Place, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_solveCsp_CC__Transition_State_PNGraph_Arc_SM_Transition_Arc_Place_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkDEC_FWD(statemachine.State, statemachine.SM, statemachine.Transition) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkDEC_FWD(statemachine.State, statemachine.SM, statemachine.Transition)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__CheckDEC_FWD__State_SM_Transition();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkDEC_BWD(petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#checkDEC_BWD(petrinet.Transition, petrinet.PNGraph, petrinet.Arc, petrinet.Arc, petrinet.Place)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__CheckDEC_BWD__Transition_PNGraph_Arc_Arc_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__GenerateModel__RuleEntryContainer_S2P_SM2PN();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, statemachine.State, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, statemachine.SM, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, statemachine.State, org.wbsilva.bx.statemachine2petrinet.SM2PN, petrinet.PNGraph, statemachine.SM, petrinet.Place, org.wbsilva.bx.statemachine2petrinet.S2P, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__GenerateModel_solveCsp_BWD__IsApplicableMatch_State_SM2PN_PNGraph_SM_Place_S2P_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getselftrans2arctransarc__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing <em>final2nothing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>final2nothing</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing
	 * @generated
	 */
	EClass getfinal2nothing();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_FWD__Match_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getfinal2nothing__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getfinal2nothing__RegisterObjectsToMatch_FWD__Match_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_solveCsp_FWD__Match_SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, statemachine.State, petrinet.Place) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, statemachine.State, petrinet.Place)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_solveCsp_FWD__IsApplicableMatch_PNGraph_S2P_SM2PN_SM_State_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getfinal2nothing__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getfinal2nothing__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_BWD__Match_PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getfinal2nothing__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getfinal2nothing__RegisterObjectsToMatch_BWD__Match_PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_solveCsp_BWD__Match_PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getfinal2nothing__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_BWD_PNGraph_6(petrinet.PNGraph) <em>Is Appropriate BWD PN Graph 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD PN Graph 6</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_BWD_PNGraph_6(petrinet.PNGraph)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_BWD_PNGraph_6__PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_FWD_EMoflonEdge_119(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 119</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 119</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isAppropriate_FWD_EMoflonEdge_119(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getfinal2nothing__IsAppropriate_FWD_EMoflonEdge_119__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getfinal2nothing__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getfinal2nothing__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_solveCsp_CC(petrinet.PNGraph, statemachine.SM, statemachine.State, petrinet.Place, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_solveCsp_CC(petrinet.PNGraph, statemachine.SM, statemachine.State, petrinet.Place, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_solveCsp_CC__PNGraph_SM_State_Place_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getfinal2nothing__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkDEC_FWD(statemachine.SM, statemachine.State) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkDEC_FWD(statemachine.SM, statemachine.State)
	 * @generated
	 */
	EOperation getfinal2nothing__CheckDEC_FWD__SM_State();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkDEC_BWD(petrinet.PNGraph, petrinet.Place) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#checkDEC_BWD(petrinet.PNGraph, petrinet.Place)
	 * @generated
	 */
	EOperation getfinal2nothing__CheckDEC_BWD__PNGraph_Place();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.wbsilva.bx.statemachine2petrinet.S2P)
	 * @generated
	 */
	EOperation getfinal2nothing__GenerateModel__RuleEntryContainer_S2P();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, statemachine.State, petrinet.Place, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph, org.wbsilva.bx.statemachine2petrinet.S2P, org.wbsilva.bx.statemachine2petrinet.SM2PN, statemachine.SM, statemachine.State, petrinet.Place, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getfinal2nothing__GenerateModel_solveCsp_BWD__IsApplicableMatch_PNGraph_S2P_SM2PN_SM_State_Place_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.final2nothing#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getfinal2nothing__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet <em>statemachine2petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>statemachine2petrinet</em>'.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet
	 * @generated
	 */
	EClass getstatemachine2petrinet();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.SM) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_FWD(org.moflon.tgg.runtime.Match, statemachine.SM)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_FWD__Match_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.SM) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, statemachine.SM)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__RegisterObjectsToMatch_FWD__Match_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.SM) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, statemachine.SM)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_solveCsp_FWD__Match_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, statemachine.SM) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, statemachine.SM)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_solveCsp_FWD__IsApplicableMatch_SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_BWD__Match_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__RegisterObjectsToMatch_BWD__Match_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_solveCsp_BWD__Match_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_solveCsp_BWD__IsApplicableMatch_PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_BWD_PNGraph_7(petrinet.PNGraph) <em>Is Appropriate BWD PN Graph 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD PN Graph 7</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_BWD_PNGraph_7(petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_BWD_PNGraph_7__PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_FWD_SM_2(statemachine.SM) <em>Is Appropriate FWD SM 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD SM 2</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isAppropriate_FWD_SM_2(statemachine.SM)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsAppropriate_FWD_SM_2__SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_solveCsp_CC(petrinet.PNGraph, statemachine.SM, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_solveCsp_CC(petrinet.PNGraph, statemachine.SM, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_solveCsp_CC__PNGraph_SM_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkDEC_FWD(statemachine.SM) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkDEC_FWD(statemachine.SM)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__CheckDEC_FWD__SM();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkDEC_BWD(petrinet.PNGraph) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#checkDEC_BWD(petrinet.PNGraph)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__CheckDEC_BWD__PNGraph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getstatemachine2petrinet__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
