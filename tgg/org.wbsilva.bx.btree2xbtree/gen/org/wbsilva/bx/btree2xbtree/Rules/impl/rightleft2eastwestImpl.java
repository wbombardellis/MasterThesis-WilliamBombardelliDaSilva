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
	public boolean isAppropriate_FWD(Match match, BTNode cl, BTNode n, BTNode cr) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_0_1_initialbindings_blackBBBBB(this,
				match, cl, n, cr);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cl] = " + cl + ", " + "[n] = " + n + ", " + "[cr] = " + cr + ".");
		}

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, cl, n, cr);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cl] = " + cl + ", " + "[n] = " + n + ", " + "[cr] = " + cr + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_0_4_collectelementstobetranslated_blackBBBB(match, cl, n, cr);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cl] = " + cl + ", " + "[n] = " + n + ", " + "[cr] = " + cr + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_4_collectelementstobetranslated_greenBBBBFF(match, cl,
					n, cr);
			//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result4_green[5];

			Object[] result5_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_0_5_collectcontextelements_blackBBBB(match, cl, n, cr);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cl] = " + cl + ", " + "[n] = " + n + ", " + "[cr] = " + cr + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_5_collectcontextelements_greenBB(match, n);

			// 
			rightleft2eastwestImpl.pattern_rightleft2eastwest_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					cl, n, cr);
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
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[0];
		BTNode cl = (BTNode) result1_bindingAndBlack[1];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[2];
		BTNode n = (BTNode) result1_bindingAndBlack[3];
		BTNode cr = (BTNode) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_1_performtransformation_greenFBFBFBF(cl, xn, cr);
		BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result1_green[0];
		BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result1_green[2];
		XBTNode xcsw = (XBTNode) result1_green[4];
		XBTNode xcse = (XBTNode) result1_green[6];

		Object[] result2_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_2_collecttranslatedelements_blackBBBBBB(cr2xcse, cl, cl2xcsw, xcsw, cr,
						xcse);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cr2xcse] = " + cr2xcse + ", "
					+ "[cl] = " + cl + ", " + "[cl2xcsw] = " + cl2xcsw + ", " + "[xcsw] = " + xcsw + ", " + "[cr] = "
					+ cr + ", " + "[xcse] = " + xcse + ".");
		}
		Object[] result2_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_2_collecttranslatedelements_greenFBBBBBB(cr2xcse, cl, cl2xcsw, xcsw, cr,
						xcse);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, n2xn, cr2xcse, cl,
						cl2xcsw, xn, xcsw, n, cr, xcse);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[n2xn] = " + n2xn + ", " + "[cr2xcse] = " + cr2xcse + ", " + "[cl] = " + cl + ", "
					+ "[cl2xcsw] = " + cl2xcsw + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[n] = " + n
					+ ", " + "[cr] = " + cr + ", " + "[xcse] = " + xcse + ".");
		}
		rightleft2eastwestImpl.pattern_rightleft2eastwest_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult,
				cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse);
		//nothing EMoflonEdge cl2xcsw__cl____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cr2xcse__cr____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge cl2xcsw__xcsw____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge cr2xcse__xcse____target = (EMoflonEdge) result3_green[18];

		// 
		// 
		rightleft2eastwestImpl.pattern_rightleft2eastwest_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				n2xn, cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse);
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
		BTNode n = (BTNode) result2_binding[1];
		BTNode cr = (BTNode) result2_binding[2];
		for (Object[] result2_black : rightleft2eastwestImpl.pattern_rightleft2eastwest_2_2_corematch_blackFBFBBB(cl, n,
				cr, match)) {
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[0];
			XBTNode xn = (XBTNode) result2_black[2];
			// ForEach 
			for (Object[] result3_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_2_3_findcontext_blackBBBBB(n2xn, cl, xn, n, cr)) {
				Object[] result3_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_2_3_findcontext_greenBBBBBFFFFF(n2xn, cl, xn, n, cr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, n2xn,
								cl, xn, n, cr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n2xn] = " + n2xn + ", "
							+ "[cl] = " + cl + ", " + "[xn] = " + xn + ", " + "[n] = " + n + ", " + "[cr] = " + cr
							+ ".");
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
	public void registerObjectsToMatch_FWD(Match match, BTNode cl, BTNode n, BTNode cr) {
		match.registerObject("cl", cl);
		match.registerObject("n", n);
		match.registerObject("cr", cr);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BTNode cl, BTNode n, BTNode cr) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, BTNode cl,
			XBTNode xn, BTNode n, BTNode cr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("cl", cl);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("cr", cr);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject n2xn, EObject cr2xcse, EObject cl,
			EObject cl2xcsw, EObject xn, EObject xcsw, EObject n, EObject cr, EObject xcse) {
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("cr2xcse", cr2xcse);
		ruleresult.registerObject("cl", cl);
		ruleresult.registerObject("cl2xcsw", cl2xcsw);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("xcsw", xcsw);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("cr", cr);
		ruleresult.registerObject("xcse", xcse);

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
	public boolean isAppropriate_BWD(Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {

		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_10_1_initialbindings_blackBBBBB(this,
				match, xn, xcsw, xcse);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[xcse] = " + xcse + ".");
		}

		Object[] result2_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, xn, xcsw, xcse);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[xcse] = " + xcse + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_10_4_collectelementstobetranslated_blackBBBB(match, xn, xcsw, xcse);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[xcse] = " + xcse + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
					xn, xcsw, xcse);
			//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result4_green[7];

			Object[] result5_black = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_10_5_collectcontextelements_blackBBBB(match, xn, xcsw, xcse);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[xcse] = " + xcse + ".");
			}
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_5_collectcontextelements_greenBB(match, xn);

			// 
			rightleft2eastwestImpl.pattern_rightleft2eastwest_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					xn, xcsw, xcse);
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
		BTNode2XBTnode n2xn = (BTNode2XBTnode) result1_bindingAndBlack[0];
		XBTNode xn = (XBTNode) result1_bindingAndBlack[1];
		XBTNode xcsw = (XBTNode) result1_bindingAndBlack[2];
		BTNode n = (BTNode) result1_bindingAndBlack[3];
		XBTNode xcse = (XBTNode) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_1_performtransformation_greenFFFBBFB(xcsw, n, xcse);
		BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result1_green[0];
		BTNode cl = (BTNode) result1_green[1];
		BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result1_green[2];
		BTNode cr = (BTNode) result1_green[5];

		Object[] result2_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_2_collecttranslatedelements_blackBBBBBB(cr2xcse, cl, cl2xcsw, xcsw, cr,
						xcse);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cr2xcse] = " + cr2xcse + ", "
					+ "[cl] = " + cl + ", " + "[cl2xcsw] = " + cl2xcsw + ", " + "[xcsw] = " + xcsw + ", " + "[cr] = "
					+ cr + ", " + "[xcse] = " + xcse + ".");
		}
		Object[] result2_green = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_2_collecttranslatedelements_greenFBBBBBB(cr2xcse, cl, cl2xcsw, xcsw, cr,
						xcse);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, n2xn, cr2xcse, cl,
						cl2xcsw, xn, xcsw, n, cr, xcse);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[n2xn] = " + n2xn + ", " + "[cr2xcse] = " + cr2xcse + ", " + "[cl] = " + cl + ", "
					+ "[cl2xcsw] = " + cl2xcsw + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[n] = " + n
					+ ", " + "[cr] = " + cr + ", " + "[xcse] = " + xcse + ".");
		}
		rightleft2eastwestImpl.pattern_rightleft2eastwest_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult,
				cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse);
		//nothing EMoflonEdge cl2xcsw__cl____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge n__cr____r = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cr2xcse__cr____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge n__cl____l = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge cl2xcsw__xcsw____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge cr2xcse__xcse____target = (EMoflonEdge) result3_green[18];

		// 
		// 
		rightleft2eastwestImpl.pattern_rightleft2eastwest_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				n2xn, cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse);
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
		XBTNode xn = (XBTNode) result2_binding[0];
		XBTNode xcsw = (XBTNode) result2_binding[1];
		XBTNode xcse = (XBTNode) result2_binding[2];
		for (Object[] result2_black : rightleft2eastwestImpl.pattern_rightleft2eastwest_12_2_corematch_blackFBBFBB(xn,
				xcsw, xcse, match)) {
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[0];
			BTNode n = (BTNode) result2_black[3];
			// ForEach 
			for (Object[] result3_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_12_3_findcontext_blackBBBBB(n2xn, xn, xcsw, n, xcse)) {
				Object[] result3_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_12_3_findcontext_greenBBBBBFFFFFFF(n2xn, xn, xcsw, n, xcse);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge xn__xcsw____sw = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n2xn__xn____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n2xn__n____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge xn__xcse____se = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge xcsw__xcse____e = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge xcse__xcsw____w = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, n2xn,
								xn, xcsw, n, xcse);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n2xn] = " + n2xn + ", "
							+ "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[n] = " + n + ", " + "[xcse] = "
							+ xcse + ".");
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
	public void registerObjectsToMatch_BWD(Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		match.registerObject("xn", xn);
		match.registerObject("xcsw", xcsw);
		match.registerObject("xcse", xcse);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, XBTNode xn,
			XBTNode xcsw, BTNode n, XBTNode xcse) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("xcsw", xcsw);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("xcse", xcse);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject n2xn, EObject cr2xcse, EObject cl,
			EObject cl2xcsw, EObject xn, EObject xcsw, EObject n, EObject cr, EObject xcse) {
		ruleresult.registerObject("n2xn", n2xn);
		ruleresult.registerObject("cr2xcse", cr2xcse);
		ruleresult.registerObject("cl", cl);
		ruleresult.registerObject("cl2xcsw", cl2xcsw);
		ruleresult.registerObject("xn", xn);
		ruleresult.registerObject("xcsw", xcsw);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("cr", cr);
		ruleresult.registerObject("xcse", xcse);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xcsw").eClass()).equals("xbtree.XBTNode.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xcse").eClass()).equals("xbtree.XBTNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_113(EMoflonEdge _edge_sw) {

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
				.pattern_rightleft2eastwest_20_2_testcorematchandDECs_blackFFFB(_edge_sw)) {
			XBTNode xn = (XBTNode) result2_black[0];
			XBTNode xcsw = (XBTNode) result2_black[1];
			XBTNode xcse = (XBTNode) result2_black[2];
			Object[] result2_green = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (rightleft2eastwestImpl
					.pattern_rightleft2eastwest_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, xn, xcsw, xcse)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_121(EMoflonEdge _edge_r) {

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
			BTNode n = (BTNode) result2_black[1];
			BTNode cr = (BTNode) result2_black[2];
			Object[] result2_green = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (rightleft2eastwestImpl
					.pattern_rightleft2eastwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, cl, n, cr)) {
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
		XBTNode xn = (XBTNode) result2_bindingAndBlack[1];
		XBTNode xcsw = (XBTNode) result2_bindingAndBlack[2];
		BTNode n = (BTNode) result2_bindingAndBlack[3];
		BTNode cr = (BTNode) result2_bindingAndBlack[4];
		XBTNode xcse = (XBTNode) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = rightleft2eastwestImpl
				.pattern_rightleft2eastwest_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, cl, xn, xcsw, n, cr, xcse,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cl] = " + cl + ", " + "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[n] = " + n + ", "
					+ "[cr] = " + cr + ", " + "[xcse] = " + xcse + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (rightleft2eastwestImpl.pattern_rightleft2eastwest_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : rightleft2eastwestImpl
					.pattern_rightleft2eastwest_24_5_matchcorrcontext_blackFBBBB(xn, n, sourceMatch, targetMatch)) {
				BTNode2XBTnode n2xn = (BTNode2XBTnode) result5_black[0];
				Object[] result5_green = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_5_matchcorrcontext_greenBBBF(n2xn, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = rightleft2eastwestImpl
						.pattern_rightleft2eastwest_24_6_createcorrespondence_blackBBBBBBB(cl, xn, xcsw, n, cr, xcse,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cl] = " + cl + ", "
							+ "[xn] = " + xn + ", " + "[xcsw] = " + xcsw + ", " + "[n] = " + n + ", " + "[cr] = " + cr
							+ ", " + "[xcse] = " + xcse + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				rightleft2eastwestImpl.pattern_rightleft2eastwest_24_6_createcorrespondence_greenFBFBBBB(cl, xcsw, cr,
						xcse, ccMatch);
				//nothing BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result6_green[0];
				//nothing BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(BTNode cl, XBTNode xn, XBTNode xcsw, BTNode n, BTNode cr, XBTNode xcse,
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
	public boolean checkDEC_FWD(BTNode cl, BTNode n, BTNode cr) {// 
		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_27_1_matchtggpattern_blackBBB(cl, n,
				cr);
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
	public boolean checkDEC_BWD(XBTNode xn, XBTNode xcsw, XBTNode xcse) {// 
		Object[] result1_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_28_1_matchtggpattern_blackBBB(xn,
				xcsw, xcse);
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
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result2_black[1];
			XBTNode xn = (XBTNode) result2_black[2];
			BTNode n = (BTNode) result2_black[3];

			Object[] result3_bindingAndBlack = rightleft2eastwestImpl
					.pattern_rightleft2eastwest_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n2xn, xn,
							n, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n2xn] = " + n2xn + ", " + "[xn] = "
						+ xn + ", " + "[n] = " + n + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (rightleft2eastwestImpl.pattern_rightleft2eastwest_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = rightleft2eastwestImpl.pattern_rightleft2eastwest_29_5_checknacs_blackBBB(n2xn,
						xn, n);
				if (result5_black != null) {

					Object[] result6_black = rightleft2eastwestImpl
							.pattern_rightleft2eastwest_29_6_perform_blackBBBB(n2xn, xn, n, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[n2xn] = " + n2xn + ", " + "[xn] = " + xn
										+ ", " + "[n] = " + n + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					rightleft2eastwestImpl.pattern_rightleft2eastwest_29_6_perform_greenFFFBFBFFB(xn, n, ruleResult);
					//nothing BTNode2XBTnode cr2xcse = (BTNode2XBTnode) result6_green[0];
					//nothing BTNode cl = (BTNode) result6_green[1];
					//nothing BTNode2XBTnode cl2xcsw = (BTNode2XBTnode) result6_green[2];
					//nothing XBTNode xcsw = (XBTNode) result6_green[4];
					//nothing BTNode cr = (BTNode) result6_green[6];
					//nothing XBTNode xcse = (XBTNode) result6_green[7];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, XBTNode xn,
			BTNode n, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n2xn", n2xn);
		isApplicableMatch.registerObject("xn", xn);
		isApplicableMatch.registerObject("n", n);
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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_BTNODE_XBTNODE_BTNODE_BTNODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BTNode2XBTnode) arguments.get(1),
					(BTNode) arguments.get(2), (XBTNode) arguments.get(3), (BTNode) arguments.get(4),
					(BTNode) arguments.get(5));
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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_XBTNODE_XBTNODE_BTNODE_XBTNODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode2XBTnode) arguments.get(1),
					(XBTNode) arguments.get(2), (XBTNode) arguments.get(3), (BTNode) arguments.get(4),
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
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_113__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_113((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_121((EMoflonEdge) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_SOLVE_CSP_CC__BTNODE_XBTNODE_XBTNODE_BTNODE_BTNODE_XBTNODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((BTNode) arguments.get(0), (XBTNode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode) arguments.get(3), (BTNode) arguments.get(4),
					(XBTNode) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.RIGHTLEFT2EASTWEST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_DEC_FWD__BTNODE_BTNODE_BTNODE:
			return checkDEC_FWD((BTNode) arguments.get(0), (BTNode) arguments.get(1), (BTNode) arguments.get(2));
		case RulesPackage.RIGHTLEFT2EASTWEST___CHECK_DEC_BWD__XBTNODE_XBTNODE_XBTNODE:
			return checkDEC_BWD((XBTNode) arguments.get(0), (XBTNode) arguments.get(1), (XBTNode) arguments.get(2));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL__RULEENTRYCONTAINER_BTNODE2XBTNODE:
			return generateModel((RuleEntryContainer) arguments.get(0), (BTNode2XBTnode) arguments.get(1));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BTNODE2XBTNODE_XBTNODE_BTNODE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BTNode2XBTnode) arguments.get(1),
					(XBTNode) arguments.get(2), (BTNode) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.RIGHTLEFT2EASTWEST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_rightleft2eastwest_0_1_initialbindings_blackBBBBB(rightleft2eastwest _this,
			Match match, BTNode cl, BTNode n, BTNode cr) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					return new Object[] { _this, match, cl, n, cr };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_bindingFBBBBB(rightleft2eastwest _this,
			Match match, BTNode cl, BTNode n, BTNode cr) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cl, n, cr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cl, n, cr };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_0_2_SolveCSP_bindingAndBlackFBBBBB(rightleft2eastwest _this,
			Match match, BTNode cl, BTNode n, BTNode cr) {
		Object[] result_pattern_rightleft2eastwest_0_2_SolveCSP_binding = pattern_rightleft2eastwest_0_2_SolveCSP_bindingFBBBBB(
				_this, match, cl, n, cr);
		if (result_pattern_rightleft2eastwest_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_0_2_SolveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_0_2_SolveCSP_black = pattern_rightleft2eastwest_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cl, n, cr };
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
			BTNode cl, BTNode n, BTNode cr) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					return new Object[] { match, cl, n, cr };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			BTNode cl, BTNode n, BTNode cr) {
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
		return new Object[] { match, cl, n, cr, n__cr____r, n__cl____l };
	}

	public static final Object[] pattern_rightleft2eastwest_0_5_collectcontextelements_blackBBBB(Match match, BTNode cl,
			BTNode n, BTNode cr) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					return new Object[] { match, cl, n, cr };
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
			rightleft2eastwest _this, Match match, BTNode cl, BTNode n, BTNode cr) {
		_this.registerObjectsToMatch_FWD(match, cl, n, cr);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("n2xn");
		EObject _localVariable_1 = isApplicableMatch.getObject("cl");
		EObject _localVariable_2 = isApplicableMatch.getObject("xn");
		EObject _localVariable_3 = isApplicableMatch.getObject("n");
		EObject _localVariable_4 = isApplicableMatch.getObject("cr");
		EObject tmpN2xn = _localVariable_0;
		EObject tmpCl = _localVariable_1;
		EObject tmpXn = _localVariable_2;
		EObject tmpN = _localVariable_3;
		EObject tmpCr = _localVariable_4;
		if (tmpN2xn instanceof BTNode2XBTnode) {
			BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
			if (tmpCl instanceof BTNode) {
				BTNode cl = (BTNode) tmpCl;
				if (tmpXn instanceof XBTNode) {
					XBTNode xn = (XBTNode) tmpXn;
					if (tmpN instanceof BTNode) {
						BTNode n = (BTNode) tmpN;
						if (tmpCr instanceof BTNode) {
							BTNode cr = (BTNode) tmpCr;
							return new Object[] { n2xn, cl, xn, n, cr, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_blackBBBBBFBB(BTNode2XBTnode n2xn,
			BTNode cl, XBTNode xn, BTNode n, BTNode cr, rightleft2eastwest _this, IsApplicableMatch isApplicableMatch) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { n2xn, cl, xn, n, cr, csp, _this, isApplicableMatch };
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
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[0];
			BTNode cl = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[1];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[2];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[3];
			BTNode cr = (BTNode) result_pattern_rightleft2eastwest_1_1_performtransformation_binding[4];

			Object[] result_pattern_rightleft2eastwest_1_1_performtransformation_black = pattern_rightleft2eastwest_1_1_performtransformation_blackBBBBBFBB(
					n2xn, cl, xn, n, cr, _this, isApplicableMatch);
			if (result_pattern_rightleft2eastwest_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_rightleft2eastwest_1_1_performtransformation_black[5];

				return new Object[] { n2xn, cl, xn, n, cr, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_1_performtransformation_greenFBFBFBF(BTNode cl,
			XBTNode xn, BTNode cr) {
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		XBTNode xcsw = XbtreeFactory.eINSTANCE.createXBTNode();
		XBTNode xcse = XbtreeFactory.eINSTANCE.createXBTNode();
		cr2xcse.setSource(cr);
		cl2xcsw.setSource(cl);
		xn.setSw(xcsw);
		cl2xcsw.setTarget(xcsw);
		xn.setSe(xcse);
		xcsw.setE(xcse);
		xcse.setW(xcsw);
		cr2xcse.setTarget(xcse);
		return new Object[] { cr2xcse, cl, cl2xcsw, xn, xcsw, cr, xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_1_2_collecttranslatedelements_blackBBBBBB(
			BTNode2XBTnode cr2xcse, BTNode cl, BTNode2XBTnode cl2xcsw, XBTNode xcsw, BTNode cr, XBTNode xcse) {
		if (!cl.equals(cr)) {
			if (!cl2xcsw.equals(cr2xcse)) {
				if (!xcse.equals(xcsw)) {
					return new Object[] { cr2xcse, cl, cl2xcsw, xcsw, cr, xcse };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_1_2_collecttranslatedelements_greenFBBBBBB(
			BTNode2XBTnode cr2xcse, BTNode cl, BTNode2XBTnode cl2xcsw, XBTNode xcsw, BTNode cr, XBTNode xcse) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(cr2xcse);
		ruleresult.getTranslatedElements().add(cl);
		ruleresult.getCreatedLinkElements().add(cl2xcsw);
		ruleresult.getCreatedElements().add(xcsw);
		ruleresult.getTranslatedElements().add(cr);
		ruleresult.getCreatedElements().add(xcse);
		return new Object[] { ruleresult, cr2xcse, cl, cl2xcsw, xcsw, cr, xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject n2xn, EObject cr2xcse, EObject cl, EObject cl2xcsw, EObject xn,
			EObject xcsw, EObject n, EObject cr, EObject xcse) {
		if (!n2xn.equals(xn)) {
			if (!n2xn.equals(xcsw)) {
				if (!n2xn.equals(xcse)) {
					if (!cr2xcse.equals(n2xn)) {
						if (!cr2xcse.equals(xn)) {
							if (!cr2xcse.equals(xcsw)) {
								if (!cr2xcse.equals(n)) {
									if (!cr2xcse.equals(xcse)) {
										if (!cl.equals(n2xn)) {
											if (!cl.equals(cr2xcse)) {
												if (!cl.equals(cl2xcsw)) {
													if (!cl.equals(xn)) {
														if (!cl.equals(xcsw)) {
															if (!cl.equals(n)) {
																if (!cl.equals(cr)) {
																	if (!cl.equals(xcse)) {
																		if (!cl2xcsw.equals(n2xn)) {
																			if (!cl2xcsw.equals(cr2xcse)) {
																				if (!cl2xcsw.equals(xn)) {
																					if (!cl2xcsw.equals(xcsw)) {
																						if (!cl2xcsw.equals(n)) {
																							if (!cl2xcsw.equals(cr)) {
																								if (!cl2xcsw
																										.equals(xcse)) {
																									if (!xcsw.equals(
																											xn)) {
																										if (!n.equals(
																												n2xn)) {
																											if (!n.equals(
																													xn)) {
																												if (!n.equals(
																														xcsw)) {
																													if (!n.equals(
																															xcse)) {
																														if (!cr.equals(
																																n2xn)) {
																															if (!cr.equals(
																																	cr2xcse)) {
																																if (!cr.equals(
																																		xn)) {
																																	if (!cr.equals(
																																			xcsw)) {
																																		if (!cr.equals(
																																				n)) {
																																			if (!cr.equals(
																																					xcse)) {
																																				if (!xcse
																																						.equals(xn)) {
																																					if (!xcse
																																							.equals(xcsw)) {
																																						return new Object[] {
																																								ruleresult,
																																								n2xn,
																																								cr2xcse,
																																								cl,
																																								cl2xcsw,
																																								xn,
																																								xcsw,
																																								n,
																																								cr,
																																								xcse };
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
			PerformRuleResult ruleresult, EObject cr2xcse, EObject cl, EObject cl2xcsw, EObject xn, EObject xcsw,
			EObject n, EObject cr, EObject xcse) {
		EMoflonEdge cl2xcsw__cl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__cr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__xcsw____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__xcse____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "rightleft2eastwest";
		String cl2xcsw__cl____source_name_prime = "source";
		String xn__xcsw____sw_name_prime = "sw";
		String n__cr____r_name_prime = "r";
		String cr2xcse__cr____source_name_prime = "source";
		String xn__xcse____se_name_prime = "se";
		String xcsw__xcse____e_name_prime = "e";
		String n__cl____l_name_prime = "l";
		String xcse__xcsw____w_name_prime = "w";
		String cl2xcsw__xcsw____target_name_prime = "target";
		String cr2xcse__xcse____target_name_prime = "target";
		cl2xcsw__cl____source.setSrc(cl2xcsw);
		cl2xcsw__cl____source.setTrg(cl);
		ruleresult.getCreatedEdges().add(cl2xcsw__cl____source);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(xn__xcsw____sw);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		ruleresult.getTranslatedEdges().add(n__cr____r);
		cr2xcse__cr____source.setSrc(cr2xcse);
		cr2xcse__cr____source.setTrg(cr);
		ruleresult.getCreatedEdges().add(cr2xcse__cr____source);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		ruleresult.getCreatedEdges().add(xn__xcse____se);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		ruleresult.getCreatedEdges().add(xcsw__xcse____e);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		ruleresult.getTranslatedEdges().add(n__cl____l);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(xcse__xcsw____w);
		cl2xcsw__xcsw____target.setSrc(cl2xcsw);
		cl2xcsw__xcsw____target.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(cl2xcsw__xcsw____target);
		cr2xcse__xcse____target.setSrc(cr2xcse);
		cr2xcse__xcse____target.setTrg(xcse);
		ruleresult.getCreatedEdges().add(cr2xcse__xcse____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cl2xcsw__cl____source.setName(cl2xcsw__cl____source_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		cr2xcse__cr____source.setName(cr2xcse__cr____source_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		cl2xcsw__xcsw____target.setName(cl2xcsw__xcsw____target_name_prime);
		cr2xcse__xcse____target.setName(cr2xcse__xcse____target_name_prime);
		return new Object[] { ruleresult, cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse, cl2xcsw__cl____source,
				xn__xcsw____sw, n__cr____r, cr2xcse__cr____source, xn__xcse____se, xcsw__xcse____e, n__cl____l,
				xcse__xcsw____w, cl2xcsw__xcsw____target, cr2xcse__xcse____target };
	}

	public static final void pattern_rightleft2eastwest_1_5_registerobjects_expressionBBBBBBBBBBB(
			rightleft2eastwest _this, PerformRuleResult ruleresult, EObject n2xn, EObject cr2xcse, EObject cl,
			EObject cl2xcsw, EObject xn, EObject xcsw, EObject n, EObject cr, EObject xcse) {
		_this.registerObjects_FWD(ruleresult, n2xn, cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse);

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
		EObject _localVariable_1 = match.getObject("n");
		EObject _localVariable_2 = match.getObject("cr");
		EObject tmpCl = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpCr = _localVariable_2;
		if (tmpCl instanceof BTNode) {
			BTNode cl = (BTNode) tmpCl;
			if (tmpN instanceof BTNode) {
				BTNode n = (BTNode) tmpN;
				if (tmpCr instanceof BTNode) {
					BTNode cr = (BTNode) tmpCr;
					return new Object[] { cl, n, cr, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_2_2_corematch_blackFBFBBB(BTNode cl, BTNode n,
			BTNode cr, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n,
							BTNode2XBTnode.class, "source")) {
						XBTNode xn = n2xn.getTarget();
						if (xn != null) {
							_result.add(new Object[] { n2xn, cl, xn, n, cr, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_2_3_findcontext_blackBBBBB(BTNode2XBTnode n2xn,
			BTNode cl, XBTNode xn, BTNode n, BTNode cr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					if (xn.equals(n2xn.getTarget())) {
						if (cr.equals(n.getR())) {
							if (n.equals(n2xn.getSource())) {
								if (cl.equals(n.getL())) {
									_result.add(new Object[] { n2xn, cl, xn, n, cr });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_2_3_findcontext_greenBBBBBFFFFF(BTNode2XBTnode n2xn,
			BTNode cl, XBTNode xn, BTNode n, BTNode cr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n2xn__xn____target_name_prime = "target";
		String n__cr____r_name_prime = "r";
		String n2xn__n____source_name_prime = "source";
		String n__cl____l_name_prime = "l";
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(cl);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(cr);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		isApplicableMatch.getAllContextElements().add(n__cr____r);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		isApplicableMatch.getAllContextElements().add(n__cl____l);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		return new Object[] { n2xn, cl, xn, n, cr, isApplicableMatch, n2xn__xn____target, n__cr____r, n2xn__n____source,
				n__cl____l };
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_bindingFBBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, BTNode cl, XBTNode xn, BTNode n, BTNode cr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, n2xn, cl, xn, n, cr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n2xn, cl, xn, n, cr };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, BTNode cl, XBTNode xn,
			BTNode n, BTNode cr) {
		Object[] result_pattern_rightleft2eastwest_2_4_solveCSP_binding = pattern_rightleft2eastwest_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, n2xn, cl, xn, n, cr);
		if (result_pattern_rightleft2eastwest_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_2_4_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_2_4_solveCSP_black = pattern_rightleft2eastwest_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n2xn, cl, xn, n, cr };
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
			Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					return new Object[] { _this, match, xn, xcsw, xcse };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_bindingFBBBBB(rightleft2eastwest _this,
			Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, xn, xcsw, xcse);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xn, xcsw, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_10_2_SolveCSP_bindingAndBlackFBBBBB(
			rightleft2eastwest _this, Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		Object[] result_pattern_rightleft2eastwest_10_2_SolveCSP_binding = pattern_rightleft2eastwest_10_2_SolveCSP_bindingFBBBBB(
				_this, match, xn, xcsw, xcse);
		if (result_pattern_rightleft2eastwest_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_10_2_SolveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_10_2_SolveCSP_black = pattern_rightleft2eastwest_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xn, xcsw, xcse };
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
			XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					return new Object[] { match, xn, xcsw, xcse };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xcsw);
		match.getToBeTranslatedNodes().add(xcse);
		String xn__xcsw____sw_name_prime = "sw";
		String xn__xcse____se_name_prime = "se";
		String xcsw__xcse____e_name_prime = "e";
		String xcse__xcsw____w_name_prime = "w";
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		match.getToBeTranslatedEdges().add(xn__xcsw____sw);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		match.getToBeTranslatedEdges().add(xn__xcse____se);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		match.getToBeTranslatedEdges().add(xcsw__xcse____e);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		match.getToBeTranslatedEdges().add(xcse__xcsw____w);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		return new Object[] { match, xn, xcsw, xcse, xn__xcsw____sw, xn__xcse____se, xcsw__xcse____e, xcse__xcsw____w };
	}

	public static final Object[] pattern_rightleft2eastwest_10_5_collectcontextelements_blackBBBB(Match match,
			XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					return new Object[] { match, xn, xcsw, xcse };
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
			rightleft2eastwest _this, Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		_this.registerObjectsToMatch_BWD(match, xn, xcsw, xcse);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("n2xn");
		EObject _localVariable_1 = isApplicableMatch.getObject("xn");
		EObject _localVariable_2 = isApplicableMatch.getObject("xcsw");
		EObject _localVariable_3 = isApplicableMatch.getObject("n");
		EObject _localVariable_4 = isApplicableMatch.getObject("xcse");
		EObject tmpN2xn = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		EObject tmpXcsw = _localVariable_2;
		EObject tmpN = _localVariable_3;
		EObject tmpXcse = _localVariable_4;
		if (tmpN2xn instanceof BTNode2XBTnode) {
			BTNode2XBTnode n2xn = (BTNode2XBTnode) tmpN2xn;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				if (tmpXcsw instanceof XBTNode) {
					XBTNode xcsw = (XBTNode) tmpXcsw;
					if (tmpN instanceof BTNode) {
						BTNode n = (BTNode) tmpN;
						if (tmpXcse instanceof XBTNode) {
							XBTNode xcse = (XBTNode) tmpXcse;
							return new Object[] { n2xn, xn, xcsw, n, xcse, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_blackBBBBBFBB(
			BTNode2XBTnode n2xn, XBTNode xn, XBTNode xcsw, BTNode n, XBTNode xcse, rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { n2xn, xn, xcsw, n, xcse, csp, _this, isApplicableMatch };
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
			BTNode2XBTnode n2xn = (BTNode2XBTnode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[0];
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[1];
			XBTNode xcsw = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[2];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[3];
			XBTNode xcse = (XBTNode) result_pattern_rightleft2eastwest_11_1_performtransformation_binding[4];

			Object[] result_pattern_rightleft2eastwest_11_1_performtransformation_black = pattern_rightleft2eastwest_11_1_performtransformation_blackBBBBBFBB(
					n2xn, xn, xcsw, n, xcse, _this, isApplicableMatch);
			if (result_pattern_rightleft2eastwest_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_rightleft2eastwest_11_1_performtransformation_black[5];

				return new Object[] { n2xn, xn, xcsw, n, xcse, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_1_performtransformation_greenFFFBBFB(XBTNode xcsw,
			BTNode n, XBTNode xcse) {
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode cl = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode cr = BtreeFactory.eINSTANCE.createBTNode();
		cr2xcse.setTarget(xcse);
		n.setL(cl);
		cl2xcsw.setSource(cl);
		cl2xcsw.setTarget(xcsw);
		n.setR(cr);
		cr2xcse.setSource(cr);
		return new Object[] { cr2xcse, cl, cl2xcsw, xcsw, n, cr, xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_11_2_collecttranslatedelements_blackBBBBBB(
			BTNode2XBTnode cr2xcse, BTNode cl, BTNode2XBTnode cl2xcsw, XBTNode xcsw, BTNode cr, XBTNode xcse) {
		if (!cl.equals(cr)) {
			if (!cl2xcsw.equals(cr2xcse)) {
				if (!xcse.equals(xcsw)) {
					return new Object[] { cr2xcse, cl, cl2xcsw, xcsw, cr, xcse };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_11_2_collecttranslatedelements_greenFBBBBBB(
			BTNode2XBTnode cr2xcse, BTNode cl, BTNode2XBTnode cl2xcsw, XBTNode xcsw, BTNode cr, XBTNode xcse) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(cr2xcse);
		ruleresult.getCreatedElements().add(cl);
		ruleresult.getCreatedLinkElements().add(cl2xcsw);
		ruleresult.getTranslatedElements().add(xcsw);
		ruleresult.getCreatedElements().add(cr);
		ruleresult.getTranslatedElements().add(xcse);
		return new Object[] { ruleresult, cr2xcse, cl, cl2xcsw, xcsw, cr, xcse };
	}

	public static final Object[] pattern_rightleft2eastwest_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject n2xn, EObject cr2xcse, EObject cl, EObject cl2xcsw, EObject xn,
			EObject xcsw, EObject n, EObject cr, EObject xcse) {
		if (!n2xn.equals(xn)) {
			if (!n2xn.equals(xcsw)) {
				if (!n2xn.equals(xcse)) {
					if (!cr2xcse.equals(n2xn)) {
						if (!cr2xcse.equals(xn)) {
							if (!cr2xcse.equals(xcsw)) {
								if (!cr2xcse.equals(n)) {
									if (!cr2xcse.equals(xcse)) {
										if (!cl.equals(n2xn)) {
											if (!cl.equals(cr2xcse)) {
												if (!cl.equals(cl2xcsw)) {
													if (!cl.equals(xn)) {
														if (!cl.equals(xcsw)) {
															if (!cl.equals(n)) {
																if (!cl.equals(cr)) {
																	if (!cl.equals(xcse)) {
																		if (!cl2xcsw.equals(n2xn)) {
																			if (!cl2xcsw.equals(cr2xcse)) {
																				if (!cl2xcsw.equals(xn)) {
																					if (!cl2xcsw.equals(xcsw)) {
																						if (!cl2xcsw.equals(n)) {
																							if (!cl2xcsw.equals(cr)) {
																								if (!cl2xcsw
																										.equals(xcse)) {
																									if (!xcsw.equals(
																											xn)) {
																										if (!n.equals(
																												n2xn)) {
																											if (!n.equals(
																													xn)) {
																												if (!n.equals(
																														xcsw)) {
																													if (!n.equals(
																															xcse)) {
																														if (!cr.equals(
																																n2xn)) {
																															if (!cr.equals(
																																	cr2xcse)) {
																																if (!cr.equals(
																																		xn)) {
																																	if (!cr.equals(
																																			xcsw)) {
																																		if (!cr.equals(
																																				n)) {
																																			if (!cr.equals(
																																					xcse)) {
																																				if (!xcse
																																						.equals(xn)) {
																																					if (!xcse
																																							.equals(xcsw)) {
																																						return new Object[] {
																																								ruleresult,
																																								n2xn,
																																								cr2xcse,
																																								cl,
																																								cl2xcsw,
																																								xn,
																																								xcsw,
																																								n,
																																								cr,
																																								xcse };
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
			PerformRuleResult ruleresult, EObject cr2xcse, EObject cl, EObject cl2xcsw, EObject xn, EObject xcsw,
			EObject n, EObject cr, EObject xcse) {
		EMoflonEdge cl2xcsw__cl____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cr____r = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__cr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__cl____l = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cl2xcsw__xcsw____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cr2xcse__xcse____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "rightleft2eastwest";
		String cl2xcsw__cl____source_name_prime = "source";
		String xn__xcsw____sw_name_prime = "sw";
		String n__cr____r_name_prime = "r";
		String cr2xcse__cr____source_name_prime = "source";
		String xn__xcse____se_name_prime = "se";
		String xcsw__xcse____e_name_prime = "e";
		String n__cl____l_name_prime = "l";
		String xcse__xcsw____w_name_prime = "w";
		String cl2xcsw__xcsw____target_name_prime = "target";
		String cr2xcse__xcse____target_name_prime = "target";
		cl2xcsw__cl____source.setSrc(cl2xcsw);
		cl2xcsw__cl____source.setTrg(cl);
		ruleresult.getCreatedEdges().add(cl2xcsw__cl____source);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		ruleresult.getTranslatedEdges().add(xn__xcsw____sw);
		n__cr____r.setSrc(n);
		n__cr____r.setTrg(cr);
		ruleresult.getCreatedEdges().add(n__cr____r);
		cr2xcse__cr____source.setSrc(cr2xcse);
		cr2xcse__cr____source.setTrg(cr);
		ruleresult.getCreatedEdges().add(cr2xcse__cr____source);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		ruleresult.getTranslatedEdges().add(xn__xcse____se);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		ruleresult.getTranslatedEdges().add(xcsw__xcse____e);
		n__cl____l.setSrc(n);
		n__cl____l.setTrg(cl);
		ruleresult.getCreatedEdges().add(n__cl____l);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		ruleresult.getTranslatedEdges().add(xcse__xcsw____w);
		cl2xcsw__xcsw____target.setSrc(cl2xcsw);
		cl2xcsw__xcsw____target.setTrg(xcsw);
		ruleresult.getCreatedEdges().add(cl2xcsw__xcsw____target);
		cr2xcse__xcse____target.setSrc(cr2xcse);
		cr2xcse__xcse____target.setTrg(xcse);
		ruleresult.getCreatedEdges().add(cr2xcse__xcse____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cl2xcsw__cl____source.setName(cl2xcsw__cl____source_name_prime);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		n__cr____r.setName(n__cr____r_name_prime);
		cr2xcse__cr____source.setName(cr2xcse__cr____source_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		n__cl____l.setName(n__cl____l_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		cl2xcsw__xcsw____target.setName(cl2xcsw__xcsw____target_name_prime);
		cr2xcse__xcse____target.setName(cr2xcse__xcse____target_name_prime);
		return new Object[] { ruleresult, cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse, cl2xcsw__cl____source,
				xn__xcsw____sw, n__cr____r, cr2xcse__cr____source, xn__xcse____se, xcsw__xcse____e, n__cl____l,
				xcse__xcsw____w, cl2xcsw__xcsw____target, cr2xcse__xcse____target };
	}

	public static final void pattern_rightleft2eastwest_11_5_registerobjects_expressionBBBBBBBBBBB(
			rightleft2eastwest _this, PerformRuleResult ruleresult, EObject n2xn, EObject cr2xcse, EObject cl,
			EObject cl2xcsw, EObject xn, EObject xcsw, EObject n, EObject cr, EObject xcse) {
		_this.registerObjects_BWD(ruleresult, n2xn, cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse);

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
		EObject _localVariable_0 = match.getObject("xn");
		EObject _localVariable_1 = match.getObject("xcsw");
		EObject _localVariable_2 = match.getObject("xcse");
		EObject tmpXn = _localVariable_0;
		EObject tmpXcsw = _localVariable_1;
		EObject tmpXcse = _localVariable_2;
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			if (tmpXcsw instanceof XBTNode) {
				XBTNode xcsw = (XBTNode) tmpXcsw;
				if (tmpXcse instanceof XBTNode) {
					XBTNode xcse = (XBTNode) tmpXcse;
					return new Object[] { xn, xcsw, xcse, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_12_2_corematch_blackFBBFBB(XBTNode xn,
			XBTNode xcsw, XBTNode xcse, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
							BTNode2XBTnode.class, "target")) {
						BTNode n = n2xn.getSource();
						if (n != null) {
							_result.add(new Object[] { n2xn, xn, xcsw, n, xcse, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_12_3_findcontext_blackBBBBB(BTNode2XBTnode n2xn,
			XBTNode xn, XBTNode xcsw, BTNode n, XBTNode xcse) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					if (xcsw.equals(xn.getSw())) {
						if (xn.equals(n2xn.getTarget())) {
							if (n.equals(n2xn.getSource())) {
								if (xcse.equals(xn.getSe())) {
									if (xcse.equals(xcsw.getE())) {
										if (xcsw.equals(xcse.getW())) {
											_result.add(new Object[] { n2xn, xn, xcsw, n, xcse });
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

	public static final Object[] pattern_rightleft2eastwest_12_3_findcontext_greenBBBBBFFFFFFF(BTNode2XBTnode n2xn,
			XBTNode xn, XBTNode xcsw, BTNode n, XBTNode xcse) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xn__xcsw____sw = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__xn____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2xn__n____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xn__xcse____se = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcsw__xcse____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xcse__xcsw____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xn__xcsw____sw_name_prime = "sw";
		String n2xn__xn____target_name_prime = "target";
		String n2xn__n____source_name_prime = "source";
		String xn__xcse____se_name_prime = "se";
		String xcsw__xcse____e_name_prime = "e";
		String xcse__xcsw____w_name_prime = "w";
		isApplicableMatch.getAllContextElements().add(n2xn);
		isApplicableMatch.getAllContextElements().add(xn);
		isApplicableMatch.getAllContextElements().add(xcsw);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(xcse);
		xn__xcsw____sw.setSrc(xn);
		xn__xcsw____sw.setTrg(xcsw);
		isApplicableMatch.getAllContextElements().add(xn__xcsw____sw);
		n2xn__xn____target.setSrc(n2xn);
		n2xn__xn____target.setTrg(xn);
		isApplicableMatch.getAllContextElements().add(n2xn__xn____target);
		n2xn__n____source.setSrc(n2xn);
		n2xn__n____source.setTrg(n);
		isApplicableMatch.getAllContextElements().add(n2xn__n____source);
		xn__xcse____se.setSrc(xn);
		xn__xcse____se.setTrg(xcse);
		isApplicableMatch.getAllContextElements().add(xn__xcse____se);
		xcsw__xcse____e.setSrc(xcsw);
		xcsw__xcse____e.setTrg(xcse);
		isApplicableMatch.getAllContextElements().add(xcsw__xcse____e);
		xcse__xcsw____w.setSrc(xcse);
		xcse__xcsw____w.setTrg(xcsw);
		isApplicableMatch.getAllContextElements().add(xcse__xcsw____w);
		xn__xcsw____sw.setName(xn__xcsw____sw_name_prime);
		n2xn__xn____target.setName(n2xn__xn____target_name_prime);
		n2xn__n____source.setName(n2xn__n____source_name_prime);
		xn__xcse____se.setName(xn__xcse____se_name_prime);
		xcsw__xcse____e.setName(xcsw__xcse____e_name_prime);
		xcse__xcsw____w.setName(xcse__xcsw____w_name_prime);
		return new Object[] { n2xn, xn, xcsw, n, xcse, isApplicableMatch, xn__xcsw____sw, n2xn__xn____target,
				n2xn__n____source, xn__xcse____se, xcsw__xcse____e, xcse__xcsw____w };
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_bindingFBBBBBBB(rightleft2eastwest _this,
			IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, XBTNode xn, XBTNode xcsw, BTNode n,
			XBTNode xcse) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, n2xn, xn, xcsw, n, xcse);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n2xn, xn, xcsw, n, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, XBTNode xn,
			XBTNode xcsw, BTNode n, XBTNode xcse) {
		Object[] result_pattern_rightleft2eastwest_12_4_solveCSP_binding = pattern_rightleft2eastwest_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, n2xn, xn, xcsw, n, xcse);
		if (result_pattern_rightleft2eastwest_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_12_4_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_12_4_solveCSP_black = pattern_rightleft2eastwest_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n2xn, xn, xcsw, n, xcse };
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

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_0BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					XBTNode __DEC_xcsw_w_865814 = xcsw.getW();
					if (__DEC_xcsw_w_865814 != null) {
						if (!xcsw.equals(__DEC_xcsw_w_865814)) {
							if (!xn.equals(__DEC_xcsw_w_865814)) {
								if (!xcse.equals(__DEC_xcsw_w_865814)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_1BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_w_415729 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "w")) {
						if (!xcsw.equals(__DEC_xcsw_w_415729)) {
							if (!xn.equals(__DEC_xcsw_w_415729)) {
								if (!xcse.equals(__DEC_xcsw_w_415729)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_2BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_se_470470 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "se")) {
						if (!xcsw.equals(__DEC_xcsw_se_470470)) {
							if (!xn.equals(__DEC_xcsw_se_470470)) {
								if (!xcse.equals(__DEC_xcsw_se_470470)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_3BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_e_266982 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "e")) {
						if (!xcsw.equals(__DEC_xcsw_e_266982)) {
							if (!xn.equals(__DEC_xcsw_e_266982)) {
								if (!xcse.equals(__DEC_xcsw_e_266982)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_4BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					XBTNode __DEC_xcse_e_758486 = xcse.getE();
					if (__DEC_xcse_e_758486 != null) {
						if (!xcse.equals(__DEC_xcse_e_758486)) {
							if (!xn.equals(__DEC_xcse_e_758486)) {
								if (!xcsw.equals(__DEC_xcse_e_758486)) {
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

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_5BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_w_45993 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "w")) {
						if (!xcse.equals(__DEC_xcse_w_45993)) {
							if (!xn.equals(__DEC_xcse_w_45993)) {
								if (!xcsw.equals(__DEC_xcse_w_45993)) {
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

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_6BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_sw_233463 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "sw")) {
						if (!xcse.equals(__DEC_xcse_sw_233463)) {
							if (!xn.equals(__DEC_xcse_sw_233463)) {
								if (!xcsw.equals(__DEC_xcse_sw_233463)) {
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

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_7BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_e_319318 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "e")) {
						if (!xcse.equals(__DEC_xcse_e_319318)) {
							if (!xn.equals(__DEC_xcse_e_319318)) {
								if (!xcsw.equals(__DEC_xcse_e_319318)) {
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

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_8BB(XBTNode xcsw,
			XBTNode xn) {
		if (xn.equals(xcsw.getW())) {
			return new Object[] { xcsw, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_9BB(XBTNode xcsw,
			XBTNode xcse) {
		if (xcse.equals(xcsw.getW())) {
			return new Object[] { xcsw, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_10BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getSe())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_11BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getE())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_12BB(XBTNode xcse,
			XBTNode xn) {
		if (xn.equals(xcse.getE())) {
			return new Object[] { xcse, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_13BB(XBTNode xn,
			XBTNode xcse) {
		if (xcse.equals(xn.getW())) {
			return new Object[] { xn, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_14BB(XBTNode xn,
			XBTNode xcse) {
		if (xcse.equals(xn.getSw())) {
			return new Object[] { xn, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_15BB(XBTNode xcsw,
			XBTNode xcse) {
		if (xcse.equals(xcsw.getSw())) {
			return new Object[] { xcsw, xcse };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_sw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXn = _edge_sw.getSrc();
		if (tmpXn instanceof XBTNode) {
			XBTNode xn = (XBTNode) tmpXn;
			EObject tmpXcsw = _edge_sw.getTrg();
			if (tmpXcsw instanceof XBTNode) {
				XBTNode xcsw = (XBTNode) tmpXcsw;
				if (!xcsw.equals(xn)) {
					if (xcsw.equals(xn.getSw())) {
						XBTNode xcse = xn.getSe();
						if (xcse != null) {
							if (!xcse.equals(xn)) {
								if (!xcse.equals(xcsw)) {
									if (xcse.equals(xcsw.getE())) {
										if (xcsw.equals(xcse.getW())) {
											if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_8BB(xcsw,
													xn) == null) {
												if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_10BB(
														xn, xcsw) == null) {
													if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_11BB(
															xn, xcsw) == null) {
														if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_0BBB(
																xcsw, xn, xcse) == null) {
															if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_1BBB(
																	xcsw, xn, xcse) == null) {
																if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_2BBB(
																		xcsw, xn, xcse) == null) {
																	if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_3BBB(
																			xcsw, xn, xcse) == null) {
																		if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_4BBB(
																				xcse, xn, xcsw) == null) {
																			if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_5BBB(
																					xcse, xn, xcsw) == null) {
																				if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_6BBB(
																						xcse, xn, xcsw) == null) {
																					if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_7BBB(
																							xcse, xn, xcsw) == null) {
																						if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_9BB(
																								xcsw, xcse) == null) {
																							if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_12BB(
																									xcse, xn) == null) {
																								if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_13BB(
																										xn,
																										xcse) == null) {
																									if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_14BB(
																											xn,
																											xcse) == null) {
																										if (pattern_rightleft2eastwest_20_2_testcorematchandDECs_black_nac_15BB(
																												xcsw,
																												xcse) == null) {
																											_result.add(
																													new Object[] {
																															xn,
																															xcsw,
																															xcse,
																															_edge_sw });
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
			rightleft2eastwest _this, Match match, XBTNode xn, XBTNode xcsw, XBTNode xcse) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, xn, xcsw, xcse);
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
			BTNode n, BTNode cr) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					for (BTNode __DEC_cl_r_970395 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cl, BTNode.class, "r")) {
						if (!cl.equals(__DEC_cl_r_970395)) {
							if (!n.equals(__DEC_cl_r_970395)) {
								if (!cr.equals(__DEC_cl_r_970395)) {
									return new Object[] { cl, n, cr };
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
					for (BTNode __DEC_cr_l_448952 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cr, BTNode.class, "l")) {
						if (!cr.equals(__DEC_cr_l_448952)) {
							if (!cl.equals(__DEC_cr_l_448952)) {
								if (!n.equals(__DEC_cr_l_448952)) {
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

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_3BB(BTNode n,
			BTNode cr) {
		if (cr.equals(n.getL())) {
			return new Object[] { n, cr };
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
							if (!cl.equals(n)) {
								if (!cl.equals(cr)) {
									if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_3BB(n,
											cr) == null) {
										if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_0BBB(cl, n,
												cr) == null) {
											if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_1BBB(cr,
													cl, n) == null) {
												if (pattern_rightleft2eastwest_21_2_testcorematchandDECs_black_nac_2BB(
														cl, cr) == null) {
													_result.add(new Object[] { cl, n, cr, _edge_r });
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

	public static final Object[] pattern_rightleft2eastwest_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_rightleft2eastwest_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			rightleft2eastwest _this, Match match, BTNode cl, BTNode n, BTNode cr) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cl, n, cr);
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
		EObject _localVariable_1 = targetMatch.getObject("xn");
		EObject _localVariable_2 = targetMatch.getObject("xcsw");
		EObject _localVariable_3 = sourceMatch.getObject("n");
		EObject _localVariable_4 = sourceMatch.getObject("cr");
		EObject _localVariable_5 = targetMatch.getObject("xcse");
		EObject tmpCl = _localVariable_0;
		EObject tmpXn = _localVariable_1;
		EObject tmpXcsw = _localVariable_2;
		EObject tmpN = _localVariable_3;
		EObject tmpCr = _localVariable_4;
		EObject tmpXcse = _localVariable_5;
		if (tmpCl instanceof BTNode) {
			BTNode cl = (BTNode) tmpCl;
			if (tmpXn instanceof XBTNode) {
				XBTNode xn = (XBTNode) tmpXn;
				if (tmpXcsw instanceof XBTNode) {
					XBTNode xcsw = (XBTNode) tmpXcsw;
					if (tmpN instanceof BTNode) {
						BTNode n = (BTNode) tmpN;
						if (tmpCr instanceof BTNode) {
							BTNode cr = (BTNode) tmpCr;
							if (tmpXcse instanceof XBTNode) {
								XBTNode xcse = (XBTNode) tmpXcse;
								return new Object[] { cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_2_matchsrctrgcontext_blackBBBBBBBB(BTNode cl, XBTNode xn,
			XBTNode xcsw, BTNode n, BTNode cr, XBTNode xcse, Match sourceMatch, Match targetMatch) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!xcsw.equals(xn)) {
					if (!cr.equals(n)) {
						if (!xcse.equals(xn)) {
							if (!xcse.equals(xcsw)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch };
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
			XBTNode xn = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[1];
			XBTNode xcsw = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[2];
			BTNode n = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[3];
			BTNode cr = (BTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[4];
			XBTNode xcse = (XBTNode) result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_black = pattern_rightleft2eastwest_24_2_matchsrctrgcontext_blackBBBBBBBB(
					cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch);
			if (result_pattern_rightleft2eastwest_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_bindingFBBBBBBBBB(rightleft2eastwest _this,
			BTNode cl, XBTNode xn, XBTNode xcsw, BTNode n, BTNode cr, XBTNode xcse, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			rightleft2eastwest _this, BTNode cl, XBTNode xn, XBTNode xcsw, BTNode n, BTNode cr, XBTNode xcse,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_rightleft2eastwest_24_3_solvecsp_binding = pattern_rightleft2eastwest_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch);
		if (result_pattern_rightleft2eastwest_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_24_3_solvecsp_binding[0];

			Object[] result_pattern_rightleft2eastwest_24_3_solvecsp_black = pattern_rightleft2eastwest_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cl, xn, xcsw, n, cr, xcse, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_rightleft2eastwest_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_rightleft2eastwest_24_5_matchcorrcontext_blackFBBBB(XBTNode xn,
			BTNode n, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (BTNode2XBTnode n2xn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(xn,
					BTNode2XBTnode.class, "target")) {
				if (n.equals(n2xn.getSource())) {
					_result.add(new Object[] { n2xn, xn, n, sourceMatch, targetMatch });
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

	public static final Object[] pattern_rightleft2eastwest_24_6_createcorrespondence_blackBBBBBBB(BTNode cl,
			XBTNode xn, XBTNode xcsw, BTNode n, BTNode cr, XBTNode xcse, CCMatch ccMatch) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!xcsw.equals(xn)) {
					if (!cr.equals(n)) {
						if (!xcse.equals(xn)) {
							if (!xcse.equals(xcsw)) {
								return new Object[] { cl, xn, xcsw, n, cr, xcse, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_24_6_createcorrespondence_greenFBFBBBB(BTNode cl,
			XBTNode xcsw, BTNode cr, XBTNode xcse, CCMatch ccMatch) {
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		cr2xcse.setSource(cr);
		cr2xcse.setTarget(xcse);
		ccMatch.getCreateCorr().add(cr2xcse);
		cl2xcsw.setSource(cl);
		cl2xcsw.setTarget(xcsw);
		ccMatch.getCreateCorr().add(cl2xcsw);
		return new Object[] { cr2xcse, cl, cl2xcsw, xcsw, cr, xcse, ccMatch };
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

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_0BBB(BTNode cl, BTNode n,
			BTNode cr) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					for (BTNode __DEC_cl_r_44879 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cl, BTNode.class, "r")) {
						if (!cl.equals(__DEC_cl_r_44879)) {
							if (!n.equals(__DEC_cl_r_44879)) {
								if (!cr.equals(__DEC_cl_r_44879)) {
									return new Object[] { cl, n, cr };
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
					for (BTNode __DEC_cr_l_561608 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cr, BTNode.class, "l")) {
						if (!cr.equals(__DEC_cr_l_561608)) {
							if (!cl.equals(__DEC_cr_l_561608)) {
								if (!n.equals(__DEC_cr_l_561608)) {
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

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_3BB(BTNode n, BTNode cr) {
		if (cr.equals(n.getL())) {
			return new Object[] { n, cr };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_27_1_matchtggpattern_blackBBB(BTNode cl, BTNode n,
			BTNode cr) {
		if (!cl.equals(n)) {
			if (!cl.equals(cr)) {
				if (!cr.equals(n)) {
					if (cr.equals(n.getR())) {
						if (cl.equals(n.getL())) {
							if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_0BBB(cl, n, cr) == null) {
								if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_1BBB(cr, cl, n) == null) {
									if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_2BB(cl, cr) == null) {
										if (pattern_rightleft2eastwest_27_1_matchtggpattern_black_nac_3BB(n,
												cr) == null) {
											return new Object[] { cl, n, cr };
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

	public static final boolean pattern_rightleft2eastwest_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_rightleft2eastwest_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_0BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					XBTNode __DEC_xcsw_w_591750 = xcsw.getW();
					if (__DEC_xcsw_w_591750 != null) {
						if (!xcsw.equals(__DEC_xcsw_w_591750)) {
							if (!xn.equals(__DEC_xcsw_w_591750)) {
								if (!xcse.equals(__DEC_xcsw_w_591750)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_1BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_w_584459 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "w")) {
						if (!xcsw.equals(__DEC_xcsw_w_584459)) {
							if (!xn.equals(__DEC_xcsw_w_584459)) {
								if (!xcse.equals(__DEC_xcsw_w_584459)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_2BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_se_767953 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "se")) {
						if (!xcsw.equals(__DEC_xcsw_se_767953)) {
							if (!xn.equals(__DEC_xcsw_se_767953)) {
								if (!xcse.equals(__DEC_xcsw_se_767953)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_3BBB(XBTNode xcsw,
			XBTNode xn, XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcse.equals(xn)) {
					for (XBTNode __DEC_xcsw_e_113335 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcsw, XBTNode.class, "e")) {
						if (!xcsw.equals(__DEC_xcsw_e_113335)) {
							if (!xn.equals(__DEC_xcsw_e_113335)) {
								if (!xcse.equals(__DEC_xcsw_e_113335)) {
									return new Object[] { xcsw, xn, xcse };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_4BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					XBTNode __DEC_xcse_e_400283 = xcse.getE();
					if (__DEC_xcse_e_400283 != null) {
						if (!xcse.equals(__DEC_xcse_e_400283)) {
							if (!xn.equals(__DEC_xcse_e_400283)) {
								if (!xcsw.equals(__DEC_xcse_e_400283)) {
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

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_5BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_w_431528 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "w")) {
						if (!xcse.equals(__DEC_xcse_w_431528)) {
							if (!xn.equals(__DEC_xcse_w_431528)) {
								if (!xcsw.equals(__DEC_xcse_w_431528)) {
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

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_6BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_sw_79657 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "sw")) {
						if (!xcse.equals(__DEC_xcse_sw_79657)) {
							if (!xn.equals(__DEC_xcse_sw_79657)) {
								if (!xcsw.equals(__DEC_xcse_sw_79657)) {
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

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_7BBB(XBTNode xcse,
			XBTNode xn, XBTNode xcsw) {
		if (!xcse.equals(xn)) {
			if (!xcse.equals(xcsw)) {
				if (!xcsw.equals(xn)) {
					for (XBTNode __DEC_xcse_e_921691 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xcse, XBTNode.class, "e")) {
						if (!xcse.equals(__DEC_xcse_e_921691)) {
							if (!xn.equals(__DEC_xcse_e_921691)) {
								if (!xcsw.equals(__DEC_xcse_e_921691)) {
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

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_8BB(XBTNode xcsw,
			XBTNode xn) {
		if (xn.equals(xcsw.getW())) {
			return new Object[] { xcsw, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_9BB(XBTNode xcsw,
			XBTNode xcse) {
		if (xcse.equals(xcsw.getW())) {
			return new Object[] { xcsw, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_10BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getSe())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_11BB(XBTNode xn,
			XBTNode xcsw) {
		if (xcsw.equals(xn.getE())) {
			return new Object[] { xn, xcsw };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_12BB(XBTNode xcse,
			XBTNode xn) {
		if (xn.equals(xcse.getE())) {
			return new Object[] { xcse, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_13BB(XBTNode xn,
			XBTNode xcse) {
		if (xcse.equals(xn.getW())) {
			return new Object[] { xn, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_14BB(XBTNode xn,
			XBTNode xcse) {
		if (xcse.equals(xn.getSw())) {
			return new Object[] { xn, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_15BB(XBTNode xcsw,
			XBTNode xcse) {
		if (xcse.equals(xcsw.getSw())) {
			return new Object[] { xcsw, xcse };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_28_1_matchtggpattern_blackBBB(XBTNode xn, XBTNode xcsw,
			XBTNode xcse) {
		if (!xcsw.equals(xn)) {
			if (!xcse.equals(xn)) {
				if (!xcse.equals(xcsw)) {
					if (xcsw.equals(xn.getSw())) {
						if (xcse.equals(xn.getSe())) {
							if (xcse.equals(xcsw.getE())) {
								if (xcsw.equals(xcse.getW())) {
									if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_0BBB(xcsw, xn,
											xcse) == null) {
										if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_1BBB(xcsw, xn,
												xcse) == null) {
											if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_2BBB(xcsw, xn,
													xcse) == null) {
												if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_3BBB(xcsw,
														xn, xcse) == null) {
													if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_4BBB(
															xcse, xn, xcsw) == null) {
														if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_5BBB(
																xcse, xn, xcsw) == null) {
															if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_6BBB(
																	xcse, xn, xcsw) == null) {
																if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_7BBB(
																		xcse, xn, xcsw) == null) {
																	if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_8BB(
																			xcsw, xn) == null) {
																		if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_9BB(
																				xcsw, xcse) == null) {
																			if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_10BB(
																					xn, xcsw) == null) {
																				if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_11BB(
																						xn, xcsw) == null) {
																					if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_12BB(
																							xcse, xn) == null) {
																						if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_13BB(
																								xn, xcse) == null) {
																							if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_14BB(
																									xn, xcse) == null) {
																								if (pattern_rightleft2eastwest_28_1_matchtggpattern_black_nac_15BB(
																										xcsw,
																										xcse) == null) {
																									return new Object[] {
																											xn, xcsw,
																											xcse };
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
			ModelgeneratorRuleResult ruleResult, BTNode2XBTnode n2xn) {
		if (ruleResult.getCorrObjects().contains(n2xn)) {
			return new Object[] { ruleResult, n2xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, XBTNode xn) {
		if (ruleResult.getTargetObjects().contains(xn)) {
			return new Object[] { ruleResult, xn };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, BTNode n) {
		if (ruleResult.getSourceObjects().contains(n)) {
			return new Object[] { ruleResult, n };
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
					XBTNode xn = n2xn.getTarget();
					if (xn != null) {
						BTNode n = n2xn.getSource();
						if (n != null) {
							if (pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									n2xn) == null) {
								if (pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										xn) == null) {
									if (pattern_rightleft2eastwest_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											n) == null) {
										_result.add(
												new Object[] { n2xnList, n2xn, xn, n, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, XBTNode xn, BTNode n,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n2xn, xn, n, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n2xn, xn, n, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_rightleft2eastwest_29_3_solveCSP_bindingAndBlackFBBBBBB(
			rightleft2eastwest _this, IsApplicableMatch isApplicableMatch, BTNode2XBTnode n2xn, XBTNode xn, BTNode n,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_rightleft2eastwest_29_3_solveCSP_binding = pattern_rightleft2eastwest_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n2xn, xn, n, ruleResult);
		if (result_pattern_rightleft2eastwest_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_rightleft2eastwest_29_3_solveCSP_binding[0];

			Object[] result_pattern_rightleft2eastwest_29_3_solveCSP_black = pattern_rightleft2eastwest_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_rightleft2eastwest_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n2xn, xn, n, ruleResult };
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

	public static final Object[] pattern_rightleft2eastwest_29_5_checknacs_blackBBB(BTNode2XBTnode n2xn, XBTNode xn,
			BTNode n) {
		return new Object[] { n2xn, xn, n };
	}

	public static final Object[] pattern_rightleft2eastwest_29_6_perform_blackBBBB(BTNode2XBTnode n2xn, XBTNode xn,
			BTNode n, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n2xn, xn, n, ruleResult };
	}

	public static final Object[] pattern_rightleft2eastwest_29_6_perform_greenFFFBFBFFB(XBTNode xn, BTNode n,
			ModelgeneratorRuleResult ruleResult) {
		BTNode2XBTnode cr2xcse = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		BTNode cl = BtreeFactory.eINSTANCE.createBTNode();
		BTNode2XBTnode cl2xcsw = Btree2xbtreeFactory.eINSTANCE.createBTNode2XBTnode();
		XBTNode xcsw = XbtreeFactory.eINSTANCE.createXBTNode();
		BTNode cr = BtreeFactory.eINSTANCE.createBTNode();
		XBTNode xcse = XbtreeFactory.eINSTANCE.createXBTNode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(cr2xcse);
		n.setL(cl);
		ruleResult.getSourceObjects().add(cl);
		cl2xcsw.setSource(cl);
		ruleResult.getCorrObjects().add(cl2xcsw);
		xn.setSw(xcsw);
		cl2xcsw.setTarget(xcsw);
		ruleResult.getTargetObjects().add(xcsw);
		n.setR(cr);
		cr2xcse.setSource(cr);
		ruleResult.getSourceObjects().add(cr);
		xn.setSe(xcse);
		xcsw.setE(xcse);
		xcse.setW(xcsw);
		cr2xcse.setTarget(xcse);
		ruleResult.getTargetObjects().add(xcse);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cr2xcse, cl, cl2xcsw, xn, xcsw, n, cr, xcse, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_rightleft2eastwest_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //rightleft2eastwestImpl
