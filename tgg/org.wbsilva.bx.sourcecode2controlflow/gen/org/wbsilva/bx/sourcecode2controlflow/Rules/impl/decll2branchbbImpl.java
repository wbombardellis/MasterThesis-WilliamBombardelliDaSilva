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
	public boolean isAppropriate_FWD(Match match, Decision d, While b, While a, Assignment l, Assignment m) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(this, match,
				d, b, a, l, m);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[l] = " + l + ", " + "[m] = " + m + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, d, b, a, l, m);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[l] = " + l + ", " + "[m] = " + m + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, d, b, a, l, m);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[m] = " + m + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, d, b, a,
					l, m);
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(match, d, b, a, l, m);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[m] = " + m + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, d, b, a,
					l, m);
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
		Decision d = (Decision) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Branch c = (Branch) result1_bindingAndBlack[4];
		Assignment l = (Assignment) result1_bindingAndBlack[5];
		Assignment m = (Assignment) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_1_performtransformation_greenFFFFBFFBBFBFB(b, a, c, l, m);
		S2N m2w = (S2N) result1_green[0];
		Branch y = (Branch) result1_green[1];
		Command z = (Command) result1_green[2];
		Branch x = (Branch) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		Command w = (Command) result1_green[6];
		S2B b2y = (S2B) result1_green[9];
		S2N l2z = (S2N) result1_green[11];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(m2w, y, z, x, b, a2x, w, a, b2y,
						l, l2z, m);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2w] = " + m2w + ", " + "[y] = "
					+ y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x
					+ ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[l] = " + l + ", "
					+ "[l2z] = " + l2z + ", " + "[m] = " + m + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(m2w, y, z, x, b, a2x, w, a,
						b2y, l, l2z, m);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, m2w, y, d, z, x, b,
						a2x, w, a, d2c, c, b2y, l, l2z, m);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2w] = " + m2w + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[b2y] = " + b2y + ", "
					+ "[l] = " + l + ", " + "[l2z] = " + l2z + ", " + "[m] = " + m + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, m2w, y, d, z, x, b, a2x, w, a, c, b2y, l, l2z, m);
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, m2w,
				y, d, z, x, b, a2x, w, a, d2c, c, b2y, l, l2z, m);
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
		Decision d = (Decision) result2_binding[0];
		While b = (While) result2_binding[1];
		While a = (While) result2_binding[2];
		Assignment l = (Assignment) result2_binding[3];
		Assignment m = (Assignment) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_2_2_corematch_blackBBBFFBBB(d, b, a, l,
				m, match)) {
			S2B d2c = (S2B) result2_black[3];
			Branch c = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(d, b,
					a, d2c, c, l, m)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(d, b, a, d2c, c, l, m);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, d, b, a,
								d2c, c, l, m);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[b] = " + b
							+ ", " + "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[l] = " + l
							+ ", " + "[m] = " + m + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Decision d, While b, While a, Assignment l, Assignment m) {
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("l", l);
		match.registerObject("m", m);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, While b, While a, Assignment l, Assignment m) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision d, While b, While a, S2B d2c,
			Branch c, Assignment l, Assignment m) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("m", m);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z,
			EObject x, EObject b, EObject a2x, EObject w, EObject a, EObject d2c, EObject c, EObject b2y, EObject l,
			EObject l2z, EObject m) {
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("m", m);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch y, Command z, Branch x, Command w, Branch c) {

		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, y, z, x, w, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
					+ "[w] = " + w + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, y, z, x, w, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
					+ "[w] = " + w + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, y, z, x, w, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, y, z, x,
					w, c);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[9];

			Object[] result5_black = decll2branchbbImpl
					.pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(match, y, z, x, w, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			decll2branchbbImpl.pattern_decll2branchbb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decll2branchbbImpl.pattern_decll2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, y, z,
					x, w, c);
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
		Branch y = (Branch) result1_bindingAndBlack[0];
		Decision d = (Decision) result1_bindingAndBlack[1];
		Command z = (Command) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		Command w = (Command) result1_bindingAndBlack[4];
		S2B d2c = (S2B) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_1_performtransformation_greenFBBBBFFBFFFFF(y, d, z, x, w);
		S2N m2w = (S2N) result1_green[0];
		While b = (While) result1_green[5];
		S2B a2x = (S2B) result1_green[6];
		While a = (While) result1_green[8];
		S2B b2y = (S2B) result1_green[9];
		Assignment l = (Assignment) result1_green[10];
		S2N l2z = (S2N) result1_green[11];
		Assignment m = (Assignment) result1_green[12];

		Object[] result2_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(m2w, y, z, x, b, a2x, w, a,
						b2y, l, l2z, m);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2w] = " + m2w + ", " + "[y] = "
					+ y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x
					+ ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[l] = " + l + ", "
					+ "[l2z] = " + l2z + ", " + "[m] = " + m + ".");
		}
		Object[] result2_green = decll2branchbbImpl
				.pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(m2w, y, z, x, b, a2x, w, a,
						b2y, l, l2z, m);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decll2branchbbImpl
				.pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, m2w, y, d, z, x, b,
						a2x, w, a, d2c, c, b2y, l, l2z, m);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2w] = " + m2w + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[b2y] = " + b2y + ", "
					+ "[l] = " + l + ", " + "[l2z] = " + l2z + ", " + "[m] = " + m + ".");
		}
		decll2branchbbImpl.pattern_decll2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, m2w, y, d, z, x, b, a2x, w, a, c, b2y, l, l2z, m);
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[30];

		// 
		// 
		decll2branchbbImpl.pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				m2w, y, d, z, x, b, a2x, w, a, d2c, c, b2y, l, l2z, m);
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
		Branch y = (Branch) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		Command w = (Command) result2_binding[3];
		Branch c = (Branch) result2_binding[4];
		for (Object[] result2_black : decll2branchbbImpl.pattern_decll2branchbb_12_2_corematch_blackBFBBBFBB(y, z, x, w,
				c, match)) {
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decll2branchbbImpl.pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(y, d,
					z, x, w, d2c, c)) {
				Object[] result3_green = decll2branchbbImpl
						.pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(y, d, z, x, w, d2c, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = decll2branchbbImpl
						.pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, y, d,
								z, x, w, d2c, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[d] = " + d
							+ ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[d2c] = " + d2c
							+ ", " + "[c] = " + c + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch y, Command z, Branch x, Command w, Branch c) {
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("w", w);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch y, Command z, Branch x, Command w, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch y, Decision d, Command z, Branch x,
			Command w, S2B d2c, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z,
			EObject x, EObject b, EObject a2x, EObject w, EObject a, EObject d2c, EObject c, EObject b2y, EObject l,
			EObject l2z, EObject m) {
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("m", m);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_151(EMoflonEdge _edge_next) {

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
			Branch y = (Branch) result2_black[0];
			Command z = (Command) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Command w = (Command) result2_black[3];
			Branch c = (Branch) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, y, z, x, w, c)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_151(EMoflonEdge _edge_last) {

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
			Decision d = (Decision) result2_black[0];
			While b = (While) result2_black[1];
			While a = (While) result2_black[2];
			Assignment l = (Assignment) result2_black[3];
			Assignment m = (Assignment) result2_black[4];
			Object[] result2_green = decll2branchbbImpl
					.pattern_decll2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decll2branchbbImpl
					.pattern_decll2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, d, b, a, l, m)) {
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
		Branch y = (Branch) result2_bindingAndBlack[0];
		Decision d = (Decision) result2_bindingAndBlack[1];
		Command z = (Command) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		While b = (While) result2_bindingAndBlack[4];
		Command w = (Command) result2_bindingAndBlack[5];
		While a = (While) result2_bindingAndBlack[6];
		Branch c = (Branch) result2_bindingAndBlack[7];
		Assignment l = (Assignment) result2_bindingAndBlack[8];
		Assignment m = (Assignment) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = decll2branchbbImpl
				.pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, y, d, z, x, b, w, a, c, l, m,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[b] = "
					+ b + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
					+ "[m] = " + m + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decll2branchbbImpl.pattern_decll2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_blackBFBBB(d,
					c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decll2branchbbImpl.pattern_decll2branchbb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decll2branchbbImpl
						.pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(y, d, z, x, b, w, a, c, l, m,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[d] = " + d + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
							+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
							+ "[m] = " + m + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decll2branchbbImpl.pattern_decll2branchbb_24_6_createcorrespondence_greenFBBBBFBBFBFBB(y, z, x, b, w, a,
						l, m, ccMatch);
				//nothing S2N m2w = (S2N) result6_green[0];
				//nothing S2B a2x = (S2B) result6_green[5];
				//nothing S2B b2y = (S2B) result6_green[8];
				//nothing S2N l2z = (S2N) result6_green[10];

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
	public CSP isApplicable_solveCsp_CC(Branch y, Decision d, Command z, Branch x, While b, Command w, While a,
			Branch c, Assignment l, Assignment m, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, While b, While a, Assignment l, Assignment m) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(d, b, a, l,
				m);
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
	public boolean checkDEC_BWD(Branch y, Command z, Branch x, Command w, Branch c) {// 
		Object[] result1_black = decll2branchbbImpl.pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(y, z, x, w,
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
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decll2branchbbImpl
					.pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, d2c, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[d2c] = " + d2c
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decll2branchbbImpl.pattern_decll2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decll2branchbbImpl.pattern_decll2branchbb_29_5_checknacs_blackBBB(d, d2c, c);
				if (result5_black != null) {

					Object[] result6_black = decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_blackBBBB(d, d2c, c,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decll2branchbbImpl.pattern_decll2branchbb_29_6_perform_greenFFBFFFFFFBFFFFB(d, c, ruleResult);
					//nothing S2N m2w = (S2N) result6_green[0];
					//nothing Branch y = (Branch) result6_green[1];
					//nothing Command z = (Command) result6_green[3];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing While b = (While) result6_green[5];
					//nothing S2B a2x = (S2B) result6_green[6];
					//nothing Command w = (Command) result6_green[7];
					//nothing While a = (While) result6_green[8];
					//nothing S2B b2y = (S2B) result6_green[10];
					//nothing Assignment l = (Assignment) result6_green[11];
					//nothing S2N l2z = (S2N) result6_green[12];
					//nothing Assignment m = (Assignment) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c,
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
		isApplicableMatch.registerObject("d2c", d2c);
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_DECISION_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4), (Assignment) arguments.get(5));
			return null;
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_WHILE_WHILE_S2B_BRANCH_ASSIGNMENT_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Assignment) arguments.get(6), (Assignment) arguments.get(7));
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_DECISION_COMMAND_BRANCH_COMMAND_S2B_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (S2B) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_DECISION_COMMAND_BRANCH_WHILE_COMMAND_WHILE_BRANCH_ASSIGNMENT_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Decision) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Command) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7),
					(Assignment) arguments.get(8), (Assignment) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_FWD__DECISION_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decll2branchbb_0_1_initialbindings_blackBBBBBBB(decll2branchbb _this,
			Match match, Decision d, While b, While a, Assignment l, Assignment m) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { _this, match, d, b, a, l, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			Decision d, While b, While a, Assignment l, Assignment m) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, b, a, l, m);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, b, a, l, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, Decision d, While b, While a, Assignment l, Assignment m) {
		Object[] result_pattern_decll2branchbb_0_2_SolveCSP_binding = pattern_decll2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, d, b, a, l, m);
		if (result_pattern_decll2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_0_2_SolveCSP_black = pattern_decll2branchbb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, b, a, l, m };
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
			Decision d, While b, While a, Assignment l, Assignment m) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, d, b, a, l, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Decision d, While b, While a, Assignment l, Assignment m) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(m);
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, d, b, a, l, m, b__m____last, d__a____positive, a__l____last, d__b____negative };
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match, Decision d,
			While b, While a, Assignment l, Assignment m) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, d, b, a, l, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decll2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(decll2branchbb _this,
			Match match, Decision d, While b, While a, Assignment l, Assignment m) {
		_this.registerObjectsToMatch_FWD(match, d, b, a, l, m);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("l");
		EObject _localVariable_6 = isApplicableMatch.getObject("m");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpM = _localVariable_6;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpM instanceof Assignment) {
									Assignment m = (Assignment) tmpM;
									return new Object[] { d, b, a, d2c, c, l, m, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(Decision d, While b,
			While a, S2B d2c, Branch c, Assignment l, Assignment m, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { d, b, a, d2c, c, l, m, csp, _this, isApplicableMatch };
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
			Decision d = (Decision) result_pattern_decll2branchbb_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_decll2branchbb_1_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decll2branchbb_1_1_performtransformation_binding[3];
			Branch c = (Branch) result_pattern_decll2branchbb_1_1_performtransformation_binding[4];
			Assignment l = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[5];
			Assignment m = (Assignment) result_pattern_decll2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_1_1_performtransformation_black = pattern_decll2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					d, b, a, d2c, c, l, m, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_1_1_performtransformation_black[7];

				return new Object[] { d, b, a, d2c, c, l, m, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_1_performtransformation_greenFFFFBFFBBFBFB(While b, While a,
			Branch c, Assignment l, Assignment m) {
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		m2w.setSource(m);
		c.setNegative(y);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		m2w.setTarget(w);
		w.setNext(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		l2z.setSource(l);
		l2z.setTarget(z);
		return new Object[] { m2w, y, z, x, b, a2x, w, a, c, b2y, l, l2z, m };
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N m2w,
			Branch y, Command z, Branch x, While b, S2B a2x, Command w, While a, S2B b2y, Assignment l, S2N l2z,
			Assignment m) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				if (!w.equals(z)) {
					if (!a.equals(b)) {
						if (!l.equals(m)) {
							if (!l2z.equals(m2w)) {
								return new Object[] { m2w, y, z, x, b, a2x, w, a, b2y, l, l2z, m };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N m2w,
			Branch y, Command z, Branch x, While b, S2B a2x, Command w, While a, S2B b2y, Assignment l, S2N l2z,
			Assignment m) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(m);
		return new Object[] { ruleresult, m2w, y, z, x, b, a2x, w, a, b2y, l, l2z, m };
	}

	public static final Object[] pattern_decll2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z, EObject x, EObject b,
			EObject a2x, EObject w, EObject a, EObject d2c, EObject c, EObject b2y, EObject l, EObject l2z, EObject m) {
		if (!m2w.equals(y)) {
			if (!m2w.equals(z)) {
				if (!m2w.equals(x)) {
					if (!m2w.equals(w)) {
						if (!y.equals(z)) {
							if (!d.equals(m2w)) {
								if (!d.equals(y)) {
									if (!d.equals(z)) {
										if (!d.equals(x)) {
											if (!d.equals(w)) {
												if (!d.equals(d2c)) {
													if (!d.equals(l)) {
														if (!d.equals(l2z)) {
															if (!d.equals(m)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!b.equals(m2w)) {
																			if (!b.equals(y)) {
																				if (!b.equals(d)) {
																					if (!b.equals(z)) {
																						if (!b.equals(x)) {
																							if (!b.equals(w)) {
																								if (!b.equals(d2c)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												b2y)) {
																											if (!b.equals(
																													l)) {
																												if (!b.equals(
																														l2z)) {
																													if (!b.equals(
																															m)) {
																														if (!a2x.equals(
																																m2w)) {
																															if (!a2x.equals(
																																	y)) {
																																if (!a2x.equals(
																																		d)) {
																																	if (!a2x.equals(
																																			z)) {
																																		if (!a2x.equals(
																																				x)) {
																																			if (!a2x.equals(
																																					b)) {
																																				if (!a2x.equals(
																																						w)) {
																																					if (!a2x.equals(
																																							d2c)) {
																																						if (!a2x.equals(
																																								c)) {
																																							if (!a2x.equals(
																																									b2y)) {
																																								if (!a2x.equals(
																																										l)) {
																																									if (!a2x.equals(
																																											l2z)) {
																																										if (!a2x.equals(
																																												m)) {
																																											if (!w.equals(
																																													y)) {
																																												if (!w.equals(
																																														z)) {
																																													if (!w.equals(
																																															x)) {
																																														if (!a.equals(
																																																m2w)) {
																																															if (!a.equals(
																																																	y)) {
																																																if (!a.equals(
																																																		d)) {
																																																	if (!a.equals(
																																																			z)) {
																																																		if (!a.equals(
																																																				x)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						a2x)) {
																																																					if (!a.equals(
																																																							w)) {
																																																						if (!a.equals(
																																																								d2c)) {
																																																							if (!a.equals(
																																																									c)) {
																																																								if (!a.equals(
																																																										b2y)) {
																																																									if (!a.equals(
																																																											l)) {
																																																										if (!a.equals(
																																																												l2z)) {
																																																											if (!a.equals(
																																																													m)) {
																																																												if (!d2c.equals(
																																																														m2w)) {
																																																													if (!d2c.equals(
																																																															y)) {
																																																														if (!d2c.equals(
																																																																z)) {
																																																															if (!d2c.equals(
																																																																	x)) {
																																																																if (!d2c.equals(
																																																																		w)) {
																																																																	if (!d2c.equals(
																																																																			l)) {
																																																																		if (!d2c.equals(
																																																																				l2z)) {
																																																																			if (!d2c.equals(
																																																																					m)) {
																																																																				if (!c.equals(
																																																																						m2w)) {
																																																																					if (!c.equals(
																																																																							y)) {
																																																																						if (!c.equals(
																																																																								d)) {
																																																																							if (!c.equals(
																																																																									z)) {
																																																																								if (!c.equals(
																																																																										x)) {
																																																																									if (!c.equals(
																																																																											w)) {
																																																																										if (!c.equals(
																																																																												d2c)) {
																																																																											if (!c.equals(
																																																																													l)) {
																																																																												if (!c.equals(
																																																																														l2z)) {
																																																																													if (!c.equals(
																																																																															m)) {
																																																																														if (!b2y.equals(
																																																																																m2w)) {
																																																																															if (!b2y.equals(
																																																																																	y)) {
																																																																																if (!b2y.equals(
																																																																																		d)) {
																																																																																	if (!b2y.equals(
																																																																																			z)) {
																																																																																		if (!b2y.equals(
																																																																																				x)) {
																																																																																			if (!b2y.equals(
																																																																																					w)) {
																																																																																				if (!b2y.equals(
																																																																																						d2c)) {
																																																																																					if (!b2y.equals(
																																																																																							c)) {
																																																																																						if (!b2y.equals(
																																																																																								l)) {
																																																																																							if (!b2y.equals(
																																																																																									l2z)) {
																																																																																								if (!b2y.equals(
																																																																																										m)) {
																																																																																									if (!l.equals(
																																																																																											m2w)) {
																																																																																										if (!l.equals(
																																																																																												y)) {
																																																																																											if (!l.equals(
																																																																																													z)) {
																																																																																												if (!l.equals(
																																																																																														x)) {
																																																																																													if (!l.equals(
																																																																																															w)) {
																																																																																														if (!l.equals(
																																																																																																l2z)) {
																																																																																															if (!l.equals(
																																																																																																	m)) {
																																																																																																if (!l2z.equals(
																																																																																																		m2w)) {
																																																																																																	if (!l2z.equals(
																																																																																																			y)) {
																																																																																																		if (!l2z.equals(
																																																																																																				z)) {
																																																																																																			if (!l2z.equals(
																																																																																																					x)) {
																																																																																																				if (!l2z.equals(
																																																																																																						w)) {
																																																																																																					if (!l2z.equals(
																																																																																																							m)) {
																																																																																																						if (!m.equals(
																																																																																																								m2w)) {
																																																																																																							if (!m.equals(
																																																																																																									y)) {
																																																																																																								if (!m.equals(
																																																																																																										z)) {
																																																																																																									if (!m.equals(
																																																																																																											x)) {
																																																																																																										if (!m.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													m2w,
																																																																																																													y,
																																																																																																													d,
																																																																																																													z,
																																																																																																													x,
																																																																																																													b,
																																																																																																													a2x,
																																																																																																													w,
																																																																																																													a,
																																																																																																													d2c,
																																																																																																													c,
																																																																																																													b2y,
																																																																																																													l,
																																																																																																													l2z,
																																																																																																													m };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z, EObject x, EObject b,
			EObject a2x, EObject w, EObject a, EObject c, EObject b2y, EObject l, EObject l2z, EObject m) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String z__x____next_name_prime = "next";
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String m2w__w____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__y____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String m2w__m____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		z__x____next.setName(z__x____next_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, m2w, y, d, z, x, b, a2x, w, a, c, b2y, l, l2z, m, z__x____next, b__m____last,
				d__a____positive, a2x__x____target, m2w__w____target, a2x__a____source, w__y____next, c__x____positive,
				b2y__y____target, b2y__b____source, a__l____last, l2z__l____source, l2z__z____target, m2w__m____source,
				d__b____negative, c__y____negative };
	}

	public static final void pattern_decll2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z, EObject x,
			EObject b, EObject a2x, EObject w, EObject a, EObject d2c, EObject c, EObject b2y, EObject l, EObject l2z,
			EObject m) {
		_this.registerObjects_FWD(ruleresult, m2w, y, d, z, x, b, a2x, w, a, d2c, c, b2y, l, l2z, m);

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
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("l");
		EObject _localVariable_4 = match.getObject("m");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpM = _localVariable_4;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpM instanceof Assignment) {
							Assignment m = (Assignment) tmpM;
							return new Object[] { d, b, a, l, m, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_2_corematch_blackBBBFFBBB(Decision d, While b,
			While a, Assignment l, Assignment m, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { d, b, a, d2c, c, l, m, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_2_3_findcontext_blackBBBBBBB(Decision d, While b,
			While a, S2B d2c, Branch c, Assignment l, Assignment m) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (m.equals(b.getLast())) {
					if (a.equals(d.getPositive())) {
						if (c.equals(d2c.getTarget())) {
							if (d.equals(d2c.getSource())) {
								if (l.equals(a.getLast())) {
									if (b.equals(d.getNegative())) {
										_result.add(new Object[] { d, b, a, d2c, c, l, m });
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

	public static final Object[] pattern_decll2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(Decision d, While b,
			While a, S2B d2c, Branch c, Assignment l, Assignment m) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(m);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { d, b, a, d2c, c, l, m, isApplicableMatch, b__m____last, d__a____positive,
				d2c__c____target, d2c__d____source, a__l____last, d__b____negative };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Decision d, While b, While a, S2B d2c, Branch c, Assignment l,
			Assignment m) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, b, a, d2c, c, l, m);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, b, a, d2c, c, l, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Decision d, While b, While a, S2B d2c, Branch c, Assignment l,
			Assignment m) {
		Object[] result_pattern_decll2branchbb_2_4_solveCSP_binding = pattern_decll2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, d, b, a, d2c, c, l, m);
		if (result_pattern_decll2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_2_4_solveCSP_black = pattern_decll2branchbb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decll2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, b, a, d2c, c, l, m };
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
			Match match, Branch y, Command z, Branch x, Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { _this, match, y, z, x, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(decll2branchbb _this, Match match,
			Branch y, Command z, Branch x, Command w, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, z, x, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, z, x, w, c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(decll2branchbb _this,
			Match match, Branch y, Command z, Branch x, Command w, Branch c) {
		Object[] result_pattern_decll2branchbb_10_2_SolveCSP_binding = pattern_decll2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, y, z, x, w, c);
		if (result_pattern_decll2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_10_2_SolveCSP_black = pattern_decll2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, z, x, w, c };
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
			Branch y, Command z, Branch x, Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { match, y, z, x, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Branch y, Command z, Branch x, Command w, Branch c) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(w);
		String z__x____next_name_prime = "next";
		String w__y____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__x____next.setName(z__x____next_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { match, y, z, x, w, c, z__x____next, w__y____next, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decll2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match, Branch y,
			Command z, Branch x, Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { match, y, z, x, w, c };
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
			Match match, Branch y, Command z, Branch x, Command w, Branch c) {
		_this.registerObjectsToMatch_BWD(match, y, z, x, w, c);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpY = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpD2c = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpW instanceof Command) {
							Command w = (Command) tmpW;
							if (tmpD2c instanceof S2B) {
								S2B d2c = (S2B) tmpD2c;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { y, d, z, x, w, d2c, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Branch y, Decision d,
			Command z, Branch x, Command w, S2B d2c, Branch c, decll2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { y, d, z, x, w, d2c, c, csp, _this, isApplicableMatch };
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
			Branch y = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[0];
			Decision d = (Decision) result_pattern_decll2branchbb_11_1_performtransformation_binding[1];
			Command z = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[3];
			Command w = (Command) result_pattern_decll2branchbb_11_1_performtransformation_binding[4];
			S2B d2c = (S2B) result_pattern_decll2branchbb_11_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_decll2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_decll2branchbb_11_1_performtransformation_black = pattern_decll2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					y, d, z, x, w, d2c, c, _this, isApplicableMatch);
			if (result_pattern_decll2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decll2branchbb_11_1_performtransformation_black[7];

				return new Object[] { y, d, z, x, w, d2c, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_1_performtransformation_greenFBBBBFFBFFFFF(Branch y,
			Decision d, Command z, Branch x, Command w) {
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		m2w.setTarget(w);
		d.setNegative(b);
		a2x.setTarget(x);
		d.setPositive(a);
		a2x.setSource(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		a.setLast(l);
		l2z.setSource(l);
		l2z.setTarget(z);
		b.setLast(m);
		m2w.setSource(m);
		return new Object[] { m2w, y, d, z, x, b, a2x, w, a, b2y, l, l2z, m };
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N m2w,
			Branch y, Command z, Branch x, While b, S2B a2x, Command w, While a, S2B b2y, Assignment l, S2N l2z,
			Assignment m) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				if (!w.equals(z)) {
					if (!a.equals(b)) {
						if (!l.equals(m)) {
							if (!l2z.equals(m2w)) {
								return new Object[] { m2w, y, z, x, b, a2x, w, a, b2y, l, l2z, m };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N m2w,
			Branch y, Command z, Branch x, While b, S2B a2x, Command w, While a, S2B b2y, Assignment l, S2N l2z,
			Assignment m) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(m);
		return new Object[] { ruleresult, m2w, y, z, x, b, a2x, w, a, b2y, l, l2z, m };
	}

	public static final Object[] pattern_decll2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z, EObject x, EObject b,
			EObject a2x, EObject w, EObject a, EObject d2c, EObject c, EObject b2y, EObject l, EObject l2z, EObject m) {
		if (!m2w.equals(y)) {
			if (!m2w.equals(z)) {
				if (!m2w.equals(x)) {
					if (!m2w.equals(w)) {
						if (!y.equals(z)) {
							if (!d.equals(m2w)) {
								if (!d.equals(y)) {
									if (!d.equals(z)) {
										if (!d.equals(x)) {
											if (!d.equals(w)) {
												if (!d.equals(d2c)) {
													if (!d.equals(l)) {
														if (!d.equals(l2z)) {
															if (!d.equals(m)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!b.equals(m2w)) {
																			if (!b.equals(y)) {
																				if (!b.equals(d)) {
																					if (!b.equals(z)) {
																						if (!b.equals(x)) {
																							if (!b.equals(w)) {
																								if (!b.equals(d2c)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												b2y)) {
																											if (!b.equals(
																													l)) {
																												if (!b.equals(
																														l2z)) {
																													if (!b.equals(
																															m)) {
																														if (!a2x.equals(
																																m2w)) {
																															if (!a2x.equals(
																																	y)) {
																																if (!a2x.equals(
																																		d)) {
																																	if (!a2x.equals(
																																			z)) {
																																		if (!a2x.equals(
																																				x)) {
																																			if (!a2x.equals(
																																					b)) {
																																				if (!a2x.equals(
																																						w)) {
																																					if (!a2x.equals(
																																							d2c)) {
																																						if (!a2x.equals(
																																								c)) {
																																							if (!a2x.equals(
																																									b2y)) {
																																								if (!a2x.equals(
																																										l)) {
																																									if (!a2x.equals(
																																											l2z)) {
																																										if (!a2x.equals(
																																												m)) {
																																											if (!w.equals(
																																													y)) {
																																												if (!w.equals(
																																														z)) {
																																													if (!w.equals(
																																															x)) {
																																														if (!a.equals(
																																																m2w)) {
																																															if (!a.equals(
																																																	y)) {
																																																if (!a.equals(
																																																		d)) {
																																																	if (!a.equals(
																																																			z)) {
																																																		if (!a.equals(
																																																				x)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						a2x)) {
																																																					if (!a.equals(
																																																							w)) {
																																																						if (!a.equals(
																																																								d2c)) {
																																																							if (!a.equals(
																																																									c)) {
																																																								if (!a.equals(
																																																										b2y)) {
																																																									if (!a.equals(
																																																											l)) {
																																																										if (!a.equals(
																																																												l2z)) {
																																																											if (!a.equals(
																																																													m)) {
																																																												if (!d2c.equals(
																																																														m2w)) {
																																																													if (!d2c.equals(
																																																															y)) {
																																																														if (!d2c.equals(
																																																																z)) {
																																																															if (!d2c.equals(
																																																																	x)) {
																																																																if (!d2c.equals(
																																																																		w)) {
																																																																	if (!d2c.equals(
																																																																			l)) {
																																																																		if (!d2c.equals(
																																																																				l2z)) {
																																																																			if (!d2c.equals(
																																																																					m)) {
																																																																				if (!c.equals(
																																																																						m2w)) {
																																																																					if (!c.equals(
																																																																							y)) {
																																																																						if (!c.equals(
																																																																								d)) {
																																																																							if (!c.equals(
																																																																									z)) {
																																																																								if (!c.equals(
																																																																										x)) {
																																																																									if (!c.equals(
																																																																											w)) {
																																																																										if (!c.equals(
																																																																												d2c)) {
																																																																											if (!c.equals(
																																																																													l)) {
																																																																												if (!c.equals(
																																																																														l2z)) {
																																																																													if (!c.equals(
																																																																															m)) {
																																																																														if (!b2y.equals(
																																																																																m2w)) {
																																																																															if (!b2y.equals(
																																																																																	y)) {
																																																																																if (!b2y.equals(
																																																																																		d)) {
																																																																																	if (!b2y.equals(
																																																																																			z)) {
																																																																																		if (!b2y.equals(
																																																																																				x)) {
																																																																																			if (!b2y.equals(
																																																																																					w)) {
																																																																																				if (!b2y.equals(
																																																																																						d2c)) {
																																																																																					if (!b2y.equals(
																																																																																							c)) {
																																																																																						if (!b2y.equals(
																																																																																								l)) {
																																																																																							if (!b2y.equals(
																																																																																									l2z)) {
																																																																																								if (!b2y.equals(
																																																																																										m)) {
																																																																																									if (!l.equals(
																																																																																											m2w)) {
																																																																																										if (!l.equals(
																																																																																												y)) {
																																																																																											if (!l.equals(
																																																																																													z)) {
																																																																																												if (!l.equals(
																																																																																														x)) {
																																																																																													if (!l.equals(
																																																																																															w)) {
																																																																																														if (!l.equals(
																																																																																																l2z)) {
																																																																																															if (!l.equals(
																																																																																																	m)) {
																																																																																																if (!l2z.equals(
																																																																																																		m2w)) {
																																																																																																	if (!l2z.equals(
																																																																																																			y)) {
																																																																																																		if (!l2z.equals(
																																																																																																				z)) {
																																																																																																			if (!l2z.equals(
																																																																																																					x)) {
																																																																																																				if (!l2z.equals(
																																																																																																						w)) {
																																																																																																					if (!l2z.equals(
																																																																																																							m)) {
																																																																																																						if (!m.equals(
																																																																																																								m2w)) {
																																																																																																							if (!m.equals(
																																																																																																									y)) {
																																																																																																								if (!m.equals(
																																																																																																										z)) {
																																																																																																									if (!m.equals(
																																																																																																											x)) {
																																																																																																										if (!m.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													m2w,
																																																																																																													y,
																																																																																																													d,
																																																																																																													z,
																																																																																																													x,
																																																																																																													b,
																																																																																																													a2x,
																																																																																																													w,
																																																																																																													a,
																																																																																																													d2c,
																																																																																																													c,
																																																																																																													b2y,
																																																																																																													l,
																																																																																																													l2z,
																																																																																																													m };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z, EObject x, EObject b,
			EObject a2x, EObject w, EObject a, EObject c, EObject b2y, EObject l, EObject l2z, EObject m) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decll2branchbb";
		String z__x____next_name_prime = "next";
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String m2w__w____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__y____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String m2w__m____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		z__x____next.setName(z__x____next_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, m2w, y, d, z, x, b, a2x, w, a, c, b2y, l, l2z, m, z__x____next, b__m____last,
				d__a____positive, a2x__x____target, m2w__w____target, a2x__a____source, w__y____next, c__x____positive,
				b2y__y____target, b2y__b____source, a__l____last, l2z__l____source, l2z__z____target, m2w__m____source,
				d__b____negative, c__y____negative };
	}

	public static final void pattern_decll2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decll2branchbb _this, PerformRuleResult ruleresult, EObject m2w, EObject y, EObject d, EObject z, EObject x,
			EObject b, EObject a2x, EObject w, EObject a, EObject d2c, EObject c, EObject b2y, EObject l, EObject l2z,
			EObject m) {
		_this.registerObjects_BWD(ruleresult, m2w, y, d, z, x, b, a2x, w, a, d2c, c, b2y, l, l2z, m);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("w");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							return new Object[] { y, z, x, w, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_2_corematch_blackBFBBBFBB(Branch y, Command z,
			Branch x, Command w, Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { y, d, z, x, w, d2c, c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_12_3_findcontext_blackBBBBBBB(Branch y, Decision d,
			Command z, Branch x, Command w, S2B d2c, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						if (x.equals(z.getNext())) {
							if (y.equals(w.getNext())) {
								if (x.equals(c.getPositive())) {
									if (c.equals(d2c.getTarget())) {
										if (d.equals(d2c.getSource())) {
											if (y.equals(c.getNegative())) {
												_result.add(new Object[] { y, d, z, x, w, d2c, c });
											}
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

	public static final Object[] pattern_decll2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Branch y, Decision d,
			Command z, Branch x, Command w, S2B d2c, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String w__y____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		z__x____next.setName(z__x____next_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { y, d, z, x, w, d2c, c, isApplicableMatch, z__x____next, w__y____next, c__x____positive,
				d2c__c____target, d2c__d____source, c__y____negative };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch y, Decision d, Command z, Branch x, Command w, S2B d2c,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, d, z, x, w, d2c, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, d, z, x, w, d2c, c };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch y, Decision d, Command z, Branch x, Command w, S2B d2c,
			Branch c) {
		Object[] result_pattern_decll2branchbb_12_4_solveCSP_binding = pattern_decll2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, y, d, z, x, w, d2c, c);
		if (result_pattern_decll2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_12_4_solveCSP_black = pattern_decll2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, d, z, x, w, d2c, c };
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_495952 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_815014 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_815014)) {
							if (!x.equals(__DEC_y_positive_815014)) {
								if (!c.equals(__DEC_y_positive_815014)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_784414 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_784414)) {
							if (!x.equals(__DEC_y_negative_784414)) {
								if (!c.equals(__DEC_y_negative_784414)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_226638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_741761 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_741761)) {
							if (!x.equals(__DEC_z_positive_741761)) {
								if (!c.equals(__DEC_z_positive_741761)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_587709 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_587709)) {
							if (!x.equals(__DEC_z_negative_587709)) {
								if (!c.equals(__DEC_z_negative_587709)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_165210 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_364159 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_364159)) {
							if (!y.equals(__DEC_x_positive_364159)) {
								if (!c.equals(__DEC_x_positive_364159)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_349003 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_349003)) {
							if (!y.equals(__DEC_x_negative_349003)) {
								if (!c.equals(__DEC_x_negative_349003)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(Command w) {
		for (Graph __DEC_w_root_313400 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_positive_921713 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_921713)) {
							if (!x.equals(__DEC_w_positive_921713)) {
								if (!c.equals(__DEC_w_positive_921713)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_negative_657619 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_657619)) {
							if (!x.equals(__DEC_w_negative_657619)) {
								if (!c.equals(__DEC_w_negative_657619)) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
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
		if (w.equals(c.getPositive())) {
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

	public static final Object[] pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
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
					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_3B(z) == null) {
						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_13BB(x, z) == null) {
								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_16BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Branch) {
												Branch y = (Branch) tmpY;
												if (!x.equals(y)) {
													if (!c.equals(y)) {
														if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																c, z) == null) {
															if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																	c, z) == null) {
																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_0B(
																		y) == null) {
																	if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(
																			y, x, c) == null) {
																		if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
																				y, x, c) == null) {
																			if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																					z, y, x, c) == null) {
																				if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																						z, y, x, c) == null) {
																					if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																							x, y, c) == null) {
																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																								x, y, c) == null) {
																							if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																									y, z) == null) {
																								if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																										y, z) == null) {
																									if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_18BB(
																											y,
																											x) == null) {
																										if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_19BB(
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
																														if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_9B(
																																w) == null) {
																															if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_10BBBB(
																																	w,
																																	y,
																																	x,
																																	c) == null) {
																																if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_11BBBB(
																																		w,
																																		y,
																																		x,
																																		c) == null) {
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
																																						if (pattern_decll2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																																								c,
																																								w) == null) {
																																							_result.add(
																																									new Object[] {
																																											y,
																																											z,
																																											x,
																																											w,
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
			decll2branchbb _this, Match match, Branch y, Command z, Branch x, Command w, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, z, x, w, c);
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
		for (Decision __DEC_b_positive_522618 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_522618)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_713550 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_713550)) {
					if (!a.equals(__DEC_b_first_713550)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_922097 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_922097)) {
					if (!a.equals(__DEC_b_last_922097)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3B(While b) {
		for (Program __DEC_b_first_264307 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_269864 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_269864)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_91128 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_91128)) {
					if (!b.equals(__DEC_a_first_91128)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_741449 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_741449)) {
					if (!b.equals(__DEC_a_last_741449)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_850831 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_586486 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_586486)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_836199 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_836199)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_184403 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_184403)) {
					if (!a.equals(__DEC_l_first_184403)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_465969 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_465969)) {
					if (!a.equals(__DEC_l_last_465969)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_227004 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_390857 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_390857)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_854823 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_854823)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_367922 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_367922)) {
					if (!a.equals(__DEC_m_first_367922)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_119438 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_119438)) {
					if (!a.equals(__DEC_m_last_119438)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(Assignment m) {
		for (Program __DEC_m_first_299130 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
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
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(While b,
			Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(While a,
			Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_last.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpM = _edge_last.getTrg();
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (m.equals(b.getLast())) {
					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_3B(b) == null) {
						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_17B(m) == null) {
							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_29BB(b, m) == null) {
								for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
										Decision.class, "negative")) {
									Statement tmpA = d.getPositive();
									if (tmpA instanceof While) {
										While a = (While) tmpA;
										if (!a.equals(b)) {
											Statement tmpL = a.getLast();
											if (tmpL instanceof Assignment) {
												Assignment l = (Assignment) tmpL;
												if (!l.equals(m)) {
													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
															b, d) == null) {
														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_13BB(
																m, d) == null) {
															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																	m, d) == null) {
																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																		d, b) == null) {
																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																			d, m) == null) {
																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																				d, m) == null) {
																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																					b, a) == null) {
																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_2BB(
																						b, a) == null) {
																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_4BB(
																							a, d) == null) {
																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																								a, b) == null) {
																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																									a, b) == null) {
																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_7B(
																										a) == null) {
																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_15BBB(
																											m, b,
																											a) == null) {
																										if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_16BBB(
																												m, b,
																												a) == null) {
																											if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																													d,
																													a) == null) {
																												if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																														b,
																														a) == null) {
																													if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																															b,
																															a) == null) {
																														if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_30BB(
																																a,
																																m) == null) {
																															if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_31BB(
																																	a,
																																	m) == null) {
																																if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_8BB(
																																		l,
																																		d) == null) {
																																	if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_9BB(
																																			l,
																																			d) == null) {
																																		if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_10BBB(
																																				l,
																																				b,
																																				a) == null) {
																																			if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(
																																					l,
																																					b,
																																					a) == null) {
																																				if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_12B(
																																						l) == null) {
																																					if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																							d,
																																							l) == null) {
																																						if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																																								d,
																																								l) == null) {
																																							if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																									b,
																																									l) == null) {
																																								if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																										a,
																																										l) == null) {
																																									if (pattern_decll2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																											b,
																																											l) == null) {
																																										_result.add(
																																												new Object[] {
																																														d,
																																														b,
																																														a,
																																														l,
																																														m,
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
			decll2branchbb _this, Match match, Decision d, While b, While a, Assignment l, Assignment m) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, b, a, l, m);
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
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = sourceMatch.getObject("d");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("w");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = targetMatch.getObject("c");
		EObject _localVariable_8 = sourceMatch.getObject("l");
		EObject _localVariable_9 = sourceMatch.getObject("m");
		EObject tmpY = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpC = _localVariable_7;
		EObject tmpL = _localVariable_8;
		EObject tmpM = _localVariable_9;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							if (tmpW instanceof Command) {
								Command w = (Command) tmpW;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									if (tmpC instanceof Branch) {
										Branch c = (Branch) tmpC;
										if (tmpL instanceof Assignment) {
											Assignment l = (Assignment) tmpL;
											if (tmpM instanceof Assignment) {
												Assignment m = (Assignment) tmpM;
												return new Object[] { y, d, z, x, b, w, a, c, l, m, targetMatch,
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

	public static final Object[] pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Branch y, Decision d,
			Command z, Branch x, While b, Command w, While a, Branch c, Assignment l, Assignment m, Match sourceMatch,
			Match targetMatch) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!a.equals(b)) {
					if (!c.equals(y)) {
						if (!c.equals(x)) {
							if (!l.equals(m)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch };
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
			Branch y = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[0];
			Decision d = (Decision) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[1];
			Command z = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[3];
			While b = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[4];
			Command w = (Command) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[5];
			While a = (While) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch c = (Branch) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[7];
			Assignment l = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[8];
			Assignment m = (Assignment) result_pattern_decll2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black = pattern_decll2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch);
			if (result_pattern_decll2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(decll2branchbb _this,
			Branch y, Decision d, Command z, Branch x, While b, Command w, While a, Branch c, Assignment l,
			Assignment m, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			decll2branchbb _this, Branch y, Decision d, Command z, Branch x, While b, Command w, While a, Branch c,
			Assignment l, Assignment m, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decll2branchbb_24_3_solvecsp_binding = pattern_decll2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch);
		if (result_pattern_decll2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decll2branchbb_24_3_solvecsp_black = pattern_decll2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decll2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, d, z, x, b, w, a, c, l, m, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decll2branchbb_24_5_matchcorrcontext_blackBFBBB(Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d, d2c, c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(Branch y, Decision d,
			Command z, Branch x, While b, Command w, While a, Branch c, Assignment l, Assignment m, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!a.equals(b)) {
					if (!c.equals(y)) {
						if (!c.equals(x)) {
							if (!l.equals(m)) {
								return new Object[] { y, d, z, x, b, w, a, c, l, m, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_24_6_createcorrespondence_greenFBBBBFBBFBFBB(Branch y,
			Command z, Branch x, While b, Command w, While a, Assignment l, Assignment m, CCMatch ccMatch) {
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		m2w.setTarget(w);
		m2w.setSource(m);
		ccMatch.getCreateCorr().add(m2w);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		return new Object[] { m2w, y, z, x, b, a2x, w, a, b2y, l, l2z, m, ccMatch };
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
		for (Decision __DEC_b_positive_363514 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_363514)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_780546 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_780546)) {
					if (!a.equals(__DEC_b_first_780546)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_219055 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_219055)) {
					if (!a.equals(__DEC_b_last_219055)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_3B(While b) {
		for (Program __DEC_b_first_17724 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_530740 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_530740)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_195885 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_195885)) {
					if (!b.equals(__DEC_a_first_195885)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_861027 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_861027)) {
					if (!b.equals(__DEC_a_last_861027)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_781590 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_8BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_665841 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_665841)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_220749 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_220749)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_356424 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_356424)) {
					if (!a.equals(__DEC_l_first_356424)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_513590 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_513590)) {
					if (!a.equals(__DEC_l_last_513590)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_123432 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_653403 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_653403)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_968036 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_968036)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_695640 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_695640)) {
					if (!a.equals(__DEC_m_first_695640)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_329623 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_329623)) {
					if (!a.equals(__DEC_m_last_329623)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(Assignment m) {
		for (Program __DEC_m_first_231299 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
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

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_22BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(Decision d, Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(Decision d, Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_29BB(While b, Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_30BB(While a, Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_black_nac_31BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_27_1_matchtggpattern_blackBBBBB(Decision d, While b, While a,
			Assignment l, Assignment m) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (m.equals(b.getLast())) {
					if (a.equals(d.getPositive())) {
						if (l.equals(a.getLast())) {
							if (b.equals(d.getNegative())) {
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
																		l, d) == null) {
																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_9BB(
																			l, d) == null) {
																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_10BBB(
																				l, b, a) == null) {
																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_11BBB(
																					l, b, a) == null) {
																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_12B(
																						l) == null) {
																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_13BB(
																							m, d) == null) {
																						if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_14BB(
																								m, d) == null) {
																							if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_15BBB(
																									m, b, a) == null) {
																								if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_16BBB(
																										m, b,
																										a) == null) {
																									if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_17B(
																											m) == null) {
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
																																l) == null) {
																															if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_23BB(
																																	d,
																																	l) == null) {
																																if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																		b,
																																		l) == null) {
																																	if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																			a,
																																			l) == null) {
																																		if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																				b,
																																				l) == null) {
																																			if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																					d,
																																					m) == null) {
																																				if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																						d,
																																						m) == null) {
																																					if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																							b,
																																							m) == null) {
																																						if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_30BB(
																																								a,
																																								m) == null) {
																																							if (pattern_decll2branchbb_27_1_matchtggpattern_black_nac_31BB(
																																									a,
																																									m) == null) {
																																								return new Object[] {
																																										d,
																																										b,
																																										a,
																																										l,
																																										m };
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_350891 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_494935 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_494935)) {
							if (!x.equals(__DEC_y_positive_494935)) {
								if (!c.equals(__DEC_y_positive_494935)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_152341 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_152341)) {
							if (!x.equals(__DEC_y_negative_152341)) {
								if (!c.equals(__DEC_y_negative_152341)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_974539 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_801103 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_801103)) {
							if (!x.equals(__DEC_z_positive_801103)) {
								if (!c.equals(__DEC_z_positive_801103)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_392466 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_392466)) {
							if (!x.equals(__DEC_z_negative_392466)) {
								if (!c.equals(__DEC_z_negative_392466)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_833619 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_181269 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_181269)) {
							if (!y.equals(__DEC_x_positive_181269)) {
								if (!c.equals(__DEC_x_positive_181269)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_935919 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_935919)) {
							if (!y.equals(__DEC_x_negative_935919)) {
								if (!c.equals(__DEC_x_negative_935919)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(Command w) {
		for (Graph __DEC_w_root_926571 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_positive_485237 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_485237)) {
							if (!x.equals(__DEC_w_positive_485237)) {
								if (!c.equals(__DEC_w_positive_485237)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_negative_734850 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_734850)) {
							if (!x.equals(__DEC_w_negative_734850)) {
								if (!c.equals(__DEC_w_negative_734850)) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
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
		if (w.equals(c.getPositive())) {
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

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_28_1_matchtggpattern_blackBBBBB(Branch y, Command z, Branch x,
			Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						if (x.equals(z.getNext())) {
							if (y.equals(w.getNext())) {
								if (x.equals(c.getPositive())) {
									if (y.equals(c.getNegative())) {
										if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_0B(y) == null) {
											if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_1BBB(y, x,
													c) == null) {
												if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_2BBB(y, x,
														c) == null) {
													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_3B(
															z) == null) {
														if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_4BBBB(
																z, y, x, c) == null) {
															if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_5BBBB(
																	z, y, x, c) == null) {
																if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_6B(
																		x) == null) {
																	if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																			x, y, c) == null) {
																		if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																				x, y, c) == null) {
																			if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_9B(
																					w) == null) {
																				if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_10BBBB(
																						w, y, x, c) == null) {
																					if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_11BBBB(
																							w, y, x, c) == null) {
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
																														x) == null) {
																													if (pattern_decll2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															y,
																															x) == null) {
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
																																					c,
																																					w) == null) {
																																				return new Object[] {
																																						y,
																																						z,
																																						x,
																																						w,
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
			IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, d2c, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decll2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(decll2branchbb _this,
			IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decll2branchbb_29_3_solveCSP_binding = pattern_decll2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, d2c, c, ruleResult);
		if (result_pattern_decll2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decll2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decll2branchbb_29_3_solveCSP_black = pattern_decll2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decll2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decll2branchbb_29_4_checkCSP_expressionFBB(decll2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decll2branchbb_29_5_checknacs_blackBBB(Decision d, S2B d2c, Branch c) {
		return new Object[] { d, d2c, c };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_blackBBBB(Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, d2c, c, ruleResult };
	}

	public static final Object[] pattern_decll2branchbb_29_6_perform_greenFFBFFFFFFBFFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2w);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.getTargetObjects().add(z);
		z.setNext(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		m2w.setTarget(w);
		w.setNext(y);
		ruleResult.getTargetObjects().add(w);
		d.setPositive(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		a.setLast(l);
		ruleResult.getSourceObjects().add(l);
		l2z.setSource(l);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		b.setLast(m);
		m2w.setSource(m);
		ruleResult.getSourceObjects().add(m);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2w, y, d, z, x, b, a2x, w, a, c, b2y, l, l2z, m, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decll2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decll2branchbbImpl
