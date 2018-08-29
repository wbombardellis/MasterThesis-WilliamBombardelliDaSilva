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
import org.wbsilva.bx.btree2xbtree.Rules.rightleft2eastwest;

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
 * An implementation of the model object '<em><b>rightleft2eastwest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class rightleft2eastwestImpl extends AbstractRuleImpl implements rightleft2eastwest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected rightleft2eastwestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.RIGHTLEFT2EASTWEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, BTNode cl, BTNode cr, BTNode n) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_0_1_initialbindings_blackBBBBB(this,
				match, cl, cr, n);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cl] = " + cl + ", " + "[cr] = " + cr + ", " + "[n] = " + n + ".");
		}

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, cl, cr, n);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cl] = " + cl + ", " + "[cr] = " + cr + ", " + "[n] = " + n + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_0_4_collectelementstobetranslated_blackBBBB(match, cl, cr, n);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cl] = " + cl + ", " + "[cr] = " + cr + ", " + "[n] = " + n + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_4_collectelementstobetranslated_greenBBBBFF(match, cl,
					cr, n);
			//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result4_green[5];

			Object[] result5_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_0_5_collectcontextelements_blackBBBB(match, cl, cr, n);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cl] = " + cl + ", " + "[cr] = " + cr + ", " + "[n] = " + n + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_5_collectcontextelements_greenBB(match, n);

			// 
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					cl, cr, n);
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_0_7_expressionF();
		} else {
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BTNode cl = (BTNode) result1_bindingAndBlack[0];
		BTNode cr = (BTNode) result1_bindingAndBlack[1];
		BTNode n = (BTNode) result1_bindingAndBlack[2];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[3];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_1_performtransformation_greenBFBFBFF(cl, cr, xn);
		BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result1_green[1];
		XBTNode xcse = (XBTNode) result1_green[3];
		XBTNode xcsw = (XBTNode) result1_green[5];
		BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result1_green[6];

		Object[] result2_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_2_collecttranslatedelements_blackBBBBBB(cl, cr2xcse, cr, xcse, xcsw,
						cl2xcsw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cl] = " + cl + ", "
					+ "[cr2xcse] = " + cr2xcse + ", " + "[cr] = " + cr + ", " + "[xcse] = " + xcse + ", " + "[xcsw] = "
					+ xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ".");
		}
		Object[] result2_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_2_collecttranslatedelements_greenFBBBBBB(cl, cr2xcse, cr, xcse, xcsw,
						cl2xcsw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, cl, cr2xcse, cr, n,
						xcse, n2xn, xn, xcsw, cl2xcsw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cl] = " + cl + ", " + "[cr2xcse] = " + cr2xcse + ", " + "[cr] = " + cr + ", " + "[n] = "
					+ n + ", " + "[xcse] = " + xcse + ", " + "[n2xn] = " + n2xn + ", " + "[xn] = " + xn + ", "
					+ "[xcsw] = " + xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ".");
		}
		rightleft2eastwestImpl.pattern_rightleft2eastwest_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult,
				cl, cr2xcse, cr, n, xcse, xn, xcsw, cl2xcsw);
		//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge cr2xcse__cr____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cr2xcse__xcse____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge cl2xcsw__xcsw____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge cl2xcsw__cl____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[18];

		// 
		// 
		rightleft2eastwestImpl.pattern_rightleft2eastwest_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				cl, cr2xcse, cr, n, xcse, n2xn, xn, xcsw, cl2xcsw);
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = rightleft2eastwestImpl.pattern_rightleft2eastwest_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BTNode cl = (BTNode) result2_binding[0];
		BTNode cr = (BTNode) result2_binding[1];
		BTNode n = (BTNode) result2_binding[2];
		for (Object[] result2_black : rightleft2eastwestImpl.pattern_rightleft2eastwest_2_2_corematch_blackBBBFFB(cl,
				cr, n, match)) {
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[3];
			XBTNode xn = (XBTNode) result2_black[4];
			// ForEach 
			for (Object[] result3_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_2_3_findcontext_blackBBBBB(cl, cr, n, n2xn, xn)) {
				Object[] result3_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_2_3_findcontext_greenBBBBBFFFFF(cl, cr, n, n2xn, xn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, cl,
								cr, n, n2xn, xn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cl] = " + cl + ", " + "[cr] = "
							+ cr + ", " + "[n] = " + n + ", " + "[n2xn] = " + n2xn + ", " + "[xn] = " + xn + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (rightleft2eastwestImpl.pattern_rightleft2eastwest_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = rightleft2eastwestImpl
							.pattern_rightleft2eastwest_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, BTNode cl, BTNode cr, BTNode n) {
		match.registerObject("cl", cl);
		match.registerObject("cr", cr);
		match.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BTNode cl, BTNode cr, BTNode n) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, BTNode cl, BTNode cr, BTNode n,
			BTNode2XBTnode n2xn, XBTNode xn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cl", cl);
		isApplicableMatch.registerObject("cr", cr);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("xn", xn);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n,
			EObject xcse, EObject n2xn, EObject xn, EObject xcsw, EObject cl2xcsw) {
		ruleresult.registerObject("cl", cl);
		ruleresult.registerObject("cr2xcse", cr2xcse);
		ruleresult.registerObject("cr", cr);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("xcse", xcse);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("xcsw", xcsw);
		ruleresult.registerObject("cl2xcsw", cl2xcsw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cl").eClass()).equals("btree.BTNode.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cr").eClass()).equals("btree.BTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_10_1_initialbindings_blackBBBBB(this,
				match, xcse, xn, xcsw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xcse] = " + xcse + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ".");
		}

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, xcse, xn, xcsw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xcse] = " + xcse + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_10_4_collectelementstobetranslated_blackBBBB(match, xcse, xn, xcsw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xcse] = " + xcse + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
					xcse, xn, xcsw);
			//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result4_green[7];

			Object[] result5_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_10_5_collectcontextelements_blackBBBB(match, xcse, xn, xcsw);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xcse] = " + xcse + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_5_collectcontextelements_greenBB(match, xn);

			// 
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					xcse, xn, xcsw);
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_10_7_expressionF();
		} else {
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BTNode n = (BTNode) result1_bindingAndBlack[0];
		XBTNode xcse = (XBTNode) result1_bindingAndBlack[1];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[2];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[3];
		XBTNode xcsw = (XBTNode) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_1_performtransformation_greenFFFBBBF(n, xcse, xcsw);
		BTNode cl = (BTNode) result1_green[0];
		BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result1_green[1];
		BTNode cr = (BTNode) result1_green[2];
		BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result1_green[6];

		Object[] result2_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_2_collecttranslatedelements_blackBBBBBB(cl, cr2xcse, cr, xcse, xcsw,
						cl2xcsw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cl] = " + cl + ", "
					+ "[cr2xcse] = " + cr2xcse + ", " + "[cr] = " + cr + ", " + "[xcse] = " + xcse + ", " + "[xcsw] = "
					+ xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ".");
		}
		Object[] result2_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_2_collecttranslatedelements_greenFBBBBBB(cl, cr2xcse, cr, xcse, xcsw,
						cl2xcsw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, cl, cr2xcse, cr, n,
						xcse, n2xn, xn, xcsw, cl2xcsw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cl] = " + cl + ", " + "[cr2xcse] = " + cr2xcse + ", " + "[cr] = " + cr + ", " + "[n] = "
					+ n + ", " + "[xcse] = " + xcse + ", " + "[n2xn] = " + n2xn + ", " + "[xn] = " + xn + ", "
					+ "[xcsw] = " + xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ".");
		}
		rightleft2eastwestImpl.pattern_rightleft2eastwest_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult,
				cl, cr2xcse, cr, n, xcse, xn, xcsw, cl2xcsw);
		//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge cr2xcse__cr____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cr2xcse__xcse____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge cl2xcsw__xcsw____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge cl2xcsw__cl____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[18];

		// 
		// 
		rightleft2eastwestImpl.pattern_rightleft2eastwest_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				cl, cr2xcse, cr, n, xcse, n2xn, xn, xcsw, cl2xcsw);
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = rightleft2eastwestImpl.pattern_rightleft2eastwest_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XBTNode xcse = (XBTNode) result2_binding[0];
		XBTNode xn = (XBTNode) result2_binding[1];
		XBTNode xcsw = (XBTNode) result2_binding[2];
		for (Object[] result2_black : rightleft2eastwestImpl.pattern_rightleft2eastwest_12_2_corematch_blackFBFBBB(xcse,
				xn, xcsw, match)) {
			BTNode n = (BTNode) result2_black[0];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			// ForEach 
			for (Object[] result3_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_12_3_findcontext_blackBBBBB(n, xcse, n2xn, xn, xcsw)) {
				Object[] result3_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_12_3_findcontext_greenBBBBBFFFFFFF(n, xcse, n2xn, xn, xcsw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, n,
								xcse, n2xn, xn, xcsw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xcse] = "
							+ xcse + ", " + "[n2xn] = " + n2xn + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (rightleft2eastwestImpl.pattern_rightleft2eastwest_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = rightleft2eastwestImpl
							.pattern_rightleft2eastwest_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		match.registerObject("xcse", xcse);
		match.registerObject("xn", xn);
		match.registerObject("xcsw", xcsw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xcse,
			BTNode2XBTnode n2xn, XBTNode xn, XBTNode xcsw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("xcse", xcse);
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("xcsw", xcsw);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n,
			EObject xcse, EObject n2xn, EObject xn, EObject xcsw, EObject cl2xcsw) {
		ruleresult.registerObject("cl", cl);
		ruleresult.registerObject("cr2xcse", cr2xcse);
		ruleresult.registerObject("cr", cr);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("xcse", xcse);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("xcsw", xcsw);
		ruleresult.registerObject("cl2xcsw", cl2xcsw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xcse").eClass()).equals("xbtree.XBTNode.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xcsw").eClass()).equals("xbtree.XBTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_50(EMoflonEdge _edge_w) {

		Object[] result1_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = rightleft2eastwestImpl.pattern_rightleft2eastwest_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : rightleft2eastwestImpl
				.pattern_rightleft2eastwest_20_2_testcorematchandDECs_blackFFFB(_edge_w)) {
			XBTNode xcse = (XBTNode) result2_black[0];
			XBTNode xn = (XBTNode) result2_black[1];
			XBTNode xcsw = (XBTNode) result2_black[2];
			Object[] result2_green = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (rightleft2eastwestImpl
					.pattern_rightleft2eastwest_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, xcse, xn, xcsw)) {
				// 
				if (rightleft2eastwestImpl
						.pattern_rightleft2eastwest_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = rightleft2eastwestImpl
							.pattern_rightleft2eastwest_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_50(EMoflonEdge _edge_r) {

		Object[] result1_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = rightleft2eastwestImpl.pattern_rightleft2eastwest_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : rightleft2eastwestImpl
				.pattern_rightleft2eastwest_21_2_testcorematchandDECs_blackFFFB(_edge_r)) {
			BTNode cl = (BTNode) result2_black[0];
			BTNode cr = (BTNode) result2_black[1];
			BTNode n = (BTNode) result2_black[2];
			Object[] result2_green = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (rightleft2eastwestImpl
					.pattern_rightleft2eastwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, cl, cr, n)) {
				// 
				if (rightleft2eastwestImpl
						.pattern_rightleft2eastwest_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = rightleft2eastwestImpl
							.pattern_rightleft2eastwest_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("rightleft2eastwest");
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
		ruleResult.setRule("rightleft2eastwest");
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

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = rightleft2eastwestImpl.pattern_rightleft2eastwest_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		BTNode cl = (BTNode) result2_bindingAndBlack[0];
		BTNode cr = (BTNode) result2_bindingAndBlack[1];
		BTNode n = (BTNode) result2_bindingAndBlack[2];
		XBTNode xcse = (XBTNode) result2_bindingAndBlack[3];
		XBTNode xn = (XBTNode) result2_bindingAndBlack[4];
		XBTNode xcsw = (XBTNode) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, cl, cr, n, xcse, xn, xcsw,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cl] = " + cl + ", " + "[cr] = " + cr + ", " + "[n] = " + n + ", " + "[xcse] = " + xcse + ", "
					+ "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_24_5_matchcorrcontext_blackBFBBB(n, xn, sourceMatch, targetMatch)) {
				BTNode2XBTnode n2xn = (BTNode2XBTnode) result5_black[1];
				Object[] result5_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_5_matchcorrcontext_greenBBBF(n2xn, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_6_createcorrespondence_blackBBBBBBB(cl, cr, n, xcse, xn, xcsw,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cl] = " + cl + ", "
							+ "[cr] = " + cr + ", " + "[n] = " + n + ", " + "[xcse] = " + xcse + ", " + "[xn] = " + xn
							+ ", " + "[xcsw] = " + xcsw + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				rightleft2eastwestImpl.pattern_rightleft2eastwest_24_6_createcorrespondence_greenBFBBBFB(cl, cr, xcse,
						xcsw, ccMatch);
				//nothing BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result6_green[1];
				//nothing BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result6_green[5];

				Object[] result7_black = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				rightleft2eastwestImpl.pattern_rightleft2eastwest_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(BTNode cl, BTNode cr, BTNode n, XBTNode xcse, XBTNode xn, XBTNode xcsw,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(BTNode cl, BTNode cr, BTNode n) {// 
		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_27_1_matchtggpattern_blackBBB(cl, cr,
				n);
		if (result1_black != null) {
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_27_2_expressionF();
		} else {
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(XBTNode xcse, XBTNode xn, XBTNode xcsw) {// 
		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_28_1_matchtggpattern_blackBBB(xcse,
				xn, xcsw);
		if (result1_black != null) {
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_28_2_expressionF();
		} else {
			return rightleft2eastwestImpl.pattern_rightleft2eastwest_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, BTNode2XBTnode n2xnParameter) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : rightleft2eastwestImpl
				.pattern_rightleft2eastwest_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList n2xnList = (RuleEntryList) result2_black[0];
			BTNode n = (BTNode) result2_black[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[2];
			XBTNode xn = (XBTNode) result2_black[3];

			Object[] result3_bindingAndBlack = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, n2xn,
							xn, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[n2xn] = " + n2xn
						+ ", " + "[xn] = " + xn + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (rightleft2eastwestImpl.pattern_rightleft2eastwest_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_5_checknacs_blackBBB(n,
						n2xn, xn);
				if (result5_black != null) {

					Object[] result6_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_6_perform_blackBBBB(n,
							n2xn, xn, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[n] = " + n + ", " + "[n2xn] = " + n2xn
										+ ", " + "[xn] = " + xn + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_29_6_perform_greenFFFBFBFFB(n, xn, ruleResult);
					//nothing BTNode cl = (BTNode) result6_green[0];
					//nothing BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result6_green[1];
					//nothing BTNode cr = (BTNode) result6_green[2];
					//nothing XBTNode xcse = (XBTNode) result6_green[4];
					//nothing XBTNode xcsw = (XBTNode) result6_green[6];
					//nothing BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return rightleft2eastwestImpl.pattern_rightleft2eastwest_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BTNode n, BTNode2XBTnode n2xn,
			XBTNode xn, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("xn", xn);
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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD__MATCH_BTNODE_BTNODE_BTNODE:
			return isAppropriate_FWD((Match) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2),
					(BTNode) arguments.get(3));
		case RulesPackage.RIGHTLEFT2EASTWEST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BTNODE_BTNODE_BTNODE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2),
					(BTNode) arguments.get(3));
			return null;
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BTNODE_BTNODE_BTNODE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode) arguments.get(2), (BTNode) arguments.get(3));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_BTNODE_BTNODE_BTNODE2XBTNODE_XBTNODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode) arguments.get(2), (BTNode) arguments.get(3), (BTNode2XBTnode) arguments.get(4),
					(XBTNode) arguments.get(5));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE:
			return isAppropriate_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2),
					(XBTNode) arguments.get(3));
		case RulesPackage.RIGHTLEFT2EASTWEST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2),
					(XBTNode) arguments.get(3));
			return null;
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_XBTNODE_XBTNODE_XBTNODE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (XBTNode) arguments.get(3));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_XBTNODE_XBTNODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3), (XBTNode) arguments.get(4),
					(XBTNode) arguments.get(5));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_BTNODE_BTNODE_XBTNODE_XBTNODE_XBTNODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((BTNode) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode) arguments.get(2), (XBTNode) arguments.get(3), (XBTNode) arguments.get(4),
					(XBTNode) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_DEC_FWD__BTNODE_BTNODE_BTNODE:
			return checkDEC_FWD((BTNode) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE_XBTNODE:
			return checkDEC_BWD((XBTNode) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE:
			return generateModel((RuleEntryContainer) arguments.get(0), (BTNode2XBTnode) arguments.get(1));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_BTNODE2XBTNODE_XBTNODE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode2XBTnode) arguments.get(2), (XBTNode) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_rightleft2eastwest_0_1_initialbindings_blackBBBBB(rightleft2eastwest _this,
			Match match, BTNode cl, BTNode cr, BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					return new Object[] { _this, match, cl, cr, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_bindingFBBBBB(rightleft2eastwest _this,
			Match match, BTNode cl, BTNode cr, BTNode n) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cl, cr, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cl, cr, n };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_bindingAndBlackFBBBBB(rightleft2eastwest _this,
			Match match, BTNode cl, BTNode cr, BTNode n) {
		Object[] result_pattern_rightleft2eastwest_0_2_SolveCSP_binding = pattern_rightleft2eastwest_0_2_SolveCSP_bindingFBBBBB(
				_this, match, cl, cr, n);
		if (result_pattern_rightleft2eastwest_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_0_2_SolveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_0_2_SolveCSP_black = pattern_rightleft2eastwest_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cl, cr, n };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_0_3_CheckCSP_expressionFBB(rightleft2eastwest _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_0_4_collectelementstobetranslated_blackBBBB(Match match,
			BTNode cl, BTNode cr, BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					return new Object[] { match, cl, cr, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			BTNode cl, BTNode cr, BTNode n) {
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(cl);
		match.getToBeTranslatedNodes().add(cr);
		String n__cr____r_name_prime = "r";
		String n__cl____l_name_prime = "l";
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		match.getToBeTranslatedEdges().add(n__cr____r);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		match.getToBeTranslatedEdges().add(n__cl____l);
		n__cr____r.setName(n__cr____r_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		return new Object[] { match, cl, cr, n, n__cr____r, n__cl____l };
	}

	public static final Object[] pattern_rightleft2eastwest_0_5_collectcontextelements_blackBBBB(Match match, BTNode cl,
			BTNode cr, BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					return new Object[] { match, cl, cr, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_5_collectcontextelements_greenBB(Match match, BTNode n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_rightleft2eastwest_0_6_registerobjectstomatch_expressionBBBBB(
			rightleft2eastwest _this, Match match, BTNode cl, BTNode cr, BTNode n) {
		_this.registerObjectsToMatch_FWD(match, cl, cr, n);

	}

	public static final boolean pattern_rightleft2eastwest_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("cl");
		EObject _localVariable_1 = isApplicableMatch.getObject("cr");
		EObject _localVariable_2 = isApplicableMatch.getObject("n");
		EObject _localVariable_3 = isApplicableMatch.getObject("n2xn");
		EObject _localVariable_4 = isApplicableMatch.getObject("xn");
		EObject tmpCl = _localVariable_0;
		EObject tmpCr = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpN2xn = _localVariable_3;
		EObject tmpXn = _localVariable_4;
		if (tmpCl instanceof BTNode) {
			BTNode cl = (BTNode) tmpCl;
			if (tmpCr instanceof BTNode) {
				BTNode cr = (BTNode) tmpCr;
				if (tmpN instanceof BTNode) {
					BTNode n = (BTNode) tmpN;
					if (tmpN2xn instanceof BTNode2XBTnode) {
						BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
						if (tmpXn instanceof XBTNode) {
							XBTNode xn = (XBTNode) tmpXn;
							return new Object[] { cl, cr, n, n2xn, xn, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_blackBBBBBFBB(BTNode cl,
			BTNode cr, BTNode n, BTNode2XBTnode n2xn, XBTNode xn, rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { cl, cr, n, n2xn, xn, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_rightleft2eastwest_1_1_performtransformation_binding = pattern_rightleft2eastwest_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_rightleft2eastwest_1_1_performtransformation_binding != null) {
			BTNode cl = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[0];
			BTNode cr = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[1];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[2];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[3];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[4];

			Object[] result_pattern_rightleft2eastwest_1_1_performtransformation_black = pattern_rightleft2eastwest_1_1_performtransformation_blackBBBBBFBB(
					cl, cr, n, n2xn, xn, _this, isApplicableMatch);
			if (result_pattern_rightleft2eastwest_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_rightleft2eastwest_1_1_performtransformation_black[5];

				return new Object[] { cl, cr, n, n2xn, xn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_greenBFBFBFF(BTNode cl, BTNode cr,
			XBTNode xn) {
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		XBTNode xcse = XbtreeFactory.eINSTANCE.createXBTNode();
		XBTNode xcsw = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		cr2xcse.setSource(cr);
		cr2xcse.setTarget(xcse);
		xn.setSe(xcse);
		xcse.setW(xcsw);
		xn.setSw(xcsw);
		xcsw.setE(xcse);
		cl2xcsw.setTarget(xcsw);
		cl2xcsw.setSource(cl);
		return new Object[] { cl, cr2xcse, cr, xcse, xn, xcsw, cl2xcsw };
	}

	public static final Object[] pattern_rightleft2eastwest_1_2_collecttranslatedelements_blackBBBBBB(BTNode cl,
			BTNode2XBTnode cr2xcse, BTNode cr, XBTNode xcse, XBTNode xcsw, BTNode2XBTnode cl2xcsw) {
		if (!cl.equals(cr)) {
			if (!xcse.equals(xcsw)) {
				if (!cl2xcsw.equals(cr2xcse)) {
					return new Object[] { cl, cr2xcse, cr, xcse, xcsw, cl2xcsw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_2_collecttranslatedelements_greenFBBBBBB(BTNode cl,
			BTNode2XBTnode cr2xcse, BTNode cr, XBTNode xcse, XBTNode xcsw, BTNode2XBTnode cl2xcsw) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(cl);
		ruleresult.getCreatedLinkElements().add(cr2xcse);
		ruleresult.getTranslatedElements().add(cr);
		ruleresult.getCreatedElements().add(xcse);
		ruleresult.getCreatedElements().add(xcsw);
		ruleresult.getCreatedLinkElements().add(cl2xcsw);
		return new Object[] { ruleresult, cl, cr2xcse, cr, xcse, xcsw, cl2xcsw };
	}

	public static final Object[] pattern_rightleft2eastwest_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n, EObject xcse,
			EObject n2xn, EObject xn, EObject xcsw, EObject cl2xcsw) {
		if (!cl.equals(cr2xcse)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					if (!cl.equals(xcse)) {
						if (!cl.equals(n2xn)) {
							if (!cl.equals(xn)) {
								if (!cl.equals(xcsw)) {
									if (!cl.equals(cl2xcsw)) {
										if (!cr2xcse.equals(n)) {
											if (!cr2xcse.equals(xcse)) {
												if (!cr2xcse.equals(n2xn)) {
													if (!cr2xcse.equals(xn)) {
														if (!cr2xcse.equals(xcsw)) {
															if (!cr.equals(cr2xcse)) {
																if (!cr.equals(n)) {
																	if (!cr.equals(xcse)) {
																		if (!cr.equals(n2xn)) {
																			if (!cr.equals(xn)) {
																				if (!cr.equals(xcsw)) {
																					if (!n.equals(xcse)) {
																						if (!n.equals(n2xn)) {
																							if (!n.equals(xn)) {
																								if (!n.equals(xcsw)) {
																									if (!xcse.equals(
																											xn)) {
																										if (!xcse
																												.equals(xcsw)) {
																											if (!n2xn
																													.equals(xcse)) {
																												if (!n2xn
																														.equals(xn)) {
																													if (!n2xn
																															.equals(xcsw)) {
																														if (!xcsw
																																.equals(xn)) {
																															if (!cl2xcsw
																																	.equals(cr2xcse)) {
																																if (!cl2xcsw
																																		.equals(cr)) {
																																	if (!cl2xcsw
																																			.equals(n)) {
																																		if (!cl2xcsw
																																				.equals(xcse)) {
																																			if (!cl2xcsw
																																					.equals(n2xn)) {
																																				if (!cl2xcsw
																																						.equals(xn)) {
																																					if (!cl2xcsw
																																							.equals(xcsw)) {
																																						return new Object[] {
																																								ruleresult,
																																								cl,
																																								cr2xcse,
																																								cr,
																																								n,
																																								xcse,
																																								n2xn,
																																								xn,
																																								xcsw,
																																								cl2xcsw };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n, EObject xcse, EObject xn,
			EObject xcsw, EObject cl2xcsw) {
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__cr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__xcse____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__xcsw____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__cl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "rightleft2eastwest";
		String n__cr____r_name_prime = "r";
		String cr2xcse__cr____source_name_prime = "source";
		String xcse__xcsw____w_name_prime = "w";
		String n__cl____l_name_prime = "l";
		String xn__xcsw____sw_name_prime = "sw";
		String cr2xcse__xcse____target_name_prime = "target";
		String xcsw__xcse____e_name_prime = "e";
		String cl2xcsw__xcsw____target_name_prime = "target";
		String cl2xcsw__cl____source_name_prime = "source";
		String xn__xcse____se_name_prime = "se";
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		ruleresult.getTranslatedEdges().add(n__cr____r);
		cr2xcse__cr____source.setSrc(cr2xcse);
		cr2xcse__cr____source.setTrg(cr);
		ruleresult.getCreatedEdges().add(cr2xcse__cr____source);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(xcse__xcsw____w);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		ruleresult.getTranslatedEdges().add(n__cl____l);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(xn__xcsw____sw);
		cr2xcse__xcse____target.setSrc(cr2xcse);
		cr2xcse__xcse____target.setTrg(xcse);
		ruleresult.getCreatedEdges().add(cr2xcse__xcse____target);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		ruleresult.getCreatedEdges().add(xcsw__xcse____e);
		cl2xcsw__xcsw____target.setSrc(cl2xcsw);
		cl2xcsw__xcsw____target.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(cl2xcsw__xcsw____target);
		cl2xcsw__cl____source.setSrc(cl2xcsw);
		cl2xcsw__cl____source.setTrg(cl);
		ruleresult.getCreatedEdges().add(cl2xcsw__cl____source);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		ruleresult.getCreatedEdges().add(xn__xcse____se);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		cr2xcse__cr____source.setName(cr2xcse__cr____source_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		cr2xcse__xcse____target.setName(cr2xcse__xcse____target_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		cl2xcsw__xcsw____target.setName(cl2xcsw__xcsw____target_name_prime);
		cl2xcsw__cl____source.setName(cl2xcsw__cl____source_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		return new Object[] { ruleresult, cl, cr2xcse, cr, n, xcse, xn, xcsw, cl2xcsw, n__cr____r,
				cr2xcse__cr____source, xcse__xcsw____w, n__cl____l, xn__xcsw____sw, cr2xcse__xcse____target,
				xcsw__xcse____e, cl2xcsw__xcsw____target, cl2xcsw__cl____source, xn__xcse____se };
	}

	public static final void pattern_rightleft2eastwest_1_5_registerobjects_expressionBBBBBBBBBBB(
			rightleft2eastwest _this, PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n,
			EObject xcse, EObject n2xn, EObject xn, EObject xcsw, EObject cl2xcsw) {
		_this.registerObjects_FWD(ruleresult, cl, cr2xcse, cr, n, xcse, n2xn, xn, xcsw, cl2xcsw);

	}

	public static final PerformRuleResult pattern_rightleft2eastwest_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_2_1_preparereturnvalue_bindingFB(rightleft2eastwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_2_1_preparereturnvalue_blackFBB(EClass eClass,
			rightleft2eastwest _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_2_1_preparereturnvalue_bindingAndBlackFFB(
			rightleft2eastwest _this) {
		Object[] result_pattern_rightleft2eastwest_2_1_preparereturnvalue_binding = pattern_rightleft2eastwest_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_rightleft2eastwest_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_rightleft2eastwest_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_rightleft2eastwest_2_1_preparereturnvalue_black = pattern_rightleft2eastwest_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_rightleft2eastwest_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_rightleft2eastwest_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "rightleft2eastwest";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_rightleft2eastwest_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cl");
		EObject _localVariable_1 = match.getObject("cr");
		EObject _localVariable_2 = match.getObject("n");
		EObject tmpCl = _localVariable_0;
		EObject tmpCr = _localVariable_1;
		EObject tmpN = _localVariable_2;
		if (tmpCl instanceof BTNode) {
			BTNode cl = (BTNode) tmpCl;
			if (tmpCr instanceof BTNode) {
				BTNode cr = (BTNode) tmpCr;
				if (tmpN instanceof BTNode) {
					BTNode n = (BTNode) tmpN;
					return new Object[] { cl, cr, n, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_2_2_corematch_blackBBBFFB(BTNode cl, BTNode cr,
			BTNode n, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
							BTNode2XBTnode.class, "source")) {
						XBTNode xn = n2xn.getTarget();
						if (xn != null) {
							_result.add(new Object[] { cl, cr, n, n2xn, xn, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_2_3_findcontext_blackBBBBB(BTNode cl, BTNode cr,
			BTNode n, BTNode2XBTnode n2xn, XBTNode xn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					if (cr.equals(n.getR())) {
						if (cl.equals(n.getL())) {
							if (xn.equals(n2xn.getTarget())) {
								if (n.equals(n2xn.getSource())) {
									_result.add(new Object[] { cl, cr, n, n2xn, xn });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_2_3_findcontext_greenBBBBBFFFFF(BTNode cl, BTNode cr,
			BTNode n, BTNode2XBTnode n2xn, XBTNode xn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__cr____r_name_prime = "r";
		String n__cl____l_name_prime = "l";
		String n2xn__xn____target_name_prime = "target";
		String n2xn__n____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(cl);
		isApplicableMatch.getAllContextElements().add(cr);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(xn);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		isApplicableMatch.getAllContextElements().add(n__cr____r);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		isApplicableMatch.getAllContextElements().add(n__cl____l);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		n__cr____r.setName(n__cr____r_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		return new Object[] { cl, cr, n, n2xn, xn, isApplicableMatch, n__cr____r, n__cl____l, n2xn__xn____target,
				n2xn__n____source };
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_bindingFBBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, BTNode cl, BTNode cr, BTNode n, BTNode2XBTnode n2xn, XBTNode xn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, cl, cr, n, n2xn, xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cl, cr, n, n2xn, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode cl, BTNode cr, BTNode n,
			BTNode2XBTnode n2xn, XBTNode xn) {
		Object[] result_pattern_rightleft2eastwest_2_4_solveCSP_binding = pattern_rightleft2eastwest_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, cl, cr, n, n2xn, xn);
		if (result_pattern_rightleft2eastwest_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_2_4_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_2_4_solveCSP_black = pattern_rightleft2eastwest_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cl, cr, n, n2xn, xn };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_2_5_checkCSP_expressionFBB(rightleft2eastwest _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_rightleft2eastwest_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "rightleft2eastwest";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_rightleft2eastwest_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_10_1_initialbindings_blackBBBBB(rightleft2eastwest _this,
			Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					return new Object[] { _this, match, xcse, xn, xcsw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_bindingFBBBBB(rightleft2eastwest _this,
			Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, xcse, xn, xcsw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xcse, xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_bindingAndBlackFBBBBB(
			rightleft2eastwest _this, Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		Object[] result_pattern_rightleft2eastwest_10_2_SolveCSP_binding = pattern_rightleft2eastwest_10_2_SolveCSP_bindingFBBBBB(
				_this, match, xcse, xn, xcsw);
		if (result_pattern_rightleft2eastwest_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_10_2_SolveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_10_2_SolveCSP_black = pattern_rightleft2eastwest_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xcse, xn, xcsw };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_10_3_CheckCSP_expressionFBB(rightleft2eastwest _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_10_4_collectelementstobetranslated_blackBBBB(Match match,
			XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					return new Object[] { match, xcse, xn, xcsw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xcse);
		match.getToBeTranslatedNodes().add(xcsw);
		String xcse__xcsw____w_name_prime = "w";
		String xn__xcsw____sw_name_prime = "sw";
		String xcsw__xcse____e_name_prime = "e";
		String xn__xcse____se_name_prime = "se";
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		match.getToBeTranslatedEdges().add(xcse__xcsw____w);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		match.getToBeTranslatedEdges().add(xn__xcsw____sw);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		match.getToBeTranslatedEdges().add(xcsw__xcse____e);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		match.getToBeTranslatedEdges().add(xn__xcse____se);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		return new Object[] { match, xcse, xn, xcsw, xcse__xcsw____w, xn__xcsw____sw, xcsw__xcse____e, xn__xcse____se };
	}

	public static final Object[] pattern_rightleft2eastwest_10_5_collectcontextelements_blackBBBB(Match match,
			XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					return new Object[] { match, xcse, xn, xcsw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_5_collectcontextelements_greenBB(Match match,
			XBTNode xn) {
		match.getContextNodes().add(xn);
		return new Object[] { match, xn };
	}

	public static final void pattern_rightleft2eastwest_10_6_registerobjectstomatch_expressionBBBBB(
			rightleft2eastwest _this, Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		_this.registerObjectsToMatch_BWD(match, xcse, xn, xcsw);

	}

	public static final boolean pattern_rightleft2eastwest_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject _localVariable_1 = isApplicableMatch.getObject("xcse");
		EObject _localVariable_2 = isApplicableMatch.getObject("n2xn");
		EObject _localVariable_3 = isApplicableMatch.getObject("xn");
		EObject _localVariable_4 = isApplicableMatch.getObject("xcsw");
		EObject tmpN = _localVariable_0;
		EObject tmpXcse = _localVariable_1;
		EObject tmpN2xn = _localVariable_2;
		EObject tmpXn = _localVariable_3;
		EObject tmpXcsw = _localVariable_4;
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			if (tmpXcse instanceof XBTNode) {
				XBTNode xcse = (XBTNode) tmpXcse;
				if (tmpN2xn instanceof BTNode2XBTnode) {
					BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
					if (tmpXn instanceof XBTNode) {
						XBTNode xn = (XBTNode) tmpXn;
						if (tmpXcsw instanceof XBTNode) {
							XBTNode xcsw = (XBTNode) tmpXcsw;
							return new Object[] { n, xcse, n2xn, xn, xcsw, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_blackBBBBBFBB(BTNode n,
			XBTNode xcse, BTNode2XBTnode n2xn, XBTNode xn, XBTNode xcsw, rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { n, xcse, n2xn, xn, xcsw, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_rightleft2eastwest_11_1_performtransformation_binding = pattern_rightleft2eastwest_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_rightleft2eastwest_11_1_performtransformation_binding != null) {
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[0];
			XBTNode xcse = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[1];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[2];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[3];
			XBTNode xcsw = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[4];

			Object[] result_pattern_rightleft2eastwest_11_1_performtransformation_black = pattern_rightleft2eastwest_11_1_performtransformation_blackBBBBBFBB(
					n, xcse, n2xn, xn, xcsw, _this, isApplicableMatch);
			if (result_pattern_rightleft2eastwest_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_rightleft2eastwest_11_1_performtransformation_black[5];

				return new Object[] { n, xcse, n2xn, xn, xcsw, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_greenFFFBBBF(BTNode n,
			XBTNode xcse, XBTNode xcsw) {
		BTNode cl = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode cr = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		n.setL(cl);
		cr2xcse.setTarget(xcse);
		n.setR(cr);
		cr2xcse.setSource(cr);
		cl2xcsw.setTarget(xcsw);
		cl2xcsw.setSource(cl);
		return new Object[] { cl, cr2xcse, cr, n, xcse, xcsw, cl2xcsw };
	}

	public static final Object[] pattern_rightleft2eastwest_11_2_collecttranslatedelements_blackBBBBBB(BTNode cl,
			BTNode2XBTnode cr2xcse, BTNode cr, XBTNode xcse, XBTNode xcsw, BTNode2XBTnode cl2xcsw) {
		if (!cl.equals(cr)) {
			if (!xcse.equals(xcsw)) {
				if (!cl2xcsw.equals(cr2xcse)) {
					return new Object[] { cl, cr2xcse, cr, xcse, xcsw, cl2xcsw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_2_collecttranslatedelements_greenFBBBBBB(BTNode cl,
			BTNode2XBTnode cr2xcse, BTNode cr, XBTNode xcse, XBTNode xcsw, BTNode2XBTnode cl2xcsw) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(cl);
		ruleresult.getCreatedLinkElements().add(cr2xcse);
		ruleresult.getCreatedElements().add(cr);
		ruleresult.getTranslatedElements().add(xcse);
		ruleresult.getTranslatedElements().add(xcsw);
		ruleresult.getCreatedLinkElements().add(cl2xcsw);
		return new Object[] { ruleresult, cl, cr2xcse, cr, xcse, xcsw, cl2xcsw };
	}

	public static final Object[] pattern_rightleft2eastwest_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n, EObject xcse,
			EObject n2xn, EObject xn, EObject xcsw, EObject cl2xcsw) {
		if (!cl.equals(cr2xcse)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					if (!cl.equals(xcse)) {
						if (!cl.equals(n2xn)) {
							if (!cl.equals(xn)) {
								if (!cl.equals(xcsw)) {
									if (!cl.equals(cl2xcsw)) {
										if (!cr2xcse.equals(n)) {
											if (!cr2xcse.equals(xcse)) {
												if (!cr2xcse.equals(n2xn)) {
													if (!cr2xcse.equals(xn)) {
														if (!cr2xcse.equals(xcsw)) {
															if (!cr.equals(cr2xcse)) {
																if (!cr.equals(n)) {
																	if (!cr.equals(xcse)) {
																		if (!cr.equals(n2xn)) {
																			if (!cr.equals(xn)) {
																				if (!cr.equals(xcsw)) {
																					if (!n.equals(xcse)) {
																						if (!n.equals(n2xn)) {
																							if (!n.equals(xn)) {
																								if (!n.equals(xcsw)) {
																									if (!xcse.equals(
																											xn)) {
																										if (!xcse
																												.equals(xcsw)) {
																											if (!n2xn
																													.equals(xcse)) {
																												if (!n2xn
																														.equals(xn)) {
																													if (!n2xn
																															.equals(xcsw)) {
																														if (!xcsw
																																.equals(xn)) {
																															if (!cl2xcsw
																																	.equals(cr2xcse)) {
																																if (!cl2xcsw
																																		.equals(cr)) {
																																	if (!cl2xcsw
																																			.equals(n)) {
																																		if (!cl2xcsw
																																				.equals(xcse)) {
																																			if (!cl2xcsw
																																					.equals(n2xn)) {
																																				if (!cl2xcsw
																																						.equals(xn)) {
																																					if (!cl2xcsw
																																							.equals(xcsw)) {
																																						return new Object[] {
																																								ruleresult,
																																								cl,
																																								cr2xcse,
																																								cr,
																																								n,
																																								xcse,
																																								n2xn,
																																								xn,
																																								xcsw,
																																								cl2xcsw };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n, EObject xcse, EObject xn,
			EObject xcsw, EObject cl2xcsw) {
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__cr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__xcse____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__xcsw____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__cl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "rightleft2eastwest";
		String n__cr____r_name_prime = "r";
		String cr2xcse__cr____source_name_prime = "source";
		String xcse__xcsw____w_name_prime = "w";
		String n__cl____l_name_prime = "l";
		String xn__xcsw____sw_name_prime = "sw";
		String cr2xcse__xcse____target_name_prime = "target";
		String xcsw__xcse____e_name_prime = "e";
		String cl2xcsw__xcsw____target_name_prime = "target";
		String cl2xcsw__cl____source_name_prime = "source";
		String xn__xcse____se_name_prime = "se";
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		ruleresult.getCreatedEdges().add(n__cr____r);
		cr2xcse__cr____source.setSrc(cr2xcse);
		cr2xcse__cr____source.setTrg(cr);
		ruleresult.getCreatedEdges().add(cr2xcse__cr____source);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		ruleresult.getTranslatedEdges().add(xcse__xcsw____w);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		ruleresult.getCreatedEdges().add(n__cl____l);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		ruleresult.getTranslatedEdges().add(xn__xcsw____sw);
		cr2xcse__xcse____target.setSrc(cr2xcse);
		cr2xcse__xcse____target.setTrg(xcse);
		ruleresult.getCreatedEdges().add(cr2xcse__xcse____target);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		ruleresult.getTranslatedEdges().add(xcsw__xcse____e);
		cl2xcsw__xcsw____target.setSrc(cl2xcsw);
		cl2xcsw__xcsw____target.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(cl2xcsw__xcsw____target);
		cl2xcsw__cl____source.setSrc(cl2xcsw);
		cl2xcsw__cl____source.setTrg(cl);
		ruleresult.getCreatedEdges().add(cl2xcsw__cl____source);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		ruleresult.getTranslatedEdges().add(xn__xcse____se);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		cr2xcse__cr____source.setName(cr2xcse__cr____source_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		cr2xcse__xcse____target.setName(cr2xcse__xcse____target_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		cl2xcsw__xcsw____target.setName(cl2xcsw__xcsw____target_name_prime);
		cl2xcsw__cl____source.setName(cl2xcsw__cl____source_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		return new Object[] { ruleresult, cl, cr2xcse, cr, n, xcse, xn, xcsw, cl2xcsw, n__cr____r,
				cr2xcse__cr____source, xcse__xcsw____w, n__cl____l, xn__xcsw____sw, cr2xcse__xcse____target,
				xcsw__xcse____e, cl2xcsw__xcsw____target, cl2xcsw__cl____source, xn__xcse____se };
	}

	public static final void pattern_rightleft2eastwest_11_5_registerobjects_expressionBBBBBBBBBBB(
			rightleft2eastwest _this, PerformRuleResult ruleresult, EObject cl, EObject cr2xcse, EObject cr, EObject n,
			EObject xcse, EObject n2xn, EObject xn, EObject xcsw, EObject cl2xcsw) {
		_this.registerObjects_BWD(ruleresult, cl, cr2xcse, cr, n, xcse, n2xn, xn, xcsw, cl2xcsw);

	}

	public static final PerformRuleResult pattern_rightleft2eastwest_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_12_1_preparereturnvalue_bindingFB(
			rightleft2eastwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_12_1_preparereturnvalue_blackFBB(EClass eClass,
			rightleft2eastwest _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_12_1_preparereturnvalue_bindingAndBlackFFB(
			rightleft2eastwest _this) {
		Object[] result_pattern_rightleft2eastwest_12_1_preparereturnvalue_binding = pattern_rightleft2eastwest_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_rightleft2eastwest_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_rightleft2eastwest_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_rightleft2eastwest_12_1_preparereturnvalue_black = pattern_rightleft2eastwest_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_rightleft2eastwest_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_rightleft2eastwest_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "rightleft2eastwest";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_rightleft2eastwest_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xcse");
		EObject _localVariable_1 = match.getObject("xn");
		EObject _localVariable_2 = match.getObject("xcsw");
		EObject tmpXcse = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		EObject tmpXcsw = _localVariable_2;
		if (tmpXcse instanceof XBTNode) {
			XBTNode xcse = (XBTNode) tmpXcse;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				if (tmpXcsw instanceof XBTNode) {
					XBTNode xcsw = (XBTNode) tmpXcsw;
					return new Object[] { xcse, xn, xcsw, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_12_2_corematch_blackFBFBBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
							BTNode2XBTnode.class, "target")) {
						BTNode n = n2xn.getSource();
						if (n != null) {
							_result.add(new Object[] { n, xcse, n2xn, xn, xcsw, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_12_3_findcontext_blackBBBBB(BTNode n,
			XBTNode xcse, BTNode2XBTnode n2xn, XBTNode xn, XBTNode xcsw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					if (xcsw.equals(xcse.getW())) {
						if (xcsw.equals(xn.getSw())) {
							if (xn.equals(n2xn.getTarget())) {
								if (xcse.equals(xcsw.getE())) {
									if (xcse.equals(xn.getSe())) {
										if (n.equals(n2xn.getSource())) {
											_result.add(new Object[] { n, xcse, n2xn, xn, xcsw });
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

	public static final Object[] pattern_rightleft2eastwest_12_3_findcontext_greenBBBBBFFFFFFF(BTNode n, XBTNode xcse,
			BTNode2XBTnode n2xn, XBTNode xn, XBTNode xcsw) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xcse__xcsw____w_name_prime = "w";
		String xn__xcsw____sw_name_prime = "sw";
		String n2xn__xn____target_name_prime = "target";
		String xcsw__xcse____e_name_prime = "e";
		String xn__xcse____se_name_prime = "se";
		String n2xn__n____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xcse);
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(xcsw);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		isApplicableMatch.getAllContextElements().add(xcse__xcsw____w);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		isApplicableMatch.getAllContextElements().add(xn__xcsw____sw);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		isApplicableMatch.getAllContextElements().add(xcsw__xcse____e);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		isApplicableMatch.getAllContextElements().add(xn__xcse____se);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		return new Object[] { n, xcse, n2xn, xn, xcsw, isApplicableMatch, xcse__xcsw____w, xn__xcsw____sw,
				n2xn__xn____target, xcsw__xcse____e, xn__xcse____se, n2xn__n____source };
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_bindingFBBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xcse, BTNode2XBTnode n2xn, XBTNode xn,
			XBTNode xcsw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, n, xcse, n2xn, xn, xcsw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xcse, n2xn, xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xcse, BTNode2XBTnode n2xn,
			XBTNode xn, XBTNode xcsw) {
		Object[] result_pattern_rightleft2eastwest_12_4_solveCSP_binding = pattern_rightleft2eastwest_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, n, xcse, n2xn, xn, xcsw);
		if (result_pattern_rightleft2eastwest_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_12_4_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_12_4_solveCSP_black = pattern_rightleft2eastwest_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xcse, n2xn, xn, xcsw };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_12_5_checkCSP_expressionFBB(rightleft2eastwest _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_rightleft2eastwest_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "rightleft2eastwest";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_rightleft2eastwest_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_20_1_preparereturnvalue_bindingFB(
			rightleft2eastwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			rightleft2eastwest _this) {
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

	public static final Object[] pattern_rightleft2eastwest_20_1_preparereturnvalue_bindingAndBlackFFBF(
			rightleft2eastwest _this) {
		Object[] result_pattern_rightleft2eastwest_20_1_preparereturnvalue_binding = pattern_rightleft2eastwest_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_rightleft2eastwest_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_rightleft2eastwest_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_rightleft2eastwest_20_1_preparereturnvalue_black = pattern_rightleft2eastwest_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_rightleft2eastwest_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_rightleft2eastwest_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_rightleft2eastwest_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_0BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					XBTNode __DEC_xcse_e_739166 = xcse.getE();
					if (__DEC_xcse_e_739166 != null) {
						if (!xcse.equals(__DEC_xcse_e_739166)) {
							if (!xn.equals(__DEC_xcse_e_739166)) {
								if (!xcsw.equals(__DEC_xcse_e_739166)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_1BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_w_566027 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "w")) {
						if (!xcse.equals(__DEC_xcse_w_566027)) {
							if (!xn.equals(__DEC_xcse_w_566027)) {
								if (!xcsw.equals(__DEC_xcse_w_566027)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_2BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_sw_345475 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "sw")) {
						if (!xcse.equals(__DEC_xcse_sw_345475)) {
							if (!xn.equals(__DEC_xcse_sw_345475)) {
								if (!xcsw.equals(__DEC_xcse_sw_345475)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_3BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_e_41560 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "e")) {
						if (!xcse.equals(__DEC_xcse_e_41560)) {
							if (!xn.equals(__DEC_xcse_e_41560)) {
								if (!xcsw.equals(__DEC_xcse_e_41560)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_4BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					XBTNode __DEC_xcsw_w_978210 = xcsw.getW();
					if (__DEC_xcsw_w_978210 != null) {
						if (!xcsw.equals(__DEC_xcsw_w_978210)) {
							if (!xcse.equals(__DEC_xcsw_w_978210)) {
								if (!xn.equals(__DEC_xcsw_w_978210)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_5BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_w_311520 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "w")) {
						if (!xcsw.equals(__DEC_xcsw_w_311520)) {
							if (!xcse.equals(__DEC_xcsw_w_311520)) {
								if (!xn.equals(__DEC_xcsw_w_311520)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_6BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_se_541924 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "se")) {
						if (!xcsw.equals(__DEC_xcsw_se_541924)) {
							if (!xcse.equals(__DEC_xcsw_se_541924)) {
								if (!xn.equals(__DEC_xcsw_se_541924)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_7BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_e_438243 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "e")) {
						if (!xcsw.equals(__DEC_xcsw_e_438243)) {
							if (!xcse.equals(__DEC_xcsw_e_438243)) {
								if (!xn.equals(__DEC_xcsw_e_438243)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_8BB(XBTNode xcse,
			XBTNode xn) {
		if (xn.equals(xcse.getE())) {
			return new Object[] { xcse, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_9BB(XBTNode xcse,
			XBTNode xcsw) {
		if (xcsw.equals(xcse.getE())) {
			return new Object[] { xcse, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_10BB(XBTNode xcsw,
			XBTNode xn) {
		if (xn.equals(xcsw.getW())) {
			return new Object[] { xcsw, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_11BB(XBTNode xcse,
			XBTNode xcsw) {
		if (xcsw.equals(xcse.getSe())) {
			return new Object[] { xcse, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_12BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getSe())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_13BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getE())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXcse = _edge_w.getSrc();
		if (tmpXcse instanceof XBTNode) {
			XBTNode xcse = (XBTNode) tmpXcse;
			EObject tmpXcsw = _edge_w.getTrg();
			if (tmpXcsw instanceof XBTNode) {
				XBTNode xcsw = (XBTNode) tmpXcsw;
				if (!xcse.equals(xcsw)) {
					if (xcsw.equals(xcse.getW())) {
						if (xcse.equals(xcsw.getE())) {
							if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_9BB(xcse,
									xcsw) == null) {
								if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_11BB(xcse,
										xcsw) == null) {
									for (XBTNode xn : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(xcse, XBTNode.class, "se")) {
										if (!xcse.equals(xn)) {
											if (!xcsw.equals(xn)) {
												if (xcsw.equals(xn.getSw())) {
													if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_0BBB(
															xcse, xn, xcsw) == null) {
														if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_1BBB(
																xcse, xn, xcsw) == null) {
															if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_2BBB(
																	xcse, xn, xcsw) == null) {
																if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_3BBB(
																		xcse, xn, xcsw) == null) {
																	if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_4BBB(
																			xcsw, xcse, xn) == null) {
																		if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_5BBB(
																				xcsw, xcse, xn) == null) {
																			if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_6BBB(
																					xcsw, xcse, xn) == null) {
																				if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_7BBB(
																						xcsw, xcse, xn) == null) {
																					if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_8BB(
																							xcse, xn) == null) {
																						if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_10BB(
																								xcsw, xn) == null) {
																							if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_12BB(
																									xn, xcsw) == null) {
																								if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_13BB(
																										xn,
																										xcsw) == null) {
																									_result.add(
																											new Object[] {
																													xcse,
																													xn,
																													xcsw,
																													_edge_w });
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

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_rightleft2eastwest_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			rightleft2eastwest _this, Match match, XBTNode xcse, XBTNode xn, XBTNode xcsw) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, xcse, xn, xcsw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			rightleft2eastwest _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_rightleft2eastwest_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_21_1_preparereturnvalue_bindingFB(
			rightleft2eastwest _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			rightleft2eastwest _this) {
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

	public static final Object[] pattern_rightleft2eastwest_21_1_preparereturnvalue_bindingAndBlackFFBF(
			rightleft2eastwest _this) {
		Object[] result_pattern_rightleft2eastwest_21_1_preparereturnvalue_binding = pattern_rightleft2eastwest_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_rightleft2eastwest_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_rightleft2eastwest_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_rightleft2eastwest_21_1_preparereturnvalue_black = pattern_rightleft2eastwest_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_rightleft2eastwest_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_rightleft2eastwest_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_rightleft2eastwest_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_0BBB(BTNode cl,
			BTNode cr, BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					for (BTNode __DEC_cl_r_800284 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cl, BTNode.class, "r")) {
						if (!cl.equals(__DEC_cl_r_800284)) {
							if (!cr.equals(__DEC_cl_r_800284)) {
								if (!n.equals(__DEC_cl_r_800284)) {
									return new Object[] { cl, cr, n };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_1BBB(BTNode cr,
			BTNode cl, BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					for (BTNode __DEC_cr_l_428717 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cr, BTNode.class, "l")) {
						if (!cr.equals(__DEC_cr_l_428717)) {
							if (!cl.equals(__DEC_cr_l_428717)) {
								if (!n.equals(__DEC_cr_l_428717)) {
									return new Object[] { cr, cl, n };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_2BB(BTNode cl,
			BTNode cr) {
		if (cr.equals(cl.getL())) {
			return new Object[] { cl, cr };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_r) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpN = _edge_r.getSrc();
		if (tmpN instanceof BTNode) {
			BTNode n = (BTNode) tmpN;
			EObject tmpCr = _edge_r.getTrg();
			if (tmpCr instanceof BTNode) {
				BTNode cr = (BTNode) tmpCr;
				if (!cr.equals(n)) {
					if (cr.equals(n.getR())) {
						BTNode cl = n.getL();
						if (cl != null) {
							if (!cl.equals(cr)) {
								if (!cl.equals(n)) {
									if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_0BBB(cl, cr,
											n) == null) {
										if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_1BBB(cr, cl,
												n) == null) {
											if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_2BB(cl,
													cr) == null) {
												_result.add(new Object[] { cl, cr, n, _edge_r });
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

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_rightleft2eastwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			rightleft2eastwest _this, Match match, BTNode cl, BTNode cr, BTNode n) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cl, cr, n);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			rightleft2eastwest _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_rightleft2eastwest_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_24_1_prepare_blackB(rightleft2eastwest _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_rightleft2eastwest_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_rightleft2eastwest_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("cl");
		EObject _localVariable_1 = sourceMatch.getObject("cr");
		EObject _localVariable_2 = sourceMatch.getObject("n");
		EObject _localVariable_3 = targetMatch.getObject("xcse");
		EObject _localVariable_4 = targetMatch.getObject("xn");
		EObject _localVariable_5 = targetMatch.getObject("xcsw");
		EObject tmpCl = _localVariable_0;
		EObject tmpCr = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpXcse = _localVariable_3;
		EObject tmpXn = _localVariable_4;
		EObject tmpXcsw = _localVariable_5;
		if (tmpCl instanceof BTNode) {
			BTNode cl = (BTNode) tmpCl;
			if (tmpCr instanceof BTNode) {
				BTNode cr = (BTNode) tmpCr;
				if (tmpN instanceof BTNode) {
					BTNode n = (BTNode) tmpN;
					if (tmpXcse instanceof XBTNode) {
						XBTNode xcse = (XBTNode) tmpXcse;
						if (tmpXn instanceof XBTNode) {
							XBTNode xn = (XBTNode) tmpXn;
							if (tmpXcsw instanceof XBTNode) {
								XBTNode xcsw = (XBTNode) tmpXcsw;
								return new Object[] { cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_2_matchsrctrgcontext_blackBBBBBBBB(BTNode cl, BTNode cr,
			BTNode n, XBTNode xcse, XBTNode xn, XBTNode xcsw, Match sourceMatch, Match targetMatch) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					if (!xcse.equals(xn)) {
						if (!xcse.equals(xcsw)) {
							if (!xcsw.equals(xn)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding = pattern_rightleft2eastwest_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding != null) {
			BTNode cl = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[0];
			BTNode cr = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[1];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[2];
			XBTNode xcse = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[3];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[4];
			XBTNode xcsw = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_black = pattern_rightleft2eastwest_24_2_matchsrctrgcontext_blackBBBBBBBB(
					cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch);
			if (result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_bindingFBBBBBBBBB(rightleft2eastwest _this,
			BTNode cl, BTNode cr, BTNode n, XBTNode xcse, XBTNode xn, XBTNode xcsw, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			rightleft2eastwest _this, BTNode cl, BTNode cr, BTNode n, XBTNode xcse, XBTNode xn, XBTNode xcsw,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_rightleft2eastwest_24_3_solvecsp_binding = pattern_rightleft2eastwest_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch);
		if (result_pattern_rightleft2eastwest_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_24_3_solvecsp_binding[0];

			Object[] result_pattern_rightleft2eastwest_24_3_solvecsp_black = pattern_rightleft2eastwest_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cl, cr, n, xcse, xn, xcsw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_24_5_matchcorrcontext_blackBFBBB(BTNode n,
			XBTNode xn, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
					BTNode2XBTnode.class, "target")) {
				if (n.equals(n2xn.getSource())) {
					_result.add(new Object[] { n, n2xn, xn, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_24_5_matchcorrcontext_greenBBBF(BTNode2XBTnode n2xn,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "rightleft2eastwest";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(n2xn);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { n2xn, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_rightleft2eastwest_24_6_createcorrespondence_blackBBBBBBB(BTNode cl, BTNode cr,
			BTNode n, XBTNode xcse, XBTNode xn, XBTNode xcsw, CCMatch ccMatch) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					if (!xcse.equals(xn)) {
						if (!xcse.equals(xcsw)) {
							if (!xcsw.equals(xn)) {
								return new Object[] { cl, cr, n, xcse, xn, xcsw, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_6_createcorrespondence_greenBFBBBFB(BTNode cl, BTNode cr,
			XBTNode xcse, XBTNode xcsw, CCMatch ccMatch) {
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		cr2xcse.setSource(cr);
		cr2xcse.setTarget(xcse);
		ccMatch.getCreateCorr().add(cr2xcse);
		cl2xcsw.setTarget(xcsw);
		cl2xcsw.setSource(cl);
		ccMatch.getCreateCorr().add(cl2xcsw);
		return new Object[] { cl, cr2xcse, cr, xcse, xcsw, cl2xcsw, ccMatch };
	}

	public static final Object[] pattern_rightleft2eastwest_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_rightleft2eastwest_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "rightleft2eastwest";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_rightleft2eastwest_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_0BBB(BTNode cl, BTNode cr,
			BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					for (BTNode __DEC_cl_r_707515 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cl, BTNode.class, "r")) {
						if (!cl.equals(__DEC_cl_r_707515)) {
							if (!cr.equals(__DEC_cl_r_707515)) {
								if (!n.equals(__DEC_cl_r_707515)) {
									return new Object[] { cl, cr, n };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_1BBB(BTNode cr, BTNode cl,
			BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					for (BTNode __DEC_cr_l_599560 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cr, BTNode.class, "l")) {
						if (!cr.equals(__DEC_cr_l_599560)) {
							if (!cl.equals(__DEC_cr_l_599560)) {
								if (!n.equals(__DEC_cr_l_599560)) {
									return new Object[] { cr, cl, n };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_2BB(BTNode cl, BTNode cr) {
		if (cr.equals(cl.getL())) {
			return new Object[] { cl, cr };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_blackBBB(BTNode cl, BTNode cr,
			BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					if (cr.equals(n.getR())) {
						if (cl.equals(n.getL())) {
							if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_0BBB(cl, cr, n) == null) {
								if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_1BBB(cr, cl, n) == null) {
									if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_2BB(cl, cr) == null) {
										return new Object[] { cl, cr, n };
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

	public static final boolean pattern_rightleft2eastwest_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_0BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					XBTNode __DEC_xcse_e_735944 = xcse.getE();
					if (__DEC_xcse_e_735944 != null) {
						if (!xcse.equals(__DEC_xcse_e_735944)) {
							if (!xn.equals(__DEC_xcse_e_735944)) {
								if (!xcsw.equals(__DEC_xcse_e_735944)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_1BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_w_827814 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "w")) {
						if (!xcse.equals(__DEC_xcse_w_827814)) {
							if (!xn.equals(__DEC_xcse_w_827814)) {
								if (!xcsw.equals(__DEC_xcse_w_827814)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_2BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_sw_107785 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "sw")) {
						if (!xcse.equals(__DEC_xcse_sw_107785)) {
							if (!xn.equals(__DEC_xcse_sw_107785)) {
								if (!xcsw.equals(__DEC_xcse_sw_107785)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_3BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_e_625716 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "e")) {
						if (!xcse.equals(__DEC_xcse_e_625716)) {
							if (!xn.equals(__DEC_xcse_e_625716)) {
								if (!xcsw.equals(__DEC_xcse_e_625716)) {
									return new Object[] { xcse, xn, xcsw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_4BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					XBTNode __DEC_xcsw_w_365336 = xcsw.getW();
					if (__DEC_xcsw_w_365336 != null) {
						if (!xcsw.equals(__DEC_xcsw_w_365336)) {
							if (!xcse.equals(__DEC_xcsw_w_365336)) {
								if (!xn.equals(__DEC_xcsw_w_365336)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_5BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_w_383645 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "w")) {
						if (!xcsw.equals(__DEC_xcsw_w_383645)) {
							if (!xcse.equals(__DEC_xcsw_w_383645)) {
								if (!xn.equals(__DEC_xcsw_w_383645)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_6BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_se_664182 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "se")) {
						if (!xcsw.equals(__DEC_xcsw_se_664182)) {
							if (!xcse.equals(__DEC_xcsw_se_664182)) {
								if (!xn.equals(__DEC_xcsw_se_664182)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_7BBB(XBTNode xcsw,
			XBTNode xcse, XBTNode xn) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_e_497347 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "e")) {
						if (!xcsw.equals(__DEC_xcsw_e_497347)) {
							if (!xcse.equals(__DEC_xcsw_e_497347)) {
								if (!xn.equals(__DEC_xcsw_e_497347)) {
									return new Object[] { xcsw, xcse, xn };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_8BB(XBTNode xcse,
			XBTNode xn) {
		if (xn.equals(xcse.getE())) {
			return new Object[] { xcse, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_9BB(XBTNode xcse,
			XBTNode xcsw) {
		if (xcsw.equals(xcse.getE())) {
			return new Object[] { xcse, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_10BB(XBTNode xcsw,
			XBTNode xn) {
		if (xn.equals(xcsw.getW())) {
			return new Object[] { xcsw, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_11BB(XBTNode xcse,
			XBTNode xcsw) {
		if (xcsw.equals(xcse.getSe())) {
			return new Object[] { xcse, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_12BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getSe())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_13BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getE())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_blackBBB(XBTNode xcse, XBTNode xn,
			XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					if (xcsw.equals(xcse.getW())) {
						if (xcsw.equals(xn.getSw())) {
							if (xcse.equals(xcsw.getE())) {
								if (xcse.equals(xn.getSe())) {
									if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_0BBB(xcse, xn,
											xcsw) == null) {
										if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_1BBB(xcse, xn,
												xcsw) == null) {
											if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_2BBB(xcse, xn,
													xcsw) == null) {
												if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_3BBB(xcse,
														xn, xcsw) == null) {
													if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_4BBB(
															xcsw, xcse, xn) == null) {
														if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_5BBB(
																xcsw, xcse, xn) == null) {
															if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_6BBB(
																	xcsw, xcse, xn) == null) {
																if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_7BBB(
																		xcsw, xcse, xn) == null) {
																	if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_8BB(
																			xcse, xn) == null) {
																		if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_9BB(
																				xcse, xcsw) == null) {
																			if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_10BB(
																					xcsw, xn) == null) {
																				if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_11BB(
																						xcse, xcsw) == null) {
																					if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_12BB(
																							xn, xcsw) == null) {
																						if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_13BB(
																								xn, xcsw) == null) {
																							return new Object[] { xcse,
																									xn, xcsw };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_29_1_createresult_blackB(rightleft2eastwest _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_rightleft2eastwest_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, BTNode n) {
		if (ruleResult.getSourceObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, BTNode2XBTnode n2xn) {
		if (ruleResult.getCorrObjects().contains(n2xn)) {
			return new Object[] { ruleResult, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XBTNode xn) {
		if (ruleResult.getTargetObjects().contains(xn)) {
			return new Object[] { ruleResult, xn };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									n2xn) == null) {
								if (pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										n) == null) {
									if (pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_bindingFBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, BTNode n, BTNode2XBTnode n2xn, XBTNode xn,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n, n2xn, xn, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, n2xn, xn, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_bindingAndBlackFBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode n, BTNode2XBTnode n2xn, XBTNode xn,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_rightleft2eastwest_29_3_solveCSP_binding = pattern_rightleft2eastwest_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, n2xn, xn, ruleResult);
		if (result_pattern_rightleft2eastwest_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_29_3_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_29_3_solveCSP_black = pattern_rightleft2eastwest_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, n2xn, xn, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_29_4_checkCSP_expressionFBB(rightleft2eastwest _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_29_5_checknacs_blackBBB(BTNode n, BTNode2XBTnode n2xn,
			XBTNode xn) {
		return new Object[] { n, n2xn, xn };
	}

	public static final Object[] pattern_rightleft2eastwest_29_6_perform_blackBBBB(BTNode n, BTNode2XBTnode n2xn,
			XBTNode xn, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n, n2xn, xn, ruleResult };
	}

	public static final Object[] pattern_rightleft2eastwest_29_6_perform_greenFFFBFBFFB(BTNode n, XBTNode xn,
			ModelgeneratorRuleResult ruleResult) {
		BTNode cl = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode cr = BtreeFactory.eINSTANCE.createBTNode();
		XBTNode xcse = XbtreeFactory.eINSTANCE.createXBTNode();
		XBTNode xcsw = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		n.setL(cl);
		ruleResult.getSourceObjects().add(cl);
		ruleResult.getCorrObjects().add(cr2xcse);
		n.setR(cr);
		cr2xcse.setSource(cr);
		ruleResult.getSourceObjects().add(cr);
		cr2xcse.setTarget(xcse);
		xn.setSe(xcse);
		ruleResult.getTargetObjects().add(xcse);
		xcse.setW(xcsw);
		xn.setSw(xcsw);
		xcsw.setE(xcse);
		ruleResult.getTargetObjects().add(xcsw);
		cl2xcsw.setTarget(xcsw);
		cl2xcsw.setSource(cl);
		ruleResult.getCorrObjects().add(cl2xcsw);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cl, cr2xcse, cr, n, xcse, xn, xcsw, cl2xcsw, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_rightleft2eastwest_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //rightleft2eastwestImpl
