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
import org.wbsilva.bx.sourcecode2controlflow.Rules.firstuwhile2rootubranch;

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
 * An implementation of the model object '<em><b>firstuwhile2rootubranch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class firstuwhile2rootubranchImpl extends AbstractRuleImpl implements firstuwhile2rootubranch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected firstuwhile2rootubranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getfirstuwhile2rootubranch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While w, Assignment l, Program p) {

		Object[] result1_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_0_1_initialbindings_blackBBBBB(this, match, w, l, p);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[l] = " + l + ", " + "[p] = " + p + ".");
		}

		Object[] result2_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, w, l, p);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[l] = " + l + ", " + "[p] = " + p + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_0_4_collectelementstobetranslated_blackBBBB(match, w, l, p);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[l] = " + l + ", " + "[p] = " + p + ".");
			}
			firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_0_4_collectelementstobetranslated_greenBBBBFFF(match, w, l, p);
			//nothing EMoflonEdge w__l____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge p__w____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__l____last = (EMoflonEdge) result4_green[6];

			Object[] result5_black = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_0_5_collectcontextelements_blackBBBB(match, w, l, p);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[l] = " + l + ", " + "[p] = " + p + ".");
			}
			firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_0_5_collectcontextelements_greenBB(match, p);

			// 
			firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, w, l, p);
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_0_7_expressionF();
		} else {
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		P2G p2g = (P2G) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Assignment l = (Assignment) result1_bindingAndBlack[2];
		Program p = (Program) result1_bindingAndBlack[3];
		Graph g = (Graph) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_1_1_performtransformation_greenFFBFBBF(w, l, g);
		S2N l2d = (S2N) result1_green[0];
		S2B f2r = (S2B) result1_green[1];
		Branch b = (Branch) result1_green[3];
		Command d = (Command) result1_green[6];

		Object[] result2_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_1_2_collecttranslatedelements_blackBBBBBB(l2d, f2r, w, b, l, d);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[l2d] = " + l2d + ", " + "[f2r] = " + f2r + ", "
							+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[d] = " + d + ".");
		}
		Object[] result2_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_1_2_collecttranslatedelements_greenFBBBBBB(l2d, f2r, w, b, l, d);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, l2d, p2g, f2r, w,
						b, l, p, g, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l2d] = " + l2d + ", " + "[p2g] = " + p2g + ", " + "[f2r] = " + f2r + ", " + "[w] = " + w
					+ ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[g] = " + g + ", "
					+ "[d] = " + d + ".");
		}
		firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
				ruleresult, l2d, f2r, w, b, l, p, g, d);
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge w__l____first = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge f2r__w____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b__d____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge l2d__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2d__d____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[18];

		// 
		// 
		firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, l2d, p2g, f2r, w, b, l, p, g, d);
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While w = (While) result2_binding[0];
		Assignment l = (Assignment) result2_binding[1];
		Program p = (Program) result2_binding[2];
		for (Object[] result2_black : firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_2_2_corematch_blackFBBBFB(w, l, p, match)) {
			P2G p2g = (P2G) result2_black[0];
			Graph g = (Graph) result2_black[4];
			// ForEach 
			for (Object[] result3_black : firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_2_3_findcontext_blackBBBBB(p2g, w, l, p, g)) {
				Object[] result3_green = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_2_3_findcontext_greenBBBBBFFFFFF(p2g, w, l, p, g);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__l____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								p2g, w, l, p, g);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p2g] = " + p2g + ", " + "[w] = "
							+ w + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[g] = " + g + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = firstuwhile2rootubranchImpl
							.pattern_firstuwhile2rootubranch_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While w, Assignment l, Program p) {
		match.registerObject("w", w);
		match.registerObject("l", l);
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, Assignment l, Program p) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, P2G p2g, While w, Assignment l, Program p,
			Graph g) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("g", g);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l2d, EObject p2g, EObject f2r, EObject w,
			EObject b, EObject l, EObject p, EObject g, EObject d) {
		ruleresult.registerObject("l2d", l2d);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("d", d);

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
	public boolean isAppropriate_BWD(Match match, Branch b, Graph g, Command d) {

		Object[] result1_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_10_1_initialbindings_blackBBBBB(this, match, b, g, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, g, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_10_4_collectelementstobetranslated_blackBBBB(match, b, g, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
			}
			firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_10_4_collectelementstobetranslated_greenBBBBFFF(match, b, g, d);
			//nothing EMoflonEdge b__d____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge g__b____root = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____next = (EMoflonEdge) result4_green[6];

			Object[] result5_black = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_10_5_collectcontextelements_blackBBBB(match, b, g, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
			}
			firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_10_5_collectcontextelements_greenBB(match, g);

			// 
			firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_10_6_registerobjectstomatch_expressionBBBBB(this, match, b, g, d);
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_10_7_expressionF();
		} else {
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		P2G p2g = (P2G) result1_bindingAndBlack[0];
		Branch b = (Branch) result1_bindingAndBlack[1];
		Program p = (Program) result1_bindingAndBlack[2];
		Graph g = (Graph) result1_bindingAndBlack[3];
		Command d = (Command) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_11_1_performtransformation_greenFFFBFBB(b, p, d);
		S2N l2d = (S2N) result1_green[0];
		S2B f2r = (S2B) result1_green[1];
		While w = (While) result1_green[2];
		Assignment l = (Assignment) result1_green[4];

		Object[] result2_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_11_2_collecttranslatedelements_blackBBBBBB(l2d, f2r, w, b, l, d);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[l2d] = " + l2d + ", " + "[f2r] = " + f2r + ", "
							+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[d] = " + d + ".");
		}
		Object[] result2_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_11_2_collecttranslatedelements_greenFBBBBBB(l2d, f2r, w, b, l, d);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, l2d, p2g, f2r, w,
						b, l, p, g, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l2d] = " + l2d + ", " + "[p2g] = " + p2g + ", " + "[f2r] = " + f2r + ", " + "[w] = " + w
					+ ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[g] = " + g + ", "
					+ "[d] = " + d + ".");
		}
		firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
				ruleresult, l2d, f2r, w, b, l, p, g, d);
		//nothing EMoflonEdge f2r__b____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge w__l____first = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge f2r__w____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge p__w____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge w__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b__d____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge l2d__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2d__d____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[18];

		// 
		// 
		firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, l2d, p2g, f2r, w, b, l, p, g, d);
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch b = (Branch) result2_binding[0];
		Graph g = (Graph) result2_binding[1];
		Command d = (Command) result2_binding[2];
		for (Object[] result2_black : firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_12_2_corematch_blackFBFBBB(b, g, d, match)) {
			P2G p2g = (P2G) result2_black[0];
			Program p = (Program) result2_black[2];
			// ForEach 
			for (Object[] result3_black : firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_12_3_findcontext_blackBBBBB(p2g, b, p, g, d)) {
				Object[] result3_green = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_12_3_findcontext_greenBBBBBFFFFFF(p2g, b, p, g, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge b__d____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge g__b____root = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__b____next = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								p2g, b, p, g, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p2g] = " + p2g + ", " + "[b] = "
							+ b + ", " + "[p] = " + p + ", " + "[g] = " + g + ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = firstuwhile2rootubranchImpl
							.pattern_firstuwhile2rootubranch_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch b, Graph g, Command d) {
		match.registerObject("b", b);
		match.registerObject("g", g);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch b, Graph g, Command d) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, P2G p2g, Branch b, Program p, Graph g,
			Command d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("g", g);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l2d, EObject p2g, EObject f2r, EObject w,
			EObject b, EObject l, EObject p, EObject g, EObject d) {
		ruleresult.registerObject("l2d", l2d);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("p", p);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_11(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Branch b = (Branch) result2_black[0];
			Graph g = (Graph) result2_black[1];
			Command d = (Command) result2_black[2];
			Object[] result2_green = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, b, g, d)) {
				// 
				if (firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = firstuwhile2rootubranchImpl
							.pattern_firstuwhile2rootubranch_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			While w = (While) result2_black[0];
			Assignment l = (Assignment) result2_black[1];
			Program p = (Program) result2_black[2];
			Object[] result2_green = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, w, l, p)) {
				// 
				if (firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = firstuwhile2rootubranchImpl
							.pattern_firstuwhile2rootubranch_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("firstuwhile2rootubranch");
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
		ruleResult.setRule("firstuwhile2rootubranch");
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

		Object[] result1_black = firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While w = (While) result2_bindingAndBlack[0];
		Branch b = (Branch) result2_bindingAndBlack[1];
		Assignment l = (Assignment) result2_bindingAndBlack[2];
		Program p = (Program) result2_bindingAndBlack[3];
		Graph g = (Graph) result2_bindingAndBlack[4];
		Command d = (Command) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, w, b, l, p, g, d,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[g] = "
					+ g + ", " + "[d] = " + d + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_24_5_matchcorrcontext_blackFBBBB(p, g, sourceMatch, targetMatch)) {
				P2G p2g = (P2G) result5_black[0];
				Object[] result5_green = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_24_5_matchcorrcontext_greenBBBF(p2g, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_24_6_createcorrespondence_blackBBBBBBB(w, b, l, p, g, d,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
							+ "[b] = " + b + ", " + "[l] = " + l + ", " + "[p] = " + p + ", " + "[g] = " + g + ", "
							+ "[d] = " + d + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_24_6_createcorrespondence_greenFFBBBBB(w, b,
						l, d, ccMatch);
				//nothing S2N l2d = (S2N) result6_green[0];
				//nothing S2B f2r = (S2B) result6_green[1];

				Object[] result7_black = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While w, Branch b, Assignment l, Program p, Graph g, Command d,
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
	public boolean checkDEC_FWD(While w, Assignment l, Program p) {// 
		Object[] result1_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_27_1_matchtggpattern_blackBBB(w, l, p);
		if (result1_black != null) {
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_27_2_expressionF();
		} else {
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch b, Graph g, Command d) {// 
		Object[] result1_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_28_1_matchtggpattern_blackBBB(b, g, d);
		if (result1_black != null) {
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_28_2_expressionF();
		} else {
			return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, P2G p2gParameter) {

		Object[] result1_black = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : firstuwhile2rootubranchImpl
				.pattern_firstuwhile2rootubranch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList p2gList = (RuleEntryList) result2_black[0];
			P2G p2g = (P2G) result2_black[1];
			Graph g = (Graph) result2_black[2];
			Program p = (Program) result2_black[3];

			Object[] result3_bindingAndBlack = firstuwhile2rootubranchImpl
					.pattern_firstuwhile2rootubranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, p2g,
							p, g, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p2g] = " + p2g + ", " + "[p] = " + p
						+ ", " + "[g] = " + g + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = firstuwhile2rootubranchImpl
						.pattern_firstuwhile2rootubranch_29_5_checknacs_blackBBB(p2g, p, g);
				if (result5_black != null) {

					Object[] result6_black = firstuwhile2rootubranchImpl
							.pattern_firstuwhile2rootubranch_29_6_perform_blackBBBB(p2g, p, g, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p2g] = " + p2g + ", "
								+ "[p] = " + p + ", " + "[g] = " + g + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_29_6_perform_greenFFFFFBBFB(p, g,
							ruleResult);
					//nothing S2N l2d = (S2N) result6_green[0];
					//nothing S2B f2r = (S2B) result6_green[1];
					//nothing While w = (While) result6_green[2];
					//nothing Branch b = (Branch) result6_green[3];
					//nothing Assignment l = (Assignment) result6_green[4];
					//nothing Command d = (Command) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return firstuwhile2rootubranchImpl.pattern_firstuwhile2rootubranch_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, P2G p2g, Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p2g", p2g);
		isApplicableMatch.registerObject("p", p);
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
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_PROGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Program) arguments.get(3));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_PROGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Program) arguments.get(3));
			return null;
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_PROGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Program) arguments.get(3));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_P2G_WHILE_ASSIGNMENT_PROGRAM_GRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (P2G) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Program) arguments.get(4),
					(Graph) arguments.get(5));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_BWD__MATCH_BRANCH_GRAPH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Graph) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_GRAPH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Graph) arguments.get(2),
					(Command) arguments.get(3));
			return null;
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_GRAPH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Graph) arguments.get(2), (Command) arguments.get(3));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_P2G_BRANCH_PROGRAM_GRAPH_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (P2G) arguments.get(1),
					(Branch) arguments.get(2), (Program) arguments.get(3), (Graph) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_BRANCH_ASSIGNMENT_PROGRAM_GRAPH_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (Program) arguments.get(3), (Graph) arguments.get(4),
					(Command) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___CHECK_DEC_FWD__WHILE_ASSIGNMENT_PROGRAM:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (Program) arguments.get(2));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___CHECK_DEC_BWD__BRANCH_GRAPH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Graph) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_P2G:
			return generateModel((RuleEntryContainer) arguments.get(0), (P2G) arguments.get(1));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_P2G_PROGRAM_GRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (P2G) arguments.get(1),
					(Program) arguments.get(2), (Graph) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_1_initialbindings_blackBBBBB(
			firstuwhile2rootubranch _this, Match match, While w, Assignment l, Program p) {
		return new Object[] { _this, match, w, l, p };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_2_SolveCSP_bindingFBBBBB(
			firstuwhile2rootubranch _this, Match match, While w, Assignment l, Program p) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, l, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, l, p };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			firstuwhile2rootubranch _this, Match match, While w, Assignment l, Program p) {
		Object[] result_pattern_firstuwhile2rootubranch_0_2_SolveCSP_binding = pattern_firstuwhile2rootubranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, w, l, p);
		if (result_pattern_firstuwhile2rootubranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_0_2_SolveCSP_black = pattern_firstuwhile2rootubranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstuwhile2rootubranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, l, p };
			}
		}
		return null;
	}

	public static final boolean pattern_firstuwhile2rootubranch_0_3_CheckCSP_expressionFBB(
			firstuwhile2rootubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_4_collectelementstobetranslated_blackBBBB(
			Match match, While w, Assignment l, Program p) {
		return new Object[] { match, w, l, p };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, While w, Assignment l, Program p) {
		EMoflonEdge w__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(l);
		String w__l____first_name_prime = "first";
		String p__w____first_name_prime = "first";
		String w__l____last_name_prime = "last";
		w__l____first.setSrc(w);
		w__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(w__l____first);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		match.getToBeTranslatedEdges().add(p__w____first);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(w__l____last);
		w__l____first.setName(w__l____first_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		return new Object[] { match, w, l, p, w__l____first, p__w____first, w__l____last };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_5_collectcontextelements_blackBBBB(Match match,
			While w, Assignment l, Program p) {
		return new Object[] { match, w, l, p };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_0_5_collectcontextelements_greenBB(Match match,
			Program p) {
		match.getContextNodes().add(p);
		return new Object[] { match, p };
	}

	public static final void pattern_firstuwhile2rootubranch_0_6_registerobjectstomatch_expressionBBBBB(
			firstuwhile2rootubranch _this, Match match, While w, Assignment l, Program p) {
		_this.registerObjectsToMatch_FWD(match, w, l, p);

	}

	public static final boolean pattern_firstuwhile2rootubranch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstuwhile2rootubranch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("l");
		EObject _localVariable_3 = isApplicableMatch.getObject("p");
		EObject _localVariable_4 = isApplicableMatch.getObject("g");
		EObject tmpP2g = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpP = _localVariable_3;
		EObject tmpG = _localVariable_4;
		if (tmpP2g instanceof P2G) {
			P2G p2g = (P2G) tmpP2g;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpP instanceof Program) {
						Program p = (Program) tmpP;
						if (tmpG instanceof Graph) {
							Graph g = (Graph) tmpG;
							return new Object[] { p2g, w, l, p, g, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_1_performtransformation_blackBBBBBFBB(P2G p2g,
			While w, Assignment l, Program p, Graph g, firstuwhile2rootubranch _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p2g, w, l, p, g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding = pattern_firstuwhile2rootubranch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding != null) {
			P2G p2g = (P2G) result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding[1];
			Assignment l = (Assignment) result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding[2];
			Program p = (Program) result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding[3];
			Graph g = (Graph) result_pattern_firstuwhile2rootubranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_firstuwhile2rootubranch_1_1_performtransformation_black = pattern_firstuwhile2rootubranch_1_1_performtransformation_blackBBBBBFBB(
					p2g, w, l, p, g, _this, isApplicableMatch);
			if (result_pattern_firstuwhile2rootubranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_1_1_performtransformation_black[5];

				return new Object[] { p2g, w, l, p, g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_1_performtransformation_greenFFBFBBF(While w,
			Assignment l, Graph g) {
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		l2d.setSource(l);
		f2r.setSource(w);
		f2r.setTarget(b);
		g.setRoot(b);
		b.setPositive(d);
		l2d.setTarget(d);
		d.setNext(b);
		return new Object[] { l2d, f2r, w, b, l, g, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_2_collecttranslatedelements_blackBBBBBB(S2N l2d,
			S2B f2r, While w, Branch b, Assignment l, Command d) {
		return new Object[] { l2d, f2r, w, b, l, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_2_collecttranslatedelements_greenFBBBBBB(S2N l2d,
			S2B f2r, While w, Branch b, Assignment l, Command d) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2d);
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(d);
		return new Object[] { ruleresult, l2d, f2r, w, b, l, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l2d, EObject p2g, EObject f2r, EObject w, EObject b, EObject l,
			EObject p, EObject g, EObject d) {
		if (!l2d.equals(p2g)) {
			if (!l2d.equals(w)) {
				if (!l2d.equals(p)) {
					if (!p2g.equals(w)) {
						if (!f2r.equals(l2d)) {
							if (!f2r.equals(p2g)) {
								if (!f2r.equals(w)) {
									if (!f2r.equals(l)) {
										if (!f2r.equals(p)) {
											if (!f2r.equals(g)) {
												if (!b.equals(l2d)) {
													if (!b.equals(p2g)) {
														if (!b.equals(f2r)) {
															if (!b.equals(w)) {
																if (!b.equals(l)) {
																	if (!b.equals(p)) {
																		if (!b.equals(g)) {
																			if (!b.equals(d)) {
																				if (!l.equals(l2d)) {
																					if (!l.equals(p2g)) {
																						if (!l.equals(w)) {
																							if (!l.equals(p)) {
																								if (!p.equals(p2g)) {
																									if (!p.equals(w)) {
																										if (!g.equals(
																												l2d)) {
																											if (!g.equals(
																													p2g)) {
																												if (!g.equals(
																														w)) {
																													if (!g.equals(
																															l)) {
																														if (!g.equals(
																																p)) {
																															if (!d.equals(
																																	l2d)) {
																																if (!d.equals(
																																		p2g)) {
																																	if (!d.equals(
																																			f2r)) {
																																		if (!d.equals(
																																				w)) {
																																			if (!d.equals(
																																					l)) {
																																				if (!d.equals(
																																						p)) {
																																					if (!d.equals(
																																							g)) {
																																						return new Object[] {
																																								ruleresult,
																																								l2d,
																																								p2g,
																																								f2r,
																																								w,
																																								b,
																																								l,
																																								p,
																																								g,
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
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstuwhile2rootubranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l2d, EObject f2r, EObject w, EObject b, EObject l, EObject p,
			EObject g, EObject d) {
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstuwhile2rootubranch";
		String f2r__b____target_name_prime = "target";
		String w__l____first_name_prime = "first";
		String f2r__w____source_name_prime = "source";
		String p__w____first_name_prime = "first";
		String w__l____last_name_prime = "last";
		String b__d____positive_name_prime = "positive";
		String l2d__l____source_name_prime = "source";
		String g__b____root_name_prime = "root";
		String l2d__d____target_name_prime = "target";
		String d__b____next_name_prime = "next";
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		w__l____first.setSrc(w);
		w__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(w__l____first);
		f2r__w____source.setSrc(f2r);
		f2r__w____source.setTrg(w);
		ruleresult.getCreatedEdges().add(f2r__w____source);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		ruleresult.getTranslatedEdges().add(p__w____first);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(w__l____last);
		b__d____positive.setSrc(b);
		b__d____positive.setTrg(d);
		ruleresult.getCreatedEdges().add(b__d____positive);
		l2d__l____source.setSrc(l2d);
		l2d__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2d__l____source);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getCreatedEdges().add(g__b____root);
		l2d__d____target.setSrc(l2d);
		l2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(l2d__d____target);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		w__l____first.setName(w__l____first_name_prime);
		f2r__w____source.setName(f2r__w____source_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		b__d____positive.setName(b__d____positive_name_prime);
		l2d__l____source.setName(l2d__l____source_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		l2d__d____target.setName(l2d__d____target_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		return new Object[] { ruleresult, l2d, f2r, w, b, l, p, g, d, f2r__b____target, w__l____first, f2r__w____source,
				p__w____first, w__l____last, b__d____positive, l2d__l____source, g__b____root, l2d__d____target,
				d__b____next };
	}

	public static final void pattern_firstuwhile2rootubranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			firstuwhile2rootubranch _this, PerformRuleResult ruleresult, EObject l2d, EObject p2g, EObject f2r,
			EObject w, EObject b, EObject l, EObject p, EObject g, EObject d) {
		_this.registerObjects_FWD(ruleresult, l2d, p2g, f2r, w, b, l, p, g, d);

	}

	public static final PerformRuleResult pattern_firstuwhile2rootubranch_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_bindingFB(
			firstuwhile2rootubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			firstuwhile2rootubranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_bindingAndBlackFFB(
			firstuwhile2rootubranch _this) {
		Object[] result_pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_binding = pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_black = pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstuwhile2rootubranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("l");
		EObject _localVariable_2 = match.getObject("p");
		EObject tmpW = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpP = _localVariable_2;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpP instanceof Program) {
					Program p = (Program) tmpP;
					return new Object[] { w, l, p, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_2_2_corematch_blackFBBBFB(While w,
			Assignment l, Program p, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
			Graph g = p2g.getTarget();
			if (g != null) {
				_result.add(new Object[] { p2g, w, l, p, g, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_2_3_findcontext_blackBBBBB(P2G p2g, While w,
			Assignment l, Program p, Graph g) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (l.equals(w.getFirst())) {
			if (w.equals(p.getFirst())) {
				if (l.equals(w.getLast())) {
					if (g.equals(p2g.getTarget())) {
						if (p.equals(p2g.getSource())) {
							_result.add(new Object[] { p2g, w, l, p, g });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_3_findcontext_greenBBBBBFFFFFF(P2G p2g, While w,
			Assignment l, Program p, Graph g) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__l____first_name_prime = "first";
		String p__w____first_name_prime = "first";
		String w__l____last_name_prime = "last";
		String p2g__g____target_name_prime = "target";
		String p2g__p____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(g);
		w__l____first.setSrc(w);
		w__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(w__l____first);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		isApplicableMatch.getAllContextElements().add(p__w____first);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(w__l____last);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		w__l____first.setName(w__l____first_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		return new Object[] { p2g, w, l, p, g, isApplicableMatch, w__l____first, p__w____first, w__l____last,
				p2g__g____target, p2g__p____source };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_4_solveCSP_bindingFBBBBBBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch, P2G p2g, While w, Assignment l,
			Program p, Graph g) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, p2g, w, l, p, g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p2g, w, l, p, g };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch, P2G p2g, While w, Assignment l,
			Program p, Graph g) {
		Object[] result_pattern_firstuwhile2rootubranch_2_4_solveCSP_binding = pattern_firstuwhile2rootubranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, p2g, w, l, p, g);
		if (result_pattern_firstuwhile2rootubranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_2_4_solveCSP_black = pattern_firstuwhile2rootubranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstuwhile2rootubranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p2g, w, l, p, g };
			}
		}
		return null;
	}

	public static final boolean pattern_firstuwhile2rootubranch_2_5_checkCSP_expressionFBB(
			firstuwhile2rootubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstuwhile2rootubranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstuwhile2rootubranch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_1_initialbindings_blackBBBBB(
			firstuwhile2rootubranch _this, Match match, Branch b, Graph g, Command d) {
		return new Object[] { _this, match, b, g, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_2_SolveCSP_bindingFBBBBB(
			firstuwhile2rootubranch _this, Match match, Branch b, Graph g, Command d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, b, g, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			firstuwhile2rootubranch _this, Match match, Branch b, Graph g, Command d) {
		Object[] result_pattern_firstuwhile2rootubranch_10_2_SolveCSP_binding = pattern_firstuwhile2rootubranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, b, g, d);
		if (result_pattern_firstuwhile2rootubranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_10_2_SolveCSP_black = pattern_firstuwhile2rootubranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstuwhile2rootubranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, g, d };
			}
		}
		return null;
	}

	public static final boolean pattern_firstuwhile2rootubranch_10_3_CheckCSP_expressionFBB(
			firstuwhile2rootubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Branch b, Graph g, Command d) {
		return new Object[] { match, b, g, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, Branch b, Graph g, Command d) {
		EMoflonEdge b__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(d);
		String b__d____positive_name_prime = "positive";
		String g__b____root_name_prime = "root";
		String d__b____next_name_prime = "next";
		b__d____positive.setSrc(b);
		b__d____positive.setTrg(d);
		match.getToBeTranslatedEdges().add(b__d____positive);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		match.getToBeTranslatedEdges().add(g__b____root);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____next);
		b__d____positive.setName(b__d____positive_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		return new Object[] { match, b, g, d, b__d____positive, g__b____root, d__b____next };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_5_collectcontextelements_blackBBBB(Match match,
			Branch b, Graph g, Command d) {
		return new Object[] { match, b, g, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_10_5_collectcontextelements_greenBB(Match match,
			Graph g) {
		match.getContextNodes().add(g);
		return new Object[] { match, g };
	}

	public static final void pattern_firstuwhile2rootubranch_10_6_registerobjectstomatch_expressionBBBBB(
			firstuwhile2rootubranch _this, Match match, Branch b, Graph g, Command d) {
		_this.registerObjectsToMatch_BWD(match, b, g, d);

	}

	public static final boolean pattern_firstuwhile2rootubranch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstuwhile2rootubranch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p2g");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("p");
		EObject _localVariable_3 = isApplicableMatch.getObject("g");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject tmpP2g = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpP = _localVariable_2;
		EObject tmpG = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpP2g instanceof P2G) {
			P2G p2g = (P2G) tmpP2g;
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (tmpP instanceof Program) {
					Program p = (Program) tmpP;
					if (tmpG instanceof Graph) {
						Graph g = (Graph) tmpG;
						if (tmpD instanceof Command) {
							Command d = (Command) tmpD;
							return new Object[] { p2g, b, p, g, d, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_1_performtransformation_blackBBBBBFBB(P2G p2g,
			Branch b, Program p, Graph g, Command d, firstuwhile2rootubranch _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p2g, b, p, g, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding = pattern_firstuwhile2rootubranch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding != null) {
			P2G p2g = (P2G) result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding[0];
			Branch b = (Branch) result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding[1];
			Program p = (Program) result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding[2];
			Graph g = (Graph) result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding[3];
			Command d = (Command) result_pattern_firstuwhile2rootubranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_firstuwhile2rootubranch_11_1_performtransformation_black = pattern_firstuwhile2rootubranch_11_1_performtransformation_blackBBBBBFBB(
					p2g, b, p, g, d, _this, isApplicableMatch);
			if (result_pattern_firstuwhile2rootubranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_11_1_performtransformation_black[5];

				return new Object[] { p2g, b, p, g, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_1_performtransformation_greenFFFBFBB(Branch b,
			Program p, Command d) {
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While w = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		l2d.setTarget(d);
		f2r.setTarget(b);
		f2r.setSource(w);
		p.setFirst(w);
		w.setFirst(l);
		w.setLast(l);
		l2d.setSource(l);
		return new Object[] { l2d, f2r, w, b, l, p, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_2_collecttranslatedelements_blackBBBBBB(S2N l2d,
			S2B f2r, While w, Branch b, Assignment l, Command d) {
		return new Object[] { l2d, f2r, w, b, l, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_2_collecttranslatedelements_greenFBBBBBB(S2N l2d,
			S2B f2r, While w, Branch b, Assignment l, Command d) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2d);
		ruleresult.getCreatedLinkElements().add(f2r);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(d);
		return new Object[] { ruleresult, l2d, f2r, w, b, l, d };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l2d, EObject p2g, EObject f2r, EObject w, EObject b, EObject l,
			EObject p, EObject g, EObject d) {
		if (!l2d.equals(p2g)) {
			if (!l2d.equals(w)) {
				if (!l2d.equals(p)) {
					if (!p2g.equals(w)) {
						if (!f2r.equals(l2d)) {
							if (!f2r.equals(p2g)) {
								if (!f2r.equals(w)) {
									if (!f2r.equals(l)) {
										if (!f2r.equals(p)) {
											if (!f2r.equals(g)) {
												if (!b.equals(l2d)) {
													if (!b.equals(p2g)) {
														if (!b.equals(f2r)) {
															if (!b.equals(w)) {
																if (!b.equals(l)) {
																	if (!b.equals(p)) {
																		if (!b.equals(g)) {
																			if (!b.equals(d)) {
																				if (!l.equals(l2d)) {
																					if (!l.equals(p2g)) {
																						if (!l.equals(w)) {
																							if (!l.equals(p)) {
																								if (!p.equals(p2g)) {
																									if (!p.equals(w)) {
																										if (!g.equals(
																												l2d)) {
																											if (!g.equals(
																													p2g)) {
																												if (!g.equals(
																														w)) {
																													if (!g.equals(
																															l)) {
																														if (!g.equals(
																																p)) {
																															if (!d.equals(
																																	l2d)) {
																																if (!d.equals(
																																		p2g)) {
																																	if (!d.equals(
																																			f2r)) {
																																		if (!d.equals(
																																				w)) {
																																			if (!d.equals(
																																					l)) {
																																				if (!d.equals(
																																						p)) {
																																					if (!d.equals(
																																							g)) {
																																						return new Object[] {
																																								ruleresult,
																																								l2d,
																																								p2g,
																																								f2r,
																																								w,
																																								b,
																																								l,
																																								p,
																																								g,
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
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstuwhile2rootubranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l2d, EObject f2r, EObject w, EObject b, EObject l, EObject p,
			EObject g, EObject d) {
		EMoflonEdge f2r__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__w____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstuwhile2rootubranch";
		String f2r__b____target_name_prime = "target";
		String w__l____first_name_prime = "first";
		String f2r__w____source_name_prime = "source";
		String p__w____first_name_prime = "first";
		String w__l____last_name_prime = "last";
		String b__d____positive_name_prime = "positive";
		String l2d__l____source_name_prime = "source";
		String g__b____root_name_prime = "root";
		String l2d__d____target_name_prime = "target";
		String d__b____next_name_prime = "next";
		f2r__b____target.setSrc(f2r);
		f2r__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(f2r__b____target);
		w__l____first.setSrc(w);
		w__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(w__l____first);
		f2r__w____source.setSrc(f2r);
		f2r__w____source.setTrg(w);
		ruleresult.getCreatedEdges().add(f2r__w____source);
		p__w____first.setSrc(p);
		p__w____first.setTrg(w);
		ruleresult.getCreatedEdges().add(p__w____first);
		w__l____last.setSrc(w);
		w__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(w__l____last);
		b__d____positive.setSrc(b);
		b__d____positive.setTrg(d);
		ruleresult.getTranslatedEdges().add(b__d____positive);
		l2d__l____source.setSrc(l2d);
		l2d__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2d__l____source);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		ruleresult.getTranslatedEdges().add(g__b____root);
		l2d__d____target.setSrc(l2d);
		l2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(l2d__d____target);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		f2r__b____target.setName(f2r__b____target_name_prime);
		w__l____first.setName(w__l____first_name_prime);
		f2r__w____source.setName(f2r__w____source_name_prime);
		p__w____first.setName(p__w____first_name_prime);
		w__l____last.setName(w__l____last_name_prime);
		b__d____positive.setName(b__d____positive_name_prime);
		l2d__l____source.setName(l2d__l____source_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		l2d__d____target.setName(l2d__d____target_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		return new Object[] { ruleresult, l2d, f2r, w, b, l, p, g, d, f2r__b____target, w__l____first, f2r__w____source,
				p__w____first, w__l____last, b__d____positive, l2d__l____source, g__b____root, l2d__d____target,
				d__b____next };
	}

	public static final void pattern_firstuwhile2rootubranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			firstuwhile2rootubranch _this, PerformRuleResult ruleresult, EObject l2d, EObject p2g, EObject f2r,
			EObject w, EObject b, EObject l, EObject p, EObject g, EObject d) {
		_this.registerObjects_BWD(ruleresult, l2d, p2g, f2r, w, b, l, p, g, d);

	}

	public static final PerformRuleResult pattern_firstuwhile2rootubranch_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_bindingFB(
			firstuwhile2rootubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			firstuwhile2rootubranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_bindingAndBlackFFB(
			firstuwhile2rootubranch _this) {
		Object[] result_pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_binding = pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_black = pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstuwhile2rootubranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("g");
		EObject _localVariable_2 = match.getObject("d");
		EObject tmpB = _localVariable_0;
		EObject tmpG = _localVariable_1;
		EObject tmpD = _localVariable_2;
		if (tmpB instanceof Branch) {
			Branch b = (Branch) tmpB;
			if (tmpG instanceof Graph) {
				Graph g = (Graph) tmpG;
				if (tmpD instanceof Command) {
					Command d = (Command) tmpD;
					return new Object[] { b, g, d, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_12_2_corematch_blackFBFBBB(Branch b, Graph g,
			Command d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
			Program p = p2g.getSource();
			if (p != null) {
				_result.add(new Object[] { p2g, b, p, g, d, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_12_3_findcontext_blackBBBBB(P2G p2g,
			Branch b, Program p, Graph g, Command d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (d.equals(b.getPositive())) {
			if (g.equals(p2g.getTarget())) {
				if (b.equals(g.getRoot())) {
					if (p.equals(p2g.getSource())) {
						if (b.equals(d.getNext())) {
							_result.add(new Object[] { p2g, b, p, g, d });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_3_findcontext_greenBBBBBFFFFFF(P2G p2g, Branch b,
			Program p, Graph g, Command d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__b____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__d____positive_name_prime = "positive";
		String p2g__g____target_name_prime = "target";
		String g__b____root_name_prime = "root";
		String p2g__p____source_name_prime = "source";
		String d__b____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(p2g);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(d);
		b__d____positive.setSrc(b);
		b__d____positive.setTrg(d);
		isApplicableMatch.getAllContextElements().add(b__d____positive);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		g__b____root.setSrc(g);
		g__b____root.setTrg(b);
		isApplicableMatch.getAllContextElements().add(g__b____root);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		d__b____next.setSrc(d);
		d__b____next.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____next);
		b__d____positive.setName(b__d____positive_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		g__b____root.setName(g__b____root_name_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		d__b____next.setName(d__b____next_name_prime);
		return new Object[] { p2g, b, p, g, d, isApplicableMatch, b__d____positive, p2g__g____target, g__b____root,
				p2g__p____source, d__b____next };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_4_solveCSP_bindingFBBBBBBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch, P2G p2g, Branch b, Program p, Graph g,
			Command d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, p2g, b, p, g, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p2g, b, p, g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch, P2G p2g, Branch b, Program p, Graph g,
			Command d) {
		Object[] result_pattern_firstuwhile2rootubranch_12_4_solveCSP_binding = pattern_firstuwhile2rootubranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, p2g, b, p, g, d);
		if (result_pattern_firstuwhile2rootubranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_12_4_solveCSP_black = pattern_firstuwhile2rootubranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstuwhile2rootubranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p2g, b, p, g, d };
			}
		}
		return null;
	}

	public static final boolean pattern_firstuwhile2rootubranch_12_5_checkCSP_expressionFBB(
			firstuwhile2rootubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstuwhile2rootubranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstuwhile2rootubranch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_bindingFB(
			firstuwhile2rootubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstuwhile2rootubranch _this) {
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

	public static final Object[] pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			firstuwhile2rootubranch _this) {
		Object[] result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_binding = pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_black = pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_0BB(Branch b,
			Graph g) {
		for (Graph __DEC_b_root_862786 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_862786)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_1B(Branch b) {
		for (Branch __DEC_b_positive_409733 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_409733)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_2B(Branch b) {
		for (Branch __DEC_b_negative_782619 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_782619)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_3BB(Command d,
			Graph g) {
		for (Graph __DEC_d_root_179369 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			if (!g.equals(__DEC_d_root_179369)) {
				return new Object[] { d, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_4BB(Command d,
			Branch b) {
		for (Branch __DEC_d_positive_377159 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_d_positive_377159)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_5BB(Command d,
			Branch b) {
		for (Branch __DEC_d_negative_388040 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_d_negative_388040)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_6BB(Graph g,
			Command d) {
		if (d.equals(g.getRoot())) {
			return new Object[] { g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_7BB(Branch b,
			Command d) {
		if (d.equals(b.getNegative())) {
			return new Object[] { b, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_positive.getSrc();
		if (tmpB instanceof Branch) {
			Branch b = (Branch) tmpB;
			EObject tmpD = _edge_positive.getTrg();
			if (tmpD instanceof Command) {
				Command d = (Command) tmpD;
				if (d.equals(b.getPositive())) {
					if (b.equals(d.getNext())) {
						if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_1B(b) == null) {
							if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_2B(b) == null) {
								if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_4BB(d,
										b) == null) {
									if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_5BB(d,
											b) == null) {
										if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_7BB(b,
												d) == null) {
											for (Graph g : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(b, Graph.class, "root")) {
												if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_0BB(
														b, g) == null) {
													if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_3BB(
															d, g) == null) {
														if (pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_black_nac_6BB(
																g, d) == null) {
															_result.add(new Object[] { b, g, d, _edge_positive });
														}
													}
												}
											}
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

	public static final Object[] pattern_firstuwhile2rootubranch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstuwhile2rootubranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			firstuwhile2rootubranch _this, Match match, Branch b, Graph g, Command d) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, b, g, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstuwhile2rootubranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstuwhile2rootubranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstuwhile2rootubranch_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_bindingFB(
			firstuwhile2rootubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstuwhile2rootubranch _this) {
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

	public static final Object[] pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			firstuwhile2rootubranch _this) {
		Object[] result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_binding = pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_black = pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_0B(While w) {
		for (Decision __DEC_w_positive_451769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "positive")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_1B(While w) {
		for (Decision __DEC_w_negative_329258 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "negative")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_2B(While w) {
		for (While __DEC_w_first_715892 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "first")) {
			if (!w.equals(__DEC_w_first_715892)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_3B(While w) {
		for (While __DEC_w_last_833933 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "last")) {
			if (!w.equals(__DEC_w_last_833933)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_4B(Assignment l) {
		for (Decision __DEC_l_positive_293665 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_5B(Assignment l) {
		for (Decision __DEC_l_negative_399224 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_6BB(Assignment l,
			While w) {
		for (While __DEC_l_last_151119 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!w.equals(__DEC_l_last_151119)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_7BB(Assignment l,
			Program p) {
		for (Program __DEC_l_first_385722 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			if (!p.equals(__DEC_l_first_385722)) {
				return new Object[] { l, p };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_8BB(Program p,
			Assignment l) {
		if (l.equals(p.getFirst())) {
			return new Object[] { p, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpL = _edge_first.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(w.getFirst())) {
					if (l.equals(w.getLast())) {
						if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_0B(w) == null) {
							if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_1B(w) == null) {
								if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_2B(w) == null) {
									if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_3B(
											w) == null) {
										if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_4B(
												l) == null) {
											if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_5B(
													l) == null) {
												if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_6BB(
														l, w) == null) {
													for (Program p : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(w, Program.class, "first")) {
														if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_7BB(
																l, p) == null) {
															if (pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_black_nac_8BB(
																	p, l) == null) {
																_result.add(new Object[] { w, l, p, _edge_first });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstuwhile2rootubranch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstuwhile2rootubranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			firstuwhile2rootubranch _this, Match match, While w, Assignment l, Program p) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, l, p);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstuwhile2rootubranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstuwhile2rootubranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstuwhile2rootubranch_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_1_prepare_blackB(firstuwhile2rootubranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = targetMatch.getObject("b");
		EObject _localVariable_2 = sourceMatch.getObject("l");
		EObject _localVariable_3 = sourceMatch.getObject("p");
		EObject _localVariable_4 = targetMatch.getObject("g");
		EObject _localVariable_5 = targetMatch.getObject("d");
		EObject tmpW = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpP = _localVariable_3;
		EObject tmpG = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpB instanceof Branch) {
				Branch b = (Branch) tmpB;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpP instanceof Program) {
						Program p = (Program) tmpP;
						if (tmpG instanceof Graph) {
							Graph g = (Graph) tmpG;
							if (tmpD instanceof Command) {
								Command d = (Command) tmpD;
								return new Object[] { w, b, l, p, g, d, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_blackBBBBBBBB(While w,
			Branch b, Assignment l, Program p, Graph g, Command d, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { w, b, l, p, g, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding = pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding != null) {
			While w = (While) result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding[0];
			Branch b = (Branch) result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding[1];
			Assignment l = (Assignment) result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding[2];
			Program p = (Program) result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding[3];
			Graph g = (Graph) result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding[4];
			Command d = (Command) result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_black = pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					w, b, l, p, g, d, sourceMatch, targetMatch);
			if (result_pattern_firstuwhile2rootubranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, b, l, p, g, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_3_solvecsp_bindingFBBBBBBBBB(
			firstuwhile2rootubranch _this, While w, Branch b, Assignment l, Program p, Graph g, Command d,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(w, b, l, p, g, d, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, w, b, l, p, g, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			firstuwhile2rootubranch _this, While w, Branch b, Assignment l, Program p, Graph g, Command d,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstuwhile2rootubranch_24_3_solvecsp_binding = pattern_firstuwhile2rootubranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, w, b, l, p, g, d, sourceMatch, targetMatch);
		if (result_pattern_firstuwhile2rootubranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_24_3_solvecsp_black = pattern_firstuwhile2rootubranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_firstuwhile2rootubranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, b, l, p, g, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_firstuwhile2rootubranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_24_5_matchcorrcontext_blackFBBBB(Program p,
			Graph g, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
				if (p.equals(p2g.getSource())) {
					_result.add(new Object[] { p2g, p, g, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_5_matchcorrcontext_greenBBBF(P2G p2g,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "firstuwhile2rootubranch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(p2g);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { p2g, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_6_createcorrespondence_blackBBBBBBB(While w,
			Branch b, Assignment l, Program p, Graph g, Command d, CCMatch ccMatch) {
		return new Object[] { w, b, l, p, g, d, ccMatch };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_6_createcorrespondence_greenFFBBBBB(While w,
			Branch b, Assignment l, Command d, CCMatch ccMatch) {
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2d.setSource(l);
		l2d.setTarget(d);
		ccMatch.getCreateCorr().add(l2d);
		f2r.setTarget(b);
		f2r.setSource(w);
		ccMatch.getCreateCorr().add(f2r);
		return new Object[] { l2d, f2r, w, b, l, d, ccMatch };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "firstuwhile2rootubranch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_firstuwhile2rootubranch_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_0B(While w) {
		for (Decision __DEC_w_positive_488238 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "positive")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_1B(While w) {
		for (Decision __DEC_w_negative_600148 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Decision.class, "negative")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_2B(While w) {
		for (While __DEC_w_first_363689 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "first")) {
			if (!w.equals(__DEC_w_first_363689)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_3B(While w) {
		for (While __DEC_w_last_182272 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				While.class, "last")) {
			if (!w.equals(__DEC_w_last_182272)) {
				return new Object[] { w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_4B(Assignment l) {
		for (Decision __DEC_l_positive_235235 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_5B(Assignment l) {
		for (Decision __DEC_l_negative_792147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_6BB(Assignment l,
			While w) {
		for (While __DEC_l_last_889129 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!w.equals(__DEC_l_last_889129)) {
				return new Object[] { l, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_7BB(Assignment l,
			Program p) {
		for (Program __DEC_l_first_262015 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			if (!p.equals(__DEC_l_first_262015)) {
				return new Object[] { l, p };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_8BB(Program p,
			Assignment l) {
		if (l.equals(p.getFirst())) {
			return new Object[] { p, l };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_27_1_matchtggpattern_blackBBB(While w, Assignment l,
			Program p) {
		if (l.equals(w.getFirst())) {
			if (w.equals(p.getFirst())) {
				if (l.equals(w.getLast())) {
					if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_0B(w) == null) {
						if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_1B(w) == null) {
							if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_2B(w) == null) {
								if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_3B(w) == null) {
									if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_4B(l) == null) {
										if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_5B(
												l) == null) {
											if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_6BB(l,
													w) == null) {
												if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_7BB(
														l, p) == null) {
													if (pattern_firstuwhile2rootubranch_27_1_matchtggpattern_black_nac_8BB(
															p, l) == null) {
														return new Object[] { w, l, p };
													}
												}
											}
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

	public static final boolean pattern_firstuwhile2rootubranch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstuwhile2rootubranch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_0BB(Branch b, Graph g) {
		for (Graph __DEC_b_root_7900 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Graph.class, "root")) {
			if (!g.equals(__DEC_b_root_7900)) {
				return new Object[] { b, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_1B(Branch b) {
		for (Branch __DEC_b_positive_675816 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_b_positive_675816)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_2B(Branch b) {
		for (Branch __DEC_b_negative_401283 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_b_negative_401283)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_3BB(Command d,
			Graph g) {
		for (Graph __DEC_d_root_428699 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			if (!g.equals(__DEC_d_root_428699)) {
				return new Object[] { d, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_4BB(Command d,
			Branch b) {
		for (Branch __DEC_d_positive_208980 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "positive")) {
			if (!b.equals(__DEC_d_positive_208980)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_5BB(Command d,
			Branch b) {
		for (Branch __DEC_d_negative_532525 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Branch.class, "negative")) {
			if (!b.equals(__DEC_d_negative_532525)) {
				return new Object[] { d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_6BB(Graph g,
			Command d) {
		if (d.equals(g.getRoot())) {
			return new Object[] { g, d };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_7BB(Branch b,
			Command d) {
		if (d.equals(b.getNegative())) {
			return new Object[] { b, d };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_28_1_matchtggpattern_blackBBB(Branch b, Graph g,
			Command d) {
		if (d.equals(b.getPositive())) {
			if (b.equals(g.getRoot())) {
				if (b.equals(d.getNext())) {
					if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_0BB(b, g) == null) {
						if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_1B(b) == null) {
							if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_2B(b) == null) {
								if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_3BB(d, g) == null) {
									if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_4BB(d,
											b) == null) {
										if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_5BB(d,
												b) == null) {
											if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_6BB(g,
													d) == null) {
												if (pattern_firstuwhile2rootubranch_28_1_matchtggpattern_black_nac_7BB(
														b, d) == null) {
													return new Object[] { b, g, d };
												}
											}
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

	public static final boolean pattern_firstuwhile2rootubranch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstuwhile2rootubranch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_1_createresult_blackB(
			firstuwhile2rootubranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, P2G p2g) {
		if (ruleResult.getCorrObjects().contains(p2g)) {
			return new Object[] { ruleResult, p2g };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Graph g) {
		if (ruleResult.getTargetObjects().contains(g)) {
			return new Object[] { ruleResult, g };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Program p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstuwhile2rootubranch_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_firstuwhile2rootubranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									p2g) == null) {
								if (pattern_firstuwhile2rootubranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										g) == null) {
									if (pattern_firstuwhile2rootubranch_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											p) == null) {
										_result.add(
												new Object[] { p2gList, p2g, g, p, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_firstuwhile2rootubranch_29_3_solveCSP_bindingFBBBBBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch, P2G p2g, Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, p2g, p, g, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p2g, p, g, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			firstuwhile2rootubranch _this, IsApplicableMatch isApplicableMatch, P2G p2g, Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_firstuwhile2rootubranch_29_3_solveCSP_binding = pattern_firstuwhile2rootubranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p2g, p, g, ruleResult);
		if (result_pattern_firstuwhile2rootubranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstuwhile2rootubranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_firstuwhile2rootubranch_29_3_solveCSP_black = pattern_firstuwhile2rootubranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_firstuwhile2rootubranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p2g, p, g, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_firstuwhile2rootubranch_29_4_checkCSP_expressionFBB(
			firstuwhile2rootubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_5_checknacs_blackBBB(P2G p2g, Program p, Graph g) {
		return new Object[] { p2g, p, g };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_6_perform_blackBBBB(P2G p2g, Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { p2g, p, g, ruleResult };
	}

	public static final Object[] pattern_firstuwhile2rootubranch_29_6_perform_greenFFFFFBBFB(Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		S2N l2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While w = SourcecodeFactory.eINSTANCE.createWhile();
		Branch b = ControlflowFactory.eINSTANCE.createBranch();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(l2d);
		ruleResult.getCorrObjects().add(f2r);
		f2r.setSource(w);
		p.setFirst(w);
		ruleResult.getSourceObjects().add(w);
		f2r.setTarget(b);
		g.setRoot(b);
		ruleResult.getTargetObjects().add(b);
		w.setFirst(l);
		w.setLast(l);
		l2d.setSource(l);
		ruleResult.getSourceObjects().add(l);
		b.setPositive(d);
		l2d.setTarget(d);
		d.setNext(b);
		ruleResult.getTargetObjects().add(d);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l2d, f2r, w, b, l, p, g, d, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_firstuwhile2rootubranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //firstuwhile2rootubranchImpl
