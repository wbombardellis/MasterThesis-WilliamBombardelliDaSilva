/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whiledd2branchbb;

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
 * An implementation of the model object '<em><b>whiledd2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whiledd2branchbbImpl extends AbstractRuleImpl implements whiledd2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whiledd2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhiledd2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision c, Decision a, While w) {

		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_0_1_initialbindings_blackBBBBB(this,
				match, c, a, w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, a, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledd2branchbbImpl.pattern_whiledd2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_0_4_collectelementstobetranslated_blackBBBB(match, c, a, w);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_0_4_collectelementstobetranslated_greenBBBBFF(match, c, a, w);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_0_5_collectcontextelements_blackBBBB(match, c, a, w);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiledd2branchbbImpl.pattern_whiledd2branchbb_0_6_registerobjectstomatch_expressionBBBBB(this, match, c, a,
					w);
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_0_7_expressionF();
		} else {
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision c = (Decision) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Decision a = (Decision) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whiledd2branchbbImpl.pattern_whiledd2branchbb_1_1_performtransformation_greenBBBFFFF(c,
				i, a);
		Branch z = (Branch) result1_green[3];
		S2B a2x = (S2B) result1_green[4];
		Branch x = (Branch) result1_green[5];
		S2B c2z = (S2B) result1_green[6];

		Object[] result2_black = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_1_2_collecttranslatedelements_blackBBBBBB(c, a, z, a2x, x, c2z);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[z] = "
							+ z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_1_2_collecttranslatedelements_greenFBBBBBB(c, a, z, a2x, x, c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, c, i, w2i, a, z, w, a2x, x, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", "
					+ "[z] = " + z + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
					+ "[c2z] = " + c2z + ".");
		}
		whiledd2branchbbImpl.pattern_whiledd2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, i,
				a, z, w, a2x, x, c2z);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		whiledd2branchbbImpl.pattern_whiledd2branchbb_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c, i,
				w2i, a, z, w, a2x, x, c2z);
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiledd2branchbbImpl.pattern_whiledd2branchbb_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision c = (Decision) result2_binding[0];
		Decision a = (Decision) result2_binding[1];
		While w = (While) result2_binding[2];
		for (Object[] result2_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_2_2_corematch_blackBFFBBB(c, a, w,
				match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_2_3_findcontext_blackBBBBB(c, i,
					w2i, a, w)) {
				Object[] result3_green = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_2_3_findcontext_greenBBBBBFFFFF(c, i, w2i, a, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, c, i,
								w2i, a, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiledd2branchbbImpl.pattern_whiledd2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiledd2branchbbImpl
							.pattern_whiledd2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiledd2branchbbImpl.pattern_whiledd2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision c, Decision a, While w) {
		match.registerObject("c", c);
		match.registerObject("a", a);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision c, Decision a, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision c, Branch i, S2B w2i, Decision a,
			While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject i, EObject w2i, EObject a,
			EObject z, EObject w, EObject a2x, EObject x, EObject c2z) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c2z", c2z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Branch z, Branch x) {

		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_10_1_initialbindings_blackBBBBB(this,
				match, i, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, i, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledd2branchbbImpl.pattern_whiledd2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_10_4_collectelementstobetranslated_blackBBBB(match, i, z, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_10_4_collectelementstobetranslated_greenBBBBFF(match, i, z,
					x);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_10_5_collectcontextelements_blackBBBB(match, i, z, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiledd2branchbbImpl.pattern_whiledd2branchbb_10_6_registerobjectstomatch_expressionBBBBB(this, match, i, z,
					x);
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_10_7_expressionF();
		} else {
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch i = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_1_performtransformation_greenFFBBFBF(z, w, x);
		Decision c = (Decision) result1_green[0];
		Decision a = (Decision) result1_green[1];
		S2B a2x = (S2B) result1_green[4];
		S2B c2z = (S2B) result1_green[6];

		Object[] result2_black = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_2_collecttranslatedelements_blackBBBBBB(c, a, z, a2x, x, c2z);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[z] = "
							+ z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_2_collecttranslatedelements_greenFBBBBBB(c, a, z, a2x, x, c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, c, i, w2i, a, z, w, a2x, x, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", "
					+ "[z] = " + z + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
					+ "[c2z] = " + c2z + ".");
		}
		whiledd2branchbbImpl.pattern_whiledd2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, i,
				a, z, w, a2x, x, c2z);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		whiledd2branchbbImpl.pattern_whiledd2branchbb_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c, i,
				w2i, a, z, w, a2x, x, c2z);
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiledd2branchbbImpl.pattern_whiledd2branchbb_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch i = (Branch) result2_binding[0];
		Branch z = (Branch) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		for (Object[] result2_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_12_2_corematch_blackBFBFBB(i, z, x,
				match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_12_3_findcontext_blackBBBBB(i,
					w2i, z, w, x)) {
				Object[] result3_green = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_12_3_findcontext_greenBBBBBFFFFF(i, w2i, z, w, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, i, w2i,
								z, w, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = "
							+ w2i + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[x] = " + x + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiledd2branchbbImpl.pattern_whiledd2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiledd2branchbbImpl
							.pattern_whiledd2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiledd2branchbbImpl.pattern_whiledd2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch z, Branch x) {
		match.registerObject("i", i);
		match.registerObject("z", z);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch z, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, Branch z, While w,
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
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject i, EObject w2i, EObject a,
			EObject z, EObject w, EObject a2x, EObject x, EObject c2z) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c2z", c2z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_19(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiledd2branchbbImpl.pattern_whiledd2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiledd2branchbbImpl
				.pattern_whiledd2branchbb_20_2_testcorematchandDECs_blackFFFB(_edge_negative)) {
			Branch i = (Branch) result2_black[0];
			Branch z = (Branch) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Object[] result2_green = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledd2branchbbImpl
					.pattern_whiledd2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, i, z, x)) {
				// 
				if (whiledd2branchbbImpl
						.pattern_whiledd2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whiledd2branchbbImpl
							.pattern_whiledd2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiledd2branchbbImpl.pattern_whiledd2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_20(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiledd2branchbbImpl.pattern_whiledd2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiledd2branchbbImpl
				.pattern_whiledd2branchbb_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			Decision c = (Decision) result2_black[0];
			Decision a = (Decision) result2_black[1];
			While w = (While) result2_black[2];
			Object[] result2_green = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledd2branchbbImpl
					.pattern_whiledd2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, c, a, w)) {
				// 
				if (whiledd2branchbbImpl
						.pattern_whiledd2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whiledd2branchbbImpl
							.pattern_whiledd2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiledd2branchbbImpl.pattern_whiledd2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whiledd2branchbb");
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
		ruleResult.setRule("whiledd2branchbb");
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

		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiledd2branchbbImpl.pattern_whiledd2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Decision c = (Decision) result2_bindingAndBlack[0];
		Branch i = (Branch) result2_bindingAndBlack[1];
		Decision a = (Decision) result2_bindingAndBlack[2];
		Branch z = (Branch) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Branch x = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, c, i, a, z, w, x, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[i] = " + i + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[w] = "
					+ w + ", " + "[x] = " + x + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiledd2branchbbImpl.pattern_whiledd2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiledd2branchbbImpl
					.pattern_whiledd2branchbb_24_5_matchcorrcontext_blackBFBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_24_6_createcorrespondence_blackBBBBBBB(c, i, a, z, w, x, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[i] = " + i + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[w] = " + w + ", "
							+ "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiledd2branchbbImpl.pattern_whiledd2branchbb_24_6_createcorrespondence_greenBBBFBFB(c, a, z, x,
						ccMatch);
				//nothing S2B a2x = (S2B) result6_green[3];
				//nothing S2B c2z = (S2B) result6_green[5];

				Object[] result7_black = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiledd2branchbbImpl.pattern_whiledd2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Decision c, Branch i, Decision a, Branch z, While w, Branch x,
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
	public boolean checkDEC_FWD(Decision c, Decision a, While w) {// 
		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_27_1_matchtggpattern_blackBBB(c, a, w);
		if (result1_black != null) {
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_27_2_expressionF();
		} else {
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch i, Branch z, Branch x) {// 
		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_28_1_matchtggpattern_blackBBB(i, z, x);
		if (result1_black != null) {
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_28_2_expressionF();
		} else {
			return whiledd2branchbbImpl.pattern_whiledd2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiledd2branchbbImpl.pattern_whiledd2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whiledd2branchbbImpl
				.pattern_whiledd2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiledd2branchbbImpl.pattern_whiledd2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_29_5_checknacs_blackBBB(i, w2i,
						w);
				if (result5_black != null) {

					Object[] result6_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_29_6_perform_blackBBBB(i,
							w2i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiledd2branchbbImpl.pattern_whiledd2branchbb_29_6_perform_greenFBFFBFFFB(i, w, ruleResult);
					//nothing Decision c = (Decision) result6_green[0];
					//nothing Decision a = (Decision) result6_green[2];
					//nothing Branch z = (Branch) result6_green[3];
					//nothing S2B a2x = (S2B) result6_green[5];
					//nothing Branch x = (Branch) result6_green[6];
					//nothing S2B c2z = (S2B) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return whiledd2branchbbImpl.pattern_whiledd2branchbb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_DECISION_DECISION_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILEDD2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_DECISION_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3));
			return null;
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_DECISION_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_DECISION_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEDD2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_BRANCH_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_19((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_20((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_BRANCH_DECISION_BRANCH_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_DEC_FWD__DECISION_DECISION_WHILE:
			return checkDEC_FWD((Decision) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEDD2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDD2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDD2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiledd2branchbb_0_1_initialbindings_blackBBBBB(whiledd2branchbb _this,
			Match match, Decision c, Decision a, While w) {
		if (!a.equals(c)) {
			return new Object[] { _this, match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_2_SolveCSP_bindingFBBBBB(whiledd2branchbb _this,
			Match match, Decision c, Decision a, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, a, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBB(whiledd2branchbb _this,
			Match match, Decision c, Decision a, While w) {
		Object[] result_pattern_whiledd2branchbb_0_2_SolveCSP_binding = pattern_whiledd2branchbb_0_2_SolveCSP_bindingFBBBBB(
				_this, match, c, a, w);
		if (result_pattern_whiledd2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_0_2_SolveCSP_black = pattern_whiledd2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, a, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_0_3_CheckCSP_expressionFBB(whiledd2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Decision c, Decision a, While w) {
		if (!a.equals(c)) {
			return new Object[] { match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Decision c, Decision a, While w) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, c, a, w, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whiledd2branchbb_0_5_collectcontextelements_blackBBBB(Match match, Decision c,
			Decision a, While w) {
		if (!a.equals(c)) {
			return new Object[] { match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiledd2branchbb_0_6_registerobjectstomatch_expressionBBBBB(whiledd2branchbb _this,
			Match match, Decision c, Decision a, While w) {
		_this.registerObjectsToMatch_FWD(match, c, a, w);

	}

	public static final boolean pattern_whiledd2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledd2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject tmpC = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpW = _localVariable_4;
		if (tmpC instanceof Decision) {
			Decision c = (Decision) tmpC;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							return new Object[] { c, i, w2i, a, w, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_1_performtransformation_blackBBBBBFBB(Decision c, Branch i,
			S2B w2i, Decision a, While w, whiledd2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { c, i, w2i, a, w, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			whiledd2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiledd2branchbb_1_1_performtransformation_binding = pattern_whiledd2branchbb_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whiledd2branchbb_1_1_performtransformation_binding != null) {
			Decision c = (Decision) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[2];
			Decision a = (Decision) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[4];

			Object[] result_pattern_whiledd2branchbb_1_1_performtransformation_black = pattern_whiledd2branchbb_1_1_performtransformation_blackBBBBBFBB(
					c, i, w2i, a, w, _this, isApplicableMatch);
			if (result_pattern_whiledd2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledd2branchbb_1_1_performtransformation_black[5];

				return new Object[] { c, i, w2i, a, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_1_performtransformation_greenBBBFFFF(Decision c, Branch i,
			Decision a) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		i.setNegative(z);
		a2x.setSource(a);
		i.setPositive(x);
		a2x.setTarget(x);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { c, i, a, z, a2x, x, c2z };
	}

	public static final Object[] pattern_whiledd2branchbb_1_2_collecttranslatedelements_blackBBBBBB(Decision c,
			Decision a, Branch z, S2B a2x, Branch x, S2B c2z) {
		if (!a.equals(c)) {
			if (!a2x.equals(c2z)) {
				if (!x.equals(z)) {
					return new Object[] { c, a, z, a2x, x, c2z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_2_collecttranslatedelements_greenFBBBBBB(Decision c,
			Decision a, Branch z, S2B a2x, Branch x, S2B c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, c, a, z, a2x, x, c2z };
	}

	public static final Object[] pattern_whiledd2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject i, EObject w2i, EObject a, EObject z, EObject w,
			EObject a2x, EObject x, EObject c2z) {
		if (!c.equals(i)) {
			if (!c.equals(w2i)) {
				if (!c.equals(z)) {
					if (!c.equals(w)) {
						if (!c.equals(x)) {
							if (!c.equals(c2z)) {
								if (!i.equals(w2i)) {
									if (!i.equals(z)) {
										if (!i.equals(w)) {
											if (!i.equals(x)) {
												if (!w2i.equals(z)) {
													if (!w2i.equals(x)) {
														if (!a.equals(c)) {
															if (!a.equals(i)) {
																if (!a.equals(w2i)) {
																	if (!a.equals(z)) {
																		if (!a.equals(w)) {
																			if (!a.equals(a2x)) {
																				if (!a.equals(x)) {
																					if (!a.equals(c2z)) {
																						if (!w.equals(w2i)) {
																							if (!w.equals(z)) {
																								if (!w.equals(x)) {
																									if (!a2x.equals(
																											c)) {
																										if (!a2x.equals(
																												i)) {
																											if (!a2x.equals(
																													w2i)) {
																												if (!a2x.equals(
																														z)) {
																													if (!a2x.equals(
																															w)) {
																														if (!a2x.equals(
																																x)) {
																															if (!a2x.equals(
																																	c2z)) {
																																if (!x.equals(
																																		z)) {
																																	if (!c2z.equals(
																																			i)) {
																																		if (!c2z.equals(
																																				w2i)) {
																																			if (!c2z.equals(
																																					z)) {
																																				if (!c2z.equals(
																																						w)) {
																																					if (!c2z.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								i,
																																								w2i,
																																								a,
																																								z,
																																								w,
																																								a2x,
																																								x,
																																								c2z };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiledd2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject i, EObject a, EObject z, EObject w, EObject a2x, EObject x,
			EObject c2z) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledd2branchbb";
		String i__z____negative_name_prime = "negative";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, c, i, a, z, w, a2x, x, c2z, i__z____negative, w__a____first, w__c____next,
				i__x____positive, a2x__x____target, a2x__a____source, c2z__c____source, c2z__z____target };
	}

	public static final void pattern_whiledd2branchbb_1_5_registerobjects_expressionBBBBBBBBBBB(whiledd2branchbb _this,
			PerformRuleResult ruleresult, EObject c, EObject i, EObject w2i, EObject a, EObject z, EObject w,
			EObject a2x, EObject x, EObject c2z) {
		_this.registerObjects_FWD(ruleresult, c, i, w2i, a, z, w, a2x, x, c2z);

	}

	public static final PerformRuleResult pattern_whiledd2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_2_1_preparereturnvalue_bindingFB(whiledd2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whiledd2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whiledd2branchbb _this) {
		Object[] result_pattern_whiledd2branchbb_2_1_preparereturnvalue_binding = pattern_whiledd2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledd2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiledd2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledd2branchbb_2_1_preparereturnvalue_black = pattern_whiledd2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiledd2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiledd2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiledd2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiledd2branchbb_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("w");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpW = _localVariable_2;
		if (tmpC instanceof Decision) {
			Decision c = (Decision) tmpC;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					return new Object[] { c, a, w, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_2_2_corematch_blackBFFBBB(Decision c, Decision a,
			While w, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(c)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { c, i, w2i, a, w, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_2_3_findcontext_blackBBBBB(Decision c, Branch i,
			S2B w2i, Decision a, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(c)) {
			if (a.equals(w.getFirst())) {
				if (c.equals(w.getNext())) {
					if (w.equals(w2i.getSource())) {
						if (i.equals(w2i.getTarget())) {
							_result.add(new Object[] { c, i, w2i, a, w });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_2_3_findcontext_greenBBBBBFFFFF(Decision c, Branch i, S2B w2i,
			Decision a, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { c, i, w2i, a, w, isApplicableMatch, w__a____first, w__c____next, w2i__w____source,
				w2i__i____target };
	}

	public static final Object[] pattern_whiledd2branchbb_2_4_solveCSP_bindingFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, Decision c, Branch i, S2B w2i, Decision a, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, i, w2i, a, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, i, w2i, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, Decision c, Branch i, S2B w2i, Decision a, While w) {
		Object[] result_pattern_whiledd2branchbb_2_4_solveCSP_binding = pattern_whiledd2branchbb_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, i, w2i, a, w);
		if (result_pattern_whiledd2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_2_4_solveCSP_black = pattern_whiledd2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, i, w2i, a, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_2_5_checkCSP_expressionFBB(whiledd2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiledd2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiledd2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledd2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_10_1_initialbindings_blackBBBBB(whiledd2branchbb _this,
			Match match, Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { _this, match, i, z, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_2_SolveCSP_bindingFBBBBB(whiledd2branchbb _this,
			Match match, Branch i, Branch z, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBB(whiledd2branchbb _this,
			Match match, Branch i, Branch z, Branch x) {
		Object[] result_pattern_whiledd2branchbb_10_2_SolveCSP_binding = pattern_whiledd2branchbb_10_2_SolveCSP_bindingFBBBBB(
				_this, match, i, z, x);
		if (result_pattern_whiledd2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_10_2_SolveCSP_black = pattern_whiledd2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, z, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_10_3_CheckCSP_expressionFBB(whiledd2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, i, z, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Branch i, Branch z, Branch x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, i, z, x, i__z____negative, i__x____positive };
	}

	public static final Object[] pattern_whiledd2branchbb_10_5_collectcontextelements_blackBBBB(Match match, Branch i,
			Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, i, z, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whiledd2branchbb_10_6_registerobjectstomatch_expressionBBBBB(
			whiledd2branchbb _this, Match match, Branch i, Branch z, Branch x) {
		_this.registerObjectsToMatch_BWD(match, i, z, x);

	}

	public static final boolean pattern_whiledd2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledd2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { i, w2i, z, w, x, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_1_performtransformation_blackBBBBBFBB(Branch i, S2B w2i,
			Branch z, While w, Branch x, whiledd2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { i, w2i, z, w, x, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			whiledd2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiledd2branchbb_11_1_performtransformation_binding = pattern_whiledd2branchbb_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whiledd2branchbb_11_1_performtransformation_binding != null) {
			Branch i = (Branch) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[4];

			Object[] result_pattern_whiledd2branchbb_11_1_performtransformation_black = pattern_whiledd2branchbb_11_1_performtransformation_blackBBBBBFBB(
					i, w2i, z, w, x, _this, isApplicableMatch);
			if (result_pattern_whiledd2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledd2branchbb_11_1_performtransformation_black[5];

				return new Object[] { i, w2i, z, w, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_1_performtransformation_greenFFBBFBF(Branch z, While w,
			Branch x) {
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		w.setNext(c);
		w.setFirst(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { c, a, z, w, a2x, x, c2z };
	}

	public static final Object[] pattern_whiledd2branchbb_11_2_collecttranslatedelements_blackBBBBBB(Decision c,
			Decision a, Branch z, S2B a2x, Branch x, S2B c2z) {
		if (!a.equals(c)) {
			if (!a2x.equals(c2z)) {
				if (!x.equals(z)) {
					return new Object[] { c, a, z, a2x, x, c2z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_2_collecttranslatedelements_greenFBBBBBB(Decision c,
			Decision a, Branch z, S2B a2x, Branch x, S2B c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, c, a, z, a2x, x, c2z };
	}

	public static final Object[] pattern_whiledd2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject i, EObject w2i, EObject a, EObject z, EObject w,
			EObject a2x, EObject x, EObject c2z) {
		if (!c.equals(i)) {
			if (!c.equals(w2i)) {
				if (!c.equals(z)) {
					if (!c.equals(w)) {
						if (!c.equals(x)) {
							if (!c.equals(c2z)) {
								if (!i.equals(w2i)) {
									if (!i.equals(z)) {
										if (!i.equals(w)) {
											if (!i.equals(x)) {
												if (!w2i.equals(z)) {
													if (!w2i.equals(x)) {
														if (!a.equals(c)) {
															if (!a.equals(i)) {
																if (!a.equals(w2i)) {
																	if (!a.equals(z)) {
																		if (!a.equals(w)) {
																			if (!a.equals(a2x)) {
																				if (!a.equals(x)) {
																					if (!a.equals(c2z)) {
																						if (!w.equals(w2i)) {
																							if (!w.equals(z)) {
																								if (!w.equals(x)) {
																									if (!a2x.equals(
																											c)) {
																										if (!a2x.equals(
																												i)) {
																											if (!a2x.equals(
																													w2i)) {
																												if (!a2x.equals(
																														z)) {
																													if (!a2x.equals(
																															w)) {
																														if (!a2x.equals(
																																x)) {
																															if (!a2x.equals(
																																	c2z)) {
																																if (!x.equals(
																																		z)) {
																																	if (!c2z.equals(
																																			i)) {
																																		if (!c2z.equals(
																																				w2i)) {
																																			if (!c2z.equals(
																																					z)) {
																																				if (!c2z.equals(
																																						w)) {
																																					if (!c2z.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								i,
																																								w2i,
																																								a,
																																								z,
																																								w,
																																								a2x,
																																								x,
																																								c2z };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiledd2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject i, EObject a, EObject z, EObject w, EObject a2x, EObject x,
			EObject c2z) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledd2branchbb";
		String i__z____negative_name_prime = "negative";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, c, i, a, z, w, a2x, x, c2z, i__z____negative, w__a____first, w__c____next,
				i__x____positive, a2x__x____target, a2x__a____source, c2z__c____source, c2z__z____target };
	}

	public static final void pattern_whiledd2branchbb_11_5_registerobjects_expressionBBBBBBBBBBB(whiledd2branchbb _this,
			PerformRuleResult ruleresult, EObject c, EObject i, EObject w2i, EObject a, EObject z, EObject w,
			EObject a2x, EObject x, EObject c2z) {
		_this.registerObjects_BWD(ruleresult, c, i, w2i, a, z, w, a2x, x, c2z);

	}

	public static final PerformRuleResult pattern_whiledd2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_12_1_preparereturnvalue_bindingFB(whiledd2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whiledd2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whiledd2branchbb _this) {
		Object[] result_pattern_whiledd2branchbb_12_1_preparereturnvalue_binding = pattern_whiledd2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledd2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiledd2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledd2branchbb_12_1_preparereturnvalue_black = pattern_whiledd2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiledd2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiledd2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiledd2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiledd2branchbb_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpX = _localVariable_2;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					return new Object[] { i, z, x, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_12_2_corematch_blackBFBFBB(Branch i, Branch z,
			Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { i, w2i, z, w, x, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_12_3_findcontext_blackBBBBB(Branch i, S2B w2i,
			Branch z, While w, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (w.equals(w2i.getSource())) {
							if (x.equals(i.getPositive())) {
								if (i.equals(w2i.getTarget())) {
									_result.add(new Object[] { i, w2i, z, w, x });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_12_3_findcontext_greenBBBBBFFFFF(Branch i, S2B w2i, Branch z,
			While w, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String w2i__w____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { i, w2i, z, w, x, isApplicableMatch, i__z____negative, w2i__w____source, i__x____positive,
				w2i__i____target };
	}

	public static final Object[] pattern_whiledd2branchbb_12_4_solveCSP_bindingFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, Branch z, While w, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, w2i, z, w, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, z, w, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, Branch z, While w, Branch x) {
		Object[] result_pattern_whiledd2branchbb_12_4_solveCSP_binding = pattern_whiledd2branchbb_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, i, w2i, z, w, x);
		if (result_pattern_whiledd2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_12_4_solveCSP_black = pattern_whiledd2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, z, w, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_12_5_checkCSP_expressionFBB(whiledd2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiledd2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiledd2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledd2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_20_1_preparereturnvalue_bindingFB(whiledd2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiledd2branchbb _this) {
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

	public static final Object[] pattern_whiledd2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whiledd2branchbb _this) {
		Object[] result_pattern_whiledd2branchbb_20_1_preparereturnvalue_binding = pattern_whiledd2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledd2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiledd2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledd2branchbb_20_1_preparereturnvalue_black = pattern_whiledd2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiledd2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiledd2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiledd2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_403948 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_337516 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_337516)) {
							if (!i.equals(__DEC_z_positive_337516)) {
								if (!x.equals(__DEC_z_positive_337516)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_914907 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_914907)) {
							if (!i.equals(__DEC_z_negative_914907)) {
								if (!x.equals(__DEC_z_negative_914907)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_995884 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_571030 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_571030)) {
							if (!i.equals(__DEC_x_positive_571030)) {
								if (!z.equals(__DEC_x_positive_571030)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_733994 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_733994)) {
							if (!i.equals(__DEC_x_negative_733994)) {
								if (!z.equals(__DEC_x_negative_733994)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_6BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_7BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_8BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_negative.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpZ = _edge_negative.getTrg();
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (!i.equals(z)) {
					if (z.equals(i.getNegative())) {
						Node tmpX = i.getPositive();
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (!i.equals(x)) {
								if (!x.equals(z)) {
									if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
										if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_6BB(i,
												z) == null) {
											if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(z, i,
													x) == null) {
												if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(z,
														i, x) == null) {
													if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_3B(
															x) == null) {
														if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
																x, i, z) == null) {
															if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																	x, i, z) == null) {
																if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_7BB(
																		z, x) == null) {
																	if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_8BB(
																			i, x) == null) {
																		if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																				z, x) == null) {
																			_result.add(new Object[] { i, z, x,
																					_edge_negative });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledd2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whiledd2branchbb _this, Match match, Branch i, Branch z, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, z, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiledd2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiledd2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiledd2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_21_1_preparereturnvalue_bindingFB(whiledd2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiledd2branchbb _this) {
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

	public static final Object[] pattern_whiledd2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whiledd2branchbb _this) {
		Object[] result_pattern_whiledd2branchbb_21_1_preparereturnvalue_binding = pattern_whiledd2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledd2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiledd2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledd2branchbb_21_1_preparereturnvalue_black = pattern_whiledd2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiledd2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiledd2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiledd2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_0BB(Decision c,
			Decision a) {
		if (!a.equals(c)) {
			for (Decision __DEC_c_positive_290022 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "positive")) {
				if (!c.equals(__DEC_c_positive_290022)) {
					if (!a.equals(__DEC_c_positive_290022)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_1BB(Decision c,
			Decision a) {
		if (!a.equals(c)) {
			for (Decision __DEC_c_negative_515418 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "negative")) {
				if (!c.equals(__DEC_c_negative_515418)) {
					if (!a.equals(__DEC_c_negative_515418)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_2BB(Decision c, While w) {
		for (While __DEC_c_first_848025 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_848025)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_3BB(Decision c, While w) {
		for (While __DEC_c_last_755598 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_755598)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_192368 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Decision a,
			Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_positive_262205 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!a.equals(__DEC_a_positive_262205)) {
					if (!c.equals(__DEC_a_positive_262205)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_6BB(Decision a,
			Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_negative_654952 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_654952)) {
					if (!c.equals(__DEC_a_negative_654952)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_7BB(Decision a, While w) {
		for (While __DEC_a_last_384551 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_384551)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_207629 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_9BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_10BB(While w,
			Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_11BB(Decision c,
			Decision a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_12BB(Decision c,
			Decision a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (a.equals(w.getFirst())) {
					Statement tmpC = w.getNext();
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						if (!a.equals(c)) {
							if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_7BB(a, w) == null) {
								if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
									if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_13BB(w,
											a) == null) {
										if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_0BB(c,
												a) == null) {
											if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_1BB(c,
													a) == null) {
												if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_2BB(c,
														w) == null) {
													if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_3BB(
															c, w) == null) {
														if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																c) == null) {
															if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																	a, c) == null) {
																if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																		a, c) == null) {
																	if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_9BB(
																			w, c) == null) {
																		if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_10BB(
																				w, c) == null) {
																			if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_11BB(
																					c, a) == null) {
																				if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_12BB(
																						c, a) == null) {
																					_result.add(new Object[] { c, a, w,
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

		}

		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledd2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whiledd2branchbb _this, Match match, Decision c, Decision a, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, a, w);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiledd2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiledd2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiledd2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_24_1_prepare_blackB(whiledd2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiledd2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whiledd2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("c");
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = targetMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpC instanceof Decision) {
			Decision c = (Decision) tmpC;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { c, i, a, z, w, x, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBB(Decision c, Branch i,
			Decision a, Branch z, While w, Branch x, Match sourceMatch, Match targetMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!a.equals(c)) {
					if (!x.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { c, i, a, z, w, x, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding = pattern_whiledd2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Decision c = (Decision) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[0];
			Branch i = (Branch) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[1];
			Decision a = (Decision) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[2];
			Branch z = (Branch) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch x = (Branch) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_black = pattern_whiledd2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBB(
					c, i, a, z, w, x, sourceMatch, targetMatch);
			if (result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, i, a, z, w, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_3_solvecsp_bindingFBBBBBBBBB(whiledd2branchbb _this,
			Decision c, Branch i, Decision a, Branch z, While w, Branch x, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(c, i, a, z, w, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, c, i, a, z, w, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whiledd2branchbb _this, Decision c, Branch i, Decision a, Branch z, While w, Branch x, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whiledd2branchbb_24_3_solvecsp_binding = pattern_whiledd2branchbb_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, c, i, a, z, w, x, sourceMatch, targetMatch);
		if (result_pattern_whiledd2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiledd2branchbb_24_3_solvecsp_black = pattern_whiledd2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, i, a, z, w, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_24_5_matchcorrcontext_blackBFBBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { i, w2i, w, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whiledd2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whiledd2branchbb_24_6_createcorrespondence_blackBBBBBBB(Decision c, Branch i,
			Decision a, Branch z, While w, Branch x, CCMatch ccMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!a.equals(c)) {
					if (!x.equals(z)) {
						return new Object[] { c, i, a, z, w, x, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_6_createcorrespondence_greenBBBFBFB(Decision c, Decision a,
			Branch z, Branch x, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { c, a, z, a2x, x, c2z, ccMatch };
	}

	public static final Object[] pattern_whiledd2branchbb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whiledd2branchbb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whiledd2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledd2branchbb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_0BB(Decision c, Decision a) {
		if (!a.equals(c)) {
			for (Decision __DEC_c_positive_236122 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "positive")) {
				if (!c.equals(__DEC_c_positive_236122)) {
					if (!a.equals(__DEC_c_positive_236122)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_1BB(Decision c, Decision a) {
		if (!a.equals(c)) {
			for (Decision __DEC_c_negative_161478 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "negative")) {
				if (!c.equals(__DEC_c_negative_161478)) {
					if (!a.equals(__DEC_c_negative_161478)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_2BB(Decision c, While w) {
		for (While __DEC_c_first_696013 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_696013)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_3BB(Decision c, While w) {
		for (While __DEC_c_last_2732 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_2732)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_932967 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_5BB(Decision a, Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_positive_520931 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!a.equals(__DEC_a_positive_520931)) {
					if (!c.equals(__DEC_a_positive_520931)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_6BB(Decision a, Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_negative_944412 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_944412)) {
					if (!c.equals(__DEC_a_negative_944412)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_7BB(Decision a, While w) {
		for (While __DEC_a_last_326154 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_326154)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_400366 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_9BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_10BB(While w, Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_11BB(Decision c, Decision a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_12BB(Decision c, Decision a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_13BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_blackBBB(Decision c, Decision a,
			While w) {
		if (!a.equals(c)) {
			if (a.equals(w.getFirst())) {
				if (c.equals(w.getNext())) {
					if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_0BB(c, a) == null) {
						if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_1BB(c, a) == null) {
							if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_2BB(c, w) == null) {
								if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_3BB(c, w) == null) {
									if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_4B(c) == null) {
										if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_5BB(a, c) == null) {
											if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_6BB(a,
													c) == null) {
												if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_7BB(a,
														w) == null) {
													if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_8B(
															a) == null) {
														if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_9BB(
																w, c) == null) {
															if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_10BB(
																	w, c) == null) {
																if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_11BB(
																		c, a) == null) {
																	if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_12BB(
																			c, a) == null) {
																		if (pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_13BB(
																				w, a) == null) {
																			return new Object[] { c, a, w };
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whiledd2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledd2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_344814 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_801785 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_801785)) {
							if (!i.equals(__DEC_z_positive_801785)) {
								if (!x.equals(__DEC_z_positive_801785)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_229404 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_229404)) {
							if (!i.equals(__DEC_z_negative_229404)) {
								if (!x.equals(__DEC_z_negative_229404)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_384039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_918920 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_918920)) {
							if (!i.equals(__DEC_x_positive_918920)) {
								if (!z.equals(__DEC_x_positive_918920)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_647340 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_647340)) {
							if (!i.equals(__DEC_x_negative_647340)) {
								if (!z.equals(__DEC_x_negative_647340)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_6BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_7BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_8BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_blackBBB(Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
								if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_1BBB(z, i, x) == null) {
									if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_2BBB(z, i, x) == null) {
										if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_3B(x) == null) {
											if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_4BBB(x, i,
													z) == null) {
												if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_5BBB(x, i,
														z) == null) {
													if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_6BB(i,
															z) == null) {
														if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_7BB(
																z, x) == null) {
															if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_8BB(
																	i, x) == null) {
																if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_9BB(
																		z, x) == null) {
																	return new Object[] { i, z, x };
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whiledd2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledd2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_29_1_createresult_blackB(whiledd2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiledd2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whiledd2branchbb_29_3_solveCSP_bindingFBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiledd2branchbb_29_3_solveCSP_binding = pattern_whiledd2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whiledd2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_29_3_solveCSP_black = pattern_whiledd2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_29_4_checkCSP_expressionFBB(whiledd2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whiledd2branchbb_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whiledd2branchbb_29_6_perform_greenFBFFBFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		c2z.setSource(c);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, i, a, z, w, a2x, x, c2z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiledd2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiledd2branchbbImpl
