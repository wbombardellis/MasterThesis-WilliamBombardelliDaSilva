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
	public boolean isAppropriate_FWD(Match match, While w, Decision c, Decision a) {

		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_0_1_initialbindings_blackBBBBB(this,
				match, w, c, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, w, c, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledd2branchbbImpl.pattern_whiledd2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_0_4_collectelementstobetranslated_blackBBBB(match, w, c, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_0_4_collectelementstobetranslated_greenBBBBFF(match, w, c, a);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_0_5_collectcontextelements_blackBBBB(match, w, c, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiledd2branchbbImpl.pattern_whiledd2branchbb_0_6_registerobjectstomatch_expressionBBBBB(this, match, w, c,
					a);
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
		While w = (While) result1_bindingAndBlack[0];
		Decision c = (Decision) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		Decision a = (Decision) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whiledd2branchbbImpl.pattern_whiledd2branchbb_1_1_performtransformation_greenFBBFBFF(c,
				i, a);
		S2B c2z = (S2B) result1_green[0];
		S2B a2x = (S2B) result1_green[3];
		Branch x = (Branch) result1_green[5];
		Branch z = (Branch) result1_green[6];

		Object[] result2_black = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_1_2_collecttranslatedelements_blackBBBBBB(c2z, c, a2x, a, x, z);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", " + "[c] = " + c + ", "
							+ "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_1_2_collecttranslatedelements_greenFBBBBBB(c2z, c, a2x, a, x, z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, w, c2z, c, i, a2x, a, x, z, w2i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[c2z] = " + c2z + ", " + "[c] = " + c + ", " + "[i] = " + i + ", "
					+ "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[w2i] = " + w2i + ".");
		}
		whiledd2branchbbImpl.pattern_whiledd2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, w, c2z,
				c, i, a2x, a, x, z);
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];

		// 
		// 
		whiledd2branchbbImpl.pattern_whiledd2branchbb_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, w,
				c2z, c, i, a2x, a, x, z, w2i);
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
		While w = (While) result2_binding[0];
		Decision c = (Decision) result2_binding[1];
		Decision a = (Decision) result2_binding[2];
		for (Object[] result2_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_2_2_corematch_blackBBFBFB(w, c, a,
				match)) {
			Branch i = (Branch) result2_black[2];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_2_3_findcontext_blackBBBBB(w, c,
					i, a, w2i)) {
				Object[] result3_green = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_2_3_findcontext_greenBBBBBFFFFF(w, c, i, a, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, w, c, i,
								a, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[c] = " + c
							+ ", " + "[i] = " + i + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While w, Decision c, Decision a) {
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, Decision c, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While w, Decision c, Branch i, Decision a,
			S2B w2i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i,
			EObject a2x, EObject a, EObject x, EObject z, EObject w2i) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);

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
	public boolean isAppropriate_BWD(Match match, Branch i, Branch x, Branch z) {

		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_10_1_initialbindings_blackBBBBB(this,
				match, i, x, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, i, x, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledd2branchbbImpl.pattern_whiledd2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_10_4_collectelementstobetranslated_blackBBBB(match, i, x, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_10_4_collectelementstobetranslated_greenBBBBFF(match, i, x,
					z);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_10_5_collectcontextelements_blackBBBB(match, i, x, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
			}
			whiledd2branchbbImpl.pattern_whiledd2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiledd2branchbbImpl.pattern_whiledd2branchbb_10_6_registerobjectstomatch_expressionBBBBB(this, match, i, x,
					z);
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
		While w = (While) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		Branch x = (Branch) result1_bindingAndBlack[2];
		Branch z = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_1_performtransformation_greenBFFFFBB(w, x, z);
		S2B c2z = (S2B) result1_green[1];
		Decision c = (Decision) result1_green[2];
		S2B a2x = (S2B) result1_green[3];
		Decision a = (Decision) result1_green[4];

		Object[] result2_black = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_2_collecttranslatedelements_blackBBBBBB(c2z, c, a2x, a, x, z);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", " + "[c] = " + c + ", "
							+ "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_11_2_collecttranslatedelements_greenFBBBBBB(c2z, c, a2x, a, x, z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, w, c2z, c, i, a2x, a, x, z, w2i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[c2z] = " + c2z + ", " + "[c] = " + c + ", " + "[i] = " + i + ", "
					+ "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[w2i] = " + w2i + ".");
		}
		whiledd2branchbbImpl.pattern_whiledd2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, w,
				c2z, c, i, a2x, a, x, z);
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];

		// 
		// 
		whiledd2branchbbImpl.pattern_whiledd2branchbb_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, w,
				c2z, c, i, a2x, a, x, z, w2i);
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
		Branch x = (Branch) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		for (Object[] result2_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_12_2_corematch_blackFBBBFB(i, x, z,
				match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whiledd2branchbbImpl.pattern_whiledd2branchbb_12_3_findcontext_blackBBBBB(w,
					i, x, z, w2i)) {
				Object[] result3_green = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_12_3_findcontext_greenBBBBBFFFFF(w, i, x, z, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, w, i,
								x, z, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
							+ ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch x, Branch z) {
		match.registerObject("i", i);
		match.registerObject("x", x);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch x, Branch z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Branch i, Branch x, Branch z,
			S2B w2i) {// Create CSP
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
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i,
			EObject a2x, EObject a, EObject x, EObject z, EObject w2i) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_124(EMoflonEdge _edge_negative) {

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
			Branch x = (Branch) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Object[] result2_green = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledd2branchbbImpl
					.pattern_whiledd2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, i, x, z)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_124(EMoflonEdge _edge_next) {

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
				.pattern_whiledd2branchbb_21_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			While w = (While) result2_black[0];
			Decision c = (Decision) result2_black[1];
			Decision a = (Decision) result2_black[2];
			Object[] result2_green = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledd2branchbbImpl
					.pattern_whiledd2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, w, c, a)) {
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
		While w = (While) result2_bindingAndBlack[0];
		Decision c = (Decision) result2_bindingAndBlack[1];
		Branch i = (Branch) result2_bindingAndBlack[2];
		Decision a = (Decision) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Branch z = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whiledd2branchbbImpl
				.pattern_whiledd2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, w, c, i, a, x, z, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[a] = " + a + ", " + "[x] = "
					+ x + ", " + "[z] = " + z + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiledd2branchbbImpl.pattern_whiledd2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiledd2branchbbImpl
					.pattern_whiledd2branchbb_24_5_matchcorrcontext_blackBBFBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiledd2branchbbImpl
						.pattern_whiledd2branchbb_24_6_createcorrespondence_blackBBBBBBB(w, c, i, a, x, z, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
							+ "[c] = " + c + ", " + "[i] = " + i + ", " + "[a] = " + a + ", " + "[x] = " + x + ", "
							+ "[z] = " + z + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiledd2branchbbImpl.pattern_whiledd2branchbb_24_6_createcorrespondence_greenFBFBBBB(c, a, x, z,
						ccMatch);
				//nothing S2B c2z = (S2B) result6_green[0];
				//nothing S2B a2x = (S2B) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(While w, Decision c, Branch i, Decision a, Branch x, Branch z,
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
	public boolean checkDEC_FWD(While w, Decision c, Decision a) {// 
		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_27_1_matchtggpattern_blackBBB(w, c, a);
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
	public boolean checkDEC_BWD(Branch i, Branch x, Branch z) {// 
		Object[] result1_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_28_1_matchtggpattern_blackBBB(i, x, z);
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
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whiledd2branchbbImpl
					.pattern_whiledd2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiledd2branchbbImpl.pattern_whiledd2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_29_5_checknacs_blackBBB(w, i,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whiledd2branchbbImpl.pattern_whiledd2branchbb_29_6_perform_blackBBBB(w, i,
							w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiledd2branchbbImpl.pattern_whiledd2branchbb_29_6_perform_greenBFFBFFFFB(w, i, ruleResult);
					//nothing S2B c2z = (S2B) result6_green[1];
					//nothing Decision c = (Decision) result6_green[2];
					//nothing S2B a2x = (S2B) result6_green[4];
					//nothing Decision a = (Decision) result6_green[5];
					//nothing Branch x = (Branch) result6_green[6];
					//nothing Branch z = (Branch) result6_green[7];

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
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_DECISION_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.WHILEDD2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_DECISION_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Decision) arguments.get(3));
			return null;
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_DECISION_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_DECISION_BRANCH_DECISION_S2B:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(S2B) arguments.get(5));
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
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_BRANCH_BRANCH_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5));
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
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_124((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_124((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_DECISION_BRANCH_DECISION_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEDD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_DEC_FWD__WHILE_DECISION_DECISION:
			return checkDEC_FWD((While) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.WHILEDD2BRANCHBB___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEDD2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDD2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDD2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiledd2branchbb_0_1_initialbindings_blackBBBBB(whiledd2branchbb _this,
			Match match, While w, Decision c, Decision a) {
		if (!a.equals(c)) {
			return new Object[] { _this, match, w, c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_2_SolveCSP_bindingFBBBBB(whiledd2branchbb _this,
			Match match, While w, Decision c, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, c, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBB(whiledd2branchbb _this,
			Match match, While w, Decision c, Decision a) {
		Object[] result_pattern_whiledd2branchbb_0_2_SolveCSP_binding = pattern_whiledd2branchbb_0_2_SolveCSP_bindingFBBBBB(
				_this, match, w, c, a);
		if (result_pattern_whiledd2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_0_2_SolveCSP_black = pattern_whiledd2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, c, a };
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
			While w, Decision c, Decision a) {
		if (!a.equals(c)) {
			return new Object[] { match, w, c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			While w, Decision c, Decision a) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, w, c, a, w__c____next, w__a____first };
	}

	public static final Object[] pattern_whiledd2branchbb_0_5_collectcontextelements_blackBBBB(Match match, While w,
			Decision c, Decision a) {
		if (!a.equals(c)) {
			return new Object[] { match, w, c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiledd2branchbb_0_6_registerobjectstomatch_expressionBBBBB(whiledd2branchbb _this,
			Match match, While w, Decision c, Decision a) {
		_this.registerObjectsToMatch_FWD(match, w, c, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							return new Object[] { w, c, i, a, w2i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_1_performtransformation_blackBBBBBFBB(While w, Decision c,
			Branch i, Decision a, S2B w2i, whiledd2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w, c, i, a, w2i, csp, _this, isApplicableMatch };
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
			While w = (While) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[0];
			Decision c = (Decision) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[2];
			Decision a = (Decision) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whiledd2branchbb_1_1_performtransformation_binding[4];

			Object[] result_pattern_whiledd2branchbb_1_1_performtransformation_black = pattern_whiledd2branchbb_1_1_performtransformation_blackBBBBBFBB(
					w, c, i, a, w2i, _this, isApplicableMatch);
			if (result_pattern_whiledd2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledd2branchbb_1_1_performtransformation_black[5];

				return new Object[] { w, c, i, a, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_1_performtransformation_greenFBBFBFF(Decision c, Branch i,
			Decision a) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		c2z.setSource(c);
		a2x.setSource(a);
		i.setPositive(x);
		a2x.setTarget(x);
		i.setNegative(z);
		c2z.setTarget(z);
		return new Object[] { c2z, c, i, a2x, a, x, z };
	}

	public static final Object[] pattern_whiledd2branchbb_1_2_collecttranslatedelements_blackBBBBBB(S2B c2z, Decision c,
			S2B a2x, Decision a, Branch x, Branch z) {
		if (!a2x.equals(c2z)) {
			if (!a.equals(c)) {
				if (!x.equals(z)) {
					return new Object[] { c2z, c, a2x, a, x, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_1_2_collecttranslatedelements_greenFBBBBBB(S2B c2z,
			Decision c, S2B a2x, Decision a, Branch x, Branch z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		return new Object[] { ruleresult, c2z, c, a2x, a, x, z };
	}

	public static final Object[] pattern_whiledd2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i, EObject a2x, EObject a,
			EObject x, EObject z, EObject w2i) {
		if (!w.equals(x)) {
			if (!w.equals(z)) {
				if (!w.equals(w2i)) {
					if (!c2z.equals(w)) {
						if (!c2z.equals(i)) {
							if (!c2z.equals(x)) {
								if (!c2z.equals(z)) {
									if (!c2z.equals(w2i)) {
										if (!c.equals(w)) {
											if (!c.equals(c2z)) {
												if (!c.equals(i)) {
													if (!c.equals(x)) {
														if (!c.equals(z)) {
															if (!c.equals(w2i)) {
																if (!i.equals(w)) {
																	if (!i.equals(x)) {
																		if (!i.equals(z)) {
																			if (!i.equals(w2i)) {
																				if (!a2x.equals(w)) {
																					if (!a2x.equals(c2z)) {
																						if (!a2x.equals(c)) {
																							if (!a2x.equals(i)) {
																								if (!a2x.equals(x)) {
																									if (!a2x.equals(
																											z)) {
																										if (!a2x.equals(
																												w2i)) {
																											if (!a.equals(
																													w)) {
																												if (!a.equals(
																														c2z)) {
																													if (!a.equals(
																															c)) {
																														if (!a.equals(
																																i)) {
																															if (!a.equals(
																																	a2x)) {
																																if (!a.equals(
																																		x)) {
																																	if (!a.equals(
																																			z)) {
																																		if (!a.equals(
																																				w2i)) {
																																			if (!x.equals(
																																					z)) {
																																				if (!w2i.equals(
																																						x)) {
																																					if (!w2i.equals(
																																							z)) {
																																						return new Object[] {
																																								ruleresult,
																																								w,
																																								c2z,
																																								c,
																																								i,
																																								a2x,
																																								a,
																																								x,
																																								z,
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

	public static final Object[] pattern_whiledd2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i, EObject a2x, EObject a,
			EObject x, EObject z) {
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledd2branchbb";
		String c2z__c____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { ruleresult, w, c2z, c, i, a2x, a, x, z, c2z__c____source, w__c____next, i__z____negative,
				a2x__a____source, i__x____positive, a2x__x____target, c2z__z____target, w__a____first };
	}

	public static final void pattern_whiledd2branchbb_1_5_registerobjects_expressionBBBBBBBBBBB(whiledd2branchbb _this,
			PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i, EObject a2x, EObject a,
			EObject x, EObject z, EObject w2i) {
		_this.registerObjects_FWD(ruleresult, w, c2z, c, i, a2x, a, x, z, w2i);

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
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					return new Object[] { w, c, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_2_2_corematch_blackBBFBFB(While w, Decision c,
			Decision a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(c)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w, c, i, a, w2i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_2_3_findcontext_blackBBBBB(While w, Decision c,
			Branch i, Decision a, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(c)) {
			if (c.equals(w.getNext())) {
				if (i.equals(w2i.getTarget())) {
					if (a.equals(w.getFirst())) {
						if (w.equals(w2i.getSource())) {
							_result.add(new Object[] { w, c, i, a, w2i });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_2_3_findcontext_greenBBBBBFFFFF(While w, Decision c, Branch i,
			Decision a, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__c____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w2i);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__c____next.setName(w__c____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { w, c, i, a, w2i, isApplicableMatch, w__c____next, w2i__i____target, w__a____first,
				w2i__w____source };
	}

	public static final Object[] pattern_whiledd2branchbb_2_4_solveCSP_bindingFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Decision c, Branch i, Decision a, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w, c, i, a, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, c, i, a, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Decision c, Branch i, Decision a, S2B w2i) {
		Object[] result_pattern_whiledd2branchbb_2_4_solveCSP_binding = pattern_whiledd2branchbb_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, w, c, i, a, w2i);
		if (result_pattern_whiledd2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_2_4_solveCSP_black = pattern_whiledd2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, c, i, a, w2i };
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
			Match match, Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					return new Object[] { _this, match, i, x, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_2_SolveCSP_bindingFBBBBB(whiledd2branchbb _this,
			Match match, Branch i, Branch x, Branch z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, x, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, x, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBB(whiledd2branchbb _this,
			Match match, Branch i, Branch x, Branch z) {
		Object[] result_pattern_whiledd2branchbb_10_2_SolveCSP_binding = pattern_whiledd2branchbb_10_2_SolveCSP_bindingFBBBBB(
				_this, match, i, x, z);
		if (result_pattern_whiledd2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_10_2_SolveCSP_black = pattern_whiledd2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, x, z };
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
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					return new Object[] { match, i, x, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Branch i, Branch x, Branch z) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
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
		return new Object[] { match, i, x, z, i__z____negative, i__x____positive };
	}

	public static final Object[] pattern_whiledd2branchbb_10_5_collectcontextelements_blackBBBB(Match match, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					return new Object[] { match, i, x, z };
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
			whiledd2branchbb _this, Match match, Branch i, Branch x, Branch z) {
		_this.registerObjectsToMatch_BWD(match, i, x, z);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("x");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject tmpW = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							return new Object[] { w, i, x, z, w2i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_1_performtransformation_blackBBBBBFBB(While w, Branch i,
			Branch x, Branch z, S2B w2i, whiledd2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { w, i, x, z, w2i, csp, _this, isApplicableMatch };
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
			While w = (While) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[1];
			Branch x = (Branch) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[2];
			Branch z = (Branch) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whiledd2branchbb_11_1_performtransformation_binding[4];

			Object[] result_pattern_whiledd2branchbb_11_1_performtransformation_black = pattern_whiledd2branchbb_11_1_performtransformation_blackBBBBBFBB(
					w, i, x, z, w2i, _this, isApplicableMatch);
			if (result_pattern_whiledd2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledd2branchbb_11_1_performtransformation_black[5];

				return new Object[] { w, i, x, z, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_1_performtransformation_greenBFFFFBB(While w, Branch x,
			Branch z) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		c2z.setTarget(z);
		c2z.setSource(c);
		w.setNext(c);
		a2x.setTarget(x);
		a2x.setSource(a);
		w.setFirst(a);
		return new Object[] { w, c2z, c, a2x, a, x, z };
	}

	public static final Object[] pattern_whiledd2branchbb_11_2_collecttranslatedelements_blackBBBBBB(S2B c2z,
			Decision c, S2B a2x, Decision a, Branch x, Branch z) {
		if (!a2x.equals(c2z)) {
			if (!a.equals(c)) {
				if (!x.equals(z)) {
					return new Object[] { c2z, c, a2x, a, x, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_11_2_collecttranslatedelements_greenFBBBBBB(S2B c2z,
			Decision c, S2B a2x, Decision a, Branch x, Branch z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		return new Object[] { ruleresult, c2z, c, a2x, a, x, z };
	}

	public static final Object[] pattern_whiledd2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i, EObject a2x, EObject a,
			EObject x, EObject z, EObject w2i) {
		if (!w.equals(x)) {
			if (!w.equals(z)) {
				if (!w.equals(w2i)) {
					if (!c2z.equals(w)) {
						if (!c2z.equals(i)) {
							if (!c2z.equals(x)) {
								if (!c2z.equals(z)) {
									if (!c2z.equals(w2i)) {
										if (!c.equals(w)) {
											if (!c.equals(c2z)) {
												if (!c.equals(i)) {
													if (!c.equals(x)) {
														if (!c.equals(z)) {
															if (!c.equals(w2i)) {
																if (!i.equals(w)) {
																	if (!i.equals(x)) {
																		if (!i.equals(z)) {
																			if (!i.equals(w2i)) {
																				if (!a2x.equals(w)) {
																					if (!a2x.equals(c2z)) {
																						if (!a2x.equals(c)) {
																							if (!a2x.equals(i)) {
																								if (!a2x.equals(x)) {
																									if (!a2x.equals(
																											z)) {
																										if (!a2x.equals(
																												w2i)) {
																											if (!a.equals(
																													w)) {
																												if (!a.equals(
																														c2z)) {
																													if (!a.equals(
																															c)) {
																														if (!a.equals(
																																i)) {
																															if (!a.equals(
																																	a2x)) {
																																if (!a.equals(
																																		x)) {
																																	if (!a.equals(
																																			z)) {
																																		if (!a.equals(
																																				w2i)) {
																																			if (!x.equals(
																																					z)) {
																																				if (!w2i.equals(
																																						x)) {
																																					if (!w2i.equals(
																																							z)) {
																																						return new Object[] {
																																								ruleresult,
																																								w,
																																								c2z,
																																								c,
																																								i,
																																								a2x,
																																								a,
																																								x,
																																								z,
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

	public static final Object[] pattern_whiledd2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i, EObject a2x, EObject a,
			EObject x, EObject z) {
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledd2branchbb";
		String c2z__c____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { ruleresult, w, c2z, c, i, a2x, a, x, z, c2z__c____source, w__c____next, i__z____negative,
				a2x__a____source, i__x____positive, a2x__x____target, c2z__z____target, w__a____first };
	}

	public static final void pattern_whiledd2branchbb_11_5_registerobjects_expressionBBBBBBBBBBB(whiledd2branchbb _this,
			PerformRuleResult ruleresult, EObject w, EObject c2z, EObject c, EObject i, EObject a2x, EObject a,
			EObject x, EObject z, EObject w2i) {
		_this.registerObjects_BWD(ruleresult, w, c2z, c, i, a2x, a, x, z, w2i);

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
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("z");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					return new Object[] { i, x, z, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_12_2_corematch_blackFBBBFB(Branch i, Branch x,
			Branch z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { w, i, x, z, w2i, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_12_3_findcontext_blackBBBBB(While w, Branch i,
			Branch x, Branch z, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (i.equals(w2i.getTarget())) {
								if (w.equals(w2i.getSource())) {
									_result.add(new Object[] { w, i, x, z, w2i });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_12_3_findcontext_greenBBBBBFFFFF(While w, Branch i, Branch x,
			Branch z, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { w, i, x, z, w2i, isApplicableMatch, i__z____negative, i__x____positive, w2i__i____target,
				w2i__w____source };
	}

	public static final Object[] pattern_whiledd2branchbb_12_4_solveCSP_bindingFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, Branch x, Branch z, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, i, x, z, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, x, z, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, Branch x, Branch z, S2B w2i) {
		Object[] result_pattern_whiledd2branchbb_12_4_solveCSP_binding = pattern_whiledd2branchbb_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, w, i, x, z, w2i);
		if (result_pattern_whiledd2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_12_4_solveCSP_black = pattern_whiledd2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, x, z, w2i };
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

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_644184 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_108469 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_108469)) {
							if (!i.equals(__DEC_x_positive_108469)) {
								if (!z.equals(__DEC_x_positive_108469)) {
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

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_921661 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_921661)) {
							if (!i.equals(__DEC_x_negative_921661)) {
								if (!z.equals(__DEC_x_negative_921661)) {
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

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_358895 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_903275 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_903275)) {
							if (!i.equals(__DEC_z_positive_903275)) {
								if (!x.equals(__DEC_z_positive_903275)) {
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

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_440546 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_440546)) {
							if (!i.equals(__DEC_z_negative_440546)) {
								if (!x.equals(__DEC_z_negative_440546)) {
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

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_6BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_7BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_8BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
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
									if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_3B(z) == null) {
										if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_7BB(i,
												z) == null) {
											if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_0B(
													x) == null) {
												if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(x,
														i, z) == null) {
													if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
															x, i, z) == null) {
														if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
																z, i, x) == null) {
															if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																	z, i, x) == null) {
																if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_6BB(
																		i, x) == null) {
																	if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_8BB(
																			x, z) == null) {
																		if (pattern_whiledd2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																				x, z) == null) {
																			_result.add(new Object[] { i, x, z,
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
			whiledd2branchbb _this, Match match, Branch i, Branch x, Branch z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, x, z);
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
			for (Decision __DEC_c_positive_459638 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "positive")) {
				if (!c.equals(__DEC_c_positive_459638)) {
					if (!a.equals(__DEC_c_positive_459638)) {
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
			for (Decision __DEC_c_negative_384577 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "negative")) {
				if (!c.equals(__DEC_c_negative_384577)) {
					if (!a.equals(__DEC_c_negative_384577)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_2BB(Decision c, While w) {
		for (While __DEC_c_first_428038 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_428038)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_3BB(Decision c, While w) {
		for (While __DEC_c_last_136263 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_136263)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_350828 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Decision a,
			Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_positive_583421 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!a.equals(__DEC_a_positive_583421)) {
					if (!c.equals(__DEC_a_positive_583421)) {
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
			for (Decision __DEC_a_negative_804801 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_804801)) {
					if (!c.equals(__DEC_a_negative_804801)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_7BB(Decision a, While w) {
		for (While __DEC_a_last_265544 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_265544)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_50358 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (c.equals(w.getNext())) {
					Statement tmpA = w.getFirst();
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						if (!a.equals(c)) {
							if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_2BB(c, w) == null) {
								if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_3BB(c, w) == null) {
									if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_4B(c) == null) {
										if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_9BB(w,
												c) == null) {
											if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_10BB(w,
													c) == null) {
												if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_0BB(c,
														a) == null) {
													if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
															c, a) == null) {
														if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																a, c) == null) {
															if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																	a, c) == null) {
																if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_7BB(
																		a, w) == null) {
																	if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_8B(
																			a) == null) {
																		if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_11BB(
																				c, a) == null) {
																			if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_12BB(
																					c, a) == null) {
																				if (pattern_whiledd2branchbb_21_2_testcorematchandDECs_black_nac_13BB(
																						w, a) == null) {
																					_result.add(new Object[] { w, c, a,
																							_edge_next });
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			whiledd2branchbb _this, Match match, While w, Decision c, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, c, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = sourceMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("i");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								return new Object[] { w, c, i, a, x, z, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBB(While w, Decision c,
			Branch i, Decision a, Branch x, Branch z, Match sourceMatch, Match targetMatch) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!a.equals(c)) {
					if (!x.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { w, c, i, a, x, z, sourceMatch, targetMatch };
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
			While w = (While) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[0];
			Decision c = (Decision) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[1];
			Branch i = (Branch) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[2];
			Decision a = (Decision) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch z = (Branch) result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_black = pattern_whiledd2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBB(
					w, c, i, a, x, z, sourceMatch, targetMatch);
			if (result_pattern_whiledd2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, c, i, a, x, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_3_solvecsp_bindingFBBBBBBBBB(whiledd2branchbb _this,
			While w, Decision c, Branch i, Decision a, Branch x, Branch z, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(w, c, i, a, x, z, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, w, c, i, a, x, z, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whiledd2branchbb _this, While w, Decision c, Branch i, Decision a, Branch x, Branch z, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whiledd2branchbb_24_3_solvecsp_binding = pattern_whiledd2branchbb_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, w, c, i, a, x, z, sourceMatch, targetMatch);
		if (result_pattern_whiledd2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiledd2branchbb_24_3_solvecsp_black = pattern_whiledd2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, c, i, a, x, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledd2branchbb_24_5_matchcorrcontext_blackBBFBB(While w, Branch i,
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

	public static final Object[] pattern_whiledd2branchbb_24_6_createcorrespondence_blackBBBBBBB(While w, Decision c,
			Branch i, Decision a, Branch x, Branch z, CCMatch ccMatch) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!a.equals(c)) {
					if (!x.equals(z)) {
						return new Object[] { w, c, i, a, x, z, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_24_6_createcorrespondence_greenFBFBBBB(Decision c, Decision a,
			Branch x, Branch z, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { c2z, c, a2x, a, x, z, ccMatch };
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
			for (Decision __DEC_c_positive_907885 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "positive")) {
				if (!c.equals(__DEC_c_positive_907885)) {
					if (!a.equals(__DEC_c_positive_907885)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_1BB(Decision c, Decision a) {
		if (!a.equals(c)) {
			for (Decision __DEC_c_negative_920168 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(c, Decision.class, "negative")) {
				if (!c.equals(__DEC_c_negative_920168)) {
					if (!a.equals(__DEC_c_negative_920168)) {
						return new Object[] { c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_2BB(Decision c, While w) {
		for (While __DEC_c_first_742430 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_742430)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_3BB(Decision c, While w) {
		for (While __DEC_c_last_580468 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_580468)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_302460 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_5BB(Decision a, Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_positive_277665 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!a.equals(__DEC_a_positive_277665)) {
					if (!c.equals(__DEC_a_positive_277665)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_6BB(Decision a, Decision c) {
		if (!a.equals(c)) {
			for (Decision __DEC_a_negative_544651 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_544651)) {
					if (!c.equals(__DEC_a_negative_544651)) {
						return new Object[] { a, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_7BB(Decision a, While w) {
		for (While __DEC_a_last_793673 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_793673)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_209878 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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

	public static final Object[] pattern_whiledd2branchbb_27_1_matchtggpattern_blackBBB(While w, Decision c,
			Decision a) {
		if (!a.equals(c)) {
			if (c.equals(w.getNext())) {
				if (a.equals(w.getFirst())) {
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
																			return new Object[] { w, c, a };
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_289639 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_637375 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_637375)) {
							if (!i.equals(__DEC_x_positive_637375)) {
								if (!z.equals(__DEC_x_positive_637375)) {
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

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_718732 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_718732)) {
							if (!i.equals(__DEC_x_negative_718732)) {
								if (!z.equals(__DEC_x_negative_718732)) {
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

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_215249 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_326294 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_326294)) {
							if (!i.equals(__DEC_z_positive_326294)) {
								if (!x.equals(__DEC_z_positive_326294)) {
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

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_576595 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_576595)) {
							if (!i.equals(__DEC_z_negative_576595)) {
								if (!x.equals(__DEC_z_negative_576595)) {
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

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_6BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_7BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_8BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_28_1_matchtggpattern_blackBBB(Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_0B(x) == null) {
								if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_1BBB(x, i, z) == null) {
									if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_2BBB(x, i, z) == null) {
										if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_3B(z) == null) {
											if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_4BBB(z, i,
													x) == null) {
												if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_5BBB(z, i,
														x) == null) {
													if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_6BB(i,
															x) == null) {
														if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_7BB(
																i, z) == null) {
															if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_8BB(
																	x, z) == null) {
																if (pattern_whiledd2branchbb_28_1_matchtggpattern_black_nac_9BB(
																		x, z) == null) {
																	return new Object[] { i, x, z };
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
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
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						Branch i = w2i.getTarget();
						if (i != null) {
							if (pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whiledd2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whiledd2branchbb_29_3_solveCSP_bindingFBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, i, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiledd2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledd2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whiledd2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiledd2branchbb_29_3_solveCSP_binding = pattern_whiledd2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, ruleResult);
		if (result_pattern_whiledd2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledd2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiledd2branchbb_29_3_solveCSP_black = pattern_whiledd2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiledd2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledd2branchbb_29_4_checkCSP_expressionFBB(whiledd2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledd2branchbb_29_5_checknacs_blackBBB(While w, Branch i, S2B w2i) {
		return new Object[] { w, i, w2i };
	}

	public static final Object[] pattern_whiledd2branchbb_29_6_perform_blackBBBB(While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, i, w2i, ruleResult };
	}

	public static final Object[] pattern_whiledd2branchbb_29_6_perform_greenBFFBFFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(c2z);
		c2z.setSource(c);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.getCorrObjects().add(a2x);
		a2x.setSource(a);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		i.setNegative(z);
		c2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { w, c2z, c, i, a2x, a, x, z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiledd2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiledd2branchbbImpl
