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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileul2branchub;

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
 * An implementation of the model object '<em><b>whileul2branchub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileul2branchubImpl extends AbstractRuleImpl implements whileul2branchub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileul2branchubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileul2branchub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While w, Assignment b, While a) {

		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_0_1_initialbindings_blackBBBBB(this,
				match, w, b, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, w, b, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileul2branchubImpl.pattern_whileul2branchub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileul2branchubImpl
					.pattern_whileul2branchub_0_4_collectelementstobetranslated_blackBBBB(match, w, b, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			whileul2branchubImpl.pattern_whileul2branchub_0_4_collectelementstobetranslated_greenBBBBFFF(match, w, b,
					a);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[6];

			Object[] result5_black = whileul2branchubImpl
					.pattern_whileul2branchub_0_5_collectcontextelements_blackBBBB(match, w, b, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			whileul2branchubImpl.pattern_whileul2branchub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileul2branchubImpl.pattern_whileul2branchub_0_6_registerobjectstomatch_expressionBBBBB(this, match, w, b,
					a);
			return whileul2branchubImpl.pattern_whileul2branchub_0_7_expressionF();
		} else {
			return whileul2branchubImpl.pattern_whileul2branchub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Assignment b = (Assignment) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileul2branchubImpl.pattern_whileul2branchub_1_1_performtransformation_greenFFFBFBB(b,
				a, i);
		S2B a2x = (S2B) result1_green[0];
		Command y = (Command) result1_green[1];
		Branch x = (Branch) result1_green[2];
		S2N b2y = (S2N) result1_green[4];

		Object[] result2_black = whileul2branchubImpl
				.pattern_whileul2branchub_1_2_collecttranslatedelements_blackBBBBBB(a2x, y, x, b, b2y, a);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", "
							+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whileul2branchubImpl
				.pattern_whileul2branchub_1_2_collecttranslatedelements_greenFBBBBBB(a2x, y, x, b, b2y, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileul2branchubImpl.pattern_whileul2branchub_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, w, a2x, y, x, b, b2y, w2i, a, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ", " + "[b2y] = " + b2y + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", "
					+ "[i] = " + i + ".");
		}
		whileul2branchubImpl.pattern_whileul2branchub_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult, w,
				a2x, y, x, b, b2y, a, i);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[18];

		// 
		// 
		whileul2branchubImpl.pattern_whileul2branchub_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, w,
				a2x, y, x, b, b2y, w2i, a, i);
		return whileul2branchubImpl.pattern_whileul2branchub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileul2branchubImpl
				.pattern_whileul2branchub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileul2branchubImpl.pattern_whileul2branchub_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While w = (While) result2_binding[0];
		Assignment b = (Assignment) result2_binding[1];
		While a = (While) result2_binding[2];
		for (Object[] result2_black : whileul2branchubImpl.pattern_whileul2branchub_2_2_corematch_blackBBFBFB(w, b, a,
				match)) {
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileul2branchubImpl.pattern_whileul2branchub_2_3_findcontext_blackBBBBB(w, b,
					w2i, a, i)) {
				Object[] result3_green = whileul2branchubImpl
						.pattern_whileul2branchub_2_3_findcontext_greenBBBBBFFFFFF(w, b, w2i, a, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = whileul2branchubImpl
						.pattern_whileul2branchub_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, w, b,
								w2i, a, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[b] = " + b
							+ ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", " + "[i] = " + i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileul2branchubImpl.pattern_whileul2branchub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileul2branchubImpl
							.pattern_whileul2branchub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileul2branchubImpl.pattern_whileul2branchub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileul2branchubImpl.pattern_whileul2branchub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While w, Assignment b, While a) {
		match.registerObject("w", w);
		match.registerObject("b", b);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, Assignment b, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While w, Assignment b, S2B w2i, While a,
			Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x,
			EObject b, EObject b2y, EObject w2i, EObject a, EObject i) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("i", i);

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
	public boolean isAppropriate_BWD(Match match, Command y, Branch x, Branch i) {

		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_10_1_initialbindings_blackBBBBB(this,
				match, y, x, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, y, x, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileul2branchubImpl.pattern_whileul2branchub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileul2branchubImpl
					.pattern_whileul2branchub_10_4_collectelementstobetranslated_blackBBBB(match, y, x, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileul2branchubImpl.pattern_whileul2branchub_10_4_collectelementstobetranslated_greenBBBBFFF(match, y, x,
					i);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];

			Object[] result5_black = whileul2branchubImpl
					.pattern_whileul2branchub_10_5_collectcontextelements_blackBBBB(match, y, x, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileul2branchubImpl.pattern_whileul2branchub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileul2branchubImpl.pattern_whileul2branchub_10_6_registerobjectstomatch_expressionBBBBB(this, match, y, x,
					i);
			return whileul2branchubImpl.pattern_whileul2branchub_10_7_expressionF();
		} else {
			return whileul2branchubImpl.pattern_whileul2branchub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		Branch x = (Branch) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileul2branchubImpl
				.pattern_whileul2branchub_11_1_performtransformation_greenBFBBFFF(w, y, x);
		S2B a2x = (S2B) result1_green[1];
		Assignment b = (Assignment) result1_green[4];
		S2N b2y = (S2N) result1_green[5];
		While a = (While) result1_green[6];

		Object[] result2_black = whileul2branchubImpl
				.pattern_whileul2branchub_11_2_collecttranslatedelements_blackBBBBBB(a2x, y, x, b, b2y, a);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", "
							+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whileul2branchubImpl
				.pattern_whileul2branchub_11_2_collecttranslatedelements_greenFBBBBBB(a2x, y, x, b, b2y, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileul2branchubImpl.pattern_whileul2branchub_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, w, a2x, y, x, b, b2y, w2i, a, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ", " + "[b2y] = " + b2y + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", "
					+ "[i] = " + i + ".");
		}
		whileul2branchubImpl.pattern_whileul2branchub_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult, w,
				a2x, y, x, b, b2y, a, i);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[18];

		// 
		// 
		whileul2branchubImpl.pattern_whileul2branchub_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, w,
				a2x, y, x, b, b2y, w2i, a, i);
		return whileul2branchubImpl.pattern_whileul2branchub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileul2branchubImpl
				.pattern_whileul2branchub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileul2branchubImpl.pattern_whileul2branchub_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command y = (Command) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Branch i = (Branch) result2_binding[2];
		for (Object[] result2_black : whileul2branchubImpl.pattern_whileul2branchub_12_2_corematch_blackFBBFBB(y, x, i,
				match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileul2branchubImpl.pattern_whileul2branchub_12_3_findcontext_blackBBBBB(w,
					y, x, w2i, i)) {
				Object[] result3_green = whileul2branchubImpl
						.pattern_whileul2branchub_12_3_findcontext_greenBBBBBFFFFFF(w, y, x, w2i, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = whileul2branchubImpl
						.pattern_whileul2branchub_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, w, y,
								x, w2i, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[y] = " + y
							+ ", " + "[x] = " + x + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileul2branchubImpl.pattern_whileul2branchub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileul2branchubImpl
							.pattern_whileul2branchub_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileul2branchubImpl.pattern_whileul2branchub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileul2branchubImpl.pattern_whileul2branchub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch x, Branch i) {
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch x, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Command y, Branch x, S2B w2i,
			Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x,
			EObject b, EObject b2y, EObject w2i, EObject a, EObject i) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_74(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileul2branchubImpl.pattern_whileul2branchub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileul2branchubImpl
				.pattern_whileul2branchub_20_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			Command y = (Command) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch i = (Branch) result2_black[2];
			Object[] result2_green = whileul2branchubImpl
					.pattern_whileul2branchub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileul2branchubImpl
					.pattern_whileul2branchub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, y, x, i)) {
				// 
				if (whileul2branchubImpl
						.pattern_whileul2branchub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileul2branchubImpl
							.pattern_whileul2branchub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileul2branchubImpl.pattern_whileul2branchub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileul2branchubImpl.pattern_whileul2branchub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_80(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileul2branchubImpl.pattern_whileul2branchub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileul2branchubImpl
				.pattern_whileul2branchub_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			While w = (While) result2_black[0];
			Assignment b = (Assignment) result2_black[1];
			While a = (While) result2_black[2];
			Object[] result2_green = whileul2branchubImpl
					.pattern_whileul2branchub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileul2branchubImpl
					.pattern_whileul2branchub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, w, b, a)) {
				// 
				if (whileul2branchubImpl
						.pattern_whileul2branchub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileul2branchubImpl
							.pattern_whileul2branchub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileul2branchubImpl.pattern_whileul2branchub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileul2branchubImpl.pattern_whileul2branchub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileul2branchub");
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
		ruleResult.setRule("whileul2branchub");
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

		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileul2branchubImpl.pattern_whileul2branchub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While w = (While) result2_bindingAndBlack[0];
		Command y = (Command) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		Assignment b = (Assignment) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Branch i = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, w, y, x, b, a, i, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = "
					+ a + ", " + "[i] = " + i + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileul2branchubImpl.pattern_whileul2branchub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileul2branchubImpl
					.pattern_whileul2branchub_24_5_matchcorrcontext_blackBFBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileul2branchubImpl
						.pattern_whileul2branchub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileul2branchubImpl
						.pattern_whileul2branchub_24_6_createcorrespondence_blackBBBBBBB(w, y, x, b, a, i, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
							+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
							+ "[i] = " + i + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileul2branchubImpl.pattern_whileul2branchub_24_6_createcorrespondence_greenFBBBFBB(y, x, b, a,
						ccMatch);
				//nothing S2B a2x = (S2B) result6_green[0];
				//nothing S2N b2y = (S2N) result6_green[4];

				Object[] result7_black = whileul2branchubImpl
						.pattern_whileul2branchub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileul2branchubImpl.pattern_whileul2branchub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileul2branchubImpl.pattern_whileul2branchub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While w, Command y, Branch x, Assignment b, While a, Branch i,
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
	public boolean checkDEC_FWD(While w, Assignment b, While a) {// 
		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_27_1_matchtggpattern_blackBBB(w, b, a);
		if (result1_black != null) {
			return whileul2branchubImpl.pattern_whileul2branchub_27_2_expressionF();
		} else {
			return whileul2branchubImpl.pattern_whileul2branchub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command y, Branch x, Branch i) {// 
		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_28_1_matchtggpattern_blackBBB(y, x, i);
		if (result1_black != null) {
			return whileul2branchubImpl.pattern_whileul2branchub_28_2_expressionF();
		} else {
			return whileul2branchubImpl.pattern_whileul2branchub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileul2branchubImpl.pattern_whileul2branchub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileul2branchubImpl
				.pattern_whileul2branchub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileul2branchubImpl
					.pattern_whileul2branchub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, w2i, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileul2branchubImpl.pattern_whileul2branchub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileul2branchubImpl.pattern_whileul2branchub_29_5_checknacs_blackBBB(w, w2i,
						i);
				if (result5_black != null) {

					Object[] result6_black = whileul2branchubImpl.pattern_whileul2branchub_29_6_perform_blackBBBB(w,
							w2i, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileul2branchubImpl.pattern_whileul2branchub_29_6_perform_greenBFFFFFFBB(w, i, ruleResult);
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Command y = (Command) result6_green[2];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing Assignment b = (Assignment) result6_green[4];
					//nothing S2N b2y = (S2N) result6_green[5];
					//nothing While a = (While) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return whileul2branchubImpl.pattern_whileul2branchub_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i,
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
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
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
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILEUL2BRANCHUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
			return null;
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_ASSIGNMENT_S2B_WHILE_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEUL2BRANCHUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_COMMAND_BRANCH_S2B_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_74((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_80__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_80((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_COMMAND_BRANCH_ASSIGNMENT_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_DEC_FWD__WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEUL2BRANCHUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEUL2BRANCHUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEUL2BRANCHUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileul2branchub_0_1_initialbindings_blackBBBBB(whileul2branchub _this,
			Match match, While w, Assignment b, While a) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_0_2_SolveCSP_bindingFBBBBB(whileul2branchub _this,
			Match match, While w, Assignment b, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_0_2_SolveCSP_bindingAndBlackFBBBBB(whileul2branchub _this,
			Match match, While w, Assignment b, While a) {
		Object[] result_pattern_whileul2branchub_0_2_SolveCSP_binding = pattern_whileul2branchub_0_2_SolveCSP_bindingFBBBBB(
				_this, match, w, b, a);
		if (result_pattern_whileul2branchub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_0_2_SolveCSP_black = pattern_whileul2branchub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, b, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_0_3_CheckCSP_expressionFBB(whileul2branchub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_0_4_collectelementstobetranslated_blackBBBB(Match match,
			While w, Assignment b, While a) {
		if (!a.equals(w)) {
			return new Object[] { match, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			While w, Assignment b, While a) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		return new Object[] { match, w, b, a, w__a____first, a__b____last, a__b____first };
	}

	public static final Object[] pattern_whileul2branchub_0_5_collectcontextelements_blackBBBB(Match match, While w,
			Assignment b, While a) {
		if (!a.equals(w)) {
			return new Object[] { match, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileul2branchub_0_6_registerobjectstomatch_expressionBBBBB(whileul2branchub _this,
			Match match, While w, Assignment b, While a) {
		_this.registerObjectsToMatch_FWD(match, w, b, a);

	}

	public static final boolean pattern_whileul2branchub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileul2branchub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject tmpW = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpI = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							return new Object[] { w, b, w2i, a, i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_1_1_performtransformation_blackBBBBBFBB(While w, Assignment b,
			S2B w2i, While a, Branch i, whileul2branchub _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w, b, w2i, a, i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			whileul2branchub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileul2branchub_1_1_performtransformation_binding = pattern_whileul2branchub_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileul2branchub_1_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whileul2branchub_1_1_performtransformation_binding[0];
			Assignment b = (Assignment) result_pattern_whileul2branchub_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileul2branchub_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_whileul2branchub_1_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whileul2branchub_1_1_performtransformation_binding[4];

			Object[] result_pattern_whileul2branchub_1_1_performtransformation_black = pattern_whileul2branchub_1_1_performtransformation_blackBBBBBFBB(
					w, b, w2i, a, i, _this, isApplicableMatch);
			if (result_pattern_whileul2branchub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileul2branchub_1_1_performtransformation_black[5];

				return new Object[] { w, b, w2i, a, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_1_1_performtransformation_greenFFFBFBB(Assignment b, While a,
			Branch i) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		y.setNext(x);
		a2x.setTarget(x);
		x.setPositive(y);
		i.setPositive(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { a2x, y, x, b, b2y, a, i };
	}

	public static final Object[] pattern_whileul2branchub_1_2_collecttranslatedelements_blackBBBBBB(S2B a2x, Command y,
			Branch x, Assignment b, S2N b2y, While a) {
		return new Object[] { a2x, y, x, b, b2y, a };
	}

	public static final Object[] pattern_whileul2branchub_1_2_collecttranslatedelements_greenFBBBBBB(S2B a2x, Command y,
			Branch x, Assignment b, S2N b2y, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, a2x, y, x, b, b2y, a };
	}

	public static final Object[] pattern_whileul2branchub_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x, EObject b, EObject b2y,
			EObject w2i, EObject a, EObject i) {
		if (!w.equals(y)) {
			if (!w.equals(x)) {
				if (!w.equals(w2i)) {
					if (!a2x.equals(w)) {
						if (!a2x.equals(y)) {
							if (!a2x.equals(x)) {
								if (!a2x.equals(b)) {
									if (!a2x.equals(b2y)) {
										if (!a2x.equals(w2i)) {
											if (!a2x.equals(i)) {
												if (!x.equals(y)) {
													if (!b.equals(w)) {
														if (!b.equals(y)) {
															if (!b.equals(x)) {
																if (!b.equals(b2y)) {
																	if (!b.equals(w2i)) {
																		if (!b.equals(i)) {
																			if (!b2y.equals(w)) {
																				if (!b2y.equals(y)) {
																					if (!b2y.equals(x)) {
																						if (!b2y.equals(w2i)) {
																							if (!b2y.equals(i)) {
																								if (!w2i.equals(y)) {
																									if (!w2i.equals(
																											x)) {
																										if (!a.equals(
																												w)) {
																											if (!a.equals(
																													a2x)) {
																												if (!a.equals(
																														y)) {
																													if (!a.equals(
																															x)) {
																														if (!a.equals(
																																b)) {
																															if (!a.equals(
																																	b2y)) {
																																if (!a.equals(
																																		w2i)) {
																																	if (!a.equals(
																																			i)) {
																																		if (!i.equals(
																																				w)) {
																																			if (!i.equals(
																																					y)) {
																																				if (!i.equals(
																																						x)) {
																																					if (!i.equals(
																																							w2i)) {
																																						return new Object[] {
																																								ruleresult,
																																								w,
																																								a2x,
																																								y,
																																								x,
																																								b,
																																								b2y,
																																								w2i,
																																								a,
																																								i };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileul2branchub_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x, EObject b, EObject b2y,
			EObject a, EObject i) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileul2branchub";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { ruleresult, w, a2x, y, x, b, b2y, a, i, w__a____first, b2y__b____source, b2y__y____target,
				y__x____next, a2x__x____target, x__y____positive, a2x__a____source, a__b____last, a__b____first,
				i__x____positive };
	}

	public static final void pattern_whileul2branchub_1_5_registerobjects_expressionBBBBBBBBBBB(whileul2branchub _this,
			PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x, EObject b, EObject b2y,
			EObject w2i, EObject a, EObject i) {
		_this.registerObjects_FWD(ruleresult, w, a2x, y, x, b, b2y, w2i, a, i);

	}

	public static final PerformRuleResult pattern_whileul2branchub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_2_1_preparereturnvalue_bindingFB(whileul2branchub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileul2branchub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileul2branchub _this) {
		Object[] result_pattern_whileul2branchub_2_1_preparereturnvalue_binding = pattern_whileul2branchub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileul2branchub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileul2branchub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileul2branchub_2_1_preparereturnvalue_black = pattern_whileul2branchub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileul2branchub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileul2branchub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileul2branchub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileul2branchub_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpW = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					return new Object[] { w, b, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_2_2_corematch_blackBBFBFB(While w, Assignment b,
			While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w, b, w2i, a, i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_2_3_findcontext_blackBBBBB(While w, Assignment b,
			S2B w2i, While a, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (b.equals(a.getLast())) {
					if (w.equals(w2i.getSource())) {
						if (b.equals(a.getFirst())) {
							if (i.equals(w2i.getTarget())) {
								_result.add(new Object[] { w, b, w2i, a, i });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_2_3_findcontext_greenBBBBBFFFFFF(While w, Assignment b,
			S2B w2i, While a, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String w2i__w____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(i);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w, b, w2i, a, i, isApplicableMatch, w__a____first, a__b____last, w2i__w____source,
				a__b____first, w2i__i____target };
	}

	public static final Object[] pattern_whileul2branchub_2_4_solveCSP_bindingFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, While w, Assignment b, S2B w2i, While a, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w, b, w2i, a, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, b, w2i, a, i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_2_4_solveCSP_bindingAndBlackFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, While w, Assignment b, S2B w2i, While a, Branch i) {
		Object[] result_pattern_whileul2branchub_2_4_solveCSP_binding = pattern_whileul2branchub_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, w, b, w2i, a, i);
		if (result_pattern_whileul2branchub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_2_4_solveCSP_black = pattern_whileul2branchub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, b, w2i, a, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_2_5_checkCSP_expressionFBB(whileul2branchub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileul2branchub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileul2branchub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileul2branchub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_10_1_initialbindings_blackBBBBB(whileul2branchub _this,
			Match match, Command y, Branch x, Branch i) {
		if (!i.equals(x)) {
			return new Object[] { _this, match, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_2_SolveCSP_bindingFBBBBB(whileul2branchub _this,
			Match match, Command y, Branch x, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_10_2_SolveCSP_bindingAndBlackFBBBBB(whileul2branchub _this,
			Match match, Command y, Branch x, Branch i) {
		Object[] result_pattern_whileul2branchub_10_2_SolveCSP_binding = pattern_whileul2branchub_10_2_SolveCSP_bindingFBBBBB(
				_this, match, y, x, i);
		if (result_pattern_whileul2branchub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_10_2_SolveCSP_black = pattern_whileul2branchub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, x, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_10_3_CheckCSP_expressionFBB(whileul2branchub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Command y, Branch x, Branch i) {
		if (!i.equals(x)) {
			return new Object[] { match, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			Command y, Branch x, Branch i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, y, x, i, y__x____next, x__y____positive, i__x____positive };
	}

	public static final Object[] pattern_whileul2branchub_10_5_collectcontextelements_blackBBBB(Match match, Command y,
			Branch x, Branch i) {
		if (!i.equals(x)) {
			return new Object[] { match, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileul2branchub_10_6_registerobjectstomatch_expressionBBBBB(
			whileul2branchub _this, Match match, Command y, Branch x, Branch i) {
		_this.registerObjectsToMatch_BWD(match, y, x, i);

	}

	public static final boolean pattern_whileul2branchub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileul2branchub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("x");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject tmpW = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpI = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							return new Object[] { w, y, x, w2i, i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_11_1_performtransformation_blackBBBBBFBB(While w, Command y,
			Branch x, S2B w2i, Branch i, whileul2branchub _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w, y, x, w2i, i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			whileul2branchub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileul2branchub_11_1_performtransformation_binding = pattern_whileul2branchub_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileul2branchub_11_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whileul2branchub_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whileul2branchub_11_1_performtransformation_binding[1];
			Branch x = (Branch) result_pattern_whileul2branchub_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileul2branchub_11_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whileul2branchub_11_1_performtransformation_binding[4];

			Object[] result_pattern_whileul2branchub_11_1_performtransformation_black = pattern_whileul2branchub_11_1_performtransformation_blackBBBBBFBB(
					w, y, x, w2i, i, _this, isApplicableMatch);
			if (result_pattern_whileul2branchub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileul2branchub_11_1_performtransformation_black[5];

				return new Object[] { w, y, x, w2i, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_11_1_performtransformation_greenBFBBFFF(While w, Command y,
			Branch x) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		a2x.setTarget(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		a.setFirst(b);
		return new Object[] { w, a2x, y, x, b, b2y, a };
	}

	public static final Object[] pattern_whileul2branchub_11_2_collecttranslatedelements_blackBBBBBB(S2B a2x, Command y,
			Branch x, Assignment b, S2N b2y, While a) {
		return new Object[] { a2x, y, x, b, b2y, a };
	}

	public static final Object[] pattern_whileul2branchub_11_2_collecttranslatedelements_greenFBBBBBB(S2B a2x,
			Command y, Branch x, Assignment b, S2N b2y, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, a2x, y, x, b, b2y, a };
	}

	public static final Object[] pattern_whileul2branchub_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x, EObject b, EObject b2y,
			EObject w2i, EObject a, EObject i) {
		if (!w.equals(y)) {
			if (!w.equals(x)) {
				if (!w.equals(w2i)) {
					if (!a2x.equals(w)) {
						if (!a2x.equals(y)) {
							if (!a2x.equals(x)) {
								if (!a2x.equals(b)) {
									if (!a2x.equals(b2y)) {
										if (!a2x.equals(w2i)) {
											if (!a2x.equals(i)) {
												if (!x.equals(y)) {
													if (!b.equals(w)) {
														if (!b.equals(y)) {
															if (!b.equals(x)) {
																if (!b.equals(b2y)) {
																	if (!b.equals(w2i)) {
																		if (!b.equals(i)) {
																			if (!b2y.equals(w)) {
																				if (!b2y.equals(y)) {
																					if (!b2y.equals(x)) {
																						if (!b2y.equals(w2i)) {
																							if (!b2y.equals(i)) {
																								if (!w2i.equals(y)) {
																									if (!w2i.equals(
																											x)) {
																										if (!a.equals(
																												w)) {
																											if (!a.equals(
																													a2x)) {
																												if (!a.equals(
																														y)) {
																													if (!a.equals(
																															x)) {
																														if (!a.equals(
																																b)) {
																															if (!a.equals(
																																	b2y)) {
																																if (!a.equals(
																																		w2i)) {
																																	if (!a.equals(
																																			i)) {
																																		if (!i.equals(
																																				w)) {
																																			if (!i.equals(
																																					y)) {
																																				if (!i.equals(
																																						x)) {
																																					if (!i.equals(
																																							w2i)) {
																																						return new Object[] {
																																								ruleresult,
																																								w,
																																								a2x,
																																								y,
																																								x,
																																								b,
																																								b2y,
																																								w2i,
																																								a,
																																								i };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileul2branchub_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x, EObject b, EObject b2y,
			EObject a, EObject i) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileul2branchub";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { ruleresult, w, a2x, y, x, b, b2y, a, i, w__a____first, b2y__b____source, b2y__y____target,
				y__x____next, a2x__x____target, x__y____positive, a2x__a____source, a__b____last, a__b____first,
				i__x____positive };
	}

	public static final void pattern_whileul2branchub_11_5_registerobjects_expressionBBBBBBBBBBB(whileul2branchub _this,
			PerformRuleResult ruleresult, EObject w, EObject a2x, EObject y, EObject x, EObject b, EObject b2y,
			EObject w2i, EObject a, EObject i) {
		_this.registerObjects_BWD(ruleresult, w, a2x, y, x, b, b2y, w2i, a, i);

	}

	public static final PerformRuleResult pattern_whileul2branchub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_12_1_preparereturnvalue_bindingFB(whileul2branchub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileul2branchub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileul2branchub _this) {
		Object[] result_pattern_whileul2branchub_12_1_preparereturnvalue_binding = pattern_whileul2branchub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileul2branchub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileul2branchub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileul2branchub_12_1_preparereturnvalue_black = pattern_whileul2branchub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileul2branchub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileul2branchub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileul2branchub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileul2branchub_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpI = _localVariable_2;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					return new Object[] { y, x, i, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_12_2_corematch_blackFBBFBB(Command y, Branch x,
			Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { w, y, x, w2i, i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_12_3_findcontext_blackBBBBB(While w, Command y,
			Branch x, S2B w2i, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (x.equals(y.getNext())) {
				if (y.equals(x.getPositive())) {
					if (w.equals(w2i.getSource())) {
						if (i.equals(w2i.getTarget())) {
							if (x.equals(i.getPositive())) {
								_result.add(new Object[] { w, y, x, w2i, i });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_12_3_findcontext_greenBBBBBFFFFFF(While w, Command y,
			Branch x, S2B w2i, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { w, y, x, w2i, i, isApplicableMatch, y__x____next, x__y____positive, w2i__w____source,
				w2i__i____target, i__x____positive };
	}

	public static final Object[] pattern_whileul2branchub_12_4_solveCSP_bindingFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, While w, Command y, Branch x, S2B w2i, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, y, x, w2i, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, y, x, w2i, i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_12_4_solveCSP_bindingAndBlackFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, While w, Command y, Branch x, S2B w2i, Branch i) {
		Object[] result_pattern_whileul2branchub_12_4_solveCSP_binding = pattern_whileul2branchub_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, w, y, x, w2i, i);
		if (result_pattern_whileul2branchub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_12_4_solveCSP_black = pattern_whileul2branchub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, y, x, w2i, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_12_5_checkCSP_expressionFBB(whileul2branchub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileul2branchub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileul2branchub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileul2branchub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_20_1_preparereturnvalue_bindingFB(whileul2branchub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileul2branchub _this) {
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

	public static final Object[] pattern_whileul2branchub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileul2branchub _this) {
		Object[] result_pattern_whileul2branchub_20_1_preparereturnvalue_binding = pattern_whileul2branchub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileul2branchub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileul2branchub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileul2branchub_20_1_preparereturnvalue_black = pattern_whileul2branchub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileul2branchub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileul2branchub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileul2branchub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_795286 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_1BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_855829 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_855829)) {
					if (!i.equals(__DEC_y_positive_855829)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_2BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_614493 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_614493)) {
					if (!i.equals(__DEC_y_negative_614493)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_244336 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_550215 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_550215)) {
					if (!i.equals(__DEC_x_positive_550215)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_153056 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_153056)) {
					if (!i.equals(__DEC_x_negative_153056)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_6BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_7BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_8BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(y.getNext())) {
					if (y.equals(x.getPositive())) {
						if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
							if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
								if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_7BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_1BBB(y, x,
													i) == null) {
												if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_2BBB(y,
														x, i) == null) {
													if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_4BB(
															x, i) == null) {
														if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_5BB(
																x, i) == null) {
															if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_6BB(
																	i, y) == null) {
																if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_8BB(
																		i, y) == null) {
																	_result.add(new Object[] { y, x, i, _edge_next });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileul2branchub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whileul2branchub _this, Match match, Command y, Branch x, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, x, i);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileul2branchub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileul2branchub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileul2branchub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_21_1_preparereturnvalue_bindingFB(whileul2branchub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileul2branchub _this) {
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

	public static final Object[] pattern_whileul2branchub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileul2branchub _this) {
		Object[] result_pattern_whileul2branchub_21_1_preparereturnvalue_binding = pattern_whileul2branchub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileul2branchub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileul2branchub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileul2branchub_21_1_preparereturnvalue_black = pattern_whileul2branchub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileul2branchub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileul2branchub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileul2branchub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_650114 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_453209 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_291978 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_291978)) {
					if (!a.equals(__DEC_b_last_291978)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_434725 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_4B(While a) {
		for (Decision __DEC_a_positive_941958 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_negative_125609 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_6BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_222006 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_222006)) {
					if (!w.equals(__DEC_a_last_222006)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_837378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_8BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_9BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_21_2_testcorematchandDECs_blackFFFB(
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
							if (b.equals(a.getFirst())) {
								if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_4B(a) == null) {
									if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
										if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_6BB(a,
												w) == null) {
											if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_7B(
													a) == null) {
												if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_9BB(w,
														a) == null) {
													if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_0B(
															b) == null) {
														if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_1B(
																b) == null) {
															if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_2BBB(
																	b, w, a) == null) {
																if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_3B(
																		b) == null) {
																	if (pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_8BB(
																			w, b) == null) {
																		_result.add(
																				new Object[] { w, b, a, _edge_first });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileul2branchub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whileul2branchub _this, Match match, While w, Assignment b, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, b, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileul2branchub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileul2branchub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileul2branchub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_24_1_prepare_blackB(whileul2branchub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileul2branchub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("i");
		EObject tmpW = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { w, y, x, b, a, i, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_2_matchsrctrgcontext_blackBBBBBBBB(While w, Command y,
			Branch x, Assignment b, While a, Branch i, Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { w, y, x, b, a, i, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding = pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding != null) {
			While w = (While) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[0];
			Command y = (Command) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[2];
			Assignment b = (Assignment) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[4];
			Branch i = (Branch) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whileul2branchub_24_2_matchsrctrgcontext_black = pattern_whileul2branchub_24_2_matchsrctrgcontext_blackBBBBBBBB(
					w, y, x, b, a, i, sourceMatch, targetMatch);
			if (result_pattern_whileul2branchub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, y, x, b, a, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_3_solvecsp_bindingFBBBBBBBBB(whileul2branchub _this,
			While w, Command y, Branch x, Assignment b, While a, Branch i, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(w, y, x, b, a, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, w, y, x, b, a, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whileul2branchub _this, While w, Command y, Branch x, Assignment b, While a, Branch i, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whileul2branchub_24_3_solvecsp_binding = pattern_whileul2branchub_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, w, y, x, b, a, i, sourceMatch, targetMatch);
		if (result_pattern_whileul2branchub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileul2branchub_24_3_solvecsp_black = pattern_whileul2branchub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileul2branchub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, y, x, b, a, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_24_5_matchcorrcontext_blackBFBBB(While w, Branch i,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w, w2i, i, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileul2branchub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileul2branchub_24_6_createcorrespondence_blackBBBBBBB(While w, Command y,
			Branch x, Assignment b, While a, Branch i, CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				return new Object[] { w, y, x, b, a, i, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_6_createcorrespondence_greenFBBBFBB(Command y, Branch x,
			Assignment b, While a, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { a2x, y, x, b, b2y, a, ccMatch };
	}

	public static final Object[] pattern_whileul2branchub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileul2branchub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileul2branchub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileul2branchub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_642478 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_160143 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_644652 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_644652)) {
					if (!a.equals(__DEC_b_last_644652)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_289094 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_4B(While a) {
		for (Decision __DEC_a_positive_76422 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_negative_288675 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_6BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_441482 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_441482)) {
					if (!w.equals(__DEC_a_last_441482)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_329374 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_8BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_9BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_blackBBB(While w, Assignment b,
			While a) {
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (b.equals(a.getLast())) {
					if (b.equals(a.getFirst())) {
						if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_0B(b) == null) {
							if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_1B(b) == null) {
								if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_2BBB(b, w, a) == null) {
									if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_3B(b) == null) {
										if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_4B(a) == null) {
											if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_5B(a) == null) {
												if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_6BB(a,
														w) == null) {
													if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_7B(
															a) == null) {
														if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_8BB(
																w, b) == null) {
															if (pattern_whileul2branchub_27_1_matchtggpattern_black_nac_9BB(
																	w, a) == null) {
																return new Object[] { w, b, a };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whileul2branchub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileul2branchub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_309641 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_1BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_124773 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_124773)) {
					if (!i.equals(__DEC_y_positive_124773)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_2BBB(Command y, Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_45470 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_45470)) {
					if (!i.equals(__DEC_y_negative_45470)) {
						return new Object[] { y, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_578257 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_232204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_232204)) {
					if (!i.equals(__DEC_x_positive_232204)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_908710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_908710)) {
					if (!i.equals(__DEC_x_negative_908710)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_6BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_7BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_8BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_blackBBB(Command y, Branch x, Branch i) {
		if (!i.equals(x)) {
			if (x.equals(y.getNext())) {
				if (y.equals(x.getPositive())) {
					if (x.equals(i.getPositive())) {
						if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_0B(y) == null) {
							if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_1BBB(y, x, i) == null) {
								if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_2BBB(y, x, i) == null) {
									if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_3B(x) == null) {
										if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_4BB(x, i) == null) {
											if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_5BB(x,
													i) == null) {
												if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_6BB(i,
														y) == null) {
													if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_7BB(x,
															y) == null) {
														if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_8BB(
																i, y) == null) {
															return new Object[] { y, x, i };
														}
													}
												}
											}
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

	public static final boolean pattern_whileul2branchub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileul2branchub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_29_1_createresult_blackB(whileul2branchub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileul2branchub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileul2branchub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileul2branchub_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whileul2branchub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whileul2branchub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileul2branchub_29_3_solveCSP_bindingFBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, w2i, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_29_3_solveCSP_bindingAndBlackFBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileul2branchub_29_3_solveCSP_binding = pattern_whileul2branchub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, w2i, i, ruleResult);
		if (result_pattern_whileul2branchub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_29_3_solveCSP_black = pattern_whileul2branchub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_29_4_checkCSP_expressionFBB(whileul2branchub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_29_5_checknacs_blackBBB(While w, S2B w2i, Branch i) {
		return new Object[] { w, w2i, i };
	}

	public static final Object[] pattern_whileul2branchub_29_6_perform_blackBBBB(While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, w2i, i, ruleResult };
	}

	public static final Object[] pattern_whileul2branchub_29_6_perform_greenBFFFFFFBB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getTargetObjects().add(y);
		y.setNext(x);
		a2x.setTarget(x);
		x.setPositive(y);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getSourceObjects().add(b);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		a.setFirst(b);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { w, a2x, y, x, b, b2y, a, i, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileul2branchub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileul2branchubImpl
