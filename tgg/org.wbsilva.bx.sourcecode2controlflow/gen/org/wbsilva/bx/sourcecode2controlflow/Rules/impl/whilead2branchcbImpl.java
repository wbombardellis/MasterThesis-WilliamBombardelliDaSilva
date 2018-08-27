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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whilead2branchcb;

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
 * An implementation of the model object '<em><b>whilead2branchcb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whilead2branchcbImpl extends AbstractRuleImpl implements whilead2branchcb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whilead2branchcbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhilead2branchcb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, While w, Decision c) {

		Object[] result1_black = whilead2branchcbImpl.pattern_whilead2branchcb_0_1_initialbindings_blackBBBBB(this,
				match, a, w, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, a, w, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilead2branchcbImpl.pattern_whilead2branchcb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilead2branchcbImpl
					.pattern_whilead2branchcb_0_4_collectelementstobetranslated_blackBBBB(match, a, w, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whilead2branchcbImpl.pattern_whilead2branchcb_0_4_collectelementstobetranslated_greenBBBBFF(match, a, w, c);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whilead2branchcbImpl
					.pattern_whilead2branchcb_0_5_collectcontextelements_blackBBBB(match, a, w, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whilead2branchcbImpl.pattern_whilead2branchcb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilead2branchcbImpl.pattern_whilead2branchcb_0_6_registerobjectstomatch_expressionBBBBB(this, match, a, w,
					c);
			return whilead2branchcbImpl.pattern_whilead2branchcb_0_7_expressionF();
		} else {
			return whilead2branchcbImpl.pattern_whilead2branchcb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment a = (Assignment) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Decision c = (Decision) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whilead2branchcbImpl.pattern_whilead2branchcb_1_1_performtransformation_greenBFBBFFF(a,
				c, i);
		Command x = (Command) result1_green[1];
		S2B c2z = (S2B) result1_green[4];
		Branch z = (Branch) result1_green[5];
		S2N a2x = (S2N) result1_green[6];

		Object[] result2_black = whilead2branchcbImpl
				.pattern_whilead2branchcb_1_2_collecttranslatedelements_blackBBBBBB(a, x, c, c2z, z, a2x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[c] = "
							+ c + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilead2branchcbImpl
				.pattern_whilead2branchcb_1_2_collecttranslatedelements_greenFBBBBBB(a, x, c, c2z, z, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilead2branchcbImpl.pattern_whilead2branchcb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, a, w, x, c, i, c2z, z, a2x, w2i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[i] = " + i + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", "
					+ "[w2i] = " + w2i + ".");
		}
		whilead2branchcbImpl.pattern_whilead2branchcb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, a, w,
				x, c, i, c2z, z, a2x);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		whilead2branchcbImpl.pattern_whilead2branchcb_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, a, w,
				x, c, i, c2z, z, a2x, w2i);
		return whilead2branchcbImpl.pattern_whilead2branchcb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilead2branchcbImpl
				.pattern_whilead2branchcb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilead2branchcbImpl.pattern_whilead2branchcb_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		While w = (While) result2_binding[1];
		Decision c = (Decision) result2_binding[2];
		for (Object[] result2_black : whilead2branchcbImpl.pattern_whilead2branchcb_2_2_corematch_blackBBBFFB(a, w, c,
				match)) {
			Branch i = (Branch) result2_black[3];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilead2branchcbImpl.pattern_whilead2branchcb_2_3_findcontext_blackBBBBB(a, w,
					c, i, w2i)) {
				Object[] result3_green = whilead2branchcbImpl
						.pattern_whilead2branchcb_2_3_findcontext_greenBBBBBFFFFF(a, w, c, i, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whilead2branchcbImpl
						.pattern_whilead2branchcb_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, a, w, c,
								i, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[w] = " + w
							+ ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilead2branchcbImpl.pattern_whilead2branchcb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilead2branchcbImpl
							.pattern_whilead2branchcb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilead2branchcbImpl.pattern_whilead2branchcb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilead2branchcbImpl.pattern_whilead2branchcb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment a, While w, Decision c) {
		match.registerObject("a", a);
		match.registerObject("w", w);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, While w, Decision c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment a, While w, Decision c,
			Branch i, S2B w2i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i,
			EObject c2z, EObject z, EObject a2x, EObject w2i) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("z", z);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command x, Branch i, Branch z) {

		Object[] result1_black = whilead2branchcbImpl.pattern_whilead2branchcb_10_1_initialbindings_blackBBBBB(this,
				match, x, i, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, x, i, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilead2branchcbImpl.pattern_whilead2branchcb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilead2branchcbImpl
					.pattern_whilead2branchcb_10_4_collectelementstobetranslated_blackBBBB(match, x, i, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
			}
			whilead2branchcbImpl.pattern_whilead2branchcb_10_4_collectelementstobetranslated_greenBBBBFF(match, x, i,
					z);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whilead2branchcbImpl
					.pattern_whilead2branchcb_10_5_collectcontextelements_blackBBBB(match, x, i, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
			}
			whilead2branchcbImpl.pattern_whilead2branchcb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilead2branchcbImpl.pattern_whilead2branchcb_10_6_registerobjectstomatch_expressionBBBBB(this, match, x, i,
					z);
			return whilead2branchcbImpl.pattern_whilead2branchcb_10_7_expressionF();
		} else {
			return whilead2branchcbImpl.pattern_whilead2branchcb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Command x = (Command) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		Branch z = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whilead2branchcbImpl
				.pattern_whilead2branchcb_11_1_performtransformation_greenFBBFFBF(w, x, z);
		Assignment a = (Assignment) result1_green[0];
		Decision c = (Decision) result1_green[3];
		S2B c2z = (S2B) result1_green[4];
		S2N a2x = (S2N) result1_green[6];

		Object[] result2_black = whilead2branchcbImpl
				.pattern_whilead2branchcb_11_2_collecttranslatedelements_blackBBBBBB(a, x, c, c2z, z, a2x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[c] = "
							+ c + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilead2branchcbImpl
				.pattern_whilead2branchcb_11_2_collecttranslatedelements_greenFBBBBBB(a, x, c, c2z, z, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilead2branchcbImpl.pattern_whilead2branchcb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, a, w, x, c, i, c2z, z, a2x, w2i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[i] = " + i + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", "
					+ "[w2i] = " + w2i + ".");
		}
		whilead2branchcbImpl.pattern_whilead2branchcb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, a, w,
				x, c, i, c2z, z, a2x);
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		whilead2branchcbImpl.pattern_whilead2branchcb_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, a, w,
				x, c, i, c2z, z, a2x, w2i);
		return whilead2branchcbImpl.pattern_whilead2branchcb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilead2branchcbImpl
				.pattern_whilead2branchcb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilead2branchcbImpl.pattern_whilead2branchcb_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command x = (Command) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		for (Object[] result2_black : whilead2branchcbImpl.pattern_whilead2branchcb_12_2_corematch_blackFBBBFB(x, i, z,
				match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilead2branchcbImpl.pattern_whilead2branchcb_12_3_findcontext_blackBBBBB(w,
					x, i, z, w2i)) {
				Object[] result3_green = whilead2branchcbImpl
						.pattern_whilead2branchcb_12_3_findcontext_greenBBBBBFFFFF(w, x, i, z, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whilead2branchcbImpl
						.pattern_whilead2branchcb_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, w, x,
								i, z, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[x] = " + x
							+ ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilead2branchcbImpl.pattern_whilead2branchcb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilead2branchcbImpl
							.pattern_whilead2branchcb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilead2branchcbImpl.pattern_whilead2branchcb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilead2branchcbImpl.pattern_whilead2branchcb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command x, Branch i, Branch z) {
		match.registerObject("x", x);
		match.registerObject("i", i);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command x, Branch i, Branch z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Command x, Branch i, Branch z,
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
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i,
			EObject c2z, EObject z, EObject a2x, EObject w2i) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("z", z);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_17(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilead2branchcbImpl.pattern_whilead2branchcb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilead2branchcbImpl
				.pattern_whilead2branchcb_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Command x = (Command) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Object[] result2_green = whilead2branchcbImpl
					.pattern_whilead2branchcb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilead2branchcbImpl
					.pattern_whilead2branchcb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, x, i, z)) {
				// 
				if (whilead2branchcbImpl
						.pattern_whilead2branchcb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilead2branchcbImpl
							.pattern_whilead2branchcb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilead2branchcbImpl.pattern_whilead2branchcb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilead2branchcbImpl.pattern_whilead2branchcb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_17(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilead2branchcbImpl.pattern_whilead2branchcb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilead2branchcbImpl
				.pattern_whilead2branchcb_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			Assignment a = (Assignment) result2_black[0];
			While w = (While) result2_black[1];
			Decision c = (Decision) result2_black[2];
			Object[] result2_green = whilead2branchcbImpl
					.pattern_whilead2branchcb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilead2branchcbImpl
					.pattern_whilead2branchcb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, a, w, c)) {
				// 
				if (whilead2branchcbImpl
						.pattern_whilead2branchcb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilead2branchcbImpl
							.pattern_whilead2branchcb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilead2branchcbImpl.pattern_whilead2branchcb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilead2branchcbImpl.pattern_whilead2branchcb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whilead2branchcb");
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
		ruleResult.setRule("whilead2branchcb");
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

		Object[] result1_black = whilead2branchcbImpl.pattern_whilead2branchcb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilead2branchcbImpl.pattern_whilead2branchcb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment a = (Assignment) result2_bindingAndBlack[0];
		While w = (While) result2_bindingAndBlack[1];
		Command x = (Command) result2_bindingAndBlack[2];
		Decision c = (Decision) result2_bindingAndBlack[3];
		Branch i = (Branch) result2_bindingAndBlack[4];
		Branch z = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whilead2branchcbImpl
				.pattern_whilead2branchcb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, a, w, x, c, i, z, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[i] = "
					+ i + ", " + "[z] = " + z + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilead2branchcbImpl.pattern_whilead2branchcb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilead2branchcbImpl
					.pattern_whilead2branchcb_24_5_matchcorrcontext_blackBBFBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whilead2branchcbImpl
						.pattern_whilead2branchcb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilead2branchcbImpl
						.pattern_whilead2branchcb_24_6_createcorrespondence_blackBBBBBBB(a, w, x, c, i, z, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
							+ "[w] = " + w + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[i] = " + i + ", "
							+ "[z] = " + z + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilead2branchcbImpl.pattern_whilead2branchcb_24_6_createcorrespondence_greenBBBFBFB(a, x, c, z,
						ccMatch);
				//nothing S2B c2z = (S2B) result6_green[3];
				//nothing S2N a2x = (S2N) result6_green[5];

				Object[] result7_black = whilead2branchcbImpl
						.pattern_whilead2branchcb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilead2branchcbImpl.pattern_whilead2branchcb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whilead2branchcbImpl.pattern_whilead2branchcb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment a, While w, Command x, Decision c, Branch i, Branch z,
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
	public boolean checkDEC_FWD(Assignment a, While w, Decision c) {// 
		Object[] result1_black = whilead2branchcbImpl.pattern_whilead2branchcb_27_1_matchtggpattern_blackBBB(a, w, c);
		if (result1_black != null) {
			return whilead2branchcbImpl.pattern_whilead2branchcb_27_2_expressionF();
		} else {
			return whilead2branchcbImpl.pattern_whilead2branchcb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command x, Branch i, Branch z) {// 
		Object[] result1_black = whilead2branchcbImpl.pattern_whilead2branchcb_28_1_matchtggpattern_blackBBB(x, i, z);
		if (result1_black != null) {
			return whilead2branchcbImpl.pattern_whilead2branchcb_28_2_expressionF();
		} else {
			return whilead2branchcbImpl.pattern_whilead2branchcb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whilead2branchcbImpl.pattern_whilead2branchcb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilead2branchcbImpl.pattern_whilead2branchcb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whilead2branchcbImpl
				.pattern_whilead2branchcb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whilead2branchcbImpl
					.pattern_whilead2branchcb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilead2branchcbImpl.pattern_whilead2branchcb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilead2branchcbImpl.pattern_whilead2branchcb_29_5_checknacs_blackBBB(w, i,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whilead2branchcbImpl.pattern_whilead2branchcb_29_6_perform_blackBBBB(w, i,
							w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilead2branchcbImpl.pattern_whilead2branchcb_29_6_perform_greenFBFFBFFFB(w, i, ruleResult);
					//nothing Assignment a = (Assignment) result6_green[0];
					//nothing Command x = (Command) result6_green[2];
					//nothing Decision c = (Decision) result6_green[3];
					//nothing S2B c2z = (S2B) result6_green[5];
					//nothing Branch z = (Branch) result6_green[6];
					//nothing S2N a2x = (S2N) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return whilead2branchcbImpl.pattern_whilead2branchcb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.WHILEAD2BRANCHCB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3));
			return null;
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_DECISION_BRANCH_S2B:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEAD2BRANCHCB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEAD2BRANCHCB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_COMMAND_BRANCH_BRANCH_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEAD2BRANCHCB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_17((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_17((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_WHILE_COMMAND_DECISION_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEAD2BRANCHCB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEAD2BRANCHCB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.WHILEAD2BRANCHCB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEAD2BRANCHCB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEAD2BRANCHCB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEAD2BRANCHCB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilead2branchcb_0_1_initialbindings_blackBBBBB(whilead2branchcb _this,
			Match match, Assignment a, While w, Decision c) {
		return new Object[] { _this, match, a, w, c };
	}

	public static final Object[] pattern_whilead2branchcb_0_2_SolveCSP_bindingFBBBBB(whilead2branchcb _this,
			Match match, Assignment a, While w, Decision c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilead2branchcb_0_2_SolveCSP_bindingAndBlackFBBBBB(whilead2branchcb _this,
			Match match, Assignment a, While w, Decision c) {
		Object[] result_pattern_whilead2branchcb_0_2_SolveCSP_binding = pattern_whilead2branchcb_0_2_SolveCSP_bindingFBBBBB(
				_this, match, a, w, c);
		if (result_pattern_whilead2branchcb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilead2branchcb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilead2branchcb_0_2_SolveCSP_black = pattern_whilead2branchcb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilead2branchcb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, w, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whilead2branchcb_0_3_CheckCSP_expressionFBB(whilead2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Assignment a, While w, Decision c) {
		return new Object[] { match, a, w, c };
	}

	public static final Object[] pattern_whilead2branchcb_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Assignment a, While w, Decision c) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(c);
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
		return new Object[] { match, a, w, c, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whilead2branchcb_0_5_collectcontextelements_blackBBBB(Match match,
			Assignment a, While w, Decision c) {
		return new Object[] { match, a, w, c };
	}

	public static final Object[] pattern_whilead2branchcb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilead2branchcb_0_6_registerobjectstomatch_expressionBBBBB(whilead2branchcb _this,
			Match match, Assignment a, While w, Decision c) {
		_this.registerObjectsToMatch_FWD(match, a, w, c);

	}

	public static final boolean pattern_whilead2branchcb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilead2branchcb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof Decision) {
					Decision c = (Decision) tmpC;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							return new Object[] { a, w, c, i, w2i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_1_1_performtransformation_blackBBBBBFBB(Assignment a, While w,
			Decision c, Branch i, S2B w2i, whilead2branchcb _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { a, w, c, i, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			whilead2branchcb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilead2branchcb_1_1_performtransformation_binding = pattern_whilead2branchcb_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilead2branchcb_1_1_performtransformation_binding != null) {
			Assignment a = (Assignment) result_pattern_whilead2branchcb_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whilead2branchcb_1_1_performtransformation_binding[1];
			Decision c = (Decision) result_pattern_whilead2branchcb_1_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilead2branchcb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilead2branchcb_1_1_performtransformation_binding[4];

			Object[] result_pattern_whilead2branchcb_1_1_performtransformation_black = pattern_whilead2branchcb_1_1_performtransformation_blackBBBBBFBB(
					a, w, c, i, w2i, _this, isApplicableMatch);
			if (result_pattern_whilead2branchcb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilead2branchcb_1_1_performtransformation_black[5];

				return new Object[] { a, w, c, i, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_1_1_performtransformation_greenBFBBFFF(Assignment a,
			Decision c, Branch i) {
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		i.setPositive(x);
		c2z.setSource(c);
		c2z.setTarget(z);
		i.setNegative(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { a, x, c, i, c2z, z, a2x };
	}

	public static final Object[] pattern_whilead2branchcb_1_2_collecttranslatedelements_blackBBBBBB(Assignment a,
			Command x, Decision c, S2B c2z, Branch z, S2N a2x) {
		return new Object[] { a, x, c, c2z, z, a2x };
	}

	public static final Object[] pattern_whilead2branchcb_1_2_collecttranslatedelements_greenFBBBBBB(Assignment a,
			Command x, Decision c, S2B c2z, Branch z, S2N a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, a, x, c, c2z, z, a2x };
	}

	public static final Object[] pattern_whilead2branchcb_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i, EObject c2z, EObject z,
			EObject a2x, EObject w2i) {
		if (!a.equals(w)) {
			if (!a.equals(x)) {
				if (!a.equals(c)) {
					if (!a.equals(i)) {
						if (!a.equals(c2z)) {
							if (!a.equals(z)) {
								if (!a.equals(a2x)) {
									if (!a.equals(w2i)) {
										if (!w.equals(x)) {
											if (!w.equals(z)) {
												if (!w.equals(w2i)) {
													if (!x.equals(z)) {
														if (!c.equals(w)) {
															if (!c.equals(x)) {
																if (!c.equals(i)) {
																	if (!c.equals(c2z)) {
																		if (!c.equals(z)) {
																			if (!c.equals(w2i)) {
																				if (!i.equals(w)) {
																					if (!i.equals(x)) {
																						if (!i.equals(z)) {
																							if (!i.equals(w2i)) {
																								if (!c2z.equals(w)) {
																									if (!c2z.equals(
																											x)) {
																										if (!c2z.equals(
																												i)) {
																											if (!c2z.equals(
																													z)) {
																												if (!c2z.equals(
																														w2i)) {
																													if (!a2x.equals(
																															w)) {
																														if (!a2x.equals(
																																x)) {
																															if (!a2x.equals(
																																	c)) {
																																if (!a2x.equals(
																																		i)) {
																																	if (!a2x.equals(
																																			c2z)) {
																																		if (!a2x.equals(
																																				z)) {
																																			if (!a2x.equals(
																																					w2i)) {
																																				if (!w2i.equals(
																																						x)) {
																																					if (!w2i.equals(
																																							z)) {
																																						return new Object[] {
																																								ruleresult,
																																								a,
																																								w,
																																								x,
																																								c,
																																								i,
																																								c2z,
																																								z,
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

	public static final Object[] pattern_whilead2branchcb_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i, EObject c2z, EObject z,
			EObject a2x) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilead2branchcb";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, a, w, x, c, i, c2z, z, a2x, w__a____first, i__x____positive, w__c____next,
				c2z__c____source, c2z__z____target, a2x__x____target, a2x__a____source, i__z____negative };
	}

	public static final void pattern_whilead2branchcb_1_5_registerobjects_expressionBBBBBBBBBBB(whilead2branchcb _this,
			PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i, EObject c2z, EObject z,
			EObject a2x, EObject w2i) {
		_this.registerObjects_FWD(ruleresult, a, w, x, c, i, c2z, z, a2x, w2i);

	}

	public static final PerformRuleResult pattern_whilead2branchcb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_2_1_preparereturnvalue_bindingFB(whilead2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whilead2branchcb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whilead2branchcb _this) {
		Object[] result_pattern_whilead2branchcb_2_1_preparereturnvalue_binding = pattern_whilead2branchcb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilead2branchcb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilead2branchcb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilead2branchcb_2_1_preparereturnvalue_black = pattern_whilead2branchcb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilead2branchcb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilead2branchcb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilead2branchcb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilead2branchcb_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof Decision) {
					Decision c = (Decision) tmpC;
					return new Object[] { a, w, c, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_2_2_corematch_blackBBBFFB(Assignment a, While w,
			Decision c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
			Branch i = w2i.getTarget();
			if (i != null) {
				_result.add(new Object[] { a, w, c, i, w2i, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_2_3_findcontext_blackBBBBB(Assignment a, While w,
			Decision c, Branch i, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (a.equals(w.getFirst())) {
			if (c.equals(w.getNext())) {
				if (w.equals(w2i.getSource())) {
					if (i.equals(w2i.getTarget())) {
						_result.add(new Object[] { a, w, c, i, w2i });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_2_3_findcontext_greenBBBBBFFFFF(Assignment a, While w,
			Decision c, Branch i, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
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
		return new Object[] { a, w, c, i, w2i, isApplicableMatch, w__a____first, w__c____next, w2i__w____source,
				w2i__i____target };
	}

	public static final Object[] pattern_whilead2branchcb_2_4_solveCSP_bindingFBBBBBBB(whilead2branchcb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, While w, Decision c, Branch i, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, w, c, i, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, w, c, i, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilead2branchcb_2_4_solveCSP_bindingAndBlackFBBBBBBB(whilead2branchcb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, While w, Decision c, Branch i, S2B w2i) {
		Object[] result_pattern_whilead2branchcb_2_4_solveCSP_binding = pattern_whilead2branchcb_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, a, w, c, i, w2i);
		if (result_pattern_whilead2branchcb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilead2branchcb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilead2branchcb_2_4_solveCSP_black = pattern_whilead2branchcb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilead2branchcb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, w, c, i, w2i };
			}
		}
		return null;
	}

	public static final boolean pattern_whilead2branchcb_2_5_checkCSP_expressionFBB(whilead2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilead2branchcb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilead2branchcb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilead2branchcb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_10_1_initialbindings_blackBBBBB(whilead2branchcb _this,
			Match match, Command x, Branch i, Branch z) {
		if (!i.equals(z)) {
			return new Object[] { _this, match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_10_2_SolveCSP_bindingFBBBBB(whilead2branchcb _this,
			Match match, Command x, Branch i, Branch z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, i, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilead2branchcb_10_2_SolveCSP_bindingAndBlackFBBBBB(whilead2branchcb _this,
			Match match, Command x, Branch i, Branch z) {
		Object[] result_pattern_whilead2branchcb_10_2_SolveCSP_binding = pattern_whilead2branchcb_10_2_SolveCSP_bindingFBBBBB(
				_this, match, x, i, z);
		if (result_pattern_whilead2branchcb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilead2branchcb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilead2branchcb_10_2_SolveCSP_black = pattern_whilead2branchcb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilead2branchcb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, i, z };
			}
		}
		return null;
	}

	public static final boolean pattern_whilead2branchcb_10_3_CheckCSP_expressionFBB(whilead2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Command x, Branch i, Branch z) {
		if (!i.equals(z)) {
			return new Object[] { match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Command x, Branch i, Branch z) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, x, i, z, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whilead2branchcb_10_5_collectcontextelements_blackBBBB(Match match, Command x,
			Branch i, Branch z) {
		if (!i.equals(z)) {
			return new Object[] { match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilead2branchcb_10_6_registerobjectstomatch_expressionBBBBB(
			whilead2branchcb _this, Match match, Command x, Branch i, Branch z) {
		_this.registerObjectsToMatch_BWD(match, x, i, z);

	}

	public static final boolean pattern_whilead2branchcb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilead2branchcb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject tmpW = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							return new Object[] { w, x, i, z, w2i, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_11_1_performtransformation_blackBBBBBFBB(While w, Command x,
			Branch i, Branch z, S2B w2i, whilead2branchcb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w, x, i, z, w2i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			whilead2branchcb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilead2branchcb_11_1_performtransformation_binding = pattern_whilead2branchcb_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilead2branchcb_11_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whilead2branchcb_11_1_performtransformation_binding[0];
			Command x = (Command) result_pattern_whilead2branchcb_11_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whilead2branchcb_11_1_performtransformation_binding[2];
			Branch z = (Branch) result_pattern_whilead2branchcb_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilead2branchcb_11_1_performtransformation_binding[4];

			Object[] result_pattern_whilead2branchcb_11_1_performtransformation_black = pattern_whilead2branchcb_11_1_performtransformation_blackBBBBBFBB(
					w, x, i, z, w2i, _this, isApplicableMatch);
			if (result_pattern_whilead2branchcb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilead2branchcb_11_1_performtransformation_black[5];

				return new Object[] { w, x, i, z, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_11_1_performtransformation_greenFBBFFBF(While w, Command x,
			Branch z) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		w.setFirst(a);
		w.setNext(c);
		c2z.setSource(c);
		c2z.setTarget(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { a, w, x, c, c2z, z, a2x };
	}

	public static final Object[] pattern_whilead2branchcb_11_2_collecttranslatedelements_blackBBBBBB(Assignment a,
			Command x, Decision c, S2B c2z, Branch z, S2N a2x) {
		return new Object[] { a, x, c, c2z, z, a2x };
	}

	public static final Object[] pattern_whilead2branchcb_11_2_collecttranslatedelements_greenFBBBBBB(Assignment a,
			Command x, Decision c, S2B c2z, Branch z, S2N a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, a, x, c, c2z, z, a2x };
	}

	public static final Object[] pattern_whilead2branchcb_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i, EObject c2z, EObject z,
			EObject a2x, EObject w2i) {
		if (!a.equals(w)) {
			if (!a.equals(x)) {
				if (!a.equals(c)) {
					if (!a.equals(i)) {
						if (!a.equals(c2z)) {
							if (!a.equals(z)) {
								if (!a.equals(a2x)) {
									if (!a.equals(w2i)) {
										if (!w.equals(x)) {
											if (!w.equals(z)) {
												if (!w.equals(w2i)) {
													if (!x.equals(z)) {
														if (!c.equals(w)) {
															if (!c.equals(x)) {
																if (!c.equals(i)) {
																	if (!c.equals(c2z)) {
																		if (!c.equals(z)) {
																			if (!c.equals(w2i)) {
																				if (!i.equals(w)) {
																					if (!i.equals(x)) {
																						if (!i.equals(z)) {
																							if (!i.equals(w2i)) {
																								if (!c2z.equals(w)) {
																									if (!c2z.equals(
																											x)) {
																										if (!c2z.equals(
																												i)) {
																											if (!c2z.equals(
																													z)) {
																												if (!c2z.equals(
																														w2i)) {
																													if (!a2x.equals(
																															w)) {
																														if (!a2x.equals(
																																x)) {
																															if (!a2x.equals(
																																	c)) {
																																if (!a2x.equals(
																																		i)) {
																																	if (!a2x.equals(
																																			c2z)) {
																																		if (!a2x.equals(
																																				z)) {
																																			if (!a2x.equals(
																																					w2i)) {
																																				if (!w2i.equals(
																																						x)) {
																																					if (!w2i.equals(
																																							z)) {
																																						return new Object[] {
																																								ruleresult,
																																								a,
																																								w,
																																								x,
																																								c,
																																								i,
																																								c2z,
																																								z,
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

	public static final Object[] pattern_whilead2branchcb_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i, EObject c2z, EObject z,
			EObject a2x) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilead2branchcb";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, a, w, x, c, i, c2z, z, a2x, w__a____first, i__x____positive, w__c____next,
				c2z__c____source, c2z__z____target, a2x__x____target, a2x__a____source, i__z____negative };
	}

	public static final void pattern_whilead2branchcb_11_5_registerobjects_expressionBBBBBBBBBBB(whilead2branchcb _this,
			PerformRuleResult ruleresult, EObject a, EObject w, EObject x, EObject c, EObject i, EObject c2z, EObject z,
			EObject a2x, EObject w2i) {
		_this.registerObjects_BWD(ruleresult, a, w, x, c, i, c2z, z, a2x, w2i);

	}

	public static final PerformRuleResult pattern_whilead2branchcb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_12_1_preparereturnvalue_bindingFB(whilead2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whilead2branchcb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whilead2branchcb _this) {
		Object[] result_pattern_whilead2branchcb_12_1_preparereturnvalue_binding = pattern_whilead2branchcb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilead2branchcb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilead2branchcb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilead2branchcb_12_1_preparereturnvalue_black = pattern_whilead2branchcb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilead2branchcb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilead2branchcb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilead2branchcb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilead2branchcb_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("z");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					return new Object[] { x, i, z, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_12_2_corematch_blackFBBBFB(Command x, Branch i,
			Branch z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { w, x, i, z, w2i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_12_3_findcontext_blackBBBBB(While w, Command x,
			Branch i, Branch z, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (x.equals(i.getPositive())) {
				if (w.equals(w2i.getSource())) {
					if (z.equals(i.getNegative())) {
						if (i.equals(w2i.getTarget())) {
							_result.add(new Object[] { w, x, i, z, w2i });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_12_3_findcontext_greenBBBBBFFFFF(While w, Command x, Branch i,
			Branch z, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w, x, i, z, w2i, isApplicableMatch, i__x____positive, w2i__w____source, i__z____negative,
				w2i__i____target };
	}

	public static final Object[] pattern_whilead2branchcb_12_4_solveCSP_bindingFBBBBBBB(whilead2branchcb _this,
			IsApplicableMatch isApplicableMatch, While w, Command x, Branch i, Branch z, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, x, i, z, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, x, i, z, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilead2branchcb_12_4_solveCSP_bindingAndBlackFBBBBBBB(whilead2branchcb _this,
			IsApplicableMatch isApplicableMatch, While w, Command x, Branch i, Branch z, S2B w2i) {
		Object[] result_pattern_whilead2branchcb_12_4_solveCSP_binding = pattern_whilead2branchcb_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, w, x, i, z, w2i);
		if (result_pattern_whilead2branchcb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilead2branchcb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilead2branchcb_12_4_solveCSP_black = pattern_whilead2branchcb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilead2branchcb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, x, i, z, w2i };
			}
		}
		return null;
	}

	public static final boolean pattern_whilead2branchcb_12_5_checkCSP_expressionFBB(whilead2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilead2branchcb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilead2branchcb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilead2branchcb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_20_1_preparereturnvalue_bindingFB(whilead2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilead2branchcb _this) {
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

	public static final Object[] pattern_whilead2branchcb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whilead2branchcb _this) {
		Object[] result_pattern_whilead2branchcb_20_1_preparereturnvalue_binding = pattern_whilead2branchcb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilead2branchcb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilead2branchcb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilead2branchcb_20_1_preparereturnvalue_black = pattern_whilead2branchcb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilead2branchcb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilead2branchcb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilead2branchcb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_939595 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_1BBB(Command x, Branch i,
			Branch z) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_193310 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_x_positive_193310)) {
					if (!z.equals(__DEC_x_positive_193310)) {
						return new Object[] { x, i, z };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_2BBB(Command x, Branch i,
			Branch z) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_negative_63553 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_x_negative_63553)) {
					if (!z.equals(__DEC_x_negative_63553)) {
						return new Object[] { x, i, z };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_659960 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_4BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_750901 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_750901)) {
					if (!i.equals(__DEC_z_positive_750901)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_5BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_150178 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_150178)) {
					if (!i.equals(__DEC_z_negative_150178)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_6BB(Branch z, Command x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_7BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_8BB(Branch z, Command x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_9BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_positive.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (x.equals(i.getPositive())) {
					Node tmpZ = i.getNegative();
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (!i.equals(z)) {
							if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
								if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_7BB(i, x) == null) {
									if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_1BBB(x, i,
											z) == null) {
										if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_2BBB(x, i,
												z) == null) {
											if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_3B(
													z) == null) {
												if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_4BB(z,
														i) == null) {
													if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_5BB(
															z, i) == null) {
														if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_6BB(
																z, x) == null) {
															if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_8BB(
																	z, x) == null) {
																if (pattern_whilead2branchcb_20_2_testcorematchandDECs_black_nac_9BB(
																		i, z) == null) {
																	_result.add(
																			new Object[] { x, i, z, _edge_positive });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilead2branchcb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilead2branchcb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whilead2branchcb _this, Match match, Command x, Branch i, Branch z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, i, z);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilead2branchcb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilead2branchcb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilead2branchcb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_21_1_preparereturnvalue_bindingFB(whilead2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilead2branchcb _this) {
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

	public static final Object[] pattern_whilead2branchcb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whilead2branchcb _this) {
		Object[] result_pattern_whilead2branchcb_21_1_preparereturnvalue_binding = pattern_whilead2branchcb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilead2branchcb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilead2branchcb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilead2branchcb_21_1_preparereturnvalue_black = pattern_whilead2branchcb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilead2branchcb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilead2branchcb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilead2branchcb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_0BB(Assignment a,
			Decision c) {
		for (Decision __DEC_a_positive_131631 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_131631)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_1BB(Assignment a,
			Decision c) {
		for (Decision __DEC_a_negative_986841 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_986841)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_2BB(Assignment a,
			While w) {
		for (While __DEC_a_last_911282 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_911282)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_773469 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_4B(Decision c) {
		for (Decision __DEC_c_positive_52929 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_52929)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_5B(Decision c) {
		for (Decision __DEC_c_negative_177791 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_177791)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_6BB(Decision c, While w) {
		for (While __DEC_c_first_487427 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_487427)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_7BB(Decision c, While w) {
		for (While __DEC_c_last_897427 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_897427)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_8B(Decision c) {
		for (Program __DEC_c_first_135535 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_9BB(Decision c,
			Assignment a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_10BB(Decision c,
			Assignment a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_11BB(While w,
			Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_12BB(While w,
			Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (a.equals(w.getFirst())) {
					Statement tmpC = w.getNext();
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_2BB(a, w) == null) {
							if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
								if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_11BB(w, a) == null) {
									if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_0BB(a,
											c) == null) {
										if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_1BB(a,
												c) == null) {
											if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_4B(
													c) == null) {
												if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_5B(
														c) == null) {
													if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_6BB(
															c, w) == null) {
														if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_7BB(
																c, w) == null) {
															if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_8B(
																	c) == null) {
																if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_9BB(
																		c, a) == null) {
																	if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_10BB(
																			c, a) == null) {
																		if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_12BB(
																				w, c) == null) {
																			if (pattern_whilead2branchcb_21_2_testcorematchandDECs_black_nac_13BB(
																					w, c) == null) {
																				_result.add(new Object[] { a, w, c,
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

	public static final Object[] pattern_whilead2branchcb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilead2branchcb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whilead2branchcb _this, Match match, Assignment a, While w, Decision c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, w, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilead2branchcb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilead2branchcb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilead2branchcb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_24_1_prepare_blackB(whilead2branchcb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilead2branchcb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whilead2branchcb_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = sourceMatch.getObject("w");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = targetMatch.getObject("i");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpX instanceof Command) {
					Command x = (Command) tmpX;
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								return new Object[] { a, w, x, c, i, z, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_24_2_matchsrctrgcontext_blackBBBBBBBB(Assignment a, While w,
			Command x, Decision c, Branch i, Branch z, Match sourceMatch, Match targetMatch) {
		if (!i.equals(z)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { a, w, x, c, i, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding = pattern_whilead2branchcb_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding != null) {
			Assignment a = (Assignment) result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding[0];
			While w = (While) result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding[1];
			Command x = (Command) result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding[2];
			Decision c = (Decision) result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding[3];
			Branch i = (Branch) result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding[4];
			Branch z = (Branch) result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_black = pattern_whilead2branchcb_24_2_matchsrctrgcontext_blackBBBBBBBB(
					a, w, x, c, i, z, sourceMatch, targetMatch);
			if (result_pattern_whilead2branchcb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, w, x, c, i, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_24_3_solvecsp_bindingFBBBBBBBBB(whilead2branchcb _this,
			Assignment a, While w, Command x, Decision c, Branch i, Branch z, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(a, w, x, c, i, z, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, a, w, x, c, i, z, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilead2branchcb_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whilead2branchcb _this, Assignment a, While w, Command x, Decision c, Branch i, Branch z, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whilead2branchcb_24_3_solvecsp_binding = pattern_whilead2branchcb_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, a, w, x, c, i, z, sourceMatch, targetMatch);
		if (result_pattern_whilead2branchcb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilead2branchcb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilead2branchcb_24_3_solvecsp_black = pattern_whilead2branchcb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilead2branchcb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, w, x, c, i, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilead2branchcb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_24_5_matchcorrcontext_blackBBFBB(While w, Branch i,
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

	public static final Object[] pattern_whilead2branchcb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whilead2branchcb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whilead2branchcb_24_6_createcorrespondence_blackBBBBBBB(Assignment a, While w,
			Command x, Decision c, Branch i, Branch z, CCMatch ccMatch) {
		if (!i.equals(z)) {
			return new Object[] { a, w, x, c, i, z, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_24_6_createcorrespondence_greenBBBFBFB(Assignment a,
			Command x, Decision c, Branch z, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { a, x, c, c2z, z, a2x, ccMatch };
	}

	public static final Object[] pattern_whilead2branchcb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whilead2branchcb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whilead2branchcb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whilead2branchcb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_0BB(Assignment a, Decision c) {
		for (Decision __DEC_a_positive_369946 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_369946)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_1BB(Assignment a, Decision c) {
		for (Decision __DEC_a_negative_185174 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_185174)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_2BB(Assignment a, While w) {
		for (While __DEC_a_last_836078 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_836078)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_354232 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_4B(Decision c) {
		for (Decision __DEC_c_positive_648940 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_648940)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_5B(Decision c) {
		for (Decision __DEC_c_negative_351762 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_351762)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_6BB(Decision c, While w) {
		for (While __DEC_c_first_835121 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_835121)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_7BB(Decision c, While w) {
		for (While __DEC_c_last_283495 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_283495)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_8B(Decision c) {
		for (Program __DEC_c_first_543032 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_9BB(Decision c, Assignment a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_10BB(Decision c,
			Assignment a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_11BB(While w, Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_12BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_13BB(While w, Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_27_1_matchtggpattern_blackBBB(Assignment a, While w,
			Decision c) {
		if (a.equals(w.getFirst())) {
			if (c.equals(w.getNext())) {
				if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_0BB(a, c) == null) {
					if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_1BB(a, c) == null) {
						if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
							if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_3B(a) == null) {
								if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_4B(c) == null) {
									if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_5B(c) == null) {
										if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_6BB(c, w) == null) {
											if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_7BB(c,
													w) == null) {
												if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_8B(
														c) == null) {
													if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_9BB(c,
															a) == null) {
														if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_10BB(
																c, a) == null) {
															if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_11BB(
																	w, a) == null) {
																if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_12BB(
																		w, c) == null) {
																	if (pattern_whilead2branchcb_27_1_matchtggpattern_black_nac_13BB(
																			w, c) == null) {
																		return new Object[] { a, w, c };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whilead2branchcb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilead2branchcb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_149874 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_1BBB(Command x, Branch i,
			Branch z) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_772608 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_x_positive_772608)) {
					if (!z.equals(__DEC_x_positive_772608)) {
						return new Object[] { x, i, z };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_2BBB(Command x, Branch i,
			Branch z) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_negative_967959 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_x_negative_967959)) {
					if (!z.equals(__DEC_x_negative_967959)) {
						return new Object[] { x, i, z };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_780430 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_4BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_444675 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_444675)) {
					if (!i.equals(__DEC_z_positive_444675)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_5BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_201788 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_201788)) {
					if (!i.equals(__DEC_z_negative_201788)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_6BB(Branch z, Command x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_7BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_8BB(Branch z, Command x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_9BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_28_1_matchtggpattern_blackBBB(Command x, Branch i, Branch z) {
		if (!i.equals(z)) {
			if (x.equals(i.getPositive())) {
				if (z.equals(i.getNegative())) {
					if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_0B(x) == null) {
						if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_1BBB(x, i, z) == null) {
							if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_2BBB(x, i, z) == null) {
								if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_3B(z) == null) {
									if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_4BB(z, i) == null) {
										if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_5BB(z, i) == null) {
											if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_6BB(z,
													x) == null) {
												if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_7BB(i,
														x) == null) {
													if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_8BB(z,
															x) == null) {
														if (pattern_whilead2branchcb_28_1_matchtggpattern_black_nac_9BB(
																i, z) == null) {
															return new Object[] { x, i, z };
														}
													}
												}
											}
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

	public static final boolean pattern_whilead2branchcb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilead2branchcb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_29_1_createresult_blackB(whilead2branchcb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilead2branchcb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whilead2branchcb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilead2branchcb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whilead2branchcb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whilead2branchcb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whilead2branchcb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whilead2branchcb_29_3_solveCSP_bindingFBBBBBB(whilead2branchcb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, i, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilead2branchcb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilead2branchcb_29_3_solveCSP_bindingAndBlackFBBBBBB(whilead2branchcb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilead2branchcb_29_3_solveCSP_binding = pattern_whilead2branchcb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, ruleResult);
		if (result_pattern_whilead2branchcb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilead2branchcb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilead2branchcb_29_3_solveCSP_black = pattern_whilead2branchcb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilead2branchcb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilead2branchcb_29_4_checkCSP_expressionFBB(whilead2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilead2branchcb_29_5_checknacs_blackBBB(While w, Branch i, S2B w2i) {
		return new Object[] { w, i, w2i };
	}

	public static final Object[] pattern_whilead2branchcb_29_6_perform_blackBBBB(While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, i, w2i, ruleResult };
	}

	public static final Object[] pattern_whilead2branchcb_29_6_perform_greenFBFFBFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		c2z.setTarget(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, w, x, c, i, c2z, z, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilead2branchcb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilead2branchcbImpl
