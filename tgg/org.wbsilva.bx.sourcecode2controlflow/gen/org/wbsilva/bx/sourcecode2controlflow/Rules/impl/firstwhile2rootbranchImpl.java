/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
import controlflow.Command;
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
import org.wbsilva.bx.sourcecode2controlflow.Rules.firstwhile2rootbranch;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
import org.wbsilva.bx.sourcecode2controlflow.S2N;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

import sourcecode.Assignment;
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
	public boolean isAppropriate_FWD(Match match, Program p, While w, Assignment l) {

		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_0_1_initialbindings_blackBBBBB(this, match, p, w, l);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[w] = " + w + ", " + "[l] = " + l + ".");
		}

		Object[] result2_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, p, w, l);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[w] = " + w + ", " + "[l] = " + l + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_blackBBBB(match, p, w, l);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[w] = " + w + ", " + "[l] = " + l + ".");
			}
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_greenBBBBFF(match,
					p, w, l);
			//nothing EMoflonEdge w__l____last = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge p__w____first = (EMoflonEdge) result4_green[5];

			Object[] result5_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_0_5_collectcontextelements_blackBBBB(match, p, w, l);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[w] = " + w + ", " + "[l] = " + l + ".");
			}
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_5_collectcontextelements_greenBB(match, p);

			// 
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, p, w, l);
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
		Program p = (Program) result1_bindingAndBlack[0];
		P2G p2g = (P2G) result1_bindingAndBlack[1];
		Graph g = (Graph) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Assignment l = (Assignment) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_1_performtransformation_greenFBFFBFB(g, w, l);
		Command d = (Command) result1_green[0];
		Branch b = (Branch) result1_green[2];
		S2N l2d = (S2N) result1_green[3];
		S2B f2r = (S2B) result1_green[5];

		Object[] result2_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_blackBBBBBB(d, b, l2d, w, f2r, l);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[l2d] = "
							+ l2d + ", " + "[w] = " + w + ", " + "[f2r] = " + f2r + ", " + "[l] = " + l + ".");
		}
		Object[] result2_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_greenFBBBBBB(d, b, l2d, w, f2r, l);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, d, p, p2g, g, b, l2d,
						w, f2r, l);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[p] = " + p + ", " + "[p2g] = " + p2g + ", " + "[g] = " + g + ", "
					+ "[b] = " + b + ", " + "[l2d] = " + l2d + ", " + "[w] = " + w + ", " + "[f2r] = " + f2r + ", "
					+ "[l] = " + l + ".");
		}
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, d, p, g, b, l2d, w, f2r, l);
		//nothing EMoflonEdge l2d__d____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge f2r__w____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge l2d__l____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, d, p, p2g, g, b, l2d, w, f2r, l);
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
		Program p = (Program) result2_binding[0];
		While w = (While) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_2_2_corematch_blackBFFBBB(p, w, l, match)) {
			P2G p2g = (P2G) result2_black[1];
			Graph g = (Graph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_2_3_findcontext_blackBBBBB(p, p2g, g, w, l)) {
				Object[] result3_green = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_2_3_findcontext_greenBBBBBFFFFF(p, p2g, g, w, l);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, p,
								p2g, g, w, l);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[p2g] = "
							+ p2g + ", " + "[g] = " + g + ", " + "[w] = " + w + ", " + "[l] = " + l + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Program p, While w, Assignment l) {
		match.registerObject("p", p);
		match.registerObject("w", w);
		match.registerObject("l", l);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Program p, While w, Assignment l) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g, While w,
			Assignment l) {// Create CSP
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
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("l", l);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d, EObject p, EObject p2g, EObject g,
			EObject b, EObject l2d, EObject w, EObject f2r, EObject l) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2d", l2d);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("l", l);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command d, Graph g, Branch b) {

		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_10_1_initialbindings_blackBBBBB(this, match, d, g, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[g] = " + g + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, d, g, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[g] = " + g + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_blackBBBB(match, d, g, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[g] = " + g + ", " + "[b] = " + b + ".");
			}
			firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_greenBBBBFF(match, d, g, b);
			//nothing EMoflonEdge d__b____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge g__b____root = (EMoflonEdge) result4_green[5];

			Object[] result5_black = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_10_5_collectcontextelements_blackBBBB(match, d, g, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[g] = " + g + ", " + "[b] = " + b + ".");
			}
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_5_collectcontextelements_greenBB(match, g);

			// 
			firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, d, g, b);
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
		Command d = (Command) result1_bindingAndBlack[0];
		Program p = (Program) result1_bindingAndBlack[1];
		P2G p2g = (P2G) result1_bindingAndBlack[2];
		Graph g = (Graph) result1_bindingAndBlack[3];
		Branch b = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_1_performtransformation_greenBBBFFFF(d, p, b);
		S2N l2d = (S2N) result1_green[3];
		While w = (While) result1_green[4];
		S2B f2r = (S2B) result1_green[5];
		Assignment l = (Assignment) result1_green[6];

		Object[] result2_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_blackBBBBBB(d, b, l2d, w, f2r, l);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[l2d] = "
							+ l2d + ", " + "[w] = " + w + ", " + "[f2r] = " + f2r + ", " + "[l] = " + l + ".");
		}
		Object[] result2_green = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_greenFBBBBBB(d, b, l2d, w, f2r, l);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, d, p, p2g, g, b,
						l2d, w, f2r, l);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[p] = " + p + ", " + "[p2g] = " + p2g + ", " + "[g] = " + g + ", "
					+ "[b] = " + b + ", " + "[l2d] = " + l2d + ", " + "[w] = " + w + ", " + "[f2r] = " + f2r + ", "
					+ "[l] = " + l + ".");
		}
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, d, p, g, b, l2d, w, f2r, l);
		//nothing EMoflonEdge l2d__d____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge f2r__w____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge l2d__l____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, d, p, p2g, g, b, l2d, w, f2r, l);
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
		Command d = (Command) result2_binding[0];
		Graph g = (Graph) result2_binding[1];
		Branch b = (Branch) result2_binding[2];
		for (Object[] result2_black : firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_12_2_corematch_blackBFFBBB(d, g, b, match)) {
			Program p = (Program) result2_black[1];
			P2G p2g = (P2G) result2_black[2];
			// ForEach 
			for (Object[] result3_black : firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_12_3_findcontext_blackBBBBB(d, p, p2g, g, b)) {
				Object[] result3_green = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_12_3_findcontext_greenBBBBBFFFFF(d, p, p2g, g, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, d,
								p, p2g, g, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[p] = " + p
							+ ", " + "[p2g] = " + p2g + ", " + "[g] = " + g + ", " + "[b] = " + b + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command d, Graph g, Branch b) {
		match.registerObject("d", d);
		match.registerObject("g", g);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command d, Graph g, Branch b) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command d, Program p, P2G p2g, Graph g,
			Branch b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d, EObject p, EObject p2g, EObject g,
			EObject b, EObject l2d, EObject w, EObject f2r, EObject l) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2d", l2d);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("l", l);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_134(EMoflonEdge _edge_next) {

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
				.pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			Command d = (Command) result2_black[0];
			Graph g = (Graph) result2_black[1];
			Branch b = (Branch) result2_black[2];
			Object[] result2_green = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, d, g, b)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_134(EMoflonEdge _edge_last) {

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
				.pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_blackFFFB(_edge_last)) {
			Program p = (Program) result2_black[0];
			While w = (While) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			Object[] result2_green = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, p, w, l)) {
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
		Command d = (Command) result2_bindingAndBlack[0];
		Program p = (Program) result2_bindingAndBlack[1];
		Graph g = (Graph) result2_bindingAndBlack[2];
		Branch b = (Branch) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, d, p, g, b, w, l,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[p] = " + p + ", " + "[g] = " + g + ", " + "[b] = " + b + ", " + "[w] = "
					+ w + ", " + "[l] = " + l + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_24_5_matchcorrcontext_blackBFBBB(p, g, sourceMatch, targetMatch)) {
				P2G p2g = (P2G) result5_black[1];
				Object[] result5_green = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_24_5_matchcorrcontext_greenBBBF(p2g, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_24_6_createcorrespondence_blackBBBBBBB(d, p, g, b, w, l,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[p] = " + p + ", " + "[g] = " + g + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
							+ "[l] = " + l + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_24_6_createcorrespondence_greenBBFBFBB(d, b, w,
						l, ccMatch);
				//nothing S2N l2d = (S2N) result6_green[2];
				//nothing S2B f2r = (S2B) result6_green[4];

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
	public CSP isApplicable_solveCsp_CC(Command d, Program p, Graph g, Branch b, While w, Assignment l,
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
	public boolean checkDEC_FWD(Program p, While w, Assignment l) {// 
		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_27_1_matchtggpattern_blackBBB(p, w, l);
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
	public boolean checkDEC_BWD(Command d, Graph g, Branch b) {// 
		Object[] result1_black = firstwhile2rootbranchImpl
				.pattern_firstwhile2rootbranch_28_1_matchtggpattern_blackBBB(d, g, b);
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
			Program p = (Program) result2_black[1];
			P2G p2g = (P2G) result2_black[2];
			Graph g = (Graph) result2_black[3];

			Object[] result3_bindingAndBlack = firstwhile2rootbranchImpl
					.pattern_firstwhile2rootbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, p, p2g,
							g, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[p2g] = " + p2g
						+ ", " + "[g] = " + g + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = firstwhile2rootbranchImpl
						.pattern_firstwhile2rootbranch_29_5_checknacs_blackBBB(p, p2g, g);
				if (result5_black != null) {

					Object[] result6_black = firstwhile2rootbranchImpl
							.pattern_firstwhile2rootbranch_29_6_perform_blackBBBB(p, p2g, g, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", "
								+ "[p2g] = " + p2g + ", " + "[g] = " + g + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					firstwhile2rootbranchImpl.pattern_firstwhile2rootbranch_29_6_perform_greenFBBFFFFFB(p, g,
							ruleResult);
					//nothing Command d = (Command) result6_green[0];
					//nothing Branch b = (Branch) result6_green[3];
					//nothing S2N l2d = (S2N) result6_green[4];
					//nothing While w = (While) result6_green[5];
					//nothing S2B f2r = (S2B) result6_green[6];
					//nothing Assignment l = (Assignment) result6_green[7];

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
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_FWD__MATCH_PROGRAM_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Program) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROGRAM_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Program) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
			return null;
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROGRAM_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Program) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROGRAM_P2G_GRAPH_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1),
					(P2G) arguments.get(2), (Graph) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
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
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_BWD__MATCH_COMMAND_GRAPH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Graph) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_GRAPH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Graph) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_GRAPH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Graph) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_PROGRAM_P2G_GRAPH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Program) arguments.get(2), (P2G) arguments.get(3), (Graph) arguments.get(4),
					(Branch) arguments.get(5));
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
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_134((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_134__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_134((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_PROGRAM_GRAPH_BRANCH_WHILE_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Program) arguments.get(1),
					(Graph) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_DEC_FWD__PROGRAM_WHILE_ASSIGNMENT:
			return checkDEC_FWD((Program) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___CHECK_DEC_BWD__COMMAND_GRAPH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Graph) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_P2G:
			return generateModel((RuleEntryContainer) arguments.get(0), (P2G) arguments.get(1));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROGRAM_P2G_GRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1),
					(P2G) arguments.get(2), (Graph) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIRSTWHILE2ROOTBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_1_initialbindings_blackBBBBB(
			firstwhile2rootbranch _this, Match match, Program p, While w, Assignment l) {
		return new Object[] { _this, match, p, w, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingFBBBBB(firstwhile2rootbranch _this,
			Match match, Program p, While w, Assignment l) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, p, w, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, w, l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			firstwhile2rootbranch _this, Match match, Program p, While w, Assignment l) {
		Object[] result_pattern_firstwhile2rootbranch_0_2_SolveCSP_binding = pattern_firstwhile2rootbranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, p, w, l);
		if (result_pattern_firstwhile2rootbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_0_2_SolveCSP_black = pattern_firstwhile2rootbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p, w, l };
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
			Program p, While w, Assignment l) {
		return new Object[] { match, p, w, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Program p, While w, Assignment l) {
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(l);
		String w__l____last_name_prime = "last";
		String p__w____first_name_prime = "first";
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(w__l____last);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		match.getToBeTranslatedEdges().add(p__w____first);
		w__l____last.setName(w__l____last_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		return new Object[] { match, p, w, l, w__l____last, p__w____first };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_5_collectcontextelements_blackBBBB(Match match,
			Program p, While w, Assignment l) {
		return new Object[] { match, p, w, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_0_5_collectcontextelements_greenBB(Match match,
			Program p) {
		match.getContextNodes().add(p);
		return new Object[] { match, p };
	}

	public static final void pattern_firstwhile2rootbranch_0_6_registerobjectstomatch_expressionBBBBB(
			firstwhile2rootbranch _this, Match match, Program p, While w, Assignment l) {
		_this.registerObjectsToMatch_FWD(match, p, w, l);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_2 = isApplicableMatch.getObject("g");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("l");
		EObject tmpP = _localVariable_0;
		EObject tmpP2g = _localVariable_1;
		EObject tmpG = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpL = _localVariable_4;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpP2g instanceof P2G) {
				P2G p2g = (P2G) tmpP2g;
				if (tmpG instanceof Graph) {
					Graph g = (Graph) tmpG;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							return new Object[] { p, p2g, g, w, l, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_blackBBBBBFBB(Program p,
			P2G p2g, Graph g, While w, Assignment l, firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, p2g, g, w, l, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding = pattern_firstwhile2rootbranch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding != null) {
			Program p = (Program) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[0];
			P2G p2g = (P2G) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[1];
			Graph g = (Graph) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[3];
			Assignment l = (Assignment) result_pattern_firstwhile2rootbranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_firstwhile2rootbranch_1_1_performtransformation_black = pattern_firstwhile2rootbranch_1_1_performtransformation_blackBBBBBFBB(
					p, p2g, g, w, l, _this, isApplicableMatch);
			if (result_pattern_firstwhile2rootbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstwhile2rootbranch_1_1_performtransformation_black[5];

				return new Object[] { p, p2g, g, w, l, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_1_performtransformation_greenFBFFBFB(Graph g, While w,
			Assignment l) {
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d.setNext(b);
		g.setRoot(b);
		l2d.setTarget(d);
		l2d.setSource(l);
		f2r.setSource(w);
		f2r.setTarget(b);
		return new Object[] { d, g, b, l2d, w, f2r, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_blackBBBBBB(Command d,
			Branch b, S2N l2d, While w, S2B f2r, Assignment l) {
		return new Object[] { d, b, l2d, w, f2r, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_2_collecttranslatedelements_greenFBBBBBB(Command d,
			Branch b, S2N l2d, While w, S2B f2r, Assignment l) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2d);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getTranslatedElements().add(l);
		return new Object[] { ruleresult, d, b, l2d, w, f2r, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject p, EObject p2g, EObject g, EObject b, EObject l2d,
			EObject w, EObject f2r, EObject l) {
		if (!d.equals(p)) {
			if (!d.equals(p2g)) {
				if (!d.equals(g)) {
					if (!d.equals(l2d)) {
						if (!d.equals(w)) {
							if (!d.equals(f2r)) {
								if (!d.equals(l)) {
									if (!p.equals(p2g)) {
										if (!p.equals(w)) {
											if (!p2g.equals(w)) {
												if (!g.equals(p)) {
													if (!g.equals(p2g)) {
														if (!g.equals(l2d)) {
															if (!g.equals(w)) {
																if (!g.equals(l)) {
																	if (!b.equals(d)) {
																		if (!b.equals(p)) {
																			if (!b.equals(p2g)) {
																				if (!b.equals(g)) {
																					if (!b.equals(l2d)) {
																						if (!b.equals(w)) {
																							if (!b.equals(f2r)) {
																								if (!b.equals(l)) {
																									if (!l2d.equals(
																											p)) {
																										if (!l2d.equals(
																												p2g)) {
																											if (!l2d.equals(
																													w)) {
																												if (!f2r.equals(
																														p)) {
																													if (!f2r.equals(
																															p2g)) {
																														if (!f2r.equals(
																																g)) {
																															if (!f2r.equals(
																																	l2d)) {
																																if (!f2r.equals(
																																		w)) {
																																	if (!f2r.equals(
																																			l)) {
																																		if (!l.equals(
																																				p)) {
																																			if (!l.equals(
																																					p2g)) {
																																				if (!l.equals(
																																						l2d)) {
																																					if (!l.equals(
																																							w)) {
																																						return new Object[] {
																																								ruleresult,
																																								d,
																																								p,
																																								p2g,
																																								g,
																																								b,
																																								l2d,
																																								w,
																																								f2r,
																																								l };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject d, EObject p, EObject g, EObject b, EObject l2d, EObject w,
			EObject f2r, EObject l) {
		EMoflonEdge l2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstwhile2rootbranch";
		String l2d__d____target_name_prime = "target";
		String d__b____next_name_prime = "next";
		String g__b____root_name_prime = "root";
		String w__l____last_name_prime = "last";
		String p__w____first_name_prime = "first";
		String f2r__w____source_name_prime = "source";
		String f2r__b____target_name_prime = "target";
		String l2d__l____source_name_prime = "source";
		l2d__d____target.setSrc(l2d);
		l2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(l2d__d____target);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____next);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getCreatedEdges().add(g__b____root);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(w__l____last);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		ruleresult.getTranslatedEdges().add(p__w____first);
		f2r__w____source.setSrc(f2r);
		f2r__w____source.setTrg(w);
		ruleresult.getCreatedEdges().add(f2r__w____source);
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		l2d__l____source.setSrc(l2d);
		l2d__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2d__l____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2d__d____target.setName(l2d__d____target_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		f2r__w____source.setName(f2r__w____source_name_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		l2d__l____source.setName(l2d__l____source_name_prime);
		return new Object[] { ruleresult, d, p, g, b, l2d, w, f2r, l, l2d__d____target, d__b____next, g__b____root,
				w__l____last, p__w____first, f2r__w____source, f2r__b____target, l2d__l____source };
	}

	public static final void pattern_firstwhile2rootbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			firstwhile2rootbranch _this, PerformRuleResult ruleresult, EObject d, EObject p, EObject p2g, EObject g,
			EObject b, EObject l2d, EObject w, EObject f2r, EObject l) {
		_this.registerObjects_FWD(ruleresult, d, p, p2g, g, b, l2d, w, f2r, l);

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
		EObject _localVariable_0 = match.getObject("p");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("l");
		EObject tmpP = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpL = _localVariable_2;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					return new Object[] { p, w, l, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_2_2_corematch_blackBFFBBB(Program p, While w,
			Assignment l, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
			Graph g = p2g.getTarget();
			if (g != null) {
				_result.add(new Object[] { p, p2g, g, w, l, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_2_3_findcontext_blackBBBBB(Program p, P2G p2g,
			Graph g, While w, Assignment l) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (p.equals(p2g.getSource())) {
			if (g.equals(p2g.getTarget())) {
				if (l.equals(w.getLast())) {
					if (w.equals(p.getFirst())) {
						_result.add(new Object[] { p, p2g, g, w, l });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_3_findcontext_greenBBBBBFFFFF(Program p, P2G p2g,
			Graph g, While w, Assignment l) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		String w__l____last_name_prime = "last";
		String p__w____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(l);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(w__l____last);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		isApplicableMatch.getAllContextElements().add(p__w____first);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		return new Object[] { p, p2g, g, w, l, isApplicableMatch, p2g__p____source, p2g__g____target, w__l____last,
				p__w____first };
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_4_solveCSP_bindingFBBBBBBB(firstwhile2rootbranch _this,
			IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g, While w, Assignment l) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, p, p2g, g, w, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, w, l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g, While w,
			Assignment l) {
		Object[] result_pattern_firstwhile2rootbranch_2_4_solveCSP_binding = pattern_firstwhile2rootbranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, p, p2g, g, w, l);
		if (result_pattern_firstwhile2rootbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_2_4_solveCSP_black = pattern_firstwhile2rootbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, w, l };
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
			firstwhile2rootbranch _this, Match match, Command d, Graph g, Branch b) {
		return new Object[] { _this, match, d, g, b };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingFBBBBB(firstwhile2rootbranch _this,
			Match match, Command d, Graph g, Branch b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, d, g, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, g, b };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			firstwhile2rootbranch _this, Match match, Command d, Graph g, Branch b) {
		Object[] result_pattern_firstwhile2rootbranch_10_2_SolveCSP_binding = pattern_firstwhile2rootbranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, d, g, b);
		if (result_pattern_firstwhile2rootbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_10_2_SolveCSP_black = pattern_firstwhile2rootbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, g, b };
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
			Command d, Graph g, Branch b) {
		return new Object[] { match, d, g, b };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Command d, Graph g, Branch b) {
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		String d__b____next_name_prime = "next";
		String g__b____root_name_prime = "root";
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____next);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		match.getToBeTranslatedEdges().add(g__b____root);
		d__b____next.setName(d__b____next_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		return new Object[] { match, d, g, b, d__b____next, g__b____root };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_5_collectcontextelements_blackBBBB(Match match,
			Command d, Graph g, Branch b) {
		return new Object[] { match, d, g, b };
	}

	public static final Object[] pattern_firstwhile2rootbranch_10_5_collectcontextelements_greenBB(Match match,
			Graph g) {
		match.getContextNodes().add(g);
		return new Object[] { match, g };
	}

	public static final void pattern_firstwhile2rootbranch_10_6_registerobjectstomatch_expressionBBBBB(
			firstwhile2rootbranch _this, Match match, Command d, Graph g, Branch b) {
		_this.registerObjectsToMatch_BWD(match, d, g, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("p");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_3 = isApplicableMatch.getObject("g");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject tmpD = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpP2g = _localVariable_2;
		EObject tmpG = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpD instanceof Command) {
			Command d = (Command) tmpD;
			if (tmpP instanceof Program) {
				Program p = (Program) tmpP;
				if (tmpP2g instanceof P2G) {
					P2G p2g = (P2G) tmpP2g;
					if (tmpG instanceof Graph) {
						Graph g = (Graph) tmpG;
						if (tmpB instanceof Branch) {
							Branch b = (Branch) tmpB;
							return new Object[] { d, p, p2g, g, b, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_blackBBBBBFBB(Command d,
			Program p, P2G p2g, Graph g, Branch b, firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { d, p, p2g, g, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding = pattern_firstwhile2rootbranch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding != null) {
			Command d = (Command) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[0];
			Program p = (Program) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[1];
			P2G p2g = (P2G) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[2];
			Graph g = (Graph) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[3];
			Branch b = (Branch) result_pattern_firstwhile2rootbranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_firstwhile2rootbranch_11_1_performtransformation_black = pattern_firstwhile2rootbranch_11_1_performtransformation_blackBBBBBFBB(
					d, p, p2g, g, b, _this, isApplicableMatch);
			if (result_pattern_firstwhile2rootbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstwhile2rootbranch_11_1_performtransformation_black[5];

				return new Object[] { d, p, p2g, g, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_1_performtransformation_greenBBBFFFF(Command d,
			Program p, Branch b) {
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While w = SourcecodeFactory.eINSTANCE.createWhile();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		l2d.setTarget(d);
		p.setFirst(w);
		f2r.setSource(w);
		f2r.setTarget(b);
		w.setLast(l);
		l2d.setSource(l);
		return new Object[] { d, p, b, l2d, w, f2r, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_blackBBBBBB(Command d,
			Branch b, S2N l2d, While w, S2B f2r, Assignment l) {
		return new Object[] { d, b, l2d, w, f2r, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_2_collecttranslatedelements_greenFBBBBBB(Command d,
			Branch b, S2N l2d, While w, S2B f2r, Assignment l) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2d);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getCreatedElements().add(l);
		return new Object[] { ruleresult, d, b, l2d, w, f2r, l };
	}

	public static final Object[] pattern_firstwhile2rootbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject p, EObject p2g, EObject g, EObject b, EObject l2d,
			EObject w, EObject f2r, EObject l) {
		if (!d.equals(p)) {
			if (!d.equals(p2g)) {
				if (!d.equals(g)) {
					if (!d.equals(l2d)) {
						if (!d.equals(w)) {
							if (!d.equals(f2r)) {
								if (!d.equals(l)) {
									if (!p.equals(p2g)) {
										if (!p.equals(w)) {
											if (!p2g.equals(w)) {
												if (!g.equals(p)) {
													if (!g.equals(p2g)) {
														if (!g.equals(l2d)) {
															if (!g.equals(w)) {
																if (!g.equals(l)) {
																	if (!b.equals(d)) {
																		if (!b.equals(p)) {
																			if (!b.equals(p2g)) {
																				if (!b.equals(g)) {
																					if (!b.equals(l2d)) {
																						if (!b.equals(w)) {
																							if (!b.equals(f2r)) {
																								if (!b.equals(l)) {
																									if (!l2d.equals(
																											p)) {
																										if (!l2d.equals(
																												p2g)) {
																											if (!l2d.equals(
																													w)) {
																												if (!f2r.equals(
																														p)) {
																													if (!f2r.equals(
																															p2g)) {
																														if (!f2r.equals(
																																g)) {
																															if (!f2r.equals(
																																	l2d)) {
																																if (!f2r.equals(
																																		w)) {
																																	if (!f2r.equals(
																																			l)) {
																																		if (!l.equals(
																																				p)) {
																																			if (!l.equals(
																																					p2g)) {
																																				if (!l.equals(
																																						l2d)) {
																																					if (!l.equals(
																																							w)) {
																																						return new Object[] {
																																								ruleresult,
																																								d,
																																								p,
																																								p2g,
																																								g,
																																								b,
																																								l2d,
																																								w,
																																								f2r,
																																								l };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject d, EObject p, EObject g, EObject b, EObject l2d, EObject w,
			EObject f2r, EObject l) {
		EMoflonEdge l2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstwhile2rootbranch";
		String l2d__d____target_name_prime = "target";
		String d__b____next_name_prime = "next";
		String g__b____root_name_prime = "root";
		String w__l____last_name_prime = "last";
		String p__w____first_name_prime = "first";
		String f2r__w____source_name_prime = "source";
		String f2r__b____target_name_prime = "target";
		String l2d__l____source_name_prime = "source";
		l2d__d____target.setSrc(l2d);
		l2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(l2d__d____target);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____next);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getTranslatedEdges().add(g__b____root);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(w__l____last);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		ruleresult.getCreatedEdges().add(p__w____first);
		f2r__w____source.setSrc(f2r);
		f2r__w____source.setTrg(w);
		ruleresult.getCreatedEdges().add(f2r__w____source);
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		l2d__l____source.setSrc(l2d);
		l2d__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2d__l____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2d__d____target.setName(l2d__d____target_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		f2r__w____source.setName(f2r__w____source_name_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		l2d__l____source.setName(l2d__l____source_name_prime);
		return new Object[] { ruleresult, d, p, g, b, l2d, w, f2r, l, l2d__d____target, d__b____next, g__b____root,
				w__l____last, p__w____first, f2r__w____source, f2r__b____target, l2d__l____source };
	}

	public static final void pattern_firstwhile2rootbranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			firstwhile2rootbranch _this, PerformRuleResult ruleresult, EObject d, EObject p, EObject p2g, EObject g,
			EObject b, EObject l2d, EObject w, EObject f2r, EObject l) {
		_this.registerObjects_BWD(ruleresult, d, p, p2g, g, b, l2d, w, f2r, l);

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
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("g");
		EObject _localVariable_2 = match.getObject("b");
		EObject tmpD = _localVariable_0;
		EObject tmpG = _localVariable_1;
		EObject tmpB = _localVariable_2;
		if (tmpD instanceof Command) {
			Command d = (Command) tmpD;
			if (tmpG instanceof Graph) {
				Graph g = (Graph) tmpG;
				if (tmpB instanceof Branch) {
					Branch b = (Branch) tmpB;
					return new Object[] { d, g, b, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_12_2_corematch_blackBFFBBB(Command d, Graph g,
			Branch b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
			Program p = p2g.getSource();
			if (p != null) {
				_result.add(new Object[] { d, p, p2g, g, b, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_12_3_findcontext_blackBBBBB(Command d,
			Program p, P2G p2g, Graph g, Branch b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (p.equals(p2g.getSource())) {
			if (g.equals(p2g.getTarget())) {
				if (b.equals(d.getNext())) {
					if (b.equals(g.getRoot())) {
						_result.add(new Object[] { d, p, p2g, g, b });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_3_findcontext_greenBBBBBFFFFF(Command d, Program p,
			P2G p2g, Graph g, Branch b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		String d__b____next_name_prime = "next";
		String g__b____root_name_prime = "root";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(b);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____next);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		isApplicableMatch.getAllContextElements().add(g__b____root);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		return new Object[] { d, p, p2g, g, b, isApplicableMatch, p2g__p____source, p2g__g____target, d__b____next,
				g__b____root };
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_4_solveCSP_bindingFBBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Command d, Program p, P2G p2g, Graph g,
			Branch b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, p, p2g, g, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, p, p2g, g, b };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Command d, Program p, P2G p2g, Graph g,
			Branch b) {
		Object[] result_pattern_firstwhile2rootbranch_12_4_solveCSP_binding = pattern_firstwhile2rootbranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, d, p, p2g, g, b);
		if (result_pattern_firstwhile2rootbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_12_4_solveCSP_black = pattern_firstwhile2rootbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, p, p2g, g, b };
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

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_0BB(Command d,
			Graph g) {
		for (Graph __DEC_d_root_8272 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			if (!g.equals(__DEC_d_root_8272)) {
				return new Object[] { d, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_1BB(Command d,
			Branch b) {
		for (Branch __DEC_d_positive_293820 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_d_positive_293820)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_2BB(Command d,
			Branch b) {
		for (Branch __DEC_d_negative_709685 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_d_negative_709685)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_3BB(Branch b,
			Graph g) {
		for (Graph __DEC_b_root_100465 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_100465)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_4B(Branch b) {
		for (Branch __DEC_b_positive_509748 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_509748)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_5B(Branch b) {
		for (Branch __DEC_b_negative_115698 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_115698)) {
				return new Object[] { b };
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
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_next.getSrc();
		if (tmpD instanceof Command) {
			Command d = (Command) tmpD;
			EObject tmpB = _edge_next.getTrg();
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (b.equals(d.getNext())) {
					if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_1BB(d, b) == null) {
						if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_2BB(d, b) == null) {
							if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_4B(b) == null) {
								if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_5B(b) == null) {
									if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_7BB(b,
											d) == null) {
										if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_8BB(b,
												d) == null) {
											for (Graph g : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(b, Graph.class, "root")) {
												if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_0BB(
														d, g) == null) {
													if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_3BB(
															b, g) == null) {
														if (pattern_firstwhile2rootbranch_20_2_testcorematchandDECs_black_nac_6BB(
																g, d) == null) {
															_result.add(new Object[] { d, g, b, _edge_next });
														}
													}
												}
											}
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
			firstwhile2rootbranch _this, Match match, Command d, Graph g, Branch b) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, d, g, b);
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

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_0B(While w) {
		for (Decision __DEC_w_positive_153157 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "positive")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_1B(While w) {
		for (Decision __DEC_w_negative_5206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "negative")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_2B(While w) {
		for (While __DEC_w_first_939999 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "first")) {
			if (!w.equals(__DEC_w_first_939999)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_3B(While w) {
		for (While __DEC_w_last_697773 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "last")) {
			if (!w.equals(__DEC_w_last_697773)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_4B(Assignment l) {
		for (Decision __DEC_l_positive_72594 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_5B(Assignment l) {
		for (Decision __DEC_l_negative_47265 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_6BB(Assignment l,
			While w) {
		for (While __DEC_l_first_663971 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!w.equals(__DEC_l_first_663971)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_7BB(Assignment l,
			While w) {
		for (While __DEC_l_last_269880 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!w.equals(__DEC_l_last_269880)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Program p) {
		for (Program __DEC_l_first_728433 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			if (!p.equals(__DEC_l_first_728433)) {
				return new Object[] { l, p };
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
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_last.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(w.getLast())) {
					if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_0B(w) == null) {
						if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_1B(w) == null) {
							if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_2B(w) == null) {
								if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_3B(w) == null) {
									if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_4B(
											l) == null) {
										if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_5B(
												l) == null) {
											if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_6BB(l,
													w) == null) {
												if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_7BB(
														l, w) == null) {
													if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_9BB(
															w, l) == null) {
														for (Program p : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(w, Program.class, "first")) {
															if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_8BB(
																	l, p) == null) {
																if (pattern_firstwhile2rootbranch_21_2_testcorematchandDECs_black_nac_10BB(
																		p, l) == null) {
																	_result.add(new Object[] { p, w, l, _edge_last });
																}
															}
														}
													}
												}
											}
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
			firstwhile2rootbranch _this, Match match, Program p, While w, Assignment l) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, p, w, l);
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
		EObject _localVariable_0 = targetMatch.getObject("d");
		EObject _localVariable_1 = sourceMatch.getObject("p");
		EObject _localVariable_2 = targetMatch.getObject("g");
		EObject _localVariable_3 = targetMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject tmpD = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpG = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpL = _localVariable_5;
		if (tmpD instanceof Command) {
			Command d = (Command) tmpD;
			if (tmpP instanceof Program) {
				Program p = (Program) tmpP;
				if (tmpG instanceof Graph) {
					Graph g = (Graph) tmpG;
					if (tmpB instanceof Branch) {
						Branch b = (Branch) tmpB;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								return new Object[] { d, p, g, b, w, l, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Command d,
			Program p, Graph g, Branch b, While w, Assignment l, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { d, p, g, b, w, l, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding = pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding != null) {
			Command d = (Command) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[0];
			Program p = (Program) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[1];
			Graph g = (Graph) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[2];
			Branch b = (Branch) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_black = pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					d, p, g, b, w, l, sourceMatch, targetMatch);
			if (result_pattern_firstwhile2rootbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, p, g, b, w, l, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_3_solvecsp_bindingFBBBBBBBBB(
			firstwhile2rootbranch _this, Command d, Program p, Graph g, Branch b, While w, Assignment l,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(d, p, g, b, w, l, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, d, p, g, b, w, l, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			firstwhile2rootbranch _this, Command d, Program p, Graph g, Branch b, While w, Assignment l,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstwhile2rootbranch_24_3_solvecsp_binding = pattern_firstwhile2rootbranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, d, p, g, b, w, l, sourceMatch, targetMatch);
		if (result_pattern_firstwhile2rootbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_24_3_solvecsp_black = pattern_firstwhile2rootbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, p, g, b, w, l, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_firstwhile2rootbranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstwhile2rootbranch_24_5_matchcorrcontext_blackBFBBB(Program p,
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

	public static final Object[] pattern_firstwhile2rootbranch_24_6_createcorrespondence_blackBBBBBBB(Command d,
			Program p, Graph g, Branch b, While w, Assignment l, CCMatch ccMatch) {
		return new Object[] { d, p, g, b, w, l, ccMatch };
	}

	public static final Object[] pattern_firstwhile2rootbranch_24_6_createcorrespondence_greenBBFBFBB(Command d,
			Branch b, While w, Assignment l, CCMatch ccMatch) {
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2d.setTarget(d);
		l2d.setSource(l);
		ccMatch.getCreateCorr().add(l2d);
		f2r.setSource(w);
		f2r.setTarget(b);
		ccMatch.getCreateCorr().add(f2r);
		return new Object[] { d, b, l2d, w, f2r, l, ccMatch };
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

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_0B(While w) {
		for (Decision __DEC_w_positive_416021 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "positive")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_1B(While w) {
		for (Decision __DEC_w_negative_595117 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "negative")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_2B(While w) {
		for (While __DEC_w_first_198747 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "first")) {
			if (!w.equals(__DEC_w_first_198747)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_3B(While w) {
		for (While __DEC_w_last_780732 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "last")) {
			if (!w.equals(__DEC_w_last_780732)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_4B(Assignment l) {
		for (Decision __DEC_l_positive_907215 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_5B(Assignment l) {
		for (Decision __DEC_l_negative_426251 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_6BB(Assignment l,
			While w) {
		for (While __DEC_l_first_566487 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!w.equals(__DEC_l_first_566487)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_7BB(Assignment l,
			While w) {
		for (While __DEC_l_last_12716 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!w.equals(__DEC_l_last_12716)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_8BB(Assignment l,
			Program p) {
		for (Program __DEC_l_first_357849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			if (!p.equals(__DEC_l_first_357849)) {
				return new Object[] { l, p };
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

	public static final Object[] pattern_firstwhile2rootbranch_27_1_matchtggpattern_blackBBB(Program p, While w,
			Assignment l) {
		if (l.equals(w.getLast())) {
			if (w.equals(p.getFirst())) {
				if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_0B(w) == null) {
					if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_1B(w) == null) {
						if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_2B(w) == null) {
							if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_3B(w) == null) {
								if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_4B(l) == null) {
									if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_5B(l) == null) {
										if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_6BB(l,
												w) == null) {
											if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_7BB(l,
													w) == null) {
												if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_8BB(l,
														p) == null) {
													if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_9BB(
															w, l) == null) {
														if (pattern_firstwhile2rootbranch_27_1_matchtggpattern_black_nac_10BB(
																p, l) == null) {
															return new Object[] { p, w, l };
														}
													}
												}
											}
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

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_0BB(Command d, Graph g) {
		for (Graph __DEC_d_root_93395 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			if (!g.equals(__DEC_d_root_93395)) {
				return new Object[] { d, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_1BB(Command d, Branch b) {
		for (Branch __DEC_d_positive_322626 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_d_positive_322626)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_2BB(Command d, Branch b) {
		for (Branch __DEC_d_negative_663390 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_d_negative_663390)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_3BB(Branch b, Graph g) {
		for (Graph __DEC_b_root_616864 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_616864)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_4B(Branch b) {
		for (Branch __DEC_b_positive_588813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_588813)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_5B(Branch b) {
		for (Branch __DEC_b_negative_270032 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_270032)) {
				return new Object[] { b };
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

	public static final Object[] pattern_firstwhile2rootbranch_28_1_matchtggpattern_blackBBB(Command d, Graph g,
			Branch b) {
		if (b.equals(d.getNext())) {
			if (b.equals(g.getRoot())) {
				if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_0BB(d, g) == null) {
					if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_1BB(d, b) == null) {
						if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_2BB(d, b) == null) {
							if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_3BB(b, g) == null) {
								if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_4B(b) == null) {
									if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_5B(b) == null) {
										if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_6BB(g,
												d) == null) {
											if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_7BB(b,
													d) == null) {
												if (pattern_firstwhile2rootbranch_28_1_matchtggpattern_black_nac_8BB(b,
														d) == null) {
													return new Object[] { d, g, b };
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Program p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
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
			ModelgeneratorRuleResult ruleResult, Graph g) {
		if (ruleResult.getTargetObjects().contains(g)) {
			return new Object[] { ruleResult, g };
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
					Program p = p2g.getSource();
					if (p != null) {
						Graph g = p2g.getTarget();
						if (g != null) {
							if (pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									p2g) == null) {
								if (pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										p) == null) {
									if (pattern_firstwhile2rootbranch_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											g) == null) {
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

	public static final Object[] pattern_firstwhile2rootbranch_29_3_solveCSP_bindingFBBBBBB(firstwhile2rootbranch _this,
			IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, p, p2g, g, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			firstwhile2rootbranch _this, IsApplicableMatch isApplicableMatch, Program p, P2G p2g, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_firstwhile2rootbranch_29_3_solveCSP_binding = pattern_firstwhile2rootbranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, p2g, g, ruleResult);
		if (result_pattern_firstwhile2rootbranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstwhile2rootbranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_firstwhile2rootbranch_29_3_solveCSP_black = pattern_firstwhile2rootbranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_firstwhile2rootbranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, p2g, g, ruleResult };
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

	public static final Object[] pattern_firstwhile2rootbranch_29_5_checknacs_blackBBB(Program p, P2G p2g, Graph g) {
		return new Object[] { p, p2g, g };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_6_perform_blackBBBB(Program p, P2G p2g, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { p, p2g, g, ruleResult };
	}

	public static final Object[] pattern_firstwhile2rootbranch_29_6_perform_greenFBBFFFFFB(Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While w = SourcecodeFactory.eINSTANCE.createWhile();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(d);
		d.setNext(b);
		g.setRoot(b);
		ruleResult.getTargetObjects().add(b);
		l2d.setTarget(d);
		ruleResult.getCorrObjects().add(l2d);
		p.setFirst(w);
		ruleResult.getSourceObjects().add(w);
		f2r.setSource(w);
		f2r.setTarget(b);
		ruleResult.getCorrObjects().add(f2r);
		w.setLast(l);
		l2d.setSource(l);
		ruleResult.getSourceObjects().add(l);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d, p, g, b, l2d, w, f2r, l, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_firstwhile2rootbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //firstwhile2rootbranchImpl
