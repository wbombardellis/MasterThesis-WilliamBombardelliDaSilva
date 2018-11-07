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
	public boolean isAppropriate_FWD(Match match, While b, While a, Assignment m, Decision d, Assignment l) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(this, match,
				b, a, m, d, l);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[m] = " + m + ", "
					+ "[d] = " + d + ", " + "[l] = " + l + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, b, a, m, d, l);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[m] = " + m + ", "
					+ "[d] = " + d + ", " + "[l] = " + l + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, b, a, m, d, l);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[a] = " + a + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[l] = " + l + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, b, a, m,
					d, l);
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(match, b, a, m, d, l);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[a] = " + a + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[l] = " + l + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, b, a, m,
					d, l);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Assignment m = (Assignment) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		Assignment l = (Assignment) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_1_performtransformation_greenBFBBFFFBFBFFF(c, b, a, m, l);
		S2B a2x = (S2B) result1_green[1];
		S2N l2z = (S2N) result1_green[4];
		Command z = (Command) result1_green[5];
		S2N m2w = (S2N) result1_green[6];
		Branch y = (Branch) result1_green[8];
		Command w = (Command) result1_green[10];
		Branch x = (Branch) result1_green[11];
		S2B b2y = (S2B) result1_green[12];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(a2x, b, a, l2z, z, m2w, m, y, l,
						w, x, b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[b] = "
					+ b + ", " + "[a] = " + a + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[m2w] = " + m2w
					+ ", " + "[m] = " + m + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(a2x, b, a, l2z, z, m2w, m, y,
						l, w, x, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, a2x, b, a, l2z, z,
						m2w, d2c, m, y, d, l, w, x, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[m2w] = " + m2w + ", " + "[d2c] = " + d2c + ", "
					+ "[m] = " + m + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[w] = "
					+ w + ", " + "[x] = " + x + ", " + "[b2y] = " + b2y + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, a2x, b, a, l2z, z, m2w, m, y, d, l, w, x, b2y);
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, c,
				a2x, b, a, l2z, z, m2w, d2c, m, y, d, l, w, x, b2y);
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
		While a = (While) result2_binding[1];
		Assignment m = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		Assignment l = (Assignment) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_2_2_corematch_blackFBBFBBBB(b, a, m, d,
				l, match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(c, b,
					a, d2c, m, d, l)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(c, b, a, d2c, m, d, l);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, b, a,
								d2c, m, d, l);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[b] = " + b
							+ ", " + "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[m] = " + m + ", " + "[d] = " + d
							+ ", " + "[l] = " + l + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("m", m);
		match.registerObject("d", d);
		match.registerObject("l", l);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While b, While a, Assignment m, Decision d, Assignment l) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, While b, While a, S2B d2c,
			Assignment m, Decision d, Assignment l) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("l", l);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a,
			EObject l2z, EObject z, EObject m2w, EObject d2c, EObject m, EObject y, EObject d, EObject l, EObject w,
			EObject x, EObject b2y) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch c, Command z, Branch y, Command w, Branch x) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, c, z, y, w, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[w] = " + w + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, c, z, y, w, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[w] = " + w + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, c, z, y, w, x);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[x] = " + x + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, c, z, y,
					w, x);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(match, c, z, y, w, x);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[x] = " + x + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, c, z,
					y, w, x);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		Command z = (Command) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Branch y = (Branch) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Command w = (Command) result1_bindingAndBlack[5];
		Branch x = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_1_performtransformation_greenFFFFBFFBBFBBF(z, y, d, w, x);
		S2B a2x = (S2B) result1_green[0];
		While b = (While) result1_green[1];
		While a = (While) result1_green[2];
		S2N l2z = (S2N) result1_green[3];
		S2N m2w = (S2N) result1_green[5];
		Assignment m = (Assignment) result1_green[6];
		Assignment l = (Assignment) result1_green[9];
		S2B b2y = (S2B) result1_green[12];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(a2x, b, a, l2z, z, m2w, m, y,
						l, w, x, b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[b] = "
					+ b + ", " + "[a] = " + a + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[m2w] = " + m2w
					+ ", " + "[m] = " + m + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(a2x, b, a, l2z, z, m2w, m, y,
						l, w, x, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, a2x, b, a, l2z, z,
						m2w, d2c, m, y, d, l, w, x, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[m2w] = " + m2w + ", " + "[d2c] = " + d2c + ", "
					+ "[m] = " + m + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[w] = "
					+ w + ", " + "[x] = " + x + ", " + "[b2y] = " + b2y + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, a2x, b, a, l2z, z, m2w, m, y, d, l, w, x, b2y);
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, c,
				a2x, b, a, l2z, z, m2w, d2c, m, y, d, l, w, x, b2y);
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
		Branch c = (Branch) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		Command w = (Command) result2_binding[3];
		Branch x = (Branch) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_12_2_corematch_blackBBFBFBBB(c, z, y, w,
				x, match)) {
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(c, z,
					d2c, y, d, w, x)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(c, z, d2c, y, d, w, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, z,
								d2c, y, d, w, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[z] = " + z
							+ ", " + "[d2c] = " + d2c + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[w] = " + w
							+ ", " + "[x] = " + x + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch c, Command z, Branch y, Command w, Branch x) {
		match.registerObject("c", c);
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("w", w);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Command z, Branch y, Command w, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, Command z, S2B d2c, Branch y,
			Decision d, Command w, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a,
			EObject l2z, EObject z, EObject m2w, EObject d2c, EObject m, EObject y, EObject d, EObject l, EObject w,
			EObject x, EObject b2y) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_84(EMoflonEdge _edge_next) {

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
			Branch c = (Branch) result2_black[0];
			Command z = (Command) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Command w = (Command) result2_black[3];
			Branch x = (Branch) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, c, z, y, w, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(EMoflonEdge _edge_last) {

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
			While a = (While) result2_black[1];
			Assignment m = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Assignment l = (Assignment) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, b, a, m, d, l)) {
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
		Branch c = (Branch) result2_bindingAndBlack[0];
		While b = (While) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Command z = (Command) result2_bindingAndBlack[3];
		Assignment m = (Assignment) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Assignment l = (Assignment) result2_bindingAndBlack[7];
		Command w = (Command) result2_bindingAndBlack[8];
		Branch x = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, c, b, a, z, m, y, d, l, w, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[m] = "
					+ m + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_blackBFBBB(c,
					d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decll2branchbbImpl
						.pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(c, b, a, z, m, y, d, l, w, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[m] = " + m + ", "
							+ "[y] = " + y + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[w] = " + w + ", "
							+ "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decll2branchbbImpl.pattern_decll2branchbb_24_6_createcorrespondence_greenFBBFBFBBBBBFB(b, a, z, m, y, l,
						w, x, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[0];
				//nothing S2N l2z = (S2N) result6_green[3];
				//nothing S2N m2w = (S2N) result6_green[5];
				//nothing S2B b2y = (S2B) result6_green[11];

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
	public CSP isApplicable_solveCsp_CC(Branch c, While b, While a, Command z, Assignment m, Branch y, Decision d,
			Assignment l, Command w, Branch x, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While b, While a, Assignment m, Decision d, Assignment l) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(b, a, m, d,
				l);
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
	public boolean checkDEC_BWD(Branch c, Command z, Branch y, Command w, Branch x) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(c, z, y, w,
				x);
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
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decll2branchbbImpl
					.pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d2c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decll2branchbbImpl.pattern_decll2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decll2branchbbImpl.pattern_decll2branchbb_29_5_checknacs_blackBBB(c, d2c, d);
				if (result5_black != null) {

					Object[] result6_black = decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_blackBBBB(c, d2c, d,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_greenBFFFFFFFFBFFFFB(c, d, ruleResult);
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing While b = (While) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing S2N l2z = (S2N) result6_green[4];
					//nothing Command z = (Command) result6_green[5];
					//nothing S2N m2w = (S2N) result6_green[6];
					//nothing Assignment m = (Assignment) result6_green[7];
					//nothing Branch y = (Branch) result6_green[8];
					//nothing Assignment l = (Assignment) result6_green[10];
					//nothing Command w = (Command) result6_green[11];
					//nothing Branch x = (Branch) result6_green[12];
					//nothing S2B b2y = (S2B) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4), (Assignment) arguments.get(5));
			return null;
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_WHILE_WHILE_S2B_ASSIGNMENT_DECISION_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (Assignment) arguments.get(7));
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_S2B_BRANCH_DECISION_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(Decision) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_84((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_WHILE_WHILE_COMMAND_ASSIGNMENT_BRANCH_DECISION_ASSIGNMENT_COMMAND_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (Decision) arguments.get(6), (Assignment) arguments.get(7),
					(Command) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(decll2branchbb _this,
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { _this, match, b, a, m, d, l };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			While b, While a, Assignment m, Decision d, Assignment l) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, m, d, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, m, d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		Object[] result_pattern_decll2branchbb_0_2_SolveCSP_binding = pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, b, a, m, d, l);
		if (result_pattern_decll2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_0_2_SolveCSP_black = pattern_decll2branchbb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, m, d, l };
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
			While b, While a, Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, b, a, m, d, l };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			While b, While a, Assignment m, Decision d, Assignment l) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(l);
		String a__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		a__l____last.setName(a__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		return new Object[] { match, b, a, m, d, l, a__l____last, d__a____positive, d__b____negative, b__m____last };
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match, While b,
			While a, Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, b, a, m, d, l };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(decll2branchbb _this,
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		_this.registerObjectsToMatch_FWD(match, b, a, m, d, l);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("m");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("l");
		EObject tmpC = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpM = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpL = _localVariable_6;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpM instanceof Assignment) {
							Assignment m = (Assignment) tmpM;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								if (tmpL instanceof Assignment) {
									Assignment l = (Assignment) tmpL;
									return new Object[] { c, b, a, d2c, m, d, l, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(Branch c, While b,
			While a, S2B d2c, Assignment m, Decision d, Assignment l, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { c, b, a, d2c, m, d, l, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decll2branchbb_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decll2branchbb_1_1_performtransformation_binding[3];
			Assignment m = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decll2branchbb_1_1_performtransformation_binding[5];
			Assignment l = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_1_1_performtransformation_black = pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					c, b, a, d2c, m, d, l, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_1_1_performtransformation_black[7];

				return new Object[] { c, b, a, d2c, m, d, l, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_greenBFBBFFFBFBFFF(Branch c, While b,
			While a, Assignment m, Assignment l) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setSource(a);
		l2z.setSource(l);
		l2z.setTarget(z);
		m2w.setSource(m);
		c.setNegative(y);
		m2w.setTarget(w);
		w.setNext(y);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { c, a2x, b, a, l2z, z, m2w, m, y, l, w, x, b2y };
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2B a2x,
			While b, While a, S2N l2z, Command z, S2N m2w, Assignment m, Branch y, Assignment l, Command w, Branch x,
			S2B b2y) {
		if (!a2x.equals(b2y)) {
			if (!a.equals(b)) {
				if (!l2z.equals(m2w)) {
					if (!l.equals(m)) {
						if (!w.equals(z)) {
							if (!x.equals(y)) {
								return new Object[] { a2x, b, a, l2z, z, m2w, m, y, l, w, x, b2y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2B a2x,
			While b, While a, S2N l2z, Command z, S2N m2w, Assignment m, Branch y, Assignment l, Command w, Branch x,
			S2B b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, a2x, b, a, l2z, z, m2w, m, y, l, w, x, b2y };
	}

	public static final Object[] pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a, EObject l2z, EObject z,
			EObject m2w, EObject d2c, EObject m, EObject y, EObject d, EObject l, EObject w, EObject x, EObject b2y) {
		if (!c.equals(l2z)) {
			if (!c.equals(z)) {
				if (!c.equals(m2w)) {
					if (!c.equals(d2c)) {
						if (!c.equals(m)) {
							if (!c.equals(y)) {
								if (!c.equals(d)) {
									if (!c.equals(l)) {
										if (!c.equals(w)) {
											if (!c.equals(x)) {
												if (!a2x.equals(c)) {
													if (!a2x.equals(b)) {
														if (!a2x.equals(l2z)) {
															if (!a2x.equals(z)) {
																if (!a2x.equals(m2w)) {
																	if (!a2x.equals(d2c)) {
																		if (!a2x.equals(m)) {
																			if (!a2x.equals(y)) {
																				if (!a2x.equals(d)) {
																					if (!a2x.equals(l)) {
																						if (!a2x.equals(w)) {
																							if (!a2x.equals(x)) {
																								if (!a2x.equals(b2y)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												l2z)) {
																											if (!b.equals(
																													z)) {
																												if (!b.equals(
																														m2w)) {
																													if (!b.equals(
																															d2c)) {
																														if (!b.equals(
																																m)) {
																															if (!b.equals(
																																	y)) {
																																if (!b.equals(
																																		d)) {
																																	if (!b.equals(
																																			l)) {
																																		if (!b.equals(
																																				w)) {
																																			if (!b.equals(
																																					x)) {
																																				if (!b.equals(
																																						b2y)) {
																																					if (!a.equals(
																																							c)) {
																																						if (!a.equals(
																																								a2x)) {
																																							if (!a.equals(
																																									b)) {
																																								if (!a.equals(
																																										l2z)) {
																																									if (!a.equals(
																																											z)) {
																																										if (!a.equals(
																																												m2w)) {
																																											if (!a.equals(
																																													d2c)) {
																																												if (!a.equals(
																																														m)) {
																																													if (!a.equals(
																																															y)) {
																																														if (!a.equals(
																																																d)) {
																																															if (!a.equals(
																																																	l)) {
																																																if (!a.equals(
																																																		w)) {
																																																	if (!a.equals(
																																																			x)) {
																																																		if (!a.equals(
																																																				b2y)) {
																																																			if (!l2z.equals(
																																																					z)) {
																																																				if (!l2z.equals(
																																																						m2w)) {
																																																					if (!l2z.equals(
																																																							m)) {
																																																						if (!l2z.equals(
																																																								y)) {
																																																							if (!l2z.equals(
																																																									w)) {
																																																								if (!l2z.equals(
																																																										x)) {
																																																									if (!m2w.equals(
																																																											z)) {
																																																										if (!m2w.equals(
																																																												y)) {
																																																											if (!m2w.equals(
																																																													w)) {
																																																												if (!m2w.equals(
																																																														x)) {
																																																													if (!d2c.equals(
																																																															l2z)) {
																																																														if (!d2c.equals(
																																																																z)) {
																																																															if (!d2c.equals(
																																																																	m2w)) {
																																																																if (!d2c.equals(
																																																																		m)) {
																																																																	if (!d2c.equals(
																																																																			y)) {
																																																																		if (!d2c.equals(
																																																																				l)) {
																																																																			if (!d2c.equals(
																																																																					w)) {
																																																																				if (!d2c.equals(
																																																																						x)) {
																																																																					if (!m.equals(
																																																																							z)) {
																																																																						if (!m.equals(
																																																																								m2w)) {
																																																																							if (!m.equals(
																																																																									y)) {
																																																																								if (!m.equals(
																																																																										w)) {
																																																																									if (!m.equals(
																																																																											x)) {
																																																																										if (!y.equals(
																																																																												z)) {
																																																																											if (!d.equals(
																																																																													l2z)) {
																																																																												if (!d.equals(
																																																																														z)) {
																																																																													if (!d.equals(
																																																																															m2w)) {
																																																																														if (!d.equals(
																																																																																d2c)) {
																																																																															if (!d.equals(
																																																																																	m)) {
																																																																																if (!d.equals(
																																																																																		y)) {
																																																																																	if (!d.equals(
																																																																																			l)) {
																																																																																		if (!d.equals(
																																																																																				w)) {
																																																																																			if (!d.equals(
																																																																																					x)) {
																																																																																				if (!l.equals(
																																																																																						l2z)) {
																																																																																					if (!l.equals(
																																																																																							z)) {
																																																																																						if (!l.equals(
																																																																																								m2w)) {
																																																																																							if (!l.equals(
																																																																																									m)) {
																																																																																								if (!l.equals(
																																																																																										y)) {
																																																																																									if (!l.equals(
																																																																																											w)) {
																																																																																										if (!l.equals(
																																																																																												x)) {
																																																																																											if (!w.equals(
																																																																																													z)) {
																																																																																												if (!w.equals(
																																																																																														y)) {
																																																																																													if (!w.equals(
																																																																																															x)) {
																																																																																														if (!x.equals(
																																																																																																z)) {
																																																																																															if (!x.equals(
																																																																																																	y)) {
																																																																																																if (!b2y.equals(
																																																																																																		c)) {
																																																																																																	if (!b2y.equals(
																																																																																																			l2z)) {
																																																																																																		if (!b2y.equals(
																																																																																																				z)) {
																																																																																																			if (!b2y.equals(
																																																																																																					m2w)) {
																																																																																																				if (!b2y.equals(
																																																																																																						d2c)) {
																																																																																																					if (!b2y.equals(
																																																																																																							m)) {
																																																																																																						if (!b2y.equals(
																																																																																																								y)) {
																																																																																																							if (!b2y.equals(
																																																																																																									d)) {
																																																																																																								if (!b2y.equals(
																																																																																																										l)) {
																																																																																																									if (!b2y.equals(
																																																																																																											w)) {
																																																																																																										if (!b2y.equals(
																																																																																																												x)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													a,
																																																																																																													l2z,
																																																																																																													z,
																																																																																																													m2w,
																																																																																																													d2c,
																																																																																																													m,
																																																																																																													y,
																																																																																																													d,
																																																																																																													l,
																																																																																																													w,
																																																																																																													x,
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
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a, EObject l2z, EObject z,
			EObject m2w, EObject m, EObject y, EObject d, EObject l, EObject w, EObject x, EObject b2y) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String a__l____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String m2w__m____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b__m____last_name_prime = "last";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		return new Object[] { ruleresult, c, a2x, b, a, l2z, z, m2w, m, y, d, l, w, x, b2y, a__l____last,
				a2x__a____source, m2w__m____source, z__x____next, d__a____positive, d__b____negative, l2z__l____source,
				c__x____positive, m2w__w____target, l2z__z____target, b2y__y____target, b2y__b____source, b__m____last,
				c__y____negative, a2x__x____target, w__y____next };
	}

	public static final void pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a,
			EObject l2z, EObject z, EObject m2w, EObject d2c, EObject m, EObject y, EObject d, EObject l, EObject w,
			EObject x, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, c, a2x, b, a, l2z, z, m2w, d2c, m, y, d, l, w, x, b2y);

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
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("m");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("l");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpL = _localVariable_4;
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							return new Object[] { b, a, m, d, l, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_2_corematch_blackFBBFBBBB(While b, While a,
			Assignment m, Decision d, Assignment l, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { c, b, a, d2c, m, d, l, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(Branch c, While b,
			While a, S2B d2c, Assignment m, Decision d, Assignment l) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (l.equals(a.getLast())) {
					if (c.equals(d2c.getTarget())) {
						if (a.equals(d.getPositive())) {
							if (d.equals(d2c.getSource())) {
								if (b.equals(d.getNegative())) {
									if (m.equals(b.getLast())) {
										_result.add(new Object[] { c, b, a, d2c, m, d, l });
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

	public static final Object[] pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(Branch c, While b, While a,
			S2B d2c, Assignment m, Decision d, Assignment l) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__l____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String b__m____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(l);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		a__l____last.setName(a__l____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		return new Object[] { c, b, a, d2c, m, d, l, isApplicableMatch, a__l____last, d2c__c____target,
				d__a____positive, d2c__d____source, d__b____negative, b__m____last };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, While b, While a, S2B d2c, Assignment m, Decision d,
			Assignment l) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, b, a, d2c, m, d, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, b, a, d2c, m, d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, While b, While a, S2B d2c, Assignment m, Decision d,
			Assignment l) {
		Object[] result_pattern_decll2branchbb_2_4_solveCSP_binding = pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, b, a, d2c, m, d, l);
		if (result_pattern_decll2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_2_4_solveCSP_black = pattern_decll2branchbb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, b, a, d2c, m, d, l };
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
			Match match, Branch c, Command z, Branch y, Command w, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { _this, match, c, z, y, w, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			Branch c, Command z, Branch y, Command w, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, z, y, w, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, z, y, w, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, Branch c, Command z, Branch y, Command w, Branch x) {
		Object[] result_pattern_decll2branchbb_10_2_SolveCSP_binding = pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, c, z, y, w, x);
		if (result_pattern_decll2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_10_2_SolveCSP_black = pattern_decll2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, z, y, w, x };
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
			Branch c, Command z, Branch y, Command w, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { match, c, z, y, w, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Branch c, Command z, Branch y, Command w, Branch x) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(x);
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
		return new Object[] { match, c, z, y, w, x, z__x____next, c__x____positive, c__y____negative, w__y____next };
	}

	public static final Object[] pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match, Branch c,
			Command z, Branch y, Command w, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { match, c, z, y, w, x };
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
			Match match, Branch c, Command z, Branch y, Command w, Branch x) {
		_this.registerObjectsToMatch_BWD(match, c, z, y, w, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("w");
		EObject _localVariable_6 = isApplicableMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpX = _localVariable_6;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpW instanceof Command) {
								Command w = (Command) tmpW;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									return new Object[] { c, z, d2c, y, d, w, x, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Branch c, Command z,
			S2B d2c, Branch y, Decision d, Command w, Branch x, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { c, z, d2c, y, d, w, x, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[0];
			Command z = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decll2branchbb_11_1_performtransformation_binding[2];
			Branch y = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decll2branchbb_11_1_performtransformation_binding[4];
			Command w = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[5];
			Branch x = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_11_1_performtransformation_black = pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					c, z, d2c, y, d, w, x, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_11_1_performtransformation_black[7];

				return new Object[] { c, z, d2c, y, d, w, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_greenFFFFBFFBBFBBF(Command z,
			Branch y, Decision d, Command w, Branch x) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		d.setNegative(b);
		a2x.setSource(a);
		d.setPositive(a);
		l2z.setTarget(z);
		m2w.setTarget(w);
		m2w.setSource(m);
		b.setLast(m);
		a.setLast(l);
		l2z.setSource(l);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { a2x, b, a, l2z, z, m2w, m, y, d, l, w, x, b2y };
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2B a2x,
			While b, While a, S2N l2z, Command z, S2N m2w, Assignment m, Branch y, Assignment l, Command w, Branch x,
			S2B b2y) {
		if (!a2x.equals(b2y)) {
			if (!a.equals(b)) {
				if (!l2z.equals(m2w)) {
					if (!l.equals(m)) {
						if (!w.equals(z)) {
							if (!x.equals(y)) {
								return new Object[] { a2x, b, a, l2z, z, m2w, m, y, l, w, x, b2y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2B a2x,
			While b, While a, S2N l2z, Command z, S2N m2w, Assignment m, Branch y, Assignment l, Command w, Branch x,
			S2B b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, a2x, b, a, l2z, z, m2w, m, y, l, w, x, b2y };
	}

	public static final Object[] pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a, EObject l2z, EObject z,
			EObject m2w, EObject d2c, EObject m, EObject y, EObject d, EObject l, EObject w, EObject x, EObject b2y) {
		if (!c.equals(l2z)) {
			if (!c.equals(z)) {
				if (!c.equals(m2w)) {
					if (!c.equals(d2c)) {
						if (!c.equals(m)) {
							if (!c.equals(y)) {
								if (!c.equals(d)) {
									if (!c.equals(l)) {
										if (!c.equals(w)) {
											if (!c.equals(x)) {
												if (!a2x.equals(c)) {
													if (!a2x.equals(b)) {
														if (!a2x.equals(l2z)) {
															if (!a2x.equals(z)) {
																if (!a2x.equals(m2w)) {
																	if (!a2x.equals(d2c)) {
																		if (!a2x.equals(m)) {
																			if (!a2x.equals(y)) {
																				if (!a2x.equals(d)) {
																					if (!a2x.equals(l)) {
																						if (!a2x.equals(w)) {
																							if (!a2x.equals(x)) {
																								if (!a2x.equals(b2y)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												l2z)) {
																											if (!b.equals(
																													z)) {
																												if (!b.equals(
																														m2w)) {
																													if (!b.equals(
																															d2c)) {
																														if (!b.equals(
																																m)) {
																															if (!b.equals(
																																	y)) {
																																if (!b.equals(
																																		d)) {
																																	if (!b.equals(
																																			l)) {
																																		if (!b.equals(
																																				w)) {
																																			if (!b.equals(
																																					x)) {
																																				if (!b.equals(
																																						b2y)) {
																																					if (!a.equals(
																																							c)) {
																																						if (!a.equals(
																																								a2x)) {
																																							if (!a.equals(
																																									b)) {
																																								if (!a.equals(
																																										l2z)) {
																																									if (!a.equals(
																																											z)) {
																																										if (!a.equals(
																																												m2w)) {
																																											if (!a.equals(
																																													d2c)) {
																																												if (!a.equals(
																																														m)) {
																																													if (!a.equals(
																																															y)) {
																																														if (!a.equals(
																																																d)) {
																																															if (!a.equals(
																																																	l)) {
																																																if (!a.equals(
																																																		w)) {
																																																	if (!a.equals(
																																																			x)) {
																																																		if (!a.equals(
																																																				b2y)) {
																																																			if (!l2z.equals(
																																																					z)) {
																																																				if (!l2z.equals(
																																																						m2w)) {
																																																					if (!l2z.equals(
																																																							m)) {
																																																						if (!l2z.equals(
																																																								y)) {
																																																							if (!l2z.equals(
																																																									w)) {
																																																								if (!l2z.equals(
																																																										x)) {
																																																									if (!m2w.equals(
																																																											z)) {
																																																										if (!m2w.equals(
																																																												y)) {
																																																											if (!m2w.equals(
																																																													w)) {
																																																												if (!m2w.equals(
																																																														x)) {
																																																													if (!d2c.equals(
																																																															l2z)) {
																																																														if (!d2c.equals(
																																																																z)) {
																																																															if (!d2c.equals(
																																																																	m2w)) {
																																																																if (!d2c.equals(
																																																																		m)) {
																																																																	if (!d2c.equals(
																																																																			y)) {
																																																																		if (!d2c.equals(
																																																																				l)) {
																																																																			if (!d2c.equals(
																																																																					w)) {
																																																																				if (!d2c.equals(
																																																																						x)) {
																																																																					if (!m.equals(
																																																																							z)) {
																																																																						if (!m.equals(
																																																																								m2w)) {
																																																																							if (!m.equals(
																																																																									y)) {
																																																																								if (!m.equals(
																																																																										w)) {
																																																																									if (!m.equals(
																																																																											x)) {
																																																																										if (!y.equals(
																																																																												z)) {
																																																																											if (!d.equals(
																																																																													l2z)) {
																																																																												if (!d.equals(
																																																																														z)) {
																																																																													if (!d.equals(
																																																																															m2w)) {
																																																																														if (!d.equals(
																																																																																d2c)) {
																																																																															if (!d.equals(
																																																																																	m)) {
																																																																																if (!d.equals(
																																																																																		y)) {
																																																																																	if (!d.equals(
																																																																																			l)) {
																																																																																		if (!d.equals(
																																																																																				w)) {
																																																																																			if (!d.equals(
																																																																																					x)) {
																																																																																				if (!l.equals(
																																																																																						l2z)) {
																																																																																					if (!l.equals(
																																																																																							z)) {
																																																																																						if (!l.equals(
																																																																																								m2w)) {
																																																																																							if (!l.equals(
																																																																																									m)) {
																																																																																								if (!l.equals(
																																																																																										y)) {
																																																																																									if (!l.equals(
																																																																																											w)) {
																																																																																										if (!l.equals(
																																																																																												x)) {
																																																																																											if (!w.equals(
																																																																																													z)) {
																																																																																												if (!w.equals(
																																																																																														y)) {
																																																																																													if (!w.equals(
																																																																																															x)) {
																																																																																														if (!x.equals(
																																																																																																z)) {
																																																																																															if (!x.equals(
																																																																																																	y)) {
																																																																																																if (!b2y.equals(
																																																																																																		c)) {
																																																																																																	if (!b2y.equals(
																																																																																																			l2z)) {
																																																																																																		if (!b2y.equals(
																																																																																																				z)) {
																																																																																																			if (!b2y.equals(
																																																																																																					m2w)) {
																																																																																																				if (!b2y.equals(
																																																																																																						d2c)) {
																																																																																																					if (!b2y.equals(
																																																																																																							m)) {
																																																																																																						if (!b2y.equals(
																																																																																																								y)) {
																																																																																																							if (!b2y.equals(
																																																																																																									d)) {
																																																																																																								if (!b2y.equals(
																																																																																																										l)) {
																																																																																																									if (!b2y.equals(
																																																																																																											w)) {
																																																																																																										if (!b2y.equals(
																																																																																																												x)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													a,
																																																																																																													l2z,
																																																																																																													z,
																																																																																																													m2w,
																																																																																																													d2c,
																																																																																																													m,
																																																																																																													y,
																																																																																																													d,
																																																																																																													l,
																																																																																																													w,
																																																																																																													x,
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
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a, EObject l2z, EObject z,
			EObject m2w, EObject m, EObject y, EObject d, EObject l, EObject w, EObject x, EObject b2y) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String a__l____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String m2w__m____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b__m____last_name_prime = "last";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		return new Object[] { ruleresult, c, a2x, b, a, l2z, z, m2w, m, y, d, l, w, x, b2y, a__l____last,
				a2x__a____source, m2w__m____source, z__x____next, d__a____positive, d__b____negative, l2z__l____source,
				c__x____positive, m2w__w____target, l2z__z____target, b2y__y____target, b2y__b____source, b__m____last,
				c__y____negative, a2x__x____target, w__y____next };
	}

	public static final void pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject a2x, EObject b, EObject a,
			EObject l2z, EObject z, EObject m2w, EObject d2c, EObject m, EObject y, EObject d, EObject l, EObject w,
			EObject x, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, c, a2x, b, a, l2z, z, m2w, d2c, m, y, d, l, w, x, b2y);

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
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("w");
		EObject _localVariable_4 = match.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { c, z, y, w, x, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_2_corematch_blackBBFBFBBB(Branch c, Command z,
			Branch y, Command w, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { c, z, d2c, y, d, w, x, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(Branch c, Command z,
			S2B d2c, Branch y, Decision d, Command w, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (c.equals(d2c.getTarget())) {
							if (x.equals(z.getNext())) {
								if (d.equals(d2c.getSource())) {
									if (x.equals(c.getPositive())) {
										if (y.equals(c.getNegative())) {
											if (y.equals(w.getNext())) {
												_result.add(new Object[] { c, z, d2c, y, d, w, x });
											}
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

	public static final Object[] pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Branch c, Command z,
			S2B d2c, Branch y, Decision d, Command w, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String d2c__d____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		d2c__c____target.setName(d2c__c____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		return new Object[] { c, z, d2c, y, d, w, x, isApplicableMatch, d2c__c____target, z__x____next,
				d2c__d____source, c__x____positive, c__y____negative, w__y____next };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Command z, S2B d2c, Branch y, Decision d, Command w,
			Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, c, z, d2c, y, d, w, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, z, d2c, y, d, w, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Command z, S2B d2c, Branch y, Decision d, Command w,
			Branch x) {
		Object[] result_pattern_decll2branchbb_12_4_solveCSP_binding = pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, z, d2c, y, d, w, x);
		if (result_pattern_decll2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_12_4_solveCSP_black = pattern_decll2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, z, d2c, y, d, w, x };
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
		for (Graph __DEC_z_root_1459 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_745711 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_745711)) {
							if (!y.equals(__DEC_z_positive_745711)) {
								if (!x.equals(__DEC_z_positive_745711)) {
									return new Object[] { z, c, y, x };
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
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_279938 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_279938)) {
							if (!y.equals(__DEC_z_negative_279938)) {
								if (!x.equals(__DEC_z_negative_279938)) {
									return new Object[] { z, c, y, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_508801 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_599771 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_599771)) {
							if (!c.equals(__DEC_y_positive_599771)) {
								if (!x.equals(__DEC_y_positive_599771)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_604565 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_604565)) {
							if (!c.equals(__DEC_y_negative_604565)) {
								if (!x.equals(__DEC_y_negative_604565)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(Command w) {
		for (Graph __DEC_w_root_279351 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(Command w, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_331954 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_331954)) {
							if (!y.equals(__DEC_w_positive_331954)) {
								if (!x.equals(__DEC_w_positive_331954)) {
									return new Object[] { w, c, y, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(Command w, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_470682 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_470682)) {
							if (!y.equals(__DEC_w_negative_470682)) {
								if (!x.equals(__DEC_w_negative_470682)) {
									return new Object[] { w, c, y, x };
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
		for (Graph __DEC_x_root_926162 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_776437 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_776437)) {
							if (!c.equals(__DEC_x_positive_776437)) {
								if (!y.equals(__DEC_x_positive_776437)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_956511 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_956511)) {
							if (!c.equals(__DEC_x_negative_956511)) {
								if (!y.equals(__DEC_x_negative_956511)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_20BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_21BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_22BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_23BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_24BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_26BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_27BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
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
						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(x) == null) {
							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(x, z) == null) {
								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(x, z) == null) {
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
																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_26BB(
																		c, x) == null) {
																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(
																			z, c, y, x) == null) {
																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(
																				z, c, y, x) == null) {
																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																					y) == null) {
																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
																						y, c, x) == null) {
																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																							y, c, x) == null) {
																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(
																								x, c, y) == null) {
																							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(
																									x, c, y) == null) {
																								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																										y, z) == null) {
																									if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																											y,
																											z) == null) {
																										if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(
																												c,
																												y) == null) {
																											if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																													y,
																													x) == null) {
																												if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_27BB(
																														y,
																														x) == null) {
																													for (Node tmpW : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	y,
																																	Node.class,
																																	"next")) {
																														if (tmpW instanceof Command) {
																															Command w = (Command) tmpW;
																															if (!w.equals(
																																	z)) {
																																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(
																																		w) == null) {
																																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(
																																			w,
																																			c,
																																			y,
																																			x) == null) {
																																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(
																																				w,
																																				c,
																																				y,
																																				x) == null) {
																																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(
																																					c,
																																					w) == null) {
																																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_20BB(
																																						y,
																																						w) == null) {
																																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_21BB(
																																							x,
																																							w) == null) {
																																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_22BB(
																																								c,
																																								w) == null) {
																																							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_23BB(
																																									y,
																																									w) == null) {
																																								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																																										x,
																																										w) == null) {
																																									_result.add(
																																											new Object[] {
																																													c,
																																													z,
																																													y,
																																													w,
																																													x,
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
			decll2branchbb _this, Match match, Branch c, Command z, Branch y, Command w, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, z, y, w, x);
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
		for (Decision __DEC_b_positive_823594 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_823594)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_315810 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_315810)) {
					if (!a.equals(__DEC_b_first_315810)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_94981 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_94981)) {
					if (!a.equals(__DEC_b_last_94981)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3B(While b) {
		for (Program __DEC_b_first_257415 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_525797 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_525797)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_98824 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_98824)) {
					if (!b.equals(__DEC_a_first_98824)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_170632 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_170632)) {
					if (!b.equals(__DEC_a_last_170632)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_236772 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_592000 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_592000)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_491736 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_491736)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_690224 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_690224)) {
					if (!a.equals(__DEC_m_first_690224)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_463346 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_463346)) {
					if (!a.equals(__DEC_m_last_463346)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12B(Assignment m) {
		for (Program __DEC_m_first_942525 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_533667 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_533667)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_90444 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_90444)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_252729 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_252729)) {
					if (!a.equals(__DEC_l_first_252729)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_839850 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_839850)) {
					if (!a.equals(__DEC_l_last_839850)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(Assignment l) {
		for (Program __DEC_l_first_366197 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While b,
			Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While a,
			Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
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
					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7B(a) == null) {
						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(l) == null) {
							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(a, l) == null) {
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
															a, d) == null) {
														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13BB(
																l, d) == null) {
															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																	l, d) == null) {
																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																		d, a) == null) {
																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																			d, l) == null) {
																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																				d, l) == null) {
																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
																					b, d) == null) {
																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																						b, a) == null) {
																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BB(
																							b, a) == null) {
																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3B(
																								b) == null) {
																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																									a, b) == null) {
																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																										a, b) == null) {
																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BBB(
																											l, b,
																											a) == null) {
																										if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BBB(
																												l, b,
																												a) == null) {
																											if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																													d,
																													b) == null) {
																												if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																														b,
																														a) == null) {
																													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																															b,
																															a) == null) {
																														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(
																																b,
																																l) == null) {
																															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(
																																	b,
																																	l) == null) {
																																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8BB(
																																		m,
																																		d) == null) {
																																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9BB(
																																			m,
																																			d) == null) {
																																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BBB(
																																				m,
																																				b,
																																				a) == null) {
																																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(
																																					m,
																																					b,
																																					a) == null) {
																																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12B(
																																						m) == null) {
																																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																							d,
																																							m) == null) {
																																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																																								d,
																																								m) == null) {
																																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																									b,
																																									m) == null) {
																																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																										a,
																																										m) == null) {
																																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																											a,
																																											m) == null) {
																																										_result.add(
																																												new Object[] {
																																														b,
																																														a,
																																														m,
																																														d,
																																														l,
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
			decll2branchbb _this, Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, m, d, l);
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

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("c");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("m");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = sourceMatch.getObject("l");
		EObject _localVariable_8 = targetMatch.getObject("w");
		EObject _localVariable_9 = targetMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpM = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpL = _localVariable_7;
		EObject tmpW = _localVariable_8;
		EObject tmpX = _localVariable_9;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpM instanceof Assignment) {
							Assignment m = (Assignment) tmpM;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpL instanceof Assignment) {
										Assignment l = (Assignment) tmpL;
										if (tmpW instanceof Command) {
											Command w = (Command) tmpW;
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												return new Object[] { c, b, a, z, m, y, d, l, w, x, targetMatch,
														sourceMatch };
											}
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

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Branch c, While b,
			While a, Command z, Assignment m, Branch y, Decision d, Assignment l, Command w, Branch x,
			Match sourceMatch, Match targetMatch) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!a.equals(b)) {
					if (!l.equals(m)) {
						if (!w.equals(z)) {
							if (!x.equals(y)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch };
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
				targetMatch, sourceMatch);
		if (result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Branch c = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[0];
			While b = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[2];
			Command z = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[3];
			Assignment m = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[6];
			Assignment l = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[7];
			Command w = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[8];
			Branch x = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black = pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch);
			if (result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(decll2branchbb _this,
			Branch c, While b, While a, Command z, Assignment m, Branch y, Decision d, Assignment l, Command w,
			Branch x, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			decll2branchbb _this, Branch c, While b, While a, Command z, Assignment m, Branch y, Decision d,
			Assignment l, Command w, Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decll2branchbb_24_3_solvecsp_binding = pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch);
		if (result_pattern_decll2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decll2branchbb_24_3_solvecsp_black = pattern_decll2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decll2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, b, a, z, m, y, d, l, w, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_24_5_matchcorrcontext_blackBFBBB(Branch c, Decision d,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { c, d2c, d, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(Branch c, While b,
			While a, Command z, Assignment m, Branch y, Decision d, Assignment l, Command w, Branch x,
			CCMatch ccMatch) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!a.equals(b)) {
					if (!l.equals(m)) {
						if (!w.equals(z)) {
							if (!x.equals(y)) {
								return new Object[] { c, b, a, z, m, y, d, l, w, x, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_greenFBBFBFBBBBBFB(While b, While a,
			Command z, Assignment m, Branch y, Assignment l, Command w, Branch x, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { a2x, b, a, l2z, z, m2w, m, y, l, w, x, b2y, ccMatch };
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
		for (Decision __DEC_b_positive_681551 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_681551)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_355232 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_355232)) {
					if (!a.equals(__DEC_b_first_355232)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_773760 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_773760)) {
					if (!a.equals(__DEC_b_last_773760)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3B(While b) {
		for (Program __DEC_b_first_493521 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_949371 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_949371)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_969576 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_969576)) {
					if (!b.equals(__DEC_a_first_969576)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_828924 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_828924)) {
					if (!b.equals(__DEC_a_last_828924)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_546595 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_650907 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_650907)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_219428 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_219428)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_22461 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_22461)) {
					if (!a.equals(__DEC_m_first_22461)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_656053 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_656053)) {
					if (!a.equals(__DEC_m_last_656053)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12B(Assignment m) {
		for (Program __DEC_m_first_386913 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_597547 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_597547)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_205276 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_205276)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_51878 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_51878)) {
					if (!a.equals(__DEC_l_first_51878)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_544935 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_544935)) {
					if (!a.equals(__DEC_l_last_544935)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(Assignment l) {
		for (Program __DEC_l_first_249432 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_19BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_20BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_21BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(Decision d, Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(Decision d, Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(While b, Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(While a, Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_29BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_30BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_31BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(While b, While a, Assignment m,
			Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (l.equals(a.getLast())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (m.equals(b.getLast())) {
								if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
									if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
										if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BB(b, a) == null) {
											if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3B(b) == null) {
												if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4BB(a,
														d) == null) {
													if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(a,
															b) == null) {
														if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BB(a,
																b) == null) {
															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7B(
																	a) == null) {
																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8BB(
																		m, d) == null) {
																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9BB(
																			m, d) == null) {
																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BBB(
																				m, b, a) == null) {
																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BBB(
																					m, b, a) == null) {
																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12B(
																						m) == null) {
																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13BB(
																							l, d) == null) {
																						if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(
																								l, d) == null) {
																							if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BBB(
																									l, b, a) == null) {
																								if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BBB(
																										l, b,
																										a) == null) {
																									if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(
																											l) == null) {
																										if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_18BB(
																												d,
																												b) == null) {
																											if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_19BB(
																													d,
																													a) == null) {
																												if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_20BB(
																														b,
																														a) == null) {
																													if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_21BB(
																															b,
																															a) == null) {
																														if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(
																																d,
																																m) == null) {
																															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(
																																	d,
																																	m) == null) {
																																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																		b,
																																		m) == null) {
																																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																			a,
																																			m) == null) {
																																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																				a,
																																				m) == null) {
																																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																					d,
																																					l) == null) {
																																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																						d,
																																						l) == null) {
																																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																							b,
																																							l) == null) {
																																						if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_30BB(
																																								a,
																																								l) == null) {
																																							if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_31BB(
																																									b,
																																									l) == null) {
																																								return new Object[] {
																																										b,
																																										a,
																																										m,
																																										d,
																																										l };
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		for (Graph __DEC_z_root_992280 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_994417 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_994417)) {
							if (!y.equals(__DEC_z_positive_994417)) {
								if (!x.equals(__DEC_z_positive_994417)) {
									return new Object[] { z, c, y, x };
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
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_479794 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_479794)) {
							if (!y.equals(__DEC_z_negative_479794)) {
								if (!x.equals(__DEC_z_negative_479794)) {
									return new Object[] { z, c, y, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_645831 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_180624 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_180624)) {
							if (!c.equals(__DEC_y_positive_180624)) {
								if (!x.equals(__DEC_y_positive_180624)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_34256 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_34256)) {
							if (!c.equals(__DEC_y_negative_34256)) {
								if (!x.equals(__DEC_y_negative_34256)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(Command w) {
		for (Graph __DEC_w_root_279000 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBBB(Command w, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_97358 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_97358)) {
							if (!y.equals(__DEC_w_positive_97358)) {
								if (!x.equals(__DEC_w_positive_97358)) {
									return new Object[] { w, c, y, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBBB(Command w, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_392757 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_392757)) {
							if (!y.equals(__DEC_w_negative_392757)) {
								if (!x.equals(__DEC_w_negative_392757)) {
									return new Object[] { w, c, y, x };
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
		for (Graph __DEC_x_root_468600 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_190032 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_190032)) {
							if (!c.equals(__DEC_x_positive_190032)) {
								if (!y.equals(__DEC_x_positive_190032)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_142499 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_142499)) {
							if (!c.equals(__DEC_x_negative_142499)) {
								if (!y.equals(__DEC_x_negative_142499)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_20BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_21BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_22BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_23BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_24BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_26BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_27BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(Branch c, Command z, Branch y,
			Command w, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (x.equals(z.getNext())) {
							if (x.equals(c.getPositive())) {
								if (y.equals(c.getNegative())) {
									if (y.equals(w.getNext())) {
										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBBB(z, c, y,
													x) == null) {
												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBBB(z, c, y,
														x) == null) {
													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(
															y) == null) {
														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBB(
																y, c, x) == null) {
															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBB(
																	y, c, x) == null) {
																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(
																		w) == null) {
																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBBB(
																			w, c, y, x) == null) {
																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBBB(
																				w, c, y, x) == null) {
																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(
																					x) == null) {
																				if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBB(
																						x, c, y) == null) {
																					if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBB(
																							x, c, y) == null) {
																						if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_12BB(
																								c, z) == null) {
																							if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_13BB(
																									y, z) == null) {
																								if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_14BB(
																										x, z) == null) {
																									if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_15BB(
																											c,
																											z) == null) {
																										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_16BB(
																												y,
																												z) == null) {
																											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_17BB(
																													x,
																													z) == null) {
																												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(
																														c,
																														y) == null) {
																													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															c,
																															w) == null) {
																														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_20BB(
																																y,
																																w) == null) {
																															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_21BB(
																																	x,
																																	w) == null) {
																																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_22BB(
																																		c,
																																		w) == null) {
																																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_23BB(
																																			y,
																																			w) == null) {
																																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_24BB(
																																				x,
																																				w) == null) {
																																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(
																																					y,
																																					x) == null) {
																																				if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_26BB(
																																						c,
																																						x) == null) {
																																					if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_27BB(
																																							y,
																																							x) == null) {
																																						return new Object[] {
																																								c,
																																								z,
																																								y,
																																								w,
																																								x };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
					Branch c = d2c.getTarget();
					if (c != null) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, c) == null) {
									if (pattern_decll2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											d) == null) {
										_result.add(
												new Object[] { d2cList, c, d2c, d, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decll2branchbb_29_3_solveCSP_binding = pattern_decll2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decll2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_29_3_solveCSP_black = pattern_decll2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_29_4_checkCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_29_5_checknacs_blackBBB(Branch c, S2B d2c, Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_blackBBBB(Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_greenBFFFFFFFFBFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.getCorrObjects().add(l2z);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(m2w);
		m2w.setSource(m);
		b.setLast(m);
		ruleResult.getSourceObjects().add(m);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		a.setLast(l);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		m2w.setTarget(w);
		w.setNext(y);
		ruleResult.getTargetObjects().add(w);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, a2x, b, a, l2z, z, m2w, m, y, d, l, w, x, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decll2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decll2branchbbImpl
