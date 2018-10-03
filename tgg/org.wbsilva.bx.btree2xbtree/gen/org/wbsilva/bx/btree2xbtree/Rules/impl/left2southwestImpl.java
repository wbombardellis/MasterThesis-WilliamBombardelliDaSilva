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
import org.wbsilva.bx.btree2xbtree.Rules.left2southwest;

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
 * An implementation of the model object '<em><b>left2southwest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class left2southwestImpl extends AbstractRuleImpl implements left2southwest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected left2southwestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.LEFT2SOUTHWEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, BTNode n, BTNode c) {

		Object[] result1_black = left2southwestImpl.pattern_left2southwest_0_1_initialbindings_blackBBBB(this, match, n,
				c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, n, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (left2southwestImpl.pattern_left2southwest_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = left2southwestImpl
					.pattern_left2southwest_0_4_collectelementstobetranslated_blackBBB(match, n, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			left2southwestImpl.pattern_left2southwest_0_4_collectelementstobetranslated_greenBBBF(match, n, c);
			//nothing EMoflonEdge n__c____l = (EMoflonEdge) result4_green[3];

			Object[] result5_black = left2southwestImpl
					.pattern_left2southwest_0_5_collectcontextelements_blackBBB(match, n, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			left2southwestImpl.pattern_left2southwest_0_5_collectcontextelements_greenBB(match, n);

			// 
			left2southwestImpl.pattern_left2southwest_0_6_registerobjectstomatch_expressionBBBB(this, match, n, c);
			return left2southwestImpl.pattern_left2southwest_0_7_expressionF();
		} else {
			return left2southwestImpl.pattern_left2southwest_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BTNode n = (BTNode) result1_bindingAndBlack[0];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[1];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[2];
		BTNode c = (BTNode) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = left2southwestImpl.pattern_left2southwest_1_1_performtransformation_greenBBFF(xn, c);
		XBTNode xc = (XBTNode) result1_green[2];
		BTNode2XBTnode l2sw = (BTNode2XBTnode) result1_green[3];

		Object[] result2_black = left2southwestImpl.pattern_left2southwest_1_2_collecttranslatedelements_blackBBB(c, xc,
				l2sw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[xc] = "
					+ xc + ", " + "[l2sw] = " + l2sw + ".");
		}
		Object[] result2_green = left2southwestImpl.pattern_left2southwest_1_2_collecttranslatedelements_greenFBBB(c,
				xc, l2sw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = left2southwestImpl
				.pattern_left2southwest_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, n, xn, n2xn, c, xc, l2sw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[n2xn] = " + n2xn + ", " + "[c] = " + c
					+ ", " + "[xc] = " + xc + ", " + "[l2sw] = " + l2sw + ".");
		}
		left2southwestImpl.pattern_left2southwest_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, n, xn, c, xc,
				l2sw);
		//nothing EMoflonEdge xn__xc____sw = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge n__c____l = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge l2sw__xc____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge l2sw__c____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		left2southwestImpl.pattern_left2southwest_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, n, xn, n2xn,
				c, xc, l2sw);
		return left2southwestImpl.pattern_left2southwest_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = left2southwestImpl
				.pattern_left2southwest_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = left2southwestImpl.pattern_left2southwest_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BTNode n = (BTNode) result2_binding[0];
		BTNode c = (BTNode) result2_binding[1];
		for (Object[] result2_black : left2southwestImpl.pattern_left2southwest_2_2_corematch_blackBFFBB(n, c, match)) {
			XBTNode xn = (XBTNode) result2_black[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			// ForEach 
			for (Object[] result3_black : left2southwestImpl.pattern_left2southwest_2_3_findcontext_blackBBBB(n, xn,
					n2xn, c)) {
				Object[] result3_green = left2southwestImpl.pattern_left2southwest_2_3_findcontext_greenBBBBFFFF(n, xn,
						n2xn, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge n__c____l = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = left2southwestImpl
						.pattern_left2southwest_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, xn,
								n2xn, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xn] = " + xn
							+ ", " + "[n2xn] = " + n2xn + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (left2southwestImpl.pattern_left2southwest_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = left2southwestImpl
							.pattern_left2southwest_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					left2southwestImpl.pattern_left2southwest_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return left2southwestImpl.pattern_left2southwest_2_7_expressionFB(ruleresult);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject n, EObject xn, EObject n2xn, EObject c,
			EObject xc, EObject l2sw) {
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("xc", xc);
		ruleresult.registerObject("l2sw", l2sw);

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
	public boolean isAppropriate_BWD(Match match, XBTNode xn, XBTNode xc) {

		Object[] result1_black = left2southwestImpl.pattern_left2southwest_10_1_initialbindings_blackBBBB(this, match,
				xn, xc);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xn] = " + xn + ", " + "[xc] = " + xc + ".");
		}

		Object[] result2_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, xn, xc);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xn] = " + xn + ", " + "[xc] = " + xc + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (left2southwestImpl.pattern_left2southwest_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = left2southwestImpl
					.pattern_left2southwest_10_4_collectelementstobetranslated_blackBBB(match, xn, xc);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xn] = " + xn + ", " + "[xc] = " + xc + ".");
			}
			left2southwestImpl.pattern_left2southwest_10_4_collectelementstobetranslated_greenBBBF(match, xn, xc);
			//nothing EMoflonEdge xn__xc____sw = (EMoflonEdge) result4_green[3];

			Object[] result5_black = left2southwestImpl
					.pattern_left2southwest_10_5_collectcontextelements_blackBBB(match, xn, xc);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xn] = " + xn + ", " + "[xc] = " + xc + ".");
			}
			left2southwestImpl.pattern_left2southwest_10_5_collectcontextelements_greenBB(match, xn);

			// 
			left2southwestImpl.pattern_left2southwest_10_6_registerobjectstomatch_expressionBBBB(this, match, xn, xc);
			return left2southwestImpl.pattern_left2southwest_10_7_expressionF();
		} else {
			return left2southwestImpl.pattern_left2southwest_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BTNode n = (BTNode) result1_bindingAndBlack[0];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[1];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[2];
		XBTNode xc = (XBTNode) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = left2southwestImpl.pattern_left2southwest_11_1_performtransformation_greenBFBF(n, xc);
		BTNode c = (BTNode) result1_green[1];
		BTNode2XBTnode l2sw = (BTNode2XBTnode) result1_green[3];

		Object[] result2_black = left2southwestImpl.pattern_left2southwest_11_2_collecttranslatedelements_blackBBB(c,
				xc, l2sw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[xc] = "
					+ xc + ", " + "[l2sw] = " + l2sw + ".");
		}
		Object[] result2_green = left2southwestImpl.pattern_left2southwest_11_2_collecttranslatedelements_greenFBBB(c,
				xc, l2sw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = left2southwestImpl
				.pattern_left2southwest_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, n, xn, n2xn, c, xc, l2sw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[n2xn] = " + n2xn + ", " + "[c] = " + c
					+ ", " + "[xc] = " + xc + ", " + "[l2sw] = " + l2sw + ".");
		}
		left2southwestImpl.pattern_left2southwest_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, n, xn, c, xc,
				l2sw);
		//nothing EMoflonEdge xn__xc____sw = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge n__c____l = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge l2sw__xc____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge l2sw__c____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		left2southwestImpl.pattern_left2southwest_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, n, xn, n2xn,
				c, xc, l2sw);
		return left2southwestImpl.pattern_left2southwest_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = left2southwestImpl
				.pattern_left2southwest_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = left2southwestImpl.pattern_left2southwest_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XBTNode xn = (XBTNode) result2_binding[0];
		XBTNode xc = (XBTNode) result2_binding[1];
		for (Object[] result2_black : left2southwestImpl.pattern_left2southwest_12_2_corematch_blackFBFBB(xn, xc,
				match)) {
			BTNode n = (BTNode) result2_black[0];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			// ForEach 
			for (Object[] result3_black : left2southwestImpl.pattern_left2southwest_12_3_findcontext_blackBBBB(n, xn,
					n2xn, xc)) {
				Object[] result3_green = left2southwestImpl.pattern_left2southwest_12_3_findcontext_greenBBBBFFFF(n, xn,
						n2xn, xc);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge xn__xc____sw = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = left2southwestImpl
						.pattern_left2southwest_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, xn,
								n2xn, xc);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xn] = " + xn
							+ ", " + "[n2xn] = " + n2xn + ", " + "[xc] = " + xc + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (left2southwestImpl.pattern_left2southwest_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = left2southwestImpl
							.pattern_left2southwest_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					left2southwestImpl.pattern_left2southwest_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return left2southwestImpl.pattern_left2southwest_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, XBTNode xn, XBTNode xc) {
		match.registerObject("xn", xn);
		match.registerObject("xc", xc);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, XBTNode xn, XBTNode xc) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			XBTNode xc) {// Create CSP
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
		isApplicableMatch.registerObject("xc", xc);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject n, EObject xn, EObject n2xn, EObject c,
			EObject xc, EObject l2sw) {
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("xc", xc);
		ruleresult.registerObject("l2sw", l2sw);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_49(EMoflonEdge _edge_sw) {

		Object[] result1_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = left2southwestImpl.pattern_left2southwest_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : left2southwestImpl
				.pattern_left2southwest_20_2_testcorematchandDECs_blackFFB(_edge_sw)) {
			XBTNode xn = (XBTNode) result2_black[0];
			XBTNode xc = (XBTNode) result2_black[1];
			Object[] result2_green = left2southwestImpl
					.pattern_left2southwest_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (left2southwestImpl
					.pattern_left2southwest_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							xn, xc)) {
				// 
				if (left2southwestImpl
						.pattern_left2southwest_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = left2southwestImpl
							.pattern_left2southwest_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					left2southwestImpl.pattern_left2southwest_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return left2southwestImpl.pattern_left2southwest_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_50(EMoflonEdge _edge_l) {

		Object[] result1_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = left2southwestImpl.pattern_left2southwest_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : left2southwestImpl
				.pattern_left2southwest_21_2_testcorematchandDECs_blackFFB(_edge_l)) {
			BTNode n = (BTNode) result2_black[0];
			BTNode c = (BTNode) result2_black[1];
			Object[] result2_green = left2southwestImpl
					.pattern_left2southwest_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (left2southwestImpl
					.pattern_left2southwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							n, c)) {
				// 
				if (left2southwestImpl
						.pattern_left2southwest_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = left2southwestImpl
							.pattern_left2southwest_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					left2southwestImpl.pattern_left2southwest_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return left2southwestImpl.pattern_left2southwest_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("left2southwest");
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
		ruleResult.setRule("left2southwest");
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

		Object[] result1_black = left2southwestImpl.pattern_left2southwest_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = left2southwestImpl.pattern_left2southwest_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		BTNode n = (BTNode) result2_bindingAndBlack[0];
		XBTNode xn = (XBTNode) result2_bindingAndBlack[1];
		BTNode c = (BTNode) result2_bindingAndBlack[2];
		XBTNode xc = (XBTNode) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = left2southwestImpl
				.pattern_left2southwest_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, n, xn, c, xc, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[c] = " + c + ", " + "[xc] = " + xc + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (left2southwestImpl.pattern_left2southwest_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : left2southwestImpl.pattern_left2southwest_24_5_matchcorrcontext_blackBBFBB(n,
					xn, sourceMatch, targetMatch)) {
				BTNode2XBTnode n2xn = (BTNode2XBTnode) result5_black[2];
				Object[] result5_green = left2southwestImpl.pattern_left2southwest_24_5_matchcorrcontext_greenBBBF(n2xn,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = left2southwestImpl
						.pattern_left2southwest_24_6_createcorrespondence_blackBBBBB(n, xn, c, xc, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[n] = " + n + ", " + "[xn] = " + xn + ", "
									+ "[c] = " + c + ", " + "[xc] = " + xc + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				left2southwestImpl.pattern_left2southwest_24_6_createcorrespondence_greenBBFB(c, xc, ccMatch);
				//nothing BTNode2XBTnode l2sw = (BTNode2XBTnode) result6_green[2];

				Object[] result7_black = left2southwestImpl
						.pattern_left2southwest_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				left2southwestImpl.pattern_left2southwest_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return left2southwestImpl.pattern_left2southwest_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(BTNode n, XBTNode xn, BTNode c, XBTNode xc, Match sourceMatch,
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
		Object[] result1_black = left2southwestImpl.pattern_left2southwest_27_1_matchtggpattern_blackBB(n, c);
		if (result1_black != null) {
			return left2southwestImpl.pattern_left2southwest_27_2_expressionF();
		} else {
			return left2southwestImpl.pattern_left2southwest_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(XBTNode xn, XBTNode xc) {// 
		Object[] result1_black = left2southwestImpl.pattern_left2southwest_28_1_matchtggpattern_blackBB(xn, xc);
		if (result1_black != null) {
			return left2southwestImpl.pattern_left2southwest_28_2_expressionF();
		} else {
			return left2southwestImpl.pattern_left2southwest_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, BTNode2XBTnode n2xnParameter) {

		Object[] result1_black = left2southwestImpl.pattern_left2southwest_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = left2southwestImpl.pattern_left2southwest_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : left2southwestImpl
				.pattern_left2southwest_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList n2xnList = (RuleEntryList) result2_black[0];
			BTNode n = (BTNode) result2_black[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			XBTNode xn = (XBTNode) result2_black[3];

			Object[] result3_bindingAndBlack = left2southwestImpl
					.pattern_left2southwest_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, xn, n2xn,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xn] = " + xn
						+ ", " + "[n2xn] = " + n2xn + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (left2southwestImpl.pattern_left2southwest_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = left2southwestImpl.pattern_left2southwest_29_5_checknacs_blackBBB(n, xn, n2xn);
				if (result5_black != null) {

					Object[] result6_black = left2southwestImpl.pattern_left2southwest_29_6_perform_blackBBBB(n, xn,
							n2xn, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[n] = " + n + ", " + "[xn] = " + xn
										+ ", " + "[n2xn] = " + n2xn + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					left2southwestImpl.pattern_left2southwest_29_6_perform_greenBBFFFB(n, xn, ruleResult);
					//nothing BTNode c = (BTNode) result6_green[2];
					//nothing XBTNode xc = (XBTNode) result6_green[3];
					//nothing BTNode2XBTnode l2sw = (BTNode2XBTnode) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return left2southwestImpl.pattern_left2southwest_29_7_expressionFB(ruleResult);
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
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE:
			return isAppropriate_FWD((Match) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
		case RulesPackage.LEFT2SOUTHWEST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
			return null;
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode) arguments.get(2));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_BTNODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3), (BTNode) arguments.get(4));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.LEFT2SOUTHWEST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE:
			return isAppropriate_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2));
		case RulesPackage.LEFT2SOUTHWEST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2));
			return null;
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_XBTNODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3), (XBTNode) arguments.get(4));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.LEFT2SOUTHWEST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_49((EMoflonEdge) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_XBTNODE_BTNODE_XBTNODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((BTNode) arguments.get(0), (XBTNode) arguments.get(1),
					(BTNode) arguments.get(2), (XBTNode) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.LEFT2SOUTHWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LEFT2SOUTHWEST___CHECK_DEC_FWD__BTNODE_BTNODE:
			return checkDEC_FWD((BTNode) arguments.get(0), (BTNode) arguments.get(1));
		case RulesPackage.LEFT2SOUTHWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE:
			return checkDEC_BWD((XBTNode) arguments.get(0), (XBTNode) arguments.get(1));
		case RulesPackage.LEFT2SOUTHWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE:
			return generateModel((RuleEntryContainer) arguments.get(0), (BTNode2XBTnode) arguments.get(1));
		case RulesPackage.LEFT2SOUTHWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.LEFT2SOUTHWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_left2southwest_0_1_initialbindings_blackBBBB(left2southwest _this, Match match,
			BTNode n, BTNode c) {
		if (!c.equals(n)) {
			return new Object[] { _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_0_2_SolveCSP_bindingFBBBB(left2southwest _this, Match match,
			BTNode n, BTNode c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, n, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_left2southwest_0_2_SolveCSP_bindingAndBlackFBBBB(left2southwest _this,
			Match match, BTNode n, BTNode c) {
		Object[] result_pattern_left2southwest_0_2_SolveCSP_binding = pattern_left2southwest_0_2_SolveCSP_bindingFBBBB(
				_this, match, n, c);
		if (result_pattern_left2southwest_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_left2southwest_0_2_SolveCSP_binding[0];

			Object[] result_pattern_left2southwest_0_2_SolveCSP_black = pattern_left2southwest_0_2_SolveCSP_blackB(csp);
			if (result_pattern_left2southwest_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, n, c };
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_0_3_CheckCSP_expressionFBB(left2southwest _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_0_4_collectelementstobetranslated_blackBBB(Match match,
			BTNode n, BTNode c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_0_4_collectelementstobetranslated_greenBBBF(Match match,
			BTNode n, BTNode c) {
		EMoflonEdge n__c____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String n__c____l_name_prime = "l";
		n__c____l.setSrc(n);
		n__c____l.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____l);
		n__c____l.setName(n__c____l_name_prime);
		return new Object[] { match, n, c, n__c____l };
	}

	public static final Object[] pattern_left2southwest_0_5_collectcontextelements_blackBBB(Match match, BTNode n,
			BTNode c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_0_5_collectcontextelements_greenBB(Match match, BTNode n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_left2southwest_0_6_registerobjectstomatch_expressionBBBB(left2southwest _this,
			Match match, BTNode n, BTNode c) {
		_this.registerObjectsToMatch_FWD(match, n, c);

	}

	public static final boolean pattern_left2southwest_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_left2southwest_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_left2southwest_1_1_performtransformation_bindingFFFFB(
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

	public static final Object[] pattern_left2southwest_1_1_performtransformation_blackBBBBFBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, BTNode c, left2southwest _this, IsApplicableMatch isApplicableMatch) {
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

	public static final Object[] pattern_left2southwest_1_1_performtransformation_bindingAndBlackFFFFFBB(
			left2southwest _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_left2southwest_1_1_performtransformation_binding = pattern_left2southwest_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_left2southwest_1_1_performtransformation_binding != null) {
			BTNode n = (BTNode) result_pattern_left2southwest_1_1_performtransformation_binding[0];
			XBTNode xn = (XBTNode) result_pattern_left2southwest_1_1_performtransformation_binding[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_left2southwest_1_1_performtransformation_binding[2];
			BTNode c = (BTNode) result_pattern_left2southwest_1_1_performtransformation_binding[3];

			Object[] result_pattern_left2southwest_1_1_performtransformation_black = pattern_left2southwest_1_1_performtransformation_blackBBBBFBB(
					n, xn, n2xn, c, _this, isApplicableMatch);
			if (result_pattern_left2southwest_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_left2southwest_1_1_performtransformation_black[4];

				return new Object[] { n, xn, n2xn, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_1_1_performtransformation_greenBBFF(XBTNode xn, BTNode c) {
		XBTNode xc = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode l2sw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		xn.setSw(xc);
		l2sw.setTarget(xc);
		l2sw.setSource(c);
		return new Object[] { xn, c, xc, l2sw };
	}

	public static final Object[] pattern_left2southwest_1_2_collecttranslatedelements_blackBBB(BTNode c, XBTNode xc,
			BTNode2XBTnode l2sw) {
		return new Object[] { c, xc, l2sw };
	}

	public static final Object[] pattern_left2southwest_1_2_collecttranslatedelements_greenFBBB(BTNode c, XBTNode xc,
			BTNode2XBTnode l2sw) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(xc);
		ruleresult.getCreatedLinkElements().add(l2sw);
		return new Object[] { ruleresult, c, xc, l2sw };
	}

	public static final Object[] pattern_left2southwest_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject n, EObject xn, EObject n2xn, EObject c, EObject xc, EObject l2sw) {
		if (!n.equals(xn)) {
			if (!n.equals(n2xn)) {
				if (!n.equals(xc)) {
					if (!n2xn.equals(xn)) {
						if (!n2xn.equals(xc)) {
							if (!c.equals(n)) {
								if (!c.equals(xn)) {
									if (!c.equals(n2xn)) {
										if (!c.equals(xc)) {
											if (!c.equals(l2sw)) {
												if (!xc.equals(xn)) {
													if (!l2sw.equals(n)) {
														if (!l2sw.equals(xn)) {
															if (!l2sw.equals(n2xn)) {
																if (!l2sw.equals(xc)) {
																	return new Object[] { ruleresult, n, xn, n2xn, c,
																			xc, l2sw };
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

	public static final Object[] pattern_left2southwest_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject n, EObject xn, EObject c, EObject xc, EObject l2sw) {
		EMoflonEdge xn__xc____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2sw__xc____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2sw__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "left2southwest";
		String xn__xc____sw_name_prime = "sw";
		String n__c____l_name_prime = "l";
		String l2sw__xc____target_name_prime = "target";
		String l2sw__c____source_name_prime = "source";
		xn__xc____sw.setSrc(xn);
		xn__xc____sw.setTrg(xc);
		ruleresult.getCreatedEdges().add(xn__xc____sw);
		n__c____l.setSrc(n);
		n__c____l.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____l);
		l2sw__xc____target.setSrc(l2sw);
		l2sw__xc____target.setTrg(xc);
		ruleresult.getCreatedEdges().add(l2sw__xc____target);
		l2sw__c____source.setSrc(l2sw);
		l2sw__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(l2sw__c____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xn__xc____sw.setName(xn__xc____sw_name_prime);
		n__c____l.setName(n__c____l_name_prime);
		l2sw__xc____target.setName(l2sw__xc____target_name_prime);
		l2sw__c____source.setName(l2sw__c____source_name_prime);
		return new Object[] { ruleresult, n, xn, c, xc, l2sw, xn__xc____sw, n__c____l, l2sw__xc____target,
				l2sw__c____source };
	}

	public static final void pattern_left2southwest_1_5_registerobjects_expressionBBBBBBBB(left2southwest _this,
			PerformRuleResult ruleresult, EObject n, EObject xn, EObject n2xn, EObject c, EObject xc, EObject l2sw) {
		_this.registerObjects_FWD(ruleresult, n, xn, n2xn, c, xc, l2sw);

	}

	public static final PerformRuleResult pattern_left2southwest_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_left2southwest_2_1_preparereturnvalue_bindingFB(left2southwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_2_1_preparereturnvalue_blackFBB(EClass eClass,
			left2southwest _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_left2southwest_2_1_preparereturnvalue_bindingAndBlackFFB(
			left2southwest _this) {
		Object[] result_pattern_left2southwest_2_1_preparereturnvalue_binding = pattern_left2southwest_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_left2southwest_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_left2southwest_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_left2southwest_2_1_preparereturnvalue_black = pattern_left2southwest_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_left2southwest_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_left2southwest_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "left2southwest";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_left2southwest_2_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_left2southwest_2_2_corematch_blackBFFBB(BTNode n, BTNode c,
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

	public static final Iterable<Object[]> pattern_left2southwest_2_3_findcontext_blackBBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, BTNode c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (xn.equals(n2xn.getTarget())) {
				if (c.equals(n.getL())) {
					if (n.equals(n2xn.getSource())) {
						_result.add(new Object[] { n, xn, n2xn, c });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_left2southwest_2_3_findcontext_greenBBBBFFFF(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, BTNode c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n2xn__xn____target_name_prime = "target";
		String n__c____l_name_prime = "l";
		String n2xn__n____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(c);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n__c____l.setSrc(n);
		n__c____l.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____l);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		n__c____l.setName(n__c____l_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		return new Object[] { n, xn, n2xn, c, isApplicableMatch, n2xn__xn____target, n__c____l, n2xn__n____source };
	}

	public static final Object[] pattern_left2southwest_2_4_solveCSP_bindingFBBBBBB(left2southwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, BTNode c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, n, xn, n2xn, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, c };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_left2southwest_2_4_solveCSP_bindingAndBlackFBBBBBB(left2southwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, BTNode c) {
		Object[] result_pattern_left2southwest_2_4_solveCSP_binding = pattern_left2southwest_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, xn, n2xn, c);
		if (result_pattern_left2southwest_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_left2southwest_2_4_solveCSP_binding[0];

			Object[] result_pattern_left2southwest_2_4_solveCSP_black = pattern_left2southwest_2_4_solveCSP_blackB(csp);
			if (result_pattern_left2southwest_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, c };
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_2_5_checkCSP_expressionFBB(left2southwest _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_left2southwest_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "left2southwest";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_left2southwest_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_left2southwest_10_1_initialbindings_blackBBBB(left2southwest _this,
			Match match, XBTNode xn, XBTNode xc) {
		if (!xc.equals(xn)) {
			return new Object[] { _this, match, xn, xc };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_10_2_SolveCSP_bindingFBBBB(left2southwest _this, Match match,
			XBTNode xn, XBTNode xc) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, xn, xc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xn, xc };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_left2southwest_10_2_SolveCSP_bindingAndBlackFBBBB(left2southwest _this,
			Match match, XBTNode xn, XBTNode xc) {
		Object[] result_pattern_left2southwest_10_2_SolveCSP_binding = pattern_left2southwest_10_2_SolveCSP_bindingFBBBB(
				_this, match, xn, xc);
		if (result_pattern_left2southwest_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_left2southwest_10_2_SolveCSP_binding[0];

			Object[] result_pattern_left2southwest_10_2_SolveCSP_black = pattern_left2southwest_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_left2southwest_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xn, xc };
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_10_3_CheckCSP_expressionFBB(left2southwest _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_10_4_collectelementstobetranslated_blackBBB(Match match,
			XBTNode xn, XBTNode xc) {
		if (!xc.equals(xn)) {
			return new Object[] { match, xn, xc };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_10_4_collectelementstobetranslated_greenBBBF(Match match,
			XBTNode xn, XBTNode xc) {
		EMoflonEdge xn__xc____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xc);
		String xn__xc____sw_name_prime = "sw";
		xn__xc____sw.setSrc(xn);
		xn__xc____sw.setTrg(xc);
		match.getToBeTranslatedEdges().add(xn__xc____sw);
		xn__xc____sw.setName(xn__xc____sw_name_prime);
		return new Object[] { match, xn, xc, xn__xc____sw };
	}

	public static final Object[] pattern_left2southwest_10_5_collectcontextelements_blackBBB(Match match, XBTNode xn,
			XBTNode xc) {
		if (!xc.equals(xn)) {
			return new Object[] { match, xn, xc };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_10_5_collectcontextelements_greenBB(Match match, XBTNode xn) {
		match.getContextNodes().add(xn);
		return new Object[] { match, xn };
	}

	public static final void pattern_left2southwest_10_6_registerobjectstomatch_expressionBBBB(left2southwest _this,
			Match match, XBTNode xn, XBTNode xc) {
		_this.registerObjectsToMatch_BWD(match, xn, xc);

	}

	public static final boolean pattern_left2southwest_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_left2southwest_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_left2southwest_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject _localVariable_1 = isApplicableMatch.getObject("xn");
		EObject _localVariable_2 = isApplicableMatch.getObject("n2xn");
		EObject _localVariable_3 = isApplicableMatch.getObject("xc");
		EObject tmpN = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		EObject tmpN2xn = _localVariable_2;
		EObject tmpXc = _localVariable_3;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				if (tmpN2xn instanceof BTNode2XBTnode) {
					BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
					if (tmpXc instanceof XBTNode) {
						XBTNode xc = (XBTNode) tmpXc;
						return new Object[] { n, xn, n2xn, xc, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_11_1_performtransformation_blackBBBBFBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, XBTNode xc, left2southwest _this, IsApplicableMatch isApplicableMatch) {
		if (!xc.equals(xn)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { n, xn, n2xn, xc, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_11_1_performtransformation_bindingAndBlackFFFFFBB(
			left2southwest _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_left2southwest_11_1_performtransformation_binding = pattern_left2southwest_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_left2southwest_11_1_performtransformation_binding != null) {
			BTNode n = (BTNode) result_pattern_left2southwest_11_1_performtransformation_binding[0];
			XBTNode xn = (XBTNode) result_pattern_left2southwest_11_1_performtransformation_binding[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_left2southwest_11_1_performtransformation_binding[2];
			XBTNode xc = (XBTNode) result_pattern_left2southwest_11_1_performtransformation_binding[3];

			Object[] result_pattern_left2southwest_11_1_performtransformation_black = pattern_left2southwest_11_1_performtransformation_blackBBBBFBB(
					n, xn, n2xn, xc, _this, isApplicableMatch);
			if (result_pattern_left2southwest_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_left2southwest_11_1_performtransformation_black[4];

				return new Object[] { n, xn, n2xn, xc, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_11_1_performtransformation_greenBFBF(BTNode n, XBTNode xc) {
		BTNode c = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode l2sw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		n.setL(c);
		l2sw.setTarget(xc);
		l2sw.setSource(c);
		return new Object[] { n, c, xc, l2sw };
	}

	public static final Object[] pattern_left2southwest_11_2_collecttranslatedelements_blackBBB(BTNode c, XBTNode xc,
			BTNode2XBTnode l2sw) {
		return new Object[] { c, xc, l2sw };
	}

	public static final Object[] pattern_left2southwest_11_2_collecttranslatedelements_greenFBBB(BTNode c, XBTNode xc,
			BTNode2XBTnode l2sw) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(xc);
		ruleresult.getCreatedLinkElements().add(l2sw);
		return new Object[] { ruleresult, c, xc, l2sw };
	}

	public static final Object[] pattern_left2southwest_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject n, EObject xn, EObject n2xn, EObject c, EObject xc, EObject l2sw) {
		if (!n.equals(xn)) {
			if (!n.equals(n2xn)) {
				if (!n.equals(xc)) {
					if (!n2xn.equals(xn)) {
						if (!n2xn.equals(xc)) {
							if (!c.equals(n)) {
								if (!c.equals(xn)) {
									if (!c.equals(n2xn)) {
										if (!c.equals(xc)) {
											if (!c.equals(l2sw)) {
												if (!xc.equals(xn)) {
													if (!l2sw.equals(n)) {
														if (!l2sw.equals(xn)) {
															if (!l2sw.equals(n2xn)) {
																if (!l2sw.equals(xc)) {
																	return new Object[] { ruleresult, n, xn, n2xn, c,
																			xc, l2sw };
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

	public static final Object[] pattern_left2southwest_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject n, EObject xn, EObject c, EObject xc, EObject l2sw) {
		EMoflonEdge xn__xc____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2sw__xc____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2sw__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "left2southwest";
		String xn__xc____sw_name_prime = "sw";
		String n__c____l_name_prime = "l";
		String l2sw__xc____target_name_prime = "target";
		String l2sw__c____source_name_prime = "source";
		xn__xc____sw.setSrc(xn);
		xn__xc____sw.setTrg(xc);
		ruleresult.getTranslatedEdges().add(xn__xc____sw);
		n__c____l.setSrc(n);
		n__c____l.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____l);
		l2sw__xc____target.setSrc(l2sw);
		l2sw__xc____target.setTrg(xc);
		ruleresult.getCreatedEdges().add(l2sw__xc____target);
		l2sw__c____source.setSrc(l2sw);
		l2sw__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(l2sw__c____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xn__xc____sw.setName(xn__xc____sw_name_prime);
		n__c____l.setName(n__c____l_name_prime);
		l2sw__xc____target.setName(l2sw__xc____target_name_prime);
		l2sw__c____source.setName(l2sw__c____source_name_prime);
		return new Object[] { ruleresult, n, xn, c, xc, l2sw, xn__xc____sw, n__c____l, l2sw__xc____target,
				l2sw__c____source };
	}

	public static final void pattern_left2southwest_11_5_registerobjects_expressionBBBBBBBB(left2southwest _this,
			PerformRuleResult ruleresult, EObject n, EObject xn, EObject n2xn, EObject c, EObject xc, EObject l2sw) {
		_this.registerObjects_BWD(ruleresult, n, xn, n2xn, c, xc, l2sw);

	}

	public static final PerformRuleResult pattern_left2southwest_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_left2southwest_12_1_preparereturnvalue_bindingFB(left2southwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_12_1_preparereturnvalue_blackFBB(EClass eClass,
			left2southwest _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_left2southwest_12_1_preparereturnvalue_bindingAndBlackFFB(
			left2southwest _this) {
		Object[] result_pattern_left2southwest_12_1_preparereturnvalue_binding = pattern_left2southwest_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_left2southwest_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_left2southwest_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_left2southwest_12_1_preparereturnvalue_black = pattern_left2southwest_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_left2southwest_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_left2southwest_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "left2southwest";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_left2southwest_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xn");
		EObject _localVariable_1 = match.getObject("xc");
		EObject tmpXn = _localVariable_0;
		EObject tmpXc = _localVariable_1;
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			if (tmpXc instanceof XBTNode) {
				XBTNode xc = (XBTNode) tmpXc;
				return new Object[] { xn, xc, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_left2southwest_12_2_corematch_blackFBFBB(XBTNode xn, XBTNode xc,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xc.equals(xn)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
					BTNode2XBTnode.class, "target")) {
				BTNode n = n2xn.getSource();
				if (n != null) {
					_result.add(new Object[] { n, xn, n2xn, xc, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_left2southwest_12_3_findcontext_blackBBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, XBTNode xc) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xc.equals(xn)) {
			if (xc.equals(xn.getSw())) {
				if (xn.equals(n2xn.getTarget())) {
					if (n.equals(n2xn.getSource())) {
						_result.add(new Object[] { n, xn, n2xn, xc });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_left2southwest_12_3_findcontext_greenBBBBFFFF(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, XBTNode xc) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xn__xc____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xn__xc____sw_name_prime = "sw";
		String n2xn__xn____target_name_prime = "target";
		String n2xn__n____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(xc);
		xn__xc____sw.setSrc(xn);
		xn__xc____sw.setTrg(xc);
		isApplicableMatch.getAllContextElements().add(xn__xc____sw);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		xn__xc____sw.setName(xn__xc____sw_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		return new Object[] { n, xn, n2xn, xc, isApplicableMatch, xn__xc____sw, n2xn__xn____target, n2xn__n____source };
	}

	public static final Object[] pattern_left2southwest_12_4_solveCSP_bindingFBBBBBB(left2southwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, XBTNode xc) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, n, xn, n2xn, xc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, xc };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_left2southwest_12_4_solveCSP_bindingAndBlackFBBBBBB(left2southwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, XBTNode xc) {
		Object[] result_pattern_left2southwest_12_4_solveCSP_binding = pattern_left2southwest_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, xn, n2xn, xc);
		if (result_pattern_left2southwest_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_left2southwest_12_4_solveCSP_binding[0];

			Object[] result_pattern_left2southwest_12_4_solveCSP_black = pattern_left2southwest_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_left2southwest_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, xc };
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_12_5_checkCSP_expressionFBB(left2southwest _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_left2southwest_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "left2southwest";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_left2southwest_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_left2southwest_20_1_preparereturnvalue_bindingFB(left2southwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			left2southwest _this) {
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

	public static final Object[] pattern_left2southwest_20_1_preparereturnvalue_bindingAndBlackFFBF(
			left2southwest _this) {
		Object[] result_pattern_left2southwest_20_1_preparereturnvalue_binding = pattern_left2southwest_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_left2southwest_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_left2southwest_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_left2southwest_20_1_preparereturnvalue_black = pattern_left2southwest_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_left2southwest_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_left2southwest_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_left2southwest_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_0BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_w_97783 = xc.getW();
			if (__DEC_xc_w_97783 != null) {
				if (!xc.equals(__DEC_xc_w_97783)) {
					if (!xn.equals(__DEC_xc_w_97783)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_1BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_e_616894 = xc.getE();
			if (__DEC_xc_e_616894 != null) {
				if (!xc.equals(__DEC_xc_e_616894)) {
					if (!xn.equals(__DEC_xc_e_616894)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_2BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_w_148745 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "w")) {
				if (!xc.equals(__DEC_xc_w_148745)) {
					if (!xn.equals(__DEC_xc_w_148745)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_3BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_se_493366 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "se")) {
				if (!xc.equals(__DEC_xc_se_493366)) {
					if (!xn.equals(__DEC_xc_se_493366)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_4BB(XBTNode xc,
			XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_e_658435 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "e")) {
				if (!xc.equals(__DEC_xc_e_658435)) {
					if (!xn.equals(__DEC_xc_e_658435)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_5BB(XBTNode xc,
			XBTNode xn) {
		if (xn.equals(xc.getW())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_6BB(XBTNode xc,
			XBTNode xn) {
		if (xn.equals(xc.getE())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_black_nac_7BB(XBTNode xn,
			XBTNode xc) {
		if (xc.equals(xn.getSe())) {
			return new Object[] { xn, xc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_left2southwest_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_sw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXn = _edge_sw.getSrc();
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			EObject tmpXc = _edge_sw.getTrg();
			if (tmpXc instanceof XBTNode) {
				XBTNode xc = (XBTNode) tmpXc;
				if (!xc.equals(xn)) {
					if (xc.equals(xn.getSw())) {
						if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_0BB(xc, xn) == null) {
							if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_1BB(xc, xn) == null) {
								if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_2BB(xc, xn) == null) {
									if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_3BB(xc,
											xn) == null) {
										if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_4BB(xc,
												xn) == null) {
											if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_5BB(xc,
													xn) == null) {
												if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_6BB(xc,
														xn) == null) {
													if (pattern_left2southwest_20_2_testcorematchandDECs_black_nac_7BB(
															xn, xc) == null) {
														_result.add(new Object[] { xn, xc, _edge_sw });
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

		return _result;
	}

	public static final Object[] pattern_left2southwest_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_left2southwest_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			left2southwest _this, Match match, XBTNode xn, XBTNode xc) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, xn, xc);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_left2southwest_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			left2southwest _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_left2southwest_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_left2southwest_21_1_preparereturnvalue_bindingFB(left2southwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			left2southwest _this) {
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

	public static final Object[] pattern_left2southwest_21_1_preparereturnvalue_bindingAndBlackFFBF(
			left2southwest _this) {
		Object[] result_pattern_left2southwest_21_1_preparereturnvalue_binding = pattern_left2southwest_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_left2southwest_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_left2southwest_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_left2southwest_21_1_preparereturnvalue_black = pattern_left2southwest_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_left2southwest_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_left2southwest_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_left2southwest_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_left2southwest_21_2_testcorematchandDECs_black_nac_0BB(BTNode c, BTNode n) {
		if (!c.equals(n)) {
			for (BTNode __DEC_c_r_460510 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					BTNode.class, "r")) {
				if (!c.equals(__DEC_c_r_460510)) {
					if (!n.equals(__DEC_c_r_460510)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_21_2_testcorematchandDECs_black_nac_1BB(BTNode n, BTNode c) {
		if (c.equals(n.getR())) {
			return new Object[] { n, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_left2southwest_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_l) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpN = _edge_l.getSrc();
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			EObject tmpC = _edge_l.getTrg();
			if (tmpC instanceof BTNode) {
				BTNode c = (BTNode) tmpC;
				if (!c.equals(n)) {
					if (c.equals(n.getL())) {
						if (pattern_left2southwest_21_2_testcorematchandDECs_black_nac_0BB(c, n) == null) {
							if (pattern_left2southwest_21_2_testcorematchandDECs_black_nac_1BB(n, c) == null) {
								_result.add(new Object[] { n, c, _edge_l });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_left2southwest_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_left2southwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			left2southwest _this, Match match, BTNode n, BTNode c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, n, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_left2southwest_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			left2southwest _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_left2southwest_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_left2southwest_24_1_prepare_blackB(left2southwest _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_left2southwest_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_left2southwest_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("n");
		EObject _localVariable_1 = targetMatch.getObject("xn");
		EObject _localVariable_2 = sourceMatch.getObject("c");
		EObject _localVariable_3 = targetMatch.getObject("xc");
		EObject tmpN = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpXc = _localVariable_3;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				if (tmpC instanceof BTNode) {
					BTNode c = (BTNode) tmpC;
					if (tmpXc instanceof XBTNode) {
						XBTNode xc = (XBTNode) tmpXc;
						return new Object[] { n, xn, c, xc, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_24_2_matchsrctrgcontext_blackBBBBBB(BTNode n, XBTNode xn,
			BTNode c, XBTNode xc, Match sourceMatch, Match targetMatch) {
		if (!c.equals(n)) {
			if (!xc.equals(xn)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { n, xn, c, xc, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_left2southwest_24_2_matchsrctrgcontext_binding = pattern_left2southwest_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_left2southwest_24_2_matchsrctrgcontext_binding != null) {
			BTNode n = (BTNode) result_pattern_left2southwest_24_2_matchsrctrgcontext_binding[0];
			XBTNode xn = (XBTNode) result_pattern_left2southwest_24_2_matchsrctrgcontext_binding[1];
			BTNode c = (BTNode) result_pattern_left2southwest_24_2_matchsrctrgcontext_binding[2];
			XBTNode xc = (XBTNode) result_pattern_left2southwest_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_left2southwest_24_2_matchsrctrgcontext_black = pattern_left2southwest_24_2_matchsrctrgcontext_blackBBBBBB(
					n, xn, c, xc, sourceMatch, targetMatch);
			if (result_pattern_left2southwest_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { n, xn, c, xc, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_24_3_solvecsp_bindingFBBBBBBB(left2southwest _this, BTNode n,
			XBTNode xn, BTNode c, XBTNode xc, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(n, xn, c, xc, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, n, xn, c, xc, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_left2southwest_24_3_solvecsp_bindingAndBlackFBBBBBBB(left2southwest _this,
			BTNode n, XBTNode xn, BTNode c, XBTNode xc, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_left2southwest_24_3_solvecsp_binding = pattern_left2southwest_24_3_solvecsp_bindingFBBBBBBB(
				_this, n, xn, c, xc, sourceMatch, targetMatch);
		if (result_pattern_left2southwest_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_left2southwest_24_3_solvecsp_binding[0];

			Object[] result_pattern_left2southwest_24_3_solvecsp_black = pattern_left2southwest_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_left2southwest_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, n, xn, c, xc, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_left2southwest_24_5_matchcorrcontext_blackBBFBB(BTNode n, XBTNode xn,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
					BTNode2XBTnode.class, "target")) {
				if (n.equals(n2xn.getSource())) {
					_result.add(new Object[] { n, xn, n2xn, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_left2southwest_24_5_matchcorrcontext_greenBBBF(BTNode2XBTnode n2xn,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "left2southwest";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(n2xn);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { n2xn, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_left2southwest_24_6_createcorrespondence_blackBBBBB(BTNode n, XBTNode xn,
			BTNode c, XBTNode xc, CCMatch ccMatch) {
		if (!c.equals(n)) {
			if (!xc.equals(xn)) {
				return new Object[] { n, xn, c, xc, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_24_6_createcorrespondence_greenBBFB(BTNode c, XBTNode xc,
			CCMatch ccMatch) {
		BTNode2XBTnode l2sw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		l2sw.setTarget(xc);
		l2sw.setSource(c);
		ccMatch.getCreateCorr().add(l2sw);
		return new Object[] { c, xc, l2sw, ccMatch };
	}

	public static final Object[] pattern_left2southwest_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_left2southwest_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "left2southwest";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_left2southwest_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_left2southwest_27_1_matchtggpattern_black_nac_0BB(BTNode c, BTNode n) {
		if (!c.equals(n)) {
			for (BTNode __DEC_c_r_180712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					BTNode.class, "r")) {
				if (!c.equals(__DEC_c_r_180712)) {
					if (!n.equals(__DEC_c_r_180712)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_27_1_matchtggpattern_black_nac_1BB(BTNode n, BTNode c) {
		if (c.equals(n.getR())) {
			return new Object[] { n, c };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_27_1_matchtggpattern_blackBB(BTNode n, BTNode c) {
		if (!c.equals(n)) {
			if (c.equals(n.getL())) {
				if (pattern_left2southwest_27_1_matchtggpattern_black_nac_0BB(c, n) == null) {
					if (pattern_left2southwest_27_1_matchtggpattern_black_nac_1BB(n, c) == null) {
						return new Object[] { n, c };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_left2southwest_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_0BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_w_723163 = xc.getW();
			if (__DEC_xc_w_723163 != null) {
				if (!xc.equals(__DEC_xc_w_723163)) {
					if (!xn.equals(__DEC_xc_w_723163)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_1BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			XBTNode __DEC_xc_e_293283 = xc.getE();
			if (__DEC_xc_e_293283 != null) {
				if (!xc.equals(__DEC_xc_e_293283)) {
					if (!xn.equals(__DEC_xc_e_293283)) {
						return new Object[] { xc, xn };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_2BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_w_250265 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "w")) {
				if (!xc.equals(__DEC_xc_w_250265)) {
					if (!xn.equals(__DEC_xc_w_250265)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_3BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_se_382534 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "se")) {
				if (!xc.equals(__DEC_xc_se_382534)) {
					if (!xn.equals(__DEC_xc_se_382534)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_4BB(XBTNode xc, XBTNode xn) {
		if (!xc.equals(xn)) {
			for (XBTNode __DEC_xc_e_453088 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xc,
					XBTNode.class, "e")) {
				if (!xc.equals(__DEC_xc_e_453088)) {
					if (!xn.equals(__DEC_xc_e_453088)) {
						return new Object[] { xc, xn };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_5BB(XBTNode xc, XBTNode xn) {
		if (xn.equals(xc.getW())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_6BB(XBTNode xc, XBTNode xn) {
		if (xn.equals(xc.getE())) {
			return new Object[] { xc, xn };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_black_nac_7BB(XBTNode xn, XBTNode xc) {
		if (xc.equals(xn.getSe())) {
			return new Object[] { xn, xc };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_28_1_matchtggpattern_blackBB(XBTNode xn, XBTNode xc) {
		if (!xc.equals(xn)) {
			if (xc.equals(xn.getSw())) {
				if (pattern_left2southwest_28_1_matchtggpattern_black_nac_0BB(xc, xn) == null) {
					if (pattern_left2southwest_28_1_matchtggpattern_black_nac_1BB(xc, xn) == null) {
						if (pattern_left2southwest_28_1_matchtggpattern_black_nac_2BB(xc, xn) == null) {
							if (pattern_left2southwest_28_1_matchtggpattern_black_nac_3BB(xc, xn) == null) {
								if (pattern_left2southwest_28_1_matchtggpattern_black_nac_4BB(xc, xn) == null) {
									if (pattern_left2southwest_28_1_matchtggpattern_black_nac_5BB(xc, xn) == null) {
										if (pattern_left2southwest_28_1_matchtggpattern_black_nac_6BB(xc, xn) == null) {
											if (pattern_left2southwest_28_1_matchtggpattern_black_nac_7BB(xn,
													xc) == null) {
												return new Object[] { xn, xc };
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

	public static final boolean pattern_left2southwest_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_left2southwest_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_left2southwest_29_1_createresult_blackB(left2southwest _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_left2southwest_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_left2southwest_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, BTNode n) {
		if (ruleResult.getSourceObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, BTNode2XBTnode n2xn) {
		if (ruleResult.getCorrObjects().contains(n2xn)) {
			return new Object[] { ruleResult, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XBTNode xn) {
		if (ruleResult.getTargetObjects().contains(xn)) {
			return new Object[] { ruleResult, xn };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_left2southwest_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_left2southwest_29_2_isapplicablecore_black_nac_1BB(ruleResult, n2xn) == null) {
								if (pattern_left2southwest_29_2_isapplicablecore_black_nac_0BB(ruleResult, n) == null) {
									if (pattern_left2southwest_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_left2southwest_29_3_solveCSP_bindingFBBBBBB(left2southwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n, xn, n2xn, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_left2southwest_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_left2southwest_29_3_solveCSP_bindingAndBlackFBBBBBB(left2southwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_left2southwest_29_3_solveCSP_binding = pattern_left2southwest_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, xn, n2xn, ruleResult);
		if (result_pattern_left2southwest_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_left2southwest_29_3_solveCSP_binding[0];

			Object[] result_pattern_left2southwest_29_3_solveCSP_black = pattern_left2southwest_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_left2southwest_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_left2southwest_29_4_checkCSP_expressionFBB(left2southwest _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_left2southwest_29_5_checknacs_blackBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn) {
		return new Object[] { n, xn, n2xn };
	}

	public static final Object[] pattern_left2southwest_29_6_perform_blackBBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n, xn, n2xn, ruleResult };
	}

	public static final Object[] pattern_left2southwest_29_6_perform_greenBBFFFB(BTNode n, XBTNode xn,
			ModelgeneratorRuleResult ruleResult) {
		BTNode c = BtreeFactory.eINSTANCE.createBTNode();
		XBTNode xc = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode l2sw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		n.setL(c);
		ruleResult.getSourceObjects().add(c);
		xn.setSw(xc);
		ruleResult.getTargetObjects().add(xc);
		l2sw.setTarget(xc);
		l2sw.setSource(c);
		ruleResult.getCorrObjects().add(l2sw);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { n, xn, c, xc, l2sw, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_left2southwest_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //left2southwestImpl
