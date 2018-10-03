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
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[6];

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
		Branch i = (Branch) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		While a = (While) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileul2branchubImpl.pattern_whileul2branchub_1_1_performtransformation_greenBFFBFBF(i,
				b, a);
		Command y = (Command) result1_green[1];
		S2N b2y = (S2N) result1_green[2];
		Branch x = (Branch) result1_green[4];
		S2B a2x = (S2B) result1_green[6];

		Object[] result2_black = whileul2branchubImpl
				.pattern_whileul2branchub_1_2_collecttranslatedelements_blackBBBBBB(y, b2y, b, x, a, a2x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", "
							+ "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whileul2branchubImpl
				.pattern_whileul2branchub_1_2_collecttranslatedelements_greenFBBBBBB(y, b2y, b, x, a, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileul2branchubImpl.pattern_whileul2branchub_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, i, w, w2i, y, b2y, b, x, a, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
					+ "[a2x] = " + a2x + ".");
		}
		whileul2branchubImpl.pattern_whileul2branchub_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult, i, w,
				y, b2y, b, x, a, a2x);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[18];

		// 
		// 
		whileul2branchubImpl.pattern_whileul2branchub_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, i, w,
				w2i, y, b2y, b, x, a, a2x);
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
		for (Object[] result2_black : whileul2branchubImpl.pattern_whileul2branchub_2_2_corematch_blackFBFBBB(w, b, a,
				match)) {
			Branch i = (Branch) result2_black[0];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whileul2branchubImpl.pattern_whileul2branchub_2_3_findcontext_blackBBBBB(i, w,
					w2i, b, a)) {
				Object[] result3_green = whileul2branchubImpl
						.pattern_whileul2branchub_2_3_findcontext_greenBBBBBFFFFFF(i, w, w2i, b, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = whileul2branchubImpl
						.pattern_whileul2branchub_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, i, w,
								w2i, b, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
							+ ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, Assignment b,
			While a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject i, EObject w, EObject w2i, EObject y,
			EObject b2y, EObject b, EObject x, EObject a, EObject a2x) {
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);

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
	public boolean isAppropriate_BWD(Match match, Branch i, Command y, Branch x) {

		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_10_1_initialbindings_blackBBBBB(this,
				match, i, y, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, i, y, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileul2branchubImpl.pattern_whileul2branchub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileul2branchubImpl
					.pattern_whileul2branchub_10_4_collectelementstobetranslated_blackBBBB(match, i, y, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			whileul2branchubImpl.pattern_whileul2branchub_10_4_collectelementstobetranslated_greenBBBBFFF(match, i, y,
					x);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[6];

			Object[] result5_black = whileul2branchubImpl
					.pattern_whileul2branchub_10_5_collectcontextelements_blackBBBB(match, i, y, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			whileul2branchubImpl.pattern_whileul2branchub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileul2branchubImpl.pattern_whileul2branchub_10_6_registerobjectstomatch_expressionBBBBB(this, match, i, y,
					x);
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
		Branch i = (Branch) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Command y = (Command) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileul2branchubImpl
				.pattern_whileul2branchub_11_1_performtransformation_greenBBFFBFF(w, y, x);
		S2N b2y = (S2N) result1_green[2];
		Assignment b = (Assignment) result1_green[3];
		While a = (While) result1_green[5];
		S2B a2x = (S2B) result1_green[6];

		Object[] result2_black = whileul2branchubImpl
				.pattern_whileul2branchub_11_2_collecttranslatedelements_blackBBBBBB(y, b2y, b, x, a, a2x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", "
							+ "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whileul2branchubImpl
				.pattern_whileul2branchub_11_2_collecttranslatedelements_greenFBBBBBB(y, b2y, b, x, a, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileul2branchubImpl.pattern_whileul2branchub_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, i, w, w2i, y, b2y, b, x, a, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
					+ "[a2x] = " + a2x + ".");
		}
		whileul2branchubImpl.pattern_whileul2branchub_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult, i,
				w, y, b2y, b, x, a, a2x);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[18];

		// 
		// 
		whileul2branchubImpl.pattern_whileul2branchub_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, i, w,
				w2i, y, b2y, b, x, a, a2x);
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
		Branch i = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		for (Object[] result2_black : whileul2branchubImpl.pattern_whileul2branchub_12_2_corematch_blackBFFBBB(i, y, x,
				match)) {
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whileul2branchubImpl.pattern_whileul2branchub_12_3_findcontext_blackBBBBB(i,
					w, w2i, y, x)) {
				Object[] result3_green = whileul2branchubImpl
						.pattern_whileul2branchub_12_3_findcontext_greenBBBBBFFFFFF(i, w, w2i, y, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = whileul2branchubImpl
						.pattern_whileul2branchub_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, i, w,
								w2i, y, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
							+ ", " + "[w2i] = " + w2i + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch i, Command y, Branch x) {
		match.registerObject("i", i);
		match.registerObject("y", y);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Command y, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, Command y,
			Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject i, EObject w, EObject w2i, EObject y,
			EObject b2y, EObject b, EObject x, EObject a, EObject a2x) {
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(EMoflonEdge _edge_next) {

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
			Branch i = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Object[] result2_green = whileul2branchubImpl
					.pattern_whileul2branchub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileul2branchubImpl
					.pattern_whileul2branchub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, i, y, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_32(EMoflonEdge _edge_first) {

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
		Branch i = (Branch) result2_bindingAndBlack[0];
		While w = (While) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		Assignment b = (Assignment) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		While a = (While) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whileul2branchubImpl
				.pattern_whileul2branchub_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, i, w, y, b, x, a, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[x] = "
					+ x + ", " + "[a] = " + a + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileul2branchubImpl.pattern_whileul2branchub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileul2branchubImpl
					.pattern_whileul2branchub_24_5_matchcorrcontext_blackBBFBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whileul2branchubImpl
						.pattern_whileul2branchub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileul2branchubImpl
						.pattern_whileul2branchub_24_6_createcorrespondence_blackBBBBBBB(i, w, y, b, x, a, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
							+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", "
							+ "[a] = " + a + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileul2branchubImpl.pattern_whileul2branchub_24_6_createcorrespondence_greenBFBBBFB(y, b, x, a,
						ccMatch);
				//nothing S2N b2y = (S2N) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[5];

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
	public CSP isApplicable_solveCsp_CC(Branch i, While w, Command y, Assignment b, Branch x, While a,
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
	public boolean checkDEC_BWD(Branch i, Command y, Branch x) {// 
		Object[] result1_black = whileul2branchubImpl.pattern_whileul2branchub_28_1_matchtggpattern_blackBBB(i, y, x);
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
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileul2branchubImpl
					.pattern_whileul2branchub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileul2branchubImpl.pattern_whileul2branchub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileul2branchubImpl.pattern_whileul2branchub_29_5_checknacs_blackBBB(i, w,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whileul2branchubImpl.pattern_whileul2branchub_29_6_perform_blackBBBB(i, w,
							w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileul2branchubImpl.pattern_whileul2branchub_29_6_perform_greenBBFFFFFFB(i, w, ruleResult);
					//nothing Command y = (Command) result6_green[2];
					//nothing S2N b2y = (S2N) result6_green[3];
					//nothing Assignment b = (Assignment) result6_green[4];
					//nothing Branch x = (Branch) result6_green[5];
					//nothing While a = (While) result6_green[6];
					//nothing S2B a2x = (S2B) result6_green[7];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i,
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
		isApplicableMatch.registerObject("w", w);
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
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_WHILE_S2B_ASSIGNMENT_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
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
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEUL2BRANCHUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_WHILE_S2B_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (Command) arguments.get(4),
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
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_WHILE_COMMAND_ASSIGNMENT_BRANCH_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEUL2BRANCHUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_DEC_FWD__WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEUL2BRANCHUB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEUL2BRANCHUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEUL2BRANCHUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_WHILE_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
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
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String a__b____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, w, b, a, w__a____first, a__b____first, a__b____last };
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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { i, w, w2i, b, a, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_1_1_performtransformation_blackBBBBBFBB(Branch i, While w,
			S2B w2i, Assignment b, While a, whileul2branchub _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, w, w2i, b, a, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whileul2branchub_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileul2branchub_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileul2branchub_1_1_performtransformation_binding[2];
			Assignment b = (Assignment) result_pattern_whileul2branchub_1_1_performtransformation_binding[3];
			While a = (While) result_pattern_whileul2branchub_1_1_performtransformation_binding[4];

			Object[] result_pattern_whileul2branchub_1_1_performtransformation_black = pattern_whileul2branchub_1_1_performtransformation_blackBBBBBFBB(
					i, w, w2i, b, a, _this, isApplicableMatch);
			if (result_pattern_whileul2branchub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileul2branchub_1_1_performtransformation_black[5];

				return new Object[] { i, w, w2i, b, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_1_1_performtransformation_greenBFFBFBF(Branch i, Assignment b,
			While a) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		y.setNext(x);
		i.setPositive(x);
		x.setPositive(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { i, y, b2y, b, x, a, a2x };
	}

	public static final Object[] pattern_whileul2branchub_1_2_collecttranslatedelements_blackBBBBBB(Command y, S2N b2y,
			Assignment b, Branch x, While a, S2B a2x) {
		return new Object[] { y, b2y, b, x, a, a2x };
	}

	public static final Object[] pattern_whileul2branchub_1_2_collecttranslatedelements_greenFBBBBBB(Command y, S2N b2y,
			Assignment b, Branch x, While a, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, y, b2y, b, x, a, a2x };
	}

	public static final Object[] pattern_whileul2branchub_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject i, EObject w, EObject w2i, EObject y, EObject b2y, EObject b,
			EObject x, EObject a, EObject a2x) {
		if (!i.equals(w)) {
			if (!i.equals(w2i)) {
				if (!i.equals(y)) {
					if (!i.equals(x)) {
						if (!w.equals(w2i)) {
							if (!w.equals(y)) {
								if (!w.equals(x)) {
									if (!w2i.equals(y)) {
										if (!w2i.equals(x)) {
											if (!b2y.equals(i)) {
												if (!b2y.equals(w)) {
													if (!b2y.equals(w2i)) {
														if (!b2y.equals(y)) {
															if (!b2y.equals(x)) {
																if (!b.equals(i)) {
																	if (!b.equals(w)) {
																		if (!b.equals(w2i)) {
																			if (!b.equals(y)) {
																				if (!b.equals(b2y)) {
																					if (!b.equals(x)) {
																						if (!x.equals(y)) {
																							if (!a.equals(i)) {
																								if (!a.equals(w)) {
																									if (!a.equals(
																											w2i)) {
																										if (!a.equals(
																												y)) {
																											if (!a.equals(
																													b2y)) {
																												if (!a.equals(
																														b)) {
																													if (!a.equals(
																															x)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a2x.equals(
																																	i)) {
																																if (!a2x.equals(
																																		w)) {
																																	if (!a2x.equals(
																																			w2i)) {
																																		if (!a2x.equals(
																																				y)) {
																																			if (!a2x.equals(
																																					b2y)) {
																																				if (!a2x.equals(
																																						b)) {
																																					if (!a2x.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								i,
																																								w,
																																								w2i,
																																								y,
																																								b2y,
																																								b,
																																								x,
																																								a,
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
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject i, EObject w, EObject y, EObject b2y, EObject b, EObject x, EObject a,
			EObject a2x) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileul2branchub";
		String w__a____first_name_prime = "first";
		String y__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String a__b____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { ruleresult, i, w, y, b2y, b, x, a, a2x, w__a____first, y__x____next, b2y__y____target,
				b2y__b____source, i__x____positive, a__b____first, a__b____last, a2x__x____target, a2x__a____source,
				x__y____positive };
	}

	public static final void pattern_whileul2branchub_1_5_registerobjects_expressionBBBBBBBBBBB(whileul2branchub _this,
			PerformRuleResult ruleresult, EObject i, EObject w, EObject w2i, EObject y, EObject b2y, EObject b,
			EObject x, EObject a, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, i, w, w2i, y, b2y, b, x, a, a2x);

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

	public static final Iterable<Object[]> pattern_whileul2branchub_2_2_corematch_blackFBFBBB(While w, Assignment b,
			While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { i, w, w2i, b, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_2_3_findcontext_blackBBBBB(Branch i, While w,
			S2B w2i, Assignment b, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (i.equals(w2i.getTarget())) {
					if (w.equals(w2i.getSource())) {
						if (b.equals(a.getFirst())) {
							if (b.equals(a.getLast())) {
								_result.add(new Object[] { i, w, w2i, b, a });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_2_3_findcontext_greenBBBBBFFFFFF(Branch i, While w, S2B w2i,
			Assignment b, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
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
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { i, w, w2i, b, a, isApplicableMatch, w__a____first, w2i__i____target, w2i__w____source,
				a__b____first, a__b____last };
	}

	public static final Object[] pattern_whileul2branchub_2_4_solveCSP_bindingFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, Assignment b, While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, i, w, w2i, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_2_4_solveCSP_bindingAndBlackFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, Assignment b, While a) {
		Object[] result_pattern_whileul2branchub_2_4_solveCSP_binding = pattern_whileul2branchub_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, i, w, w2i, b, a);
		if (result_pattern_whileul2branchub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_2_4_solveCSP_black = pattern_whileul2branchub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, b, a };
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
			Match match, Branch i, Command y, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { _this, match, i, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_2_SolveCSP_bindingFBBBBB(whileul2branchub _this,
			Match match, Branch i, Command y, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_10_2_SolveCSP_bindingAndBlackFBBBBB(whileul2branchub _this,
			Match match, Branch i, Command y, Branch x) {
		Object[] result_pattern_whileul2branchub_10_2_SolveCSP_binding = pattern_whileul2branchub_10_2_SolveCSP_bindingFBBBBB(
				_this, match, i, y, x);
		if (result_pattern_whileul2branchub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_10_2_SolveCSP_black = pattern_whileul2branchub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, y, x };
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
			Branch i, Command y, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { match, i, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			Branch i, Command y, Branch x) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String x__y____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { match, i, y, x, y__x____next, i__x____positive, x__y____positive };
	}

	public static final Object[] pattern_whileul2branchub_10_5_collectcontextelements_blackBBBB(Match match, Branch i,
			Command y, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { match, i, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileul2branchub_10_6_registerobjectstomatch_expressionBBBBB(
			whileul2branchub _this, Match match, Branch i, Command y, Branch x) {
		_this.registerObjectsToMatch_BWD(match, i, y, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { i, w, w2i, y, x, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_11_1_performtransformation_blackBBBBBFBB(Branch i, While w,
			S2B w2i, Command y, Branch x, whileul2branchub _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, w, w2i, y, x, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whileul2branchub_11_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileul2branchub_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileul2branchub_11_1_performtransformation_binding[2];
			Command y = (Command) result_pattern_whileul2branchub_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_whileul2branchub_11_1_performtransformation_binding[4];

			Object[] result_pattern_whileul2branchub_11_1_performtransformation_black = pattern_whileul2branchub_11_1_performtransformation_blackBBBBBFBB(
					i, w, w2i, y, x, _this, isApplicableMatch);
			if (result_pattern_whileul2branchub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileul2branchub_11_1_performtransformation_black[5];

				return new Object[] { i, w, w2i, y, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_11_1_performtransformation_greenBBFFBFF(While w, Command y,
			Branch x) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		w.setFirst(a);
		a.setFirst(b);
		a.setLast(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { w, y, b2y, b, x, a, a2x };
	}

	public static final Object[] pattern_whileul2branchub_11_2_collecttranslatedelements_blackBBBBBB(Command y, S2N b2y,
			Assignment b, Branch x, While a, S2B a2x) {
		return new Object[] { y, b2y, b, x, a, a2x };
	}

	public static final Object[] pattern_whileul2branchub_11_2_collecttranslatedelements_greenFBBBBBB(Command y,
			S2N b2y, Assignment b, Branch x, While a, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, y, b2y, b, x, a, a2x };
	}

	public static final Object[] pattern_whileul2branchub_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject i, EObject w, EObject w2i, EObject y, EObject b2y, EObject b,
			EObject x, EObject a, EObject a2x) {
		if (!i.equals(w)) {
			if (!i.equals(w2i)) {
				if (!i.equals(y)) {
					if (!i.equals(x)) {
						if (!w.equals(w2i)) {
							if (!w.equals(y)) {
								if (!w.equals(x)) {
									if (!w2i.equals(y)) {
										if (!w2i.equals(x)) {
											if (!b2y.equals(i)) {
												if (!b2y.equals(w)) {
													if (!b2y.equals(w2i)) {
														if (!b2y.equals(y)) {
															if (!b2y.equals(x)) {
																if (!b.equals(i)) {
																	if (!b.equals(w)) {
																		if (!b.equals(w2i)) {
																			if (!b.equals(y)) {
																				if (!b.equals(b2y)) {
																					if (!b.equals(x)) {
																						if (!x.equals(y)) {
																							if (!a.equals(i)) {
																								if (!a.equals(w)) {
																									if (!a.equals(
																											w2i)) {
																										if (!a.equals(
																												y)) {
																											if (!a.equals(
																													b2y)) {
																												if (!a.equals(
																														b)) {
																													if (!a.equals(
																															x)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a2x.equals(
																																	i)) {
																																if (!a2x.equals(
																																		w)) {
																																	if (!a2x.equals(
																																			w2i)) {
																																		if (!a2x.equals(
																																				y)) {
																																			if (!a2x.equals(
																																					b2y)) {
																																				if (!a2x.equals(
																																						b)) {
																																					if (!a2x.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								i,
																																								w,
																																								w2i,
																																								y,
																																								b2y,
																																								b,
																																								x,
																																								a,
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
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject i, EObject w, EObject y, EObject b2y, EObject b, EObject x, EObject a,
			EObject a2x) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileul2branchub";
		String w__a____first_name_prime = "first";
		String y__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String a__b____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { ruleresult, i, w, y, b2y, b, x, a, a2x, w__a____first, y__x____next, b2y__y____target,
				b2y__b____source, i__x____positive, a__b____first, a__b____last, a2x__x____target, a2x__a____source,
				x__y____positive };
	}

	public static final void pattern_whileul2branchub_11_5_registerobjects_expressionBBBBBBBBBBB(whileul2branchub _this,
			PerformRuleResult ruleresult, EObject i, EObject w, EObject w2i, EObject y, EObject b2y, EObject b,
			EObject x, EObject a, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, i, w, w2i, y, b2y, b, x, a, a2x);

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
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					return new Object[] { i, y, x, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_12_2_corematch_blackBFFBBB(Branch i, Command y,
			Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { i, w, w2i, y, x, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_12_3_findcontext_blackBBBBB(Branch i, While w,
			S2B w2i, Command y, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (x.equals(y.getNext())) {
				if (i.equals(w2i.getTarget())) {
					if (w.equals(w2i.getSource())) {
						if (x.equals(i.getPositive())) {
							if (y.equals(x.getPositive())) {
								_result.add(new Object[] { i, w, w2i, y, x });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_12_3_findcontext_greenBBBBBFFFFFF(Branch i, While w, S2B w2i,
			Command y, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String x__y____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		y__x____next.setName(y__x____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { i, w, w2i, y, x, isApplicableMatch, y__x____next, w2i__i____target, w2i__w____source,
				i__x____positive, x__y____positive };
	}

	public static final Object[] pattern_whileul2branchub_12_4_solveCSP_bindingFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, Command y, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, w, w2i, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_12_4_solveCSP_bindingAndBlackFBBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, Command y, Branch x) {
		Object[] result_pattern_whileul2branchub_12_4_solveCSP_binding = pattern_whileul2branchub_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, i, w, w2i, y, x);
		if (result_pattern_whileul2branchub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_12_4_solveCSP_black = pattern_whileul2branchub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, y, x };
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
		for (Graph __DEC_y_root_900443 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_1BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_516886 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_516886)) {
					if (!x.equals(__DEC_y_positive_516886)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_2BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_222505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_222505)) {
					if (!x.equals(__DEC_y_negative_222505)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_369616 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_422793 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_422793)) {
					if (!i.equals(__DEC_x_positive_422793)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_797370 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_797370)) {
					if (!i.equals(__DEC_x_negative_797370)) {
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

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_7BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_8BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_9BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
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
								if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_8BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_1BBB(y, i,
													x) == null) {
												if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_2BBB(y,
														i, x) == null) {
													if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_4BB(
															x, i) == null) {
														if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_5BB(
																x, i) == null) {
															if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_6BB(
																	i, y) == null) {
																if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_7BB(
																		i, y) == null) {
																	if (pattern_whileul2branchub_20_2_testcorematchandDECs_black_nac_9BB(
																			i, x) == null) {
																		_result.add(
																				new Object[] { i, y, x, _edge_next });
																	}
																}
															}
														}
													}
												}
											}
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
			whileul2branchub _this, Match match, Branch i, Command y, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, y, x);
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
		for (Decision __DEC_b_positive_812294 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_357398 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_760317 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_760317)) {
					if (!a.equals(__DEC_b_last_760317)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_70641 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_4B(While a) {
		for (Decision __DEC_a_positive_596071 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_negative_518934 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_6BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_268610 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_268610)) {
					if (!w.equals(__DEC_a_last_268610)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_815548 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
						Statement tmpB = a.getFirst();
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (b.equals(a.getLast())) {
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

	public static final Object[] pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("i");
		EObject _localVariable_1 = sourceMatch.getObject("w");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = sourceMatch.getObject("a");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								return new Object[] { i, w, y, b, x, a, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_2_matchsrctrgcontext_blackBBBBBBBB(Branch i, While w,
			Command y, Assignment b, Branch x, While a, Match sourceMatch, Match targetMatch) {
		if (!i.equals(x)) {
			if (!a.equals(w)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { i, w, y, b, x, a, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding = pattern_whileul2branchub_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding != null) {
			Branch i = (Branch) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[0];
			While w = (While) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[2];
			Assignment b = (Assignment) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[4];
			While a = (While) result_pattern_whileul2branchub_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whileul2branchub_24_2_matchsrctrgcontext_black = pattern_whileul2branchub_24_2_matchsrctrgcontext_blackBBBBBBBB(
					i, w, y, b, x, a, sourceMatch, targetMatch);
			if (result_pattern_whileul2branchub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { i, w, y, b, x, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_3_solvecsp_bindingFBBBBBBBBB(whileul2branchub _this,
			Branch i, While w, Command y, Assignment b, Branch x, While a, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(i, w, y, b, x, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, i, w, y, b, x, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whileul2branchub _this, Branch i, While w, Command y, Assignment b, Branch x, While a, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whileul2branchub_24_3_solvecsp_binding = pattern_whileul2branchub_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, i, w, y, b, x, a, sourceMatch, targetMatch);
		if (result_pattern_whileul2branchub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileul2branchub_24_3_solvecsp_black = pattern_whileul2branchub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileul2branchub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, i, w, y, b, x, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileul2branchub_24_5_matchcorrcontext_blackBBFBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { i, w, w2i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whileul2branchub_24_6_createcorrespondence_blackBBBBBBB(Branch i, While w,
			Command y, Assignment b, Branch x, While a, CCMatch ccMatch) {
		if (!i.equals(x)) {
			if (!a.equals(w)) {
				return new Object[] { i, w, y, b, x, a, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_24_6_createcorrespondence_greenBFBBBFB(Command y,
			Assignment b, Branch x, While a, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { y, b2y, b, x, a, a2x, ccMatch };
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
		for (Decision __DEC_b_positive_353465 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_594156 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_351491 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_351491)) {
					if (!a.equals(__DEC_b_last_351491)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_275716 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_4B(While a) {
		for (Decision __DEC_a_positive_309420 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_negative_635731 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_6BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_830829 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_830829)) {
					if (!w.equals(__DEC_a_last_830829)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_269131 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
				if (b.equals(a.getFirst())) {
					if (b.equals(a.getLast())) {
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
		for (Graph __DEC_y_root_226712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_1BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_419383 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_419383)) {
					if (!x.equals(__DEC_y_positive_419383)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_2BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_550333 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_550333)) {
					if (!x.equals(__DEC_y_negative_550333)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_271342 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_665686 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_665686)) {
					if (!i.equals(__DEC_x_positive_665686)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_622913 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_622913)) {
					if (!i.equals(__DEC_x_negative_622913)) {
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

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_7BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_8BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_black_nac_9BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_28_1_matchtggpattern_blackBBB(Branch i, Command y, Branch x) {
		if (!i.equals(x)) {
			if (x.equals(y.getNext())) {
				if (x.equals(i.getPositive())) {
					if (y.equals(x.getPositive())) {
						if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_0B(y) == null) {
							if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_1BBB(y, i, x) == null) {
								if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_2BBB(y, i, x) == null) {
									if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_3B(x) == null) {
										if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_4BB(x, i) == null) {
											if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_5BB(x,
													i) == null) {
												if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_6BB(i,
														y) == null) {
													if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_7BB(i,
															y) == null) {
														if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_8BB(
																x, y) == null) {
															if (pattern_whileul2branchub_28_1_matchtggpattern_black_nac_9BB(
																	i, x) == null) {
																return new Object[] { i, y, x };
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whileul2branchub_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whileul2branchub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whileul2branchub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileul2branchub_29_3_solveCSP_bindingFBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileul2branchub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileul2branchub_29_3_solveCSP_bindingAndBlackFBBBBBB(whileul2branchub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileul2branchub_29_3_solveCSP_binding = pattern_whileul2branchub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w, w2i, ruleResult);
		if (result_pattern_whileul2branchub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileul2branchub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileul2branchub_29_3_solveCSP_black = pattern_whileul2branchub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileul2branchub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileul2branchub_29_4_checkCSP_expressionFBB(whileul2branchub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileul2branchub_29_5_checknacs_blackBBB(Branch i, While w, S2B w2i) {
		return new Object[] { i, w, w2i };
	}

	public static final Object[] pattern_whileul2branchub_29_6_perform_blackBBBB(Branch i, While w, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w, w2i, ruleResult };
	}

	public static final Object[] pattern_whileul2branchub_29_6_perform_greenBBFFFFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(y);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		y.setNext(x);
		i.setPositive(x);
		x.setPositive(y);
		ruleResult.getTargetObjects().add(x);
		w.setFirst(a);
		a.setFirst(b);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { i, w, y, b2y, b, x, a, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileul2branchub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileul2branchubImpl
