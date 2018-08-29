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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decll2branchbb;

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
 * An implementation of the model object '<em><b>decll2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decll2branchbbImpl extends AbstractRuleImpl implements decll2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decll2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecll2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, Assignment m, While b, Decision d, While a) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(this, match,
				l, m, b, d, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, l, m, b, d, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, l, m, b, d, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[m] = " + m + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, l, m, b,
					d, a);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(match, l, m, b, d, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[m] = " + m + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, l, m, b,
					d, a);
			return decll2branchbbImpl.pattern_decll2branchbb_0_7_expressionF();
		} else {
			return decll2branchbbImpl.pattern_decll2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		Assignment m = (Assignment) result1_bindingAndBlack[1];
		While b = (While) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		While a = (While) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_1_performtransformation_greenBBFFBFBFFFFFB(l, m, b, a, c);
		Command z = (Command) result1_green[2];
		S2N l2z = (S2N) result1_green[3];
		S2N m2w = (S2N) result1_green[5];
		Command w = (Command) result1_green[7];
		S2B b2y = (S2B) result1_green[8];
		S2B a2x = (S2B) result1_green[9];
		Branch y = (Branch) result1_green[10];
		Branch x = (Branch) result1_green[11];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(l, m, z, l2z, b, m2w, a, w, b2y,
						a2x, y, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[m] = " + m
					+ ", " + "[z] = " + z + ", " + "[l2z] = " + l2z + ", " + "[b] = " + b + ", " + "[m2w] = " + m2w
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x
					+ ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l, m, z, l2z, b, m2w, a, w,
						b2y, a2x, y, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l, m, z, l2z, b, d2c,
						m2w, d, a, w, b2y, a2x, y, x, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[z] = " + z + ", " + "[l2z] = " + l2z + ", "
					+ "[b] = " + b + ", " + "[d2c] = " + d2c + ", " + "[m2w] = " + m2w + ", " + "[d] = " + d + ", "
					+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, l, m, z, l2z, b, m2w, d, a, w, b2y, a2x, y, x, c);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, l,
				m, z, l2z, b, d2c, m2w, d, a, w, b2y, a2x, y, x, c);
		return decll2branchbbImpl.pattern_decll2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decll2branchbbImpl.pattern_decll2branchbb_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		Assignment m = (Assignment) result2_binding[1];
		While b = (While) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_2_2_corematch_blackBBBFBBFB(l, m, b, d,
				a, match)) {
			S2B d2c = (S2B) result2_black[3];
			Branch c = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(l, m,
					b, d2c, d, a, c)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(l, m, b, d2c, d, a, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, l, m, b,
								d2c, d, a, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[m] = " + m
							+ ", " + "[b] = " + b + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[a] = " + a
							+ ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decll2branchbbImpl.pattern_decll2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decll2branchbbImpl
							.pattern_decll2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decll2branchbbImpl.pattern_decll2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, Assignment m, While b, Decision d, While a) {
		match.registerObject("l", l);
		match.registerObject("m", m);
		match.registerObject("b", b);
		match.registerObject("d", d);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, Assignment m, While b, Decision d, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, Assignment m, While b,
			S2B d2c, Decision d, While a, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z,
			EObject b, EObject d2c, EObject m2w, EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y,
			EObject x, EObject c) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Command w, Branch y, Branch x, Branch c) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, z, w, y, x, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, w, y, x, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, z, w, y, x, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, z, w, y,
					x, c);
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(match, z, w, y, x, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, z, w,
					y, x, c);
			return decll2branchbbImpl.pattern_decll2branchbb_10_7_expressionF();
		} else {
			return decll2branchbbImpl.pattern_decll2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command z = (Command) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Command w = (Command) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_1_performtransformation_greenFFBFFFBFBFFBB(z, d, w, y, x);
		Assignment l = (Assignment) result1_green[0];
		Assignment m = (Assignment) result1_green[1];
		S2N l2z = (S2N) result1_green[3];
		While b = (While) result1_green[4];
		S2N m2w = (S2N) result1_green[5];
		While a = (While) result1_green[7];
		S2B b2y = (S2B) result1_green[9];
		S2B a2x = (S2B) result1_green[10];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(l, m, z, l2z, b, m2w, a, w,
						b2y, a2x, y, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[m] = " + m
					+ ", " + "[z] = " + z + ", " + "[l2z] = " + l2z + ", " + "[b] = " + b + ", " + "[m2w] = " + m2w
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x
					+ ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l, m, z, l2z, b, m2w, a, w,
						b2y, a2x, y, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l, m, z, l2z, b, d2c,
						m2w, d, a, w, b2y, a2x, y, x, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[z] = " + z + ", " + "[l2z] = " + l2z + ", "
					+ "[b] = " + b + ", " + "[d2c] = " + d2c + ", " + "[m2w] = " + m2w + ", " + "[d] = " + d + ", "
					+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, l, m, z, l2z, b, m2w, d, a, w, b2y, a2x, y, x, c);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, l,
				m, z, l2z, b, d2c, m2w, d, a, w, b2y, a2x, y, x, c);
		return decll2branchbbImpl.pattern_decll2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decll2branchbbImpl.pattern_decll2branchbb_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command z = (Command) result2_binding[0];
		Command w = (Command) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch c = (Branch) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_12_2_corematch_blackBFFBBBBB(z, w, y, x,
				c, match)) {
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(z,
					d2c, d, w, y, x, c)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(z, d2c, d, w, y, x, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z, d2c,
								d, w, y, x, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[d2c] = "
							+ d2c + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = "
							+ x + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decll2branchbbImpl.pattern_decll2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decll2branchbbImpl
							.pattern_decll2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decll2branchbbImpl.pattern_decll2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command z, Command w, Branch y, Branch x, Branch c) {
		match.registerObject("z", z);
		match.registerObject("w", w);
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Command w, Branch y, Branch x, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, S2B d2c, Decision d, Command w,
			Branch y, Branch x, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z,
			EObject b, EObject d2c, EObject m2w, EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y,
			EObject x, EObject c) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_88(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decll2branchbbImpl.pattern_decll2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decll2branchbbImpl
				.pattern_decll2branchbb_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Command z = (Command) result2_black[0];
			Command w = (Command) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch c = (Branch) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, w, y, x, c)) {
				// 
				if (decll2branchbbImpl
						.pattern_decll2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decll2branchbbImpl
							.pattern_decll2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decll2branchbbImpl.pattern_decll2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_88(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decll2branchbbImpl.pattern_decll2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decll2branchbbImpl
				.pattern_decll2branchbb_21_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Assignment l = (Assignment) result2_black[0];
			Assignment m = (Assignment) result2_black[1];
			While b = (While) result2_black[2];
			Decision d = (Decision) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, l, m, b, d, a)) {
				// 
				if (decll2branchbbImpl
						.pattern_decll2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decll2branchbbImpl
							.pattern_decll2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decll2branchbbImpl.pattern_decll2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decll2branchbb");
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
		ruleResult.setRule("decll2branchbb");
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

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decll2branchbbImpl.pattern_decll2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		Assignment m = (Assignment) result2_bindingAndBlack[1];
		Command z = (Command) result2_bindingAndBlack[2];
		While b = (While) result2_bindingAndBlack[3];
		Decision d = (Decision) result2_bindingAndBlack[4];
		While a = (While) result2_bindingAndBlack[5];
		Command w = (Command) result2_bindingAndBlack[6];
		Branch y = (Branch) result2_bindingAndBlack[7];
		Branch x = (Branch) result2_bindingAndBlack[8];
		Branch c = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, l, m, z, b, d, a, w, y, x, c,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[m] = " + m + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[d] = "
					+ d + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[c] = " + c + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_blackFBBBB(d,
					c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decll2branchbbImpl
						.pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(l, m, z, b, d, a, w, y, x, c,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[m] = " + m + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
							+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
							+ "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decll2branchbbImpl.pattern_decll2branchbb_24_6_createcorrespondence_greenBBBFBFBBFFBBB(l, m, z, b, a, w,
						y, x, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[3];
				//nothing S2N m2w = (S2N) result6_green[5];
				//nothing S2B b2y = (S2B) result6_green[8];
				//nothing S2B a2x = (S2B) result6_green[9];

				Object[] result7_black = decll2branchbbImpl
						.pattern_decll2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decll2branchbbImpl.pattern_decll2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decll2branchbbImpl.pattern_decll2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment l, Assignment m, Command z, While b, Decision d, While a, Command w,
			Branch y, Branch x, Branch c, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, Assignment m, While b, Decision d, While a) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(l, m, b, d,
				a);
		if (result1_black != null) {
			return decll2branchbbImpl.pattern_decll2branchbb_27_2_expressionF();
		} else {
			return decll2branchbbImpl.pattern_decll2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command z, Command w, Branch y, Branch x, Branch c) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(z, w, y, x,
				c);
		if (result1_black != null) {
			return decll2branchbbImpl.pattern_decll2branchbb_28_2_expressionF();
		} else {
			return decll2branchbbImpl.pattern_decll2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decll2branchbbImpl.pattern_decll2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decll2branchbbImpl
				.pattern_decll2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decll2branchbbImpl
					.pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, d, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decll2branchbbImpl.pattern_decll2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decll2branchbbImpl.pattern_decll2branchbb_29_5_checknacs_blackBBB(d2c, d, c);
				if (result5_black != null) {

					Object[] result6_black = decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_blackBBBB(d2c, d, c,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_greenFFFFFFBFFFFFFBB(d, c, ruleResult);
					//nothing Assignment l = (Assignment) result6_green[0];
					//nothing Assignment m = (Assignment) result6_green[1];
					//nothing Command z = (Command) result6_green[2];
					//nothing S2N l2z = (S2N) result6_green[3];
					//nothing While b = (While) result6_green[4];
					//nothing S2N m2w = (S2N) result6_green[5];
					//nothing While a = (While) result6_green[7];
					//nothing Command w = (Command) result6_green[8];
					//nothing S2B b2y = (S2B) result6_green[9];
					//nothing S2B a2x = (S2B) result6_green[10];
					//nothing Branch y = (Branch) result6_green[11];
					//nothing Branch x = (Branch) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return decll2branchbbImpl.pattern_decll2branchbb_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_ASSIGNMENT_WHILE_S2B_DECISION_WHILE_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
					(Decision) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECLL2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_S2B_DECISION_COMMAND_BRANCH_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECLL2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_88((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_88((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_ASSIGNMENT_COMMAND_WHILE_DECISION_WHILE_COMMAND_BRANCH_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Assignment) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7),
					(Branch) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_FWD__ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_BWD__COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_DECISION_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(decll2branchbb _this,
			Match match, Assignment l, Assignment m, While b, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, l, m, b, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			Assignment l, Assignment m, While b, Decision d, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, m, b, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, m, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, Assignment l, Assignment m, While b, Decision d, While a) {
		Object[] result_pattern_decll2branchbb_0_2_SolveCSP_binding = pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, l, m, b, d, a);
		if (result_pattern_decll2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_0_2_SolveCSP_black = pattern_decll2branchbb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, m, b, d, a };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_0_3_CheckCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Assignment l, Assignment m, While b, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, m, b, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Assignment l, Assignment m, While b, Decision d, While a) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		return new Object[] { match, l, m, b, d, a, d__a____positive, a__l____last, d__b____negative, b__m____last };
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment l, Assignment m, While b, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, m, b, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(decll2branchbb _this,
			Match match, Assignment l, Assignment m, While b, Decision d, While a) {
		_this.registerObjectsToMatch_FWD(match, l, m, b, d, a);

	}

	public static final boolean pattern_decll2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decll2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("l");
		EObject _localVariable_1 = isApplicableMatch.getObject("m");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpM = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpA = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { l, m, b, d2c, d, a, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(Assignment l,
			Assignment m, While b, S2B d2c, Decision d, While a, Branch c, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { l, m, b, d2c, d, a, c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			decll2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decll2branchbb_1_1_performtransformation_binding = pattern_decll2branchbb_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decll2branchbb_1_1_performtransformation_binding != null) {
			Assignment l = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[0];
			Assignment m = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[1];
			While b = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decll2branchbb_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decll2branchbb_1_1_performtransformation_binding[4];
			While a = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_decll2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_1_1_performtransformation_black = pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					l, m, b, d2c, d, a, c, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_1_1_performtransformation_black[7];

				return new Object[] { l, m, b, d2c, d, a, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_greenBBFFBFBFFFFFB(Assignment l,
			Assignment m, While b, While a, Branch c) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		l2z.setSource(l);
		l2z.setTarget(z);
		m2w.setSource(m);
		m2w.setTarget(w);
		b2y.setSource(b);
		a2x.setSource(a);
		w.setNext(y);
		b2y.setTarget(y);
		c.setNegative(y);
		z.setNext(x);
		a2x.setTarget(x);
		c.setPositive(x);
		return new Object[] { l, m, z, l2z, b, m2w, a, w, b2y, a2x, y, x, c };
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Assignment l,
			Assignment m, Command z, S2N l2z, While b, S2N m2w, While a, Command w, S2B b2y, S2B a2x, Branch y,
			Branch x) {
		if (!l.equals(m)) {
			if (!l2z.equals(m2w)) {
				if (!a.equals(b)) {
					if (!w.equals(z)) {
						if (!a2x.equals(b2y)) {
							if (!x.equals(y)) {
								return new Object[] { l, m, z, l2z, b, m2w, a, w, b2y, a2x, y, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Assignment l,
			Assignment m, Command z, S2N l2z, While b, S2N m2w, While a, Command w, S2B b2y, S2B a2x, Branch y,
			Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, l, m, z, l2z, b, m2w, a, w, b2y, a2x, y, x };
	}

	public static final Object[] pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z, EObject b, EObject d2c,
			EObject m2w, EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y, EObject x, EObject c) {
		if (!l.equals(m)) {
			if (!l.equals(z)) {
				if (!l.equals(l2z)) {
					if (!l.equals(m2w)) {
						if (!l.equals(w)) {
							if (!l.equals(y)) {
								if (!l.equals(x)) {
									if (!m.equals(z)) {
										if (!m.equals(m2w)) {
											if (!m.equals(w)) {
												if (!m.equals(y)) {
													if (!m.equals(x)) {
														if (!l2z.equals(m)) {
															if (!l2z.equals(z)) {
																if (!l2z.equals(m2w)) {
																	if (!l2z.equals(w)) {
																		if (!l2z.equals(y)) {
																			if (!l2z.equals(x)) {
																				if (!b.equals(l)) {
																					if (!b.equals(m)) {
																						if (!b.equals(z)) {
																							if (!b.equals(l2z)) {
																								if (!b.equals(d2c)) {
																									if (!b.equals(
																											m2w)) {
																										if (!b.equals(
																												d)) {
																											if (!b.equals(
																													w)) {
																												if (!b.equals(
																														b2y)) {
																													if (!b.equals(
																															y)) {
																														if (!b.equals(
																																x)) {
																															if (!b.equals(
																																	c)) {
																																if (!d2c.equals(
																																		l)) {
																																	if (!d2c.equals(
																																			m)) {
																																		if (!d2c.equals(
																																				z)) {
																																			if (!d2c.equals(
																																					l2z)) {
																																				if (!d2c.equals(
																																						m2w)) {
																																					if (!d2c.equals(
																																							w)) {
																																						if (!d2c.equals(
																																								y)) {
																																							if (!d2c.equals(
																																									x)) {
																																								if (!m2w.equals(
																																										z)) {
																																									if (!m2w.equals(
																																											w)) {
																																										if (!m2w.equals(
																																												y)) {
																																											if (!m2w.equals(
																																													x)) {
																																												if (!d.equals(
																																														l)) {
																																													if (!d.equals(
																																															m)) {
																																														if (!d.equals(
																																																z)) {
																																															if (!d.equals(
																																																	l2z)) {
																																																if (!d.equals(
																																																		d2c)) {
																																																	if (!d.equals(
																																																			m2w)) {
																																																		if (!d.equals(
																																																				w)) {
																																																			if (!d.equals(
																																																					y)) {
																																																				if (!d.equals(
																																																						x)) {
																																																					if (!a.equals(
																																																							l)) {
																																																						if (!a.equals(
																																																								m)) {
																																																							if (!a.equals(
																																																									z)) {
																																																								if (!a.equals(
																																																										l2z)) {
																																																									if (!a.equals(
																																																											b)) {
																																																										if (!a.equals(
																																																												d2c)) {
																																																											if (!a.equals(
																																																													m2w)) {
																																																												if (!a.equals(
																																																														d)) {
																																																													if (!a.equals(
																																																															w)) {
																																																														if (!a.equals(
																																																																b2y)) {
																																																															if (!a.equals(
																																																																	a2x)) {
																																																																if (!a.equals(
																																																																		y)) {
																																																																	if (!a.equals(
																																																																			x)) {
																																																																		if (!a.equals(
																																																																				c)) {
																																																																			if (!w.equals(
																																																																					z)) {
																																																																				if (!w.equals(
																																																																						y)) {
																																																																					if (!w.equals(
																																																																							x)) {
																																																																						if (!b2y.equals(
																																																																								l)) {
																																																																							if (!b2y.equals(
																																																																									m)) {
																																																																								if (!b2y.equals(
																																																																										z)) {
																																																																									if (!b2y.equals(
																																																																											l2z)) {
																																																																										if (!b2y.equals(
																																																																												d2c)) {
																																																																											if (!b2y.equals(
																																																																													m2w)) {
																																																																												if (!b2y.equals(
																																																																														d)) {
																																																																													if (!b2y.equals(
																																																																															w)) {
																																																																														if (!b2y.equals(
																																																																																y)) {
																																																																															if (!b2y.equals(
																																																																																	x)) {
																																																																																if (!b2y.equals(
																																																																																		c)) {
																																																																																	if (!a2x.equals(
																																																																																			l)) {
																																																																																		if (!a2x.equals(
																																																																																				m)) {
																																																																																			if (!a2x.equals(
																																																																																					z)) {
																																																																																				if (!a2x.equals(
																																																																																						l2z)) {
																																																																																					if (!a2x.equals(
																																																																																							b)) {
																																																																																						if (!a2x.equals(
																																																																																								d2c)) {
																																																																																							if (!a2x.equals(
																																																																																									m2w)) {
																																																																																								if (!a2x.equals(
																																																																																										d)) {
																																																																																									if (!a2x.equals(
																																																																																											w)) {
																																																																																										if (!a2x.equals(
																																																																																												b2y)) {
																																																																																											if (!a2x.equals(
																																																																																													y)) {
																																																																																												if (!a2x.equals(
																																																																																														x)) {
																																																																																													if (!a2x.equals(
																																																																																															c)) {
																																																																																														if (!y.equals(
																																																																																																z)) {
																																																																																															if (!x.equals(
																																																																																																	z)) {
																																																																																																if (!x.equals(
																																																																																																		y)) {
																																																																																																	if (!c.equals(
																																																																																																			l)) {
																																																																																																		if (!c.equals(
																																																																																																				m)) {
																																																																																																			if (!c.equals(
																																																																																																					z)) {
																																																																																																				if (!c.equals(
																																																																																																						l2z)) {
																																																																																																					if (!c.equals(
																																																																																																							d2c)) {
																																																																																																						if (!c.equals(
																																																																																																								m2w)) {
																																																																																																							if (!c.equals(
																																																																																																									d)) {
																																																																																																								if (!c.equals(
																																																																																																										w)) {
																																																																																																									if (!c.equals(
																																																																																																											y)) {
																																																																																																										if (!c.equals(
																																																																																																												x)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l,
																																																																																																													m,
																																																																																																													z,
																																																																																																													l2z,
																																																																																																													b,
																																																																																																													d2c,
																																																																																																													m2w,
																																																																																																													d,
																																																																																																													a,
																																																																																																													w,
																																																																																																													b2y,
																																																																																																													a2x,
																																																																																																													y,
																																																																																																													x,
																																																																																																													c };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decll2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z, EObject b, EObject m2w,
			EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y, EObject x, EObject c) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String m2w__m____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String m2w__w____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, l, m, z, l2z, b, m2w, d, a, w, b2y, a2x, y, x, c, l2z__l____source,
				l2z__z____target, m2w__m____source, d__a____positive, a__l____last, m2w__w____target, w__y____next,
				b2y__b____source, a2x__a____source, d__b____negative, b__m____last, z__x____next, b2y__y____target,
				a2x__x____target, c__x____positive, c__y____negative };
	}

	public static final void pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z, EObject b,
			EObject d2c, EObject m2w, EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y, EObject x,
			EObject c) {
		_this.registerObjects_FWD(ruleresult, l, m, z, l2z, b, d2c, m2w, d, a, w, b2y, a2x, y, x, c);

	}

	public static final PerformRuleResult pattern_decll2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_2_1_preparereturnvalue_bindingFB(decll2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decll2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			decll2branchbb _this) {
		Object[] result_pattern_decll2branchbb_2_1_preparereturnvalue_binding = pattern_decll2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decll2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decll2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decll2branchbb_2_1_preparereturnvalue_black = pattern_decll2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decll2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decll2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decll2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decll2branchbb_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("m");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpL = _localVariable_0;
		EObject tmpM = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { l, m, b, d, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_2_corematch_blackBBBFBBFB(Assignment l,
			Assignment m, While b, Decision d, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { l, m, b, d2c, d, a, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(Assignment l,
			Assignment m, While b, S2B d2c, Decision d, While a, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (a.equals(d.getPositive())) {
					if (d.equals(d2c.getSource())) {
						if (l.equals(a.getLast())) {
							if (b.equals(d.getNegative())) {
								if (m.equals(b.getLast())) {
									if (c.equals(d2c.getTarget())) {
										_result.add(new Object[] { l, m, b, d2c, d, a, c });
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

	public static final Object[] pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(Assignment l, Assignment m,
			While b, S2B d2c, Decision d, While a, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { l, m, b, d2c, d, a, c, isApplicableMatch, d__a____positive, d2c__d____source,
				a__l____last, d__b____negative, b__m____last, d2c__c____target };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Assignment l, Assignment m, While b, S2B d2c, Decision d, While a,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, m, b, d2c, d, a, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, m, b, d2c, d, a, c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Assignment l, Assignment m, While b, S2B d2c, Decision d, While a,
			Branch c) {
		Object[] result_pattern_decll2branchbb_2_4_solveCSP_binding = pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, l, m, b, d2c, d, a, c);
		if (result_pattern_decll2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_2_4_solveCSP_black = pattern_decll2branchbb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, m, b, d2c, d, a, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_2_5_checkCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decll2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decll2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decll2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_10_1_initialbindings_blackBBBBBBB(decll2branchbb _this,
			Match match, Command z, Command w, Branch y, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { _this, match, z, w, y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			Command z, Command w, Branch y, Branch x, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, w, y, x, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, w, y, x, c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, Command z, Command w, Branch y, Branch x, Branch c) {
		Object[] result_pattern_decll2branchbb_10_2_SolveCSP_binding = pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, w, y, x, c);
		if (result_pattern_decll2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_10_2_SolveCSP_black = pattern_decll2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, w, y, x, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_10_3_CheckCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Command z, Command w, Branch y, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { match, z, w, y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Command z, Command w, Branch y, Branch x, Branch c) {
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String w__y____next_name_prime = "next";
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		w__y____next.setName(w__y____next_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { match, z, w, y, x, c, w__y____next, z__x____next, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match, Command z,
			Command w, Branch y, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { match, z, w, y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decll2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(decll2branchbb _this,
			Match match, Command z, Command w, Branch y, Branch x, Branch c) {
		_this.registerObjectsToMatch_BWD(match, z, w, y, x, c);

	}

	public static final boolean pattern_decll2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decll2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { z, d2c, d, w, y, x, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Command z, S2B d2c,
			Decision d, Command w, Branch y, Branch x, Branch c, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, d2c, d, w, y, x, c, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			decll2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decll2branchbb_11_1_performtransformation_binding = pattern_decll2branchbb_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decll2branchbb_11_1_performtransformation_binding != null) {
			Command z = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decll2branchbb_11_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decll2branchbb_11_1_performtransformation_binding[2];
			Command w = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_11_1_performtransformation_black = pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					z, d2c, d, w, y, x, c, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_11_1_performtransformation_black[7];

				return new Object[] { z, d2c, d, w, y, x, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_greenFFBFFFBFBFFBB(Command z,
			Decision d, Command w, Branch y, Branch x) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		d.setNegative(b);
		b.setLast(m);
		m2w.setSource(m);
		m2w.setTarget(w);
		d.setPositive(a);
		a.setLast(l);
		b2y.setSource(b);
		b2y.setTarget(y);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { l, m, z, l2z, b, m2w, d, a, w, b2y, a2x, y, x };
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Assignment l,
			Assignment m, Command z, S2N l2z, While b, S2N m2w, While a, Command w, S2B b2y, S2B a2x, Branch y,
			Branch x) {
		if (!l.equals(m)) {
			if (!l2z.equals(m2w)) {
				if (!a.equals(b)) {
					if (!w.equals(z)) {
						if (!a2x.equals(b2y)) {
							if (!x.equals(y)) {
								return new Object[] { l, m, z, l2z, b, m2w, a, w, b2y, a2x, y, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Assignment l,
			Assignment m, Command z, S2N l2z, While b, S2N m2w, While a, Command w, S2B b2y, S2B a2x, Branch y,
			Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, l, m, z, l2z, b, m2w, a, w, b2y, a2x, y, x };
	}

	public static final Object[] pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z, EObject b, EObject d2c,
			EObject m2w, EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y, EObject x, EObject c) {
		if (!l.equals(m)) {
			if (!l.equals(z)) {
				if (!l.equals(l2z)) {
					if (!l.equals(m2w)) {
						if (!l.equals(w)) {
							if (!l.equals(y)) {
								if (!l.equals(x)) {
									if (!m.equals(z)) {
										if (!m.equals(m2w)) {
											if (!m.equals(w)) {
												if (!m.equals(y)) {
													if (!m.equals(x)) {
														if (!l2z.equals(m)) {
															if (!l2z.equals(z)) {
																if (!l2z.equals(m2w)) {
																	if (!l2z.equals(w)) {
																		if (!l2z.equals(y)) {
																			if (!l2z.equals(x)) {
																				if (!b.equals(l)) {
																					if (!b.equals(m)) {
																						if (!b.equals(z)) {
																							if (!b.equals(l2z)) {
																								if (!b.equals(d2c)) {
																									if (!b.equals(
																											m2w)) {
																										if (!b.equals(
																												d)) {
																											if (!b.equals(
																													w)) {
																												if (!b.equals(
																														b2y)) {
																													if (!b.equals(
																															y)) {
																														if (!b.equals(
																																x)) {
																															if (!b.equals(
																																	c)) {
																																if (!d2c.equals(
																																		l)) {
																																	if (!d2c.equals(
																																			m)) {
																																		if (!d2c.equals(
																																				z)) {
																																			if (!d2c.equals(
																																					l2z)) {
																																				if (!d2c.equals(
																																						m2w)) {
																																					if (!d2c.equals(
																																							w)) {
																																						if (!d2c.equals(
																																								y)) {
																																							if (!d2c.equals(
																																									x)) {
																																								if (!m2w.equals(
																																										z)) {
																																									if (!m2w.equals(
																																											w)) {
																																										if (!m2w.equals(
																																												y)) {
																																											if (!m2w.equals(
																																													x)) {
																																												if (!d.equals(
																																														l)) {
																																													if (!d.equals(
																																															m)) {
																																														if (!d.equals(
																																																z)) {
																																															if (!d.equals(
																																																	l2z)) {
																																																if (!d.equals(
																																																		d2c)) {
																																																	if (!d.equals(
																																																			m2w)) {
																																																		if (!d.equals(
																																																				w)) {
																																																			if (!d.equals(
																																																					y)) {
																																																				if (!d.equals(
																																																						x)) {
																																																					if (!a.equals(
																																																							l)) {
																																																						if (!a.equals(
																																																								m)) {
																																																							if (!a.equals(
																																																									z)) {
																																																								if (!a.equals(
																																																										l2z)) {
																																																									if (!a.equals(
																																																											b)) {
																																																										if (!a.equals(
																																																												d2c)) {
																																																											if (!a.equals(
																																																													m2w)) {
																																																												if (!a.equals(
																																																														d)) {
																																																													if (!a.equals(
																																																															w)) {
																																																														if (!a.equals(
																																																																b2y)) {
																																																															if (!a.equals(
																																																																	a2x)) {
																																																																if (!a.equals(
																																																																		y)) {
																																																																	if (!a.equals(
																																																																			x)) {
																																																																		if (!a.equals(
																																																																				c)) {
																																																																			if (!w.equals(
																																																																					z)) {
																																																																				if (!w.equals(
																																																																						y)) {
																																																																					if (!w.equals(
																																																																							x)) {
																																																																						if (!b2y.equals(
																																																																								l)) {
																																																																							if (!b2y.equals(
																																																																									m)) {
																																																																								if (!b2y.equals(
																																																																										z)) {
																																																																									if (!b2y.equals(
																																																																											l2z)) {
																																																																										if (!b2y.equals(
																																																																												d2c)) {
																																																																											if (!b2y.equals(
																																																																													m2w)) {
																																																																												if (!b2y.equals(
																																																																														d)) {
																																																																													if (!b2y.equals(
																																																																															w)) {
																																																																														if (!b2y.equals(
																																																																																y)) {
																																																																															if (!b2y.equals(
																																																																																	x)) {
																																																																																if (!b2y.equals(
																																																																																		c)) {
																																																																																	if (!a2x.equals(
																																																																																			l)) {
																																																																																		if (!a2x.equals(
																																																																																				m)) {
																																																																																			if (!a2x.equals(
																																																																																					z)) {
																																																																																				if (!a2x.equals(
																																																																																						l2z)) {
																																																																																					if (!a2x.equals(
																																																																																							b)) {
																																																																																						if (!a2x.equals(
																																																																																								d2c)) {
																																																																																							if (!a2x.equals(
																																																																																									m2w)) {
																																																																																								if (!a2x.equals(
																																																																																										d)) {
																																																																																									if (!a2x.equals(
																																																																																											w)) {
																																																																																										if (!a2x.equals(
																																																																																												b2y)) {
																																																																																											if (!a2x.equals(
																																																																																													y)) {
																																																																																												if (!a2x.equals(
																																																																																														x)) {
																																																																																													if (!a2x.equals(
																																																																																															c)) {
																																																																																														if (!y.equals(
																																																																																																z)) {
																																																																																															if (!x.equals(
																																																																																																	z)) {
																																																																																																if (!x.equals(
																																																																																																		y)) {
																																																																																																	if (!c.equals(
																																																																																																			l)) {
																																																																																																		if (!c.equals(
																																																																																																				m)) {
																																																																																																			if (!c.equals(
																																																																																																					z)) {
																																																																																																				if (!c.equals(
																																																																																																						l2z)) {
																																																																																																					if (!c.equals(
																																																																																																							d2c)) {
																																																																																																						if (!c.equals(
																																																																																																								m2w)) {
																																																																																																							if (!c.equals(
																																																																																																									d)) {
																																																																																																								if (!c.equals(
																																																																																																										w)) {
																																																																																																									if (!c.equals(
																																																																																																											y)) {
																																																																																																										if (!c.equals(
																																																																																																												x)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l,
																																																																																																													m,
																																																																																																													z,
																																																																																																													l2z,
																																																																																																													b,
																																																																																																													d2c,
																																																																																																													m2w,
																																																																																																													d,
																																																																																																													a,
																																																																																																													w,
																																																																																																													b2y,
																																																																																																													a2x,
																																																																																																													y,
																																																																																																													x,
																																																																																																													c };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decll2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z, EObject b, EObject m2w,
			EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y, EObject x, EObject c) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String m2w__m____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String m2w__w____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, l, m, z, l2z, b, m2w, d, a, w, b2y, a2x, y, x, c, l2z__l____source,
				l2z__z____target, m2w__m____source, d__a____positive, a__l____last, m2w__w____target, w__y____next,
				b2y__b____source, a2x__a____source, d__b____negative, b__m____last, z__x____next, b2y__y____target,
				a2x__x____target, c__x____positive, c__y____negative };
	}

	public static final void pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject l, EObject m, EObject z, EObject l2z, EObject b,
			EObject d2c, EObject m2w, EObject d, EObject a, EObject w, EObject b2y, EObject a2x, EObject y, EObject x,
			EObject c) {
		_this.registerObjects_BWD(ruleresult, l, m, z, l2z, b, d2c, m2w, d, a, w, b2y, a2x, y, x, c);

	}

	public static final PerformRuleResult pattern_decll2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_12_1_preparereturnvalue_bindingFB(decll2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decll2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			decll2branchbb _this) {
		Object[] result_pattern_decll2branchbb_12_1_preparereturnvalue_binding = pattern_decll2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decll2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decll2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decll2branchbb_12_1_preparereturnvalue_black = pattern_decll2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decll2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decll2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decll2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decll2branchbb_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							return new Object[] { z, w, y, x, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_2_corematch_blackBFFBBBBB(Command z, Command w,
			Branch y, Branch x, Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { z, d2c, d, w, y, x, c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(Command z, S2B d2c,
			Decision d, Command w, Branch y, Branch x, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						if (d.equals(d2c.getSource())) {
							if (y.equals(w.getNext())) {
								if (x.equals(z.getNext())) {
									if (x.equals(c.getPositive())) {
										if (y.equals(c.getNegative())) {
											if (c.equals(d2c.getTarget())) {
												_result.add(new Object[] { z, d2c, d, w, y, x, c });
											}
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

	public static final Object[] pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Command z, S2B d2c,
			Decision d, Command w, Branch y, Branch x, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__d____source_name_prime = "source";
		String w__y____next_name_prime = "next";
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setName(d2c__d____source_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { z, d2c, d, w, y, x, c, isApplicableMatch, d2c__d____source, w__y____next, z__x____next,
				c__x____positive, c__y____negative, d2c__c____target };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Command z, S2B d2c, Decision d, Command w, Branch y, Branch x,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, d2c, d, w, y, x, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, d2c, d, w, y, x, c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Command z, S2B d2c, Decision d, Command w, Branch y, Branch x,
			Branch c) {
		Object[] result_pattern_decll2branchbb_12_4_solveCSP_binding = pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, d2c, d, w, y, x, c);
		if (result_pattern_decll2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_12_4_solveCSP_black = pattern_decll2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, d2c, d, w, y, x, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_12_5_checkCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decll2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decll2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decll2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_20_1_preparereturnvalue_bindingFB(decll2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decll2branchbb _this) {
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

	public static final Object[] pattern_decll2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decll2branchbb _this) {
		Object[] result_pattern_decll2branchbb_20_1_preparereturnvalue_binding = pattern_decll2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decll2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decll2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decll2branchbb_20_1_preparereturnvalue_black = pattern_decll2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decll2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decll2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decll2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_306272 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_937866 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_937866)) {
							if (!x.equals(__DEC_z_positive_937866)) {
								if (!c.equals(__DEC_z_positive_937866)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_6155 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_6155)) {
							if (!x.equals(__DEC_z_negative_6155)) {
								if (!c.equals(__DEC_z_negative_6155)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_722015 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_positive_228920 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_228920)) {
							if (!x.equals(__DEC_w_positive_228920)) {
								if (!c.equals(__DEC_w_positive_228920)) {
									return new Object[] { w, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_negative_639725 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_639725)) {
							if (!x.equals(__DEC_w_negative_639725)) {
								if (!c.equals(__DEC_w_negative_639725)) {
									return new Object[] { w, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_878822 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_520120 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_520120)) {
							if (!x.equals(__DEC_y_positive_520120)) {
								if (!c.equals(__DEC_y_positive_520120)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_723045 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_723045)) {
							if (!x.equals(__DEC_y_negative_723045)) {
								if (!c.equals(__DEC_y_negative_723045)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_238986 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_548284 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_548284)) {
							if (!y.equals(__DEC_x_positive_548284)) {
								if (!c.equals(__DEC_x_positive_548284)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_351268 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_351268)) {
							if (!y.equals(__DEC_x_negative_351268)) {
								if (!c.equals(__DEC_x_negative_351268)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_20BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_21BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_22BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_23BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_24BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof Command) {
			Command w = (Command) tmpW;
			EObject tmpY = _edge_next.getTrg();
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (y.equals(w.getNext())) {
					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(w) == null) {
						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(y) == null) {
							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(y, w) == null) {
								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_21BB(y, w) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(y, Branch.class, "negative")) {
										if (!c.equals(y)) {
											Node tmpX = c.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!x.equals(y)) {
													if (!c.equals(x)) {
														if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_20BB(
																c, w) == null) {
															if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_23BB(
																	c, w) == null) {
																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																		w, y, x, c) == null) {
																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																			w, y, x, c) == null) {
																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																				y, x, c) == null) {
																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																					y, x, c) == null) {
																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(
																						x) == null) {
																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(
																							x, y, c) == null) {
																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(
																								x, y, c) == null) {
																							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(
																									x, w) == null) {
																								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_22BB(
																										x, w) == null) {
																									if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																											y,
																											x) == null) {
																										if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																												y,
																												x) == null) {
																											for (Node tmpZ : org.moflon.core.utilities.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															x,
																															Node.class,
																															"next")) {
																												if (tmpZ instanceof Command) {
																													Command z = (Command) tmpZ;
																													if (!w.equals(
																															z)) {
																														if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_0B(
																																z) == null) {
																															if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(
																																	z,
																																	y,
																																	x,
																																	c) == null) {
																																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(
																																		z,
																																		y,
																																		x,
																																		c) == null) {
																																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																																			y,
																																			z) == null) {
																																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																																				x,
																																				z) == null) {
																																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																																					c,
																																					z) == null) {
																																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																																						y,
																																						z) == null) {
																																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																																							x,
																																							z) == null) {
																																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																																								c,
																																								z) == null) {
																																							_result.add(
																																									new Object[] {
																																											z,
																																											w,
																																											y,
																																											x,
																																											c,
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
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decll2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			decll2branchbb _this, Match match, Command z, Command w, Branch y, Branch x, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, w, y, x, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decll2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decll2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decll2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_21_1_preparereturnvalue_bindingFB(decll2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decll2branchbb _this) {
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

	public static final Object[] pattern_decll2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decll2branchbb _this) {
		Object[] result_pattern_decll2branchbb_21_1_preparereturnvalue_binding = pattern_decll2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decll2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decll2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decll2branchbb_21_1_preparereturnvalue_black = pattern_decll2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decll2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decll2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decll2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_44446 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_44446)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_145451 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_145451)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_525650 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_525650)) {
					if (!a.equals(__DEC_l_first_525650)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_279120 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_279120)) {
					if (!a.equals(__DEC_l_last_279120)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_164551 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_249537 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_249537)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_797685 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_797685)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_635002 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_635002)) {
					if (!a.equals(__DEC_m_first_635002)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_899569 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_899569)) {
					if (!a.equals(__DEC_m_last_899569)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9B(Assignment m) {
		for (Program __DEC_m_first_394651 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BB(While b, Decision d) {
		for (Decision __DEC_b_positive_437596 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_437596)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_260444 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_260444)) {
					if (!a.equals(__DEC_b_first_260444)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_635768 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_635768)) {
					if (!a.equals(__DEC_b_last_635768)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13B(While b) {
		for (Program __DEC_b_first_562211 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(While a, Decision d) {
		for (Decision __DEC_a_negative_907081 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_907081)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_327849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_327849)) {
					if (!b.equals(__DEC_a_first_327849)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_667316 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_667316)) {
					if (!b.equals(__DEC_a_last_667316)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(While a) {
		for (Program __DEC_a_first_682424 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While b,
			Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While a,
			Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_positive.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpA = _edge_positive.getTrg();
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (a.equals(d.getPositive())) {
					Statement tmpB = d.getNegative();
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						if (!a.equals(b)) {
							Statement tmpL = a.getLast();
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								Statement tmpM = b.getLast();
								if (tmpM instanceof Assignment) {
									Assignment m = (Assignment) tmpM;
									if (!l.equals(m)) {
										if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(a,
												d) == null) {
											if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(
													a) == null) {
												if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(d,
														a) == null) {
													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BB(
															b, d) == null) {
														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BB(
																b, a) == null) {
															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12BB(
																	b, a) == null) {
																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																		b) == null) {
																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																			a, b) == null) {
																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																				a, b) == null) {
																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																					d, b) == null) {
																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(
																						b, a) == null) {
																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(
																							b, a) == null) {
																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
																								l, d) == null) {
																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																									l, d) == null) {
																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
																										l, b,
																										a) == null) {
																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																											l, b,
																											a) == null) {
																										if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																												l) == null) {
																											if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																													d,
																													l) == null) {
																												if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																														d,
																														l) == null) {
																													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																															b,
																															l) == null) {
																														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																																a,
																																l) == null) {
																															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																	b,
																																	l) == null) {
																																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																																		m,
																																		d) == null) {
																																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																																			m,
																																			d) == null) {
																																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																																				m,
																																				b,
																																				a) == null) {
																																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8BBB(
																																					m,
																																					b,
																																					a) == null) {
																																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9B(
																																						m) == null) {
																																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																																							d,
																																							m) == null) {
																																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																								d,
																																								m) == null) {
																																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																									b,
																																									m) == null) {
																																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																										a,
																																										m) == null) {
																																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																																											a,
																																											m) == null) {
																																										_result.add(
																																												new Object[] {
																																														l,
																																														m,
																																														b,
																																														d,
																																														a,
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
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decll2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			decll2branchbb _this, Match match, Assignment l, Assignment m, While b, Decision d, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, m, b, d, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decll2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decll2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decll2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_24_1_prepare_blackB(decll2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decll2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = sourceMatch.getObject("m");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("d");
		EObject _localVariable_5 = sourceMatch.getObject("a");
		EObject _localVariable_6 = targetMatch.getObject("w");
		EObject _localVariable_7 = targetMatch.getObject("y");
		EObject _localVariable_8 = targetMatch.getObject("x");
		EObject _localVariable_9 = targetMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpM = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpA = _localVariable_5;
		EObject tmpW = _localVariable_6;
		EObject tmpY = _localVariable_7;
		EObject tmpX = _localVariable_8;
		EObject tmpC = _localVariable_9;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								if (tmpW instanceof Command) {
									Command w = (Command) tmpW;
									if (tmpY instanceof Branch) {
										Branch y = (Branch) tmpY;
										if (tmpX instanceof Branch) {
											Branch x = (Branch) tmpX;
											if (tmpC instanceof Branch) {
												Branch c = (Branch) tmpC;
												return new Object[] { l, m, z, b, d, a, w, y, x, c, sourceMatch,
														targetMatch };
											}
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

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Assignment l,
			Assignment m, Command z, While b, Decision d, While a, Command w, Branch y, Branch x, Branch c,
			Match sourceMatch, Match targetMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (!c.equals(y)) {
							if (!c.equals(x)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding = pattern_decll2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Assignment l = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[0];
			Assignment m = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[1];
			Command z = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[2];
			While b = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[3];
			Decision d = (Decision) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[4];
			While a = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[5];
			Command w = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch y = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[7];
			Branch x = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[8];
			Branch c = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black = pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch);
			if (result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(decll2branchbb _this,
			Assignment l, Assignment m, Command z, While b, Decision d, While a, Command w, Branch y, Branch x,
			Branch c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			decll2branchbb _this, Assignment l, Assignment m, Command z, While b, Decision d, While a, Command w,
			Branch y, Branch x, Branch c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decll2branchbb_24_3_solvecsp_binding = pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch);
		if (result_pattern_decll2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decll2branchbb_24_3_solvecsp_black = pattern_decll2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decll2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, m, z, b, d, a, w, y, x, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_24_5_matchcorrcontext_blackFBBBB(Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { d2c, d, c, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decll2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(Assignment l,
			Assignment m, Command z, While b, Decision d, While a, Command w, Branch y, Branch x, Branch c,
			CCMatch ccMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (!c.equals(y)) {
							if (!c.equals(x)) {
								return new Object[] { l, m, z, b, d, a, w, y, x, c, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_greenBBBFBFBBFFBBB(Assignment l,
			Assignment m, Command z, While b, While a, Command w, Branch y, Branch x, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { l, m, z, l2z, b, m2w, a, w, b2y, a2x, y, x, ccMatch };
	}

	public static final Object[] pattern_decll2branchbb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decll2branchbb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decll2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decll2branchbb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_0BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_20808 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_20808)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_929906 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_929906)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_590105 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_590105)) {
					if (!a.equals(__DEC_l_first_590105)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_447741 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_447741)) {
					if (!a.equals(__DEC_l_last_447741)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_525071 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_961652 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_961652)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_883932 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_883932)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_285390 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_285390)) {
					if (!a.equals(__DEC_m_first_285390)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_335789 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_335789)) {
					if (!a.equals(__DEC_m_last_335789)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9B(Assignment m) {
		for (Program __DEC_m_first_138140 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BB(While b, Decision d) {
		for (Decision __DEC_b_positive_511287 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_511287)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_868137 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_868137)) {
					if (!a.equals(__DEC_b_first_868137)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_744005 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_744005)) {
					if (!a.equals(__DEC_b_last_744005)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13B(While b) {
		for (Program __DEC_b_first_51928 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(While a, Decision d) {
		for (Decision __DEC_a_negative_739511 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_739511)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_398743 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_398743)) {
					if (!b.equals(__DEC_a_first_398743)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_225671 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_225671)) {
					if (!b.equals(__DEC_a_last_225671)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(While a) {
		for (Program __DEC_a_first_305455 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_19BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_20BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_21BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(Decision d, Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(Decision d, Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(While b, Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(While a, Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_29BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_30BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_31BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(Assignment l, Assignment m,
			While b, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (a.equals(d.getPositive())) {
					if (l.equals(a.getLast())) {
						if (b.equals(d.getNegative())) {
							if (m.equals(b.getLast())) {
								if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
									if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
										if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BBB(l, b,
												a) == null) {
											if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3BBB(l, b,
													a) == null) {
												if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4B(
														l) == null) {
													if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(m,
															d) == null) {
														if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BB(m,
																d) == null) {
															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7BBB(
																	m, b, a) == null) {
																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8BBB(
																		m, b, a) == null) {
																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9B(
																			m) == null) {
																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BB(
																				b, d) == null) {
																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BB(
																					b, a) == null) {
																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12BB(
																						b, a) == null) {
																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13B(
																							b) == null) {
																						if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(
																								a, d) == null) {
																							if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BB(
																									a, b) == null) {
																								if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BB(
																										a, b) == null) {
																									if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(
																											a) == null) {
																										if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_18BB(
																												d,
																												l) == null) {
																											if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_19BB(
																													d,
																													l) == null) {
																												if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_20BB(
																														b,
																														l) == null) {
																													if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_21BB(
																															a,
																															l) == null) {
																														if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(
																																b,
																																l) == null) {
																															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(
																																	d,
																																	m) == null) {
																																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																		d,
																																		m) == null) {
																																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																			b,
																																			m) == null) {
																																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																				a,
																																				m) == null) {
																																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																					a,
																																					m) == null) {
																																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																						d,
																																						b) == null) {
																																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																							d,
																																							a) == null) {
																																						if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_30BB(
																																								b,
																																								a) == null) {
																																							if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_31BB(
																																									b,
																																									a) == null) {
																																								return new Object[] {
																																										l,
																																										m,
																																										b,
																																										d,
																																										a };
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decll2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decll2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_748300 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_829981 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_829981)) {
							if (!x.equals(__DEC_z_positive_829981)) {
								if (!c.equals(__DEC_z_positive_829981)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_465867 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_465867)) {
							if (!x.equals(__DEC_z_negative_465867)) {
								if (!c.equals(__DEC_z_negative_465867)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_741713 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_positive_566751 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_566751)) {
							if (!x.equals(__DEC_w_positive_566751)) {
								if (!c.equals(__DEC_w_positive_566751)) {
									return new Object[] { w, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_negative_769140 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_769140)) {
							if (!x.equals(__DEC_w_negative_769140)) {
								if (!c.equals(__DEC_w_negative_769140)) {
									return new Object[] { w, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_49070 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_690436 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_690436)) {
							if (!x.equals(__DEC_y_positive_690436)) {
								if (!c.equals(__DEC_y_positive_690436)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_348583 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_348583)) {
							if (!x.equals(__DEC_y_negative_348583)) {
								if (!c.equals(__DEC_y_negative_348583)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_636214 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_222476 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_222476)) {
							if (!y.equals(__DEC_x_positive_222476)) {
								if (!c.equals(__DEC_x_positive_222476)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_919283 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_919283)) {
							if (!y.equals(__DEC_x_negative_919283)) {
								if (!c.equals(__DEC_x_negative_919283)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_20BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_21BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_22BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_23BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_24BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(Command z, Command w, Branch y,
			Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						if (y.equals(w.getNext())) {
							if (x.equals(z.getNext())) {
								if (x.equals(c.getPositive())) {
									if (y.equals(c.getNegative())) {
										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBBB(z, y, x,
													c) == null) {
												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBBB(z, y, x,
														c) == null) {
													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(
															w) == null) {
														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBBB(
																w, y, x, c) == null) {
															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBBB(
																	w, y, x, c) == null) {
																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(
																		y) == null) {
																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																			y, x, c) == null) {
																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																				y, x, c) == null) {
																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(
																					x) == null) {
																				if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBB(
																						x, y, c) == null) {
																					if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBB(
																							x, y, c) == null) {
																						if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_12BB(
																								y, z) == null) {
																							if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_13BB(
																									x, z) == null) {
																								if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_14BB(
																										c, z) == null) {
																									if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_15BB(
																											y,
																											z) == null) {
																										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_16BB(
																												x,
																												z) == null) {
																											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_17BB(
																													c,
																													z) == null) {
																												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(
																														y,
																														w) == null) {
																													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															x,
																															w) == null) {
																														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_20BB(
																																c,
																																w) == null) {
																															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_21BB(
																																	y,
																																	w) == null) {
																																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_22BB(
																																		x,
																																		w) == null) {
																																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_23BB(
																																			c,
																																			w) == null) {
																																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_24BB(
																																				y,
																																				x) == null) {
																																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(
																																					y,
																																					x) == null) {
																																				return new Object[] {
																																						z,
																																						w,
																																						y,
																																						x,
																																						c };
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decll2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decll2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_29_1_createresult_blackB(decll2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decll2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decll2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList d2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpD2c : d2cList.getEntryObjects()) {
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						Branch c = d2c.getTarget();
						if (c != null) {
							if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d) == null) {
									if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											c) == null) {
										_result.add(
												new Object[] { d2cList, d2c, d, c, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_bindingFBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, d, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decll2branchbb_29_3_solveCSP_binding = pattern_decll2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, d, c, ruleResult);
		if (result_pattern_decll2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_29_3_solveCSP_black = pattern_decll2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_29_4_checkCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_29_5_checknacs_blackBBB(S2B d2c, Decision d, Branch c) {
		return new Object[] { d2c, d, c };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_blackBBBB(S2B d2c, Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, d, c, ruleResult };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_greenFFFFFFBFFFFFFBB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(l);
		ruleResult.getSourceObjects().add(m);
		ruleResult.getTargetObjects().add(z);
		l2z.setSource(l);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		d.setNegative(b);
		b.setLast(m);
		ruleResult.getSourceObjects().add(b);
		m2w.setSource(m);
		ruleResult.getCorrObjects().add(m2w);
		d.setPositive(a);
		a.setLast(l);
		ruleResult.getSourceObjects().add(a);
		m2w.setTarget(w);
		ruleResult.getTargetObjects().add(w);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		w.setNext(y);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		z.setNext(x);
		a2x.setTarget(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l, m, z, l2z, b, m2w, d, a, w, b2y, a2x, y, x, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decll2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decll2branchbbImpl
