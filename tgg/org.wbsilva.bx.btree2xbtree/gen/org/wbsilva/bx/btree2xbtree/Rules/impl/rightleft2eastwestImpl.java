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
	public boolean isAppropriate_FWD(Match match, BTNode cr, BTNode cl, BTNode n) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_0_1_initialbindings_blackBBBBB(this,
				match, cr, cl, n);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cr] = " + cr + ", " + "[cl] = " + cl + ", " + "[n] = " + n + ".");
		}

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, cr, cl, n);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cr] = " + cr + ", " + "[cl] = " + cl + ", " + "[n] = " + n + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_0_4_collectelementstobetranslated_blackBBBB(match, cr, cl, n);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cr] = " + cr + ", " + "[cl] = " + cl + ", " + "[n] = " + n + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_4_collectelementstobetranslated_greenBBBBFF(match, cr,
					cl, n);
			//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result4_green[5];

			Object[] result5_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_0_5_collectcontextelements_blackBBBB(match, cr, cl, n);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cr] = " + cr + ", " + "[cl] = " + cl + ", " + "[n] = " + n + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_5_collectcontextelements_greenBB(match, n);

			// 
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					cr, cl, n);
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
		BTNode cr = (BTNode) result1_bindingAndBlack[0];
		BTNode cl = (BTNode) result1_bindingAndBlack[1];
		BTNode n = (BTNode) result1_bindingAndBlack[2];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[3];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_1_performtransformation_greenBFBFFBF(cr, cl, xn);
		XBTNode xcse = (XBTNode) result1_green[1];
		XBTNode xcsw = (XBTNode) result1_green[3];
		BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result1_green[4];
		BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result1_green[6];

		Object[] result2_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_2_collecttranslatedelements_blackBBBBBB(cr, xcse, cl, xcsw, cl2xcsw,
						cr2xcse);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cr] = " + cr + ", " + "[xcse] = "
					+ xcse + ", " + "[cl] = " + cl + ", " + "[xcsw] = " + xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ", "
					+ "[cr2xcse] = " + cr2xcse + ".");
		}
		Object[] result2_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_2_collecttranslatedelements_greenFBBBBBB(cr, xcse, cl, xcsw, cl2xcsw,
						cr2xcse);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, cr, xcse, cl, xcsw,
						cl2xcsw, n, xn, n2xn, cr2xcse);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cr] = " + cr + ", " + "[xcse] = " + xcse + ", " + "[cl] = " + cl + ", " + "[xcsw] = "
					+ xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", "
					+ "[n2xn] = " + n2xn + ", " + "[cr2xcse] = " + cr2xcse + ".");
		}
		rightleft2eastwestImpl.pattern_rightleft2eastwest_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult,
				cr, xcse, cl, xcsw, cl2xcsw, n, xn, cr2xcse);
		//nothing EMoflonEdge cl2xcsw__cl____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cl2xcsw__xcsw____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cr2xcse__xcse____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge cr2xcse__cr____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[18];

		// 
		// 
		rightleft2eastwestImpl.pattern_rightleft2eastwest_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				cr, xcse, cl, xcsw, cl2xcsw, n, xn, n2xn, cr2xcse);
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
		BTNode cr = (BTNode) result2_binding[0];
		BTNode cl = (BTNode) result2_binding[1];
		BTNode n = (BTNode) result2_binding[2];
		for (Object[] result2_black : rightleft2eastwestImpl.pattern_rightleft2eastwest_2_2_corematch_blackBBBFFB(cr,
				cl, n, match)) {
			XBTNode xn = (XBTNode) result2_black[3];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[4];
			// ForEach 
			for (Object[] result3_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_2_3_findcontext_blackBBBBB(cr, cl, n, xn, n2xn)) {
				Object[] result3_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_2_3_findcontext_greenBBBBBFFFFF(cr, cl, n, xn, n2xn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, cr,
								cl, n, xn, n2xn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cr] = " + cr + ", " + "[cl] = "
							+ cl + ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[n2xn] = " + n2xn + ".");
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
	public void registerObjectsToMatch_FWD(Match match, BTNode cr, BTNode cl, BTNode n) {
		match.registerObject("cr", cr);
		match.registerObject("cl", cl);
		match.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BTNode cr, BTNode cl, BTNode n) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, BTNode cr, BTNode cl, BTNode n,
			XBTNode xn, BTNode2XBTnode n2xn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cr", cr);
		isApplicableMatch.registerObject("cl", cl);
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
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw,
			EObject cl2xcsw, EObject n, EObject xn, EObject n2xn, EObject cr2xcse) {
		ruleresult.registerObject("cr", cr);
		ruleresult.registerObject("xcse", xcse);
		ruleresult.registerObject("cl", cl);
		ruleresult.registerObject("xcsw", xcsw);
		ruleresult.registerObject("cl2xcsw", cl2xcsw);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("cr2xcse", cr2xcse);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cr").eClass()).equals("btree.BTNode.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cl").eClass()).equals("btree.BTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_10_1_initialbindings_blackBBBBB(this,
				match, xcse, xcsw, xn);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xcse] = " + xcse + ", " + "[xcsw] = " + xcsw + ", " + "[xn] = " + xn + ".");
		}

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, xcse, xcsw, xn);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xcse] = " + xcse + ", " + "[xcsw] = " + xcsw + ", " + "[xn] = " + xn + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_10_4_collectelementstobetranslated_blackBBBB(match, xcse, xcsw, xn);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xcse] = " + xcse + ", " + "[xcsw] = " + xcsw + ", " + "[xn] = " + xn + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
					xcse, xcsw, xn);
			//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result4_green[7];

			Object[] result5_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_10_5_collectcontextelements_blackBBBB(match, xcse, xcsw, xn);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xcse] = " + xcse + ", " + "[xcsw] = " + xcsw + ", " + "[xn] = " + xn + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_5_collectcontextelements_greenBB(match, xn);

			// 
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					xcse, xcsw, xn);
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
		XBTNode xcse = (XBTNode) result1_bindingAndBlack[0];
		XBTNode xcsw = (XBTNode) result1_bindingAndBlack[1];
		BTNode n = (BTNode) result1_bindingAndBlack[2];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[3];
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_1_performtransformation_greenFBFBFBF(xcse, xcsw, n);
		BTNode cr = (BTNode) result1_green[0];
		BTNode cl = (BTNode) result1_green[2];
		BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result1_green[4];
		BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result1_green[6];

		Object[] result2_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_2_collecttranslatedelements_blackBBBBBB(cr, xcse, cl, xcsw, cl2xcsw,
						cr2xcse);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cr] = " + cr + ", " + "[xcse] = "
					+ xcse + ", " + "[cl] = " + cl + ", " + "[xcsw] = " + xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ", "
					+ "[cr2xcse] = " + cr2xcse + ".");
		}
		Object[] result2_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_2_collecttranslatedelements_greenFBBBBBB(cr, xcse, cl, xcsw, cl2xcsw,
						cr2xcse);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, cr, xcse, cl, xcsw,
						cl2xcsw, n, xn, n2xn, cr2xcse);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cr] = " + cr + ", " + "[xcse] = " + xcse + ", " + "[cl] = " + cl + ", " + "[xcsw] = "
					+ xcsw + ", " + "[cl2xcsw] = " + cl2xcsw + ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", "
					+ "[n2xn] = " + n2xn + ", " + "[cr2xcse] = " + cr2xcse + ".");
		}
		rightleft2eastwestImpl.pattern_rightleft2eastwest_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult,
				cr, xcse, cl, xcsw, cl2xcsw, n, xn, cr2xcse);
		//nothing EMoflonEdge cl2xcsw__cl____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cl2xcsw__xcsw____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cr2xcse__xcse____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge cr2xcse__cr____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[18];

		// 
		// 
		rightleft2eastwestImpl.pattern_rightleft2eastwest_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				cr, xcse, cl, xcsw, cl2xcsw, n, xn, n2xn, cr2xcse);
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
		XBTNode xcsw = (XBTNode) result2_binding[1];
		XBTNode xn = (XBTNode) result2_binding[2];
		for (Object[] result2_black : rightleft2eastwestImpl.pattern_rightleft2eastwest_12_2_corematch_blackBBFBFB(xcse,
				xcsw, xn, match)) {
			BTNode n = (BTNode) result2_black[2];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[4];
			// ForEach 
			for (Object[] result3_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_12_3_findcontext_blackBBBBB(xcse, xcsw, n, xn, n2xn)) {
				Object[] result3_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_12_3_findcontext_greenBBBBBFFFFFFF(xcse, xcsw, n, xn, n2xn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, xcse,
								xcsw, n, xn, n2xn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[xcse] = " + xcse + ", "
							+ "[xcsw] = " + xcsw + ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[n2xn] = "
							+ n2xn + ".");
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
	public void registerObjectsToMatch_BWD(Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		match.registerObject("xcse", xcse);
		match.registerObject("xcsw", xcsw);
		match.registerObject("xn", xn);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XBTNode xcse, XBTNode xcsw, BTNode n,
			XBTNode xn, BTNode2XBTnode n2xn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("xcse", xcse);
		isApplicableMatch.registerObject("xcsw", xcsw);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw,
			EObject cl2xcsw, EObject n, EObject xn, EObject n2xn, EObject cr2xcse) {
		ruleresult.registerObject("cr", cr);
		ruleresult.registerObject("xcse", xcse);
		ruleresult.registerObject("cl", cl);
		ruleresult.registerObject("xcsw", xcsw);
		ruleresult.registerObject("cl2xcsw", cl2xcsw);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("cr2xcse", cr2xcse);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_143(EMoflonEdge _edge_e) {

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
				.pattern_rightleft2eastwest_20_2_testcorematchandDECs_blackFFFB(_edge_e)) {
			XBTNode xcse = (XBTNode) result2_black[0];
			XBTNode xcsw = (XBTNode) result2_black[1];
			XBTNode xn = (XBTNode) result2_black[2];
			Object[] result2_green = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (rightleft2eastwestImpl
					.pattern_rightleft2eastwest_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, xcse, xcsw, xn)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_143(EMoflonEdge _edge_r) {

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
			BTNode cr = (BTNode) result2_black[0];
			BTNode cl = (BTNode) result2_black[1];
			BTNode n = (BTNode) result2_black[2];
			Object[] result2_green = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (rightleft2eastwestImpl
					.pattern_rightleft2eastwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, cr, cl, n)) {
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
		BTNode cr = (BTNode) result2_bindingAndBlack[0];
		XBTNode xcse = (XBTNode) result2_bindingAndBlack[1];
		BTNode cl = (BTNode) result2_bindingAndBlack[2];
		XBTNode xcsw = (XBTNode) result2_bindingAndBlack[3];
		BTNode n = (BTNode) result2_bindingAndBlack[4];
		XBTNode xn = (XBTNode) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, cr, xcse, cl, xcsw, n, xn,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cr] = " + cr + ", " + "[xcse] = " + xcse + ", " + "[cl] = " + cl + ", " + "[xcsw] = " + xcsw
					+ ", " + "[n] = " + n + ", " + "[xn] = " + xn + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_24_5_matchcorrcontext_blackBBFBB(n, xn, sourceMatch, targetMatch)) {
				BTNode2XBTnode n2xn = (BTNode2XBTnode) result5_black[2];
				Object[] result5_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_5_matchcorrcontext_greenBBBF(n2xn, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_6_createcorrespondence_blackBBBBBBB(cr, xcse, cl, xcsw, n, xn,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cr] = " + cr + ", "
							+ "[xcse] = " + xcse + ", " + "[cl] = " + cl + ", " + "[xcsw] = " + xcsw + ", " + "[n] = "
							+ n + ", " + "[xn] = " + xn + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				rightleft2eastwestImpl.pattern_rightleft2eastwest_24_6_createcorrespondence_greenBBBBFFB(cr, xcse, cl,
						xcsw, ccMatch);
				//nothing BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result6_green[4];
				//nothing BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result6_green[5];

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
	public CSP isApplicable_solveCsp_CC(BTNode cr, XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode n, XBTNode xn,
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
	public boolean checkDEC_FWD(BTNode cr, BTNode cl, BTNode n) {// 
		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_27_1_matchtggpattern_blackBBB(cr, cl,
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
	public boolean checkDEC_BWD(XBTNode xcse, XBTNode xcsw, XBTNode xn) {// 
		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_28_1_matchtggpattern_blackBBB(xcse,
				xcsw, xn);
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
					.pattern_rightleft2eastwest_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, xn,
							n2xn, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[xn] = " + xn
						+ ", " + "[n2xn] = " + n2xn + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (rightleft2eastwestImpl.pattern_rightleft2eastwest_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_5_checknacs_blackBBB(n,
						xn, n2xn);
				if (result5_black != null) {

					Object[] result6_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_6_perform_blackBBBB(n,
							xn, n2xn, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[n] = " + n + ", " + "[xn] = " + xn
										+ ", " + "[n2xn] = " + n2xn + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_29_6_perform_greenFFFFFBBFB(n, xn, ruleResult);
					//nothing BTNode cr = (BTNode) result6_green[0];
					//nothing XBTNode xcse = (XBTNode) result6_green[1];
					//nothing BTNode cl = (BTNode) result6_green[2];
					//nothing XBTNode xcsw = (XBTNode) result6_green[3];
					//nothing BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result6_green[4];
					//nothing BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result6_green[7];

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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE_BTNODE_BTNODE_XBTNODE_BTNODE2XBTNODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(BTNode) arguments.get(2), (BTNode) arguments.get(3), (XBTNode) arguments.get(4),
					(BTNode2XBTnode) arguments.get(5));
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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XBTNODE_XBTNODE_BTNODE_XBTNODE_BTNODE2XBTNODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode) arguments.get(3), (XBTNode) arguments.get(4),
					(BTNode2XBTnode) arguments.get(5));
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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_XBTNODE_BTNODE_XBTNODE_BTNODE_XBTNODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((BTNode) arguments.get(0), (XBTNode) arguments.get(1),
					(BTNode) arguments.get(2), (XBTNode) arguments.get(3), (BTNode) arguments.get(4),
					(XBTNode) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_DEC_FWD__BTNODE_BTNODE_BTNODE:
			return checkDEC_FWD((BTNode) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE_XBTNODE:
			return checkDEC_BWD((XBTNode) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE:
			return generateModel((RuleEntryContainer) arguments.get(0), (BTNode2XBTnode) arguments.get(1));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE_XBTNODE_BTNODE2XBTNODE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode2XBTnode) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_rightleft2eastwest_0_1_initialbindings_blackBBBBB(rightleft2eastwest _this,
			Match match, BTNode cr, BTNode cl, BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					return new Object[] { _this, match, cr, cl, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_bindingFBBBBB(rightleft2eastwest _this,
			Match match, BTNode cr, BTNode cl, BTNode n) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cr, cl, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cr, cl, n };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_bindingAndBlackFBBBBB(rightleft2eastwest _this,
			Match match, BTNode cr, BTNode cl, BTNode n) {
		Object[] result_pattern_rightleft2eastwest_0_2_SolveCSP_binding = pattern_rightleft2eastwest_0_2_SolveCSP_bindingFBBBBB(
				_this, match, cr, cl, n);
		if (result_pattern_rightleft2eastwest_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_0_2_SolveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_0_2_SolveCSP_black = pattern_rightleft2eastwest_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cr, cl, n };
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
			BTNode cr, BTNode cl, BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					return new Object[] { match, cr, cl, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			BTNode cr, BTNode cl, BTNode n) {
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(cr);
		match.getToBeTranslatedNodes().add(cl);
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
		return new Object[] { match, cr, cl, n, n__cr____r, n__cl____l };
	}

	public static final Object[] pattern_rightleft2eastwest_0_5_collectcontextelements_blackBBBB(Match match, BTNode cr,
			BTNode cl, BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					return new Object[] { match, cr, cl, n };
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
			rightleft2eastwest _this, Match match, BTNode cr, BTNode cl, BTNode n) {
		_this.registerObjectsToMatch_FWD(match, cr, cl, n);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("cr");
		EObject _localVariable_1 = isApplicableMatch.getObject("cl");
		EObject _localVariable_2 = isApplicableMatch.getObject("n");
		EObject _localVariable_3 = isApplicableMatch.getObject("xn");
		EObject _localVariable_4 = isApplicableMatch.getObject("n2xn");
		EObject tmpCr = _localVariable_0;
		EObject tmpCl = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpXn = _localVariable_3;
		EObject tmpN2xn = _localVariable_4;
		if (tmpCr instanceof BTNode) {
			BTNode cr = (BTNode) tmpCr;
			if (tmpCl instanceof BTNode) {
				BTNode cl = (BTNode) tmpCl;
				if (tmpN instanceof BTNode) {
					BTNode n = (BTNode) tmpN;
					if (tmpXn instanceof XBTNode) {
						XBTNode xn = (XBTNode) tmpXn;
						if (tmpN2xn instanceof BTNode2XBTnode) {
							BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
							return new Object[] { cr, cl, n, xn, n2xn, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_blackBBBBBFBB(BTNode cr,
			BTNode cl, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { cr, cl, n, xn, n2xn, csp, _this, isApplicableMatch };
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
			BTNode cr = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[0];
			BTNode cl = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[1];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[2];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[3];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[4];

			Object[] result_pattern_rightleft2eastwest_1_1_performtransformation_black = pattern_rightleft2eastwest_1_1_performtransformation_blackBBBBBFBB(
					cr, cl, n, xn, n2xn, _this, isApplicableMatch);
			if (result_pattern_rightleft2eastwest_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_rightleft2eastwest_1_1_performtransformation_black[5];

				return new Object[] { cr, cl, n, xn, n2xn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_greenBFBFFBF(BTNode cr, BTNode cl,
			XBTNode xn) {
		XBTNode xcse = XbtreeFactory.eINSTANCE.createXBTNode();
		XBTNode xcsw = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		xn.setSe(xcse);
		xcsw.setE(xcse);
		xn.setSw(xcsw);
		xcse.setW(xcsw);
		cl2xcsw.setSource(cl);
		cl2xcsw.setTarget(xcsw);
		cr2xcse.setTarget(xcse);
		cr2xcse.setSource(cr);
		return new Object[] { cr, xcse, cl, xcsw, cl2xcsw, xn, cr2xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_1_2_collecttranslatedelements_blackBBBBBB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode2XBTnode cl2xcsw, BTNode2XBTnode cr2xcse) {
		if (!xcse.equals(xcsw)) {
			if (!cl.equals(cr)) {
				if (!cl2xcsw.equals(cr2xcse)) {
					return new Object[] { cr, xcse, cl, xcsw, cl2xcsw, cr2xcse };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_2_collecttranslatedelements_greenFBBBBBB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode2XBTnode cl2xcsw, BTNode2XBTnode cr2xcse) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(cr);
		ruleresult.getCreatedElements().add(xcse);
		ruleresult.getTranslatedElements().add(cl);
		ruleresult.getCreatedElements().add(xcsw);
		ruleresult.getCreatedLinkElements().add(cl2xcsw);
		ruleresult.getCreatedLinkElements().add(cr2xcse);
		return new Object[] { ruleresult, cr, xcse, cl, xcsw, cl2xcsw, cr2xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw, EObject cl2xcsw,
			EObject n, EObject xn, EObject n2xn, EObject cr2xcse) {
		if (!cr.equals(xcse)) {
			if (!cr.equals(xcsw)) {
				if (!cr.equals(n)) {
					if (!cr.equals(xn)) {
						if (!cr.equals(n2xn)) {
							if (!cr.equals(cr2xcse)) {
								if (!xcse.equals(xcsw)) {
									if (!xcse.equals(xn)) {
										if (!cl.equals(cr)) {
											if (!cl.equals(xcse)) {
												if (!cl.equals(xcsw)) {
													if (!cl.equals(cl2xcsw)) {
														if (!cl.equals(n)) {
															if (!cl.equals(xn)) {
																if (!cl.equals(n2xn)) {
																	if (!cl.equals(cr2xcse)) {
																		if (!xcsw.equals(xn)) {
																			if (!cl2xcsw.equals(cr)) {
																				if (!cl2xcsw.equals(xcse)) {
																					if (!cl2xcsw.equals(xcsw)) {
																						if (!cl2xcsw.equals(n)) {
																							if (!cl2xcsw.equals(xn)) {
																								if (!cl2xcsw
																										.equals(n2xn)) {
																									if (!cl2xcsw.equals(
																											cr2xcse)) {
																										if (!n.equals(
																												xcse)) {
																											if (!n.equals(
																													xcsw)) {
																												if (!n.equals(
																														xn)) {
																													if (!n.equals(
																															n2xn)) {
																														if (!n2xn
																																.equals(xcse)) {
																															if (!n2xn
																																	.equals(xcsw)) {
																																if (!n2xn
																																		.equals(xn)) {
																																	if (!cr2xcse
																																			.equals(xcse)) {
																																		if (!cr2xcse
																																				.equals(xcsw)) {
																																			if (!cr2xcse
																																					.equals(n)) {
																																				if (!cr2xcse
																																						.equals(xn)) {
																																					if (!cr2xcse
																																							.equals(n2xn)) {
																																						return new Object[] {
																																								ruleresult,
																																								cr,
																																								xcse,
																																								cl,
																																								xcsw,
																																								cl2xcsw,
																																								n,
																																								xn,
																																								n2xn,
																																								cr2xcse };
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
			PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw, EObject cl2xcsw,
			EObject n, EObject xn, EObject cr2xcse) {
		EMoflonEdge cl2xcsw__cl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__xcsw____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__xcse____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__cr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "rightleft2eastwest";
		String cl2xcsw__cl____source_name_prime = "source";
		String xcsw__xcse____e_name_prime = "e";
		String xn__xcse____se_name_prime = "se";
		String cl2xcsw__xcsw____target_name_prime = "target";
		String xn__xcsw____sw_name_prime = "sw";
		String cr2xcse__xcse____target_name_prime = "target";
		String cr2xcse__cr____source_name_prime = "source";
		String xcse__xcsw____w_name_prime = "w";
		String n__cr____r_name_prime = "r";
		String n__cl____l_name_prime = "l";
		cl2xcsw__cl____source.setSrc(cl2xcsw);
		cl2xcsw__cl____source.setTrg(cl);
		ruleresult.getCreatedEdges().add(cl2xcsw__cl____source);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		ruleresult.getCreatedEdges().add(xcsw__xcse____e);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		ruleresult.getCreatedEdges().add(xn__xcse____se);
		cl2xcsw__xcsw____target.setSrc(cl2xcsw);
		cl2xcsw__xcsw____target.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(cl2xcsw__xcsw____target);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(xn__xcsw____sw);
		cr2xcse__xcse____target.setSrc(cr2xcse);
		cr2xcse__xcse____target.setTrg(xcse);
		ruleresult.getCreatedEdges().add(cr2xcse__xcse____target);
		cr2xcse__cr____source.setSrc(cr2xcse);
		cr2xcse__cr____source.setTrg(cr);
		ruleresult.getCreatedEdges().add(cr2xcse__cr____source);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(xcse__xcsw____w);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		ruleresult.getTranslatedEdges().add(n__cr____r);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		ruleresult.getTranslatedEdges().add(n__cl____l);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cl2xcsw__cl____source.setName(cl2xcsw__cl____source_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		cl2xcsw__xcsw____target.setName(cl2xcsw__xcsw____target_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		cr2xcse__xcse____target.setName(cr2xcse__xcse____target_name_prime);
		cr2xcse__cr____source.setName(cr2xcse__cr____source_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		return new Object[] { ruleresult, cr, xcse, cl, xcsw, cl2xcsw, n, xn, cr2xcse, cl2xcsw__cl____source,
				xcsw__xcse____e, xn__xcse____se, cl2xcsw__xcsw____target, xn__xcsw____sw, cr2xcse__xcse____target,
				cr2xcse__cr____source, xcse__xcsw____w, n__cr____r, n__cl____l };
	}

	public static final void pattern_rightleft2eastwest_1_5_registerobjects_expressionBBBBBBBBBBB(
			rightleft2eastwest _this, PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw,
			EObject cl2xcsw, EObject n, EObject xn, EObject n2xn, EObject cr2xcse) {
		_this.registerObjects_FWD(ruleresult, cr, xcse, cl, xcsw, cl2xcsw, n, xn, n2xn, cr2xcse);

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
		EObject _localVariable_0 = match.getObject("cr");
		EObject _localVariable_1 = match.getObject("cl");
		EObject _localVariable_2 = match.getObject("n");
		EObject tmpCr = _localVariable_0;
		EObject tmpCl = _localVariable_1;
		EObject tmpN = _localVariable_2;
		if (tmpCr instanceof BTNode) {
			BTNode cr = (BTNode) tmpCr;
			if (tmpCl instanceof BTNode) {
				BTNode cl = (BTNode) tmpCl;
				if (tmpN instanceof BTNode) {
					BTNode n = (BTNode) tmpN;
					return new Object[] { cr, cl, n, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_2_2_corematch_blackBBBFFB(BTNode cr, BTNode cl,
			BTNode n, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
							BTNode2XBTnode.class, "source")) {
						XBTNode xn = n2xn.getTarget();
						if (xn != null) {
							_result.add(new Object[] { cr, cl, n, xn, n2xn, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_2_3_findcontext_blackBBBBB(BTNode cr, BTNode cl,
			BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					if (xn.equals(n2xn.getTarget())) {
						if (n.equals(n2xn.getSource())) {
							if (cr.equals(n.getR())) {
								if (cl.equals(n.getL())) {
									_result.add(new Object[] { cr, cl, n, xn, n2xn });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_2_3_findcontext_greenBBBBBFFFFF(BTNode cr, BTNode cl,
			BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n2xn__xn____target_name_prime = "target";
		String n2xn__n____source_name_prime = "source";
		String n__cr____r_name_prime = "r";
		String n__cl____l_name_prime = "l";
		isApplicableMatch.getAllContextElements().add(cr);
		isApplicableMatch.getAllContextElements().add(cl);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n2xn);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		isApplicableMatch.getAllContextElements().add(n__cr____r);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		isApplicableMatch.getAllContextElements().add(n__cl____l);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		return new Object[] { cr, cl, n, xn, n2xn, isApplicableMatch, n2xn__xn____target, n2xn__n____source, n__cr____r,
				n__cl____l };
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_bindingFBBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, BTNode cr, BTNode cl, BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, cr, cl, n, xn, n2xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cr, cl, n, xn, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode cr, BTNode cl, BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn) {
		Object[] result_pattern_rightleft2eastwest_2_4_solveCSP_binding = pattern_rightleft2eastwest_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, cr, cl, n, xn, n2xn);
		if (result_pattern_rightleft2eastwest_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_2_4_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_2_4_solveCSP_black = pattern_rightleft2eastwest_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cr, cl, n, xn, n2xn };
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
			Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					return new Object[] { _this, match, xcse, xcsw, xn };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_bindingFBBBBB(rightleft2eastwest _this,
			Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, xcse, xcsw, xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xcse, xcsw, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_bindingAndBlackFBBBBB(
			rightleft2eastwest _this, Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		Object[] result_pattern_rightleft2eastwest_10_2_SolveCSP_binding = pattern_rightleft2eastwest_10_2_SolveCSP_bindingFBBBBB(
				_this, match, xcse, xcsw, xn);
		if (result_pattern_rightleft2eastwest_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_10_2_SolveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_10_2_SolveCSP_black = pattern_rightleft2eastwest_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xcse, xcsw, xn };
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
			XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					return new Object[] { match, xcse, xcsw, xn };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xcse);
		match.getToBeTranslatedNodes().add(xcsw);
		String xcsw__xcse____e_name_prime = "e";
		String xn__xcse____se_name_prime = "se";
		String xn__xcsw____sw_name_prime = "sw";
		String xcse__xcsw____w_name_prime = "w";
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		match.getToBeTranslatedEdges().add(xcsw__xcse____e);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		match.getToBeTranslatedEdges().add(xn__xcse____se);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		match.getToBeTranslatedEdges().add(xn__xcsw____sw);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		match.getToBeTranslatedEdges().add(xcse__xcsw____w);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		return new Object[] { match, xcse, xcsw, xn, xcsw__xcse____e, xn__xcse____se, xn__xcsw____sw, xcse__xcsw____w };
	}

	public static final Object[] pattern_rightleft2eastwest_10_5_collectcontextelements_blackBBBB(Match match,
			XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					return new Object[] { match, xcse, xcsw, xn };
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
			rightleft2eastwest _this, Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		_this.registerObjectsToMatch_BWD(match, xcse, xcsw, xn);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("xcse");
		EObject _localVariable_1 = isApplicableMatch.getObject("xcsw");
		EObject _localVariable_2 = isApplicableMatch.getObject("n");
		EObject _localVariable_3 = isApplicableMatch.getObject("xn");
		EObject _localVariable_4 = isApplicableMatch.getObject("n2xn");
		EObject tmpXcse = _localVariable_0;
		EObject tmpXcsw = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpXn = _localVariable_3;
		EObject tmpN2xn = _localVariable_4;
		if (tmpXcse instanceof XBTNode) {
			XBTNode xcse = (XBTNode) tmpXcse;
			if (tmpXcsw instanceof XBTNode) {
				XBTNode xcsw = (XBTNode) tmpXcsw;
				if (tmpN instanceof BTNode) {
					BTNode n = (BTNode) tmpN;
					if (tmpXn instanceof XBTNode) {
						XBTNode xn = (XBTNode) tmpXn;
						if (tmpN2xn instanceof BTNode2XBTnode) {
							BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
							return new Object[] { xcse, xcsw, n, xn, n2xn, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_blackBBBBBFBB(XBTNode xcse,
			XBTNode xcsw, BTNode n, XBTNode xn, BTNode2XBTnode n2xn, rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { xcse, xcsw, n, xn, n2xn, csp, _this, isApplicableMatch };
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
			XBTNode xcse = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[0];
			XBTNode xcsw = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[1];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[2];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[3];
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[4];

			Object[] result_pattern_rightleft2eastwest_11_1_performtransformation_black = pattern_rightleft2eastwest_11_1_performtransformation_blackBBBBBFBB(
					xcse, xcsw, n, xn, n2xn, _this, isApplicableMatch);
			if (result_pattern_rightleft2eastwest_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_rightleft2eastwest_11_1_performtransformation_black[5];

				return new Object[] { xcse, xcsw, n, xn, n2xn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_greenFBFBFBF(XBTNode xcse,
			XBTNode xcsw, BTNode n) {
		BTNode cr = BtreeFactory.eINSTANCE.createBTNode();
		BTNode cl = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		n.setR(cr);
		n.setL(cl);
		cl2xcsw.setSource(cl);
		cl2xcsw.setTarget(xcsw);
		cr2xcse.setTarget(xcse);
		cr2xcse.setSource(cr);
		return new Object[] { cr, xcse, cl, xcsw, cl2xcsw, n, cr2xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_11_2_collecttranslatedelements_blackBBBBBB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode2XBTnode cl2xcsw, BTNode2XBTnode cr2xcse) {
		if (!xcse.equals(xcsw)) {
			if (!cl.equals(cr)) {
				if (!cl2xcsw.equals(cr2xcse)) {
					return new Object[] { cr, xcse, cl, xcsw, cl2xcsw, cr2xcse };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_2_collecttranslatedelements_greenFBBBBBB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode2XBTnode cl2xcsw, BTNode2XBTnode cr2xcse) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(cr);
		ruleresult.getTranslatedElements().add(xcse);
		ruleresult.getCreatedElements().add(cl);
		ruleresult.getTranslatedElements().add(xcsw);
		ruleresult.getCreatedLinkElements().add(cl2xcsw);
		ruleresult.getCreatedLinkElements().add(cr2xcse);
		return new Object[] { ruleresult, cr, xcse, cl, xcsw, cl2xcsw, cr2xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw, EObject cl2xcsw,
			EObject n, EObject xn, EObject n2xn, EObject cr2xcse) {
		if (!cr.equals(xcse)) {
			if (!cr.equals(xcsw)) {
				if (!cr.equals(n)) {
					if (!cr.equals(xn)) {
						if (!cr.equals(n2xn)) {
							if (!cr.equals(cr2xcse)) {
								if (!xcse.equals(xcsw)) {
									if (!xcse.equals(xn)) {
										if (!cl.equals(cr)) {
											if (!cl.equals(xcse)) {
												if (!cl.equals(xcsw)) {
													if (!cl.equals(cl2xcsw)) {
														if (!cl.equals(n)) {
															if (!cl.equals(xn)) {
																if (!cl.equals(n2xn)) {
																	if (!cl.equals(cr2xcse)) {
																		if (!xcsw.equals(xn)) {
																			if (!cl2xcsw.equals(cr)) {
																				if (!cl2xcsw.equals(xcse)) {
																					if (!cl2xcsw.equals(xcsw)) {
																						if (!cl2xcsw.equals(n)) {
																							if (!cl2xcsw.equals(xn)) {
																								if (!cl2xcsw
																										.equals(n2xn)) {
																									if (!cl2xcsw.equals(
																											cr2xcse)) {
																										if (!n.equals(
																												xcse)) {
																											if (!n.equals(
																													xcsw)) {
																												if (!n.equals(
																														xn)) {
																													if (!n.equals(
																															n2xn)) {
																														if (!n2xn
																																.equals(xcse)) {
																															if (!n2xn
																																	.equals(xcsw)) {
																																if (!n2xn
																																		.equals(xn)) {
																																	if (!cr2xcse
																																			.equals(xcse)) {
																																		if (!cr2xcse
																																				.equals(xcsw)) {
																																			if (!cr2xcse
																																					.equals(n)) {
																																				if (!cr2xcse
																																						.equals(xn)) {
																																					if (!cr2xcse
																																							.equals(n2xn)) {
																																						return new Object[] {
																																								ruleresult,
																																								cr,
																																								xcse,
																																								cl,
																																								xcsw,
																																								cl2xcsw,
																																								n,
																																								xn,
																																								n2xn,
																																								cr2xcse };
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
			PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw, EObject cl2xcsw,
			EObject n, EObject xn, EObject cr2xcse) {
		EMoflonEdge cl2xcsw__cl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__xcsw____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__xcse____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__cr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "rightleft2eastwest";
		String cl2xcsw__cl____source_name_prime = "source";
		String xcsw__xcse____e_name_prime = "e";
		String xn__xcse____se_name_prime = "se";
		String cl2xcsw__xcsw____target_name_prime = "target";
		String xn__xcsw____sw_name_prime = "sw";
		String cr2xcse__xcse____target_name_prime = "target";
		String cr2xcse__cr____source_name_prime = "source";
		String xcse__xcsw____w_name_prime = "w";
		String n__cr____r_name_prime = "r";
		String n__cl____l_name_prime = "l";
		cl2xcsw__cl____source.setSrc(cl2xcsw);
		cl2xcsw__cl____source.setTrg(cl);
		ruleresult.getCreatedEdges().add(cl2xcsw__cl____source);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		ruleresult.getTranslatedEdges().add(xcsw__xcse____e);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		ruleresult.getTranslatedEdges().add(xn__xcse____se);
		cl2xcsw__xcsw____target.setSrc(cl2xcsw);
		cl2xcsw__xcsw____target.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(cl2xcsw__xcsw____target);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		ruleresult.getTranslatedEdges().add(xn__xcsw____sw);
		cr2xcse__xcse____target.setSrc(cr2xcse);
		cr2xcse__xcse____target.setTrg(xcse);
		ruleresult.getCreatedEdges().add(cr2xcse__xcse____target);
		cr2xcse__cr____source.setSrc(cr2xcse);
		cr2xcse__cr____source.setTrg(cr);
		ruleresult.getCreatedEdges().add(cr2xcse__cr____source);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		ruleresult.getTranslatedEdges().add(xcse__xcsw____w);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		ruleresult.getCreatedEdges().add(n__cr____r);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		ruleresult.getCreatedEdges().add(n__cl____l);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cl2xcsw__cl____source.setName(cl2xcsw__cl____source_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		cl2xcsw__xcsw____target.setName(cl2xcsw__xcsw____target_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		cr2xcse__xcse____target.setName(cr2xcse__xcse____target_name_prime);
		cr2xcse__cr____source.setName(cr2xcse__cr____source_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		return new Object[] { ruleresult, cr, xcse, cl, xcsw, cl2xcsw, n, xn, cr2xcse, cl2xcsw__cl____source,
				xcsw__xcse____e, xn__xcse____se, cl2xcsw__xcsw____target, xn__xcsw____sw, cr2xcse__xcse____target,
				cr2xcse__cr____source, xcse__xcsw____w, n__cr____r, n__cl____l };
	}

	public static final void pattern_rightleft2eastwest_11_5_registerobjects_expressionBBBBBBBBBBB(
			rightleft2eastwest _this, PerformRuleResult ruleresult, EObject cr, EObject xcse, EObject cl, EObject xcsw,
			EObject cl2xcsw, EObject n, EObject xn, EObject n2xn, EObject cr2xcse) {
		_this.registerObjects_BWD(ruleresult, cr, xcse, cl, xcsw, cl2xcsw, n, xn, n2xn, cr2xcse);

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
		EObject _localVariable_1 = match.getObject("xcsw");
		EObject _localVariable_2 = match.getObject("xn");
		EObject tmpXcse = _localVariable_0;
		EObject tmpXcsw = _localVariable_1;
		EObject tmpXn = _localVariable_2;
		if (tmpXcse instanceof XBTNode) {
			XBTNode xcse = (XBTNode) tmpXcse;
			if (tmpXcsw instanceof XBTNode) {
				XBTNode xcsw = (XBTNode) tmpXcsw;
				if (tmpXn instanceof XBTNode) {
					XBTNode xn = (XBTNode) tmpXn;
					return new Object[] { xcse, xcsw, xn, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_12_2_corematch_blackBBFBFB(XBTNode xcse,
			XBTNode xcsw, XBTNode xn, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
							BTNode2XBTnode.class, "target")) {
						BTNode n = n2xn.getSource();
						if (n != null) {
							_result.add(new Object[] { xcse, xcsw, n, xn, n2xn, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_12_3_findcontext_blackBBBBB(XBTNode xcse,
			XBTNode xcsw, BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					if (xcse.equals(xcsw.getE())) {
						if (xcse.equals(xn.getSe())) {
							if (xn.equals(n2xn.getTarget())) {
								if (xcsw.equals(xn.getSw())) {
									if (n.equals(n2xn.getSource())) {
										if (xcsw.equals(xcse.getW())) {
											_result.add(new Object[] { xcse, xcsw, n, xn, n2xn });
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

	public static final Object[] pattern_rightleft2eastwest_12_3_findcontext_greenBBBBBFFFFFFF(XBTNode xcse,
			XBTNode xcsw, BTNode n, XBTNode xn, BTNode2XBTnode n2xn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xcsw__xcse____e_name_prime = "e";
		String xn__xcse____se_name_prime = "se";
		String n2xn__xn____target_name_prime = "target";
		String xn__xcsw____sw_name_prime = "sw";
		String n2xn__n____source_name_prime = "source";
		String xcse__xcsw____w_name_prime = "w";
		isApplicableMatch.getAllContextElements().add(xcse);
		isApplicableMatch.getAllContextElements().add(xcsw);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n2xn);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		isApplicableMatch.getAllContextElements().add(xcsw__xcse____e);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		isApplicableMatch.getAllContextElements().add(xn__xcse____se);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		isApplicableMatch.getAllContextElements().add(xn__xcsw____sw);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		isApplicableMatch.getAllContextElements().add(xcse__xcsw____w);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		return new Object[] { xcse, xcsw, n, xn, n2xn, isApplicableMatch, xcsw__xcse____e, xn__xcse____se,
				n2xn__xn____target, xn__xcsw____sw, n2xn__n____source, xcse__xcsw____w };
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_bindingFBBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, XBTNode xcse, XBTNode xcsw, BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, xcse, xcsw, n, xn, n2xn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, xcse, xcsw, n, xn, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, XBTNode xcse, XBTNode xcsw, BTNode n,
			XBTNode xn, BTNode2XBTnode n2xn) {
		Object[] result_pattern_rightleft2eastwest_12_4_solveCSP_binding = pattern_rightleft2eastwest_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, xcse, xcsw, n, xn, n2xn);
		if (result_pattern_rightleft2eastwest_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_12_4_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_12_4_solveCSP_black = pattern_rightleft2eastwest_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, xcse, xcsw, n, xn, n2xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					XBTNode __DEC_xcse_e_307396 = xcse.getE();
					if (__DEC_xcse_e_307396 != null) {
						if (!xcse.equals(__DEC_xcse_e_307396)) {
							if (!xcsw.equals(__DEC_xcse_e_307396)) {
								if (!xn.equals(__DEC_xcse_e_307396)) {
									return new Object[] { xcse, xcsw, xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_w_98161 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "w")) {
						if (!xcse.equals(__DEC_xcse_w_98161)) {
							if (!xcsw.equals(__DEC_xcse_w_98161)) {
								if (!xn.equals(__DEC_xcse_w_98161)) {
									return new Object[] { xcse, xcsw, xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_sw_144969 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "sw")) {
						if (!xcse.equals(__DEC_xcse_sw_144969)) {
							if (!xcsw.equals(__DEC_xcse_sw_144969)) {
								if (!xn.equals(__DEC_xcse_sw_144969)) {
									return new Object[] { xcse, xcsw, xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_e_581376 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "e")) {
						if (!xcse.equals(__DEC_xcse_e_581376)) {
							if (!xcsw.equals(__DEC_xcse_e_581376)) {
								if (!xn.equals(__DEC_xcse_e_581376)) {
									return new Object[] { xcse, xcsw, xn };
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
					XBTNode __DEC_xcsw_w_55052 = xcsw.getW();
					if (__DEC_xcsw_w_55052 != null) {
						if (!xcsw.equals(__DEC_xcsw_w_55052)) {
							if (!xcse.equals(__DEC_xcsw_w_55052)) {
								if (!xn.equals(__DEC_xcsw_w_55052)) {
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
					for (XBTNode __DEC_xcsw_w_787077 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "w")) {
						if (!xcsw.equals(__DEC_xcsw_w_787077)) {
							if (!xcse.equals(__DEC_xcsw_w_787077)) {
								if (!xn.equals(__DEC_xcsw_w_787077)) {
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
					for (XBTNode __DEC_xcsw_se_801064 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "se")) {
						if (!xcsw.equals(__DEC_xcsw_se_801064)) {
							if (!xcse.equals(__DEC_xcsw_se_801064)) {
								if (!xn.equals(__DEC_xcsw_se_801064)) {
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
					for (XBTNode __DEC_xcsw_e_797328 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "e")) {
						if (!xcsw.equals(__DEC_xcsw_e_797328)) {
							if (!xcse.equals(__DEC_xcsw_e_797328)) {
								if (!xn.equals(__DEC_xcsw_e_797328)) {
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
			XBTNode xcsw) {
		if (xcsw.equals(xcse.getE())) {
			return new Object[] { xcse, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_9BB(XBTNode xcse,
			XBTNode xn) {
		if (xn.equals(xcse.getE())) {
			return new Object[] { xcse, xn };
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

	public static final Iterable<Object[]> pattern_rightleft2eastwest_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_e) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXcsw = _edge_e.getSrc();
		if (tmpXcsw instanceof XBTNode) {
			XBTNode xcsw = (XBTNode) tmpXcsw;
			EObject tmpXcse = _edge_e.getTrg();
			if (tmpXcse instanceof XBTNode) {
				XBTNode xcse = (XBTNode) tmpXcse;
				if (!xcse.equals(xcsw)) {
					if (xcse.equals(xcsw.getE())) {
						if (xcsw.equals(xcse.getW())) {
							if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_8BB(xcse,
									xcsw) == null) {
								if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_11BB(xcse,
										xcsw) == null) {
									for (XBTNode xn : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(xcsw, XBTNode.class, "sw")) {
										if (!xcse.equals(xn)) {
											if (!xcsw.equals(xn)) {
												if (xcse.equals(xn.getSe())) {
													if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_0BBB(
															xcse, xcsw, xn) == null) {
														if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_1BBB(
																xcse, xcsw, xn) == null) {
															if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_2BBB(
																	xcse, xcsw, xn) == null) {
																if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_3BBB(
																		xcse, xcsw, xn) == null) {
																	if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_4BBB(
																			xcsw, xcse, xn) == null) {
																		if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_5BBB(
																				xcsw, xcse, xn) == null) {
																			if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_6BBB(
																					xcsw, xcse, xn) == null) {
																				if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_7BBB(
																						xcsw, xcse, xn) == null) {
																					if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_9BB(
																							xcse, xn) == null) {
																						if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_10BB(
																								xcsw, xn) == null) {
																							_result.add(new Object[] {
																									xcse, xcsw, xn,
																									_edge_e });
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
			rightleft2eastwest _this, Match match, XBTNode xcse, XBTNode xcsw, XBTNode xn) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, xcse, xcsw, xn);
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

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_0BBB(BTNode cr,
			BTNode cl, BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					for (BTNode __DEC_cr_l_239424 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cr, BTNode.class, "l")) {
						if (!cr.equals(__DEC_cr_l_239424)) {
							if (!cl.equals(__DEC_cr_l_239424)) {
								if (!n.equals(__DEC_cr_l_239424)) {
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

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_1BBB(BTNode cl,
			BTNode cr, BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					for (BTNode __DEC_cl_r_761635 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cl, BTNode.class, "r")) {
						if (!cl.equals(__DEC_cl_r_761635)) {
							if (!cr.equals(__DEC_cl_r_761635)) {
								if (!n.equals(__DEC_cl_r_761635)) {
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

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_2BB(BTNode cr,
			BTNode cl) {
		if (cl.equals(cr.getR())) {
			return new Object[] { cr, cl };
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
									if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_0BBB(cr, cl,
											n) == null) {
										if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_1BBB(cl, cr,
												n) == null) {
											if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_2BB(cr,
													cl) == null) {
												_result.add(new Object[] { cr, cl, n, _edge_r });
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
			rightleft2eastwest _this, Match match, BTNode cr, BTNode cl, BTNode n) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cr, cl, n);
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
		EObject _localVariable_0 = sourceMatch.getObject("cr");
		EObject _localVariable_1 = targetMatch.getObject("xcse");
		EObject _localVariable_2 = sourceMatch.getObject("cl");
		EObject _localVariable_3 = targetMatch.getObject("xcsw");
		EObject _localVariable_4 = sourceMatch.getObject("n");
		EObject _localVariable_5 = targetMatch.getObject("xn");
		EObject tmpCr = _localVariable_0;
		EObject tmpXcse = _localVariable_1;
		EObject tmpCl = _localVariable_2;
		EObject tmpXcsw = _localVariable_3;
		EObject tmpN = _localVariable_4;
		EObject tmpXn = _localVariable_5;
		if (tmpCr instanceof BTNode) {
			BTNode cr = (BTNode) tmpCr;
			if (tmpXcse instanceof XBTNode) {
				XBTNode xcse = (XBTNode) tmpXcse;
				if (tmpCl instanceof BTNode) {
					BTNode cl = (BTNode) tmpCl;
					if (tmpXcsw instanceof XBTNode) {
						XBTNode xcsw = (XBTNode) tmpXcsw;
						if (tmpN instanceof BTNode) {
							BTNode n = (BTNode) tmpN;
							if (tmpXn instanceof XBTNode) {
								XBTNode xn = (XBTNode) tmpXn;
								return new Object[] { cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_2_matchsrctrgcontext_blackBBBBBBBB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode n, XBTNode xn, Match sourceMatch, Match targetMatch) {
		if (!cr.equals(n)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					if (!cl.equals(cr)) {
						if (!cl.equals(n)) {
							if (!xcsw.equals(xn)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch };
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
			BTNode cr = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[0];
			XBTNode xcse = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[1];
			BTNode cl = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[2];
			XBTNode xcsw = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[3];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[4];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_black = pattern_rightleft2eastwest_24_2_matchsrctrgcontext_blackBBBBBBBB(
					cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch);
			if (result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_bindingFBBBBBBBBB(rightleft2eastwest _this,
			BTNode cr, XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode n, XBTNode xn, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			rightleft2eastwest _this, BTNode cr, XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode n, XBTNode xn,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_rightleft2eastwest_24_3_solvecsp_binding = pattern_rightleft2eastwest_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch);
		if (result_pattern_rightleft2eastwest_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_24_3_solvecsp_binding[0];

			Object[] result_pattern_rightleft2eastwest_24_3_solvecsp_black = pattern_rightleft2eastwest_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cr, xcse, cl, xcsw, n, xn, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_24_5_matchcorrcontext_blackBBFBB(BTNode n,
			XBTNode xn, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_rightleft2eastwest_24_6_createcorrespondence_blackBBBBBBB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, BTNode n, XBTNode xn, CCMatch ccMatch) {
		if (!cr.equals(n)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					if (!cl.equals(cr)) {
						if (!cl.equals(n)) {
							if (!xcsw.equals(xn)) {
								return new Object[] { cr, xcse, cl, xcsw, n, xn, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_6_createcorrespondence_greenBBBBFFB(BTNode cr,
			XBTNode xcse, BTNode cl, XBTNode xcsw, CCMatch ccMatch) {
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		cl2xcsw.setSource(cl);
		cl2xcsw.setTarget(xcsw);
		ccMatch.getCreateCorr().add(cl2xcsw);
		cr2xcse.setTarget(xcse);
		cr2xcse.setSource(cr);
		ccMatch.getCreateCorr().add(cr2xcse);
		return new Object[] { cr, xcse, cl, xcsw, cl2xcsw, cr2xcse, ccMatch };
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

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_0BBB(BTNode cr, BTNode cl,
			BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					for (BTNode __DEC_cr_l_69761 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cr, BTNode.class, "l")) {
						if (!cr.equals(__DEC_cr_l_69761)) {
							if (!cl.equals(__DEC_cr_l_69761)) {
								if (!n.equals(__DEC_cr_l_69761)) {
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

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_1BBB(BTNode cl, BTNode cr,
			BTNode n) {
		if (!cl.equals(cr)) {
			if (!cl.equals(n)) {
				if (!cr.equals(n)) {
					for (BTNode __DEC_cl_r_69934 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cl, BTNode.class, "r")) {
						if (!cl.equals(__DEC_cl_r_69934)) {
							if (!cr.equals(__DEC_cl_r_69934)) {
								if (!n.equals(__DEC_cl_r_69934)) {
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

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_2BB(BTNode cr, BTNode cl) {
		if (cl.equals(cr.getR())) {
			return new Object[] { cr, cl };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_blackBBB(BTNode cr, BTNode cl,
			BTNode n) {
		if (!cr.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cl.equals(n)) {
					if (cr.equals(n.getR())) {
						if (cl.equals(n.getL())) {
							if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_0BBB(cr, cl, n) == null) {
								if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_1BBB(cl, cr, n) == null) {
									if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_2BB(cr, cl) == null) {
										return new Object[] { cr, cl, n };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					XBTNode __DEC_xcse_e_885795 = xcse.getE();
					if (__DEC_xcse_e_885795 != null) {
						if (!xcse.equals(__DEC_xcse_e_885795)) {
							if (!xcsw.equals(__DEC_xcse_e_885795)) {
								if (!xn.equals(__DEC_xcse_e_885795)) {
									return new Object[] { xcse, xcsw, xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_w_658794 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "w")) {
						if (!xcse.equals(__DEC_xcse_w_658794)) {
							if (!xcsw.equals(__DEC_xcse_w_658794)) {
								if (!xn.equals(__DEC_xcse_w_658794)) {
									return new Object[] { xcse, xcsw, xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_sw_305202 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "sw")) {
						if (!xcse.equals(__DEC_xcse_sw_305202)) {
							if (!xcsw.equals(__DEC_xcse_sw_305202)) {
								if (!xn.equals(__DEC_xcse_sw_305202)) {
									return new Object[] { xcse, xcsw, xn };
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
			XBTNode xcsw, XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_e_209083 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "e")) {
						if (!xcse.equals(__DEC_xcse_e_209083)) {
							if (!xcsw.equals(__DEC_xcse_e_209083)) {
								if (!xn.equals(__DEC_xcse_e_209083)) {
									return new Object[] { xcse, xcsw, xn };
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
					XBTNode __DEC_xcsw_w_189877 = xcsw.getW();
					if (__DEC_xcsw_w_189877 != null) {
						if (!xcsw.equals(__DEC_xcsw_w_189877)) {
							if (!xcse.equals(__DEC_xcsw_w_189877)) {
								if (!xn.equals(__DEC_xcsw_w_189877)) {
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
					for (XBTNode __DEC_xcsw_w_731958 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "w")) {
						if (!xcsw.equals(__DEC_xcsw_w_731958)) {
							if (!xcse.equals(__DEC_xcsw_w_731958)) {
								if (!xn.equals(__DEC_xcsw_w_731958)) {
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
					for (XBTNode __DEC_xcsw_se_800575 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "se")) {
						if (!xcsw.equals(__DEC_xcsw_se_800575)) {
							if (!xcse.equals(__DEC_xcsw_se_800575)) {
								if (!xn.equals(__DEC_xcsw_se_800575)) {
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
					for (XBTNode __DEC_xcsw_e_411353 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "e")) {
						if (!xcsw.equals(__DEC_xcsw_e_411353)) {
							if (!xcse.equals(__DEC_xcsw_e_411353)) {
								if (!xn.equals(__DEC_xcsw_e_411353)) {
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
			XBTNode xcsw) {
		if (xcsw.equals(xcse.getE())) {
			return new Object[] { xcse, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_9BB(XBTNode xcse,
			XBTNode xn) {
		if (xn.equals(xcse.getE())) {
			return new Object[] { xcse, xn };
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

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_blackBBB(XBTNode xcse, XBTNode xcsw,
			XBTNode xn) {
		if (!xcse.equals(xcsw)) {
			if (!xcse.equals(xn)) {
				if (!xcsw.equals(xn)) {
					if (xcse.equals(xcsw.getE())) {
						if (xcse.equals(xn.getSe())) {
							if (xcsw.equals(xn.getSw())) {
								if (xcsw.equals(xcse.getW())) {
									if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_0BBB(xcse, xcsw,
											xn) == null) {
										if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_1BBB(xcse, xcsw,
												xn) == null) {
											if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_2BBB(xcse,
													xcsw, xn) == null) {
												if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_3BBB(xcse,
														xcsw, xn) == null) {
													if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_4BBB(
															xcsw, xcse, xn) == null) {
														if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_5BBB(
																xcsw, xcse, xn) == null) {
															if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_6BBB(
																	xcsw, xcse, xn) == null) {
																if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_7BBB(
																		xcsw, xcse, xn) == null) {
																	if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_8BB(
																			xcse, xcsw) == null) {
																		if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_9BB(
																				xcse, xn) == null) {
																			if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_10BB(
																					xcsw, xn) == null) {
																				if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_11BB(
																						xcse, xcsw) == null) {
																					return new Object[] { xcse, xcsw,
																							xn };
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
			IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n, xn, n2xn, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_bindingAndBlackFBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode n, XBTNode xn, BTNode2XBTnode n2xn,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_rightleft2eastwest_29_3_solveCSP_binding = pattern_rightleft2eastwest_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, xn, n2xn, ruleResult);
		if (result_pattern_rightleft2eastwest_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_29_3_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_29_3_solveCSP_black = pattern_rightleft2eastwest_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, xn, n2xn, ruleResult };
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

	public static final Object[] pattern_rightleft2eastwest_29_5_checknacs_blackBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn) {
		return new Object[] { n, xn, n2xn };
	}

	public static final Object[] pattern_rightleft2eastwest_29_6_perform_blackBBBB(BTNode n, XBTNode xn,
			BTNode2XBTnode n2xn, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n, xn, n2xn, ruleResult };
	}

	public static final Object[] pattern_rightleft2eastwest_29_6_perform_greenFFFFFBBFB(BTNode n, XBTNode xn,
			ModelgeneratorRuleResult ruleResult) {
		BTNode cr = BtreeFactory.eINSTANCE.createBTNode();
		XBTNode xcse = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode cl = BtreeFactory.eINSTANCE.createBTNode();
		XBTNode xcsw = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		n.setR(cr);
		ruleResult.getSourceObjects().add(cr);
		xn.setSe(xcse);
		ruleResult.getTargetObjects().add(xcse);
		n.setL(cl);
		ruleResult.getSourceObjects().add(cl);
		xcsw.setE(xcse);
		xn.setSw(xcsw);
		xcse.setW(xcsw);
		ruleResult.getTargetObjects().add(xcsw);
		cl2xcsw.setSource(cl);
		cl2xcsw.setTarget(xcsw);
		ruleResult.getCorrObjects().add(cl2xcsw);
		cr2xcse.setTarget(xcse);
		cr2xcse.setSource(cr);
		ruleResult.getCorrObjects().add(cr2xcse);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cr, xcse, cl, xcsw, cl2xcsw, n, xn, cr2xcse, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_rightleft2eastwest_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //rightleft2eastwestImpl
