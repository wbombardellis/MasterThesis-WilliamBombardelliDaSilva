/**
 */
package org.wbsilva.bx.btree2xbtree.Rules.impl;

import btree.BTNode;
import btree.BtreeFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;

import org.wbsilva.bx.btree2xbtree.BTNode2XBTnode;
import org.wbsilva.bx.btree2xbtree.Btree2xbtreeFactory;

import org.wbsilva.bx.btree2xbtree.Rules.RulesPackage;
import org.wbsilva.bx.btree2xbtree.Rules.node2node;

import xbtree.XBTNode;
import xbtree.XbtreeFactory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.wbsilva.bx.btree2xbtree.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>node2node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class node2nodeImpl extends AbstractRuleImpl implements node2node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected node2nodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.NODE2NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, BTNode n) {

		Object[] result1_black = node2nodeImpl.pattern_node2node_0_1_initialbindings_blackBBB(this, match, n);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ".");
		}

		Object[] result2_bindingAndBlack = node2nodeImpl.pattern_node2node_0_2_SolveCSP_bindingAndBlackFBBB(this, match,
				n);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (node2nodeImpl.pattern_node2node_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = node2nodeImpl.pattern_node2node_0_4_collectelementstobetranslated_blackBB(match,
					n);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[n] = " + n + ".");
			}
			node2nodeImpl.pattern_node2node_0_4_collectelementstobetranslated_greenBB(match, n);

			Object[] result5_black = node2nodeImpl.pattern_node2node_0_5_collectcontextelements_blackBB(match, n);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[n] = " + n + ".");
			}
			// 
			node2nodeImpl.pattern_node2node_0_6_registerobjectstomatch_expressionBBB(this, match, n);
			return node2nodeImpl.pattern_node2node_0_7_expressionF();
		} else {
			return node2nodeImpl.pattern_node2node_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = node2nodeImpl
				.pattern_node2node_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BTNode n = (BTNode) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = node2nodeImpl.pattern_node2node_1_1_performtransformation_greenFBF(n);
		XBTNode xn = (XBTNode) result1_green[0];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_green[2];

		Object[] result2_black = node2nodeImpl.pattern_node2node_1_2_collecttranslatedelements_blackBBB(xn, n, n2xn);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xn] = " + xn + ", " + "[n] = "
					+ n + ", " + "[n2xn] = " + n2xn + ".");
		}
		Object[] result2_green = node2nodeImpl.pattern_node2node_1_2_collecttranslatedelements_greenFBBB(xn, n, n2xn);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = node2nodeImpl.pattern_node2node_1_3_bookkeepingforedges_blackBBBB(ruleresult, xn, n,
				n2xn);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xn] = " + xn + ", " + "[n] = " + n + ", " + "[n2xn] = " + n2xn + ".");
		}
		node2nodeImpl.pattern_node2node_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, xn, n, n2xn);
		//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		node2nodeImpl.pattern_node2node_1_5_registerobjects_expressionBBBBB(this, ruleresult, xn, n, n2xn);
		return node2nodeImpl.pattern_node2node_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = node2nodeImpl
				.pattern_node2node_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = node2nodeImpl.pattern_node2node_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = node2nodeImpl.pattern_node2node_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BTNode n = (BTNode) result2_binding[0];
		for (Object[] result2_black : node2nodeImpl.pattern_node2node_2_2_corematch_blackBB(n, match)) {
			// ForEach 
			for (Object[] result3_black : node2nodeImpl.pattern_node2node_2_3_findcontext_blackB(n)) {
				Object[] result3_green = node2nodeImpl.pattern_node2node_2_3_findcontext_greenBF(n);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = node2nodeImpl
						.pattern_node2node_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, n);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (node2nodeImpl.pattern_node2node_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = node2nodeImpl
							.pattern_node2node_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					node2nodeImpl.pattern_node2node_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return node2nodeImpl.pattern_node2node_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, BTNode n) {
		match.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BTNode n) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, BTNode n) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject xn, EObject n, EObject n2xn) {
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("n2xn", n2xn);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("n").eClass()).equals("btree.BTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, XBTNode xn) {

		Object[] result1_black = node2nodeImpl.pattern_node2node_10_1_initialbindings_blackBBB(this, match, xn);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xn] = " + xn + ".");
		}

		Object[] result2_bindingAndBlack = node2nodeImpl.pattern_node2node_10_2_SolveCSP_bindingAndBlackFBBB(this,
				match, xn);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xn] = " + xn + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (node2nodeImpl.pattern_node2node_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = node2nodeImpl.pattern_node2node_10_4_collectelementstobetranslated_blackBB(match,
					xn);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xn] = " + xn + ".");
			}
			node2nodeImpl.pattern_node2node_10_4_collectelementstobetranslated_greenBB(match, xn);

			Object[] result5_black = node2nodeImpl.pattern_node2node_10_5_collectcontextelements_blackBB(match, xn);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xn] = " + xn + ".");
			}
			// 
			node2nodeImpl.pattern_node2node_10_6_registerobjectstomatch_expressionBBB(this, match, xn);
			return node2nodeImpl.pattern_node2node_10_7_expressionF();
		} else {
			return node2nodeImpl.pattern_node2node_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = node2nodeImpl
				.pattern_node2node_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		XBTNode xn = (XBTNode) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = node2nodeImpl.pattern_node2node_11_1_performtransformation_greenBFF(xn);
		BTNode n = (BTNode) result1_green[1];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_green[2];

		Object[] result2_black = node2nodeImpl.pattern_node2node_11_2_collecttranslatedelements_blackBBB(xn, n, n2xn);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xn] = " + xn + ", " + "[n] = "
					+ n + ", " + "[n2xn] = " + n2xn + ".");
		}
		Object[] result2_green = node2nodeImpl.pattern_node2node_11_2_collecttranslatedelements_greenFBBB(xn, n, n2xn);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = node2nodeImpl.pattern_node2node_11_3_bookkeepingforedges_blackBBBB(ruleresult, xn, n,
				n2xn);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xn] = " + xn + ", " + "[n] = " + n + ", " + "[n2xn] = " + n2xn + ".");
		}
		node2nodeImpl.pattern_node2node_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, xn, n, n2xn);
		//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		node2nodeImpl.pattern_node2node_11_5_registerobjects_expressionBBBBB(this, ruleresult, xn, n, n2xn);
		return node2nodeImpl.pattern_node2node_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = node2nodeImpl
				.pattern_node2node_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = node2nodeImpl.pattern_node2node_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = node2nodeImpl.pattern_node2node_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XBTNode xn = (XBTNode) result2_binding[0];
		for (Object[] result2_black : node2nodeImpl.pattern_node2node_12_2_corematch_blackBB(xn, match)) {
			// ForEach 
			for (Object[] result3_black : node2nodeImpl.pattern_node2node_12_3_findcontext_blackB(xn)) {
				Object[] result3_green = node2nodeImpl.pattern_node2node_12_3_findcontext_greenBF(xn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = node2nodeImpl
						.pattern_node2node_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, xn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[xn] = " + xn + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (node2nodeImpl.pattern_node2node_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = node2nodeImpl
							.pattern_node2node_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					node2nodeImpl.pattern_node2node_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return node2nodeImpl.pattern_node2node_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, XBTNode xn) {
		match.registerObject("xn", xn);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, XBTNode xn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XBTNode xn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("xn", xn);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject xn, EObject n, EObject n2xn) {
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("n2xn", n2xn);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xn").eClass()).equals("xbtree.XBTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_XBTNode_1(XBTNode xn) {

		Object[] result1_bindingAndBlack = node2nodeImpl
				.pattern_node2node_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = node2nodeImpl.pattern_node2node_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : node2nodeImpl.pattern_node2node_20_2_testcorematchandDECs_blackB(xn)) {
			Object[] result2_green = node2nodeImpl.pattern_node2node_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (node2nodeImpl.pattern_node2node_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
					match, xn)) {
				// 
				if (node2nodeImpl.pattern_node2node_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = node2nodeImpl.pattern_node2node_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					node2nodeImpl.pattern_node2node_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return node2nodeImpl.pattern_node2node_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_BTNode_1(BTNode n) {

		Object[] result1_bindingAndBlack = node2nodeImpl
				.pattern_node2node_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = node2nodeImpl.pattern_node2node_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : node2nodeImpl.pattern_node2node_21_2_testcorematchandDECs_blackB(n)) {
			Object[] result2_green = node2nodeImpl.pattern_node2node_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (node2nodeImpl.pattern_node2node_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
					match, n)) {
				// 
				if (node2nodeImpl.pattern_node2node_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = node2nodeImpl.pattern_node2node_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					node2nodeImpl.pattern_node2node_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return node2nodeImpl.pattern_node2node_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("node2node");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("node2node");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = node2nodeImpl.pattern_node2node_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = node2nodeImpl.pattern_node2node_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = node2nodeImpl
				.pattern_node2node_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		XBTNode xn = (XBTNode) result2_bindingAndBlack[0];
		BTNode n = (BTNode) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = node2nodeImpl.pattern_node2node_24_3_solvecsp_bindingAndBlackFBBBBB(this, xn,
				n, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[xn] = " + xn + ", " + "[n] = " + n + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (node2nodeImpl.pattern_node2node_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : node2nodeImpl.pattern_node2node_24_5_matchcorrcontext_blackBB(sourceMatch,
					targetMatch)) {
				Object[] result5_green = node2nodeImpl.pattern_node2node_24_5_matchcorrcontext_greenBBF(sourceMatch,
						targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = node2nodeImpl.pattern_node2node_24_6_createcorrespondence_blackBBB(xn, n,
						ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xn] = " + xn + ", "
							+ "[n] = " + n + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				node2nodeImpl.pattern_node2node_24_6_createcorrespondence_greenBBFB(xn, n, ccMatch);
				//nothing BTNode2XBTnode n2xn = (BTNode2XBTnode) result6_green[2];

				Object[] result7_black = node2nodeImpl.pattern_node2node_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				node2nodeImpl.pattern_node2node_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return node2nodeImpl.pattern_node2node_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(XBTNode xn, BTNode n, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(BTNode n) {// 
		Object[] result1_black = node2nodeImpl.pattern_node2node_27_1_matchtggpattern_blackB(n);
		if (result1_black != null) {
			return node2nodeImpl.pattern_node2node_27_2_expressionF();
		} else {
			return node2nodeImpl.pattern_node2node_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(XBTNode xn) {// 
		Object[] result1_black = node2nodeImpl.pattern_node2node_28_1_matchtggpattern_blackB(xn);
		if (result1_black != null) {
			return node2nodeImpl.pattern_node2node_28_2_expressionF();
		} else {
			return node2nodeImpl.pattern_node2node_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = node2nodeImpl.pattern_node2node_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = node2nodeImpl.pattern_node2node_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = node2nodeImpl.pattern_node2node_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = node2nodeImpl.pattern_node2node_29_3_solveCSP_bindingAndBlackFBBB(this,
					isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (node2nodeImpl.pattern_node2node_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = node2nodeImpl.pattern_node2node_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				node2nodeImpl.pattern_node2node_29_6_perform_greenFFFB(ruleResult);
				//nothing XBTNode xn = (XBTNode) result6_green[0];
				//nothing BTNode n = (BTNode) result6_green[1];
				//nothing BTNode2XBTnode n2xn = (BTNode2XBTnode) result6_green[2];

			} else {
			}

		} else {
		}
		return node2nodeImpl.pattern_node2node_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_FWD__MATCH_BTNODE:
			return isAppropriate_FWD((Match) arguments.get(0), (BTNode) arguments.get(1));
		case RulesPackage.NODE2NODE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NODE2NODE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (BTNode) arguments.get(1));
			return null;
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (BTNode) arguments.get(1));
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NODE2NODE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.NODE2NODE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_BWD__MATCH_XBTNODE:
			return isAppropriate_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1));
		case RulesPackage.NODE2NODE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NODE2NODE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1));
			return null;
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1));
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (XBTNode) arguments.get(1));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NODE2NODE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.NODE2NODE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_BWD_XBT_NODE_1__XBTNODE:
			return isAppropriate_BWD_XBTNode_1((XBTNode) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPROPRIATE_FWD_BT_NODE_1__BTNODE:
			return isAppropriate_FWD_BTNode_1((BTNode) arguments.get(0));
		case RulesPackage.NODE2NODE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NODE2NODE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_BTNODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((XBTNode) arguments.get(0), (BTNode) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.NODE2NODE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.NODE2NODE___CHECK_DEC_FWD__BTNODE:
			return checkDEC_FWD((BTNode) arguments.get(0));
		case RulesPackage.NODE2NODE___CHECK_DEC_BWD__XBTNODE:
			return checkDEC_BWD((XBTNode) arguments.get(0));
		case RulesPackage.NODE2NODE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.NODE2NODE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.NODE2NODE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_node2node_0_1_initialbindings_blackBBB(node2node _this, Match match,
			BTNode n) {
		return new Object[] { _this, match, n };
	}

	public static final Object[] pattern_node2node_0_2_SolveCSP_bindingFBBB(node2node _this, Match match, BTNode n) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, n };
		}
		return null;
	}

	public static final Object[] pattern_node2node_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_node2node_0_2_SolveCSP_bindingAndBlackFBBB(node2node _this, Match match,
			BTNode n) {
		Object[] result_pattern_node2node_0_2_SolveCSP_binding = pattern_node2node_0_2_SolveCSP_bindingFBBB(_this,
				match, n);
		if (result_pattern_node2node_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_node2node_0_2_SolveCSP_binding[0];

			Object[] result_pattern_node2node_0_2_SolveCSP_black = pattern_node2node_0_2_SolveCSP_blackB(csp);
			if (result_pattern_node2node_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, n };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_0_3_CheckCSP_expressionFBB(node2node _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_0_4_collectelementstobetranslated_blackBB(Match match, BTNode n) {
		return new Object[] { match, n };
	}

	public static final Object[] pattern_node2node_0_4_collectelementstobetranslated_greenBB(Match match, BTNode n) {
		match.getToBeTranslatedNodes().add(n);
		return new Object[] { match, n };
	}

	public static final Object[] pattern_node2node_0_5_collectcontextelements_blackBB(Match match, BTNode n) {
		return new Object[] { match, n };
	}

	public static final void pattern_node2node_0_6_registerobjectstomatch_expressionBBB(node2node _this, Match match,
			BTNode n) {
		_this.registerObjectsToMatch_FWD(match, n);

	}

	public static final boolean pattern_node2node_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_node2node_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_node2node_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject tmpN = _localVariable_0;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			return new Object[] { n, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_node2node_1_1_performtransformation_blackBFBB(BTNode n, node2node _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { n, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_1_1_performtransformation_bindingAndBlackFFBB(node2node _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_node2node_1_1_performtransformation_binding = pattern_node2node_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_node2node_1_1_performtransformation_binding != null) {
			BTNode n = (BTNode) result_pattern_node2node_1_1_performtransformation_binding[0];

			Object[] result_pattern_node2node_1_1_performtransformation_black = pattern_node2node_1_1_performtransformation_blackBFBB(
					n, _this, isApplicableMatch);
			if (result_pattern_node2node_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_node2node_1_1_performtransformation_black[1];

				return new Object[] { n, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_1_1_performtransformation_greenFBF(BTNode n) {
		XBTNode xn = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode n2xn = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		n2xn.setSource(n);
		n2xn.setTarget(xn);
		return new Object[] { xn, n, n2xn };
	}

	public static final Object[] pattern_node2node_1_2_collecttranslatedelements_blackBBB(XBTNode xn, BTNode n,
			BTNode2XBTnode n2xn) {
		return new Object[] { xn, n, n2xn };
	}

	public static final Object[] pattern_node2node_1_2_collecttranslatedelements_greenFBBB(XBTNode xn, BTNode n,
			BTNode2XBTnode n2xn) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(xn);
		ruleresult.getTranslatedElements().add(n);
		ruleresult.getCreatedLinkElements().add(n2xn);
		return new Object[] { ruleresult, xn, n, n2xn };
	}

	public static final Object[] pattern_node2node_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject xn, EObject n, EObject n2xn) {
		if (!n.equals(xn)) {
			if (!n.equals(n2xn)) {
				if (!n2xn.equals(xn)) {
					return new Object[] { ruleresult, xn, n, n2xn };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_1_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject xn, EObject n, EObject n2xn) {
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "node2node";
		String n2xn__n____source_name_prime = "source";
		String n2xn__xn____target_name_prime = "target";
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		ruleresult.getCreatedEdges().add(n2xn__n____source);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		ruleresult.getCreatedEdges().add(n2xn__xn____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		return new Object[] { ruleresult, xn, n, n2xn, n2xn__n____source, n2xn__xn____target };
	}

	public static final void pattern_node2node_1_5_registerobjects_expressionBBBBB(node2node _this,
			PerformRuleResult ruleresult, EObject xn, EObject n, EObject n2xn) {
		_this.registerObjects_FWD(ruleresult, xn, n, n2xn);

	}

	public static final PerformRuleResult pattern_node2node_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_node2node_2_1_preparereturnvalue_bindingFB(node2node _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_node2node_2_1_preparereturnvalue_blackFBB(EClass eClass, node2node _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_node2node_2_1_preparereturnvalue_bindingAndBlackFFB(node2node _this) {
		Object[] result_pattern_node2node_2_1_preparereturnvalue_binding = pattern_node2node_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_node2node_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_node2node_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_node2node_2_1_preparereturnvalue_black = pattern_node2node_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_node2node_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_node2node_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "node2node";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_node2node_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("n");
		EObject tmpN = _localVariable_0;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			return new Object[] { n, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_node2node_2_2_corematch_blackBB(BTNode n, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { n, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_node2node_2_3_findcontext_blackB(BTNode n) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { n });
		return _result;
	}

	public static final Object[] pattern_node2node_2_3_findcontext_greenBF(BTNode n) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(n);
		return new Object[] { n, isApplicableMatch };
	}

	public static final Object[] pattern_node2node_2_4_solveCSP_bindingFBBB(node2node _this,
			IsApplicableMatch isApplicableMatch, BTNode n) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n };
		}
		return null;
	}

	public static final Object[] pattern_node2node_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_node2node_2_4_solveCSP_bindingAndBlackFBBB(node2node _this,
			IsApplicableMatch isApplicableMatch, BTNode n) {
		Object[] result_pattern_node2node_2_4_solveCSP_binding = pattern_node2node_2_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, n);
		if (result_pattern_node2node_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_node2node_2_4_solveCSP_binding[0];

			Object[] result_pattern_node2node_2_4_solveCSP_black = pattern_node2node_2_4_solveCSP_blackB(csp);
			if (result_pattern_node2node_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_2_5_checkCSP_expressionFBB(node2node _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_node2node_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "node2node";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_node2node_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_node2node_10_1_initialbindings_blackBBB(node2node _this, Match match,
			XBTNode xn) {
		return new Object[] { _this, match, xn };
	}

	public static final Object[] pattern_node2node_10_2_SolveCSP_bindingFBBB(node2node _this, Match match, XBTNode xn) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xn };
		}
		return null;
	}

	public static final Object[] pattern_node2node_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_node2node_10_2_SolveCSP_bindingAndBlackFBBB(node2node _this, Match match,
			XBTNode xn) {
		Object[] result_pattern_node2node_10_2_SolveCSP_binding = pattern_node2node_10_2_SolveCSP_bindingFBBB(_this,
				match, xn);
		if (result_pattern_node2node_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_node2node_10_2_SolveCSP_binding[0];

			Object[] result_pattern_node2node_10_2_SolveCSP_black = pattern_node2node_10_2_SolveCSP_blackB(csp);
			if (result_pattern_node2node_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xn };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_10_3_CheckCSP_expressionFBB(node2node _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_10_4_collectelementstobetranslated_blackBB(Match match, XBTNode xn) {
		return new Object[] { match, xn };
	}

	public static final Object[] pattern_node2node_10_4_collectelementstobetranslated_greenBB(Match match, XBTNode xn) {
		match.getToBeTranslatedNodes().add(xn);
		return new Object[] { match, xn };
	}

	public static final Object[] pattern_node2node_10_5_collectcontextelements_blackBB(Match match, XBTNode xn) {
		return new Object[] { match, xn };
	}

	public static final void pattern_node2node_10_6_registerobjectstomatch_expressionBBB(node2node _this, Match match,
			XBTNode xn) {
		_this.registerObjectsToMatch_BWD(match, xn);

	}

	public static final boolean pattern_node2node_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_node2node_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_node2node_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("xn");
		EObject tmpXn = _localVariable_0;
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			return new Object[] { xn, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_node2node_11_1_performtransformation_blackBFBB(XBTNode xn, node2node _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { xn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_11_1_performtransformation_bindingAndBlackFFBB(node2node _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_node2node_11_1_performtransformation_binding = pattern_node2node_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_node2node_11_1_performtransformation_binding != null) {
			XBTNode xn = (XBTNode) result_pattern_node2node_11_1_performtransformation_binding[0];

			Object[] result_pattern_node2node_11_1_performtransformation_black = pattern_node2node_11_1_performtransformation_blackBFBB(
					xn, _this, isApplicableMatch);
			if (result_pattern_node2node_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_node2node_11_1_performtransformation_black[1];

				return new Object[] { xn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_11_1_performtransformation_greenBFF(XBTNode xn) {
		BTNode n = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode n2xn = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		n2xn.setSource(n);
		n2xn.setTarget(xn);
		return new Object[] { xn, n, n2xn };
	}

	public static final Object[] pattern_node2node_11_2_collecttranslatedelements_blackBBB(XBTNode xn, BTNode n,
			BTNode2XBTnode n2xn) {
		return new Object[] { xn, n, n2xn };
	}

	public static final Object[] pattern_node2node_11_2_collecttranslatedelements_greenFBBB(XBTNode xn, BTNode n,
			BTNode2XBTnode n2xn) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(xn);
		ruleresult.getCreatedElements().add(n);
		ruleresult.getCreatedLinkElements().add(n2xn);
		return new Object[] { ruleresult, xn, n, n2xn };
	}

	public static final Object[] pattern_node2node_11_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject xn, EObject n, EObject n2xn) {
		if (!n.equals(xn)) {
			if (!n.equals(n2xn)) {
				if (!n2xn.equals(xn)) {
					return new Object[] { ruleresult, xn, n, n2xn };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_11_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject xn, EObject n, EObject n2xn) {
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "node2node";
		String n2xn__n____source_name_prime = "source";
		String n2xn__xn____target_name_prime = "target";
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		ruleresult.getCreatedEdges().add(n2xn__n____source);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		ruleresult.getCreatedEdges().add(n2xn__xn____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		return new Object[] { ruleresult, xn, n, n2xn, n2xn__n____source, n2xn__xn____target };
	}

	public static final void pattern_node2node_11_5_registerobjects_expressionBBBBB(node2node _this,
			PerformRuleResult ruleresult, EObject xn, EObject n, EObject n2xn) {
		_this.registerObjects_BWD(ruleresult, xn, n, n2xn);

	}

	public static final PerformRuleResult pattern_node2node_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_node2node_12_1_preparereturnvalue_bindingFB(node2node _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_node2node_12_1_preparereturnvalue_blackFBB(EClass eClass, node2node _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_node2node_12_1_preparereturnvalue_bindingAndBlackFFB(node2node _this) {
		Object[] result_pattern_node2node_12_1_preparereturnvalue_binding = pattern_node2node_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_node2node_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_node2node_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_node2node_12_1_preparereturnvalue_black = pattern_node2node_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_node2node_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_node2node_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "node2node";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_node2node_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("xn");
		EObject tmpXn = _localVariable_0;
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			return new Object[] { xn, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_node2node_12_2_corematch_blackBB(XBTNode xn, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { xn, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_node2node_12_3_findcontext_blackB(XBTNode xn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { xn });
		return _result;
	}

	public static final Object[] pattern_node2node_12_3_findcontext_greenBF(XBTNode xn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(xn);
		return new Object[] { xn, isApplicableMatch };
	}

	public static final Object[] pattern_node2node_12_4_solveCSP_bindingFBBB(node2node _this,
			IsApplicableMatch isApplicableMatch, XBTNode xn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, xn };
		}
		return null;
	}

	public static final Object[] pattern_node2node_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_node2node_12_4_solveCSP_bindingAndBlackFBBB(node2node _this,
			IsApplicableMatch isApplicableMatch, XBTNode xn) {
		Object[] result_pattern_node2node_12_4_solveCSP_binding = pattern_node2node_12_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, xn);
		if (result_pattern_node2node_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_node2node_12_4_solveCSP_binding[0];

			Object[] result_pattern_node2node_12_4_solveCSP_black = pattern_node2node_12_4_solveCSP_blackB(csp);
			if (result_pattern_node2node_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, xn };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_12_5_checkCSP_expressionFBB(node2node _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_node2node_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "node2node";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_node2node_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_node2node_20_1_preparereturnvalue_bindingFB(node2node _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_node2node_20_1_preparereturnvalue_blackFBBF(EClass __eClass, node2node _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_node2node_20_1_preparereturnvalue_bindingAndBlackFFBF(node2node _this) {
		Object[] result_pattern_node2node_20_1_preparereturnvalue_binding = pattern_node2node_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_node2node_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_node2node_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_node2node_20_1_preparereturnvalue_black = pattern_node2node_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_node2node_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_node2node_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_node2node_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_black_nac_0B(XBTNode xn) {
		XBTNode __DEC_xn_w_544489 = xn.getW();
		if (__DEC_xn_w_544489 != null) {
			if (!xn.equals(__DEC_xn_w_544489)) {
				return new Object[] { xn };
			}
		}

		return null;
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_black_nac_1B(XBTNode xn) {
		XBTNode __DEC_xn_e_788691 = xn.getE();
		if (__DEC_xn_e_788691 != null) {
			if (!xn.equals(__DEC_xn_e_788691)) {
				return new Object[] { xn };
			}
		}

		return null;
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_black_nac_2B(XBTNode xn) {
		for (XBTNode __DEC_xn_w_878257 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "w")) {
			if (!xn.equals(__DEC_xn_w_878257)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_black_nac_3B(XBTNode xn) {
		for (XBTNode __DEC_xn_sw_159503 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "sw")) {
			if (!xn.equals(__DEC_xn_sw_159503)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_black_nac_4B(XBTNode xn) {
		for (XBTNode __DEC_xn_se_505215 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "se")) {
			if (!xn.equals(__DEC_xn_se_505215)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_black_nac_5B(XBTNode xn) {
		for (XBTNode __DEC_xn_e_3818 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "e")) {
			if (!xn.equals(__DEC_xn_e_3818)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_node2node_20_2_testcorematchandDECs_blackB(XBTNode xn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_node2node_20_2_testcorematchandDECs_black_nac_0B(xn) == null) {
			if (pattern_node2node_20_2_testcorematchandDECs_black_nac_1B(xn) == null) {
				if (pattern_node2node_20_2_testcorematchandDECs_black_nac_2B(xn) == null) {
					if (pattern_node2node_20_2_testcorematchandDECs_black_nac_3B(xn) == null) {
						if (pattern_node2node_20_2_testcorematchandDECs_black_nac_4B(xn) == null) {
							if (pattern_node2node_20_2_testcorematchandDECs_black_nac_5B(xn) == null) {
								_result.add(new Object[] { xn });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_node2node_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_node2node_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			node2node _this, Match match, XBTNode xn) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, xn);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_node2node_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			node2node _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_node2node_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_node2node_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_node2node_21_1_preparereturnvalue_bindingFB(node2node _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_node2node_21_1_preparereturnvalue_blackFBBF(EClass __eClass, node2node _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_node2node_21_1_preparereturnvalue_bindingAndBlackFFBF(node2node _this) {
		Object[] result_pattern_node2node_21_1_preparereturnvalue_binding = pattern_node2node_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_node2node_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_node2node_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_node2node_21_1_preparereturnvalue_black = pattern_node2node_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_node2node_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_node2node_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_node2node_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_node2node_21_2_testcorematchandDECs_black_nac_0B(BTNode n) {
		for (BTNode __DEC_n_l_984311 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
				BTNode.class, "l")) {
			if (!n.equals(__DEC_n_l_984311)) {
				return new Object[] { n };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_21_2_testcorematchandDECs_black_nac_1B(BTNode n) {
		for (BTNode __DEC_n_r_367284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
				BTNode.class, "r")) {
			if (!n.equals(__DEC_n_r_367284)) {
				return new Object[] { n };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_node2node_21_2_testcorematchandDECs_blackB(BTNode n) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_node2node_21_2_testcorematchandDECs_black_nac_0B(n) == null) {
			if (pattern_node2node_21_2_testcorematchandDECs_black_nac_1B(n) == null) {
				_result.add(new Object[] { n });
			}
		}
		return _result;
	}

	public static final Object[] pattern_node2node_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_node2node_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			node2node _this, Match match, BTNode n) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, n);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_node2node_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			node2node _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_node2node_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_node2node_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_node2node_24_1_prepare_blackB(node2node _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_node2node_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_node2node_24_2_matchsrctrgcontext_bindingFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("xn");
		EObject _localVariable_1 = sourceMatch.getObject("n");
		EObject tmpXn = _localVariable_0;
		EObject tmpN = _localVariable_1;
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			if (tmpN instanceof BTNode) {
				BTNode n = (BTNode) tmpN;
				return new Object[] { xn, n, targetMatch, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_24_2_matchsrctrgcontext_blackBBBB(XBTNode xn, BTNode n,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { xn, n, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_node2node_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_node2node_24_2_matchsrctrgcontext_binding = pattern_node2node_24_2_matchsrctrgcontext_bindingFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_node2node_24_2_matchsrctrgcontext_binding != null) {
			XBTNode xn = (XBTNode) result_pattern_node2node_24_2_matchsrctrgcontext_binding[0];
			BTNode n = (BTNode) result_pattern_node2node_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_node2node_24_2_matchsrctrgcontext_black = pattern_node2node_24_2_matchsrctrgcontext_blackBBBB(
					xn, n, sourceMatch, targetMatch);
			if (result_pattern_node2node_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { xn, n, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_24_3_solvecsp_bindingFBBBBB(node2node _this, XBTNode xn, BTNode n,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(xn, n, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, xn, n, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_node2node_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_node2node_24_3_solvecsp_bindingAndBlackFBBBBB(node2node _this, XBTNode xn,
			BTNode n, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_node2node_24_3_solvecsp_binding = pattern_node2node_24_3_solvecsp_bindingFBBBBB(_this,
				xn, n, sourceMatch, targetMatch);
		if (result_pattern_node2node_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_node2node_24_3_solvecsp_binding[0];

			Object[] result_pattern_node2node_24_3_solvecsp_black = pattern_node2node_24_3_solvecsp_blackB(csp);
			if (result_pattern_node2node_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, xn, n, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_node2node_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_node2node_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "node2node";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_node2node_24_6_createcorrespondence_blackBBB(XBTNode xn, BTNode n,
			CCMatch ccMatch) {
		return new Object[] { xn, n, ccMatch };
	}

	public static final Object[] pattern_node2node_24_6_createcorrespondence_greenBBFB(XBTNode xn, BTNode n,
			CCMatch ccMatch) {
		BTNode2XBTnode n2xn = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		n2xn.setSource(n);
		n2xn.setTarget(xn);
		ccMatch.getCreateCorr().add(n2xn);
		return new Object[] { xn, n, n2xn, ccMatch };
	}

	public static final Object[] pattern_node2node_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_node2node_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "node2node";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_node2node_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_node2node_27_1_matchtggpattern_black_nac_0B(BTNode n) {
		for (BTNode __DEC_n_l_531534 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
				BTNode.class, "l")) {
			if (!n.equals(__DEC_n_l_531534)) {
				return new Object[] { n };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_27_1_matchtggpattern_black_nac_1B(BTNode n) {
		for (BTNode __DEC_n_r_874493 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
				BTNode.class, "r")) {
			if (!n.equals(__DEC_n_r_874493)) {
				return new Object[] { n };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_27_1_matchtggpattern_blackB(BTNode n) {
		if (pattern_node2node_27_1_matchtggpattern_black_nac_0B(n) == null) {
			if (pattern_node2node_27_1_matchtggpattern_black_nac_1B(n) == null) {
				return new Object[] { n };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_node2node_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_black_nac_0B(XBTNode xn) {
		XBTNode __DEC_xn_w_935292 = xn.getW();
		if (__DEC_xn_w_935292 != null) {
			if (!xn.equals(__DEC_xn_w_935292)) {
				return new Object[] { xn };
			}
		}

		return null;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_black_nac_1B(XBTNode xn) {
		XBTNode __DEC_xn_e_672277 = xn.getE();
		if (__DEC_xn_e_672277 != null) {
			if (!xn.equals(__DEC_xn_e_672277)) {
				return new Object[] { xn };
			}
		}

		return null;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_black_nac_2B(XBTNode xn) {
		for (XBTNode __DEC_xn_w_436087 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "w")) {
			if (!xn.equals(__DEC_xn_w_436087)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_black_nac_3B(XBTNode xn) {
		for (XBTNode __DEC_xn_sw_500260 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "sw")) {
			if (!xn.equals(__DEC_xn_sw_500260)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_black_nac_4B(XBTNode xn) {
		for (XBTNode __DEC_xn_se_955186 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "se")) {
			if (!xn.equals(__DEC_xn_se_955186)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_black_nac_5B(XBTNode xn) {
		for (XBTNode __DEC_xn_e_993922 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
				XBTNode.class, "e")) {
			if (!xn.equals(__DEC_xn_e_993922)) {
				return new Object[] { xn };
			}
		}
		return null;
	}

	public static final Object[] pattern_node2node_28_1_matchtggpattern_blackB(XBTNode xn) {
		if (pattern_node2node_28_1_matchtggpattern_black_nac_0B(xn) == null) {
			if (pattern_node2node_28_1_matchtggpattern_black_nac_1B(xn) == null) {
				if (pattern_node2node_28_1_matchtggpattern_black_nac_2B(xn) == null) {
					if (pattern_node2node_28_1_matchtggpattern_black_nac_3B(xn) == null) {
						if (pattern_node2node_28_1_matchtggpattern_black_nac_4B(xn) == null) {
							if (pattern_node2node_28_1_matchtggpattern_black_nac_5B(xn) == null) {
								return new Object[] { xn };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_node2node_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_node2node_29_1_createresult_blackB(node2node _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_node2node_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_node2node_29_2_isapplicablecore_blackB(node2node _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_node2node_29_3_solveCSP_bindingFBBB(node2node _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_node2node_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_node2node_29_3_solveCSP_bindingAndBlackFBBB(node2node _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_node2node_29_3_solveCSP_binding = pattern_node2node_29_3_solveCSP_bindingFBBB(_this,
				isApplicableMatch, ruleResult);
		if (result_pattern_node2node_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_node2node_29_3_solveCSP_binding[0];

			Object[] result_pattern_node2node_29_3_solveCSP_black = pattern_node2node_29_3_solveCSP_blackB(csp);
			if (result_pattern_node2node_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_node2node_29_4_checkCSP_expressionFBB(node2node _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_node2node_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_node2node_29_6_perform_greenFFFB(ModelgeneratorRuleResult ruleResult) {
		XBTNode xn = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode n = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode n2xn = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(xn);
		ruleResult.getSourceObjects().add(n);
		n2xn.setSource(n);
		n2xn.setTarget(xn);
		ruleResult.getCorrObjects().add(n2xn);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { xn, n, n2xn, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_node2node_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //node2nodeImpl
