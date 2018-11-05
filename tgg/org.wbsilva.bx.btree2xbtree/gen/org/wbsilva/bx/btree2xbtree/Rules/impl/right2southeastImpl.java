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
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

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
import org.wbsilva.bx.btree2xbtree.Rules.right2southeast;

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
 * An implementation of the model object '<em><b>right2southeast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class right2southeastImpl extends AbstractRuleImpl implements right2southeast {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected right2southeastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.RIGHT2SOUTHEAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, BTNode n, BTNode c) {

		Object[] result1_black = right2southeastImpl.pattern_right2southeast_0_1_initialbindings_blackBBBB(this, match,
				n, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, n, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (right2southeastImpl.pattern_right2southeast_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = right2southeastImpl
					.pattern_right2southeast_0_4_collectelementstobetranslated_blackBBB(match, n, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			right2southeastImpl.pattern_right2southeast_0_4_collectelementstobetranslated_greenBBBF(match, n, c);
			//nothing EMoflonEdge n__c____r = (EMoflonEdge) result4_green[3];

			Object[] result5_black = right2southeastImpl
					.pattern_right2southeast_0_5_collectcontextelements_blackBBB(match, n, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			right2southeastImpl.pattern_right2southeast_0_5_collectcontextelements_greenBB(match, n);

			// 
			right2southeastImpl.pattern_right2southeast_0_6_registerobjectstomatch_expressionBBBB(this, match, n, c);
			return right2southeastImpl.pattern_right2southeast_0_7_expressionF();
		} else {
			return right2southeastImpl.pattern_right2southeast_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BTNode n = (BTNode) result1_bindingAndBlack[0];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[1];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[2];
		BTNode c = (BTNode) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = right2southeastImpl.pattern_right2southeast_1_1_performtransformation_greenFFBB(xn, c);
		XBTNode xc = (XBTNode) result1_green[0];
		BTNode2XBTnode l2se = (BTNode2XBTnode) result1_green[1];

		Object[] result2_black = right2southeastImpl.pattern_right2southeast_1_2_collecttranslatedelements_blackBBB(xc,
				l2se, c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xc] = " + xc + ", " + "[l2se] = "
					+ l2se + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = right2southeastImpl.pattern_right2southeast_1_2_collecttranslatedelements_greenFBBB(xc,
				l2se, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = right2southeastImpl
				.pattern_right2southeast_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, xc, n, l2se, xn, n2xn, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xc] = " + xc + ", " + "[n] = " + n + ", " + "[l2se] = " + l2se + ", " + "[xn] = " + xn
					+ ", " + "[n2xn] = " + n2xn + ", " + "[c] = " + c + ".");
		}
		right2southeastImpl.pattern_right2southeast_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, xc, n, l2se, xn,
				c);
		//nothing EMoflonEdge l2se__xc____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge n__c____r = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xn__xc____se = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge l2se__c____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		right2southeastImpl.pattern_right2southeast_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, xc, n,
				l2se, xn, n2xn, c);
		return right2southeastImpl.pattern_right2southeast_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = right2southeastImpl
				.pattern_right2southeast_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = right2southeastImpl.pattern_right2southeast_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BTNode n = (BTNode) result2_binding[0];
		BTNode c = (BTNode) result2_binding[1];
		for (Object[] result2_black : right2southeastImpl.pattern_right2southeast_2_2_corematch_blackBFFBB(n, c,
				match)) {
			XBTNode xn = (XBTNode) result2_black[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			// ForEach 
			for (Object[] result3_black : right2southeastImpl.pattern_right2southeast_2_3_findcontext_blackBBBB(n, xn,
					n2xn, c)) {
				Object[] result3_green = right2southeastImpl.pattern_right2southeast_2_3_findcontext_greenBBBBFFFF(n,
						xn, n2xn, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge n__c____r = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = right2southeastImpl
						.pattern_right2southeast_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, xn,
								n2xn, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xn] = " + xn
							+ ", " + "[n2xn] = " + n2xn + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (right2southeastImpl.pattern_right2southeast_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = right2southeastImpl
							.pattern_right2southeast_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					right2southeastImpl.pattern_right2southeast_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return right2southeastImpl.pattern_right2southeast_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, BTNode n, BTNode c) {
		match.registerObject("n", n);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BTNode n, BTNode c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			BTNode c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn,
			EObject n2xn, EObject c) {
		ruleresult.registerObject("xc", xc);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("l2se", l2se);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("btree.BTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, XBTNode xc, XBTNode xn) {

		Object[] result1_black = right2southeastImpl.pattern_right2southeast_10_1_initialbindings_blackBBBB(this, match,
				xc, xn);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xc] = " + xc + ", " + "[xn] = " + xn + ".");
		}

		Object[] result2_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, xc, xn);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xc] = " + xc + ", " + "[xn] = " + xn + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (right2southeastImpl.pattern_right2southeast_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = right2southeastImpl
					.pattern_right2southeast_10_4_collectelementstobetranslated_blackBBB(match, xc, xn);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xc] = " + xc + ", " + "[xn] = " + xn + ".");
			}
			right2southeastImpl.pattern_right2southeast_10_4_collectelementstobetranslated_greenBBBF(match, xc, xn);
			//nothing EMoflonEdge xn__xc____se = (EMoflonEdge) result4_green[3];

			Object[] result5_black = right2southeastImpl
					.pattern_right2southeast_10_5_collectcontextelements_blackBBB(match, xc, xn);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xc] = " + xc + ", " + "[xn] = " + xn + ".");
			}
			right2southeastImpl.pattern_right2southeast_10_5_collectcontextelements_greenBB(match, xn);

			// 
			right2southeastImpl.pattern_right2southeast_10_6_registerobjectstomatch_expressionBBBB(this, match, xc, xn);
			return right2southeastImpl.pattern_right2southeast_10_7_expressionF();
		} else {
			return right2southeastImpl.pattern_right2southeast_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		XBTNode xc = (XBTNode) result1_bindingAndBlack[0];
		BTNode n = (BTNode) result1_bindingAndBlack[1];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[2];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = right2southeastImpl.pattern_right2southeast_11_1_performtransformation_greenBBFF(xc,
				n);
		BTNode2XBTnode l2se = (BTNode2XBTnode) result1_green[2];
		BTNode c = (BTNode) result1_green[3];

		Object[] result2_black = right2southeastImpl.pattern_right2southeast_11_2_collecttranslatedelements_blackBBB(xc,
				l2se, c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xc] = " + xc + ", " + "[l2se] = "
					+ l2se + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = right2southeastImpl
				.pattern_right2southeast_11_2_collecttranslatedelements_greenFBBB(xc, l2se, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = right2southeastImpl
				.pattern_right2southeast_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, xc, n, l2se, xn, n2xn, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xc] = " + xc + ", " + "[n] = " + n + ", " + "[l2se] = " + l2se + ", " + "[xn] = " + xn
					+ ", " + "[n2xn] = " + n2xn + ", " + "[c] = " + c + ".");
		}
		right2southeastImpl.pattern_right2southeast_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, xc, n, l2se,
				xn, c);
		//nothing EMoflonEdge l2se__xc____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge n__c____r = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xn__xc____se = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge l2se__c____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		right2southeastImpl.pattern_right2southeast_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, xc, n,
				l2se, xn, n2xn, c);
		return right2southeastImpl.pattern_right2southeast_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = right2southeastImpl
				.pattern_right2southeast_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = right2southeastImpl.pattern_right2southeast_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XBTNode xc = (XBTNode) result2_binding[0];
		XBTNode xn = (XBTNode) result2_binding[1];
		for (Object[] result2_black : right2southeastImpl.pattern_right2southeast_12_2_corematch_blackBFBFB(xc, xn,
				match)) {
			BTNode n = (BTNode) result2_black[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[3];
			// ForEach 
			for (Object[] result3_black : right2southeastImpl.pattern_right2southeast_12_3_findcontext_blackBBBB(xc, n,
					xn, n2xn)) {
				Object[] result3_green = right2southeastImpl.pattern_right2southeast_12_3_findcontext_greenBBBBFFFF(xc,
						n, xn, n2xn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xn__xc____se = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = right2southeastImpl
						.pattern_right2southeast_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, xc, n,
								xn, n2xn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[xc] = " + xc + ", " + "[n] = " + n
							+ ", " + "[xn] = " + xn + ", " + "[n2xn] = " + n2xn + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (right2southeastImpl.pattern_right2southeast_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = right2southeastImpl
							.pattern_right2southeast_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					right2southeastImpl.pattern_right2southeast_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return right2southeastImpl.pattern_right2southeast_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, XBTNode xc, XBTNode xn) {
		match.registerObject("xc", xc);
		match.registerObject("xn", xn);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, XBTNode xc, XBTNode xn) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XBTNode xc, BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("xc", xc);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("n2xn", n2xn);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn,
			EObject n2xn, EObject c) {
		ruleresult.registerObject("xc", xc);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("l2se", l2se);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xc").eClass()).equals("xbtree.XBTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_112(EMoflonEdge _edge_se) {

		Object[] result1_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = right2southeastImpl.pattern_right2southeast_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : right2southeastImpl
				.pattern_right2southeast_20_2_testcorematchandDECs_blackFFB(_edge_se)) {
			XBTNode xc = (XBTNode) result2_black[0];
			XBTNode xn = (XBTNode) result2_black[1];
			Object[] result2_green = right2southeastImpl
					.pattern_right2southeast_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (right2southeastImpl
					.pattern_right2southeast_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							xc, xn)) {
				// 
				if (right2southeastImpl
						.pattern_right2southeast_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = right2southeastImpl
							.pattern_right2southeast_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					right2southeastImpl.pattern_right2southeast_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return right2southeastImpl.pattern_right2southeast_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_120(EMoflonEdge _edge_r) {

		Object[] result1_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = right2southeastImpl.pattern_right2southeast_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : right2southeastImpl
				.pattern_right2southeast_21_2_testcorematchandDECs_blackFFB(_edge_r)) {
			BTNode n = (BTNode) result2_black[0];
			BTNode c = (BTNode) result2_black[1];
			Object[] result2_green = right2southeastImpl
					.pattern_right2southeast_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (right2southeastImpl
					.pattern_right2southeast_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							n, c)) {
				// 
				if (right2southeastImpl
						.pattern_right2southeast_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = right2southeastImpl
							.pattern_right2southeast_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					right2southeastImpl.pattern_right2southeast_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return right2southeastImpl.pattern_right2southeast_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("right2southeast");
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
		ruleResult.setRule("right2southeast");
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

		Object[] result1_black = right2southeastImpl.pattern_right2southeast_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = right2southeastImpl.pattern_right2southeast_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		XBTNode xc = (XBTNode) result2_bindingAndBlack[0];
		BTNode n = (BTNode) result2_bindingAndBlack[1];
		XBTNode xn = (XBTNode) result2_bindingAndBlack[2];
		BTNode c = (BTNode) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = right2southeastImpl
				.pattern_right2southeast_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, xc, n, xn, c, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[xc] = " + xc + ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[c] = " + c + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (right2southeastImpl.pattern_right2southeast_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : right2southeastImpl
					.pattern_right2southeast_24_5_matchcorrcontext_blackBBFBB(n, xn, sourceMatch, targetMatch)) {
				BTNode2XBTnode n2xn = (BTNode2XBTnode) result5_black[2];
				Object[] result5_green = right2southeastImpl
						.pattern_right2southeast_24_5_matchcorrcontext_greenBBBF(n2xn, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = right2southeastImpl
						.pattern_right2southeast_24_6_createcorrespondence_blackBBBBB(xc, n, xn, c, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[xc] = " + xc + ", " + "[n] = " + n + ", "
									+ "[xn] = " + xn + ", " + "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				right2southeastImpl.pattern_right2southeast_24_6_createcorrespondence_greenBFBB(xc, c, ccMatch);
				//nothing BTNode2XBTnode l2se = (BTNode2XBTnode) result6_green[1];

				Object[] result7_black = right2southeastImpl
						.pattern_right2southeast_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				right2southeastImpl.pattern_right2southeast_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return right2southeastImpl.pattern_right2southeast_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(XBTNode xc, BTNode n, XBTNode xn, BTNode c, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(BTNode n, BTNode c) {// 
		Object[] result1_black = right2southeastImpl.pattern_right2southeast_27_1_matchtggpattern_blackBB(n, c);
		if (result1_black != null) {
			return right2southeastImpl.pattern_right2southeast_27_2_expressionF();
		} else {
			return right2southeastImpl.pattern_right2southeast_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(XBTNode xc, XBTNode xn) {// 
		Object[] result1_black = right2southeastImpl.pattern_right2southeast_28_1_matchtggpattern_blackBB(xc, xn);
		if (result1_black != null) {
			return right2southeastImpl.pattern_right2southeast_28_2_expressionF();
		} else {
			return right2southeastImpl.pattern_right2southeast_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, BTNode2XBTnode n2xnParameter) {

		Object[] result1_black = right2southeastImpl.pattern_right2southeast_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = right2southeastImpl.pattern_right2southeast_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : right2southeastImpl
				.pattern_right2southeast_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList n2xnList = (RuleEntryList) result2_black[0];
			BTNode n = (BTNode) result2_black[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			XBTNode xn = (XBTNode) result2_black[3];

			Object[] result3_bindingAndBlack = right2southeastImpl
					.pattern_right2southeast_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, xn, n2xn,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xn] = " + xn
						+ ", " + "[n2xn] = " + n2xn + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (right2southeastImpl.pattern_right2southeast_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = right2southeastImpl.pattern_right2southeast_29_5_checknacs_blackBBB(n, xn,
						n2xn);
				if (result5_black != null) {

					Object[] result6_black = right2southeastImpl.pattern_right2southeast_29_6_perform_blackBBBB(n, xn,
							n2xn, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[n] = " + n + ", " + "[xn] = " + xn
										+ ", " + "[n2xn] = " + n2xn + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					right2southeastImpl.pattern_right2southeast_29_6_perform_greenFBFBFB(n, xn, ruleResult);
					//nothing XBTNode xc = (XBTNode) result6_green[0];
					//nothing BTNode2XBTnode l2se = (BTNode2XBTnode) result6_green[2];
					//nothing BTNode c = (BTNode) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return right2southeastImpl.pattern_right2southeast_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("n2xn", n2xn);
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
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE:
			return isAppropriate_FWD((Match) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
		case RulesPackage.RIGHT2SOUTHEAST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
			return null;
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode) arguments.get(2));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_BTNODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3), (BTNode) arguments.get(4));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.RIGHT2SOUTHEAST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE:
			return isAppropriate_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2));
		case RulesPackage.RIGHT2SOUTHEAST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2));
			return null;
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE_BTNODE_XBTNODE_BTNODE2XBTNODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (XBTNode) arguments.get(1),
					(BTNode) arguments.get(2), (XBTNode) arguments.get(3), (BTNode2XBTnode) arguments.get(4));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.RIGHT2SOUTHEAST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_112__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_112((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_120__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_120((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_SOLVE_CSP_CC__XBTNODE_BTNODE_XBTNODE_BTNODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((XBTNode) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.RIGHT2SOUTHEAST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.RIGHT2SOUTHEAST___CHECK_DEC_FWD__BTNODE_BTNODE:
			return checkDEC_FWD((BTNode) arguments.get(0), (BTNode) arguments.get(1));
		case RulesPackage.RIGHT2SOUTHEAST___CHECK_DEC_BWD__XBTNODE_XBTNODE:
			return checkDEC_BWD((XBTNode) arguments.get(0), (XBTNode) arguments.get(1));
		case RulesPackage.RIGHT2SOUTHEAST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE:
			return generateModel((RuleEntryContainer) arguments.get(0), (BTNode2XBTnode) arguments.get(1));
		case RulesPackage.RIGHT2SOUTHEAST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.RIGHT2SOUTHEAST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_right2southeast_0_1_initialbindings_blackBBBB(right2southeast _this,
			Match match, BTNode n, BTNode c) {
		if (!c.equals(n)) {
			return new Object[] { _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_0_2_SolveCSP_bindingFBBBB(right2southeast _this, Match match,
			BTNode n, BTNode c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, n, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_right2southeast_0_2_SolveCSP_bindingAndBlackFBBBB(right2southeast _this,
			Match match, BTNode n, BTNode c) {
		Object[] result_pattern_right2southeast_0_2_SolveCSP_binding = pattern_right2southeast_0_2_SolveCSP_bindingFBBBB(
				_this, match, n, c);
		if (result_pattern_right2southeast_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_right2southeast_0_2_SolveCSP_binding[0];

			Object[] result_pattern_right2southeast_0_2_SolveCSP_black = pattern_right2southeast_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_right2southeast_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, n, c };
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_0_3_CheckCSP_expressionFBB(right2southeast _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_0_4_collectelementstobetranslated_blackBBB(Match match,
			BTNode n, BTNode c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_0_4_collectelementstobetranslated_greenBBBF(Match match,
			BTNode n, BTNode c) {
		EMoflonEdge n__c____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String n__c____r_name_prime = "r";
		n__c____r.setSrc(n);
		n__c____r.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____r);
		n__c____r.setName(n__c____r_name_prime);
		return new Object[] { match, n, c, n__c____r };
	}

	public static final Object[] pattern_right2southeast_0_5_collectcontextelements_blackBBB(Match match, BTNode n,
			BTNode c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_0_5_collectcontextelements_greenBB(Match match, BTNode n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_right2southeast_0_6_registerobjectstomatch_expressionBBBB(right2southeast _this,
			Match match, BTNode n, BTNode c) {
		_this.registerObjectsToMatch_FWD(match, n, c);

	}

	public static final boolean pattern_right2southeast_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_right2southeast_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_right2southeast_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject _localVariable_1 = isApplicableMatch.getObject("xn");
		EObject _localVariable_2 = isApplicableMatch.getObject("n2xn");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		EObject tmpN2xn = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				if (tmpN2xn instanceof BTNode2XBTnode) {
					BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
					if (tmpC instanceof BTNode) {
						BTNode c = (BTNode) tmpC;
						return new Object[] { n, xn, n2xn, c, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_1_1_performtransformation_blackBBBBFBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, BTNode c, right2southeast _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(n)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { n, xn, n2xn, c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_1_1_performtransformation_bindingAndBlackFFFFFBB(
			right2southeast _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_right2southeast_1_1_performtransformation_binding = pattern_right2southeast_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_right2southeast_1_1_performtransformation_binding != null) {
			BTNode n = (BTNode) result_pattern_right2southeast_1_1_performtransformation_binding[0];
			XBTNode xn = (XBTNode) result_pattern_right2southeast_1_1_performtransformation_binding[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_right2southeast_1_1_performtransformation_binding[2];
			BTNode c = (BTNode) result_pattern_right2southeast_1_1_performtransformation_binding[3];

			Object[] result_pattern_right2southeast_1_1_performtransformation_black = pattern_right2southeast_1_1_performtransformation_blackBBBBFBB(
					n, xn, n2xn, c, _this, isApplicableMatch);
			if (result_pattern_right2southeast_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_right2southeast_1_1_performtransformation_black[4];

				return new Object[] { n, xn, n2xn, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_1_1_performtransformation_greenFFBB(XBTNode xn, BTNode c) {
		XBTNode xc = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode l2se = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		xn.setSe(xc);
		l2se.setTarget(xc);
		l2se.setSource(c);
		return new Object[] { xc, l2se, xn, c };
	}

	public static final Object[] pattern_right2southeast_1_2_collecttranslatedelements_blackBBB(XBTNode xc,
			BTNode2XBTnode l2se, BTNode c) {
		return new Object[] { xc, l2se, c };
	}

	public static final Object[] pattern_right2southeast_1_2_collecttranslatedelements_greenFBBB(XBTNode xc,
			BTNode2XBTnode l2se, BTNode c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(xc);
		ruleresult.getCreatedLinkElements().add(l2se);
		ruleresult.getTranslatedElements().add(c);
		return new Object[] { ruleresult, xc, l2se, c };
	}

	public static final Object[] pattern_right2southeast_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn, EObject n2xn, EObject c) {
		if (!xc.equals(xn)) {
			if (!n.equals(xc)) {
				if (!n.equals(xn)) {
					if (!n.equals(n2xn)) {
						if (!l2se.equals(xc)) {
							if (!l2se.equals(n)) {
								if (!l2se.equals(xn)) {
									if (!l2se.equals(n2xn)) {
										if (!n2xn.equals(xc)) {
											if (!n2xn.equals(xn)) {
												if (!c.equals(xc)) {
													if (!c.equals(n)) {
														if (!c.equals(l2se)) {
															if (!c.equals(xn)) {
																if (!c.equals(n2xn)) {
																	return new Object[] { ruleresult, xc, n, l2se, xn,
																			n2xn, c };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn, EObject c) {
		EMoflonEdge l2se__xc____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xc____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2se__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "right2southeast";
		String l2se__xc____target_name_prime = "target";
		String n__c____r_name_prime = "r";
		String xn__xc____se_name_prime = "se";
		String l2se__c____source_name_prime = "source";
		l2se__xc____target.setSrc(l2se);
		l2se__xc____target.setTrg(xc);
		ruleresult.getCreatedEdges().add(l2se__xc____target);
		n__c____r.setSrc(n);
		n__c____r.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____r);
		xn__xc____se.setSrc(xn);
		xn__xc____se.setTrg(xc);
		ruleresult.getCreatedEdges().add(xn__xc____se);
		l2se__c____source.setSrc(l2se);
		l2se__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(l2se__c____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2se__xc____target.setName(l2se__xc____target_name_prime);
		n__c____r.setName(n__c____r_name_prime);
		xn__xc____se.setName(xn__xc____se_name_prime);
		l2se__c____source.setName(l2se__c____source_name_prime);
		return new Object[] { ruleresult, xc, n, l2se, xn, c, l2se__xc____target, n__c____r, xn__xc____se,
				l2se__c____source };
	}

	public static final void pattern_right2southeast_1_5_registerobjects_expressionBBBBBBBB(right2southeast _this,
			PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn, EObject n2xn, EObject c) {
		_this.registerObjects_FWD(ruleresult, xc, n, l2se, xn, n2xn, c);

	}

	public static final PerformRuleResult pattern_right2southeast_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_right2southeast_2_1_preparereturnvalue_bindingFB(right2southeast _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_2_1_preparereturnvalue_blackFBB(EClass eClass,
			right2southeast _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_right2southeast_2_1_preparereturnvalue_bindingAndBlackFFB(
			right2southeast _this) {
		Object[] result_pattern_right2southeast_2_1_preparereturnvalue_binding = pattern_right2southeast_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_right2southeast_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_right2southeast_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_right2southeast_2_1_preparereturnvalue_black = pattern_right2southeast_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_right2southeast_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_right2southeast_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "right2southeast";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_right2southeast_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("n");
		EObject _localVariable_1 = match.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpC = _localVariable_1;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			if (tmpC instanceof BTNode) {
				BTNode c = (BTNode) tmpC;
				return new Object[] { n, c, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_right2southeast_2_2_corematch_blackBFFBB(BTNode n, BTNode c,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
					BTNode2XBTnode.class, "source")) {
				XBTNode xn = n2xn.getTarget();
				if (xn != null) {
					_result.add(new Object[] { n, xn, n2xn, c, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_right2southeast_2_3_findcontext_blackBBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, BTNode c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (c.equals(n.getR())) {
				if (n.equals(n2xn.getSource())) {
					if (xn.equals(n2xn.getTarget())) {
						_result.add(new Object[] { n, xn, n2xn, c });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_right2southeast_2_3_findcontext_greenBBBBFFFF(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, BTNode c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n__c____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__c____r_name_prime = "r";
		String n2xn__n____source_name_prime = "source";
		String n2xn__xn____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(c);
		n__c____r.setSrc(n);
		n__c____r.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____r);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n__c____r.setName(n__c____r_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		return new Object[] { n, xn, n2xn, c, isApplicableMatch, n__c____r, n2xn__n____source, n2xn__xn____target };
	}

	public static final Object[] pattern_right2southeast_2_4_solveCSP_bindingFBBBBBB(right2southeast _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, BTNode c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, n, xn, n2xn, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, c };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_right2southeast_2_4_solveCSP_bindingAndBlackFBBBBBB(right2southeast _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, BTNode c) {
		Object[] result_pattern_right2southeast_2_4_solveCSP_binding = pattern_right2southeast_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, xn, n2xn, c);
		if (result_pattern_right2southeast_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_right2southeast_2_4_solveCSP_binding[0];

			Object[] result_pattern_right2southeast_2_4_solveCSP_black = pattern_right2southeast_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_right2southeast_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, c };
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_2_5_checkCSP_expressionFBB(right2southeast _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_right2southeast_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "right2southeast";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_right2southeast_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_right2southeast_10_1_initialbindings_blackBBBB(right2southeast _this,
			Match match, XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			return new Object[] { _this, match, xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_10_2_SolveCSP_bindingFBBBB(right2southeast _this, Match match,
			XBTNode xc, XBTNode xn) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, xc, xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_right2southeast_10_2_SolveCSP_bindingAndBlackFBBBB(right2southeast _this,
			Match match, XBTNode xc, XBTNode xn) {
		Object[] result_pattern_right2southeast_10_2_SolveCSP_binding = pattern_right2southeast_10_2_SolveCSP_bindingFBBBB(
				_this, match, xc, xn);
		if (result_pattern_right2southeast_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_right2southeast_10_2_SolveCSP_binding[0];

			Object[] result_pattern_right2southeast_10_2_SolveCSP_black = pattern_right2southeast_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_right2southeast_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xc, xn };
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_10_3_CheckCSP_expressionFBB(right2southeast _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_10_4_collectelementstobetranslated_blackBBB(Match match,
			XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			return new Object[] { match, xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_10_4_collectelementstobetranslated_greenBBBF(Match match,
			XBTNode xc, XBTNode xn) {
		EMoflonEdge xn__xc____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xc);
		String xn__xc____se_name_prime = "se";
		xn__xc____se.setSrc(xn);
		xn__xc____se.setTrg(xc);
		match.getToBeTranslatedEdges().add(xn__xc____se);
		xn__xc____se.setName(xn__xc____se_name_prime);
		return new Object[] { match, xc, xn, xn__xc____se };
	}

	public static final Object[] pattern_right2southeast_10_5_collectcontextelements_blackBBB(Match match, XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			return new Object[] { match, xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_10_5_collectcontextelements_greenBB(Match match, XBTNode xn) {
		match.getContextNodes().add(xn);
		return new Object[] { match, xn };
	}

	public static final void pattern_right2southeast_10_6_registerobjectstomatch_expressionBBBB(right2southeast _this,
			Match match, XBTNode xc, XBTNode xn) {
		_this.registerObjectsToMatch_BWD(match, xc, xn);

	}

	public static final boolean pattern_right2southeast_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_right2southeast_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_right2southeast_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("xc");
		EObject _localVariable_1 = isApplicableMatch.getObject("n");
		EObject _localVariable_2 = isApplicableMatch.getObject("xn");
		EObject _localVariable_3 = isApplicableMatch.getObject("n2xn");
		EObject tmpXc = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpXn = _localVariable_2;
		EObject tmpN2xn = _localVariable_3;
		if (tmpXc instanceof XBTNode) {
			XBTNode xc = (XBTNode) tmpXc;
			if (tmpN instanceof BTNode) {
				BTNode n = (BTNode) tmpN;
				if (tmpXn instanceof XBTNode) {
					XBTNode xn = (XBTNode) tmpXn;
					if (tmpN2xn instanceof BTNode2XBTnode) {
						BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
						return new Object[] { xc, n, xn, n2xn, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_11_1_performtransformation_blackBBBBFBB(XBTNode xc, BTNode n,
			XBTNode xn, BTNode2XBTnode n2xn, right2southeast _this, IsApplicableMatch isApplicableMatch) {
		if (!xc.equals(xn)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { xc, n, xn, n2xn, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_11_1_performtransformation_bindingAndBlackFFFFFBB(
			right2southeast _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_right2southeast_11_1_performtransformation_binding = pattern_right2southeast_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_right2southeast_11_1_performtransformation_binding != null) {
			XBTNode xc = (XBTNode) result_pattern_right2southeast_11_1_performtransformation_binding[0];
			BTNode n = (BTNode) result_pattern_right2southeast_11_1_performtransformation_binding[1];
			XBTNode xn = (XBTNode) result_pattern_right2southeast_11_1_performtransformation_binding[2];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_right2southeast_11_1_performtransformation_binding[3];

			Object[] result_pattern_right2southeast_11_1_performtransformation_black = pattern_right2southeast_11_1_performtransformation_blackBBBBFBB(
					xc, n, xn, n2xn, _this, isApplicableMatch);
			if (result_pattern_right2southeast_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_right2southeast_11_1_performtransformation_black[4];

				return new Object[] { xc, n, xn, n2xn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_11_1_performtransformation_greenBBFF(XBTNode xc, BTNode n) {
		BTNode2XBTnode l2se = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode c = BtreeFactory.eINSTANCE.createBTNode();
		l2se.setTarget(xc);
		n.setR(c);
		l2se.setSource(c);
		return new Object[] { xc, n, l2se, c };
	}

	public static final Object[] pattern_right2southeast_11_2_collecttranslatedelements_blackBBB(XBTNode xc,
			BTNode2XBTnode l2se, BTNode c) {
		return new Object[] { xc, l2se, c };
	}

	public static final Object[] pattern_right2southeast_11_2_collecttranslatedelements_greenFBBB(XBTNode xc,
			BTNode2XBTnode l2se, BTNode c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(xc);
		ruleresult.getCreatedLinkElements().add(l2se);
		ruleresult.getCreatedElements().add(c);
		return new Object[] { ruleresult, xc, l2se, c };
	}

	public static final Object[] pattern_right2southeast_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn, EObject n2xn, EObject c) {
		if (!xc.equals(xn)) {
			if (!n.equals(xc)) {
				if (!n.equals(xn)) {
					if (!n.equals(n2xn)) {
						if (!l2se.equals(xc)) {
							if (!l2se.equals(n)) {
								if (!l2se.equals(xn)) {
									if (!l2se.equals(n2xn)) {
										if (!n2xn.equals(xc)) {
											if (!n2xn.equals(xn)) {
												if (!c.equals(xc)) {
													if (!c.equals(n)) {
														if (!c.equals(l2se)) {
															if (!c.equals(xn)) {
																if (!c.equals(n2xn)) {
																	return new Object[] { ruleresult, xc, n, l2se, xn,
																			n2xn, c };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn, EObject c) {
		EMoflonEdge l2se__xc____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xc____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2se__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "right2southeast";
		String l2se__xc____target_name_prime = "target";
		String n__c____r_name_prime = "r";
		String xn__xc____se_name_prime = "se";
		String l2se__c____source_name_prime = "source";
		l2se__xc____target.setSrc(l2se);
		l2se__xc____target.setTrg(xc);
		ruleresult.getCreatedEdges().add(l2se__xc____target);
		n__c____r.setSrc(n);
		n__c____r.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____r);
		xn__xc____se.setSrc(xn);
		xn__xc____se.setTrg(xc);
		ruleresult.getTranslatedEdges().add(xn__xc____se);
		l2se__c____source.setSrc(l2se);
		l2se__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(l2se__c____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2se__xc____target.setName(l2se__xc____target_name_prime);
		n__c____r.setName(n__c____r_name_prime);
		xn__xc____se.setName(xn__xc____se_name_prime);
		l2se__c____source.setName(l2se__c____source_name_prime);
		return new Object[] { ruleresult, xc, n, l2se, xn, c, l2se__xc____target, n__c____r, xn__xc____se,
				l2se__c____source };
	}

	public static final void pattern_right2southeast_11_5_registerobjects_expressionBBBBBBBB(right2southeast _this,
			PerformRuleResult ruleresult, EObject xc, EObject n, EObject l2se, EObject xn, EObject n2xn, EObject c) {
		_this.registerObjects_BWD(ruleresult, xc, n, l2se, xn, n2xn, c);

	}

	public static final PerformRuleResult pattern_right2southeast_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_right2southeast_12_1_preparereturnvalue_bindingFB(right2southeast _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_12_1_preparereturnvalue_blackFBB(EClass eClass,
			right2southeast _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_right2southeast_12_1_preparereturnvalue_bindingAndBlackFFB(
			right2southeast _this) {
		Object[] result_pattern_right2southeast_12_1_preparereturnvalue_binding = pattern_right2southeast_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_right2southeast_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_right2southeast_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_right2southeast_12_1_preparereturnvalue_black = pattern_right2southeast_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_right2southeast_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_right2southeast_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "right2southeast";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_right2southeast_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xc");
		EObject _localVariable_1 = match.getObject("xn");
		EObject tmpXc = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		if (tmpXc instanceof XBTNode) {
			XBTNode xc = (XBTNode) tmpXc;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				return new Object[] { xc, xn, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_right2southeast_12_2_corematch_blackBFBFB(XBTNode xc, XBTNode xn,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xc.equals(xn)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
					BTNode2XBTnode.class, "target")) {
				BTNode n = n2xn.getSource();
				if (n != null) {
					_result.add(new Object[] { xc, n, xn, n2xn, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_right2southeast_12_3_findcontext_blackBBBB(XBTNode xc, BTNode n,
			XBTNode xn, BTNode2XBTnode n2xn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xc.equals(xn)) {
			if (n.equals(n2xn.getSource())) {
				if (xn.equals(n2xn.getTarget())) {
					if (xc.equals(xn.getSe())) {
						_result.add(new Object[] { xc, n, xn, n2xn });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_right2southeast_12_3_findcontext_greenBBBBFFFF(XBTNode xc, BTNode n,
			XBTNode xn, BTNode2XBTnode n2xn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xc____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n2xn__n____source_name_prime = "source";
		String n2xn__xn____target_name_prime = "target";
		String xn__xc____se_name_prime = "se";
		isApplicableMatch.getAllContextElements().add(xc);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n2xn);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		xn__xc____se.setSrc(xn);
		xn__xc____se.setTrg(xc);
		isApplicableMatch.getAllContextElements().add(xn__xc____se);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		xn__xc____se.setName(xn__xc____se_name_prime);
		return new Object[] { xc, n, xn, n2xn, isApplicableMatch, n2xn__n____source, n2xn__xn____target, xn__xc____se };
	}

	public static final Object[] pattern_right2southeast_12_4_solveCSP_bindingFBBBBBB(right2southeast _this,
			IsApplicableMatch isApplicableMatch, XBTNode xc, BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, xc, n, xn, n2xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, xc, n, xn, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_right2southeast_12_4_solveCSP_bindingAndBlackFBBBBBB(right2southeast _this,
			IsApplicableMatch isApplicableMatch, XBTNode xc, BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		Object[] result_pattern_right2southeast_12_4_solveCSP_binding = pattern_right2southeast_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, xc, n, xn, n2xn);
		if (result_pattern_right2southeast_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_right2southeast_12_4_solveCSP_binding[0];

			Object[] result_pattern_right2southeast_12_4_solveCSP_black = pattern_right2southeast_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_right2southeast_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, xc, n, xn, n2xn };
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_12_5_checkCSP_expressionFBB(right2southeast _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_right2southeast_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "right2southeast";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_right2southeast_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_right2southeast_20_1_preparereturnvalue_bindingFB(right2southeast _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			right2southeast _this) {
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

	public static final Object[] pattern_right2southeast_20_1_preparereturnvalue_bindingAndBlackFFBF(
			right2southeast _this) {
		Object[] result_pattern_right2southeast_20_1_preparereturnvalue_binding = pattern_right2southeast_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_right2southeast_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_right2southeast_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_right2southeast_20_1_preparereturnvalue_black = pattern_right2southeast_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_right2southeast_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_right2southeast_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_right2southeast_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_0BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_w_465608 = xc.getW();
			if (__DEC_xc_w_465608 != null) {
				if (!xc.equals(__DEC_xc_w_465608)) {
					if (!xn.equals(__DEC_xc_w_465608)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_1BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_e_185799 = xc.getE();
			if (__DEC_xc_e_185799 != null) {
				if (!xc.equals(__DEC_xc_e_185799)) {
					if (!xn.equals(__DEC_xc_e_185799)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_2BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_w_988163 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "w")) {
				if (!xc.equals(__DEC_xc_w_988163)) {
					if (!xn.equals(__DEC_xc_w_988163)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_3BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_sw_424128 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "sw")) {
				if (!xc.equals(__DEC_xc_sw_424128)) {
					if (!xn.equals(__DEC_xc_sw_424128)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_4BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_e_18298 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "e")) {
				if (!xc.equals(__DEC_xc_e_18298)) {
					if (!xn.equals(__DEC_xc_e_18298)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_5BB(XBTNode xc,
			XBTNode xn) {
		if (xn.equals(xc.getW())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_black_nac_6BB(XBTNode xc,
			XBTNode xn) {
		if (xn.equals(xc.getE())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_right2southeast_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_se) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXn = _edge_se.getSrc();
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			EObject tmpXc = _edge_se.getTrg();
			if (tmpXc instanceof XBTNode) {
				XBTNode xc = (XBTNode) tmpXc;
				if (!xc.equals(xn)) {
					if (xc.equals(xn.getSe())) {
						if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_0BB(xc, xn) == null) {
							if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_1BB(xc, xn) == null) {
								if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_2BB(xc, xn) == null) {
									if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_3BB(xc,
											xn) == null) {
										if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_4BB(xc,
												xn) == null) {
											if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_5BB(xc,
													xn) == null) {
												if (pattern_right2southeast_20_2_testcorematchandDECs_black_nac_6BB(xc,
														xn) == null) {
													_result.add(new Object[] { xc, xn, _edge_se });
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_right2southeast_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_right2southeast_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			right2southeast _this, Match match, XBTNode xc, XBTNode xn) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, xc, xn);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_right2southeast_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			right2southeast _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_right2southeast_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_right2southeast_21_1_preparereturnvalue_bindingFB(right2southeast _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			right2southeast _this) {
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

	public static final Object[] pattern_right2southeast_21_1_preparereturnvalue_bindingAndBlackFFBF(
			right2southeast _this) {
		Object[] result_pattern_right2southeast_21_1_preparereturnvalue_binding = pattern_right2southeast_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_right2southeast_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_right2southeast_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_right2southeast_21_1_preparereturnvalue_black = pattern_right2southeast_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_right2southeast_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_right2southeast_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_right2southeast_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_right2southeast_21_2_testcorematchandDECs_black_nac_0BB(BTNode c, BTNode n) {
		if (!c.equals(n)) {
			for (BTNode __DEC_c_l_729116 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					BTNode.class, "l")) {
				if (!c.equals(__DEC_c_l_729116)) {
					if (!n.equals(__DEC_c_l_729116)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_21_2_testcorematchandDECs_black_nac_1BB(BTNode n, BTNode c) {
		if (c.equals(n.getL())) {
			return new Object[] { n, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_right2southeast_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_r) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpN = _edge_r.getSrc();
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			EObject tmpC = _edge_r.getTrg();
			if (tmpC instanceof BTNode) {
				BTNode c = (BTNode) tmpC;
				if (!c.equals(n)) {
					if (c.equals(n.getR())) {
						if (pattern_right2southeast_21_2_testcorematchandDECs_black_nac_0BB(c, n) == null) {
							if (pattern_right2southeast_21_2_testcorematchandDECs_black_nac_1BB(n, c) == null) {
								_result.add(new Object[] { n, c, _edge_r });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_right2southeast_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_right2southeast_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			right2southeast _this, Match match, BTNode n, BTNode c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, n, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_right2southeast_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			right2southeast _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_right2southeast_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_right2southeast_24_1_prepare_blackB(right2southeast _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_right2southeast_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_right2southeast_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("xc");
		EObject _localVariable_1 = sourceMatch.getObject("n");
		EObject _localVariable_2 = targetMatch.getObject("xn");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject tmpXc = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpXn = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpXc instanceof XBTNode) {
			XBTNode xc = (XBTNode) tmpXc;
			if (tmpN instanceof BTNode) {
				BTNode n = (BTNode) tmpN;
				if (tmpXn instanceof XBTNode) {
					XBTNode xn = (XBTNode) tmpXn;
					if (tmpC instanceof BTNode) {
						BTNode c = (BTNode) tmpC;
						return new Object[] { xc, n, xn, c, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_24_2_matchsrctrgcontext_blackBBBBBB(XBTNode xc, BTNode n,
			XBTNode xn, BTNode c, Match sourceMatch, Match targetMatch) {
		if (!xc.equals(xn)) {
			if (!c.equals(n)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { xc, n, xn, c, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_right2southeast_24_2_matchsrctrgcontext_binding = pattern_right2southeast_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_right2southeast_24_2_matchsrctrgcontext_binding != null) {
			XBTNode xc = (XBTNode) result_pattern_right2southeast_24_2_matchsrctrgcontext_binding[0];
			BTNode n = (BTNode) result_pattern_right2southeast_24_2_matchsrctrgcontext_binding[1];
			XBTNode xn = (XBTNode) result_pattern_right2southeast_24_2_matchsrctrgcontext_binding[2];
			BTNode c = (BTNode) result_pattern_right2southeast_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_right2southeast_24_2_matchsrctrgcontext_black = pattern_right2southeast_24_2_matchsrctrgcontext_blackBBBBBB(
					xc, n, xn, c, sourceMatch, targetMatch);
			if (result_pattern_right2southeast_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { xc, n, xn, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_24_3_solvecsp_bindingFBBBBBBB(right2southeast _this,
			XBTNode xc, BTNode n, XBTNode xn, BTNode c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(xc, n, xn, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, xc, n, xn, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_right2southeast_24_3_solvecsp_bindingAndBlackFBBBBBBB(right2southeast _this,
			XBTNode xc, BTNode n, XBTNode xn, BTNode c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_right2southeast_24_3_solvecsp_binding = pattern_right2southeast_24_3_solvecsp_bindingFBBBBBBB(
				_this, xc, n, xn, c, sourceMatch, targetMatch);
		if (result_pattern_right2southeast_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_right2southeast_24_3_solvecsp_binding[0];

			Object[] result_pattern_right2southeast_24_3_solvecsp_black = pattern_right2southeast_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_right2southeast_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, xc, n, xn, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_right2southeast_24_5_matchcorrcontext_blackBBFBB(BTNode n,
			XBTNode xn, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
					BTNode2XBTnode.class, "source")) {
				if (xn.equals(n2xn.getTarget())) {
					_result.add(new Object[] { n, xn, n2xn, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_right2southeast_24_5_matchcorrcontext_greenBBBF(BTNode2XBTnode n2xn,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "right2southeast";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(n2xn);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { n2xn, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_right2southeast_24_6_createcorrespondence_blackBBBBB(XBTNode xc, BTNode n,
			XBTNode xn, BTNode c, CCMatch ccMatch) {
		if (!xc.equals(xn)) {
			if (!c.equals(n)) {
				return new Object[] { xc, n, xn, c, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_24_6_createcorrespondence_greenBFBB(XBTNode xc, BTNode c,
			CCMatch ccMatch) {
		BTNode2XBTnode l2se = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		l2se.setTarget(xc);
		l2se.setSource(c);
		ccMatch.getCreateCorr().add(l2se);
		return new Object[] { xc, l2se, c, ccMatch };
	}

	public static final Object[] pattern_right2southeast_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_right2southeast_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "right2southeast";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_right2southeast_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_right2southeast_27_1_matchtggpattern_black_nac_0BB(BTNode c, BTNode n) {
		if (!c.equals(n)) {
			for (BTNode __DEC_c_l_160720 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					BTNode.class, "l")) {
				if (!c.equals(__DEC_c_l_160720)) {
					if (!n.equals(__DEC_c_l_160720)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_27_1_matchtggpattern_black_nac_1BB(BTNode n, BTNode c) {
		if (c.equals(n.getL())) {
			return new Object[] { n, c };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_27_1_matchtggpattern_blackBB(BTNode n, BTNode c) {
		if (!c.equals(n)) {
			if (c.equals(n.getR())) {
				if (pattern_right2southeast_27_1_matchtggpattern_black_nac_0BB(c, n) == null) {
					if (pattern_right2southeast_27_1_matchtggpattern_black_nac_1BB(n, c) == null) {
						return new Object[] { n, c };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_right2southeast_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_0BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_w_114422 = xc.getW();
			if (__DEC_xc_w_114422 != null) {
				if (!xc.equals(__DEC_xc_w_114422)) {
					if (!xn.equals(__DEC_xc_w_114422)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_1BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_e_614877 = xc.getE();
			if (__DEC_xc_e_614877 != null) {
				if (!xc.equals(__DEC_xc_e_614877)) {
					if (!xn.equals(__DEC_xc_e_614877)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_2BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_w_96841 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "w")) {
				if (!xc.equals(__DEC_xc_w_96841)) {
					if (!xn.equals(__DEC_xc_w_96841)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_3BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_sw_946827 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "sw")) {
				if (!xc.equals(__DEC_xc_sw_946827)) {
					if (!xn.equals(__DEC_xc_sw_946827)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_4BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_e_672434 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "e")) {
				if (!xc.equals(__DEC_xc_e_672434)) {
					if (!xn.equals(__DEC_xc_e_672434)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_5BB(XBTNode xc, XBTNode xn) {
		if (xn.equals(xc.getW())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_black_nac_6BB(XBTNode xc, XBTNode xn) {
		if (xn.equals(xc.getE())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_28_1_matchtggpattern_blackBB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			if (xc.equals(xn.getSe())) {
				if (pattern_right2southeast_28_1_matchtggpattern_black_nac_0BB(xc, xn) == null) {
					if (pattern_right2southeast_28_1_matchtggpattern_black_nac_1BB(xc, xn) == null) {
						if (pattern_right2southeast_28_1_matchtggpattern_black_nac_2BB(xc, xn) == null) {
							if (pattern_right2southeast_28_1_matchtggpattern_black_nac_3BB(xc, xn) == null) {
								if (pattern_right2southeast_28_1_matchtggpattern_black_nac_4BB(xc, xn) == null) {
									if (pattern_right2southeast_28_1_matchtggpattern_black_nac_5BB(xc, xn) == null) {
										if (pattern_right2southeast_28_1_matchtggpattern_black_nac_6BB(xc,
												xn) == null) {
											return new Object[] { xc, xn };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_right2southeast_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_right2southeast_29_1_createresult_blackB(right2southeast _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_right2southeast_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_right2southeast_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, BTNode n) {
		if (ruleResult.getSourceObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, BTNode2XBTnode n2xn) {
		if (ruleResult.getCorrObjects().contains(n2xn)) {
			return new Object[] { ruleResult, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XBTNode xn) {
		if (ruleResult.getTargetObjects().contains(xn)) {
			return new Object[] { ruleResult, xn };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_right2southeast_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList n2xnList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpN2xn : n2xnList.getEntryObjects()) {
				if (tmpN2xn instanceof BTNode2XBTnode) {
					BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
					BTNode n = n2xn.getSource();
					if (n != null) {
						XBTNode xn = n2xn.getTarget();
						if (xn != null) {
							if (pattern_right2southeast_29_2_isapplicablecore_black_nac_1BB(ruleResult, n2xn) == null) {
								if (pattern_right2southeast_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										n) == null) {
									if (pattern_right2southeast_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											xn) == null) {
										_result.add(
												new Object[] { n2xnList, n, n2xn, xn, ruleEntryContainer, ruleResult });
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_right2southeast_29_3_solveCSP_bindingFBBBBBB(right2southeast _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n, xn, n2xn, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_right2southeast_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_right2southeast_29_3_solveCSP_bindingAndBlackFBBBBBB(right2southeast _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_right2southeast_29_3_solveCSP_binding = pattern_right2southeast_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, xn, n2xn, ruleResult);
		if (result_pattern_right2southeast_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_right2southeast_29_3_solveCSP_binding[0];

			Object[] result_pattern_right2southeast_29_3_solveCSP_black = pattern_right2southeast_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_right2southeast_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_right2southeast_29_4_checkCSP_expressionFBB(right2southeast _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_right2southeast_29_5_checknacs_blackBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn) {
		return new Object[] { n, xn, n2xn };
	}

	public static final Object[] pattern_right2southeast_29_6_perform_blackBBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n, xn, n2xn, ruleResult };
	}

	public static final Object[] pattern_right2southeast_29_6_perform_greenFBFBFB(BTNode n, XBTNode xn,
			ModelgeneratorRuleResult ruleResult) {
		XBTNode xc = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode l2se = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode c = BtreeFactory.eINSTANCE.createBTNode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		xn.setSe(xc);
		ruleResult.getTargetObjects().add(xc);
		l2se.setTarget(xc);
		ruleResult.getCorrObjects().add(l2se);
		n.setR(c);
		l2se.setSource(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { xc, n, l2se, xn, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_right2southeast_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //right2southeastImpl
