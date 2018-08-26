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

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;
import org.wbsilva.bx.sourcecode2controlflow.Rules.whiled2branchb;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

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
 * An implementation of the model object '<em><b>whiled2branchb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whiled2branchbImpl extends AbstractRuleImpl implements whiled2branchb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whiled2branchbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhiled2branchb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While w, Decision a) {

		Object[] result1_black = whiled2branchbImpl.pattern_whiled2branchb_0_1_initialbindings_blackBBBB(this, match, w,
				a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, w, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiled2branchbImpl.pattern_whiled2branchb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiled2branchbImpl
					.pattern_whiled2branchb_0_4_collectelementstobetranslated_blackBBB(match, w, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whiled2branchbImpl.pattern_whiled2branchb_0_4_collectelementstobetranslated_greenBBBF(match, w, a);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[3];

			Object[] result5_black = whiled2branchbImpl
					.pattern_whiled2branchb_0_5_collectcontextelements_blackBBB(match, w, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whiled2branchbImpl.pattern_whiled2branchb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiled2branchbImpl.pattern_whiled2branchb_0_6_registerobjectstomatch_expressionBBBB(this, match, w, a);
			return whiled2branchbImpl.pattern_whiled2branchb_0_7_expressionF();
		} else {
			return whiled2branchbImpl.pattern_whiled2branchb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Decision a = (Decision) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = whiled2branchbImpl.pattern_whiled2branchb_1_1_performtransformation_greenBBFF(i, a);
		Branch x = (Branch) result1_green[2];
		S2B a2x = (S2B) result1_green[3];

		Object[] result2_black = whiled2branchbImpl.pattern_whiled2branchb_1_2_collecttranslatedelements_blackBBB(a, x,
				a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[x] = " + x
					+ ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whiled2branchbImpl.pattern_whiled2branchb_1_2_collecttranslatedelements_greenFBBB(a, x,
				a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiled2branchbImpl
				.pattern_whiled2branchb_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, w, i, w2i, a, x, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ", " + "[a2x] = " + a2x + ".");
		}
		whiled2branchbImpl.pattern_whiled2branchb_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, w, i, a, x, a2x);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		whiled2branchbImpl.pattern_whiled2branchb_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, w, i, w2i, a,
				x, a2x);
		return whiled2branchbImpl.pattern_whiled2branchb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiled2branchbImpl
				.pattern_whiled2branchb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiled2branchbImpl.pattern_whiled2branchb_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While w = (While) result2_binding[0];
		Decision a = (Decision) result2_binding[1];
		for (Object[] result2_black : whiled2branchbImpl.pattern_whiled2branchb_2_2_corematch_blackBFFBB(w, a, match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whiled2branchbImpl.pattern_whiled2branchb_2_3_findcontext_blackBBBB(w, i, w2i,
					a)) {
				Object[] result3_green = whiled2branchbImpl.pattern_whiled2branchb_2_3_findcontext_greenBBBBFFFF(w, i,
						w2i, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = whiled2branchbImpl
						.pattern_whiled2branchb_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
								a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiled2branchbImpl.pattern_whiled2branchb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiled2branchbImpl
							.pattern_whiled2branchb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiled2branchbImpl.pattern_whiled2branchb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiled2branchbImpl.pattern_whiled2branchb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While w, Decision a) {
		match.registerObject("w", w);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, Decision a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject w, EObject i, EObject w2i, EObject a,
			EObject x, EObject a2x) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Branch x) {

		Object[] result1_black = whiled2branchbImpl.pattern_whiled2branchb_10_1_initialbindings_blackBBBB(this, match,
				i, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, i, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiled2branchbImpl.pattern_whiled2branchb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiled2branchbImpl
					.pattern_whiled2branchb_10_4_collectelementstobetranslated_blackBBB(match, i, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whiled2branchbImpl.pattern_whiled2branchb_10_4_collectelementstobetranslated_greenBBBF(match, i, x);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[3];

			Object[] result5_black = whiled2branchbImpl
					.pattern_whiled2branchb_10_5_collectcontextelements_blackBBB(match, i, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whiled2branchbImpl.pattern_whiled2branchb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiled2branchbImpl.pattern_whiled2branchb_10_6_registerobjectstomatch_expressionBBBB(this, match, i, x);
			return whiled2branchbImpl.pattern_whiled2branchb_10_7_expressionF();
		} else {
			return whiled2branchbImpl.pattern_whiled2branchb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = whiled2branchbImpl.pattern_whiled2branchb_11_1_performtransformation_greenBFBF(w, x);
		Decision a = (Decision) result1_green[1];
		S2B a2x = (S2B) result1_green[3];

		Object[] result2_black = whiled2branchbImpl.pattern_whiled2branchb_11_2_collecttranslatedelements_blackBBB(a, x,
				a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[x] = " + x
					+ ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whiled2branchbImpl.pattern_whiled2branchb_11_2_collecttranslatedelements_greenFBBB(a,
				x, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiled2branchbImpl
				.pattern_whiled2branchb_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, w, i, w2i, a, x, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ", " + "[a2x] = " + a2x + ".");
		}
		whiled2branchbImpl.pattern_whiled2branchb_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, w, i, a, x, a2x);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		whiled2branchbImpl.pattern_whiled2branchb_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, w, i, w2i,
				a, x, a2x);
		return whiled2branchbImpl.pattern_whiled2branchb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiled2branchbImpl
				.pattern_whiled2branchb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiled2branchbImpl.pattern_whiled2branchb_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch i = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		for (Object[] result2_black : whiled2branchbImpl.pattern_whiled2branchb_12_2_corematch_blackFBFBB(i, x,
				match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whiled2branchbImpl.pattern_whiled2branchb_12_3_findcontext_blackBBBB(w, i,
					w2i, x)) {
				Object[] result3_green = whiled2branchbImpl.pattern_whiled2branchb_12_3_findcontext_greenBBBBFFFF(w, i,
						w2i, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = whiled2branchbImpl
						.pattern_whiled2branchb_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
								x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiled2branchbImpl.pattern_whiled2branchb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiled2branchbImpl
							.pattern_whiled2branchb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiled2branchbImpl.pattern_whiled2branchb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiled2branchbImpl.pattern_whiled2branchb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch x) {
		match.registerObject("i", i);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject w, EObject i, EObject w2i, EObject a,
			EObject x, EObject a2x) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_126(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiled2branchbImpl.pattern_whiled2branchb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiled2branchbImpl
				.pattern_whiled2branchb_20_2_testcorematchandDECs_blackFFB(_edge_positive)) {
			Branch i = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Object[] result2_green = whiled2branchbImpl
					.pattern_whiled2branchb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiled2branchbImpl
					.pattern_whiled2branchb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							i, x)) {
				// 
				if (whiled2branchbImpl
						.pattern_whiled2branchb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whiled2branchbImpl
							.pattern_whiled2branchb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiled2branchbImpl.pattern_whiled2branchb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiled2branchbImpl.pattern_whiled2branchb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_126(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiled2branchbImpl.pattern_whiled2branchb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiled2branchbImpl
				.pattern_whiled2branchb_21_2_testcorematchandDECs_blackFFB(_edge_first)) {
			While w = (While) result2_black[0];
			Decision a = (Decision) result2_black[1];
			Object[] result2_green = whiled2branchbImpl
					.pattern_whiled2branchb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiled2branchbImpl
					.pattern_whiled2branchb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							w, a)) {
				// 
				if (whiled2branchbImpl
						.pattern_whiled2branchb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whiled2branchbImpl
							.pattern_whiled2branchb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiled2branchbImpl.pattern_whiled2branchb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiled2branchbImpl.pattern_whiled2branchb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whiled2branchb");
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
		ruleResult.setRule("whiled2branchb");
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

		Object[] result1_black = whiled2branchbImpl.pattern_whiled2branchb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiled2branchbImpl.pattern_whiled2branchb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While w = (While) result2_bindingAndBlack[0];
		Branch i = (Branch) result2_bindingAndBlack[1];
		Decision a = (Decision) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = whiled2branchbImpl
				.pattern_whiled2branchb_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, w, i, a, x, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[a] = " + a + ", " + "[x] = " + x + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiled2branchbImpl.pattern_whiled2branchb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiled2branchbImpl.pattern_whiled2branchb_24_5_matchcorrcontext_blackBBFBB(w,
					i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whiled2branchbImpl.pattern_whiled2branchb_24_5_matchcorrcontext_greenBBBF(w2i,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiled2branchbImpl
						.pattern_whiled2branchb_24_6_createcorrespondence_blackBBBBB(w, i, a, x, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[w] = " + w + ", " + "[i] = " + i + ", "
									+ "[a] = " + a + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiled2branchbImpl.pattern_whiled2branchb_24_6_createcorrespondence_greenBBFB(a, x, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[2];

				Object[] result7_black = whiled2branchbImpl
						.pattern_whiled2branchb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiled2branchbImpl.pattern_whiled2branchb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whiled2branchbImpl.pattern_whiled2branchb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While w, Branch i, Decision a, Branch x, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While w, Decision a) {// 
		Object[] result1_black = whiled2branchbImpl.pattern_whiled2branchb_27_1_matchtggpattern_blackBB(w, a);
		if (result1_black != null) {
			return whiled2branchbImpl.pattern_whiled2branchb_27_2_expressionF();
		} else {
			return whiled2branchbImpl.pattern_whiled2branchb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch i, Branch x) {// 
		Object[] result1_black = whiled2branchbImpl.pattern_whiled2branchb_28_1_matchtggpattern_blackBB(i, x);
		if (result1_black != null) {
			return whiled2branchbImpl.pattern_whiled2branchb_28_2_expressionF();
		} else {
			return whiled2branchbImpl.pattern_whiled2branchb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whiled2branchbImpl.pattern_whiled2branchb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiled2branchbImpl.pattern_whiled2branchb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whiled2branchbImpl
				.pattern_whiled2branchb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whiled2branchbImpl
					.pattern_whiled2branchb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiled2branchbImpl.pattern_whiled2branchb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiled2branchbImpl.pattern_whiled2branchb_29_5_checknacs_blackBBB(w, i, w2i);
				if (result5_black != null) {

					Object[] result6_black = whiled2branchbImpl.pattern_whiled2branchb_29_6_perform_blackBBBB(w, i, w2i,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiled2branchbImpl.pattern_whiled2branchb_29_6_perform_greenBBFFFB(w, i, ruleResult);
					//nothing Decision a = (Decision) result6_green[2];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing S2B a2x = (S2B) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return whiled2branchbImpl.pattern_whiled2branchb_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
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
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_FWD__MATCH_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.WHILED2BRANCHB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2));
			return null;
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2));
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.WHILED2BRANCHB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILED2BRANCHB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
			return null;
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2));
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.WHILED2BRANCHB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_BRANCH_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.WHILED2BRANCHB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILED2BRANCHB___CHECK_DEC_FWD__WHILE_DECISION:
			return checkDEC_FWD((While) arguments.get(0), (Decision) arguments.get(1));
		case RulesPackage.WHILED2BRANCHB___CHECK_DEC_BWD__BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1));
		case RulesPackage.WHILED2BRANCHB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILED2BRANCHB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILED2BRANCHB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiled2branchb_0_1_initialbindings_blackBBBB(whiled2branchb _this, Match match,
			While w, Decision a) {
		return new Object[] { _this, match, w, a };
	}

	public static final Object[] pattern_whiled2branchb_0_2_SolveCSP_bindingFBBBB(whiled2branchb _this, Match match,
			While w, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiled2branchb_0_2_SolveCSP_bindingAndBlackFBBBB(whiled2branchb _this,
			Match match, While w, Decision a) {
		Object[] result_pattern_whiled2branchb_0_2_SolveCSP_binding = pattern_whiled2branchb_0_2_SolveCSP_bindingFBBBB(
				_this, match, w, a);
		if (result_pattern_whiled2branchb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiled2branchb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiled2branchb_0_2_SolveCSP_black = pattern_whiled2branchb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_whiled2branchb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_0_3_CheckCSP_expressionFBB(whiled2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_0_4_collectelementstobetranslated_blackBBB(Match match, While w,
			Decision a) {
		return new Object[] { match, w, a };
	}

	public static final Object[] pattern_whiled2branchb_0_4_collectelementstobetranslated_greenBBBF(Match match,
			While w, Decision a) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, w, a, w__a____first };
	}

	public static final Object[] pattern_whiled2branchb_0_5_collectcontextelements_blackBBB(Match match, While w,
			Decision a) {
		return new Object[] { match, w, a };
	}

	public static final Object[] pattern_whiled2branchb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiled2branchb_0_6_registerobjectstomatch_expressionBBBB(whiled2branchb _this,
			Match match, While w, Decision a) {
		_this.registerObjectsToMatch_FWD(match, w, a);

	}

	public static final boolean pattern_whiled2branchb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiled2branchb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject tmpW = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						return new Object[] { w, i, w2i, a, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_1_1_performtransformation_blackBBBBFBB(While w, Branch i,
			S2B w2i, Decision a, whiled2branchb _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { w, i, w2i, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_1_1_performtransformation_bindingAndBlackFFFFFBB(
			whiled2branchb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiled2branchb_1_1_performtransformation_binding = pattern_whiled2branchb_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_whiled2branchb_1_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whiled2branchb_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whiled2branchb_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whiled2branchb_1_1_performtransformation_binding[2];
			Decision a = (Decision) result_pattern_whiled2branchb_1_1_performtransformation_binding[3];

			Object[] result_pattern_whiled2branchb_1_1_performtransformation_black = pattern_whiled2branchb_1_1_performtransformation_blackBBBBFBB(
					w, i, w2i, a, _this, isApplicableMatch);
			if (result_pattern_whiled2branchb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiled2branchb_1_1_performtransformation_black[4];

				return new Object[] { w, i, w2i, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_1_1_performtransformation_greenBBFF(Branch i, Decision a) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		i.setPositive(x);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { i, a, x, a2x };
	}

	public static final Object[] pattern_whiled2branchb_1_2_collecttranslatedelements_blackBBB(Decision a, Branch x,
			S2B a2x) {
		return new Object[] { a, x, a2x };
	}

	public static final Object[] pattern_whiled2branchb_1_2_collecttranslatedelements_greenFBBB(Decision a, Branch x,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, a, x, a2x };
	}

	public static final Object[] pattern_whiled2branchb_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject i, EObject w2i, EObject a, EObject x, EObject a2x) {
		if (!w.equals(w2i)) {
			if (!w.equals(x)) {
				if (!i.equals(w)) {
					if (!i.equals(w2i)) {
						if (!i.equals(x)) {
							if (!w2i.equals(x)) {
								if (!a.equals(w)) {
									if (!a.equals(i)) {
										if (!a.equals(w2i)) {
											if (!a.equals(x)) {
												if (!a.equals(a2x)) {
													if (!a2x.equals(w)) {
														if (!a2x.equals(i)) {
															if (!a2x.equals(w2i)) {
																if (!a2x.equals(x)) {
																	return new Object[] { ruleresult, w, i, w2i, a, x,
																			a2x };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiled2branchb_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject w, EObject i, EObject a, EObject x, EObject a2x) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiled2branchb";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, w, i, a, x, a2x, w__a____first, i__x____positive, a2x__a____source,
				a2x__x____target };
	}

	public static final void pattern_whiled2branchb_1_5_registerobjects_expressionBBBBBBBB(whiled2branchb _this,
			PerformRuleResult ruleresult, EObject w, EObject i, EObject w2i, EObject a, EObject x, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, w, i, w2i, a, x, a2x);

	}

	public static final PerformRuleResult pattern_whiled2branchb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_2_1_preparereturnvalue_bindingFB(whiled2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whiled2branchb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whiled2branchb _this) {
		Object[] result_pattern_whiled2branchb_2_1_preparereturnvalue_binding = pattern_whiled2branchb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiled2branchb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiled2branchb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiled2branchb_2_1_preparereturnvalue_black = pattern_whiled2branchb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiled2branchb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiled2branchb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiled2branchb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiled2branchb_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("a");
		EObject tmpW = _localVariable_0;
		EObject tmpA = _localVariable_1;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				return new Object[] { w, a, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_2_2_corematch_blackBFFBB(While w, Decision a,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
			Branch i = w2i.getTarget();
			if (i != null) {
				_result.add(new Object[] { w, i, w2i, a, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_2_3_findcontext_blackBBBB(While w, Branch i, S2B w2i,
			Decision a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (a.equals(w.getFirst())) {
			if (w.equals(w2i.getSource())) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w, i, w2i, a });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_2_3_findcontext_greenBBBBFFFF(While w, Branch i, S2B w2i,
			Decision a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w, i, w2i, a, isApplicableMatch, w__a____first, w2i__w____source, w2i__i____target };
	}

	public static final Object[] pattern_whiled2branchb_2_4_solveCSP_bindingFBBBBBB(whiled2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, Decision a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w, i, w2i, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, a };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiled2branchb_2_4_solveCSP_bindingAndBlackFBBBBBB(whiled2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, Decision a) {
		Object[] result_pattern_whiled2branchb_2_4_solveCSP_binding = pattern_whiled2branchb_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, a);
		if (result_pattern_whiled2branchb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiled2branchb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiled2branchb_2_4_solveCSP_black = pattern_whiled2branchb_2_4_solveCSP_blackB(csp);
			if (result_pattern_whiled2branchb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_2_5_checkCSP_expressionFBB(whiled2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiled2branchb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiled2branchb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiled2branchb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_10_1_initialbindings_blackBBBB(whiled2branchb _this,
			Match match, Branch i, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { _this, match, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_10_2_SolveCSP_bindingFBBBB(whiled2branchb _this, Match match,
			Branch i, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiled2branchb_10_2_SolveCSP_bindingAndBlackFBBBB(whiled2branchb _this,
			Match match, Branch i, Branch x) {
		Object[] result_pattern_whiled2branchb_10_2_SolveCSP_binding = pattern_whiled2branchb_10_2_SolveCSP_bindingFBBBB(
				_this, match, i, x);
		if (result_pattern_whiled2branchb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiled2branchb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiled2branchb_10_2_SolveCSP_black = pattern_whiled2branchb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiled2branchb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_10_3_CheckCSP_expressionFBB(whiled2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_10_4_collectelementstobetranslated_blackBBB(Match match,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { match, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Branch i, Branch x) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		String i__x____positive_name_prime = "positive";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, i, x, i__x____positive };
	}

	public static final Object[] pattern_whiled2branchb_10_5_collectcontextelements_blackBBB(Match match, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			return new Object[] { match, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whiled2branchb_10_6_registerobjectstomatch_expressionBBBB(whiled2branchb _this,
			Match match, Branch i, Branch x) {
		_this.registerObjectsToMatch_BWD(match, i, x);

	}

	public static final boolean pattern_whiled2branchb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiled2branchb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject tmpW = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { w, i, w2i, x, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_11_1_performtransformation_blackBBBBFBB(While w, Branch i,
			S2B w2i, Branch x, whiled2branchb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w, i, w2i, x, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_11_1_performtransformation_bindingAndBlackFFFFFBB(
			whiled2branchb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiled2branchb_11_1_performtransformation_binding = pattern_whiled2branchb_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_whiled2branchb_11_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whiled2branchb_11_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whiled2branchb_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whiled2branchb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_whiled2branchb_11_1_performtransformation_binding[3];

			Object[] result_pattern_whiled2branchb_11_1_performtransformation_black = pattern_whiled2branchb_11_1_performtransformation_blackBBBBFBB(
					w, i, w2i, x, _this, isApplicableMatch);
			if (result_pattern_whiled2branchb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiled2branchb_11_1_performtransformation_black[4];

				return new Object[] { w, i, w2i, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_11_1_performtransformation_greenBFBF(While w, Branch x) {
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		w.setFirst(a);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { w, a, x, a2x };
	}

	public static final Object[] pattern_whiled2branchb_11_2_collecttranslatedelements_blackBBB(Decision a, Branch x,
			S2B a2x) {
		return new Object[] { a, x, a2x };
	}

	public static final Object[] pattern_whiled2branchb_11_2_collecttranslatedelements_greenFBBB(Decision a, Branch x,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, a, x, a2x };
	}

	public static final Object[] pattern_whiled2branchb_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject i, EObject w2i, EObject a, EObject x, EObject a2x) {
		if (!w.equals(w2i)) {
			if (!w.equals(x)) {
				if (!i.equals(w)) {
					if (!i.equals(w2i)) {
						if (!i.equals(x)) {
							if (!w2i.equals(x)) {
								if (!a.equals(w)) {
									if (!a.equals(i)) {
										if (!a.equals(w2i)) {
											if (!a.equals(x)) {
												if (!a.equals(a2x)) {
													if (!a2x.equals(w)) {
														if (!a2x.equals(i)) {
															if (!a2x.equals(w2i)) {
																if (!a2x.equals(x)) {
																	return new Object[] { ruleresult, w, i, w2i, a, x,
																			a2x };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiled2branchb_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject w, EObject i, EObject a, EObject x, EObject a2x) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiled2branchb";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, w, i, a, x, a2x, w__a____first, i__x____positive, a2x__a____source,
				a2x__x____target };
	}

	public static final void pattern_whiled2branchb_11_5_registerobjects_expressionBBBBBBBB(whiled2branchb _this,
			PerformRuleResult ruleresult, EObject w, EObject i, EObject w2i, EObject a, EObject x, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, w, i, w2i, a, x, a2x);

	}

	public static final PerformRuleResult pattern_whiled2branchb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_12_1_preparereturnvalue_bindingFB(whiled2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whiled2branchb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whiled2branchb _this) {
		Object[] result_pattern_whiled2branchb_12_1_preparereturnvalue_binding = pattern_whiled2branchb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiled2branchb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiled2branchb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiled2branchb_12_1_preparereturnvalue_black = pattern_whiled2branchb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiled2branchb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiled2branchb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiled2branchb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiled2branchb_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				return new Object[] { i, x, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_12_2_corematch_blackFBFBB(Branch i, Branch x,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { w, i, w2i, x, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_12_3_findcontext_blackBBBB(While w, Branch i, S2B w2i,
			Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (x.equals(i.getPositive())) {
				if (w.equals(w2i.getSource())) {
					if (i.equals(w2i.getTarget())) {
						_result.add(new Object[] { w, i, w2i, x });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_12_3_findcontext_greenBBBBFFFF(While w, Branch i, S2B w2i,
			Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(x);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w, i, w2i, x, isApplicableMatch, i__x____positive, w2i__w____source, w2i__i____target };
	}

	public static final Object[] pattern_whiled2branchb_12_4_solveCSP_bindingFBBBBBB(whiled2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, i, w2i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiled2branchb_12_4_solveCSP_bindingAndBlackFBBBBBB(whiled2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, Branch x) {
		Object[] result_pattern_whiled2branchb_12_4_solveCSP_binding = pattern_whiled2branchb_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, x);
		if (result_pattern_whiled2branchb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiled2branchb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiled2branchb_12_4_solveCSP_black = pattern_whiled2branchb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiled2branchb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_12_5_checkCSP_expressionFBB(whiled2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiled2branchb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiled2branchb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiled2branchb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_20_1_preparereturnvalue_bindingFB(whiled2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiled2branchb _this) {
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

	public static final Object[] pattern_whiled2branchb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whiled2branchb _this) {
		Object[] result_pattern_whiled2branchb_20_1_preparereturnvalue_binding = pattern_whiled2branchb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiled2branchb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiled2branchb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiled2branchb_20_1_preparereturnvalue_black = pattern_whiled2branchb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiled2branchb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiled2branchb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiled2branchb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_468335 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_944441 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_944441)) {
					if (!i.equals(__DEC_x_positive_944441)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_800280 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_800280)) {
					if (!i.equals(__DEC_x_negative_800280)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_3BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_positive.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (!i.equals(x)) {
					if (x.equals(i.getPositive())) {
						if (pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
							if (pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_1BB(x, i) == null) {
								if (pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_2BB(x, i) == null) {
									if (pattern_whiled2branchb_20_2_testcorematchandDECs_black_nac_3BB(i, x) == null) {
										_result.add(new Object[] { i, x, _edge_positive });
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

	public static final Object[] pattern_whiled2branchb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiled2branchb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			whiled2branchb _this, Match match, Branch i, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiled2branchb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiled2branchb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiled2branchb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_21_1_preparereturnvalue_bindingFB(whiled2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiled2branchb _this) {
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

	public static final Object[] pattern_whiled2branchb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whiled2branchb _this) {
		Object[] result_pattern_whiled2branchb_21_1_preparereturnvalue_binding = pattern_whiled2branchb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiled2branchb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiled2branchb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiled2branchb_21_1_preparereturnvalue_black = pattern_whiled2branchb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiled2branchb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiled2branchb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiled2branchb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_0B(Decision a) {
		for (Decision __DEC_a_positive_534527 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_534527)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_1B(Decision a) {
		for (Decision __DEC_a_negative_111558 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_111558)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_2BB(Decision a, While w) {
		for (While __DEC_a_last_40974 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_40974)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_933719 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_4BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (a.equals(w.getFirst())) {
					if (pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
						if (pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
							if (pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_2BB(a, w) == null) {
								if (pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
									if (pattern_whiled2branchb_21_2_testcorematchandDECs_black_nac_4BB(w, a) == null) {
										_result.add(new Object[] { w, a, _edge_first });
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

	public static final Object[] pattern_whiled2branchb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiled2branchb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			whiled2branchb _this, Match match, While w, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiled2branchb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiled2branchb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiled2branchb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_24_1_prepare_blackB(whiled2branchb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiled2branchb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whiled2branchb_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject tmpW = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { w, i, a, x, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_24_2_matchsrctrgcontext_blackBBBBBB(While w, Branch i,
			Decision a, Branch x, Match sourceMatch, Match targetMatch) {
		if (!i.equals(x)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { w, i, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whiled2branchb_24_2_matchsrctrgcontext_binding = pattern_whiled2branchb_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whiled2branchb_24_2_matchsrctrgcontext_binding != null) {
			While w = (While) result_pattern_whiled2branchb_24_2_matchsrctrgcontext_binding[0];
			Branch i = (Branch) result_pattern_whiled2branchb_24_2_matchsrctrgcontext_binding[1];
			Decision a = (Decision) result_pattern_whiled2branchb_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_whiled2branchb_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_whiled2branchb_24_2_matchsrctrgcontext_black = pattern_whiled2branchb_24_2_matchsrctrgcontext_blackBBBBBB(
					w, i, a, x, sourceMatch, targetMatch);
			if (result_pattern_whiled2branchb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, i, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_24_3_solvecsp_bindingFBBBBBBB(whiled2branchb _this, While w,
			Branch i, Decision a, Branch x, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(w, i, a, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, w, i, a, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiled2branchb_24_3_solvecsp_bindingAndBlackFBBBBBBB(whiled2branchb _this,
			While w, Branch i, Decision a, Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiled2branchb_24_3_solvecsp_binding = pattern_whiled2branchb_24_3_solvecsp_bindingFBBBBBBB(
				_this, w, i, a, x, sourceMatch, targetMatch);
		if (result_pattern_whiled2branchb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiled2branchb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiled2branchb_24_3_solvecsp_black = pattern_whiled2branchb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiled2branchb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, i, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_24_5_matchcorrcontext_blackBBFBB(While w, Branch i,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w, i, w2i, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whiled2branchb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whiled2branchb_24_6_createcorrespondence_blackBBBBB(While w, Branch i,
			Decision a, Branch x, CCMatch ccMatch) {
		if (!i.equals(x)) {
			return new Object[] { w, i, a, x, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_24_6_createcorrespondence_greenBBFB(Decision a, Branch x,
			CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { a, x, a2x, ccMatch };
	}

	public static final Object[] pattern_whiled2branchb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whiled2branchb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whiled2branchb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whiled2branchb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_27_1_matchtggpattern_black_nac_0B(Decision a) {
		for (Decision __DEC_a_positive_312136 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_312136)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_27_1_matchtggpattern_black_nac_1B(Decision a) {
		for (Decision __DEC_a_negative_750396 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_750396)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_27_1_matchtggpattern_black_nac_2BB(Decision a, While w) {
		for (While __DEC_a_last_362710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_362710)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_27_1_matchtggpattern_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_472965 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_27_1_matchtggpattern_black_nac_4BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_27_1_matchtggpattern_blackBB(While w, Decision a) {
		if (a.equals(w.getFirst())) {
			if (pattern_whiled2branchb_27_1_matchtggpattern_black_nac_0B(a) == null) {
				if (pattern_whiled2branchb_27_1_matchtggpattern_black_nac_1B(a) == null) {
					if (pattern_whiled2branchb_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
						if (pattern_whiled2branchb_27_1_matchtggpattern_black_nac_3B(a) == null) {
							if (pattern_whiled2branchb_27_1_matchtggpattern_black_nac_4BB(w, a) == null) {
								return new Object[] { w, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiled2branchb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_912291 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_28_1_matchtggpattern_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_882825 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_882825)) {
					if (!i.equals(__DEC_x_positive_882825)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_28_1_matchtggpattern_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_551099 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_551099)) {
					if (!i.equals(__DEC_x_negative_551099)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_28_1_matchtggpattern_black_nac_3BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_28_1_matchtggpattern_blackBB(Branch i, Branch x) {
		if (!i.equals(x)) {
			if (x.equals(i.getPositive())) {
				if (pattern_whiled2branchb_28_1_matchtggpattern_black_nac_0B(x) == null) {
					if (pattern_whiled2branchb_28_1_matchtggpattern_black_nac_1BB(x, i) == null) {
						if (pattern_whiled2branchb_28_1_matchtggpattern_black_nac_2BB(x, i) == null) {
							if (pattern_whiled2branchb_28_1_matchtggpattern_black_nac_3BB(i, x) == null) {
								return new Object[] { i, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiled2branchb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_29_1_createresult_blackB(whiled2branchb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiled2branchb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whiled2branchb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiled2branchb_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList w2iList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpW2i : w2iList.getEntryObjects()) {
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						Branch i = w2i.getTarget();
						if (i != null) {
							if (pattern_whiled2branchb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whiled2branchb_29_2_isapplicablecore_black_nac_0BB(ruleResult, w) == null) {
									if (pattern_whiled2branchb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											i) == null) {
										_result.add(
												new Object[] { w2iList, w, w2i, i, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_whiled2branchb_29_3_solveCSP_bindingFBBBBBB(whiled2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, i, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiled2branchb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiled2branchb_29_3_solveCSP_bindingAndBlackFBBBBBB(whiled2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiled2branchb_29_3_solveCSP_binding = pattern_whiled2branchb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, ruleResult);
		if (result_pattern_whiled2branchb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiled2branchb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiled2branchb_29_3_solveCSP_black = pattern_whiled2branchb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiled2branchb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whiled2branchb_29_4_checkCSP_expressionFBB(whiled2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiled2branchb_29_5_checknacs_blackBBB(While w, Branch i, S2B w2i) {
		return new Object[] { w, i, w2i };
	}

	public static final Object[] pattern_whiled2branchb_29_6_perform_blackBBBB(While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, i, w2i, ruleResult };
	}

	public static final Object[] pattern_whiled2branchb_29_6_perform_greenBBFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { w, i, a, x, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiled2branchb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiled2branchbImpl
