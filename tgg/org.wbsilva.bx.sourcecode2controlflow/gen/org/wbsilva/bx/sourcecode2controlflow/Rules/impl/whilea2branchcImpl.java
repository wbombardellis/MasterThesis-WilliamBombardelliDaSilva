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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whilea2branchc;

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
 * An implementation of the model object '<em><b>whilea2branchc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whilea2branchcImpl extends AbstractRuleImpl implements whilea2branchc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whilea2branchcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhilea2branchc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, While w) {

		Object[] result1_black = whilea2branchcImpl.pattern_whilea2branchc_0_1_initialbindings_blackBBBB(this, match, a,
				w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, a, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilea2branchcImpl.pattern_whilea2branchc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilea2branchcImpl
					.pattern_whilea2branchc_0_4_collectelementstobetranslated_blackBBB(match, a, w);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whilea2branchcImpl.pattern_whilea2branchc_0_4_collectelementstobetranslated_greenBBBF(match, a, w);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[3];

			Object[] result5_black = whilea2branchcImpl
					.pattern_whilea2branchc_0_5_collectcontextelements_blackBBB(match, a, w);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whilea2branchcImpl.pattern_whilea2branchc_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilea2branchcImpl.pattern_whilea2branchc_0_6_registerobjectstomatch_expressionBBBB(this, match, a, w);
			return whilea2branchcImpl.pattern_whilea2branchc_0_7_expressionF();
		} else {
			return whilea2branchcImpl.pattern_whilea2branchc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch i = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Assignment a = (Assignment) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = whilea2branchcImpl.pattern_whilea2branchc_1_1_performtransformation_greenFBFB(i, a);
		S2N a2x = (S2N) result1_green[0];
		Command x = (Command) result1_green[2];

		Object[] result2_black = whilea2branchcImpl.pattern_whilea2branchc_1_2_collecttranslatedelements_blackBBB(a2x,
				x, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[x] = "
					+ x + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whilea2branchcImpl.pattern_whilea2branchc_1_2_collecttranslatedelements_greenFBBB(a2x,
				x, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilea2branchcImpl
				.pattern_whilea2branchc_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a2x, i, x, w2i, a, w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[w2i] = " + w2i
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}
		whilea2branchcImpl.pattern_whilea2branchc_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2x, i, x, a, w);
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		whilea2branchcImpl.pattern_whilea2branchc_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a2x, i, x,
				w2i, a, w);
		return whilea2branchcImpl.pattern_whilea2branchc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilea2branchcImpl
				.pattern_whilea2branchc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilea2branchcImpl.pattern_whilea2branchc_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		While w = (While) result2_binding[1];
		for (Object[] result2_black : whilea2branchcImpl.pattern_whilea2branchc_2_2_corematch_blackFFBBB(a, w, match)) {
			Branch i = (Branch) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			// ForEach 
			for (Object[] result3_black : whilea2branchcImpl.pattern_whilea2branchc_2_3_findcontext_blackBBBB(i, w2i, a,
					w)) {
				Object[] result3_green = whilea2branchcImpl.pattern_whilea2branchc_2_3_findcontext_greenBBBBFFFF(i, w2i,
						a, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = whilea2branchcImpl
						.pattern_whilea2branchc_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, a,
								w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = "
							+ w2i + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilea2branchcImpl.pattern_whilea2branchc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilea2branchcImpl
							.pattern_whilea2branchc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilea2branchcImpl.pattern_whilea2branchc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilea2branchcImpl.pattern_whilea2branchc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment a, While w) {
		match.registerObject("a", a);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, Assignment a,
			While w) {// Create CSP
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
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject w2i,
			EObject a, EObject w) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
				.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Command x) {

		Object[] result1_black = whilea2branchcImpl.pattern_whilea2branchc_10_1_initialbindings_blackBBBB(this, match,
				i, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, i, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilea2branchcImpl.pattern_whilea2branchc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilea2branchcImpl
					.pattern_whilea2branchc_10_4_collectelementstobetranslated_blackBBB(match, i, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whilea2branchcImpl.pattern_whilea2branchc_10_4_collectelementstobetranslated_greenBBBF(match, i, x);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[3];

			Object[] result5_black = whilea2branchcImpl
					.pattern_whilea2branchc_10_5_collectcontextelements_blackBBB(match, i, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whilea2branchcImpl.pattern_whilea2branchc_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilea2branchcImpl.pattern_whilea2branchc_10_6_registerobjectstomatch_expressionBBBB(this, match, i, x);
			return whilea2branchcImpl.pattern_whilea2branchc_10_7_expressionF();
		} else {
			return whilea2branchcImpl.pattern_whilea2branchc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch i = (Branch) result1_bindingAndBlack[0];
		Command x = (Command) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = whilea2branchcImpl.pattern_whilea2branchc_11_1_performtransformation_greenFBFB(x, w);
		S2N a2x = (S2N) result1_green[0];
		Assignment a = (Assignment) result1_green[2];

		Object[] result2_black = whilea2branchcImpl.pattern_whilea2branchc_11_2_collecttranslatedelements_blackBBB(a2x,
				x, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[x] = "
					+ x + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whilea2branchcImpl.pattern_whilea2branchc_11_2_collecttranslatedelements_greenFBBB(a2x,
				x, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilea2branchcImpl
				.pattern_whilea2branchc_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a2x, i, x, w2i, a, w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[w2i] = " + w2i
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}
		whilea2branchcImpl.pattern_whilea2branchc_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2x, i, x, a, w);
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		whilea2branchcImpl.pattern_whilea2branchc_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a2x, i, x,
				w2i, a, w);
		return whilea2branchcImpl.pattern_whilea2branchc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilea2branchcImpl
				.pattern_whilea2branchc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilea2branchcImpl.pattern_whilea2branchc_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch i = (Branch) result2_binding[0];
		Command x = (Command) result2_binding[1];
		for (Object[] result2_black : whilea2branchcImpl.pattern_whilea2branchc_12_2_corematch_blackBBFFB(i, x,
				match)) {
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whilea2branchcImpl.pattern_whilea2branchc_12_3_findcontext_blackBBBB(i, x,
					w2i, w)) {
				Object[] result3_green = whilea2branchcImpl.pattern_whilea2branchc_12_3_findcontext_greenBBBBFFFF(i, x,
						w2i, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = whilea2branchcImpl
						.pattern_whilea2branchc_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, x, w2i,
								w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[x] = " + x
							+ ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilea2branchcImpl.pattern_whilea2branchc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilea2branchcImpl
							.pattern_whilea2branchc_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilea2branchcImpl.pattern_whilea2branchc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilea2branchcImpl.pattern_whilea2branchc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch i, Command x) {
		match.registerObject("i", i);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Command x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, Command x, S2B w2i, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject w2i,
			EObject a, EObject w) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_292(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilea2branchcImpl.pattern_whilea2branchc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilea2branchcImpl
				.pattern_whilea2branchc_20_2_testcorematchandDECs_blackFFB(_edge_positive)) {
			Branch i = (Branch) result2_black[0];
			Command x = (Command) result2_black[1];
			Object[] result2_green = whilea2branchcImpl
					.pattern_whilea2branchc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilea2branchcImpl
					.pattern_whilea2branchc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							i, x)) {
				// 
				if (whilea2branchcImpl
						.pattern_whilea2branchc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilea2branchcImpl
							.pattern_whilea2branchc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilea2branchcImpl.pattern_whilea2branchc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilea2branchcImpl.pattern_whilea2branchc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_300(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilea2branchcImpl.pattern_whilea2branchc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilea2branchcImpl
				.pattern_whilea2branchc_21_2_testcorematchandDECs_blackFFB(_edge_first)) {
			Assignment a = (Assignment) result2_black[0];
			While w = (While) result2_black[1];
			Object[] result2_green = whilea2branchcImpl
					.pattern_whilea2branchc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilea2branchcImpl
					.pattern_whilea2branchc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							a, w)) {
				// 
				if (whilea2branchcImpl
						.pattern_whilea2branchc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilea2branchcImpl
							.pattern_whilea2branchc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilea2branchcImpl.pattern_whilea2branchc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilea2branchcImpl.pattern_whilea2branchc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whilea2branchc");
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
		ruleResult.setRule("whilea2branchc");
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

		Object[] result1_black = whilea2branchcImpl.pattern_whilea2branchc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilea2branchcImpl.pattern_whilea2branchc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch i = (Branch) result2_bindingAndBlack[0];
		Command x = (Command) result2_bindingAndBlack[1];
		Assignment a = (Assignment) result2_bindingAndBlack[2];
		While w = (While) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = whilea2branchcImpl
				.pattern_whilea2branchc_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, i, x, a, w, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[w] = " + w + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilea2branchcImpl.pattern_whilea2branchc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilea2branchcImpl.pattern_whilea2branchc_24_5_matchcorrcontext_blackBFBBB(i,
					w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whilea2branchcImpl.pattern_whilea2branchc_24_5_matchcorrcontext_greenBBBF(w2i,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilea2branchcImpl
						.pattern_whilea2branchc_24_6_createcorrespondence_blackBBBBB(i, x, a, w, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[i] = " + i + ", " + "[x] = " + x + ", "
									+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilea2branchcImpl.pattern_whilea2branchc_24_6_createcorrespondence_greenFBBB(x, a, ccMatch);
				//nothing S2N a2x = (S2N) result6_green[0];

				Object[] result7_black = whilea2branchcImpl
						.pattern_whilea2branchc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilea2branchcImpl.pattern_whilea2branchc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whilea2branchcImpl.pattern_whilea2branchc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch i, Command x, Assignment a, While w, Match sourceMatch,
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
	public boolean checkDEC_FWD(Assignment a, While w) {// 
		Object[] result1_black = whilea2branchcImpl.pattern_whilea2branchc_27_1_matchtggpattern_blackBB(a, w);
		if (result1_black != null) {
			return whilea2branchcImpl.pattern_whilea2branchc_27_2_expressionF();
		} else {
			return whilea2branchcImpl.pattern_whilea2branchc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch i, Command x) {// 
		Object[] result1_black = whilea2branchcImpl.pattern_whilea2branchc_28_1_matchtggpattern_blackBB(i, x);
		if (result1_black != null) {
			return whilea2branchcImpl.pattern_whilea2branchc_28_2_expressionF();
		} else {
			return whilea2branchcImpl.pattern_whilea2branchc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whilea2branchcImpl.pattern_whilea2branchc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilea2branchcImpl.pattern_whilea2branchc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whilea2branchcImpl
				.pattern_whilea2branchc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whilea2branchcImpl
					.pattern_whilea2branchc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilea2branchcImpl.pattern_whilea2branchc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilea2branchcImpl.pattern_whilea2branchc_29_5_checknacs_blackBBB(i, w2i, w);
				if (result5_black != null) {

					Object[] result6_black = whilea2branchcImpl.pattern_whilea2branchc_29_6_perform_blackBBBB(i, w2i, w,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilea2branchcImpl.pattern_whilea2branchc_29_6_perform_greenFBFFBB(i, w, ruleResult);
					//nothing S2N a2x = (S2N) result6_green[0];
					//nothing Command x = (Command) result6_green[2];
					//nothing Assignment a = (Assignment) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return whilea2branchcImpl.pattern_whilea2branchc_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEA2BRANCHC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2));
			return null;
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2));
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_S2B_ASSIGNMENT_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.WHILEA2BRANCHC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.WHILEA2BRANCHC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
			return null;
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2));
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_S2B_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.WHILEA2BRANCHC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_292__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_292((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_300__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_300((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_COMMAND_ASSIGNMENT_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Command) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.WHILEA2BRANCHC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEA2BRANCHC___CHECK_DEC_FWD__ASSIGNMENT_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1));
		case RulesPackage.WHILEA2BRANCHC___CHECK_DEC_BWD__BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1));
		case RulesPackage.WHILEA2BRANCHC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEA2BRANCHC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEA2BRANCHC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilea2branchc_0_1_initialbindings_blackBBBB(whilea2branchc _this, Match match,
			Assignment a, While w) {
		return new Object[] { _this, match, a, w };
	}

	public static final Object[] pattern_whilea2branchc_0_2_SolveCSP_bindingFBBBB(whilea2branchc _this, Match match,
			Assignment a, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilea2branchc_0_2_SolveCSP_bindingAndBlackFBBBB(whilea2branchc _this,
			Match match, Assignment a, While w) {
		Object[] result_pattern_whilea2branchc_0_2_SolveCSP_binding = pattern_whilea2branchc_0_2_SolveCSP_bindingFBBBB(
				_this, match, a, w);
		if (result_pattern_whilea2branchc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilea2branchc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilea2branchc_0_2_SolveCSP_black = pattern_whilea2branchc_0_2_SolveCSP_blackB(csp);
			if (result_pattern_whilea2branchc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_0_3_CheckCSP_expressionFBB(whilea2branchc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_0_4_collectelementstobetranslated_blackBBB(Match match,
			Assignment a, While w) {
		return new Object[] { match, a, w };
	}

	public static final Object[] pattern_whilea2branchc_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Assignment a, While w) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, a, w, w__a____first };
	}

	public static final Object[] pattern_whilea2branchc_0_5_collectcontextelements_blackBBB(Match match, Assignment a,
			While w) {
		return new Object[] { match, a, w };
	}

	public static final Object[] pattern_whilea2branchc_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilea2branchc_0_6_registerobjectstomatch_expressionBBBB(whilea2branchc _this,
			Match match, Assignment a, While w) {
		_this.registerObjectsToMatch_FWD(match, a, w);

	}

	public static final boolean pattern_whilea2branchc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilea2branchc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject tmpI = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						return new Object[] { i, w2i, a, w, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_1_1_performtransformation_blackBBBBFBB(Branch i, S2B w2i,
			Assignment a, While w, whilea2branchc _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { i, w2i, a, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_1_1_performtransformation_bindingAndBlackFFFFFBB(
			whilea2branchc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilea2branchc_1_1_performtransformation_binding = pattern_whilea2branchc_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_whilea2branchc_1_1_performtransformation_binding != null) {
			Branch i = (Branch) result_pattern_whilea2branchc_1_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whilea2branchc_1_1_performtransformation_binding[1];
			Assignment a = (Assignment) result_pattern_whilea2branchc_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whilea2branchc_1_1_performtransformation_binding[3];

			Object[] result_pattern_whilea2branchc_1_1_performtransformation_black = pattern_whilea2branchc_1_1_performtransformation_blackBBBBFBB(
					i, w2i, a, w, _this, isApplicableMatch);
			if (result_pattern_whilea2branchc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilea2branchc_1_1_performtransformation_black[4];

				return new Object[] { i, w2i, a, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_1_1_performtransformation_greenFBFB(Branch i, Assignment a) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		a2x.setSource(a);
		i.setPositive(x);
		a2x.setTarget(x);
		return new Object[] { a2x, i, x, a };
	}

	public static final Object[] pattern_whilea2branchc_1_2_collecttranslatedelements_blackBBB(S2N a2x, Command x,
			Assignment a) {
		return new Object[] { a2x, x, a };
	}

	public static final Object[] pattern_whilea2branchc_1_2_collecttranslatedelements_greenFBBB(S2N a2x, Command x,
			Assignment a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, a2x, x, a };
	}

	public static final Object[] pattern_whilea2branchc_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject w2i, EObject a, EObject w) {
		if (!a2x.equals(i)) {
			if (!a2x.equals(x)) {
				if (!a2x.equals(w2i)) {
					if (!a2x.equals(w)) {
						if (!i.equals(x)) {
							if (!i.equals(w2i)) {
								if (!i.equals(w)) {
									if (!w2i.equals(x)) {
										if (!a.equals(a2x)) {
											if (!a.equals(i)) {
												if (!a.equals(x)) {
													if (!a.equals(w2i)) {
														if (!a.equals(w)) {
															if (!w.equals(x)) {
																if (!w.equals(w2i)) {
																	return new Object[] { ruleresult, a2x, i, x, w2i, a,
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
		return null;
	}

	public static final Object[] pattern_whilea2branchc_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject a, EObject w) {
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilea2branchc";
		String a2x__a____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, a2x, i, x, a, w, a2x__a____source, i__x____positive, w__a____first,
				a2x__x____target };
	}

	public static final void pattern_whilea2branchc_1_5_registerobjects_expressionBBBBBBBB(whilea2branchc _this,
			PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject w2i, EObject a, EObject w) {
		_this.registerObjects_FWD(ruleresult, a2x, i, x, w2i, a, w);

	}

	public static final PerformRuleResult pattern_whilea2branchc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_2_1_preparereturnvalue_bindingFB(whilea2branchc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whilea2branchc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_2_1_preparereturnvalue_bindingAndBlackFFB(
			whilea2branchc _this) {
		Object[] result_pattern_whilea2branchc_2_1_preparereturnvalue_binding = pattern_whilea2branchc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilea2branchc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilea2branchc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilea2branchc_2_1_preparereturnvalue_black = pattern_whilea2branchc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilea2branchc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilea2branchc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilea2branchc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilea2branchc_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("w");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				return new Object[] { a, w, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_2_2_corematch_blackFFBBB(Assignment a, While w,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
			Branch i = w2i.getTarget();
			if (i != null) {
				_result.add(new Object[] { i, w2i, a, w, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_2_3_findcontext_blackBBBB(Branch i, S2B w2i,
			Assignment a, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (i.equals(w2i.getTarget())) {
			if (a.equals(w.getFirst())) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { i, w2i, a, w });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_2_3_findcontext_greenBBBBFFFF(Branch i, S2B w2i, Assignment a,
			While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { i, w2i, a, w, isApplicableMatch, w2i__i____target, w__a____first, w2i__w____source };
	}

	public static final Object[] pattern_whilea2branchc_2_4_solveCSP_bindingFBBBBBB(whilea2branchc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, Assignment a, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, i, w2i, a, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilea2branchc_2_4_solveCSP_bindingAndBlackFBBBBBB(whilea2branchc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, Assignment a, While w) {
		Object[] result_pattern_whilea2branchc_2_4_solveCSP_binding = pattern_whilea2branchc_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, a, w);
		if (result_pattern_whilea2branchc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilea2branchc_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilea2branchc_2_4_solveCSP_black = pattern_whilea2branchc_2_4_solveCSP_blackB(csp);
			if (result_pattern_whilea2branchc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, a, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_2_5_checkCSP_expressionFBB(whilea2branchc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilea2branchc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilea2branchc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilea2branchc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_10_1_initialbindings_blackBBBB(whilea2branchc _this,
			Match match, Branch i, Command x) {
		return new Object[] { _this, match, i, x };
	}

	public static final Object[] pattern_whilea2branchc_10_2_SolveCSP_bindingFBBBB(whilea2branchc _this, Match match,
			Branch i, Command x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilea2branchc_10_2_SolveCSP_bindingAndBlackFBBBB(whilea2branchc _this,
			Match match, Branch i, Command x) {
		Object[] result_pattern_whilea2branchc_10_2_SolveCSP_binding = pattern_whilea2branchc_10_2_SolveCSP_bindingFBBBB(
				_this, match, i, x);
		if (result_pattern_whilea2branchc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilea2branchc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilea2branchc_10_2_SolveCSP_black = pattern_whilea2branchc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilea2branchc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_10_3_CheckCSP_expressionFBB(whilea2branchc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_10_4_collectelementstobetranslated_blackBBB(Match match,
			Branch i, Command x) {
		return new Object[] { match, i, x };
	}

	public static final Object[] pattern_whilea2branchc_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Branch i, Command x) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		String i__x____positive_name_prime = "positive";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, i, x, i__x____positive };
	}

	public static final Object[] pattern_whilea2branchc_10_5_collectcontextelements_blackBBB(Match match, Branch i,
			Command x) {
		return new Object[] { match, i, x };
	}

	public static final Object[] pattern_whilea2branchc_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilea2branchc_10_6_registerobjectstomatch_expressionBBBB(whilea2branchc _this,
			Match match, Branch i, Command x) {
		_this.registerObjectsToMatch_BWD(match, i, x);

	}

	public static final boolean pattern_whilea2branchc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilea2branchc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpW = _localVariable_3;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						return new Object[] { i, x, w2i, w, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_11_1_performtransformation_blackBBBBFBB(Branch i, Command x,
			S2B w2i, While w, whilea2branchc _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { i, x, w2i, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_11_1_performtransformation_bindingAndBlackFFFFFBB(
			whilea2branchc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilea2branchc_11_1_performtransformation_binding = pattern_whilea2branchc_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_whilea2branchc_11_1_performtransformation_binding != null) {
			Branch i = (Branch) result_pattern_whilea2branchc_11_1_performtransformation_binding[0];
			Command x = (Command) result_pattern_whilea2branchc_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilea2branchc_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whilea2branchc_11_1_performtransformation_binding[3];

			Object[] result_pattern_whilea2branchc_11_1_performtransformation_black = pattern_whilea2branchc_11_1_performtransformation_blackBBBBFBB(
					i, x, w2i, w, _this, isApplicableMatch);
			if (result_pattern_whilea2branchc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilea2branchc_11_1_performtransformation_black[4];

				return new Object[] { i, x, w2i, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_11_1_performtransformation_greenFBFB(Command x, While w) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		a2x.setTarget(x);
		a2x.setSource(a);
		w.setFirst(a);
		return new Object[] { a2x, x, a, w };
	}

	public static final Object[] pattern_whilea2branchc_11_2_collecttranslatedelements_blackBBB(S2N a2x, Command x,
			Assignment a) {
		return new Object[] { a2x, x, a };
	}

	public static final Object[] pattern_whilea2branchc_11_2_collecttranslatedelements_greenFBBB(S2N a2x, Command x,
			Assignment a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, a2x, x, a };
	}

	public static final Object[] pattern_whilea2branchc_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject w2i, EObject a, EObject w) {
		if (!a2x.equals(i)) {
			if (!a2x.equals(x)) {
				if (!a2x.equals(w2i)) {
					if (!a2x.equals(w)) {
						if (!i.equals(x)) {
							if (!i.equals(w2i)) {
								if (!i.equals(w)) {
									if (!w2i.equals(x)) {
										if (!a.equals(a2x)) {
											if (!a.equals(i)) {
												if (!a.equals(x)) {
													if (!a.equals(w2i)) {
														if (!a.equals(w)) {
															if (!w.equals(x)) {
																if (!w.equals(w2i)) {
																	return new Object[] { ruleresult, a2x, i, x, w2i, a,
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
		return null;
	}

	public static final Object[] pattern_whilea2branchc_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject a, EObject w) {
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilea2branchc";
		String a2x__a____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, a2x, i, x, a, w, a2x__a____source, i__x____positive, w__a____first,
				a2x__x____target };
	}

	public static final void pattern_whilea2branchc_11_5_registerobjects_expressionBBBBBBBB(whilea2branchc _this,
			PerformRuleResult ruleresult, EObject a2x, EObject i, EObject x, EObject w2i, EObject a, EObject w) {
		_this.registerObjects_BWD(ruleresult, a2x, i, x, w2i, a, w);

	}

	public static final PerformRuleResult pattern_whilea2branchc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_12_1_preparereturnvalue_bindingFB(whilea2branchc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whilea2branchc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_12_1_preparereturnvalue_bindingAndBlackFFB(
			whilea2branchc _this) {
		Object[] result_pattern_whilea2branchc_12_1_preparereturnvalue_binding = pattern_whilea2branchc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilea2branchc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilea2branchc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilea2branchc_12_1_preparereturnvalue_black = pattern_whilea2branchc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilea2branchc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilea2branchc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilea2branchc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilea2branchc_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				return new Object[] { i, x, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_12_2_corematch_blackBBFFB(Branch i, Command x,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
			Statement tmpW = w2i.getSource();
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				_result.add(new Object[] { i, x, w2i, w, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_12_3_findcontext_blackBBBB(Branch i, Command x,
			S2B w2i, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (i.equals(w2i.getTarget())) {
			if (x.equals(i.getPositive())) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { i, x, w2i, w });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_12_3_findcontext_greenBBBBFFFF(Branch i, Command x, S2B w2i,
			While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { i, x, w2i, w, isApplicableMatch, w2i__i____target, i__x____positive, w2i__w____source };
	}

	public static final Object[] pattern_whilea2branchc_12_4_solveCSP_bindingFBBBBBB(whilea2branchc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Command x, S2B w2i, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, x, w2i, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, x, w2i, w };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilea2branchc_12_4_solveCSP_bindingAndBlackFBBBBBB(whilea2branchc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Command x, S2B w2i, While w) {
		Object[] result_pattern_whilea2branchc_12_4_solveCSP_binding = pattern_whilea2branchc_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, x, w2i, w);
		if (result_pattern_whilea2branchc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilea2branchc_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilea2branchc_12_4_solveCSP_black = pattern_whilea2branchc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilea2branchc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, x, w2i, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_12_5_checkCSP_expressionFBB(whilea2branchc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilea2branchc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilea2branchc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilea2branchc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_20_1_preparereturnvalue_bindingFB(whilea2branchc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilea2branchc _this) {
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

	public static final Object[] pattern_whilea2branchc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whilea2branchc _this) {
		Object[] result_pattern_whilea2branchc_20_1_preparereturnvalue_binding = pattern_whilea2branchc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilea2branchc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilea2branchc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilea2branchc_20_1_preparereturnvalue_black = pattern_whilea2branchc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilea2branchc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilea2branchc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilea2branchc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_909253 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_1BB(Command x, Branch i) {
		for (Branch __DEC_x_positive_992631 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "positive")) {
			if (!i.equals(__DEC_x_positive_992631)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_2BB(Command x, Branch i) {
		for (Branch __DEC_x_negative_867882 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "negative")) {
			if (!i.equals(__DEC_x_negative_867882)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_3BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_positive.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (x.equals(i.getPositive())) {
					if (pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
						if (pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_1BB(x, i) == null) {
							if (pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_2BB(x, i) == null) {
								if (pattern_whilea2branchc_20_2_testcorematchandDECs_black_nac_3BB(i, x) == null) {
									_result.add(new Object[] { i, x, _edge_positive });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_whilea2branchc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilea2branchc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			whilea2branchc _this, Match match, Branch i, Command x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilea2branchc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilea2branchc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilea2branchc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_21_1_preparereturnvalue_bindingFB(whilea2branchc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilea2branchc _this) {
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

	public static final Object[] pattern_whilea2branchc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whilea2branchc _this) {
		Object[] result_pattern_whilea2branchc_21_1_preparereturnvalue_binding = pattern_whilea2branchc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilea2branchc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilea2branchc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilea2branchc_21_1_preparereturnvalue_black = pattern_whilea2branchc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilea2branchc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilea2branchc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilea2branchc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_0B(Assignment a) {
		for (Decision __DEC_a_positive_720861 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_908273 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_2BB(Assignment a, While w) {
		for (While __DEC_a_last_630543 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_630543)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_990776 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_4BB(While w, Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (a.equals(w.getFirst())) {
					if (pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
						if (pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
							if (pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_2BB(a, w) == null) {
								if (pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
									if (pattern_whilea2branchc_21_2_testcorematchandDECs_black_nac_4BB(w, a) == null) {
										_result.add(new Object[] { a, w, _edge_first });
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

	public static final Object[] pattern_whilea2branchc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilea2branchc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			whilea2branchc _this, Match match, Assignment a, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, w);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilea2branchc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilea2branchc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilea2branchc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_24_1_prepare_blackB(whilea2branchc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilea2branchc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whilea2branchc_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("i");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("w");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						return new Object[] { i, x, a, w, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_24_2_matchsrctrgcontext_blackBBBBBB(Branch i, Command x,
			Assignment a, While w, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { i, x, a, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whilea2branchc_24_2_matchsrctrgcontext_binding = pattern_whilea2branchc_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whilea2branchc_24_2_matchsrctrgcontext_binding != null) {
			Branch i = (Branch) result_pattern_whilea2branchc_24_2_matchsrctrgcontext_binding[0];
			Command x = (Command) result_pattern_whilea2branchc_24_2_matchsrctrgcontext_binding[1];
			Assignment a = (Assignment) result_pattern_whilea2branchc_24_2_matchsrctrgcontext_binding[2];
			While w = (While) result_pattern_whilea2branchc_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_whilea2branchc_24_2_matchsrctrgcontext_black = pattern_whilea2branchc_24_2_matchsrctrgcontext_blackBBBBBB(
					i, x, a, w, sourceMatch, targetMatch);
			if (result_pattern_whilea2branchc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { i, x, a, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_24_3_solvecsp_bindingFBBBBBBB(whilea2branchc _this, Branch i,
			Command x, Assignment a, While w, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(i, x, a, w, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, i, x, a, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilea2branchc_24_3_solvecsp_bindingAndBlackFBBBBBBB(whilea2branchc _this,
			Branch i, Command x, Assignment a, While w, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilea2branchc_24_3_solvecsp_binding = pattern_whilea2branchc_24_3_solvecsp_bindingFBBBBBBB(
				_this, i, x, a, w, sourceMatch, targetMatch);
		if (result_pattern_whilea2branchc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilea2branchc_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilea2branchc_24_3_solvecsp_black = pattern_whilea2branchc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilea2branchc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, i, x, a, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_24_5_matchcorrcontext_blackBFBBB(Branch i, While w,
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

	public static final Object[] pattern_whilea2branchc_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whilea2branchc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whilea2branchc_24_6_createcorrespondence_blackBBBBB(Branch i, Command x,
			Assignment a, While w, CCMatch ccMatch) {
		return new Object[] { i, x, a, w, ccMatch };
	}

	public static final Object[] pattern_whilea2branchc_24_6_createcorrespondence_greenFBBB(Command x, Assignment a,
			CCMatch ccMatch) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { a2x, x, a, ccMatch };
	}

	public static final Object[] pattern_whilea2branchc_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whilea2branchc_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whilea2branchc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whilea2branchc_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_27_1_matchtggpattern_black_nac_0B(Assignment a) {
		for (Decision __DEC_a_positive_517730 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_27_1_matchtggpattern_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_980101 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_27_1_matchtggpattern_black_nac_2BB(Assignment a, While w) {
		for (While __DEC_a_last_411109 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_411109)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_189306 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_27_1_matchtggpattern_black_nac_4BB(While w, Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_27_1_matchtggpattern_blackBB(Assignment a, While w) {
		if (a.equals(w.getFirst())) {
			if (pattern_whilea2branchc_27_1_matchtggpattern_black_nac_0B(a) == null) {
				if (pattern_whilea2branchc_27_1_matchtggpattern_black_nac_1B(a) == null) {
					if (pattern_whilea2branchc_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
						if (pattern_whilea2branchc_27_1_matchtggpattern_black_nac_3B(a) == null) {
							if (pattern_whilea2branchc_27_1_matchtggpattern_black_nac_4BB(w, a) == null) {
								return new Object[] { a, w };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilea2branchc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_28_1_matchtggpattern_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_550890 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_28_1_matchtggpattern_black_nac_1BB(Command x, Branch i) {
		for (Branch __DEC_x_positive_533779 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "positive")) {
			if (!i.equals(__DEC_x_positive_533779)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_28_1_matchtggpattern_black_nac_2BB(Command x, Branch i) {
		for (Branch __DEC_x_negative_645973 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "negative")) {
			if (!i.equals(__DEC_x_negative_645973)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_28_1_matchtggpattern_black_nac_3BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_28_1_matchtggpattern_blackBB(Branch i, Command x) {
		if (x.equals(i.getPositive())) {
			if (pattern_whilea2branchc_28_1_matchtggpattern_black_nac_0B(x) == null) {
				if (pattern_whilea2branchc_28_1_matchtggpattern_black_nac_1BB(x, i) == null) {
					if (pattern_whilea2branchc_28_1_matchtggpattern_black_nac_2BB(x, i) == null) {
						if (pattern_whilea2branchc_28_1_matchtggpattern_black_nac_3BB(i, x) == null) {
							return new Object[] { i, x };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilea2branchc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_29_1_createresult_blackB(whilea2branchc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilea2branchc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whilea2branchc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilea2branchc_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whilea2branchc_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whilea2branchc_29_2_isapplicablecore_black_nac_0BB(ruleResult, i) == null) {
									if (pattern_whilea2branchc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whilea2branchc_29_3_solveCSP_bindingFBBBBBB(whilea2branchc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilea2branchc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilea2branchc_29_3_solveCSP_bindingAndBlackFBBBBBB(whilea2branchc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilea2branchc_29_3_solveCSP_binding = pattern_whilea2branchc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whilea2branchc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilea2branchc_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilea2branchc_29_3_solveCSP_black = pattern_whilea2branchc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilea2branchc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilea2branchc_29_4_checkCSP_expressionFBB(whilea2branchc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilea2branchc_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whilea2branchc_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whilea2branchc_29_6_perform_greenFBFFBB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setSource(a);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2x, i, x, a, w, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilea2branchc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilea2branchcImpl
