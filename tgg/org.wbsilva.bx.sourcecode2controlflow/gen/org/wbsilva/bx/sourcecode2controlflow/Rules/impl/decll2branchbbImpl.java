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
	public boolean isAppropriate_FWD(Match match, While b, Assignment l, Assignment m, While a, Decision d) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(this, match,
				b, l, m, a, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", "
					+ "[a] = " + a + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, b, l, m, a, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", "
					+ "[a] = " + a + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, b, l, m, a, d);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[l] = " + l + ", " + "[m] = " + m + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, b, l, m,
					a, d);
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(match, b, l, m, a, d);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[l] = " + l + ", " + "[m] = " + m + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, b, l, m,
					a, d);
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
		While b = (While) result1_bindingAndBlack[0];
		Assignment l = (Assignment) result1_bindingAndBlack[1];
		Assignment m = (Assignment) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		S2B d2c = (S2B) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_1_performtransformation_greenFBBBFFFFBBFFF(b, l, m, a, c);
		S2B a2x = (S2B) result1_green[0];
		S2B b2y = (S2B) result1_green[4];
		Command z = (Command) result1_green[5];
		S2N l2z = (S2N) result1_green[6];
		Command w = (Command) result1_green[7];
		Branch x = (Branch) result1_green[10];
		Branch y = (Branch) result1_green[11];
		S2N m2w = (S2N) result1_green[12];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(a2x, b, l, m, b2y, z, l2z, w, a,
						x, y, m2w);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[b] = "
					+ b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z
					+ ", " + "[l2z] = " + l2z + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ", " + "[m2w] = " + m2w + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(a2x, b, l, m, b2y, z, l2z, w,
						a, x, y, m2w);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, a2x, b, l, m, b2y, z,
						l2z, w, a, d, c, x, y, d2c, m2w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", "
					+ "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[l2z] = " + l2z + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = "
					+ y + ", " + "[d2c] = " + d2c + ", " + "[m2w] = " + m2w + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, m2w);
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, a2x,
				b, l, m, b2y, z, l2z, w, a, d, c, x, y, d2c, m2w);
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
		While b = (While) result2_binding[0];
		Assignment l = (Assignment) result2_binding[1];
		Assignment m = (Assignment) result2_binding[2];
		While a = (While) result2_binding[3];
		Decision d = (Decision) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_2_2_corematch_blackBBBBBFFB(b, l, m, a,
				d, match)) {
			Branch c = (Branch) result2_black[5];
			S2B d2c = (S2B) result2_black[6];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(b, l,
					m, a, d, c, d2c)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(b, l, m, a, d, c, d2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, b, l, m,
								a, d, c, d2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[l] = " + l
							+ ", " + "[m] = " + m + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c
							+ ", " + "[d2c] = " + d2c + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While b, Assignment l, Assignment m, While a, Decision d) {
		match.registerObject("b", b);
		match.registerObject("l", l);
		match.registerObject("m", m);
		match.registerObject("a", a);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While b, Assignment l, Assignment m, While a, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While b, Assignment l, Assignment m,
			While a, Decision d, Branch c, S2B d2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m,
			EObject b2y, EObject z, EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y,
			EObject d2c, EObject m2w) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m2w", m2w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Command w, Branch c, Branch x, Branch y) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, z, w, c, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, w, c, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, z, w, c, x, y);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, z, w, c,
					x, y);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(match, z, w, c, x, y);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, z, w,
					c, x, y);
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
		Command w = (Command) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		Branch y = (Branch) result1_bindingAndBlack[5];
		S2B d2c = (S2B) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_1_performtransformation_greenFFFFFBFBFBBBF(z, w, d, x, y);
		S2B a2x = (S2B) result1_green[0];
		While b = (While) result1_green[1];
		Assignment l = (Assignment) result1_green[2];
		Assignment m = (Assignment) result1_green[3];
		S2B b2y = (S2B) result1_green[4];
		S2N l2z = (S2N) result1_green[6];
		While a = (While) result1_green[8];
		S2N m2w = (S2N) result1_green[12];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(a2x, b, l, m, b2y, z, l2z, w,
						a, x, y, m2w);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[b] = "
					+ b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z
					+ ", " + "[l2z] = " + l2z + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ", " + "[m2w] = " + m2w + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(a2x, b, l, m, b2y, z, l2z, w,
						a, x, y, m2w);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, a2x, b, l, m, b2y, z,
						l2z, w, a, d, c, x, y, d2c, m2w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", "
					+ "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[l2z] = " + l2z + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = "
					+ y + ", " + "[d2c] = " + d2c + ", " + "[m2w] = " + m2w + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, m2w);
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, d2c, m2w);
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
		Branch c = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch y = (Branch) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_12_2_corematch_blackBBFBBBFB(z, w, c, x,
				y, match)) {
			Decision d = (Decision) result2_black[2];
			S2B d2c = (S2B) result2_black[6];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(z, w,
					d, c, x, y, d2c)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(z, w, d, c, x, y, d2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z, w,
								d, c, x, y, d2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[w] = " + w
							+ ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y
							+ ", " + "[d2c] = " + d2c + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command z, Command w, Branch c, Branch x, Branch y) {
		match.registerObject("z", z);
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Command w, Branch c, Branch x, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, Command w, Decision d,
			Branch c, Branch x, Branch y, S2B d2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m,
			EObject b2y, EObject z, EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y,
			EObject d2c, EObject m2w) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m2w", m2w);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_290(EMoflonEdge _edge_next) {

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
			Branch c = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch y = (Branch) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, w, c, x, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_298(EMoflonEdge _edge_last) {

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
				.pattern_decll2branchbb_21_2_testcorematchandDECs_blackFFFFFB(_edge_last)) {
			While b = (While) result2_black[0];
			Assignment l = (Assignment) result2_black[1];
			Assignment m = (Assignment) result2_black[2];
			While a = (While) result2_black[3];
			Decision d = (Decision) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, b, l, m, a, d)) {
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
		While b = (While) result2_bindingAndBlack[0];
		Assignment l = (Assignment) result2_bindingAndBlack[1];
		Assignment m = (Assignment) result2_bindingAndBlack[2];
		Command z = (Command) result2_bindingAndBlack[3];
		Command w = (Command) result2_bindingAndBlack[4];
		While a = (While) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Branch c = (Branch) result2_bindingAndBlack[7];
		Branch x = (Branch) result2_bindingAndBlack[8];
		Branch y = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, b, l, m, z, w, a, d, c, x, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[b] = " + b + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[z] = " + z + ", " + "[w] = "
					+ w + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_blackBBFBB(d,
					c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decll2branchbbImpl
						.pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(b, l, m, z, w, a, d, c, x, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", "
							+ "[l] = " + l + ", " + "[m] = " + m + ", " + "[z] = " + z + ", " + "[w] = " + w + ", "
							+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
							+ "[y] = " + y + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decll2branchbbImpl.pattern_decll2branchbb_24_6_createcorrespondence_greenFBBBFBFBBBBFB(b, l, m, z, w, a,
						x, y, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[0];
				//nothing S2B b2y = (S2B) result6_green[4];
				//nothing S2N l2z = (S2N) result6_green[6];
				//nothing S2N m2w = (S2N) result6_green[11];

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
	public CSP isApplicable_solveCsp_CC(While b, Assignment l, Assignment m, Command z, Command w, While a, Decision d,
			Branch c, Branch x, Branch y, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While b, Assignment l, Assignment m, While a, Decision d) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(b, l, m, a,
				d);
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
	public boolean checkDEC_BWD(Command z, Command w, Branch c, Branch x, Branch y) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(z, w, c, x,
				y);
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
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decll2branchbbImpl
					.pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, c, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decll2branchbbImpl.pattern_decll2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decll2branchbbImpl.pattern_decll2branchbb_29_5_checknacs_blackBBB(d, c, d2c);
				if (result5_black != null) {

					Object[] result6_black = decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_blackBBBB(d, c, d2c,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_greenFFFFFFFFFBBFFFB(d, c, ruleResult);
					//nothing S2B a2x = (S2B) result6_green[0];
					//nothing While b = (While) result6_green[1];
					//nothing Assignment l = (Assignment) result6_green[2];
					//nothing Assignment m = (Assignment) result6_green[3];
					//nothing S2B b2y = (S2B) result6_green[4];
					//nothing Command z = (Command) result6_green[5];
					//nothing S2N l2z = (S2N) result6_green[6];
					//nothing Command w = (Command) result6_green[7];
					//nothing While a = (While) result6_green[8];
					//nothing Branch x = (Branch) result6_green[11];
					//nothing Branch y = (Branch) result6_green[12];
					//nothing S2N m2w = (S2N) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (Decision) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5));
			return null;
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_BRANCH_S2B:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6), (S2B) arguments.get(7));
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_COMMAND_DECISION_BRANCH_BRANCH_BRANCH_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (S2B) arguments.get(7));
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_290__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_290((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_298__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_298((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_ASSIGNMENT_ASSIGNMENT_COMMAND_COMMAND_WHILE_DECISION_BRANCH_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4),
					(While) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7),
					(Branch) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_FWD__WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_BWD__COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(decll2branchbb _this,
			Match match, While b, Assignment l, Assignment m, While a, Decision d) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, b, l, m, a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			While b, Assignment l, Assignment m, While a, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, l, m, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, l, m, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, While b, Assignment l, Assignment m, While a, Decision d) {
		Object[] result_pattern_decll2branchbb_0_2_SolveCSP_binding = pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, b, l, m, a, d);
		if (result_pattern_decll2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_0_2_SolveCSP_black = pattern_decll2branchbb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, l, m, a, d };
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
			While b, Assignment l, Assignment m, While a, Decision d) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, b, l, m, a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			While b, Assignment l, Assignment m, While a, Decision d) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(a);
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, b, l, m, a, d, a__l____last, d__b____negative, b__m____last, d__a____positive };
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match, While b,
			Assignment l, Assignment m, While a, Decision d) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, b, l, m, a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(decll2branchbb _this,
			Match match, While b, Assignment l, Assignment m, While a, Decision d) {
		_this.registerObjectsToMatch_FWD(match, b, l, m, a, d);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("l");
		EObject _localVariable_2 = isApplicableMatch.getObject("m");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject _localVariable_6 = isApplicableMatch.getObject("d2c");
		EObject tmpB = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpD2c = _localVariable_6;
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								if (tmpD2c instanceof S2B) {
									S2B d2c = (S2B) tmpD2c;
									return new Object[] { b, l, m, a, d, c, d2c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(While b, Assignment l,
			Assignment m, While a, Decision d, Branch c, S2B d2c, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { b, l, m, a, d, c, d2c, csp, _this, isApplicableMatch };
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
			While b = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[0];
			Assignment l = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[1];
			Assignment m = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decll2branchbb_1_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_decll2branchbb_1_1_performtransformation_binding[5];
			S2B d2c = (S2B) result_pattern_decll2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_1_1_performtransformation_black = pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					b, l, m, a, d, c, d2c, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_1_1_performtransformation_black[7];

				return new Object[] { b, l, m, a, d, c, d2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_greenFBBBFFFFBBFFF(While b,
			Assignment l, Assignment m, While a, Branch c) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		b2y.setSource(b);
		l2z.setSource(l);
		l2z.setTarget(z);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		c.setNegative(y);
		b2y.setTarget(y);
		w.setNext(y);
		m2w.setSource(m);
		m2w.setTarget(w);
		return new Object[] { a2x, b, l, m, b2y, z, l2z, w, a, c, x, y, m2w };
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2B a2x,
			While b, Assignment l, Assignment m, S2B b2y, Command z, S2N l2z, Command w, While a, Branch x, Branch y,
			S2N m2w) {
		if (!a2x.equals(b2y)) {
			if (!l.equals(m)) {
				if (!l2z.equals(m2w)) {
					if (!w.equals(z)) {
						if (!a.equals(b)) {
							if (!x.equals(y)) {
								return new Object[] { a2x, b, l, m, b2y, z, l2z, w, a, x, y, m2w };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2B a2x,
			While b, Assignment l, Assignment m, S2B b2y, Command z, S2N l2z, Command w, While a, Branch x, Branch y,
			S2N m2w) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(m2w);
		return new Object[] { ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, x, y, m2w };
	}

	public static final Object[] pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m, EObject b2y, EObject z,
			EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y, EObject d2c, EObject m2w) {
		if (!a2x.equals(b)) {
			if (!a2x.equals(l)) {
				if (!a2x.equals(m)) {
					if (!a2x.equals(b2y)) {
						if (!a2x.equals(z)) {
							if (!a2x.equals(l2z)) {
								if (!a2x.equals(w)) {
									if (!a2x.equals(d)) {
										if (!a2x.equals(c)) {
											if (!a2x.equals(x)) {
												if (!a2x.equals(y)) {
													if (!a2x.equals(d2c)) {
														if (!a2x.equals(m2w)) {
															if (!b.equals(l)) {
																if (!b.equals(m)) {
																	if (!b.equals(b2y)) {
																		if (!b.equals(z)) {
																			if (!b.equals(l2z)) {
																				if (!b.equals(w)) {
																					if (!b.equals(d)) {
																						if (!b.equals(c)) {
																							if (!b.equals(x)) {
																								if (!b.equals(y)) {
																									if (!b.equals(
																											d2c)) {
																										if (!b.equals(
																												m2w)) {
																											if (!l.equals(
																													m)) {
																												if (!l.equals(
																														z)) {
																													if (!l.equals(
																															l2z)) {
																														if (!l.equals(
																																w)) {
																															if (!l.equals(
																																	x)) {
																																if (!l.equals(
																																		y)) {
																																	if (!l.equals(
																																			m2w)) {
																																		if (!m.equals(
																																				z)) {
																																			if (!m.equals(
																																					w)) {
																																				if (!m.equals(
																																						x)) {
																																					if (!m.equals(
																																							y)) {
																																						if (!m.equals(
																																								m2w)) {
																																							if (!b2y.equals(
																																									l)) {
																																								if (!b2y.equals(
																																										m)) {
																																									if (!b2y.equals(
																																											z)) {
																																										if (!b2y.equals(
																																												l2z)) {
																																											if (!b2y.equals(
																																													w)) {
																																												if (!b2y.equals(
																																														d)) {
																																													if (!b2y.equals(
																																															c)) {
																																														if (!b2y.equals(
																																																x)) {
																																															if (!b2y.equals(
																																																	y)) {
																																																if (!b2y.equals(
																																																		d2c)) {
																																																	if (!b2y.equals(
																																																			m2w)) {
																																																		if (!l2z.equals(
																																																				m)) {
																																																			if (!l2z.equals(
																																																					z)) {
																																																				if (!l2z.equals(
																																																						w)) {
																																																					if (!l2z.equals(
																																																							x)) {
																																																						if (!l2z.equals(
																																																								y)) {
																																																							if (!l2z.equals(
																																																									m2w)) {
																																																								if (!w.equals(
																																																										z)) {
																																																									if (!w.equals(
																																																											x)) {
																																																										if (!w.equals(
																																																												y)) {
																																																											if (!a.equals(
																																																													a2x)) {
																																																												if (!a.equals(
																																																														b)) {
																																																													if (!a.equals(
																																																															l)) {
																																																														if (!a.equals(
																																																																m)) {
																																																															if (!a.equals(
																																																																	b2y)) {
																																																																if (!a.equals(
																																																																		z)) {
																																																																	if (!a.equals(
																																																																			l2z)) {
																																																																		if (!a.equals(
																																																																				w)) {
																																																																			if (!a.equals(
																																																																					d)) {
																																																																				if (!a.equals(
																																																																						c)) {
																																																																					if (!a.equals(
																																																																							x)) {
																																																																						if (!a.equals(
																																																																								y)) {
																																																																							if (!a.equals(
																																																																									d2c)) {
																																																																								if (!a.equals(
																																																																										m2w)) {
																																																																									if (!d.equals(
																																																																											l)) {
																																																																										if (!d.equals(
																																																																												m)) {
																																																																											if (!d.equals(
																																																																													z)) {
																																																																												if (!d.equals(
																																																																														l2z)) {
																																																																													if (!d.equals(
																																																																															w)) {
																																																																														if (!d.equals(
																																																																																x)) {
																																																																															if (!d.equals(
																																																																																	y)) {
																																																																																if (!d.equals(
																																																																																		d2c)) {
																																																																																	if (!d.equals(
																																																																																			m2w)) {
																																																																																		if (!c.equals(
																																																																																				l)) {
																																																																																			if (!c.equals(
																																																																																					m)) {
																																																																																				if (!c.equals(
																																																																																						z)) {
																																																																																					if (!c.equals(
																																																																																							l2z)) {
																																																																																						if (!c.equals(
																																																																																								w)) {
																																																																																							if (!c.equals(
																																																																																									d)) {
																																																																																								if (!c.equals(
																																																																																										x)) {
																																																																																									if (!c.equals(
																																																																																											y)) {
																																																																																										if (!c.equals(
																																																																																												d2c)) {
																																																																																											if (!c.equals(
																																																																																													m2w)) {
																																																																																												if (!x.equals(
																																																																																														z)) {
																																																																																													if (!x.equals(
																																																																																															y)) {
																																																																																														if (!y.equals(
																																																																																																z)) {
																																																																																															if (!d2c.equals(
																																																																																																	l)) {
																																																																																																if (!d2c.equals(
																																																																																																		m)) {
																																																																																																	if (!d2c.equals(
																																																																																																			z)) {
																																																																																																		if (!d2c.equals(
																																																																																																				l2z)) {
																																																																																																			if (!d2c.equals(
																																																																																																					w)) {
																																																																																																				if (!d2c.equals(
																																																																																																						x)) {
																																																																																																					if (!d2c.equals(
																																																																																																							y)) {
																																																																																																						if (!d2c.equals(
																																																																																																								m2w)) {
																																																																																																							if (!m2w.equals(
																																																																																																									z)) {
																																																																																																								if (!m2w.equals(
																																																																																																										w)) {
																																																																																																									if (!m2w.equals(
																																																																																																											x)) {
																																																																																																										if (!m2w.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													l,
																																																																																																													m,
																																																																																																													b2y,
																																																																																																													z,
																																																																																																													l2z,
																																																																																																													w,
																																																																																																													a,
																																																																																																													d,
																																																																																																													c,
																																																																																																													x,
																																																																																																													y,
																																																																																																													d2c,
																																																																																																													m2w };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m, EObject b2y, EObject z,
			EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y, EObject m2w) {
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String b2y__b____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String b__m____last_name_prime = "last";
		String w__y____next_name_prime = "next";
		String m2w__m____source_name_prime = "source";
		String m2w__w____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, m2w, b2y__b____source,
				z__x____next, l2z__l____source, l2z__z____target, a__l____last, d__b____negative, a2x__a____source,
				c__x____positive, c__y____negative, a2x__x____target, b2y__y____target, b__m____last, w__y____next,
				m2w__m____source, m2w__w____target, d__a____positive };
	}

	public static final void pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m,
			EObject b2y, EObject z, EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y,
			EObject d2c, EObject m2w) {
		_this.registerObjects_FWD(ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, d2c, m2w);

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
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("l");
		EObject _localVariable_2 = match.getObject("m");
		EObject _localVariable_3 = match.getObject("a");
		EObject _localVariable_4 = match.getObject("d");
		EObject tmpB = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							return new Object[] { b, l, m, a, d, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_2_corematch_blackBBBBBFFB(While b, Assignment l,
			Assignment m, While a, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { b, l, m, a, d, c, d2c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(While b, Assignment l,
			Assignment m, While a, Decision d, Branch c, S2B d2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (m.equals(b.getLast())) {
							if (c.equals(d2c.getTarget())) {
								if (a.equals(d.getPositive())) {
									if (d.equals(d2c.getSource())) {
										_result.add(new Object[] { b, l, m, a, d, c, d2c });
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

	public static final Object[] pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(While b, Assignment l,
			Assignment m, While a, Decision d, Branch c, S2B d2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
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
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { b, l, m, a, d, c, d2c, isApplicableMatch, a__l____last, d__b____negative, b__m____last,
				d2c__c____target, d__a____positive, d2c__d____source };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, While b, Assignment l, Assignment m, While a, Decision d, Branch c,
			S2B d2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, l, m, a, d, c, d2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, l, m, a, d, c, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, While b, Assignment l, Assignment m, While a, Decision d, Branch c,
			S2B d2c) {
		Object[] result_pattern_decll2branchbb_2_4_solveCSP_binding = pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, b, l, m, a, d, c, d2c);
		if (result_pattern_decll2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_2_4_solveCSP_black = pattern_decll2branchbb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, l, m, a, d, c, d2c };
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
			Match match, Command z, Command w, Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { _this, match, z, w, c, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			Command z, Command w, Branch c, Branch x, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, w, c, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, w, c, x, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, Command z, Command w, Branch c, Branch x, Branch y) {
		Object[] result_pattern_decll2branchbb_10_2_SolveCSP_binding = pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, w, c, x, y);
		if (result_pattern_decll2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_10_2_SolveCSP_black = pattern_decll2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, w, c, x, y };
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
			Command z, Command w, Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { match, z, w, c, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Command z, Command w, Branch c, Branch x, Branch y) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		return new Object[] { match, z, w, c, x, y, z__x____next, c__x____positive, c__y____negative, w__y____next };
	}

	public static final Object[] pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match, Command z,
			Command w, Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { match, z, w, c, x, y };
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
			Match match, Command z, Command w, Branch c, Branch x, Branch y) {
		_this.registerObjectsToMatch_BWD(match, z, w, c, x, y);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject _localVariable_6 = isApplicableMatch.getObject("d2c");
		EObject tmpZ = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpD2c = _localVariable_6;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpD2c instanceof S2B) {
									S2B d2c = (S2B) tmpD2c;
									return new Object[] { z, w, d, c, x, y, d2c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Command z, Command w,
			Decision d, Branch c, Branch x, Branch y, S2B d2c, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, w, d, c, x, y, d2c, csp, _this, isApplicableMatch };
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
			Command w = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decll2branchbb_11_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[4];
			Branch y = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[5];
			S2B d2c = (S2B) result_pattern_decll2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_11_1_performtransformation_black = pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					z, w, d, c, x, y, d2c, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_11_1_performtransformation_black[7];

				return new Object[] { z, w, d, c, x, y, d2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_greenFFFFFBFBFBBBF(Command z,
			Command w, Decision d, Branch x, Branch y) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		d.setNegative(b);
		b.setLast(m);
		b2y.setSource(b);
		b2y.setTarget(y);
		l2z.setSource(l);
		l2z.setTarget(z);
		a.setLast(l);
		a2x.setSource(a);
		d.setPositive(a);
		m2w.setSource(m);
		m2w.setTarget(w);
		return new Object[] { a2x, b, l, m, b2y, z, l2z, w, a, d, x, y, m2w };
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2B a2x,
			While b, Assignment l, Assignment m, S2B b2y, Command z, S2N l2z, Command w, While a, Branch x, Branch y,
			S2N m2w) {
		if (!a2x.equals(b2y)) {
			if (!l.equals(m)) {
				if (!l2z.equals(m2w)) {
					if (!w.equals(z)) {
						if (!a.equals(b)) {
							if (!x.equals(y)) {
								return new Object[] { a2x, b, l, m, b2y, z, l2z, w, a, x, y, m2w };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2B a2x,
			While b, Assignment l, Assignment m, S2B b2y, Command z, S2N l2z, Command w, While a, Branch x, Branch y,
			S2N m2w) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(m2w);
		return new Object[] { ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, x, y, m2w };
	}

	public static final Object[] pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m, EObject b2y, EObject z,
			EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y, EObject d2c, EObject m2w) {
		if (!a2x.equals(b)) {
			if (!a2x.equals(l)) {
				if (!a2x.equals(m)) {
					if (!a2x.equals(b2y)) {
						if (!a2x.equals(z)) {
							if (!a2x.equals(l2z)) {
								if (!a2x.equals(w)) {
									if (!a2x.equals(d)) {
										if (!a2x.equals(c)) {
											if (!a2x.equals(x)) {
												if (!a2x.equals(y)) {
													if (!a2x.equals(d2c)) {
														if (!a2x.equals(m2w)) {
															if (!b.equals(l)) {
																if (!b.equals(m)) {
																	if (!b.equals(b2y)) {
																		if (!b.equals(z)) {
																			if (!b.equals(l2z)) {
																				if (!b.equals(w)) {
																					if (!b.equals(d)) {
																						if (!b.equals(c)) {
																							if (!b.equals(x)) {
																								if (!b.equals(y)) {
																									if (!b.equals(
																											d2c)) {
																										if (!b.equals(
																												m2w)) {
																											if (!l.equals(
																													m)) {
																												if (!l.equals(
																														z)) {
																													if (!l.equals(
																															l2z)) {
																														if (!l.equals(
																																w)) {
																															if (!l.equals(
																																	x)) {
																																if (!l.equals(
																																		y)) {
																																	if (!l.equals(
																																			m2w)) {
																																		if (!m.equals(
																																				z)) {
																																			if (!m.equals(
																																					w)) {
																																				if (!m.equals(
																																						x)) {
																																					if (!m.equals(
																																							y)) {
																																						if (!m.equals(
																																								m2w)) {
																																							if (!b2y.equals(
																																									l)) {
																																								if (!b2y.equals(
																																										m)) {
																																									if (!b2y.equals(
																																											z)) {
																																										if (!b2y.equals(
																																												l2z)) {
																																											if (!b2y.equals(
																																													w)) {
																																												if (!b2y.equals(
																																														d)) {
																																													if (!b2y.equals(
																																															c)) {
																																														if (!b2y.equals(
																																																x)) {
																																															if (!b2y.equals(
																																																	y)) {
																																																if (!b2y.equals(
																																																		d2c)) {
																																																	if (!b2y.equals(
																																																			m2w)) {
																																																		if (!l2z.equals(
																																																				m)) {
																																																			if (!l2z.equals(
																																																					z)) {
																																																				if (!l2z.equals(
																																																						w)) {
																																																					if (!l2z.equals(
																																																							x)) {
																																																						if (!l2z.equals(
																																																								y)) {
																																																							if (!l2z.equals(
																																																									m2w)) {
																																																								if (!w.equals(
																																																										z)) {
																																																									if (!w.equals(
																																																											x)) {
																																																										if (!w.equals(
																																																												y)) {
																																																											if (!a.equals(
																																																													a2x)) {
																																																												if (!a.equals(
																																																														b)) {
																																																													if (!a.equals(
																																																															l)) {
																																																														if (!a.equals(
																																																																m)) {
																																																															if (!a.equals(
																																																																	b2y)) {
																																																																if (!a.equals(
																																																																		z)) {
																																																																	if (!a.equals(
																																																																			l2z)) {
																																																																		if (!a.equals(
																																																																				w)) {
																																																																			if (!a.equals(
																																																																					d)) {
																																																																				if (!a.equals(
																																																																						c)) {
																																																																					if (!a.equals(
																																																																							x)) {
																																																																						if (!a.equals(
																																																																								y)) {
																																																																							if (!a.equals(
																																																																									d2c)) {
																																																																								if (!a.equals(
																																																																										m2w)) {
																																																																									if (!d.equals(
																																																																											l)) {
																																																																										if (!d.equals(
																																																																												m)) {
																																																																											if (!d.equals(
																																																																													z)) {
																																																																												if (!d.equals(
																																																																														l2z)) {
																																																																													if (!d.equals(
																																																																															w)) {
																																																																														if (!d.equals(
																																																																																x)) {
																																																																															if (!d.equals(
																																																																																	y)) {
																																																																																if (!d.equals(
																																																																																		d2c)) {
																																																																																	if (!d.equals(
																																																																																			m2w)) {
																																																																																		if (!c.equals(
																																																																																				l)) {
																																																																																			if (!c.equals(
																																																																																					m)) {
																																																																																				if (!c.equals(
																																																																																						z)) {
																																																																																					if (!c.equals(
																																																																																							l2z)) {
																																																																																						if (!c.equals(
																																																																																								w)) {
																																																																																							if (!c.equals(
																																																																																									d)) {
																																																																																								if (!c.equals(
																																																																																										x)) {
																																																																																									if (!c.equals(
																																																																																											y)) {
																																																																																										if (!c.equals(
																																																																																												d2c)) {
																																																																																											if (!c.equals(
																																																																																													m2w)) {
																																																																																												if (!x.equals(
																																																																																														z)) {
																																																																																													if (!x.equals(
																																																																																															y)) {
																																																																																														if (!y.equals(
																																																																																																z)) {
																																																																																															if (!d2c.equals(
																																																																																																	l)) {
																																																																																																if (!d2c.equals(
																																																																																																		m)) {
																																																																																																	if (!d2c.equals(
																																																																																																			z)) {
																																																																																																		if (!d2c.equals(
																																																																																																				l2z)) {
																																																																																																			if (!d2c.equals(
																																																																																																					w)) {
																																																																																																				if (!d2c.equals(
																																																																																																						x)) {
																																																																																																					if (!d2c.equals(
																																																																																																							y)) {
																																																																																																						if (!d2c.equals(
																																																																																																								m2w)) {
																																																																																																							if (!m2w.equals(
																																																																																																									z)) {
																																																																																																								if (!m2w.equals(
																																																																																																										w)) {
																																																																																																									if (!m2w.equals(
																																																																																																											x)) {
																																																																																																										if (!m2w.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													l,
																																																																																																													m,
																																																																																																													b2y,
																																																																																																													z,
																																																																																																													l2z,
																																																																																																													w,
																																																																																																													a,
																																																																																																													d,
																																																																																																													c,
																																																																																																													x,
																																																																																																													y,
																																																																																																													d2c,
																																																																																																													m2w };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m, EObject b2y, EObject z,
			EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y, EObject m2w) {
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String b2y__b____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String b__m____last_name_prime = "last";
		String w__y____next_name_prime = "next";
		String m2w__m____source_name_prime = "source";
		String m2w__w____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, m2w, b2y__b____source,
				z__x____next, l2z__l____source, l2z__z____target, a__l____last, d__b____negative, a2x__a____source,
				c__x____positive, c__y____negative, a2x__x____target, b2y__y____target, b__m____last, w__y____next,
				m2w__m____source, m2w__w____target, d__a____positive };
	}

	public static final void pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject a2x, EObject b, EObject l, EObject m,
			EObject b2y, EObject z, EObject l2z, EObject w, EObject a, EObject d, EObject c, EObject x, EObject y,
			EObject d2c, EObject m2w) {
		_this.registerObjects_BWD(ruleresult, a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, d2c, m2w);

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
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							return new Object[] { z, w, c, x, y, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_2_corematch_blackBBFBBBFB(Command z, Command w,
			Branch c, Branch x, Branch y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { z, w, d, c, x, y, d2c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(Command z, Command w,
			Decision d, Branch c, Branch x, Branch y, S2B d2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						if (x.equals(z.getNext())) {
							if (x.equals(c.getPositive())) {
								if (y.equals(c.getNegative())) {
									if (y.equals(w.getNext())) {
										if (c.equals(d2c.getTarget())) {
											if (d.equals(d2c.getSource())) {
												_result.add(new Object[] { z, w, d, c, x, y, d2c });
											}
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

	public static final Object[] pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Command z, Command w,
			Decision d, Branch c, Branch x, Branch y, S2B d2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d2c);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { z, w, d, c, x, y, d2c, isApplicableMatch, z__x____next, c__x____positive,
				c__y____negative, w__y____next, d2c__c____target, d2c__d____source };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Command z, Command w, Decision d, Branch c, Branch x, Branch y,
			S2B d2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, w, d, c, x, y, d2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, w, d, c, x, y, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Command z, Command w, Decision d, Branch c, Branch x, Branch y,
			S2B d2c) {
		Object[] result_pattern_decll2branchbb_12_4_solveCSP_binding = pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, w, d, c, x, y, d2c);
		if (result_pattern_decll2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_12_4_solveCSP_black = pattern_decll2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, w, d, c, x, y, d2c };
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
		for (Graph __DEC_z_root_806071 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_626091 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_626091)) {
							if (!x.equals(__DEC_z_positive_626091)) {
								if (!y.equals(__DEC_z_positive_626091)) {
									return new Object[] { z, c, x, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_893060 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_893060)) {
							if (!x.equals(__DEC_z_negative_893060)) {
								if (!y.equals(__DEC_z_negative_893060)) {
									return new Object[] { z, c, x, y };
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
		for (Graph __DEC_w_root_455387 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_190136 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_190136)) {
							if (!x.equals(__DEC_w_positive_190136)) {
								if (!y.equals(__DEC_w_positive_190136)) {
									return new Object[] { w, c, x, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_522258 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_522258)) {
							if (!x.equals(__DEC_w_negative_522258)) {
								if (!y.equals(__DEC_w_negative_522258)) {
									return new Object[] { w, c, x, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_12453 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_827687 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_827687)) {
							if (!c.equals(__DEC_x_positive_827687)) {
								if (!y.equals(__DEC_x_positive_827687)) {
									return new Object[] { x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_925606 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_925606)) {
							if (!c.equals(__DEC_x_negative_925606)) {
								if (!y.equals(__DEC_x_negative_925606)) {
									return new Object[] { x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(Branch y) {
		for (Graph __DEC_y_root_35452 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_449232 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_449232)) {
							if (!c.equals(__DEC_y_positive_449232)) {
								if (!x.equals(__DEC_y_positive_449232)) {
									return new Object[] { y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_65572 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_65572)) {
							if (!c.equals(__DEC_y_negative_65572)) {
								if (!x.equals(__DEC_y_negative_65572)) {
									return new Object[] { y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_20BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_21BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_22BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_23BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_24BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_26BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_27BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_next.getSrc();
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(z.getNext())) {
					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(x, z) == null) {
								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Branch) {
												Branch y = (Branch) tmpY;
												if (!c.equals(y)) {
													if (!x.equals(y)) {
														if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																c, z) == null) {
															if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																	c, z) == null) {
																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																		c, x) == null) {
																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(
																			z, c, x, y) == null) {
																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(
																				z, c, x, y) == null) {
																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																					x, c, y) == null) {
																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																						x, c, y) == null) {
																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(
																							y) == null) {
																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(
																								y, c, x) == null) {
																							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(
																									y, c, x) == null) {
																								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																										y, z) == null) {
																									if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																											y,
																											z) == null) {
																										if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																												c,
																												y) == null) {
																											if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_26BB(
																													x,
																													y) == null) {
																												if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_27BB(
																														x,
																														y) == null) {
																													for (Node tmpW : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	y,
																																	Node.class,
																																	"next")) {
																														if (tmpW instanceof Command) {
																															Command w = (Command) tmpW;
																															if (!w.equals(
																																	z)) {
																																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																																		w) == null) {
																																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																																			w,
																																			c,
																																			x,
																																			y) == null) {
																																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																																				w,
																																				c,
																																				x,
																																				y) == null) {
																																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(
																																					c,
																																					w) == null) {
																																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(
																																						x,
																																						w) == null) {
																																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_20BB(
																																							y,
																																							w) == null) {
																																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_21BB(
																																								c,
																																								w) == null) {
																																							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_22BB(
																																									x,
																																									w) == null) {
																																								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_23BB(
																																										y,
																																										w) == null) {
																																									_result.add(
																																											new Object[] {
																																													z,
																																													w,
																																													c,
																																													x,
																																													y,
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
			decll2branchbb _this, Match match, Command z, Command w, Branch c, Branch x, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, w, c, x, y);
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

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_0BB(While b, Decision d) {
		for (Decision __DEC_b_positive_422215 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_422215)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_476393 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_476393)) {
					if (!a.equals(__DEC_b_first_476393)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_694650 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_694650)) {
					if (!a.equals(__DEC_b_last_694650)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3B(While b) {
		for (Program __DEC_b_first_432847 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_536228 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_536228)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_448355 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_448355)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_393005 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_393005)) {
					if (!a.equals(__DEC_l_first_393005)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_901715 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_901715)) {
					if (!a.equals(__DEC_l_last_901715)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_596320 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_803661 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_803661)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_878721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_878721)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_508907 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_508907)) {
					if (!a.equals(__DEC_m_first_508907)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_972720 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_972720)) {
					if (!a.equals(__DEC_m_last_972720)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13B(Assignment m) {
		for (Program __DEC_m_first_14119 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(While a, Decision d) {
		for (Decision __DEC_a_negative_307080 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_307080)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_517783 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_517783)) {
					if (!b.equals(__DEC_a_first_517783)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_746270 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_746270)) {
					if (!b.equals(__DEC_a_last_746270)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(While a) {
		for (Program __DEC_a_first_879790 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While b,
			Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(While a,
			Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
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
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(a.getLast())) {
					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(a) == null) {
						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8B(l) == null) {
							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(a, l) == null) {
								for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
										Decision.class, "positive")) {
									Statement tmpB = d.getNegative();
									if (tmpB instanceof While) {
										While b = (While) tmpB;
										if (!a.equals(b)) {
											Statement tmpM = b.getLast();
											if (tmpM instanceof Assignment) {
												Assignment m = (Assignment) tmpM;
												if (!l.equals(m)) {
													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4BB(
															l, d) == null) {
														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																l, d) == null) {
															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																	a, d) == null) {
																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																		d, l) == null) {
																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																			d, l) == null) {
																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(
																				d, a) == null) {
																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
																					b, d) == null) {
																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																						b, a) == null) {
																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BB(
																							b, a) == null) {
																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3B(
																								b) == null) {
																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BBB(
																									l, b, a) == null) {
																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																										l, b,
																										a) == null) {
																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																											a,
																											b) == null) {
																										if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																												a,
																												b) == null) {
																											if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																													d,
																													b) == null) {
																												if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																														b,
																														l) == null) {
																													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																															b,
																															l) == null) {
																														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(
																																b,
																																a) == null) {
																															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(
																																	b,
																																	a) == null) {
																																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9BB(
																																		m,
																																		d) == null) {
																																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BB(
																																			m,
																																			d) == null) {
																																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(
																																				m,
																																				b,
																																				a) == null) {
																																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(
																																					m,
																																					b,
																																					a) == null) {
																																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																																						m) == null) {
																																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																							d,
																																							m) == null) {
																																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																								d,
																																								m) == null) {
																																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																									b,
																																									m) == null) {
																																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																																										a,
																																										m) == null) {
																																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																																											a,
																																											m) == null) {
																																										_result.add(
																																												new Object[] {
																																														b,
																																														l,
																																														m,
																																														a,
																																														d,
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
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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
			decll2branchbb _this, Match match, While b, Assignment l, Assignment m, While a, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, l, m, a, d);
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
		EObject _localVariable_0 = sourceMatch.getObject("b");
		EObject _localVariable_1 = sourceMatch.getObject("l");
		EObject _localVariable_2 = sourceMatch.getObject("m");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = targetMatch.getObject("w");
		EObject _localVariable_5 = sourceMatch.getObject("a");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = targetMatch.getObject("c");
		EObject _localVariable_8 = targetMatch.getObject("x");
		EObject _localVariable_9 = targetMatch.getObject("y");
		EObject tmpB = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpA = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpC = _localVariable_7;
		EObject tmpX = _localVariable_8;
		EObject tmpY = _localVariable_9;
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpW instanceof Command) {
							Command w = (Command) tmpW;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpC instanceof Branch) {
										Branch c = (Branch) tmpC;
										if (tmpX instanceof Branch) {
											Branch x = (Branch) tmpX;
											if (tmpY instanceof Branch) {
												Branch y = (Branch) tmpY;
												return new Object[] { b, l, m, z, w, a, d, c, x, y, sourceMatch,
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

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While b, Assignment l,
			Assignment m, Command z, Command w, While a, Decision d, Branch c, Branch x, Branch y, Match sourceMatch,
			Match targetMatch) {
		if (!l.equals(m)) {
			if (!w.equals(z)) {
				if (!a.equals(b)) {
					if (!c.equals(x)) {
						if (!c.equals(y)) {
							if (!x.equals(y)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch };
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
			While b = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[0];
			Assignment l = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[1];
			Assignment m = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[2];
			Command z = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[3];
			Command w = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[4];
			While a = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch c = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[7];
			Branch x = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[8];
			Branch y = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black = pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch);
			if (result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(decll2branchbb _this,
			While b, Assignment l, Assignment m, Command z, Command w, While a, Decision d, Branch c, Branch x,
			Branch y, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			decll2branchbb _this, While b, Assignment l, Assignment m, Command z, Command w, While a, Decision d,
			Branch c, Branch x, Branch y, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decll2branchbb_24_3_solvecsp_binding = pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch);
		if (result_pattern_decll2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decll2branchbb_24_3_solvecsp_black = pattern_decll2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decll2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, b, l, m, z, w, a, d, c, x, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_24_5_matchcorrcontext_blackBBFBB(Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d, c, d2c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(While b,
			Assignment l, Assignment m, Command z, Command w, While a, Decision d, Branch c, Branch x, Branch y,
			CCMatch ccMatch) {
		if (!l.equals(m)) {
			if (!w.equals(z)) {
				if (!a.equals(b)) {
					if (!c.equals(x)) {
						if (!c.equals(y)) {
							if (!x.equals(y)) {
								return new Object[] { b, l, m, z, w, a, d, c, x, y, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_greenFBBBFBFBBBBFB(While b,
			Assignment l, Assignment m, Command z, Command w, While a, Branch x, Branch y, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		return new Object[] { a2x, b, l, m, b2y, z, l2z, w, a, x, y, m2w, ccMatch };
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

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_0BB(While b, Decision d) {
		for (Decision __DEC_b_positive_101364 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_101364)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_793962 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_793962)) {
					if (!a.equals(__DEC_b_first_793962)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_919903 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_919903)) {
					if (!a.equals(__DEC_b_last_919903)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3B(While b) {
		for (Program __DEC_b_first_637371 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_447630 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_447630)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_853629 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_853629)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_557314 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_557314)) {
					if (!a.equals(__DEC_l_first_557314)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_202083 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_202083)) {
					if (!a.equals(__DEC_l_last_202083)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_700261 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_138549 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_138549)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_895243 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_895243)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_627597 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_627597)) {
					if (!a.equals(__DEC_m_first_627597)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_544815 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_544815)) {
					if (!a.equals(__DEC_m_last_544815)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13B(Assignment m) {
		for (Program __DEC_m_first_817965 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(While a, Decision d) {
		for (Decision __DEC_a_negative_57264 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_57264)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_48141 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_48141)) {
					if (!b.equals(__DEC_a_first_48141)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_500111 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_500111)) {
					if (!b.equals(__DEC_a_last_500111)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(While a) {
		for (Program __DEC_a_first_809671 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_19BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_20BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_21BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(Decision d, Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(Decision d, Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(While b, Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(While a, Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
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

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(While b, Assignment l,
			Assignment m, While a, Decision d) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (m.equals(b.getLast())) {
							if (a.equals(d.getPositive())) {
								if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
									if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
										if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BB(b, a) == null) {
											if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3B(b) == null) {
												if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4BB(l,
														d) == null) {
													if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(l,
															d) == null) {
														if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BBB(
																l, b, a) == null) {
															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7BBB(
																	l, b, a) == null) {
																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8B(
																		l) == null) {
																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9BB(
																			m, d) == null) {
																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BB(
																				m, d) == null) {
																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BBB(
																					m, b, a) == null) {
																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12BBB(
																						m, b, a) == null) {
																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13B(
																							m) == null) {
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
																												b) == null) {
																											if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_19BB(
																													d,
																													l) == null) {
																												if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_20BB(
																														d,
																														l) == null) {
																													if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_21BB(
																															b,
																															l) == null) {
																														if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(
																																a,
																																l) == null) {
																															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(
																																	b,
																																	l) == null) {
																																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																		d,
																																		m) == null) {
																																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																			d,
																																			m) == null) {
																																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																				b,
																																				m) == null) {
																																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																					a,
																																					m) == null) {
																																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																						a,
																																						m) == null) {
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
																																										b,
																																										l,
																																										m,
																																										a,
																																										d };
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		for (Graph __DEC_z_root_150994 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_538261 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_538261)) {
							if (!x.equals(__DEC_z_positive_538261)) {
								if (!y.equals(__DEC_z_positive_538261)) {
									return new Object[] { z, c, x, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_227515 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_227515)) {
							if (!x.equals(__DEC_z_negative_227515)) {
								if (!y.equals(__DEC_z_negative_227515)) {
									return new Object[] { z, c, x, y };
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
		for (Graph __DEC_w_root_225261 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_543842 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_543842)) {
							if (!x.equals(__DEC_w_positive_543842)) {
								if (!y.equals(__DEC_w_positive_543842)) {
									return new Object[] { w, c, x, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_158060 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_158060)) {
							if (!x.equals(__DEC_w_negative_158060)) {
								if (!y.equals(__DEC_w_negative_158060)) {
									return new Object[] { w, c, x, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_773389 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_686316 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_686316)) {
							if (!c.equals(__DEC_x_positive_686316)) {
								if (!y.equals(__DEC_x_positive_686316)) {
									return new Object[] { x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_199488 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_199488)) {
							if (!c.equals(__DEC_x_negative_199488)) {
								if (!y.equals(__DEC_x_negative_199488)) {
									return new Object[] { x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(Branch y) {
		for (Graph __DEC_y_root_866702 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_755968 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_755968)) {
							if (!c.equals(__DEC_y_positive_755968)) {
								if (!x.equals(__DEC_y_positive_755968)) {
									return new Object[] { y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_522070 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_522070)) {
							if (!c.equals(__DEC_y_negative_522070)) {
								if (!x.equals(__DEC_y_negative_522070)) {
									return new Object[] { y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_20BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_21BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_22BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_23BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_24BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_26BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_27BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(Command z, Command w, Branch c,
			Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						if (x.equals(z.getNext())) {
							if (x.equals(c.getPositive())) {
								if (y.equals(c.getNegative())) {
									if (y.equals(w.getNext())) {
										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBBB(z, c, x,
													y) == null) {
												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBBB(z, c, x,
														y) == null) {
													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(
															w) == null) {
														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBBB(
																w, c, x, y) == null) {
															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBBB(
																	w, c, x, y) == null) {
																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(
																		x) == null) {
																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																			x, c, y) == null) {
																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																				x, c, y) == null) {
																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(
																					y) == null) {
																				if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBB(
																						y, c, x) == null) {
																					if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBB(
																							y, c, x) == null) {
																						if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_12BB(
																								c, z) == null) {
																							if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_13BB(
																									x, z) == null) {
																								if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_14BB(
																										y, z) == null) {
																									if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_15BB(
																											c,
																											z) == null) {
																										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_16BB(
																												x,
																												z) == null) {
																											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_17BB(
																													y,
																													z) == null) {
																												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(
																														c,
																														w) == null) {
																													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															x,
																															w) == null) {
																														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_20BB(
																																y,
																																w) == null) {
																															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_21BB(
																																	c,
																																	w) == null) {
																																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_22BB(
																																		x,
																																		w) == null) {
																																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_23BB(
																																			y,
																																			w) == null) {
																																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_24BB(
																																				c,
																																				x) == null) {
																																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(
																																					c,
																																					y) == null) {
																																				if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_26BB(
																																						x,
																																						y) == null) {
																																					if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_27BB(
																																							x,
																																							y) == null) {
																																						return new Object[] {
																																								z,
																																								w,
																																								c,
																																								x,
																																								y };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
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
							if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, d) == null) {
									if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											c) == null) {
										_result.add(
												new Object[] { d2cList, d, d2c, c, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, c, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decll2branchbb_29_3_solveCSP_binding = pattern_decll2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, c, d2c, ruleResult);
		if (result_pattern_decll2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_29_3_solveCSP_black = pattern_decll2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_29_4_checkCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_29_5_checknacs_blackBBB(Decision d, Branch c, S2B d2c) {
		return new Object[] { d, c, d2c };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_blackBBBB(Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, c, d2c, ruleResult };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_greenFFFFFFFFFBBFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.getSourceObjects().add(l);
		b.setLast(m);
		ruleResult.getSourceObjects().add(m);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.getTargetObjects().add(z);
		l2z.setSource(l);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		ruleResult.getTargetObjects().add(w);
		a.setLast(l);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		c.setNegative(y);
		b2y.setTarget(y);
		w.setNext(y);
		ruleResult.getTargetObjects().add(y);
		m2w.setSource(m);
		m2w.setTarget(w);
		ruleResult.getCorrObjects().add(m2w);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2x, b, l, m, b2y, z, l2z, w, a, d, c, x, y, m2w, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decll2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decll2branchbbImpl
