/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
import controlflow.ControlflowFactory;
import controlflow.Graph;

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

import org.wbsilva.bx.sourcecode2controlflow.P2G;

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;
import org.wbsilva.bx.sourcecode2controlflow.Rules.firstdecision2firstbranch;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

import sourcecode.Decision;
import sourcecode.Program;
import sourcecode.SourcecodeFactory;
import sourcecode.While;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.wbsilva.bx.sourcecode2controlflow.csp.constraints.*;
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
 * An implementation of the model object '<em><b>firstdecision2firstbranch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class firstdecision2firstbranchImpl extends AbstractRuleImpl implements firstdecision2firstbranch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected firstdecision2firstbranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getfirstdecision2firstbranch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Program p, Decision d) {

		Object[] result1_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_0_1_initialbindings_blackBBBB(this, match, p, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, p, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_0_4_collectelementstobetranslated_blackBBB(match, p, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[d] = " + d + ".");
			}
			firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_0_4_collectelementstobetranslated_greenBBBF(match, p, d);
			//nothing EMoflonEdge p__d____first = (EMoflonEdge) result4_green[3];

			Object[] result5_black = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_0_5_collectcontextelements_blackBBB(match, p, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[d] = " + d + ".");
			}
			firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_0_5_collectcontextelements_greenBB(match,
					p);

			// 
			firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_0_6_registerobjectstomatch_expressionBBBB(this, match, p, d);
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_0_7_expressionF();
		} else {
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Program p = (Program) result1_bindingAndBlack[0];
		P2G p2g = (P2G) result1_bindingAndBlack[1];
		Graph g = (Graph) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_1_1_performtransformation_greenFFBB(g, d);
		S2B f2r = (S2B) result1_green[0];
		Branch b = (Branch) result1_green[1];

		Object[] result2_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_1_2_collecttranslatedelements_blackBBB(f2r, b, d);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[f2r] = " + f2r + ", " + "[b] = "
					+ b + ", " + "[d] = " + d + ".");
		}
		Object[] result2_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_1_2_collecttranslatedelements_greenFBBB(f2r, b, d);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, p, p2g, f2r, b, g,
						d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[p2g] = " + p2g + ", " + "[f2r] = " + f2r + ", " + "[b] = " + b
					+ ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
		}
		firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, p, f2r, b, g, d);
		//nothing EMoflonEdge p__d____first = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge f2r__d____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, p, p2g, f2r, b, g, d);
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Program p = (Program) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		for (Object[] result2_black : firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_2_2_corematch_blackBFFBB(p, d, match)) {
			P2G p2g = (P2G) result2_black[1];
			Graph g = (Graph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_2_3_findcontext_blackBBBB(p, p2g, g, d)) {
				Object[] result3_green = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_2_3_findcontext_greenBBBBFFFF(p, p2g, g, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge p__d____first = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								p, p2g, g, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[p2g] = "
							+ p2g + ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = firstdecision2firstbranchImpl
							.pattern_firstdecision2firstbranch_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Program p, Decision d) {
		match.registerObject("p", p);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Program p, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject p, EObject p2g, EObject f2r, EObject b,
			EObject g, EObject d) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch b, Graph g) {

		Object[] result1_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_10_1_initialbindings_blackBBBB(this, match, b, g);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[g] = " + g + ".");
		}

		Object[] result2_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, b, g);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[g] = " + g + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_10_4_collectelementstobetranslated_blackBBB(match, b, g);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[g] = " + g + ".");
			}
			firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_10_4_collectelementstobetranslated_greenBBBF(match, b, g);
			//nothing EMoflonEdge g__b____root = (EMoflonEdge) result4_green[3];

			Object[] result5_black = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_10_5_collectcontextelements_blackBBB(match, b, g);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[g] = " + g + ".");
			}
			firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_10_5_collectcontextelements_greenBB(match,
					g);

			// 
			firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_10_6_registerobjectstomatch_expressionBBBB(this, match, b, g);
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_10_7_expressionF();
		} else {
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Program p = (Program) result1_bindingAndBlack[0];
		P2G p2g = (P2G) result1_bindingAndBlack[1];
		Branch b = (Branch) result1_bindingAndBlack[2];
		Graph g = (Graph) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_11_1_performtransformation_greenBFBF(p, b);
		S2B f2r = (S2B) result1_green[1];
		Decision d = (Decision) result1_green[3];

		Object[] result2_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_11_2_collecttranslatedelements_blackBBB(f2r, b, d);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[f2r] = " + f2r + ", " + "[b] = "
					+ b + ", " + "[d] = " + d + ".");
		}
		Object[] result2_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_11_2_collecttranslatedelements_greenFBBB(f2r, b, d);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, p, p2g, f2r, b, g,
						d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[p2g] = " + p2g + ", " + "[f2r] = " + f2r + ", " + "[b] = " + b
					+ ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
		}
		firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_11_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, p, f2r, b, g, d);
		//nothing EMoflonEdge p__d____first = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge f2r__d____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, p, p2g, f2r, b, g, d);
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch b = (Branch) result2_binding[0];
		Graph g = (Graph) result2_binding[1];
		for (Object[] result2_black : firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_12_2_corematch_blackFFBBB(b, g, match)) {
			Program p = (Program) result2_black[0];
			P2G p2g = (P2G) result2_black[1];
			// ForEach 
			for (Object[] result3_black : firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_12_3_findcontext_blackBBBB(p, p2g, b, g)) {
				Object[] result3_green = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_12_3_findcontext_greenBBBBFFFF(p, p2g, b, g);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								p, p2g, b, g);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[p2g] = "
							+ p2g + ", " + "[b] = " + b + ", " + "[g] = " + g + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = firstdecision2firstbranchImpl
							.pattern_firstdecision2firstbranch_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch b, Graph g) {
		match.registerObject("b", b);
		match.registerObject("g", g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch b, Graph g) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Branch b, Graph g) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("g", g);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject p, EObject p2g, EObject f2r, EObject b,
			EObject g, EObject d) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_11(EMoflonEdge _edge_root) {

		Object[] result1_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_blackFFB(_edge_root)) {
			Branch b = (Branch) result2_black[0];
			Graph g = (Graph) result2_black[1];
			Object[] result2_green = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, b, g)) {
				// 
				if (firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = firstdecision2firstbranchImpl
							.pattern_firstdecision2firstbranch_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_blackFFB(_edge_first)) {
			Program p = (Program) result2_black[0];
			Decision d = (Decision) result2_black[1];
			Object[] result2_green = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, p, d)) {
				// 
				if (firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = firstdecision2firstbranchImpl
							.pattern_firstdecision2firstbranch_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("firstdecision2firstbranch");
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
		ruleResult.setRule("firstdecision2firstbranch");
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

		Object[] result1_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Program p = (Program) result2_bindingAndBlack[0];
		Branch b = (Branch) result2_bindingAndBlack[1];
		Graph g = (Graph) result2_bindingAndBlack[2];
		Decision d = (Decision) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, p, b, g, d, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[p] = " + p + ", " + "[b] = " + b + ", " + "[g] = " + g + ", " + "[d] = " + d + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_24_5_matchcorrcontext_blackBFBBB(p, g, sourceMatch,
							targetMatch)) {
				P2G p2g = (P2G) result5_black[1];
				Object[] result5_green = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_24_5_matchcorrcontext_greenBBBF(p2g, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_24_6_createcorrespondence_blackBBBBB(p, b, g, d, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[b] = " + b + ", "
									+ "[g] = " + g + ", " + "[d] = " + d + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_24_6_createcorrespondence_greenFBBB(b,
						d, ccMatch);
				//nothing S2B f2r = (S2B) result6_green[0];

				Object[] result7_black = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Program p, Branch b, Graph g, Decision d, Match sourceMatch,
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
	public boolean checkDEC_FWD(Program p, Decision d) {// 
		Object[] result1_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_27_1_matchtggpattern_blackBB(p, d);
		if (result1_black != null) {
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_27_2_expressionF();
		} else {
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch b, Graph g) {// 
		Object[] result1_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_28_1_matchtggpattern_blackBB(b, g);
		if (result1_black != null) {
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_28_2_expressionF();
		} else {
			return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, P2G p2gParameter) {

		Object[] result1_black = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : firstdecision2firstbranchImpl
				.pattern_firstdecision2firstbranch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList p2gList = (RuleEntryList) result2_black[0];
			Program p = (Program) result2_black[1];
			P2G p2g = (P2G) result2_black[2];
			Graph g = (Graph) result2_black[3];

			Object[] result3_bindingAndBlack = firstdecision2firstbranchImpl
					.pattern_firstdecision2firstbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, p,
							p2g, g, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[p2g] = " + p2g
						+ ", " + "[g] = " + g + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = firstdecision2firstbranchImpl
						.pattern_firstdecision2firstbranch_29_5_checknacs_blackBBB(p, p2g, g);
				if (result5_black != null) {

					Object[] result6_black = firstdecision2firstbranchImpl
							.pattern_firstdecision2firstbranch_29_6_perform_blackBBBB(p, p2g, g, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", "
								+ "[p2g] = " + p2g + ", " + "[g] = " + g + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_29_6_perform_greenBFFBFB(p, g,
							ruleResult);
					//nothing S2B f2r = (S2B) result6_green[1];
					//nothing Branch b = (Branch) result6_green[2];
					//nothing Decision d = (Decision) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return firstdecision2firstbranchImpl.pattern_firstdecision2firstbranch_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("g", g);
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
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_FWD__MATCH_PROGRAM_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Program) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROGRAM_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Program) arguments.get(1),
					(Decision) arguments.get(2));
			return null;
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROGRAM_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Program) arguments.get(1),
					(Decision) arguments.get(2));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROGRAM_P2G_GRAPH_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1),
					(P2G) arguments.get(2), (Graph) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_BWD__MATCH_BRANCH_GRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Graph) arguments.get(2));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_GRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Graph) arguments.get(2));
			return null;
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_GRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Graph) arguments.get(2));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROGRAM_P2G_BRANCH_GRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1),
					(P2G) arguments.get(2), (Branch) arguments.get(3), (Graph) arguments.get(4));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__PROGRAM_BRANCH_GRAPH_DECISION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Program) arguments.get(0), (Branch) arguments.get(1),
					(Graph) arguments.get(2), (Decision) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___CHECK_DEC_FWD__PROGRAM_DECISION:
			return checkDEC_FWD((Program) arguments.get(0), (Decision) arguments.get(1));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___CHECK_DEC_BWD__BRANCH_GRAPH:
			return checkDEC_BWD((Branch) arguments.get(0), (Graph) arguments.get(1));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_P2G:
			return generateModel((RuleEntryContainer) arguments.get(0), (P2G) arguments.get(1));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROGRAM_P2G_GRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1),
					(P2G) arguments.get(2), (Graph) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_1_initialbindings_blackBBBB(
			firstdecision2firstbranch _this, Match match, Program p, Decision d) {
		return new Object[] { _this, match, p, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_2_SolveCSP_bindingFBBBB(
			firstdecision2firstbranch _this, Match match, Program p, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, p, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, d };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_2_SolveCSP_bindingAndBlackFBBBB(
			firstdecision2firstbranch _this, Match match, Program p, Decision d) {
		Object[] result_pattern_firstdecision2firstbranch_0_2_SolveCSP_binding = pattern_firstdecision2firstbranch_0_2_SolveCSP_bindingFBBBB(
				_this, match, p, d);
		if (result_pattern_firstdecision2firstbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstdecision2firstbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_0_2_SolveCSP_black = pattern_firstdecision2firstbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstdecision2firstbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p, d };
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_0_3_CheckCSP_expressionFBB(
			firstdecision2firstbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_4_collectelementstobetranslated_blackBBB(
			Match match, Program p, Decision d) {
		return new Object[] { match, p, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Program p, Decision d) {
		EMoflonEdge p__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(d);
		String p__d____first_name_prime = "first";
		p__d____first.setSrc(p);
		p__d____first.setTrg(d);
		match.getToBeTranslatedEdges().add(p__d____first);
		p__d____first.setName(p__d____first_name_prime);
		return new Object[] { match, p, d, p__d____first };
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_5_collectcontextelements_blackBBB(Match match,
			Program p, Decision d) {
		return new Object[] { match, p, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_0_5_collectcontextelements_greenBB(Match match,
			Program p) {
		match.getContextNodes().add(p);
		return new Object[] { match, p };
	}

	public static final void pattern_firstdecision2firstbranch_0_6_registerobjectstomatch_expressionBBBB(
			firstdecision2firstbranch _this, Match match, Program p, Decision d) {
		_this.registerObjectsToMatch_FWD(match, p, d);

	}

	public static final boolean pattern_firstdecision2firstbranch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstdecision2firstbranch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_2 = isApplicableMatch.getObject("g");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject tmpP = _localVariable_0;
		EObject tmpP2g = _localVariable_1;
		EObject tmpG = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpP2g instanceof P2G) {
				P2G p2g = (P2G) tmpP2g;
				if (tmpG instanceof Graph) {
					Graph g = (Graph) tmpG;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { p, p2g, g, d, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_1_performtransformation_blackBBBBFBB(Program p,
			P2G p2g, Graph g, Decision d, firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, p2g, g, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_1_performtransformation_bindingAndBlackFFFFFBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstdecision2firstbranch_1_1_performtransformation_binding = pattern_firstdecision2firstbranch_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_firstdecision2firstbranch_1_1_performtransformation_binding != null) {
			Program p = (Program) result_pattern_firstdecision2firstbranch_1_1_performtransformation_binding[0];
			P2G p2g = (P2G) result_pattern_firstdecision2firstbranch_1_1_performtransformation_binding[1];
			Graph g = (Graph) result_pattern_firstdecision2firstbranch_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_firstdecision2firstbranch_1_1_performtransformation_binding[3];

			Object[] result_pattern_firstdecision2firstbranch_1_1_performtransformation_black = pattern_firstdecision2firstbranch_1_1_performtransformation_blackBBBBFBB(
					p, p2g, g, d, _this, isApplicableMatch);
			if (result_pattern_firstdecision2firstbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstdecision2firstbranch_1_1_performtransformation_black[4];

				return new Object[] { p, p2g, g, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_1_performtransformation_greenFFBB(Graph g,
			Decision d) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		f2r.setSource(d);
		f2r.setTarget(b);
		g.setRoot(b);
		return new Object[] { f2r, b, g, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_2_collecttranslatedelements_blackBBB(S2B f2r,
			Branch b, Decision d) {
		return new Object[] { f2r, b, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_2_collecttranslatedelements_greenFBBB(S2B f2r,
			Branch b, Decision d) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(d);
		return new Object[] { ruleresult, f2r, b, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject p, EObject p2g, EObject f2r, EObject b, EObject g, EObject d) {
		if (!p.equals(p2g)) {
			if (!f2r.equals(p)) {
				if (!f2r.equals(p2g)) {
					if (!f2r.equals(g)) {
						if (!b.equals(p)) {
							if (!b.equals(p2g)) {
								if (!b.equals(f2r)) {
									if (!b.equals(g)) {
										if (!b.equals(d)) {
											if (!g.equals(p)) {
												if (!g.equals(p2g)) {
													if (!d.equals(p)) {
														if (!d.equals(p2g)) {
															if (!d.equals(f2r)) {
																if (!d.equals(g)) {
																	return new Object[] { ruleresult, p, p2g, f2r, b, g,
																			d };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstdecision2firstbranch_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject p, EObject f2r, EObject b, EObject g, EObject d) {
		EMoflonEdge p__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstdecision2firstbranch";
		String p__d____first_name_prime = "first";
		String f2r__b____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		String f2r__d____source_name_prime = "source";
		p__d____first.setSrc(p);
		p__d____first.setTrg(d);
		ruleresult.getTranslatedEdges().add(p__d____first);
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getCreatedEdges().add(g__b____root);
		f2r__d____source.setSrc(f2r);
		f2r__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(f2r__d____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		p__d____first.setName(p__d____first_name_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		f2r__d____source.setName(f2r__d____source_name_prime);
		return new Object[] { ruleresult, p, f2r, b, g, d, p__d____first, f2r__b____target, g__b____root,
				f2r__d____source };
	}

	public static final void pattern_firstdecision2firstbranch_1_5_registerobjects_expressionBBBBBBBB(
			firstdecision2firstbranch _this, PerformRuleResult ruleresult, EObject p, EObject p2g, EObject f2r,
			EObject b, EObject g, EObject d) {
		_this.registerObjects_FWD(ruleresult, p, p2g, f2r, b, g, d);

	}

	public static final PerformRuleResult pattern_firstdecision2firstbranch_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_1_preparereturnvalue_bindingFB(
			firstdecision2firstbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			firstdecision2firstbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_1_preparereturnvalue_bindingAndBlackFFB(
			firstdecision2firstbranch _this) {
		Object[] result_pattern_firstdecision2firstbranch_2_1_preparereturnvalue_binding = pattern_firstdecision2firstbranch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstdecision2firstbranch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstdecision2firstbranch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_2_1_preparereturnvalue_black = pattern_firstdecision2firstbranch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstdecision2firstbranch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstdecision2firstbranch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstdecision2firstbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("p");
		EObject _localVariable_1 = match.getObject("d");
		EObject tmpP = _localVariable_0;
		EObject tmpD = _localVariable_1;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				return new Object[] { p, d, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_2_2_corematch_blackBFFBB(Program p,
			Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
			Graph g = p2g.getTarget();
			if (g != null) {
				_result.add(new Object[] { p, p2g, g, d, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_2_3_findcontext_blackBBBB(Program p,
			P2G p2g, Graph g, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (d.equals(p.getFirst())) {
			if (p.equals(p2g.getSource())) {
				if (g.equals(p2g.getTarget())) {
					_result.add(new Object[] { p, p2g, g, d });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_3_findcontext_greenBBBBFFFF(Program p, P2G p2g,
			Graph g, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p__d____first_name_prime = "first";
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(d);
		p__d____first.setSrc(p);
		p__d____first.setTrg(d);
		isApplicableMatch.getAllContextElements().add(p__d____first);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		p__d____first.setName(p__d____first_name_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		return new Object[] { p, p2g, g, d, isApplicableMatch, p__d____first, p2g__p____source, p2g__g____target };
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_4_solveCSP_bindingFBBBBBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g,
			Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, p, p2g, g, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_4_solveCSP_bindingAndBlackFBBBBBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g,
			Decision d) {
		Object[] result_pattern_firstdecision2firstbranch_2_4_solveCSP_binding = pattern_firstdecision2firstbranch_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, p2g, g, d);
		if (result_pattern_firstdecision2firstbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstdecision2firstbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_2_4_solveCSP_black = pattern_firstdecision2firstbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstdecision2firstbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, d };
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_2_5_checkCSP_expressionFBB(
			firstdecision2firstbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstdecision2firstbranch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstdecision2firstbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstdecision2firstbranch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_1_initialbindings_blackBBBB(
			firstdecision2firstbranch _this, Match match, Branch b, Graph g) {
		return new Object[] { _this, match, b, g };
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_2_SolveCSP_bindingFBBBB(
			firstdecision2firstbranch _this, Match match, Branch b, Graph g) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, b, g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, g };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_2_SolveCSP_bindingAndBlackFBBBB(
			firstdecision2firstbranch _this, Match match, Branch b, Graph g) {
		Object[] result_pattern_firstdecision2firstbranch_10_2_SolveCSP_binding = pattern_firstdecision2firstbranch_10_2_SolveCSP_bindingFBBBB(
				_this, match, b, g);
		if (result_pattern_firstdecision2firstbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstdecision2firstbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_10_2_SolveCSP_black = pattern_firstdecision2firstbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstdecision2firstbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, g };
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_10_3_CheckCSP_expressionFBB(
			firstdecision2firstbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_4_collectelementstobetranslated_blackBBB(
			Match match, Branch b, Graph g) {
		return new Object[] { match, b, g };
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Branch b, Graph g) {
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		String g__b____root_name_prime = "root";
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		match.getToBeTranslatedEdges().add(g__b____root);
		g__b____root.setName(g__b____root_name_prime);
		return new Object[] { match, b, g, g__b____root };
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_5_collectcontextelements_blackBBB(Match match,
			Branch b, Graph g) {
		return new Object[] { match, b, g };
	}

	public static final Object[] pattern_firstdecision2firstbranch_10_5_collectcontextelements_greenBB(Match match,
			Graph g) {
		match.getContextNodes().add(g);
		return new Object[] { match, g };
	}

	public static final void pattern_firstdecision2firstbranch_10_6_registerobjectstomatch_expressionBBBB(
			firstdecision2firstbranch _this, Match match, Branch b, Graph g) {
		_this.registerObjectsToMatch_BWD(match, b, g);

	}

	public static final boolean pattern_firstdecision2firstbranch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstdecision2firstbranch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("g");
		EObject tmpP = _localVariable_0;
		EObject tmpP2g = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpG = _localVariable_3;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpP2g instanceof P2G) {
				P2G p2g = (P2G) tmpP2g;
				if (tmpB instanceof Branch) {
					Branch b = (Branch) tmpB;
					if (tmpG instanceof Graph) {
						Graph g = (Graph) tmpG;
						return new Object[] { p, p2g, b, g, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_1_performtransformation_blackBBBBFBB(Program p,
			P2G p2g, Branch b, Graph g, firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, p2g, b, g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_1_performtransformation_bindingAndBlackFFFFFBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstdecision2firstbranch_11_1_performtransformation_binding = pattern_firstdecision2firstbranch_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_firstdecision2firstbranch_11_1_performtransformation_binding != null) {
			Program p = (Program) result_pattern_firstdecision2firstbranch_11_1_performtransformation_binding[0];
			P2G p2g = (P2G) result_pattern_firstdecision2firstbranch_11_1_performtransformation_binding[1];
			Branch b = (Branch) result_pattern_firstdecision2firstbranch_11_1_performtransformation_binding[2];
			Graph g = (Graph) result_pattern_firstdecision2firstbranch_11_1_performtransformation_binding[3];

			Object[] result_pattern_firstdecision2firstbranch_11_1_performtransformation_black = pattern_firstdecision2firstbranch_11_1_performtransformation_blackBBBBFBB(
					p, p2g, b, g, _this, isApplicableMatch);
			if (result_pattern_firstdecision2firstbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstdecision2firstbranch_11_1_performtransformation_black[4];

				return new Object[] { p, p2g, b, g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_1_performtransformation_greenBFBF(Program p,
			Branch b) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision d = SourcecodeFactory.eINSTANCE.createDecision();
		f2r.setTarget(b);
		p.setFirst(d);
		f2r.setSource(d);
		return new Object[] { p, f2r, b, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_2_collecttranslatedelements_blackBBB(S2B f2r,
			Branch b, Decision d) {
		return new Object[] { f2r, b, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_2_collecttranslatedelements_greenFBBB(S2B f2r,
			Branch b, Decision d) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(d);
		return new Object[] { ruleresult, f2r, b, d };
	}

	public static final Object[] pattern_firstdecision2firstbranch_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject p, EObject p2g, EObject f2r, EObject b, EObject g, EObject d) {
		if (!p.equals(p2g)) {
			if (!f2r.equals(p)) {
				if (!f2r.equals(p2g)) {
					if (!f2r.equals(g)) {
						if (!b.equals(p)) {
							if (!b.equals(p2g)) {
								if (!b.equals(f2r)) {
									if (!b.equals(g)) {
										if (!b.equals(d)) {
											if (!g.equals(p)) {
												if (!g.equals(p2g)) {
													if (!d.equals(p)) {
														if (!d.equals(p2g)) {
															if (!d.equals(f2r)) {
																if (!d.equals(g)) {
																	return new Object[] { ruleresult, p, p2g, f2r, b, g,
																			d };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstdecision2firstbranch_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject p, EObject f2r, EObject b, EObject g, EObject d) {
		EMoflonEdge p__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstdecision2firstbranch";
		String p__d____first_name_prime = "first";
		String f2r__b____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		String f2r__d____source_name_prime = "source";
		p__d____first.setSrc(p);
		p__d____first.setTrg(d);
		ruleresult.getCreatedEdges().add(p__d____first);
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getTranslatedEdges().add(g__b____root);
		f2r__d____source.setSrc(f2r);
		f2r__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(f2r__d____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		p__d____first.setName(p__d____first_name_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		f2r__d____source.setName(f2r__d____source_name_prime);
		return new Object[] { ruleresult, p, f2r, b, g, d, p__d____first, f2r__b____target, g__b____root,
				f2r__d____source };
	}

	public static final void pattern_firstdecision2firstbranch_11_5_registerobjects_expressionBBBBBBBB(
			firstdecision2firstbranch _this, PerformRuleResult ruleresult, EObject p, EObject p2g, EObject f2r,
			EObject b, EObject g, EObject d) {
		_this.registerObjects_BWD(ruleresult, p, p2g, f2r, b, g, d);

	}

	public static final PerformRuleResult pattern_firstdecision2firstbranch_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_1_preparereturnvalue_bindingFB(
			firstdecision2firstbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			firstdecision2firstbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_1_preparereturnvalue_bindingAndBlackFFB(
			firstdecision2firstbranch _this) {
		Object[] result_pattern_firstdecision2firstbranch_12_1_preparereturnvalue_binding = pattern_firstdecision2firstbranch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstdecision2firstbranch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstdecision2firstbranch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_12_1_preparereturnvalue_black = pattern_firstdecision2firstbranch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstdecision2firstbranch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstdecision2firstbranch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstdecision2firstbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("g");
		EObject tmpB = _localVariable_0;
		EObject tmpG = _localVariable_1;
		if (tmpB instanceof Branch) {
			Branch b = (Branch) tmpB;
			if (tmpG instanceof Graph) {
				Graph g = (Graph) tmpG;
				return new Object[] { b, g, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_12_2_corematch_blackFFBBB(Branch b,
			Graph g, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
			Program p = p2g.getSource();
			if (p != null) {
				_result.add(new Object[] { p, p2g, b, g, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_12_3_findcontext_blackBBBB(Program p,
			P2G p2g, Branch b, Graph g) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (p.equals(p2g.getSource())) {
			if (g.equals(p2g.getTarget())) {
				if (b.equals(g.getRoot())) {
					_result.add(new Object[] { p, p2g, b, g });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_3_findcontext_greenBBBBFFFF(Program p, P2G p2g,
			Branch b, Graph g) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(g);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		isApplicableMatch.getAllContextElements().add(g__b____root);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		return new Object[] { p, p2g, b, g, isApplicableMatch, p2g__p____source, p2g__g____target, g__b____root };
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_4_solveCSP_bindingFBBBBBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Branch b,
			Graph g) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, p, p2g, b, g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, p2g, b, g };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_4_solveCSP_bindingAndBlackFBBBBBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Branch b,
			Graph g) {
		Object[] result_pattern_firstdecision2firstbranch_12_4_solveCSP_binding = pattern_firstdecision2firstbranch_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, p2g, b, g);
		if (result_pattern_firstdecision2firstbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstdecision2firstbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_12_4_solveCSP_black = pattern_firstdecision2firstbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstdecision2firstbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, p2g, b, g };
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_12_5_checkCSP_expressionFBB(
			firstdecision2firstbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstdecision2firstbranch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstdecision2firstbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstdecision2firstbranch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_1_preparereturnvalue_bindingFB(
			firstdecision2firstbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstdecision2firstbranch _this) {
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

	public static final Object[] pattern_firstdecision2firstbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			firstdecision2firstbranch _this) {
		Object[] result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_binding = pattern_firstdecision2firstbranch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_black = pattern_firstdecision2firstbranch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstdecision2firstbranch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_black_nac_0BB(Branch b,
			Graph g) {
		for (Graph __DEC_b_root_550848 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_550848)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_black_nac_1B(Branch b) {
		for (Branch __DEC_b_positive_638500 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_638500)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_black_nac_2B(Branch b) {
		for (Branch __DEC_b_negative_185189 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_185189)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_root) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpG = _edge_root.getSrc();
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			EObject tmpB = _edge_root.getTrg();
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (b.equals(g.getRoot())) {
					if (pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_black_nac_0BB(b, g) == null) {
						if (pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_black_nac_1B(b) == null) {
							if (pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_black_nac_2B(b) == null) {
								_result.add(new Object[] { b, g, _edge_root });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstdecision2firstbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			firstdecision2firstbranch _this, Match match, Branch b, Graph g) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, b, g);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstdecision2firstbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstdecision2firstbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstdecision2firstbranch_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_1_preparereturnvalue_bindingFB(
			firstdecision2firstbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstdecision2firstbranch _this) {
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

	public static final Object[] pattern_firstdecision2firstbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			firstdecision2firstbranch _this) {
		Object[] result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_binding = pattern_firstdecision2firstbranch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_black = pattern_firstdecision2firstbranch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstdecision2firstbranch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_0B(Decision d) {
		for (Decision __DEC_d_positive_733834 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_d_positive_733834)) {
				return new Object[] { d };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_1B(Decision d) {
		for (Decision __DEC_d_negative_50737 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_d_negative_50737)) {
				return new Object[] { d };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_2B(Decision d) {
		for (While __DEC_d_first_453129 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				While.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_3B(Decision d) {
		for (While __DEC_d_last_783410 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				While.class, "last")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpP = _edge_first.getSrc();
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			EObject tmpD = _edge_first.getTrg();
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (d.equals(p.getFirst())) {
					if (pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_0B(d) == null) {
						if (pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_1B(d) == null) {
							if (pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_2B(d) == null) {
								if (pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_black_nac_3B(
										d) == null) {
									_result.add(new Object[] { p, d, _edge_first });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstdecision2firstbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			firstdecision2firstbranch _this, Match match, Program p, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, p, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstdecision2firstbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstdecision2firstbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstdecision2firstbranch_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_1_prepare_blackB(
			firstdecision2firstbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("p");
		EObject _localVariable_1 = targetMatch.getObject("b");
		EObject _localVariable_2 = targetMatch.getObject("g");
		EObject _localVariable_3 = sourceMatch.getObject("d");
		EObject tmpP = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpG = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (tmpG instanceof Graph) {
					Graph g = (Graph) tmpG;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { p, b, g, d, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_blackBBBBBB(Program p,
			Branch b, Graph g, Decision d, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { p, b, g, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_binding = pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_binding != null) {
			Program p = (Program) result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_binding[0];
			Branch b = (Branch) result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_binding[1];
			Graph g = (Graph) result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_binding[2];
			Decision d = (Decision) result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_black = pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_blackBBBBBB(
					p, b, g, d, sourceMatch, targetMatch);
			if (result_pattern_firstdecision2firstbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { p, b, g, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_3_solvecsp_bindingFBBBBBBB(
			firstdecision2firstbranch _this, Program p, Branch b, Graph g, Decision d, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(p, b, g, d, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, p, b, g, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			firstdecision2firstbranch _this, Program p, Branch b, Graph g, Decision d, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_firstdecision2firstbranch_24_3_solvecsp_binding = pattern_firstdecision2firstbranch_24_3_solvecsp_bindingFBBBBBBB(
				_this, p, b, g, d, sourceMatch, targetMatch);
		if (result_pattern_firstdecision2firstbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_firstdecision2firstbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_24_3_solvecsp_black = pattern_firstdecision2firstbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_firstdecision2firstbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, p, b, g, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_24_5_matchcorrcontext_blackBFBBB(Program p,
			Graph g, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
				if (g.equals(p2g.getTarget())) {
					_result.add(new Object[] { p, p2g, g, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_5_matchcorrcontext_greenBBBF(P2G p2g,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "firstdecision2firstbranch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(p2g);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { p2g, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_6_createcorrespondence_blackBBBBB(Program p,
			Branch b, Graph g, Decision d, CCMatch ccMatch) {
		return new Object[] { p, b, g, d, ccMatch };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_6_createcorrespondence_greenFBBB(Branch b,
			Decision d, CCMatch ccMatch) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		f2r.setTarget(b);
		f2r.setSource(d);
		ccMatch.getCreateCorr().add(f2r);
		return new Object[] { f2r, b, d, ccMatch };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_firstdecision2firstbranch_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "firstdecision2firstbranch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_firstdecision2firstbranch_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_0B(Decision d) {
		for (Decision __DEC_d_positive_427797 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_d_positive_427797)) {
				return new Object[] { d };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_1B(Decision d) {
		for (Decision __DEC_d_negative_481221 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_d_negative_481221)) {
				return new Object[] { d };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_2B(Decision d) {
		for (While __DEC_d_first_758990 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				While.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_3B(Decision d) {
		for (While __DEC_d_last_667914 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				While.class, "last")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_27_1_matchtggpattern_blackBB(Program p, Decision d) {
		if (d.equals(p.getFirst())) {
			if (pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_0B(d) == null) {
				if (pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_1B(d) == null) {
					if (pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_2B(d) == null) {
						if (pattern_firstdecision2firstbranch_27_1_matchtggpattern_black_nac_3B(d) == null) {
							return new Object[] { p, d };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstdecision2firstbranch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_28_1_matchtggpattern_black_nac_0BB(Branch b,
			Graph g) {
		for (Graph __DEC_b_root_496224 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_496224)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_28_1_matchtggpattern_black_nac_1B(Branch b) {
		for (Branch __DEC_b_positive_964043 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_964043)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_28_1_matchtggpattern_black_nac_2B(Branch b) {
		for (Branch __DEC_b_negative_276510 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_276510)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_28_1_matchtggpattern_blackBB(Branch b, Graph g) {
		if (b.equals(g.getRoot())) {
			if (pattern_firstdecision2firstbranch_28_1_matchtggpattern_black_nac_0BB(b, g) == null) {
				if (pattern_firstdecision2firstbranch_28_1_matchtggpattern_black_nac_1B(b) == null) {
					if (pattern_firstdecision2firstbranch_28_1_matchtggpattern_black_nac_2B(b) == null) {
						return new Object[] { b, g };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstdecision2firstbranch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_1_createresult_blackB(
			firstdecision2firstbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Program p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, P2G p2g) {
		if (ruleResult.getCorrObjects().contains(p2g)) {
			return new Object[] { ruleResult, p2g };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Graph g) {
		if (ruleResult.getTargetObjects().contains(g)) {
			return new Object[] { ruleResult, g };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstdecision2firstbranch_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2gList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpP2g : p2gList.getEntryObjects()) {
				if (tmpP2g instanceof P2G) {
					P2G p2g = (P2G) tmpP2g;
					Program p = p2g.getSource();
					if (p != null) {
						Graph g = p2g.getTarget();
						if (g != null) {
							if (pattern_firstdecision2firstbranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									p2g) == null) {
								if (pattern_firstdecision2firstbranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										p) == null) {
									if (pattern_firstdecision2firstbranch_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, g) == null) {
										_result.add(
												new Object[] { p2gList, p, p2g, g, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_firstdecision2firstbranch_29_3_solveCSP_bindingFBBBBBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, p, p2g, g, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			firstdecision2firstbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_firstdecision2firstbranch_29_3_solveCSP_binding = pattern_firstdecision2firstbranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, p2g, g, ruleResult);
		if (result_pattern_firstdecision2firstbranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstdecision2firstbranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_firstdecision2firstbranch_29_3_solveCSP_black = pattern_firstdecision2firstbranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_firstdecision2firstbranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_firstdecision2firstbranch_29_4_checkCSP_expressionFBB(
			firstdecision2firstbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_5_checknacs_blackBBB(Program p, P2G p2g,
			Graph g) {
		return new Object[] { p, p2g, g };
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_6_perform_blackBBBB(Program p, P2G p2g, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { p, p2g, g, ruleResult };
	}

	public static final Object[] pattern_firstdecision2firstbranch_29_6_perform_greenBFFBFB(Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		Decision d = SourcecodeFactory.eINSTANCE.createDecision();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(f2r);
		f2r.setTarget(b);
		g.setRoot(b);
		ruleResult.getTargetObjects().add(b);
		p.setFirst(d);
		f2r.setSource(d);
		ruleResult.getSourceObjects().add(d);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { p, f2r, b, g, d, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_firstdecision2firstbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //firstdecision2firstbranchImpl
