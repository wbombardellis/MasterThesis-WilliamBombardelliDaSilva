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

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;
import org.wbsilva.bx.sourcecode2controlflow.Rules.whilel2branchb;

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
 * An implementation of the model object '<em><b>whilel2branchb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whilel2branchbImpl extends AbstractRuleImpl implements whilel2branchb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whilel2branchbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhilel2branchb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment b, While a, While w) {

		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_0_1_initialbindings_blackBBBBB(this, match,
				b, a, w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, a, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilel2branchbImpl.pattern_whilel2branchb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilel2branchbImpl
					.pattern_whilel2branchb_0_4_collectelementstobetranslated_blackBBBB(match, b, a, w);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_0_4_collectelementstobetranslated_greenBBBBFF(match, b, a, w);
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whilel2branchbImpl
					.pattern_whilel2branchb_0_5_collectcontextelements_blackBBBB(match, b, a, w);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilel2branchbImpl.pattern_whilel2branchb_0_6_registerobjectstomatch_expressionBBBBB(this, match, b, a, w);
			return whilel2branchbImpl.pattern_whilel2branchb_0_7_expressionF();
		} else {
			return whilel2branchbImpl.pattern_whilel2branchb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment b = (Assignment) result1_bindingAndBlack[0];
		While a = (While) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_1_1_performtransformation_greenFFBBFBF(b, a,
				i);
		Branch x = (Branch) result1_green[0];
		S2N b2y = (S2N) result1_green[1];
		Command y = (Command) result1_green[4];
		S2B a2x = (S2B) result1_green[6];

		Object[] result2_black = whilel2branchbImpl.pattern_whilel2branchb_1_2_collecttranslatedelements_blackBBBBBB(x,
				b2y, b, a, y, a2x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[b2y] = " + b2y + ", "
							+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilel2branchbImpl.pattern_whilel2branchb_1_2_collecttranslatedelements_greenFBBBBBB(x,
				b2y, b, a, y, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilel2branchbImpl.pattern_whilel2branchb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, x, b2y, b, a, y, w, i, a2x, w2i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[a2x] = " + a2x + ", "
					+ "[w2i] = " + w2i + ".");
		}
		whilel2branchbImpl.pattern_whilel2branchb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, x, b2y, b,
				a, y, w, i, a2x);
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		whilel2branchbImpl.pattern_whilel2branchb_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, x, b2y, b,
				a, y, w, i, a2x, w2i);
		return whilel2branchbImpl.pattern_whilel2branchb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilel2branchbImpl
				.pattern_whilel2branchb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilel2branchbImpl.pattern_whilel2branchb_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment b = (Assignment) result2_binding[0];
		While a = (While) result2_binding[1];
		While w = (While) result2_binding[2];
		for (Object[] result2_black : whilel2branchbImpl.pattern_whilel2branchb_2_2_corematch_blackBBBFFB(b, a, w,
				match)) {
			Branch i = (Branch) result2_black[3];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilel2branchbImpl.pattern_whilel2branchb_2_3_findcontext_blackBBBBB(b, a, w,
					i, w2i)) {
				Object[] result3_green = whilel2branchbImpl.pattern_whilel2branchb_2_3_findcontext_greenBBBBBFFFFF(b, a,
						w, i, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whilel2branchbImpl
						.pattern_whilel2branchb_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, b, a, w,
								i, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[a] = " + a
							+ ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilel2branchbImpl.pattern_whilel2branchb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilel2branchbImpl
							.pattern_whilel2branchb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilel2branchbImpl.pattern_whilel2branchb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilel2branchbImpl.pattern_whilel2branchb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While a, While w) {
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While a, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment b, While a, While w, Branch i,
			S2B w2i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
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
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a,
			EObject y, EObject w, EObject i, EObject a2x, EObject w2i) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w2i", w2i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Command y, Branch i) {

		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_10_1_initialbindings_blackBBBBB(this, match,
				x, y, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, x, y, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilel2branchbImpl.pattern_whilel2branchb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilel2branchbImpl
					.pattern_whilel2branchb_10_4_collectelementstobetranslated_blackBBBB(match, x, y, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_10_4_collectelementstobetranslated_greenBBBBFF(match, x, y, i);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whilel2branchbImpl
					.pattern_whilel2branchb_10_5_collectcontextelements_blackBBBB(match, x, y, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilel2branchbImpl.pattern_whilel2branchb_10_6_registerobjectstomatch_expressionBBBBB(this, match, x, y, i);
			return whilel2branchbImpl.pattern_whilel2branchb_10_7_expressionF();
		} else {
			return whilel2branchbImpl.pattern_whilel2branchb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch x = (Branch) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_11_1_performtransformation_greenBFFFBBF(x, y,
				w);
		S2N b2y = (S2N) result1_green[1];
		Assignment b = (Assignment) result1_green[2];
		While a = (While) result1_green[3];
		S2B a2x = (S2B) result1_green[6];

		Object[] result2_black = whilel2branchbImpl.pattern_whilel2branchb_11_2_collecttranslatedelements_blackBBBBBB(x,
				b2y, b, a, y, a2x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[b2y] = " + b2y + ", "
							+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilel2branchbImpl
				.pattern_whilel2branchb_11_2_collecttranslatedelements_greenFBBBBBB(x, b2y, b, a, y, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilel2branchbImpl.pattern_whilel2branchb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, x, b2y, b, a, y, w, i, a2x, w2i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[a2x] = " + a2x + ", "
					+ "[w2i] = " + w2i + ".");
		}
		whilel2branchbImpl.pattern_whilel2branchb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, x, b2y, b,
				a, y, w, i, a2x);
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		whilel2branchbImpl.pattern_whilel2branchb_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, x, b2y,
				b, a, y, w, i, a2x, w2i);
		return whilel2branchbImpl.pattern_whilel2branchb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilel2branchbImpl
				.pattern_whilel2branchb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilel2branchbImpl.pattern_whilel2branchb_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch x = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Branch i = (Branch) result2_binding[2];
		for (Object[] result2_black : whilel2branchbImpl.pattern_whilel2branchb_12_2_corematch_blackBBFBFB(x, y, i,
				match)) {
			While w = (While) result2_black[2];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilel2branchbImpl.pattern_whilel2branchb_12_3_findcontext_blackBBBBB(x, y, w,
					i, w2i)) {
				Object[] result3_green = whilel2branchbImpl.pattern_whilel2branchb_12_3_findcontext_greenBBBBBFFFFF(x,
						y, w, i, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whilel2branchbImpl
						.pattern_whilel2branchb_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, x, y, w,
								i, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[y] = " + y
							+ ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilel2branchbImpl.pattern_whilel2branchb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilel2branchbImpl
							.pattern_whilel2branchb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilel2branchbImpl.pattern_whilel2branchb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilel2branchbImpl.pattern_whilel2branchb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command y, Branch i) {
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command y, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, Command y, While w, Branch i,
			S2B w2i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a,
			EObject y, EObject w, EObject i, EObject a2x, EObject w2i) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w2i", w2i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_52(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilel2branchbImpl
				.pattern_whilel2branchb_20_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			Branch x = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Branch i = (Branch) result2_black[2];
			Object[] result2_green = whilel2branchbImpl
					.pattern_whilel2branchb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilel2branchbImpl
					.pattern_whilel2branchb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							x, y, i)) {
				// 
				if (whilel2branchbImpl
						.pattern_whilel2branchb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilel2branchbImpl
							.pattern_whilel2branchb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilel2branchbImpl.pattern_whilel2branchb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilel2branchbImpl.pattern_whilel2branchb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_52(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilel2branchbImpl
				.pattern_whilel2branchb_21_2_testcorematchandDECs_blackFFFB(_edge_last)) {
			Assignment b = (Assignment) result2_black[0];
			While a = (While) result2_black[1];
			While w = (While) result2_black[2];
			Object[] result2_green = whilel2branchbImpl
					.pattern_whilel2branchb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilel2branchbImpl
					.pattern_whilel2branchb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							b, a, w)) {
				// 
				if (whilel2branchbImpl
						.pattern_whilel2branchb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilel2branchbImpl
							.pattern_whilel2branchb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilel2branchbImpl.pattern_whilel2branchb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilel2branchbImpl.pattern_whilel2branchb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whilel2branchb");
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
		ruleResult.setRule("whilel2branchb");
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

		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch x = (Branch) result2_bindingAndBlack[0];
		Assignment b = (Assignment) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Command y = (Command) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Branch i = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, x, b, a, y, w, i, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[w] = "
					+ w + ", " + "[i] = " + i + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilel2branchbImpl.pattern_whilel2branchb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilel2branchbImpl.pattern_whilel2branchb_24_5_matchcorrcontext_blackBBFBB(w,
					i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whilel2branchbImpl.pattern_whilel2branchb_24_5_matchcorrcontext_greenBBBF(w2i,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilel2branchbImpl
						.pattern_whilel2branchb_24_6_createcorrespondence_blackBBBBBBB(x, b, a, y, w, i, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[w] = " + w + ", "
							+ "[i] = " + i + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilel2branchbImpl.pattern_whilel2branchb_24_6_createcorrespondence_greenBFBBBFB(x, b, a, y, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[5];

				Object[] result7_black = whilel2branchbImpl
						.pattern_whilel2branchb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilel2branchbImpl.pattern_whilel2branchb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whilel2branchbImpl.pattern_whilel2branchb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch x, Assignment b, While a, Command y, While w, Branch i,
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
	public boolean checkDEC_FWD(Assignment b, While a, While w) {// 
		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_27_1_matchtggpattern_blackBBB(b, a, w);
		if (result1_black != null) {
			return whilel2branchbImpl.pattern_whilel2branchb_27_2_expressionF();
		} else {
			return whilel2branchbImpl.pattern_whilel2branchb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch x, Command y, Branch i) {// 
		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_28_1_matchtggpattern_blackBBB(x, y, i);
		if (result1_black != null) {
			return whilel2branchbImpl.pattern_whilel2branchb_28_2_expressionF();
		} else {
			return whilel2branchbImpl.pattern_whilel2branchb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whilel2branchbImpl
				.pattern_whilel2branchb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whilel2branchbImpl
					.pattern_whilel2branchb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilel2branchbImpl.pattern_whilel2branchb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilel2branchbImpl.pattern_whilel2branchb_29_5_checknacs_blackBBB(w, i, w2i);
				if (result5_black != null) {

					Object[] result6_black = whilel2branchbImpl.pattern_whilel2branchb_29_6_perform_blackBBBB(w, i, w2i,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilel2branchbImpl.pattern_whilel2branchb_29_6_perform_greenFFFFFBBFB(w, i, ruleResult);
					//nothing Branch x = (Branch) result6_green[0];
					//nothing S2N b2y = (S2N) result6_green[1];
					//nothing Assignment b = (Assignment) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing Command y = (Command) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return whilel2branchbImpl.pattern_whilel2branchb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILEL2BRANCHB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3));
			return null;
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_WHILE_BRANCH_S2B:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEL2BRANCHB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEL2BRANCHB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_WHILE_BRANCH_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEL2BRANCHB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_52((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_52((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_ASSIGNMENT_WHILE_COMMAND_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEL2BRANCHB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEL2BRANCHB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEL2BRANCHB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEL2BRANCHB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilel2branchb_0_1_initialbindings_blackBBBBB(whilel2branchb _this,
			Match match, Assignment b, While a, While w) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, b, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_2_SolveCSP_bindingFBBBBB(whilel2branchb _this, Match match,
			Assignment b, While a, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_0_2_SolveCSP_bindingAndBlackFBBBBB(whilel2branchb _this,
			Match match, Assignment b, While a, While w) {
		Object[] result_pattern_whilel2branchb_0_2_SolveCSP_binding = pattern_whilel2branchb_0_2_SolveCSP_bindingFBBBBB(
				_this, match, b, a, w);
		if (result_pattern_whilel2branchb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_0_2_SolveCSP_black = pattern_whilel2branchb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_whilel2branchb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_0_3_CheckCSP_expressionFBB(whilel2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Assignment b, While a, While w) {
		if (!a.equals(w)) {
			return new Object[] { match, b, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Assignment b, While a, While w) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, b, a, w, a__b____last, w__a____first };
	}

	public static final Object[] pattern_whilel2branchb_0_5_collectcontextelements_blackBBBB(Match match, Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			return new Object[] { match, b, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilel2branchb_0_6_registerobjectstomatch_expressionBBBBB(whilel2branchb _this,
			Match match, Assignment b, While a, While w) {
		_this.registerObjectsToMatch_FWD(match, b, a, w);

	}

	public static final boolean pattern_whilel2branchb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilel2branchb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							return new Object[] { b, a, w, i, w2i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_1_1_performtransformation_blackBBBBBFBB(Assignment b, While a,
			While w, Branch i, S2B w2i, whilel2branchb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { b, a, w, i, w2i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			whilel2branchb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilel2branchb_1_1_performtransformation_binding = pattern_whilel2branchb_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilel2branchb_1_1_performtransformation_binding != null) {
			Assignment b = (Assignment) result_pattern_whilel2branchb_1_1_performtransformation_binding[0];
			While a = (While) result_pattern_whilel2branchb_1_1_performtransformation_binding[1];
			While w = (While) result_pattern_whilel2branchb_1_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilel2branchb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilel2branchb_1_1_performtransformation_binding[4];

			Object[] result_pattern_whilel2branchb_1_1_performtransformation_black = pattern_whilel2branchb_1_1_performtransformation_blackBBBBBFBB(
					b, a, w, i, w2i, _this, isApplicableMatch);
			if (result_pattern_whilel2branchb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilel2branchb_1_1_performtransformation_black[5];

				return new Object[] { b, a, w, i, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_1_1_performtransformation_greenFFBBFBF(Assignment b, While a,
			Branch i) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		i.setPositive(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		y.setNext(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { x, b2y, b, a, y, i, a2x };
	}

	public static final Object[] pattern_whilel2branchb_1_2_collecttranslatedelements_blackBBBBBB(Branch x, S2N b2y,
			Assignment b, While a, Command y, S2B a2x) {
		return new Object[] { x, b2y, b, a, y, a2x };
	}

	public static final Object[] pattern_whilel2branchb_1_2_collecttranslatedelements_greenFBBBBBB(Branch x, S2N b2y,
			Assignment b, While a, Command y, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, x, b2y, b, a, y, a2x };
	}

	public static final Object[] pattern_whilel2branchb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a, EObject y, EObject w, EObject i,
			EObject a2x, EObject w2i) {
		if (!x.equals(y)) {
			if (!b2y.equals(x)) {
				if (!b2y.equals(y)) {
					if (!b2y.equals(w)) {
						if (!b2y.equals(i)) {
							if (!b2y.equals(w2i)) {
								if (!b.equals(x)) {
									if (!b.equals(b2y)) {
										if (!b.equals(y)) {
											if (!b.equals(w)) {
												if (!b.equals(i)) {
													if (!b.equals(w2i)) {
														if (!a.equals(x)) {
															if (!a.equals(b2y)) {
																if (!a.equals(b)) {
																	if (!a.equals(y)) {
																		if (!a.equals(w)) {
																			if (!a.equals(i)) {
																				if (!a.equals(a2x)) {
																					if (!a.equals(w2i)) {
																						if (!w.equals(x)) {
																							if (!w.equals(y)) {
																								if (!w.equals(w2i)) {
																									if (!i.equals(x)) {
																										if (!i.equals(
																												y)) {
																											if (!i.equals(
																													w)) {
																												if (!i.equals(
																														w2i)) {
																													if (!a2x.equals(
																															x)) {
																														if (!a2x.equals(
																																b2y)) {
																															if (!a2x.equals(
																																	b)) {
																																if (!a2x.equals(
																																		y)) {
																																	if (!a2x.equals(
																																			w)) {
																																		if (!a2x.equals(
																																				i)) {
																																			if (!a2x.equals(
																																					w2i)) {
																																				if (!w2i.equals(
																																						x)) {
																																					if (!w2i.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								x,
																																								b2y,
																																								b,
																																								a,
																																								y,
																																								w,
																																								i,
																																								a2x,
																																								w2i };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilel2branchb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a, EObject y, EObject w, EObject i,
			EObject a2x) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilel2branchb";
		String a__b____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, x, b2y, b, a, y, w, i, a2x, a__b____last, b2y__y____target, b2y__b____source,
				y__x____next, i__x____positive, w__a____first, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_whilel2branchb_1_5_registerobjects_expressionBBBBBBBBBBB(whilel2branchb _this,
			PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a, EObject y, EObject w, EObject i,
			EObject a2x, EObject w2i) {
		_this.registerObjects_FWD(ruleresult, x, b2y, b, a, y, w, i, a2x, w2i);

	}

	public static final PerformRuleResult pattern_whilel2branchb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_2_1_preparereturnvalue_bindingFB(whilel2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whilel2branchb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whilel2branchb _this) {
		Object[] result_pattern_whilel2branchb_2_1_preparereturnvalue_binding = pattern_whilel2branchb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilel2branchb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilel2branchb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilel2branchb_2_1_preparereturnvalue_black = pattern_whilel2branchb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilel2branchb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilel2branchb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilel2branchb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilel2branchb_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("w");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpW = _localVariable_2;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					return new Object[] { b, a, w, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_2_2_corematch_blackBBBFFB(Assignment b, While a,
			While w, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { b, a, w, i, w2i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_2_3_findcontext_blackBBBBB(Assignment b, While a,
			While w, Branch i, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (b.equals(a.getLast())) {
				if (a.equals(w.getFirst())) {
					if (i.equals(w2i.getTarget())) {
						if (w.equals(w2i.getSource())) {
							_result.add(new Object[] { b, a, w, i, w2i });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_2_3_findcontext_greenBBBBBFFFFF(Assignment b, While a, While w,
			Branch i, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { b, a, w, i, w2i, isApplicableMatch, a__b____last, w__a____first, w2i__i____target,
				w2i__w____source };
	}

	public static final Object[] pattern_whilel2branchb_2_4_solveCSP_bindingFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Assignment b, While a, While w, Branch i, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, a, w, i, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, a, w, i, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_2_4_solveCSP_bindingAndBlackFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Assignment b, While a, While w, Branch i, S2B w2i) {
		Object[] result_pattern_whilel2branchb_2_4_solveCSP_binding = pattern_whilel2branchb_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, b, a, w, i, w2i);
		if (result_pattern_whilel2branchb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_2_4_solveCSP_black = pattern_whilel2branchb_2_4_solveCSP_blackB(csp);
			if (result_pattern_whilel2branchb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, a, w, i, w2i };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_2_5_checkCSP_expressionFBB(whilel2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilel2branchb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilel2branchb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilel2branchb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_10_1_initialbindings_blackBBBBB(whilel2branchb _this,
			Match match, Branch x, Command y, Branch i) {
		if (!i.equals(x)) {
			return new Object[] { _this, match, x, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_2_SolveCSP_bindingFBBBBB(whilel2branchb _this, Match match,
			Branch x, Command y, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, y, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_10_2_SolveCSP_bindingAndBlackFBBBBB(whilel2branchb _this,
			Match match, Branch x, Command y, Branch i) {
		Object[] result_pattern_whilel2branchb_10_2_SolveCSP_binding = pattern_whilel2branchb_10_2_SolveCSP_bindingFBBBBB(
				_this, match, x, y, i);
		if (result_pattern_whilel2branchb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_10_2_SolveCSP_black = pattern_whilel2branchb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilel2branchb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, y, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_10_3_CheckCSP_expressionFBB(whilel2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Branch x, Command y, Branch i) {
		if (!i.equals(x)) {
			return new Object[] { match, x, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Branch x, Command y, Branch i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, x, y, i, y__x____next, i__x____positive };
	}

	public static final Object[] pattern_whilel2branchb_10_5_collectcontextelements_blackBBBB(Match match, Branch x,
			Command y, Branch i) {
		if (!i.equals(x)) {
			return new Object[] { match, x, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilel2branchb_10_6_registerobjectstomatch_expressionBBBBB(whilel2branchb _this,
			Match match, Branch x, Command y, Branch i) {
		_this.registerObjectsToMatch_BWD(match, x, y, i);

	}

	public static final boolean pattern_whilel2branchb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilel2branchb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							return new Object[] { x, y, w, i, w2i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_11_1_performtransformation_blackBBBBBFBB(Branch x, Command y,
			While w, Branch i, S2B w2i, whilel2branchb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { x, y, w, i, w2i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			whilel2branchb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilel2branchb_11_1_performtransformation_binding = pattern_whilel2branchb_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilel2branchb_11_1_performtransformation_binding != null) {
			Branch x = (Branch) result_pattern_whilel2branchb_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whilel2branchb_11_1_performtransformation_binding[1];
			While w = (While) result_pattern_whilel2branchb_11_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilel2branchb_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilel2branchb_11_1_performtransformation_binding[4];

			Object[] result_pattern_whilel2branchb_11_1_performtransformation_black = pattern_whilel2branchb_11_1_performtransformation_blackBBBBBFBB(
					x, y, w, i, w2i, _this, isApplicableMatch);
			if (result_pattern_whilel2branchb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilel2branchb_11_1_performtransformation_black[5];

				return new Object[] { x, y, w, i, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_11_1_performtransformation_greenBFFFBBF(Branch x, Command y,
			While w) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		a.setLast(b);
		w.setFirst(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { x, b2y, b, a, y, w, a2x };
	}

	public static final Object[] pattern_whilel2branchb_11_2_collecttranslatedelements_blackBBBBBB(Branch x, S2N b2y,
			Assignment b, While a, Command y, S2B a2x) {
		return new Object[] { x, b2y, b, a, y, a2x };
	}

	public static final Object[] pattern_whilel2branchb_11_2_collecttranslatedelements_greenFBBBBBB(Branch x, S2N b2y,
			Assignment b, While a, Command y, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, x, b2y, b, a, y, a2x };
	}

	public static final Object[] pattern_whilel2branchb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a, EObject y, EObject w, EObject i,
			EObject a2x, EObject w2i) {
		if (!x.equals(y)) {
			if (!b2y.equals(x)) {
				if (!b2y.equals(y)) {
					if (!b2y.equals(w)) {
						if (!b2y.equals(i)) {
							if (!b2y.equals(w2i)) {
								if (!b.equals(x)) {
									if (!b.equals(b2y)) {
										if (!b.equals(y)) {
											if (!b.equals(w)) {
												if (!b.equals(i)) {
													if (!b.equals(w2i)) {
														if (!a.equals(x)) {
															if (!a.equals(b2y)) {
																if (!a.equals(b)) {
																	if (!a.equals(y)) {
																		if (!a.equals(w)) {
																			if (!a.equals(i)) {
																				if (!a.equals(a2x)) {
																					if (!a.equals(w2i)) {
																						if (!w.equals(x)) {
																							if (!w.equals(y)) {
																								if (!w.equals(w2i)) {
																									if (!i.equals(x)) {
																										if (!i.equals(
																												y)) {
																											if (!i.equals(
																													w)) {
																												if (!i.equals(
																														w2i)) {
																													if (!a2x.equals(
																															x)) {
																														if (!a2x.equals(
																																b2y)) {
																															if (!a2x.equals(
																																	b)) {
																																if (!a2x.equals(
																																		y)) {
																																	if (!a2x.equals(
																																			w)) {
																																		if (!a2x.equals(
																																				i)) {
																																			if (!a2x.equals(
																																					w2i)) {
																																				if (!w2i.equals(
																																						x)) {
																																					if (!w2i.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								x,
																																								b2y,
																																								b,
																																								a,
																																								y,
																																								w,
																																								i,
																																								a2x,
																																								w2i };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilel2branchb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a, EObject y, EObject w, EObject i,
			EObject a2x) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilel2branchb";
		String a__b____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, x, b2y, b, a, y, w, i, a2x, a__b____last, b2y__y____target, b2y__b____source,
				y__x____next, i__x____positive, w__a____first, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_whilel2branchb_11_5_registerobjects_expressionBBBBBBBBBBB(whilel2branchb _this,
			PerformRuleResult ruleresult, EObject x, EObject b2y, EObject b, EObject a, EObject y, EObject w, EObject i,
			EObject a2x, EObject w2i) {
		_this.registerObjects_BWD(ruleresult, x, b2y, b, a, y, w, i, a2x, w2i);

	}

	public static final PerformRuleResult pattern_whilel2branchb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_12_1_preparereturnvalue_bindingFB(whilel2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whilel2branchb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whilel2branchb _this) {
		Object[] result_pattern_whilel2branchb_12_1_preparereturnvalue_binding = pattern_whilel2branchb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilel2branchb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilel2branchb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilel2branchb_12_1_preparereturnvalue_black = pattern_whilel2branchb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilel2branchb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilel2branchb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilel2branchb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilel2branchb_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpI = _localVariable_2;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					return new Object[] { x, y, i, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_12_2_corematch_blackBBFBFB(Branch x, Command y,
			Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { x, y, w, i, w2i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_12_3_findcontext_blackBBBBB(Branch x, Command y,
			While w, Branch i, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (x.equals(y.getNext())) {
				if (x.equals(i.getPositive())) {
					if (i.equals(w2i.getTarget())) {
						if (w.equals(w2i.getSource())) {
							_result.add(new Object[] { x, y, w, i, w2i });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_12_3_findcontext_greenBBBBBFFFFF(Branch x, Command y, While w,
			Branch i, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { x, y, w, i, w2i, isApplicableMatch, y__x____next, i__x____positive, w2i__i____target,
				w2i__w____source };
	}

	public static final Object[] pattern_whilel2branchb_12_4_solveCSP_bindingFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Branch x, Command y, While w, Branch i, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, y, w, i, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, y, w, i, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_12_4_solveCSP_bindingAndBlackFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Branch x, Command y, While w, Branch i, S2B w2i) {
		Object[] result_pattern_whilel2branchb_12_4_solveCSP_binding = pattern_whilel2branchb_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, x, y, w, i, w2i);
		if (result_pattern_whilel2branchb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_12_4_solveCSP_black = pattern_whilel2branchb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilel2branchb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, y, w, i, w2i };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_12_5_checkCSP_expressionFBB(whilel2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilel2branchb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilel2branchb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilel2branchb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_20_1_preparereturnvalue_bindingFB(whilel2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilel2branchb _this) {
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

	public static final Object[] pattern_whilel2branchb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whilel2branchb _this) {
		Object[] result_pattern_whilel2branchb_20_1_preparereturnvalue_binding = pattern_whilel2branchb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilel2branchb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilel2branchb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilel2branchb_20_1_preparereturnvalue_black = pattern_whilel2branchb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilel2branchb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilel2branchb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilel2branchb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_164564 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_353584 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_353584)) {
					if (!i.equals(__DEC_x_positive_353584)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_529328 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_529328)) {
					if (!i.equals(__DEC_x_negative_529328)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_112480 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_4BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_966861 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_966861)) {
					if (!i.equals(__DEC_y_positive_966861)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_5BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_355967 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_355967)) {
					if (!i.equals(__DEC_y_negative_355967)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_6BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_7BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_8BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_9BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(y.getNext())) {
					if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_3B(y) == null) {
						if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
							if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_6BB(x, y) == null) {
								if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_8BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_1BB(x,
													i) == null) {
												if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_2BB(x,
														i) == null) {
													if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_4BBB(
															y, x, i) == null) {
														if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_5BBB(
																y, x, i) == null) {
															if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_7BB(
																	i, y) == null) {
																if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_9BB(
																		i, y) == null) {
																	_result.add(new Object[] { x, y, i, _edge_next });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilel2branchb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whilel2branchb _this, Match match, Branch x, Command y, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, y, i);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilel2branchb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilel2branchb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilel2branchb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_21_1_preparereturnvalue_bindingFB(whilel2branchb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilel2branchb _this) {
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

	public static final Object[] pattern_whilel2branchb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whilel2branchb _this) {
		Object[] result_pattern_whilel2branchb_21_1_preparereturnvalue_binding = pattern_whilel2branchb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilel2branchb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilel2branchb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilel2branchb_21_1_preparereturnvalue_black = pattern_whilel2branchb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilel2branchb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilel2branchb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilel2branchb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_317360 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_908779 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_778557 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!a.equals(__DEC_b_first_778557)) {
					if (!w.equals(__DEC_b_first_778557)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_3BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_596736 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_596736)) {
					if (!w.equals(__DEC_b_last_596736)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_230578 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_307025 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_705922 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_7BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_412638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_412638)) {
					if (!w.equals(__DEC_a_last_412638)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_770069 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_9BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_10BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_11BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpB = _edge_last.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(a.getLast())) {
					if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
						if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_6B(a) == null) {
							if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
								if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_0B(b) == null) {
									if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_1B(b) == null) {
										if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_4B(b) == null) {
											if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_9BB(a,
													b) == null) {
												for (While w : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(a, While.class, "first")) {
													if (!a.equals(w)) {
														if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_2BBB(
																b, a, w) == null) {
															if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_3BBB(
																	b, a, w) == null) {
																if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_7BB(
																		a, w) == null) {
																	if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_10BB(
																			w, b) == null) {
																		if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_11BB(
																				w, b) == null) {
																			_result.add(new Object[] { b, a, w,
																					_edge_last });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilel2branchb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whilel2branchb _this, Match match, Assignment b, While a, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, w);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilel2branchb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilel2branchb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilel2branchb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_24_1_prepare_blackB(whilel2branchb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilel2branchb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("y");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = targetMatch.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { x, b, a, y, w, i, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_2_matchsrctrgcontext_blackBBBBBBBB(Branch x, Assignment b,
			While a, Command y, While w, Branch i, Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { x, b, a, y, w, i, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding = pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding != null) {
			Branch x = (Branch) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[0];
			Assignment b = (Assignment) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[2];
			Command y = (Command) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[4];
			Branch i = (Branch) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whilel2branchb_24_2_matchsrctrgcontext_black = pattern_whilel2branchb_24_2_matchsrctrgcontext_blackBBBBBBBB(
					x, b, a, y, w, i, sourceMatch, targetMatch);
			if (result_pattern_whilel2branchb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, b, a, y, w, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_3_solvecsp_bindingFBBBBBBBBB(whilel2branchb _this, Branch x,
			Assignment b, While a, Command y, While w, Branch i, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(x, b, a, y, w, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, x, b, a, y, w, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(whilel2branchb _this,
			Branch x, Assignment b, While a, Command y, While w, Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilel2branchb_24_3_solvecsp_binding = pattern_whilel2branchb_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, x, b, a, y, w, i, sourceMatch, targetMatch);
		if (result_pattern_whilel2branchb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilel2branchb_24_3_solvecsp_black = pattern_whilel2branchb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilel2branchb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, b, a, y, w, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_24_5_matchcorrcontext_blackBBFBB(While w, Branch i,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { w, i, w2i, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whilel2branchb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whilel2branchb_24_6_createcorrespondence_blackBBBBBBB(Branch x, Assignment b,
			While a, Command y, While w, Branch i, CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				return new Object[] { x, b, a, y, w, i, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_6_createcorrespondence_greenBFBBBFB(Branch x, Assignment b,
			While a, Command y, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { x, b2y, b, a, y, a2x, ccMatch };
	}

	public static final Object[] pattern_whilel2branchb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whilel2branchb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whilel2branchb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whilel2branchb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_966052 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_396356 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_935194 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!a.equals(__DEC_b_first_935194)) {
					if (!w.equals(__DEC_b_first_935194)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_3BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_2666 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_2666)) {
					if (!w.equals(__DEC_b_last_2666)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_916216 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_445794 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_505712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_7BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_674116 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_674116)) {
					if (!w.equals(__DEC_a_last_674116)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_833869 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_9BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_10BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_11BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_blackBBB(Assignment b, While a, While w) {
		if (!a.equals(w)) {
			if (b.equals(a.getLast())) {
				if (a.equals(w.getFirst())) {
					if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_0B(b) == null) {
						if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_1B(b) == null) {
							if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_2BBB(b, a, w) == null) {
								if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_3BBB(b, a, w) == null) {
									if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_4B(b) == null) {
										if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_5B(a) == null) {
											if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_6B(a) == null) {
												if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_7BB(a,
														w) == null) {
													if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_8B(
															a) == null) {
														if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_9BB(a,
																b) == null) {
															if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_10BB(
																	w, b) == null) {
																if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_11BB(
																		w, b) == null) {
																	return new Object[] { b, a, w };
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whilel2branchb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilel2branchb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_164686 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_449331 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_449331)) {
					if (!i.equals(__DEC_x_positive_449331)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_825823 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_825823)) {
					if (!i.equals(__DEC_x_negative_825823)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_432874 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_27729 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_27729)) {
					if (!i.equals(__DEC_y_positive_27729)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_5BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_810703 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_810703)) {
					if (!i.equals(__DEC_y_negative_810703)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_6BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_7BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_8BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_9BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_blackBBB(Branch x, Command y, Branch i) {
		if (!i.equals(x)) {
			if (x.equals(y.getNext())) {
				if (x.equals(i.getPositive())) {
					if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_0B(x) == null) {
						if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_1BB(x, i) == null) {
							if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_2BB(x, i) == null) {
								if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_3B(y) == null) {
									if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_4BBB(y, x, i) == null) {
										if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_5BBB(y, x,
												i) == null) {
											if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_6BB(x,
													y) == null) {
												if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_7BB(i,
														y) == null) {
													if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_8BB(x,
															y) == null) {
														if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_9BB(i,
																y) == null) {
															return new Object[] { x, y, i };
														}
													}
												}
											}
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

	public static final boolean pattern_whilel2branchb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilel2branchb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_29_1_createresult_blackB(whilel2branchb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilel2branchb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whilel2branchb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whilel2branchb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whilel2branchb_29_2_isapplicablecore_black_nac_0BB(ruleResult, w) == null) {
									if (pattern_whilel2branchb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whilel2branchb_29_3_solveCSP_bindingFBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, i, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_29_3_solveCSP_bindingAndBlackFBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilel2branchb_29_3_solveCSP_binding = pattern_whilel2branchb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, ruleResult);
		if (result_pattern_whilel2branchb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_29_3_solveCSP_black = pattern_whilel2branchb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilel2branchb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_29_4_checkCSP_expressionFBB(whilel2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_29_5_checknacs_blackBBB(While w, Branch i, S2B w2i) {
		return new Object[] { w, i, w2i };
	}

	public static final Object[] pattern_whilel2branchb_29_6_perform_blackBBBB(While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, i, w2i, ruleResult };
	}

	public static final Object[] pattern_whilel2branchb_29_6_perform_greenFFFFFBBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		a.setLast(b);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, b2y, b, a, y, w, i, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilel2branchb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilel2branchbImpl
