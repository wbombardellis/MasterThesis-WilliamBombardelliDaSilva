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
	public boolean isAppropriate_FWD(Match match, Assignment b, While w, While a) {

		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_0_1_initialbindings_blackBBBBB(this, match,
				b, w, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, w, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilel2branchbImpl.pattern_whilel2branchb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilel2branchbImpl
					.pattern_whilel2branchb_0_4_collectelementstobetranslated_blackBBBB(match, b, w, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_0_4_collectelementstobetranslated_greenBBBBFF(match, b, w, a);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whilel2branchbImpl
					.pattern_whilel2branchb_0_5_collectcontextelements_blackBBBB(match, b, w, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilel2branchbImpl.pattern_whilel2branchb_0_6_registerobjectstomatch_expressionBBBBB(this, match, b, w, a);
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
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		While a = (While) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_1_1_performtransformation_greenBBFFBFF(b, i,
				a);
		Branch x = (Branch) result1_green[2];
		S2B a2x = (S2B) result1_green[3];
		Command y = (Command) result1_green[5];
		S2N b2y = (S2N) result1_green[6];

		Object[] result2_black = whilel2branchbImpl.pattern_whilel2branchb_1_2_collecttranslatedelements_blackBBBBBB(b,
				x, a2x, a, y, b2y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a2x] = "
							+ a2x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whilel2branchbImpl.pattern_whilel2branchb_1_2_collecttranslatedelements_greenFBBBBBB(b,
				x, a2x, a, y, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilel2branchbImpl.pattern_whilel2branchb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, b, i, w2i, w, x, a2x, a, y, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ".");
		}
		whilel2branchbImpl.pattern_whilel2branchb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, b, i, w, x,
				a2x, a, y, b2y);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];

		// 
		// 
		whilel2branchbImpl.pattern_whilel2branchb_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, b, i, w2i,
				w, x, a2x, a, y, b2y);
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
		While w = (While) result2_binding[1];
		While a = (While) result2_binding[2];
		for (Object[] result2_black : whilel2branchbImpl.pattern_whilel2branchb_2_2_corematch_blackBFFBBB(b, w, a,
				match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whilel2branchbImpl.pattern_whilel2branchb_2_3_findcontext_blackBBBBB(b, i,
					w2i, w, a)) {
				Object[] result3_green = whilel2branchbImpl.pattern_whilel2branchb_2_3_findcontext_greenBBBBBFFFFF(b, i,
						w2i, w, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whilel2branchbImpl
						.pattern_whilel2branchb_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, b, i, w2i,
								w, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While w, While a) {
		match.registerObject("b", b);
		match.registerObject("w", w);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While w, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment b, Branch i, S2B w2i, While w,
			While a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b, EObject i, EObject w2i, EObject w,
			EObject x, EObject a2x, EObject a, EObject y, EObject b2y) {
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);

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
	public boolean isAppropriate_BWD(Match match, Branch i, Branch x, Command y) {

		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_10_1_initialbindings_blackBBBBB(this, match,
				i, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, i, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilel2branchbImpl.pattern_whilel2branchb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilel2branchbImpl
					.pattern_whilel2branchb_10_4_collectelementstobetranslated_blackBBBB(match, i, x, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_10_4_collectelementstobetranslated_greenBBBBFF(match, i, x, y);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whilel2branchbImpl
					.pattern_whilel2branchb_10_5_collectcontextelements_blackBBBB(match, i, x, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			whilel2branchbImpl.pattern_whilel2branchb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilel2branchbImpl.pattern_whilel2branchb_10_6_registerobjectstomatch_expressionBBBBB(this, match, i, x, y);
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
		Branch i = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		Command y = (Command) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whilel2branchbImpl.pattern_whilel2branchb_11_1_performtransformation_greenFBBFFBF(w, x,
				y);
		Assignment b = (Assignment) result1_green[0];
		S2B a2x = (S2B) result1_green[3];
		While a = (While) result1_green[4];
		S2N b2y = (S2N) result1_green[6];

		Object[] result2_black = whilel2branchbImpl.pattern_whilel2branchb_11_2_collecttranslatedelements_blackBBBBBB(b,
				x, a2x, a, y, b2y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a2x] = "
							+ a2x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whilel2branchbImpl
				.pattern_whilel2branchb_11_2_collecttranslatedelements_greenFBBBBBB(b, x, a2x, a, y, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilel2branchbImpl.pattern_whilel2branchb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, b, i, w2i, w, x, a2x, a, y, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ".");
		}
		whilel2branchbImpl.pattern_whilel2branchb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, b, i, w,
				x, a2x, a, y, b2y);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];

		// 
		// 
		whilel2branchbImpl.pattern_whilel2branchb_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, b, i,
				w2i, w, x, a2x, a, y, b2y);
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
		Branch i = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		for (Object[] result2_black : whilel2branchbImpl.pattern_whilel2branchb_12_2_corematch_blackBFFBBB(i, x, y,
				match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whilel2branchbImpl.pattern_whilel2branchb_12_3_findcontext_blackBBBBB(i, w2i,
					w, x, y)) {
				Object[] result3_green = whilel2branchbImpl.pattern_whilel2branchb_12_3_findcontext_greenBBBBBFFFFF(i,
						w2i, w, x, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whilel2branchbImpl
						.pattern_whilel2branchb_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, i, w2i,
								w, x, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = "
							+ w2i + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch x, Command y) {
		match.registerObject("i", i);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch x, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, Branch x,
			Command y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b, EObject i, EObject w2i, EObject w,
			EObject x, EObject a2x, EObject a, EObject y, EObject b2y) {
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_104(EMoflonEdge _edge_positive) {

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
				.pattern_whilel2branchb_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Branch i = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Object[] result2_green = whilel2branchbImpl
					.pattern_whilel2branchb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilel2branchbImpl
					.pattern_whilel2branchb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							i, x, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_110(EMoflonEdge _edge_first) {

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
				.pattern_whilel2branchb_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			Assignment b = (Assignment) result2_black[0];
			While w = (While) result2_black[1];
			While a = (While) result2_black[2];
			Object[] result2_green = whilel2branchbImpl
					.pattern_whilel2branchb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilel2branchbImpl
					.pattern_whilel2branchb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							b, w, a)) {
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
		Assignment b = (Assignment) result2_bindingAndBlack[0];
		Branch i = (Branch) result2_bindingAndBlack[1];
		While w = (While) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whilel2branchbImpl
				.pattern_whilel2branchb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, b, i, w, x, a, y, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[b] = " + b + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[a] = "
					+ a + ", " + "[y] = " + y + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilel2branchbImpl.pattern_whilel2branchb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilel2branchbImpl.pattern_whilel2branchb_24_5_matchcorrcontext_blackBFBBB(i,
					w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whilel2branchbImpl.pattern_whilel2branchb_24_5_matchcorrcontext_greenBBBF(w2i,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilel2branchbImpl
						.pattern_whilel2branchb_24_6_createcorrespondence_blackBBBBBBB(b, i, w, x, a, y, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", "
							+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
							+ "[y] = " + y + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilel2branchbImpl.pattern_whilel2branchb_24_6_createcorrespondence_greenBBFBBFB(b, x, a, y, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[2];
				//nothing S2N b2y = (S2N) result6_green[5];

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
	public CSP isApplicable_solveCsp_CC(Assignment b, Branch i, While w, Branch x, While a, Command y,
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
	public boolean checkDEC_FWD(Assignment b, While w, While a) {// 
		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_27_1_matchtggpattern_blackBBB(b, w, a);
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
	public boolean checkDEC_BWD(Branch i, Branch x, Command y) {// 
		Object[] result1_black = whilel2branchbImpl.pattern_whilel2branchb_28_1_matchtggpattern_blackBBB(i, x, y);
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
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whilel2branchbImpl
					.pattern_whilel2branchb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilel2branchbImpl.pattern_whilel2branchb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilel2branchbImpl.pattern_whilel2branchb_29_5_checknacs_blackBBB(i, w2i, w);
				if (result5_black != null) {

					Object[] result6_black = whilel2branchbImpl.pattern_whilel2branchb_29_6_perform_blackBBBB(i, w2i, w,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilel2branchbImpl.pattern_whilel2branchb_29_6_perform_greenFBBFFFFFB(i, w, ruleResult);
					//nothing Assignment b = (Assignment) result6_green[0];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing S2B a2x = (S2B) result6_green[4];
					//nothing While a = (While) result6_green[5];
					//nothing Command y = (Command) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[7];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
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
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_BRANCH_S2B_WHILE_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
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
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.WHILEL2BRANCHB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
			return null;
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_BRANCH_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5));
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
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_104((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_110__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_110((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_WHILE_BRANCH_WHILE_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Command) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEL2BRANCHB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEL2BRANCHB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEL2BRANCHB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.WHILEL2BRANCHB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEL2BRANCHB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEL2BRANCHB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilel2branchb_0_1_initialbindings_blackBBBBB(whilel2branchb _this,
			Match match, Assignment b, While w, While a) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, b, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_2_SolveCSP_bindingFBBBBB(whilel2branchb _this, Match match,
			Assignment b, While w, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_0_2_SolveCSP_bindingAndBlackFBBBBB(whilel2branchb _this,
			Match match, Assignment b, While w, While a) {
		Object[] result_pattern_whilel2branchb_0_2_SolveCSP_binding = pattern_whilel2branchb_0_2_SolveCSP_bindingFBBBBB(
				_this, match, b, w, a);
		if (result_pattern_whilel2branchb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_0_2_SolveCSP_black = pattern_whilel2branchb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_whilel2branchb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, w, a };
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
			Assignment b, While w, While a) {
		if (!a.equals(w)) {
			return new Object[] { match, b, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Assignment b, While w, While a) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, b, w, a, w__a____first, a__b____last };
	}

	public static final Object[] pattern_whilel2branchb_0_5_collectcontextelements_blackBBBB(Match match, Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			return new Object[] { match, b, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilel2branchb_0_6_registerobjectstomatch_expressionBBBBB(whilel2branchb _this,
			Match match, Assignment b, While w, While a) {
		_this.registerObjectsToMatch_FWD(match, b, w, a);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { b, i, w2i, w, a, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_1_1_performtransformation_blackBBBBBFBB(Assignment b, Branch i,
			S2B w2i, While w, While a, whilel2branchb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { b, i, w2i, w, a, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whilel2branchb_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilel2branchb_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whilel2branchb_1_1_performtransformation_binding[3];
			While a = (While) result_pattern_whilel2branchb_1_1_performtransformation_binding[4];

			Object[] result_pattern_whilel2branchb_1_1_performtransformation_black = pattern_whilel2branchb_1_1_performtransformation_blackBBBBBFBB(
					b, i, w2i, w, a, _this, isApplicableMatch);
			if (result_pattern_whilel2branchb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilel2branchb_1_1_performtransformation_black[5];

				return new Object[] { b, i, w2i, w, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_1_1_performtransformation_greenBBFFBFF(Assignment b, Branch i,
			While a) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		i.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		y.setNext(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { b, i, x, a2x, a, y, b2y };
	}

	public static final Object[] pattern_whilel2branchb_1_2_collecttranslatedelements_blackBBBBBB(Assignment b,
			Branch x, S2B a2x, While a, Command y, S2N b2y) {
		return new Object[] { b, x, a2x, a, y, b2y };
	}

	public static final Object[] pattern_whilel2branchb_1_2_collecttranslatedelements_greenFBBBBBB(Assignment b,
			Branch x, S2B a2x, While a, Command y, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, b, x, a2x, a, y, b2y };
	}

	public static final Object[] pattern_whilel2branchb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b, EObject i, EObject w2i, EObject w, EObject x, EObject a2x,
			EObject a, EObject y, EObject b2y) {
		if (!b.equals(i)) {
			if (!b.equals(w2i)) {
				if (!b.equals(w)) {
					if (!b.equals(x)) {
						if (!b.equals(y)) {
							if (!b.equals(b2y)) {
								if (!i.equals(w2i)) {
									if (!i.equals(w)) {
										if (!i.equals(x)) {
											if (!i.equals(y)) {
												if (!w2i.equals(x)) {
													if (!w2i.equals(y)) {
														if (!w.equals(w2i)) {
															if (!w.equals(x)) {
																if (!w.equals(y)) {
																	if (!x.equals(y)) {
																		if (!a2x.equals(b)) {
																			if (!a2x.equals(i)) {
																				if (!a2x.equals(w2i)) {
																					if (!a2x.equals(w)) {
																						if (!a2x.equals(x)) {
																							if (!a2x.equals(y)) {
																								if (!a2x.equals(b2y)) {
																									if (!a.equals(b)) {
																										if (!a.equals(
																												i)) {
																											if (!a.equals(
																													w2i)) {
																												if (!a.equals(
																														w)) {
																													if (!a.equals(
																															x)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a.equals(
																																	y)) {
																																if (!a.equals(
																																		b2y)) {
																																	if (!b2y.equals(
																																			i)) {
																																		if (!b2y.equals(
																																				w2i)) {
																																			if (!b2y.equals(
																																					w)) {
																																				if (!b2y.equals(
																																						x)) {
																																					if (!b2y.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								b,
																																								i,
																																								w2i,
																																								w,
																																								x,
																																								a2x,
																																								a,
																																								y,
																																								b2y };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b, EObject i, EObject w, EObject x, EObject a2x, EObject a, EObject y,
			EObject b2y) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilel2branchb";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { ruleresult, b, i, w, x, a2x, a, y, b2y, w__a____first, a2x__x____target, i__x____positive,
				a2x__a____source, y__x____next, b2y__b____source, b2y__y____target, a__b____last };
	}

	public static final void pattern_whilel2branchb_1_5_registerobjects_expressionBBBBBBBBBBB(whilel2branchb _this,
			PerformRuleResult ruleresult, EObject b, EObject i, EObject w2i, EObject w, EObject x, EObject a2x,
			EObject a, EObject y, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, b, i, w2i, w, x, a2x, a, y, b2y);

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
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					return new Object[] { b, w, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_2_2_corematch_blackBFFBBB(Assignment b, While w,
			While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { b, i, w2i, w, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_2_3_findcontext_blackBBBBB(Assignment b, Branch i,
			S2B w2i, While w, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (i.equals(w2i.getTarget())) {
					if (w.equals(w2i.getSource())) {
						if (b.equals(a.getLast())) {
							_result.add(new Object[] { b, i, w2i, w, a });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_2_3_findcontext_greenBBBBBFFFFF(Assignment b, Branch i, S2B w2i,
			While w, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { b, i, w2i, w, a, isApplicableMatch, w__a____first, w2i__i____target, w2i__w____source,
				a__b____last };
	}

	public static final Object[] pattern_whilel2branchb_2_4_solveCSP_bindingFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Assignment b, Branch i, S2B w2i, While w, While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, i, w2i, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, i, w2i, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_2_4_solveCSP_bindingAndBlackFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Assignment b, Branch i, S2B w2i, While w, While a) {
		Object[] result_pattern_whilel2branchb_2_4_solveCSP_binding = pattern_whilel2branchb_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, b, i, w2i, w, a);
		if (result_pattern_whilel2branchb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_2_4_solveCSP_black = pattern_whilel2branchb_2_4_solveCSP_blackB(csp);
			if (result_pattern_whilel2branchb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, i, w2i, w, a };
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
			Match match, Branch i, Branch x, Command y) {
		if (!i.equals(x)) {
			return new Object[] { _this, match, i, x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_2_SolveCSP_bindingFBBBBB(whilel2branchb _this, Match match,
			Branch i, Branch x, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_10_2_SolveCSP_bindingAndBlackFBBBBB(whilel2branchb _this,
			Match match, Branch i, Branch x, Command y) {
		Object[] result_pattern_whilel2branchb_10_2_SolveCSP_binding = pattern_whilel2branchb_10_2_SolveCSP_bindingFBBBBB(
				_this, match, i, x, y);
		if (result_pattern_whilel2branchb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_10_2_SolveCSP_black = pattern_whilel2branchb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilel2branchb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, x, y };
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
			Branch i, Branch x, Command y) {
		if (!i.equals(x)) {
			return new Object[] { match, i, x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Branch i, Branch x, Command y) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { match, i, x, y, i__x____positive, y__x____next };
	}

	public static final Object[] pattern_whilel2branchb_10_5_collectcontextelements_blackBBBB(Match match, Branch i,
			Branch x, Command y) {
		if (!i.equals(x)) {
			return new Object[] { match, i, x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilel2branchb_10_6_registerobjectstomatch_expressionBBBBB(whilel2branchb _this,
			Match match, Branch i, Branch x, Command y) {
		_this.registerObjectsToMatch_BWD(match, i, x, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject tmpI = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							return new Object[] { i, w2i, w, x, y, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_11_1_performtransformation_blackBBBBBFBB(Branch i, S2B w2i,
			While w, Branch x, Command y, whilel2branchb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, w2i, w, x, y, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whilel2branchb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whilel2branchb_11_1_performtransformation_binding[1];
			While w = (While) result_pattern_whilel2branchb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_whilel2branchb_11_1_performtransformation_binding[3];
			Command y = (Command) result_pattern_whilel2branchb_11_1_performtransformation_binding[4];

			Object[] result_pattern_whilel2branchb_11_1_performtransformation_black = pattern_whilel2branchb_11_1_performtransformation_blackBBBBBFBB(
					i, w2i, w, x, y, _this, isApplicableMatch);
			if (result_pattern_whilel2branchb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilel2branchb_11_1_performtransformation_black[5];

				return new Object[] { i, w2i, w, x, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_11_1_performtransformation_greenFBBFFBF(While w, Branch x,
			Command y) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { b, w, x, a2x, a, y, b2y };
	}

	public static final Object[] pattern_whilel2branchb_11_2_collecttranslatedelements_blackBBBBBB(Assignment b,
			Branch x, S2B a2x, While a, Command y, S2N b2y) {
		return new Object[] { b, x, a2x, a, y, b2y };
	}

	public static final Object[] pattern_whilel2branchb_11_2_collecttranslatedelements_greenFBBBBBB(Assignment b,
			Branch x, S2B a2x, While a, Command y, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, b, x, a2x, a, y, b2y };
	}

	public static final Object[] pattern_whilel2branchb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b, EObject i, EObject w2i, EObject w, EObject x, EObject a2x,
			EObject a, EObject y, EObject b2y) {
		if (!b.equals(i)) {
			if (!b.equals(w2i)) {
				if (!b.equals(w)) {
					if (!b.equals(x)) {
						if (!b.equals(y)) {
							if (!b.equals(b2y)) {
								if (!i.equals(w2i)) {
									if (!i.equals(w)) {
										if (!i.equals(x)) {
											if (!i.equals(y)) {
												if (!w2i.equals(x)) {
													if (!w2i.equals(y)) {
														if (!w.equals(w2i)) {
															if (!w.equals(x)) {
																if (!w.equals(y)) {
																	if (!x.equals(y)) {
																		if (!a2x.equals(b)) {
																			if (!a2x.equals(i)) {
																				if (!a2x.equals(w2i)) {
																					if (!a2x.equals(w)) {
																						if (!a2x.equals(x)) {
																							if (!a2x.equals(y)) {
																								if (!a2x.equals(b2y)) {
																									if (!a.equals(b)) {
																										if (!a.equals(
																												i)) {
																											if (!a.equals(
																													w2i)) {
																												if (!a.equals(
																														w)) {
																													if (!a.equals(
																															x)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a.equals(
																																	y)) {
																																if (!a.equals(
																																		b2y)) {
																																	if (!b2y.equals(
																																			i)) {
																																		if (!b2y.equals(
																																				w2i)) {
																																			if (!b2y.equals(
																																					w)) {
																																				if (!b2y.equals(
																																						x)) {
																																					if (!b2y.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								b,
																																								i,
																																								w2i,
																																								w,
																																								x,
																																								a2x,
																																								a,
																																								y,
																																								b2y };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b, EObject i, EObject w, EObject x, EObject a2x, EObject a, EObject y,
			EObject b2y) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilel2branchb";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { ruleresult, b, i, w, x, a2x, a, y, b2y, w__a____first, a2x__x____target, i__x____positive,
				a2x__a____source, y__x____next, b2y__b____source, b2y__y____target, a__b____last };
	}

	public static final void pattern_whilel2branchb_11_5_registerobjects_expressionBBBBBBBBBBB(whilel2branchb _this,
			PerformRuleResult ruleresult, EObject b, EObject i, EObject w2i, EObject w, EObject x, EObject a2x,
			EObject a, EObject y, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, b, i, w2i, w, x, a2x, a, y, b2y);

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
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("y");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					return new Object[] { i, x, y, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_12_2_corematch_blackBFFBBB(Branch i, Branch x,
			Command y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { i, w2i, w, x, y, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_12_3_findcontext_blackBBBBB(Branch i, S2B w2i,
			While w, Branch x, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (i.equals(w2i.getTarget())) {
				if (x.equals(i.getPositive())) {
					if (x.equals(y.getNext())) {
						if (w.equals(w2i.getSource())) {
							_result.add(new Object[] { i, w2i, w, x, y });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_12_3_findcontext_greenBBBBBFFFFF(Branch i, S2B w2i, While w,
			Branch x, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { i, w2i, w, x, y, isApplicableMatch, w2i__i____target, i__x____positive, y__x____next,
				w2i__w____source };
	}

	public static final Object[] pattern_whilel2branchb_12_4_solveCSP_bindingFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, Branch x, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, w2i, w, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_12_4_solveCSP_bindingAndBlackFBBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, Branch x, Command y) {
		Object[] result_pattern_whilel2branchb_12_4_solveCSP_binding = pattern_whilel2branchb_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, i, w2i, w, x, y);
		if (result_pattern_whilel2branchb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_12_4_solveCSP_black = pattern_whilel2branchb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilel2branchb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, x, y };
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
		for (Graph __DEC_x_root_49281 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_547648 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_547648)) {
					if (!i.equals(__DEC_x_positive_547648)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_978136 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_978136)) {
					if (!i.equals(__DEC_x_negative_978136)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_620463 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_4BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_766506 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_766506)) {
					if (!x.equals(__DEC_y_positive_766506)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_5BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_839623 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_839623)) {
					if (!x.equals(__DEC_y_negative_839623)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_6BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
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
		if (y.equals(x.getPositive())) {
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

	public static final Object[] pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_10BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_20_2_testcorematchandDECs_blackFFFB(
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
						if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
							if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_1BB(x, i) == null) {
								if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_2BB(x, i) == null) {
									if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_6BB(i, x) == null) {
										for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(x, Node.class, "next")) {
											if (tmpY instanceof Command) {
												Command y = (Command) tmpY;
												if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_3B(
														y) == null) {
													if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_4BBB(
															y, i, x) == null) {
														if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_5BBB(
																y, i, x) == null) {
															if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_7BB(
																	i, y) == null) {
																if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_8BB(
																		x, y) == null) {
																	if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_9BB(
																			i, y) == null) {
																		if (pattern_whilel2branchb_20_2_testcorematchandDECs_black_nac_10BB(
																				x, y) == null) {
																			_result.add(new Object[] { i, x, y,
																					_edge_positive });
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			whilel2branchb _this, Match match, Branch i, Branch x, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, x, y);
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
		for (Decision __DEC_b_positive_329234 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_872709 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_153726 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_153726)) {
					if (!a.equals(__DEC_b_first_153726)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_3BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_972875 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_972875)) {
					if (!a.equals(__DEC_b_last_972875)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_213813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_419272 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_586375 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_7BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_844868 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_844868)) {
					if (!w.equals(__DEC_a_last_844868)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_110002 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_9BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_10BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
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

	public static final Object[] pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_12BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (!a.equals(w)) {
					if (a.equals(w.getFirst())) {
						Statement tmpB = a.getLast();
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
								if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_6B(a) == null) {
									if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_7BB(a, w) == null) {
										if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
											if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_12BB(w,
													a) == null) {
												if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_0B(
														b) == null) {
													if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_1B(
															b) == null) {
														if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_2BBB(
																b, w, a) == null) {
															if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_3BBB(
																	b, w, a) == null) {
																if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_4B(
																		b) == null) {
																	if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_9BB(
																			w, b) == null) {
																		if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_10BB(
																				a, b) == null) {
																			if (pattern_whilel2branchb_21_2_testcorematchandDECs_black_nac_11BB(
																					w, b) == null) {
																				_result.add(new Object[] { b, w, a,
																						_edge_first });
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			whilel2branchb _this, Match match, Assignment b, While w, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, w, a);
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

	public static final Object[] pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("b");
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = sourceMatch.getObject("w");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject tmpB = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								return new Object[] { b, i, w, x, a, y, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_2_matchsrctrgcontext_blackBBBBBBBB(Assignment b, Branch i,
			While w, Branch x, While a, Command y, Match sourceMatch, Match targetMatch) {
		if (!i.equals(x)) {
			if (!a.equals(w)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { b, i, w, x, a, y, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding = pattern_whilel2branchb_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding != null) {
			Assignment b = (Assignment) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[0];
			Branch i = (Branch) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[1];
			While w = (While) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_whilel2branchb_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whilel2branchb_24_2_matchsrctrgcontext_black = pattern_whilel2branchb_24_2_matchsrctrgcontext_blackBBBBBBBB(
					b, i, w, x, a, y, sourceMatch, targetMatch);
			if (result_pattern_whilel2branchb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { b, i, w, x, a, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_3_solvecsp_bindingFBBBBBBBBB(whilel2branchb _this,
			Assignment b, Branch i, While w, Branch x, While a, Command y, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(b, i, w, x, a, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, b, i, w, x, a, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(whilel2branchb _this,
			Assignment b, Branch i, While w, Branch x, While a, Command y, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilel2branchb_24_3_solvecsp_binding = pattern_whilel2branchb_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, b, i, w, x, a, y, sourceMatch, targetMatch);
		if (result_pattern_whilel2branchb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilel2branchb_24_3_solvecsp_black = pattern_whilel2branchb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilel2branchb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, b, i, w, x, a, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilel2branchb_24_5_matchcorrcontext_blackBFBBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { i, w2i, w, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whilel2branchb_24_6_createcorrespondence_blackBBBBBBB(Assignment b, Branch i,
			While w, Branch x, While a, Command y, CCMatch ccMatch) {
		if (!i.equals(x)) {
			if (!a.equals(w)) {
				return new Object[] { b, i, w, x, a, y, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_24_6_createcorrespondence_greenBBFBBFB(Assignment b, Branch x,
			While a, Command y, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { b, x, a2x, a, y, b2y, ccMatch };
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
		for (Decision __DEC_b_positive_28295 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_263812 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_648347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_648347)) {
					if (!a.equals(__DEC_b_first_648347)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_3BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_216221 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_216221)) {
					if (!a.equals(__DEC_b_last_216221)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_898793 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_985656 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_344797 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_7BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_694343 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_694343)) {
					if (!w.equals(__DEC_a_last_694343)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_237846 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_9BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_10BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_11BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_black_nac_12BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_27_1_matchtggpattern_blackBBB(Assignment b, While w, While a) {
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (b.equals(a.getLast())) {
					if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_0B(b) == null) {
						if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_1B(b) == null) {
							if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_2BBB(b, w, a) == null) {
								if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_3BBB(b, w, a) == null) {
									if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_4B(b) == null) {
										if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_5B(a) == null) {
											if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_6B(a) == null) {
												if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_7BB(a,
														w) == null) {
													if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_8B(
															a) == null) {
														if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_9BB(w,
																b) == null) {
															if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_10BB(
																	a, b) == null) {
																if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_11BB(
																		w, b) == null) {
																	if (pattern_whilel2branchb_27_1_matchtggpattern_black_nac_12BB(
																			w, a) == null) {
																		return new Object[] { b, w, a };
																	}
																}
															}
														}
													}
												}
											}
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
		for (Graph __DEC_x_root_165866 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_819649 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_819649)) {
					if (!i.equals(__DEC_x_positive_819649)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_401295 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_401295)) {
					if (!i.equals(__DEC_x_negative_401295)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_516169 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_106146 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_106146)) {
					if (!x.equals(__DEC_y_positive_106146)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_5BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_209339 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_209339)) {
					if (!x.equals(__DEC_y_negative_209339)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_6BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
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
		if (y.equals(x.getPositive())) {
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

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_black_nac_10BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_28_1_matchtggpattern_blackBBB(Branch i, Branch x, Command y) {
		if (!i.equals(x)) {
			if (x.equals(i.getPositive())) {
				if (x.equals(y.getNext())) {
					if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_0B(x) == null) {
						if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_1BB(x, i) == null) {
							if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_2BB(x, i) == null) {
								if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_3B(y) == null) {
									if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_4BBB(y, i, x) == null) {
										if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_5BBB(y, i,
												x) == null) {
											if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_6BB(i,
													x) == null) {
												if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_7BB(i,
														y) == null) {
													if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_8BB(x,
															y) == null) {
														if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_9BB(i,
																y) == null) {
															if (pattern_whilel2branchb_28_1_matchtggpattern_black_nac_10BB(
																	x, y) == null) {
																return new Object[] { i, x, y };
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whilel2branchb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whilel2branchb_29_2_isapplicablecore_black_nac_0BB(ruleResult, i) == null) {
									if (pattern_whilel2branchb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											w) == null) {
										_result.add(
												new Object[] { w2iList, i, w2i, w, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilel2branchb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilel2branchb_29_3_solveCSP_bindingAndBlackFBBBBBB(whilel2branchb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilel2branchb_29_3_solveCSP_binding = pattern_whilel2branchb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whilel2branchb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilel2branchb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilel2branchb_29_3_solveCSP_black = pattern_whilel2branchb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilel2branchb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilel2branchb_29_4_checkCSP_expressionFBB(whilel2branchb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilel2branchb_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whilel2branchb_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whilel2branchb_29_6_perform_greenFBBFFFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(b);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b, i, w, x, a2x, a, y, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilel2branchb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilel2branchbImpl
