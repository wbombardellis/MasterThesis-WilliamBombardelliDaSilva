/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
import controlflow.Command;
import controlflow.ControlflowFactory;
import controlflow.Graph;
import controlflow.Node;

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
import org.wbsilva.bx.sourcecode2controlflow.Rules.firstwhile2rootbranch;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
import org.wbsilva.bx.sourcecode2controlflow.S2N;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

import sourcecode.Assignment;
import sourcecode.Decision;
import sourcecode.Program;
import sourcecode.SourcecodeFactory;
import sourcecode.Statement;
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
 * An implementation of the model object '<em><b>firstwhile2rootbranch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class firstwhile2rootbranchImpl extends AbstractRuleImpl implements firstwhile2rootbranch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected firstwhile2rootbranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getfirstwhile2rootbranch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, Program p, While w) {

		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_0_1_initialbindings_blackBBBBB(this, match, l, p, w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, l, p, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_blackBBBB(match, l, p, w);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[p] = " + p + ", " + "[w] = " + w + ".");
			}
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_greenBBBBFF(match,
					l, p, w);
			//nothing EMoflonEdge p__w____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__l____last = (EMoflonEdge) result4_green[5];

			Object[] result5_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_0_5_collectcontextelements_blackBBBB(match, l, p, w);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[p] = " + p + ", " + "[w] = " + w + ".");
			}
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_5_collectcontextelements_greenBB(match, p);

			// 
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, l, p, w);
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_7_expressionF();
		} else {
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Graph g = (Graph) result1_bindingAndBlack[0];
		Assignment l = (Assignment) result1_bindingAndBlack[1];
		P2G p2g = (P2G) result1_bindingAndBlack[2];
		Program p = (Program) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_1_performtransformation_greenFBBFFFB(g, l, w);
		S2B f2r = (S2B) result1_green[0];
		Branch b = (Branch) result1_green[3];
		S2N l2d = (S2N) result1_green[4];
		Command d = (Command) result1_green[5];

		Object[] result2_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_blackBBBBBB(f2r, l, b, l2d, d, w);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[f2r] = " + f2r + ", " + "[l] = " + l + ", "
							+ "[b] = " + b + ", " + "[l2d] = " + l2d + ", " + "[d] = " + d + ", " + "[w] = " + w + ".");
		}
		Object[] result2_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_greenFBBBBBB(f2r, l, b, l2d, d, w);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, f2r, g, l, b, p2g, p,
						l2d, d, w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[f2r] = " + f2r + ", " + "[g] = " + g + ", " + "[l] = " + l + ", " + "[b] = " + b + ", "
					+ "[p2g] = " + p2g + ", " + "[p] = " + p + ", " + "[l2d] = " + l2d + ", " + "[d] = " + d + ", "
					+ "[w] = " + w + ".");
		}
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, f2r, g, l, b, p, l2d, d, w);
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge l2d__l____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge l2d__d____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge f2r__w____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[16];

		// 
		// 
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, f2r, g, l, b, p2g, p, l2d, d, w);
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		Program p = (Program) result2_binding[1];
		While w = (While) result2_binding[2];
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_2_2_corematch_blackFBFBBB(l, p, w, match)) {
			Graph g = (Graph) result2_black[0];
			P2G p2g = (P2G) result2_black[2];
			// ForEach 
			for (Object[] result3_black : firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_2_3_findcontext_blackBBBBB(g, l, p2g, p, w)) {
				Object[] result3_green = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_2_3_findcontext_greenBBBBBFFFFF(g, l, p2g, p, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, g,
								l, p2g, p, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[g] = " + g + ", " + "[l] = " + l
							+ ", " + "[p2g] = " + p2g + ", " + "[p] = " + p + ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = firstwhile2rootbranchImpl
							.pattern_firstwhile2rootbranch_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, Program p, While w) {
		match.registerObject("l", l);
		match.registerObject("p", p);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, Program p, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Graph g, Assignment l, P2G p2g, Program p,
			While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b,
			EObject p2g, EObject p, EObject l2d, EObject d, EObject w) {
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("l2d", l2d);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Graph g, Branch b, Command d) {

		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_10_1_initialbindings_blackBBBBB(this, match, g, b, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[g] = " + g + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, g, b, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[g] = " + g + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_blackBBBB(match, g, b, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[g] = " + g + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_greenBBBBFF(match, g, b, d);
			//nothing EMoflonEdge g__b____root = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__b____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_10_5_collectcontextelements_blackBBBB(match, g, b, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[g] = " + g + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_5_collectcontextelements_greenBB(match, g);

			// 
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, g, b, d);
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_7_expressionF();
		} else {
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Graph g = (Graph) result1_bindingAndBlack[0];
		Branch b = (Branch) result1_bindingAndBlack[1];
		P2G p2g = (P2G) result1_bindingAndBlack[2];
		Program p = (Program) result1_bindingAndBlack[3];
		Command d = (Command) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_1_performtransformation_greenFFBBFBF(b, p, d);
		S2B f2r = (S2B) result1_green[0];
		Assignment l = (Assignment) result1_green[1];
		S2N l2d = (S2N) result1_green[4];
		While w = (While) result1_green[6];

		Object[] result2_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_blackBBBBBB(f2r, l, b, l2d, d, w);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[f2r] = " + f2r + ", " + "[l] = " + l + ", "
							+ "[b] = " + b + ", " + "[l2d] = " + l2d + ", " + "[d] = " + d + ", " + "[w] = " + w + ".");
		}
		Object[] result2_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_greenFBBBBBB(f2r, l, b, l2d, d, w);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, f2r, g, l, b, p2g,
						p, l2d, d, w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[f2r] = " + f2r + ", " + "[g] = " + g + ", " + "[l] = " + l + ", " + "[b] = " + b + ", "
					+ "[p2g] = " + p2g + ", " + "[p] = " + p + ", " + "[l2d] = " + l2d + ", " + "[d] = " + d + ", "
					+ "[w] = " + w + ".");
		}
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, f2r, g, l, b, p, l2d, d, w);
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge l2d__l____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge l2d__d____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge f2r__w____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[16];

		// 
		// 
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, f2r, g, l, b, p2g, p, l2d, d, w);
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Graph g = (Graph) result2_binding[0];
		Branch b = (Branch) result2_binding[1];
		Command d = (Command) result2_binding[2];
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_12_2_corematch_blackBBFFBB(g, b, d, match)) {
			P2G p2g = (P2G) result2_black[2];
			Program p = (Program) result2_black[3];
			// ForEach 
			for (Object[] result3_black : firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_12_3_findcontext_blackBBBBB(g, b, p2g, p, d)) {
				Object[] result3_green = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_12_3_findcontext_greenBBBBBFFFFF(g, b, p2g, p, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, g,
								b, p2g, p, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[g] = " + g + ", " + "[b] = " + b
							+ ", " + "[p2g] = " + p2g + ", " + "[p] = " + p + ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = firstwhile2rootbranchImpl
							.pattern_firstwhile2rootbranch_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Graph g, Branch b, Command d) {
		match.registerObject("g", g);
		match.registerObject("b", b);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Graph g, Branch b, Command d) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Graph g, Branch b, P2G p2g, Program p,
			Command d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b,
			EObject p2g, EObject p, EObject l2d, EObject d, EObject w) {
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("l2d", l2d);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_55(EMoflonEdge _edge_root) {

		Object[] result1_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_blackFFFB(_edge_root)) {
			Graph g = (Graph) result2_black[0];
			Branch b = (Branch) result2_black[1];
			Command d = (Command) result2_black[2];
			Object[] result2_green = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, g, b, d)) {
				// 
				if (firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = firstwhile2rootbranchImpl
							.pattern_firstwhile2rootbranch_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_55(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			Assignment l = (Assignment) result2_black[0];
			Program p = (Program) result2_black[1];
			While w = (While) result2_black[2];
			Object[] result2_green = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, l, p, w)) {
				// 
				if (firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = firstwhile2rootbranchImpl
							.pattern_firstwhile2rootbranch_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("firstwhile2rootbranch");
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
		ruleResult.setRule("firstwhile2rootbranch");
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

		Object[] result1_black = firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Graph g = (Graph) result2_bindingAndBlack[0];
		Assignment l = (Assignment) result2_bindingAndBlack[1];
		Branch b = (Branch) result2_bindingAndBlack[2];
		Program p = (Program) result2_bindingAndBlack[3];
		Command d = (Command) result2_bindingAndBlack[4];
		While w = (While) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, g, l, b, p, d, w,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[g] = " + g + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[p] = " + p + ", " + "[d] = "
					+ d + ", " + "[w] = " + w + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_24_5_matchcorrcontext_blackBFBBB(g, p, sourceMatch, targetMatch)) {
				P2G p2g = (P2G) result5_black[1];
				Object[] result5_green = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_24_5_matchcorrcontext_greenBBBF(p2g, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_24_6_createcorrespondence_blackBBBBBBB(g, l, b, p, d, w,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[g] = " + g + ", "
							+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[p] = " + p + ", " + "[d] = " + d + ", "
							+ "[w] = " + w + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_6_createcorrespondence_greenFBBFBBB(l, b, d,
						w, ccMatch);
				//nothing S2B f2r = (S2B) result6_green[0];
				//nothing S2N l2d = (S2N) result6_green[3];

				Object[] result7_black = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Graph g, Assignment l, Branch b, Program p, Command d, While w,
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
	public boolean checkDEC_FWD(Assignment l, Program p, While w) {// 
		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_27_1_matchtggpattern_blackBBB(l, p, w);
		if (result1_black != null) {
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_27_2_expressionF();
		} else {
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Graph g, Branch b, Command d) {// 
		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_28_1_matchtggpattern_blackBBB(g, b, d);
		if (result1_black != null) {
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_28_2_expressionF();
		} else {
			return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, P2G p2gParameter) {

		Object[] result1_black = firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList p2gList = (RuleEntryList) result2_black[0];
			Graph g = (Graph) result2_black[1];
			P2G p2g = (P2G) result2_black[2];
			Program p = (Program) result2_black[3];

			Object[] result3_bindingAndBlack = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, g, p2g,
							p, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[g] = " + g + ", " + "[p2g] = " + p2g
						+ ", " + "[p] = " + p + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_29_5_checknacs_blackBBB(g, p2g, p);
				if (result5_black != null) {

					Object[] result6_black = firstwhile2rootbranchImpl
							.pattern_firstwhile2rootbranch_29_6_perform_blackBBBB(g, p2g, p, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[g] = " + g + ", "
								+ "[p2g] = " + p2g + ", " + "[p] = " + p + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_6_perform_greenFBFFBFFFB(g, p,
							ruleResult);
					//nothing S2B f2r = (S2B) result6_green[0];
					//nothing Assignment l = (Assignment) result6_green[2];
					//nothing Branch b = (Branch) result6_green[3];
					//nothing S2N l2d = (S2N) result6_green[5];
					//nothing Command d = (Command) result6_green[6];
					//nothing While w = (While) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Graph g, P2G p2g, Program p,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("p", p);
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
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_PROGRAM_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_PROGRAM_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2), (While) arguments.get(3));
			return null;
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_PROGRAM_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GRAPH_ASSIGNMENT_P2G_PROGRAM_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Graph) arguments.get(1),
					(Assignment) arguments.get(2), (P2G) arguments.get(3), (Program) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_BWD__MATCH_GRAPH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Graph) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_GRAPH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Graph) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
			return null;
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_GRAPH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Graph) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GRAPH_BRANCH_P2G_PROGRAM_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Graph) arguments.get(1),
					(Branch) arguments.get(2), (P2G) arguments.get(3), (Program) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_55__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_55((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_55__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_55((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__GRAPH_ASSIGNMENT_BRANCH_PROGRAM_COMMAND_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Graph) arguments.get(0), (Assignment) arguments.get(1),
					(Branch) arguments.get(2), (Program) arguments.get(3), (Command) arguments.get(4),
					(While) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_DEC_FWD__ASSIGNMENT_PROGRAM_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Program) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_DEC_BWD__GRAPH_BRANCH_COMMAND:
			return checkDEC_BWD((Graph) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_P2G:
			return generateModel((RuleEntryContainer) arguments.get(0), (P2G) arguments.get(1));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GRAPH_P2G_PROGRAM_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Graph) arguments.get(1),
					(P2G) arguments.get(2), (Program) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_1_initialbindings_blackBBBBB(
			firstwhile2rootbranch _this, Match match, Assignment l, Program p, While w) {
		return new Object[] { _this, match, l, p, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingFBBBBB(firstwhile2rootbranch _this,
			Match match, Assignment l, Program p, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, p, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, p, w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			firstwhile2rootbranch _this, Match match, Assignment l, Program p, While w) {
		Object[] result_pattern_firstwhile2rootbranch_0_2_SolveCSP_binding = pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, l, p, w);
		if (result_pattern_firstwhile2rootbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_0_2_SolveCSP_black = pattern_firstwhile2rootbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, p, w };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_0_3_CheckCSP_expressionFBB(firstwhile2rootbranch _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Assignment l, Program p, While w) {
		return new Object[] { match, l, p, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Assignment l, Program p, While w) {
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(w);
		String p__w____first_name_prime = "first";
		String w__l____last_name_prime = "last";
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		match.getToBeTranslatedEdges().add(p__w____first);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(w__l____last);
		p__w____first.setName(p__w____first_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		return new Object[] { match, l, p, w, p__w____first, w__l____last };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_5_collectcontextelements_blackBBBB(Match match,
			Assignment l, Program p, While w) {
		return new Object[] { match, l, p, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_5_collectcontextelements_greenBB(Match match,
			Program p) {
		match.getContextNodes().add(p);
		return new Object[] { match, p };
	}

	public static final void pattern_firstwhile2rootbranch_0_6_registerobjectstomatch_expressionBBBBB(
			firstwhile2rootbranch _this, Match match, Assignment l, Program p, While w) {
		_this.registerObjectsToMatch_FWD(match, l, p, w);

	}

	public static final boolean pattern_firstwhile2rootbranch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstwhile2rootbranch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("g");
		EObject _localVariable_1 = isApplicableMatch.getObject("l");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_3 = isApplicableMatch.getObject("p");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject tmpG = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpP2g = _localVariable_2;
		EObject tmpP = _localVariable_3;
		EObject tmpW = _localVariable_4;
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpP2g instanceof P2G) {
					P2G p2g = (P2G) tmpP2g;
					if (tmpP instanceof Program) {
						Program p = (Program) tmpP;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							return new Object[] { g, l, p2g, p, w, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_blackBBBBBFBB(Graph g,
			Assignment l, P2G p2g, Program p, While w, firstwhile2rootbranch _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { g, l, p2g, p, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding = pattern_firstwhile2rootbranch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding != null) {
			Graph g = (Graph) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[0];
			Assignment l = (Assignment) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[1];
			P2G p2g = (P2G) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[2];
			Program p = (Program) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_firstwhile2rootbranch_1_1_performtransformation_black = pattern_firstwhile2rootbranch_1_1_performtransformation_blackBBBBBFBB(
					g, l, p2g, p, w, _this, isApplicableMatch);
			if (result_pattern_firstwhile2rootbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstwhile2rootbranch_1_1_performtransformation_black[5];

				return new Object[] { g, l, p2g, p, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_greenFBBFFFB(Graph g,
			Assignment l, While w) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		f2r.setSource(w);
		f2r.setTarget(b);
		g.setRoot(b);
		l2d.setSource(l);
		d.setNext(b);
		l2d.setTarget(d);
		return new Object[] { f2r, g, l, b, l2d, d, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_blackBBBBBB(S2B f2r,
			Assignment l, Branch b, S2N l2d, Command d, While w) {
		return new Object[] { f2r, l, b, l2d, d, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_greenFBBBBBB(S2B f2r,
			Assignment l, Branch b, S2N l2d, Command d, While w) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2d);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(w);
		return new Object[] { ruleresult, f2r, l, b, l2d, d, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b, EObject p2g, EObject p,
			EObject l2d, EObject d, EObject w) {
		if (!f2r.equals(g)) {
			if (!f2r.equals(l)) {
				if (!f2r.equals(p2g)) {
					if (!f2r.equals(p)) {
						if (!f2r.equals(l2d)) {
							if (!f2r.equals(w)) {
								if (!g.equals(l)) {
									if (!g.equals(p2g)) {
										if (!g.equals(p)) {
											if (!g.equals(l2d)) {
												if (!g.equals(w)) {
													if (!l.equals(p2g)) {
														if (!l.equals(p)) {
															if (!l.equals(l2d)) {
																if (!l.equals(w)) {
																	if (!b.equals(f2r)) {
																		if (!b.equals(g)) {
																			if (!b.equals(l)) {
																				if (!b.equals(p2g)) {
																					if (!b.equals(p)) {
																						if (!b.equals(l2d)) {
																							if (!b.equals(d)) {
																								if (!b.equals(w)) {
																									if (!p2g.equals(
																											w)) {
																										if (!p.equals(
																												p2g)) {
																											if (!p.equals(
																													w)) {
																												if (!l2d.equals(
																														p2g)) {
																													if (!l2d.equals(
																															p)) {
																														if (!l2d.equals(
																																w)) {
																															if (!d.equals(
																																	f2r)) {
																																if (!d.equals(
																																		g)) {
																																	if (!d.equals(
																																			l)) {
																																		if (!d.equals(
																																				p2g)) {
																																			if (!d.equals(
																																					p)) {
																																				if (!d.equals(
																																						l2d)) {
																																					if (!d.equals(
																																							w)) {
																																						return new Object[] {
																																								ruleresult,
																																								f2r,
																																								g,
																																								l,
																																								b,
																																								p2g,
																																								p,
																																								l2d,
																																								d,
																																								w };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b, EObject p, EObject l2d,
			EObject d, EObject w) {
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstwhile2rootbranch";
		String f2r__b____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		String l2d__l____source_name_prime = "source";
		String d__b____next_name_prime = "next";
		String l2d__d____target_name_prime = "target";
		String p__w____first_name_prime = "first";
		String f2r__w____source_name_prime = "source";
		String w__l____last_name_prime = "last";
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getCreatedEdges().add(g__b____root);
		l2d__l____source.setSrc(l2d);
		l2d__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2d__l____source);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____next);
		l2d__d____target.setSrc(l2d);
		l2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(l2d__d____target);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		ruleresult.getTranslatedEdges().add(p__w____first);
		f2r__w____source.setSrc(f2r);
		f2r__w____source.setTrg(w);
		ruleresult.getCreatedEdges().add(f2r__w____source);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(w__l____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		l2d__l____source.setName(l2d__l____source_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		l2d__d____target.setName(l2d__d____target_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		f2r__w____source.setName(f2r__w____source_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		return new Object[] { ruleresult, f2r, g, l, b, p, l2d, d, w, f2r__b____target, g__b____root, l2d__l____source,
				d__b____next, l2d__d____target, p__w____first, f2r__w____source, w__l____last };
	}

	public static final void pattern_firstwhile2rootbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			firstwhile2rootbranch _this, PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b,
			EObject p2g, EObject p, EObject l2d, EObject d, EObject w) {
		_this.registerObjects_FWD(ruleresult, f2r, g, l, b, p2g, p, l2d, d, w);

	}

	public static final PerformRuleResult pattern_firstwhile2rootbranch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_1_preparereturnvalue_bindingFB(
			firstwhile2rootbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			firstwhile2rootbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_1_preparereturnvalue_bindingAndBlackFFB(
			firstwhile2rootbranch _this) {
		Object[] result_pattern_firstwhile2rootbranch_2_1_preparereturnvalue_binding = pattern_firstwhile2rootbranch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstwhile2rootbranch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstwhile2rootbranch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_2_1_preparereturnvalue_black = pattern_firstwhile2rootbranch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstwhile2rootbranch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstwhile2rootbranch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstwhile2rootbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("p");
		EObject _localVariable_2 = match.getObject("w");
		EObject tmpL = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpW = _localVariable_2;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpP instanceof Program) {
				Program p = (Program) tmpP;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					return new Object[] { l, p, w, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_2_2_corematch_blackFBFBBB(Assignment l,
			Program p, While w, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
			Graph g = p2g.getTarget();
			if (g != null) {
				_result.add(new Object[] { g, l, p2g, p, w, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_2_3_findcontext_blackBBBBB(Graph g,
			Assignment l, P2G p2g, Program p, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (g.equals(p2g.getTarget())) {
			if (p.equals(p2g.getSource())) {
				if (w.equals(p.getFirst())) {
					if (l.equals(w.getLast())) {
						_result.add(new Object[] { g, l, p2g, p, w });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_3_findcontext_greenBBBBBFFFFF(Graph g, Assignment l,
			P2G p2g, Program p, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2g__g____target_name_prime = "target";
		String p2g__p____source_name_prime = "source";
		String p__w____first_name_prime = "first";
		String w__l____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(w);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		isApplicableMatch.getAllContextElements().add(p__w____first);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(w__l____last);
		p2g__g____target.setName(p2g__g____target_name_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		return new Object[] { g, l, p2g, p, w, isApplicableMatch, p2g__g____target, p2g__p____source, p__w____first,
				w__l____last };
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_4_solveCSP_bindingFBBBBBBB(firstwhile2rootbranch _this,
			IsApplicableMatch isApplicableMatch, Graph g, Assignment l, P2G p2g, Program p, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, g, l, p2g, p, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, g, l, p2g, p, w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Graph g, Assignment l, P2G p2g, Program p,
			While w) {
		Object[] result_pattern_firstwhile2rootbranch_2_4_solveCSP_binding = pattern_firstwhile2rootbranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, g, l, p2g, p, w);
		if (result_pattern_firstwhile2rootbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_2_4_solveCSP_black = pattern_firstwhile2rootbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, g, l, p2g, p, w };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_2_5_checkCSP_expressionFBB(firstwhile2rootbranch _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstwhile2rootbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstwhile2rootbranch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_1_initialbindings_blackBBBBB(
			firstwhile2rootbranch _this, Match match, Graph g, Branch b, Command d) {
		return new Object[] { _this, match, g, b, d };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingFBBBBB(firstwhile2rootbranch _this,
			Match match, Graph g, Branch b, Command d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, g, b, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, g, b, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			firstwhile2rootbranch _this, Match match, Graph g, Branch b, Command d) {
		Object[] result_pattern_firstwhile2rootbranch_10_2_SolveCSP_binding = pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, g, b, d);
		if (result_pattern_firstwhile2rootbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_10_2_SolveCSP_black = pattern_firstwhile2rootbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, g, b, d };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_10_3_CheckCSP_expressionFBB(firstwhile2rootbranch _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Graph g, Branch b, Command d) {
		return new Object[] { match, g, b, d };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Graph g, Branch b, Command d) {
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(d);
		String g__b____root_name_prime = "root";
		String d__b____next_name_prime = "next";
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		match.getToBeTranslatedEdges().add(g__b____root);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____next);
		g__b____root.setName(g__b____root_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		return new Object[] { match, g, b, d, g__b____root, d__b____next };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_5_collectcontextelements_blackBBBB(Match match,
			Graph g, Branch b, Command d) {
		return new Object[] { match, g, b, d };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_5_collectcontextelements_greenBB(Match match,
			Graph g) {
		match.getContextNodes().add(g);
		return new Object[] { match, g };
	}

	public static final void pattern_firstwhile2rootbranch_10_6_registerobjectstomatch_expressionBBBBB(
			firstwhile2rootbranch _this, Match match, Graph g, Branch b, Command d) {
		_this.registerObjectsToMatch_BWD(match, g, b, d);

	}

	public static final boolean pattern_firstwhile2rootbranch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstwhile2rootbranch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("g");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_3 = isApplicableMatch.getObject("p");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject tmpG = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpP2g = _localVariable_2;
		EObject tmpP = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (tmpP2g instanceof P2G) {
					P2G p2g = (P2G) tmpP2g;
					if (tmpP instanceof Program) {
						Program p = (Program) tmpP;
						if (tmpD instanceof Command) {
							Command d = (Command) tmpD;
							return new Object[] { g, b, p2g, p, d, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_blackBBBBBFBB(Graph g,
			Branch b, P2G p2g, Program p, Command d, firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { g, b, p2g, p, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding = pattern_firstwhile2rootbranch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding != null) {
			Graph g = (Graph) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[0];
			Branch b = (Branch) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[1];
			P2G p2g = (P2G) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[2];
			Program p = (Program) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[3];
			Command d = (Command) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_firstwhile2rootbranch_11_1_performtransformation_black = pattern_firstwhile2rootbranch_11_1_performtransformation_blackBBBBBFBB(
					g, b, p2g, p, d, _this, isApplicableMatch);
			if (result_pattern_firstwhile2rootbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstwhile2rootbranch_11_1_performtransformation_black[5];

				return new Object[] { g, b, p2g, p, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_greenFFBBFBF(Branch b,
			Program p, Command d) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While w = SourcecodeFactory.eINSTANCE.createWhile();
		f2r.setTarget(b);
		l2d.setSource(l);
		l2d.setTarget(d);
		p.setFirst(w);
		f2r.setSource(w);
		w.setLast(l);
		return new Object[] { f2r, l, b, p, l2d, d, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_blackBBBBBB(S2B f2r,
			Assignment l, Branch b, S2N l2d, Command d, While w) {
		return new Object[] { f2r, l, b, l2d, d, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_greenFBBBBBB(S2B f2r,
			Assignment l, Branch b, S2N l2d, Command d, While w) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2d);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(w);
		return new Object[] { ruleresult, f2r, l, b, l2d, d, w };
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b, EObject p2g, EObject p,
			EObject l2d, EObject d, EObject w) {
		if (!f2r.equals(g)) {
			if (!f2r.equals(l)) {
				if (!f2r.equals(p2g)) {
					if (!f2r.equals(p)) {
						if (!f2r.equals(l2d)) {
							if (!f2r.equals(w)) {
								if (!g.equals(l)) {
									if (!g.equals(p2g)) {
										if (!g.equals(p)) {
											if (!g.equals(l2d)) {
												if (!g.equals(w)) {
													if (!l.equals(p2g)) {
														if (!l.equals(p)) {
															if (!l.equals(l2d)) {
																if (!l.equals(w)) {
																	if (!b.equals(f2r)) {
																		if (!b.equals(g)) {
																			if (!b.equals(l)) {
																				if (!b.equals(p2g)) {
																					if (!b.equals(p)) {
																						if (!b.equals(l2d)) {
																							if (!b.equals(d)) {
																								if (!b.equals(w)) {
																									if (!p2g.equals(
																											w)) {
																										if (!p.equals(
																												p2g)) {
																											if (!p.equals(
																													w)) {
																												if (!l2d.equals(
																														p2g)) {
																													if (!l2d.equals(
																															p)) {
																														if (!l2d.equals(
																																w)) {
																															if (!d.equals(
																																	f2r)) {
																																if (!d.equals(
																																		g)) {
																																	if (!d.equals(
																																			l)) {
																																		if (!d.equals(
																																				p2g)) {
																																			if (!d.equals(
																																					p)) {
																																				if (!d.equals(
																																						l2d)) {
																																					if (!d.equals(
																																							w)) {
																																						return new Object[] {
																																								ruleresult,
																																								f2r,
																																								g,
																																								l,
																																								b,
																																								p2g,
																																								p,
																																								l2d,
																																								d,
																																								w };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b, EObject p, EObject l2d,
			EObject d, EObject w) {
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstwhile2rootbranch";
		String f2r__b____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		String l2d__l____source_name_prime = "source";
		String d__b____next_name_prime = "next";
		String l2d__d____target_name_prime = "target";
		String p__w____first_name_prime = "first";
		String f2r__w____source_name_prime = "source";
		String w__l____last_name_prime = "last";
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getTranslatedEdges().add(g__b____root);
		l2d__l____source.setSrc(l2d);
		l2d__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2d__l____source);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____next);
		l2d__d____target.setSrc(l2d);
		l2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(l2d__d____target);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		ruleresult.getCreatedEdges().add(p__w____first);
		f2r__w____source.setSrc(f2r);
		f2r__w____source.setTrg(w);
		ruleresult.getCreatedEdges().add(f2r__w____source);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(w__l____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		l2d__l____source.setName(l2d__l____source_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		l2d__d____target.setName(l2d__d____target_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		f2r__w____source.setName(f2r__w____source_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		return new Object[] { ruleresult, f2r, g, l, b, p, l2d, d, w, f2r__b____target, g__b____root, l2d__l____source,
				d__b____next, l2d__d____target, p__w____first, f2r__w____source, w__l____last };
	}

	public static final void pattern_firstwhile2rootbranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			firstwhile2rootbranch _this, PerformRuleResult ruleresult, EObject f2r, EObject g, EObject l, EObject b,
			EObject p2g, EObject p, EObject l2d, EObject d, EObject w) {
		_this.registerObjects_BWD(ruleresult, f2r, g, l, b, p2g, p, l2d, d, w);

	}

	public static final PerformRuleResult pattern_firstwhile2rootbranch_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_1_preparereturnvalue_bindingFB(
			firstwhile2rootbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			firstwhile2rootbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_1_preparereturnvalue_bindingAndBlackFFB(
			firstwhile2rootbranch _this) {
		Object[] result_pattern_firstwhile2rootbranch_12_1_preparereturnvalue_binding = pattern_firstwhile2rootbranch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstwhile2rootbranch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstwhile2rootbranch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_12_1_preparereturnvalue_black = pattern_firstwhile2rootbranch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstwhile2rootbranch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstwhile2rootbranch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstwhile2rootbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("g");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("d");
		EObject tmpG = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD = _localVariable_2;
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (tmpD instanceof Command) {
					Command d = (Command) tmpD;
					return new Object[] { g, b, d, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_12_2_corematch_blackBBFFBB(Graph g, Branch b,
			Command d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
			Program p = p2g.getSource();
			if (p != null) {
				_result.add(new Object[] { g, b, p2g, p, d, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_12_3_findcontext_blackBBBBB(Graph g, Branch b,
			P2G p2g, Program p, Command d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (g.equals(p2g.getTarget())) {
			if (b.equals(g.getRoot())) {
				if (b.equals(d.getNext())) {
					if (p.equals(p2g.getSource())) {
						_result.add(new Object[] { g, b, p2g, p, d });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_3_findcontext_greenBBBBBFFFFF(Graph g, Branch b,
			P2G p2g, Program p, Command d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2g__g____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		String d__b____next_name_prime = "next";
		String p2g__p____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(d);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		isApplicableMatch.getAllContextElements().add(g__b____root);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____next);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setName(p2g__g____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		return new Object[] { g, b, p2g, p, d, isApplicableMatch, p2g__g____target, g__b____root, d__b____next,
				p2g__p____source };
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_4_solveCSP_bindingFBBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Graph g, Branch b, P2G p2g, Program p,
			Command d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, g, b, p2g, p, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, g, b, p2g, p, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Graph g, Branch b, P2G p2g, Program p,
			Command d) {
		Object[] result_pattern_firstwhile2rootbranch_12_4_solveCSP_binding = pattern_firstwhile2rootbranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, g, b, p2g, p, d);
		if (result_pattern_firstwhile2rootbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_12_4_solveCSP_black = pattern_firstwhile2rootbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, g, b, p2g, p, d };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_12_5_checkCSP_expressionFBB(firstwhile2rootbranch _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstwhile2rootbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstwhile2rootbranch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_1_preparereturnvalue_bindingFB(
			firstwhile2rootbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstwhile2rootbranch _this) {
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

	public static final Object[] pattern_firstwhile2rootbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			firstwhile2rootbranch _this) {
		Object[] result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_binding = pattern_firstwhile2rootbranch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_black = pattern_firstwhile2rootbranch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstwhile2rootbranch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_0BB(Branch b,
			Graph g) {
		for (Graph __DEC_b_root_749107 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_749107)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_1B(Branch b) {
		for (Branch __DEC_b_positive_163385 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_163385)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_2B(Branch b) {
		for (Branch __DEC_b_negative_320861 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_320861)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_3BB(Command d,
			Graph g) {
		for (Graph __DEC_d_root_46052 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			if (!g.equals(__DEC_d_root_46052)) {
				return new Object[] { d, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_4BB(Command d,
			Branch b) {
		for (Branch __DEC_d_positive_320524 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_d_positive_320524)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_5BB(Command d,
			Branch b) {
		for (Branch __DEC_d_negative_186506 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_d_negative_186506)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_6BB(Graph g,
			Command d) {
		if (d.equals(g.getRoot())) {
			return new Object[] { g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_7BB(Branch b,
			Command d) {
		if (d.equals(b.getPositive())) {
			return new Object[] { b, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_8BB(Branch b,
			Command d) {
		if (d.equals(b.getNegative())) {
			return new Object[] { b, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_root) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpG = _edge_root.getSrc();
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			EObject tmpB = _edge_root.getTrg();
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (b.equals(g.getRoot())) {
					if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_0BB(b, g) == null) {
						if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_1B(b) == null) {
							if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_2B(b) == null) {
								for (Node tmpD : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
										Node.class, "next")) {
									if (tmpD instanceof Command) {
										Command d = (Command) tmpD;
										if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_3BB(d,
												g) == null) {
											if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_4BB(d,
													b) == null) {
												if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_5BB(
														d, b) == null) {
													if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_6BB(
															g, d) == null) {
														if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_7BB(
																b, d) == null) {
															if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_8BB(
																	b, d) == null) {
																_result.add(new Object[] { g, b, d, _edge_root });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstwhile2rootbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			firstwhile2rootbranch _this, Match match, Graph g, Branch b, Command d) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, g, b, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstwhile2rootbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstwhile2rootbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstwhile2rootbranch_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_1_preparereturnvalue_bindingFB(
			firstwhile2rootbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstwhile2rootbranch _this) {
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

	public static final Object[] pattern_firstwhile2rootbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			firstwhile2rootbranch _this) {
		Object[] result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_binding = pattern_firstwhile2rootbranch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_black = pattern_firstwhile2rootbranch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstwhile2rootbranch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_0B(Assignment l) {
		for (Decision __DEC_l_positive_563191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_1B(Assignment l) {
		for (Decision __DEC_l_negative_380210 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_2BB(Assignment l,
			While w) {
		for (While __DEC_l_first_772002 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!w.equals(__DEC_l_first_772002)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_3BB(Assignment l,
			While w) {
		for (While __DEC_l_last_677035 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!w.equals(__DEC_l_last_677035)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_4BB(Assignment l,
			Program p) {
		for (Program __DEC_l_first_332409 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			if (!p.equals(__DEC_l_first_332409)) {
				return new Object[] { l, p };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_5B(While w) {
		for (Decision __DEC_w_positive_548312 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "positive")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_6B(While w) {
		for (Decision __DEC_w_negative_883469 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "negative")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_7B(While w) {
		for (While __DEC_w_first_516413 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "first")) {
			if (!w.equals(__DEC_w_first_516413)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_8B(While w) {
		for (While __DEC_w_last_391327 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "last")) {
			if (!w.equals(__DEC_w_last_391327)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_9BB(While w,
			Assignment l) {
		if (l.equals(w.getFirst())) {
			return new Object[] { w, l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_10BB(Program p,
			Assignment l) {
		if (l.equals(p.getFirst())) {
			return new Object[] { p, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpP = _edge_first.getSrc();
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			EObject tmpW = _edge_first.getTrg();
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (w.equals(p.getFirst())) {
					Statement tmpL = w.getLast();
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_5B(w) == null) {
							if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_6B(w) == null) {
								if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_7B(w) == null) {
									if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_8B(
											w) == null) {
										if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_0B(
												l) == null) {
											if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_1B(
													l) == null) {
												if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_2BB(
														l, w) == null) {
													if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_3BB(
															l, w) == null) {
														if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_4BB(
																l, p) == null) {
															if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_9BB(
																	w, l) == null) {
																if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_10BB(
																		p, l) == null) {
																	_result.add(new Object[] { l, p, w, _edge_first });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstwhile2rootbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			firstwhile2rootbranch _this, Match match, Assignment l, Program p, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, p, w);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstwhile2rootbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstwhile2rootbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstwhile2rootbranch_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_1_prepare_blackB(firstwhile2rootbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("g");
		EObject _localVariable_1 = sourceMatch.getObject("l");
		EObject _localVariable_2 = targetMatch.getObject("b");
		EObject _localVariable_3 = sourceMatch.getObject("p");
		EObject _localVariable_4 = targetMatch.getObject("d");
		EObject _localVariable_5 = sourceMatch.getObject("w");
		EObject tmpG = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpP = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpW = _localVariable_5;
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpB instanceof Branch) {
					Branch b = (Branch) tmpB;
					if (tmpP instanceof Program) {
						Program p = (Program) tmpP;
						if (tmpD instanceof Command) {
							Command d = (Command) tmpD;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								return new Object[] { g, l, b, p, d, w, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Graph g,
			Assignment l, Branch b, Program p, Command d, While w, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { g, l, b, p, d, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding = pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding != null) {
			Graph g = (Graph) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[0];
			Assignment l = (Assignment) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[1];
			Branch b = (Branch) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[2];
			Program p = (Program) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[3];
			Command d = (Command) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[4];
			While w = (While) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_black = pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					g, l, b, p, d, w, sourceMatch, targetMatch);
			if (result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { g, l, b, p, d, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_3_solvecsp_bindingFBBBBBBBBB(
			firstwhile2rootbranch _this, Graph g, Assignment l, Branch b, Program p, Command d, While w,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(g, l, b, p, d, w, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, g, l, b, p, d, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			firstwhile2rootbranch _this, Graph g, Assignment l, Branch b, Program p, Command d, While w,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstwhile2rootbranch_24_3_solvecsp_binding = pattern_firstwhile2rootbranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, g, l, b, p, d, w, sourceMatch, targetMatch);
		if (result_pattern_firstwhile2rootbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_24_3_solvecsp_black = pattern_firstwhile2rootbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, g, l, b, p, d, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_24_5_matchcorrcontext_blackBFBBB(Graph g,
			Program p, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
				if (p.equals(p2g.getSource())) {
					_result.add(new Object[] { g, p2g, p, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_5_matchcorrcontext_greenBBBF(P2G p2g,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "firstwhile2rootbranch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(p2g);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { p2g, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_6_createcorrespondence_blackBBBBBBB(Graph g,
			Assignment l, Branch b, Program p, Command d, While w, CCMatch ccMatch) {
		return new Object[] { g, l, b, p, d, w, ccMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_6_createcorrespondence_greenFBBFBBB(Assignment l,
			Branch b, Command d, While w, CCMatch ccMatch) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		f2r.setTarget(b);
		f2r.setSource(w);
		ccMatch.getCreateCorr().add(f2r);
		l2d.setSource(l);
		l2d.setTarget(d);
		ccMatch.getCreateCorr().add(l2d);
		return new Object[] { f2r, l, b, l2d, d, w, ccMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "firstwhile2rootbranch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_firstwhile2rootbranch_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_0B(Assignment l) {
		for (Decision __DEC_l_positive_704337 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_1B(Assignment l) {
		for (Decision __DEC_l_negative_230909 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_2BB(Assignment l,
			While w) {
		for (While __DEC_l_first_867838 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!w.equals(__DEC_l_first_867838)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_3BB(Assignment l,
			While w) {
		for (While __DEC_l_last_5811 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!w.equals(__DEC_l_last_5811)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_4BB(Assignment l,
			Program p) {
		for (Program __DEC_l_first_833306 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			if (!p.equals(__DEC_l_first_833306)) {
				return new Object[] { l, p };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_5B(While w) {
		for (Decision __DEC_w_positive_700387 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "positive")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_6B(While w) {
		for (Decision __DEC_w_negative_760882 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "negative")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_7B(While w) {
		for (While __DEC_w_first_385486 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "first")) {
			if (!w.equals(__DEC_w_first_385486)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_8B(While w) {
		for (While __DEC_w_last_212748 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "last")) {
			if (!w.equals(__DEC_w_last_212748)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_9BB(While w,
			Assignment l) {
		if (l.equals(w.getFirst())) {
			return new Object[] { w, l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_10BB(Program p,
			Assignment l) {
		if (l.equals(p.getFirst())) {
			return new Object[] { p, l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_blackBBB(Assignment l, Program p,
			While w) {
		if (w.equals(p.getFirst())) {
			if (l.equals(w.getLast())) {
				if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_0B(l) == null) {
					if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_1B(l) == null) {
						if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_2BB(l, w) == null) {
							if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_3BB(l, w) == null) {
								if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_4BB(l, p) == null) {
									if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_5B(w) == null) {
										if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_6B(
												w) == null) {
											if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_7B(
													w) == null) {
												if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_8B(
														w) == null) {
													if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_9BB(
															w, l) == null) {
														if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_10BB(
																p, l) == null) {
															return new Object[] { l, p, w };
														}
													}
												}
											}
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

	public static final boolean pattern_firstwhile2rootbranch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstwhile2rootbranch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_0BB(Branch b, Graph g) {
		for (Graph __DEC_b_root_428322 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_428322)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_1B(Branch b) {
		for (Branch __DEC_b_positive_344011 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_344011)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_2B(Branch b) {
		for (Branch __DEC_b_negative_955485 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_955485)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_3BB(Command d, Graph g) {
		for (Graph __DEC_d_root_843827 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			if (!g.equals(__DEC_d_root_843827)) {
				return new Object[] { d, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_4BB(Command d, Branch b) {
		for (Branch __DEC_d_positive_574679 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_d_positive_574679)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_5BB(Command d, Branch b) {
		for (Branch __DEC_d_negative_960814 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_d_negative_960814)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_6BB(Graph g, Command d) {
		if (d.equals(g.getRoot())) {
			return new Object[] { g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_7BB(Branch b, Command d) {
		if (d.equals(b.getPositive())) {
			return new Object[] { b, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_8BB(Branch b, Command d) {
		if (d.equals(b.getNegative())) {
			return new Object[] { b, d };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_blackBBB(Graph g, Branch b,
			Command d) {
		if (b.equals(g.getRoot())) {
			if (b.equals(d.getNext())) {
				if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_0BB(b, g) == null) {
					if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_1B(b) == null) {
						if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_2B(b) == null) {
							if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_3BB(d, g) == null) {
								if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_4BB(d, b) == null) {
									if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_5BB(d,
											b) == null) {
										if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_6BB(g,
												d) == null) {
											if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_7BB(b,
													d) == null) {
												if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_8BB(b,
														d) == null) {
													return new Object[] { g, b, d };
												}
											}
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

	public static final boolean pattern_firstwhile2rootbranch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstwhile2rootbranch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_1_createresult_blackB(firstwhile2rootbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Graph g) {
		if (ruleResult.getTargetObjects().contains(g)) {
			return new Object[] { ruleResult, g };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, P2G p2g) {
		if (ruleResult.getCorrObjects().contains(p2g)) {
			return new Object[] { ruleResult, p2g };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Program p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2gList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpP2g : p2gList.getEntryObjects()) {
				if (tmpP2g instanceof P2G) {
					P2G p2g = (P2G) tmpP2g;
					Graph g = p2g.getTarget();
					if (g != null) {
						Program p = p2g.getSource();
						if (p != null) {
							if (pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									p2g) == null) {
								if (pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										g) == null) {
									if (pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											p) == null) {
										_result.add(
												new Object[] { p2gList, g, p2g, p, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_firstwhile2rootbranch_29_3_solveCSP_bindingFBBBBBB(firstwhile2rootbranch _this,
			IsApplicableMatch isApplicableMatch, Graph g, P2G p2g, Program p, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, g, p2g, p, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, g, p2g, p, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Graph g, P2G p2g, Program p,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_firstwhile2rootbranch_29_3_solveCSP_binding = pattern_firstwhile2rootbranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, g, p2g, p, ruleResult);
		if (result_pattern_firstwhile2rootbranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_29_3_solveCSP_black = pattern_firstwhile2rootbranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, g, p2g, p, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_29_4_checkCSP_expressionFBB(firstwhile2rootbranch _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_5_checknacs_blackBBB(Graph g, P2G p2g, Program p) {
		return new Object[] { g, p2g, p };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_6_perform_blackBBBB(Graph g, P2G p2g, Program p,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { g, p2g, p, ruleResult };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_6_perform_greenFBFFBFFFB(Graph g, Program p,
			ModelgeneratorRuleResult ruleResult) {
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		While w = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(f2r);
		ruleResult.getSourceObjects().add(l);
		f2r.setTarget(b);
		g.setRoot(b);
		ruleResult.getTargetObjects().add(b);
		l2d.setSource(l);
		ruleResult.getCorrObjects().add(l2d);
		d.setNext(b);
		l2d.setTarget(d);
		ruleResult.getTargetObjects().add(d);
		p.setFirst(w);
		f2r.setSource(w);
		w.setLast(l);
		ruleResult.getSourceObjects().add(w);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { f2r, g, l, b, p, l2d, d, w, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_firstwhile2rootbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //firstwhile2rootbranchImpl
