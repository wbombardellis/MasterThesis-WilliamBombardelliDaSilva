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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decull2branchubb;

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
 * An implementation of the model object '<em><b>decull2branchubb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decull2branchubbImpl extends AbstractRuleImpl implements decull2branchubb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decull2branchubbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecull2branchubb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, While b, Assignment m, Decision d, While a) {

		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_0_1_initialbindings_blackBBBBBBB(this,
				match, l, b, m, d, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[m] = " + m + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, l, b, m, d, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[m] = " + m + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decull2branchubbImpl.pattern_decull2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decull2branchubbImpl
					.pattern_decull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(match, l, b, m, d, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[b] = " + b + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, l,
					b, m, d, a);
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[10];

			Object[] result5_black = decull2branchubbImpl
					.pattern_decull2branchubb_0_5_collectcontextelements_blackBBBBBB(match, l, b, m, d, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[b] = " + b + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decull2branchubbImpl.pattern_decull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, l,
					b, m, d, a);
			return decull2branchubbImpl.pattern_decull2branchubb_0_7_expressionF();
		} else {
			return decull2branchubbImpl.pattern_decull2branchubb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		Assignment m = (Assignment) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		While a = (While) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decull2branchubbImpl
				.pattern_decull2branchubb_1_1_performtransformation_greenBFFFFFFFBBFBB(l, b, m, a, c);
		S2N l2z = (S2N) result1_green[1];
		S2N m2w = (S2N) result1_green[2];
		S2B b2y = (S2B) result1_green[3];
		Command z = (Command) result1_green[4];
		S2B a2x = (S2B) result1_green[5];
		Branch y = (Branch) result1_green[6];
		Command w = (Command) result1_green[7];
		Branch x = (Branch) result1_green[10];

		Object[] result2_black = decull2branchubbImpl
				.pattern_decull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(l, l2z, m2w, b2y, z, a2x, y,
						w, b, m, x, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[l2z] = "
					+ l2z + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[a2x] = "
					+ a2x + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[m] = " + m + ", "
					+ "[x] = " + x + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = decull2branchubbImpl
				.pattern_decull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l, l2z, m2w, b2y, z, a2x, y,
						w, b, m, x, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decull2branchubbImpl
				.pattern_decull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l, l2z, m2w, b2y, z,
						a2x, y, w, b, m, x, d2c, d, a, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[l2z] = " + l2z + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y
					+ ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[m] = " + m + ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
		}
		decull2branchubbImpl.pattern_decull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d, a, c);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[32];

		// 
		// 
		decull2branchubbImpl.pattern_decull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d2c, d, a, c);
		return decull2branchubbImpl.pattern_decull2branchubb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decull2branchubbImpl
				.pattern_decull2branchubb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decull2branchubbImpl.pattern_decull2branchubb_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		While b = (While) result2_binding[1];
		Assignment m = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : decull2branchubbImpl.pattern_decull2branchubb_2_2_corematch_blackBBBFBBFB(l, b, m,
				d, a, match)) {
			S2B d2c = (S2B) result2_black[3];
			Branch c = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : decull2branchubbImpl.pattern_decull2branchubb_2_3_findcontext_blackBBBBBBB(l,
					b, m, d2c, d, a, c)) {
				Object[] result3_green = decull2branchubbImpl
						.pattern_decull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(l, b, m, d2c, d, a, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = decull2branchubbImpl
						.pattern_decull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, l, b,
								m, d2c, d, a, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[b] = " + b
							+ ", " + "[m] = " + m + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[a] = " + a
							+ ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decull2branchubbImpl.pattern_decull2branchubb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decull2branchubbImpl
							.pattern_decull2branchubb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decull2branchubbImpl.pattern_decull2branchubb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decull2branchubbImpl.pattern_decull2branchubb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		match.registerObject("l", l);
		match.registerObject("b", b);
		match.registerObject("m", m);
		match.registerObject("d", d);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, While b, Assignment m, Decision d, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, While b, Assignment m,
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
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("m", m);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y,
			EObject z, EObject a2x, EObject y, EObject w, EObject b, EObject m, EObject x, EObject d2c, EObject d,
			EObject a, EObject c) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Branch y, Command w, Branch x, Branch c) {

		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_10_1_initialbindings_blackBBBBBBB(this,
				match, z, y, w, x, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, y, w, x, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decull2branchubbImpl.pattern_decull2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decull2branchubbImpl
					.pattern_decull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(match, z, y, w, x, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[y] = " + y + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[c] = " + c + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, z,
					y, w, x, c);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[10];

			Object[] result5_black = decull2branchubbImpl
					.pattern_decull2branchubb_10_5_collectcontextelements_blackBBBBBB(match, z, y, w, x, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[y] = " + y + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[c] = " + c + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decull2branchubbImpl.pattern_decull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, z,
					y, w, x, c);
			return decull2branchubbImpl.pattern_decull2branchubb_10_7_expressionF();
		} else {
			return decull2branchubbImpl.pattern_decull2branchubb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command z = (Command) result1_bindingAndBlack[0];
		Branch y = (Branch) result1_bindingAndBlack[1];
		Command w = (Command) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decull2branchubbImpl
				.pattern_decull2branchubb_11_1_performtransformation_greenFFFFBFBBFFBBF(z, y, w, x, d);
		Assignment l = (Assignment) result1_green[0];
		S2N l2z = (S2N) result1_green[1];
		S2N m2w = (S2N) result1_green[2];
		S2B b2y = (S2B) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		While b = (While) result1_green[8];
		Assignment m = (Assignment) result1_green[9];
		While a = (While) result1_green[12];

		Object[] result2_black = decull2branchubbImpl
				.pattern_decull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(l, l2z, m2w, b2y, z, a2x, y,
						w, b, m, x, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[l2z] = "
					+ l2z + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[a2x] = "
					+ a2x + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[m] = " + m + ", "
					+ "[x] = " + x + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = decull2branchubbImpl
				.pattern_decull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l, l2z, m2w, b2y, z, a2x, y,
						w, b, m, x, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decull2branchubbImpl
				.pattern_decull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l, l2z, m2w, b2y,
						z, a2x, y, w, b, m, x, d2c, d, a, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[l2z] = " + l2z + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y
					+ ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[m] = " + m + ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
		}
		decull2branchubbImpl.pattern_decull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d, a, c);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[32];

		// 
		// 
		decull2branchubbImpl.pattern_decull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d2c, d, a, c);
		return decull2branchubbImpl.pattern_decull2branchubb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decull2branchubbImpl
				.pattern_decull2branchubb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decull2branchubbImpl.pattern_decull2branchubb_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command z = (Command) result2_binding[0];
		Branch y = (Branch) result2_binding[1];
		Command w = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch c = (Branch) result2_binding[4];
		for (Object[] result2_black : decull2branchubbImpl.pattern_decull2branchubb_12_2_corematch_blackBBBBFFBB(z, y,
				w, x, c, match)) {
			S2B d2c = (S2B) result2_black[4];
			Decision d = (Decision) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decull2branchubbImpl.pattern_decull2branchubb_12_3_findcontext_blackBBBBBBB(z,
					y, w, x, d2c, d, c)) {
				Object[] result3_green = decull2branchubbImpl
						.pattern_decull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(z, y, w, x, d2c, d, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = decull2branchubbImpl
						.pattern_decull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z, y,
								w, x, d2c, d, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[y] = " + y
							+ ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
							+ ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decull2branchubbImpl.pattern_decull2branchubb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decull2branchubbImpl
							.pattern_decull2branchubb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decull2branchubbImpl.pattern_decull2branchubb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decull2branchubbImpl.pattern_decull2branchubb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("w", w);
		match.registerObject("x", x);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch y, Command w, Branch x, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, Branch y, Command w, Branch x,
			S2B d2c, Decision d, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("x", x);
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y,
			EObject z, EObject a2x, EObject y, EObject w, EObject b, EObject m, EObject x, EObject d2c, EObject d,
			EObject a, EObject c) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_138(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decull2branchubbImpl.pattern_decull2branchubb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decull2branchubbImpl
				.pattern_decull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Command z = (Command) result2_black[0];
			Branch y = (Branch) result2_black[1];
			Command w = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch c = (Branch) result2_black[4];
			Object[] result2_green = decull2branchubbImpl
					.pattern_decull2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decull2branchubbImpl
					.pattern_decull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, y, w, x, c)) {
				// 
				if (decull2branchubbImpl
						.pattern_decull2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decull2branchubbImpl
							.pattern_decull2branchubb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decull2branchubbImpl.pattern_decull2branchubb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decull2branchubbImpl.pattern_decull2branchubb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_138(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decull2branchubbImpl.pattern_decull2branchubb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decull2branchubbImpl
				.pattern_decull2branchubb_21_2_testcorematchandDECs_blackFFFFFB(_edge_last)) {
			Assignment l = (Assignment) result2_black[0];
			While b = (While) result2_black[1];
			Assignment m = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = decull2branchubbImpl
					.pattern_decull2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decull2branchubbImpl
					.pattern_decull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, l, b, m, d, a)) {
				// 
				if (decull2branchubbImpl
						.pattern_decull2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decull2branchubbImpl
							.pattern_decull2branchubb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decull2branchubbImpl.pattern_decull2branchubb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decull2branchubbImpl.pattern_decull2branchubb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decull2branchubb");
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
		ruleResult.setRule("decull2branchubb");
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

		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decull2branchubbImpl.pattern_decull2branchubb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		Command z = (Command) result2_bindingAndBlack[1];
		Branch y = (Branch) result2_bindingAndBlack[2];
		Command w = (Command) result2_bindingAndBlack[3];
		While b = (While) result2_bindingAndBlack[4];
		Assignment m = (Assignment) result2_bindingAndBlack[5];
		Branch x = (Branch) result2_bindingAndBlack[6];
		Decision d = (Decision) result2_bindingAndBlack[7];
		While a = (While) result2_bindingAndBlack[8];
		Branch c = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, l, z, y, w, b, m, x, d, a,
						c, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = "
					+ b + ", " + "[m] = " + m + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[c] = " + c + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decull2branchubbImpl.pattern_decull2branchubb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decull2branchubbImpl
					.pattern_decull2branchubb_24_5_matchcorrcontext_blackFBBBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decull2branchubbImpl
						.pattern_decull2branchubb_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decull2branchubbImpl
						.pattern_decull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(l, z, y, w, b, m, x, d, a,
								c, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
							+ "[m] = " + m + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
							+ "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decull2branchubbImpl.pattern_decull2branchubb_24_6_createcorrespondence_greenBFFFBFBBBBBBB(l, z, y, w,
						b, m, x, a, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[1];
				//nothing S2N m2w = (S2N) result6_green[2];
				//nothing S2B b2y = (S2B) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[5];

				Object[] result7_black = decull2branchubbImpl
						.pattern_decull2branchubb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decull2branchubbImpl.pattern_decull2branchubb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decull2branchubbImpl.pattern_decull2branchubb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment l, Command z, Branch y, Command w, While b, Assignment m, Branch x,
			Decision d, While a, Branch c, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, While b, Assignment m, Decision d, While a) {// 
		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_27_1_matchtggpattern_blackBBBBB(l, b, m,
				d, a);
		if (result1_black != null) {
			return decull2branchubbImpl.pattern_decull2branchubb_27_2_expressionF();
		} else {
			return decull2branchubbImpl.pattern_decull2branchubb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command z, Branch y, Command w, Branch x, Branch c) {// 
		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_28_1_matchtggpattern_blackBBBBB(z, y, w,
				x, c);
		if (result1_black != null) {
			return decull2branchubbImpl.pattern_decull2branchubb_28_2_expressionF();
		} else {
			return decull2branchubbImpl.pattern_decull2branchubb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decull2branchubbImpl.pattern_decull2branchubb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decull2branchubbImpl
				.pattern_decull2branchubb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decull2branchubbImpl
					.pattern_decull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, d, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decull2branchubbImpl.pattern_decull2branchubb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decull2branchubbImpl.pattern_decull2branchubb_29_5_checknacs_blackBBB(d2c, d,
						c);
				if (result5_black != null) {

					Object[] result6_black = decull2branchubbImpl.pattern_decull2branchubb_29_6_perform_blackBBBB(d2c,
							d, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decull2branchubbImpl.pattern_decull2branchubb_29_6_perform_greenFFFFFFFFFFFBFBB(d, c, ruleResult);
					//nothing Assignment l = (Assignment) result6_green[0];
					//nothing S2N l2z = (S2N) result6_green[1];
					//nothing S2N m2w = (S2N) result6_green[2];
					//nothing S2B b2y = (S2B) result6_green[3];
					//nothing Command z = (Command) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[5];
					//nothing Branch y = (Branch) result6_green[6];
					//nothing Command w = (Command) result6_green[7];
					//nothing While b = (While) result6_green[8];
					//nothing Assignment m = (Assignment) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];
					//nothing While a = (While) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return decull2branchubbImpl.pattern_decull2branchubb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_ASSIGNMENT_S2B_DECISION_WHILE_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (S2B) arguments.get(4),
					(Decision) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECULL2BRANCHUBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_COMMAND_BRANCH_S2B_DECISION_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECULL2BRANCHUBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_138__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_138((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_138__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_138((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_COMMAND_BRANCH_COMMAND_WHILE_ASSIGNMENT_BRANCH_DECISION_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (Decision) arguments.get(7),
					(While) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULL2BRANCHUBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULL2BRANCHUBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_DECISION_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULL2BRANCHUBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decull2branchubb_0_1_initialbindings_blackBBBBBBB(decull2branchubb _this,
			Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, l, b, m, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(decull2branchubb _this,
			Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, b, m, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, b, m, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(decull2branchubb _this,
			Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		Object[] result_pattern_decull2branchubb_0_2_SolveCSP_binding = pattern_decull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, l, b, m, d, a);
		if (result_pattern_decull2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_0_2_SolveCSP_black = pattern_decull2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, b, m, d, a };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_0_3_CheckCSP_expressionFBB(decull2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Assignment l, While b, Assignment m, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, b, m, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(a);
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { match, l, b, m, d, a, b__m____last, d__a____positive, d__b____negative, a__l____first,
				a__l____last };
	}

	public static final Object[] pattern_decull2branchubb_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment l, While b, Assignment m, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, b, m, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(
			decull2branchubb _this, Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		_this.registerObjectsToMatch_FWD(match, l, b, m, d, a);

	}

	public static final boolean pattern_decull2branchubb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decull2branchubb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("l");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("m");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpA = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { l, b, m, d2c, d, a, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(Assignment l,
			While b, Assignment m, S2B d2c, Decision d, While a, Branch c, decull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { l, b, m, d2c, d, a, c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			decull2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decull2branchubb_1_1_performtransformation_binding = pattern_decull2branchubb_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decull2branchubb_1_1_performtransformation_binding != null) {
			Assignment l = (Assignment) result_pattern_decull2branchubb_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_decull2branchubb_1_1_performtransformation_binding[1];
			Assignment m = (Assignment) result_pattern_decull2branchubb_1_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decull2branchubb_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decull2branchubb_1_1_performtransformation_binding[4];
			While a = (While) result_pattern_decull2branchubb_1_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_decull2branchubb_1_1_performtransformation_binding[6];

			Object[] result_pattern_decull2branchubb_1_1_performtransformation_black = pattern_decull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(
					l, b, m, d2c, d, a, c, _this, isApplicableMatch);
			if (result_pattern_decull2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decull2branchubb_1_1_performtransformation_black[7];

				return new Object[] { l, b, m, d2c, d, a, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_1_performtransformation_greenBFFFFFFFBBFBB(Assignment l,
			While b, Assignment m, While a, Branch c) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		l2z.setSource(l);
		m2w.setSource(m);
		b2y.setSource(b);
		l2z.setTarget(z);
		a2x.setSource(a);
		b2y.setTarget(y);
		c.setNegative(y);
		w.setNext(y);
		m2w.setTarget(w);
		z.setNext(x);
		a2x.setTarget(x);
		x.setPositive(z);
		c.setPositive(x);
		return new Object[] { l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, a, c };
	}

	public static final Object[] pattern_decull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Assignment l,
			S2N l2z, S2N m2w, S2B b2y, Command z, S2B a2x, Branch y, Command w, While b, Assignment m, Branch x,
			While a) {
		if (!l.equals(m)) {
			if (!l2z.equals(m2w)) {
				if (!a2x.equals(b2y)) {
					if (!w.equals(z)) {
						if (!x.equals(y)) {
							if (!a.equals(b)) {
								return new Object[] { l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Assignment l,
			S2N l2z, S2N m2w, S2B b2y, Command z, S2B a2x, Branch y, Command w, While b, Assignment m, Branch x,
			While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, a };
	}

	public static final Object[] pattern_decull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y, EObject z, EObject a2x,
			EObject y, EObject w, EObject b, EObject m, EObject x, EObject d2c, EObject d, EObject a, EObject c) {
		if (!l.equals(l2z)) {
			if (!l.equals(m2w)) {
				if (!l.equals(z)) {
					if (!l.equals(y)) {
						if (!l.equals(w)) {
							if (!l.equals(m)) {
								if (!l.equals(x)) {
									if (!l2z.equals(m2w)) {
										if (!l2z.equals(z)) {
											if (!l2z.equals(y)) {
												if (!l2z.equals(w)) {
													if (!l2z.equals(m)) {
														if (!l2z.equals(x)) {
															if (!m2w.equals(z)) {
																if (!m2w.equals(y)) {
																	if (!m2w.equals(w)) {
																		if (!m2w.equals(x)) {
																			if (!b2y.equals(l)) {
																				if (!b2y.equals(l2z)) {
																					if (!b2y.equals(m2w)) {
																						if (!b2y.equals(z)) {
																							if (!b2y.equals(y)) {
																								if (!b2y.equals(w)) {
																									if (!b2y.equals(
																											m)) {
																										if (!b2y.equals(
																												x)) {
																											if (!b2y.equals(
																													d2c)) {
																												if (!b2y.equals(
																														d)) {
																													if (!b2y.equals(
																															c)) {
																														if (!a2x.equals(
																																l)) {
																															if (!a2x.equals(
																																	l2z)) {
																																if (!a2x.equals(
																																		m2w)) {
																																	if (!a2x.equals(
																																			b2y)) {
																																		if (!a2x.equals(
																																				z)) {
																																			if (!a2x.equals(
																																					y)) {
																																				if (!a2x.equals(
																																						w)) {
																																					if (!a2x.equals(
																																							b)) {
																																						if (!a2x.equals(
																																								m)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!a2x.equals(
																																										d2c)) {
																																									if (!a2x.equals(
																																											d)) {
																																										if (!a2x.equals(
																																												c)) {
																																											if (!y.equals(
																																													z)) {
																																												if (!w.equals(
																																														z)) {
																																													if (!w.equals(
																																															y)) {
																																														if (!w.equals(
																																																x)) {
																																															if (!b.equals(
																																																	l)) {
																																																if (!b.equals(
																																																		l2z)) {
																																																	if (!b.equals(
																																																			m2w)) {
																																																		if (!b.equals(
																																																				b2y)) {
																																																			if (!b.equals(
																																																					z)) {
																																																				if (!b.equals(
																																																						y)) {
																																																					if (!b.equals(
																																																							w)) {
																																																						if (!b.equals(
																																																								m)) {
																																																							if (!b.equals(
																																																									x)) {
																																																								if (!b.equals(
																																																										d2c)) {
																																																									if (!b.equals(
																																																											d)) {
																																																										if (!b.equals(
																																																												c)) {
																																																											if (!m.equals(
																																																													m2w)) {
																																																												if (!m.equals(
																																																														z)) {
																																																													if (!m.equals(
																																																															y)) {
																																																														if (!m.equals(
																																																																w)) {
																																																															if (!m.equals(
																																																																	x)) {
																																																																if (!x.equals(
																																																																		z)) {
																																																																	if (!x.equals(
																																																																			y)) {
																																																																		if (!d2c.equals(
																																																																				l)) {
																																																																			if (!d2c.equals(
																																																																					l2z)) {
																																																																				if (!d2c.equals(
																																																																						m2w)) {
																																																																					if (!d2c.equals(
																																																																							z)) {
																																																																						if (!d2c.equals(
																																																																								y)) {
																																																																							if (!d2c.equals(
																																																																									w)) {
																																																																								if (!d2c.equals(
																																																																										m)) {
																																																																									if (!d2c.equals(
																																																																											x)) {
																																																																										if (!d.equals(
																																																																												l)) {
																																																																											if (!d.equals(
																																																																													l2z)) {
																																																																												if (!d.equals(
																																																																														m2w)) {
																																																																													if (!d.equals(
																																																																															z)) {
																																																																														if (!d.equals(
																																																																																y)) {
																																																																															if (!d.equals(
																																																																																	w)) {
																																																																																if (!d.equals(
																																																																																		m)) {
																																																																																	if (!d.equals(
																																																																																			x)) {
																																																																																		if (!d.equals(
																																																																																				d2c)) {
																																																																																			if (!a.equals(
																																																																																					l)) {
																																																																																				if (!a.equals(
																																																																																						l2z)) {
																																																																																					if (!a.equals(
																																																																																							m2w)) {
																																																																																						if (!a.equals(
																																																																																								b2y)) {
																																																																																							if (!a.equals(
																																																																																									z)) {
																																																																																								if (!a.equals(
																																																																																										a2x)) {
																																																																																									if (!a.equals(
																																																																																											y)) {
																																																																																										if (!a.equals(
																																																																																												w)) {
																																																																																											if (!a.equals(
																																																																																													b)) {
																																																																																												if (!a.equals(
																																																																																														m)) {
																																																																																													if (!a.equals(
																																																																																															x)) {
																																																																																														if (!a.equals(
																																																																																																d2c)) {
																																																																																															if (!a.equals(
																																																																																																	d)) {
																																																																																																if (!a.equals(
																																																																																																		c)) {
																																																																																																	if (!c.equals(
																																																																																																			l)) {
																																																																																																		if (!c.equals(
																																																																																																				l2z)) {
																																																																																																			if (!c.equals(
																																																																																																					m2w)) {
																																																																																																				if (!c.equals(
																																																																																																						z)) {
																																																																																																					if (!c.equals(
																																																																																																							y)) {
																																																																																																						if (!c.equals(
																																																																																																								w)) {
																																																																																																							if (!c.equals(
																																																																																																									m)) {
																																																																																																								if (!c.equals(
																																																																																																										x)) {
																																																																																																									if (!c.equals(
																																																																																																											d2c)) {
																																																																																																										if (!c.equals(
																																																																																																												d)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l,
																																																																																																													l2z,
																																																																																																													m2w,
																																																																																																													b2y,
																																																																																																													z,
																																																																																																													a2x,
																																																																																																													y,
																																																																																																													w,
																																																																																																													b,
																																																																																																													m,
																																																																																																													x,
																																																																																																													d2c,
																																																																																																													d,
																																																																																																													a,
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

	public static final Object[] pattern_decull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y, EObject z, EObject a2x,
			EObject y, EObject w, EObject b, EObject m, EObject x, EObject d, EObject a, EObject c) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decull2branchubb";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String m2w__w____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String m2w__m____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String b__m____last_name_prime = "last";
		String x__z____positive_name_prime = "positive";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d, a, c, l2z__l____source,
				l2z__z____target, z__x____next, b2y__y____target, w__y____next, m2w__w____target, b2y__b____source,
				m2w__m____source, a2x__x____target, b__m____last, x__z____positive, d__a____positive, d__b____negative,
				a2x__a____source, a__l____first, a__l____last, c__x____positive, c__y____negative };
	}

	public static final void pattern_decull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decull2branchubb _this, PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y,
			EObject z, EObject a2x, EObject y, EObject w, EObject b, EObject m, EObject x, EObject d2c, EObject d,
			EObject a, EObject c) {
		_this.registerObjects_FWD(ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d2c, d, a, c);

	}

	public static final PerformRuleResult pattern_decull2branchubb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_2_1_preparereturnvalue_bindingFB(decull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decull2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(
			decull2branchubb _this) {
		Object[] result_pattern_decull2branchubb_2_1_preparereturnvalue_binding = pattern_decull2branchubb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decull2branchubb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decull2branchubb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decull2branchubb_2_1_preparereturnvalue_black = pattern_decull2branchubb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decull2branchubb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decull2branchubb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decull2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decull2branchubb_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("m");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpL = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { l, b, m, d, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_2_2_corematch_blackBBBFBBFB(Assignment l, While b,
			Assignment m, Decision d, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { l, b, m, d2c, d, a, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_2_3_findcontext_blackBBBBBBB(Assignment l, While b,
			Assignment m, S2B d2c, Decision d, While a, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (m.equals(b.getLast())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (d.equals(d2c.getSource())) {
								if (l.equals(a.getFirst())) {
									if (l.equals(a.getLast())) {
										if (c.equals(d2c.getTarget())) {
											_result.add(new Object[] { l, b, m, d2c, d, a, c });
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

	public static final Object[] pattern_decull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(Assignment l, While b,
			Assignment m, S2B d2c, Decision d, While a, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__m____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		b__m____last.setName(b__m____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { l, b, m, d2c, d, a, c, isApplicableMatch, b__m____last, d__a____positive,
				d__b____negative, d2c__d____source, a__l____first, a__l____last, d2c__c____target };
	}

	public static final Object[] pattern_decull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Assignment l, While b, Assignment m, S2B d2c, Decision d, While a,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, b, m, d2c, d, a, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, b, m, d2c, d, a, c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Assignment l, While b, Assignment m, S2B d2c, Decision d, While a,
			Branch c) {
		Object[] result_pattern_decull2branchubb_2_4_solveCSP_binding = pattern_decull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, l, b, m, d2c, d, a, c);
		if (result_pattern_decull2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_2_4_solveCSP_black = pattern_decull2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, b, m, d2c, d, a, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_2_5_checkCSP_expressionFBB(decull2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decull2branchubb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decull2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decull2branchubb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_10_1_initialbindings_blackBBBBBBB(decull2branchubb _this,
			Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { _this, match, z, y, w, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(decull2branchubb _this,
			Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, y, w, x, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, y, w, x, c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(decull2branchubb _this,
			Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		Object[] result_pattern_decull2branchubb_10_2_SolveCSP_binding = pattern_decull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, y, w, x, c);
		if (result_pattern_decull2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_10_2_SolveCSP_black = pattern_decull2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, y, w, x, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_10_3_CheckCSP_expressionFBB(decull2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Command z, Branch y, Command w, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { match, z, y, w, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(x);
		String z__x____next_name_prime = "next";
		String w__y____next_name_prime = "next";
		String x__z____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__x____next.setName(z__x____next_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { match, z, y, w, x, c, z__x____next, w__y____next, x__z____positive, c__x____positive,
				c__y____negative };
	}

	public static final Object[] pattern_decull2branchubb_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command z, Branch y, Command w, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						return new Object[] { match, z, y, w, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(
			decull2branchubb _this, Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		_this.registerObjectsToMatch_BWD(match, z, y, w, x, c);

	}

	public static final boolean pattern_decull2branchubb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decull2branchubb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { z, y, w, x, d2c, d, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(Command z,
			Branch y, Command w, Branch x, S2B d2c, Decision d, Branch c, decull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, y, w, x, d2c, d, c, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			decull2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decull2branchubb_11_1_performtransformation_binding = pattern_decull2branchubb_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decull2branchubb_11_1_performtransformation_binding != null) {
			Command z = (Command) result_pattern_decull2branchubb_11_1_performtransformation_binding[0];
			Branch y = (Branch) result_pattern_decull2branchubb_11_1_performtransformation_binding[1];
			Command w = (Command) result_pattern_decull2branchubb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_decull2branchubb_11_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decull2branchubb_11_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decull2branchubb_11_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_decull2branchubb_11_1_performtransformation_binding[6];

			Object[] result_pattern_decull2branchubb_11_1_performtransformation_black = pattern_decull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(
					z, y, w, x, d2c, d, c, _this, isApplicableMatch);
			if (result_pattern_decull2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decull2branchubb_11_1_performtransformation_black[7];

				return new Object[] { z, y, w, x, d2c, d, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_1_performtransformation_greenFFFFBFBBFFBBF(Command z,
			Branch y, Command w, Branch x, Decision d) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		l2z.setSource(l);
		l2z.setTarget(z);
		m2w.setTarget(w);
		b2y.setTarget(y);
		a2x.setTarget(x);
		b2y.setSource(b);
		d.setNegative(b);
		m2w.setSource(m);
		b.setLast(m);
		d.setPositive(a);
		a2x.setSource(a);
		a.setFirst(l);
		a.setLast(l);
		return new Object[] { l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d, a };
	}

	public static final Object[] pattern_decull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Assignment l,
			S2N l2z, S2N m2w, S2B b2y, Command z, S2B a2x, Branch y, Command w, While b, Assignment m, Branch x,
			While a) {
		if (!l.equals(m)) {
			if (!l2z.equals(m2w)) {
				if (!a2x.equals(b2y)) {
					if (!w.equals(z)) {
						if (!x.equals(y)) {
							if (!a.equals(b)) {
								return new Object[] { l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment l, S2N l2z, S2N m2w, S2B b2y, Command z, S2B a2x, Branch y, Command w, While b, Assignment m,
			Branch x, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, a };
	}

	public static final Object[] pattern_decull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y, EObject z, EObject a2x,
			EObject y, EObject w, EObject b, EObject m, EObject x, EObject d2c, EObject d, EObject a, EObject c) {
		if (!l.equals(l2z)) {
			if (!l.equals(m2w)) {
				if (!l.equals(z)) {
					if (!l.equals(y)) {
						if (!l.equals(w)) {
							if (!l.equals(m)) {
								if (!l.equals(x)) {
									if (!l2z.equals(m2w)) {
										if (!l2z.equals(z)) {
											if (!l2z.equals(y)) {
												if (!l2z.equals(w)) {
													if (!l2z.equals(m)) {
														if (!l2z.equals(x)) {
															if (!m2w.equals(z)) {
																if (!m2w.equals(y)) {
																	if (!m2w.equals(w)) {
																		if (!m2w.equals(x)) {
																			if (!b2y.equals(l)) {
																				if (!b2y.equals(l2z)) {
																					if (!b2y.equals(m2w)) {
																						if (!b2y.equals(z)) {
																							if (!b2y.equals(y)) {
																								if (!b2y.equals(w)) {
																									if (!b2y.equals(
																											m)) {
																										if (!b2y.equals(
																												x)) {
																											if (!b2y.equals(
																													d2c)) {
																												if (!b2y.equals(
																														d)) {
																													if (!b2y.equals(
																															c)) {
																														if (!a2x.equals(
																																l)) {
																															if (!a2x.equals(
																																	l2z)) {
																																if (!a2x.equals(
																																		m2w)) {
																																	if (!a2x.equals(
																																			b2y)) {
																																		if (!a2x.equals(
																																				z)) {
																																			if (!a2x.equals(
																																					y)) {
																																				if (!a2x.equals(
																																						w)) {
																																					if (!a2x.equals(
																																							b)) {
																																						if (!a2x.equals(
																																								m)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!a2x.equals(
																																										d2c)) {
																																									if (!a2x.equals(
																																											d)) {
																																										if (!a2x.equals(
																																												c)) {
																																											if (!y.equals(
																																													z)) {
																																												if (!w.equals(
																																														z)) {
																																													if (!w.equals(
																																															y)) {
																																														if (!w.equals(
																																																x)) {
																																															if (!b.equals(
																																																	l)) {
																																																if (!b.equals(
																																																		l2z)) {
																																																	if (!b.equals(
																																																			m2w)) {
																																																		if (!b.equals(
																																																				b2y)) {
																																																			if (!b.equals(
																																																					z)) {
																																																				if (!b.equals(
																																																						y)) {
																																																					if (!b.equals(
																																																							w)) {
																																																						if (!b.equals(
																																																								m)) {
																																																							if (!b.equals(
																																																									x)) {
																																																								if (!b.equals(
																																																										d2c)) {
																																																									if (!b.equals(
																																																											d)) {
																																																										if (!b.equals(
																																																												c)) {
																																																											if (!m.equals(
																																																													m2w)) {
																																																												if (!m.equals(
																																																														z)) {
																																																													if (!m.equals(
																																																															y)) {
																																																														if (!m.equals(
																																																																w)) {
																																																															if (!m.equals(
																																																																	x)) {
																																																																if (!x.equals(
																																																																		z)) {
																																																																	if (!x.equals(
																																																																			y)) {
																																																																		if (!d2c.equals(
																																																																				l)) {
																																																																			if (!d2c.equals(
																																																																					l2z)) {
																																																																				if (!d2c.equals(
																																																																						m2w)) {
																																																																					if (!d2c.equals(
																																																																							z)) {
																																																																						if (!d2c.equals(
																																																																								y)) {
																																																																							if (!d2c.equals(
																																																																									w)) {
																																																																								if (!d2c.equals(
																																																																										m)) {
																																																																									if (!d2c.equals(
																																																																											x)) {
																																																																										if (!d.equals(
																																																																												l)) {
																																																																											if (!d.equals(
																																																																													l2z)) {
																																																																												if (!d.equals(
																																																																														m2w)) {
																																																																													if (!d.equals(
																																																																															z)) {
																																																																														if (!d.equals(
																																																																																y)) {
																																																																															if (!d.equals(
																																																																																	w)) {
																																																																																if (!d.equals(
																																																																																		m)) {
																																																																																	if (!d.equals(
																																																																																			x)) {
																																																																																		if (!d.equals(
																																																																																				d2c)) {
																																																																																			if (!a.equals(
																																																																																					l)) {
																																																																																				if (!a.equals(
																																																																																						l2z)) {
																																																																																					if (!a.equals(
																																																																																							m2w)) {
																																																																																						if (!a.equals(
																																																																																								b2y)) {
																																																																																							if (!a.equals(
																																																																																									z)) {
																																																																																								if (!a.equals(
																																																																																										a2x)) {
																																																																																									if (!a.equals(
																																																																																											y)) {
																																																																																										if (!a.equals(
																																																																																												w)) {
																																																																																											if (!a.equals(
																																																																																													b)) {
																																																																																												if (!a.equals(
																																																																																														m)) {
																																																																																													if (!a.equals(
																																																																																															x)) {
																																																																																														if (!a.equals(
																																																																																																d2c)) {
																																																																																															if (!a.equals(
																																																																																																	d)) {
																																																																																																if (!a.equals(
																																																																																																		c)) {
																																																																																																	if (!c.equals(
																																																																																																			l)) {
																																																																																																		if (!c.equals(
																																																																																																				l2z)) {
																																																																																																			if (!c.equals(
																																																																																																					m2w)) {
																																																																																																				if (!c.equals(
																																																																																																						z)) {
																																																																																																					if (!c.equals(
																																																																																																							y)) {
																																																																																																						if (!c.equals(
																																																																																																								w)) {
																																																																																																							if (!c.equals(
																																																																																																									m)) {
																																																																																																								if (!c.equals(
																																																																																																										x)) {
																																																																																																									if (!c.equals(
																																																																																																											d2c)) {
																																																																																																										if (!c.equals(
																																																																																																												d)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l,
																																																																																																													l2z,
																																																																																																													m2w,
																																																																																																													b2y,
																																																																																																													z,
																																																																																																													a2x,
																																																																																																													y,
																																																																																																													w,
																																																																																																													b,
																																																																																																													m,
																																																																																																													x,
																																																																																																													d2c,
																																																																																																													d,
																																																																																																													a,
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

	public static final Object[] pattern_decull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y, EObject z, EObject a2x,
			EObject y, EObject w, EObject b, EObject m, EObject x, EObject d, EObject a, EObject c) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decull2branchubb";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String m2w__w____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String m2w__m____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String b__m____last_name_prime = "last";
		String x__z____positive_name_prime = "positive";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d, a, c, l2z__l____source,
				l2z__z____target, z__x____next, b2y__y____target, w__y____next, m2w__w____target, b2y__b____source,
				m2w__m____source, a2x__x____target, b__m____last, x__z____positive, d__a____positive, d__b____negative,
				a2x__a____source, a__l____first, a__l____last, c__x____positive, c__y____negative };
	}

	public static final void pattern_decull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decull2branchubb _this, PerformRuleResult ruleresult, EObject l, EObject l2z, EObject m2w, EObject b2y,
			EObject z, EObject a2x, EObject y, EObject w, EObject b, EObject m, EObject x, EObject d2c, EObject d,
			EObject a, EObject c) {
		_this.registerObjects_BWD(ruleresult, l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d2c, d, a, c);

	}

	public static final PerformRuleResult pattern_decull2branchubb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_12_1_preparereturnvalue_bindingFB(decull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decull2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(
			decull2branchubb _this) {
		Object[] result_pattern_decull2branchubb_12_1_preparereturnvalue_binding = pattern_decull2branchubb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decull2branchubb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decull2branchubb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decull2branchubb_12_1_preparereturnvalue_black = pattern_decull2branchubb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decull2branchubb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decull2branchubb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decull2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decull2branchubb_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							return new Object[] { z, y, w, x, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_12_2_corematch_blackBBBBFFBB(Command z, Branch y,
			Command w, Branch x, Branch c, Match match) {
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
								_result.add(new Object[] { z, y, w, x, d2c, d, c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_12_3_findcontext_blackBBBBBBB(Command z, Branch y,
			Command w, Branch x, S2B d2c, Decision d, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						if (x.equals(z.getNext())) {
							if (y.equals(w.getNext())) {
								if (z.equals(x.getPositive())) {
									if (d.equals(d2c.getSource())) {
										if (x.equals(c.getPositive())) {
											if (y.equals(c.getNegative())) {
												if (c.equals(d2c.getTarget())) {
													_result.add(new Object[] { z, y, w, x, d2c, d, c });
												}
											}
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

	public static final Object[] pattern_decull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(Command z, Branch y,
			Command w, Branch x, S2B d2c, Decision d, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String w__y____next_name_prime = "next";
		String x__z____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		z__x____next.setName(z__x____next_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { z, y, w, x, d2c, d, c, isApplicableMatch, z__x____next, w__y____next, x__z____positive,
				d2c__d____source, c__x____positive, c__y____negative, d2c__c____target };
	}

	public static final Object[] pattern_decull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch y, Command w, Branch x, S2B d2c, Decision d,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, y, w, x, d2c, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, y, w, x, d2c, d, c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			decull2branchubb _this, IsApplicableMatch isApplicableMatch, Command z, Branch y, Command w, Branch x,
			S2B d2c, Decision d, Branch c) {
		Object[] result_pattern_decull2branchubb_12_4_solveCSP_binding = pattern_decull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, y, w, x, d2c, d, c);
		if (result_pattern_decull2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_12_4_solveCSP_black = pattern_decull2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, y, w, x, d2c, d, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_12_5_checkCSP_expressionFBB(decull2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decull2branchubb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decull2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decull2branchubb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_20_1_preparereturnvalue_bindingFB(decull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decull2branchubb _this) {
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

	public static final Object[] pattern_decull2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decull2branchubb _this) {
		Object[] result_pattern_decull2branchubb_20_1_preparereturnvalue_binding = pattern_decull2branchubb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decull2branchubb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decull2branchubb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decull2branchubb_20_1_preparereturnvalue_black = pattern_decull2branchubb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decull2branchubb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decull2branchubb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decull2branchubb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_803755 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_177645 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_177645)) {
							if (!x.equals(__DEC_z_positive_177645)) {
								if (!c.equals(__DEC_z_positive_177645)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_179344 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_179344)) {
							if (!x.equals(__DEC_z_negative_179344)) {
								if (!c.equals(__DEC_z_negative_179344)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_917485 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_440285 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_440285)) {
							if (!x.equals(__DEC_y_positive_440285)) {
								if (!c.equals(__DEC_y_positive_440285)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_923013 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_923013)) {
							if (!x.equals(__DEC_y_negative_923013)) {
								if (!c.equals(__DEC_y_negative_923013)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_6B(Command w) {
		for (Graph __DEC_w_root_846698 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_7BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_positive_91715 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_91715)) {
							if (!x.equals(__DEC_w_positive_91715)) {
								if (!c.equals(__DEC_w_positive_91715)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_8BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_negative_43472 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_43472)) {
							if (!x.equals(__DEC_w_negative_43472)) {
								if (!c.equals(__DEC_w_negative_43472)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_7339 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_10BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_143730 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_143730)) {
							if (!y.equals(__DEC_x_positive_143730)) {
								if (!c.equals(__DEC_x_positive_143730)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_11BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_307751 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_307751)) {
							if (!y.equals(__DEC_x_negative_307751)) {
								if (!c.equals(__DEC_x_negative_307751)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(Branch y,
			Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(Branch c,
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(Branch y,
			Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_next.getSrc();
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(z.getNext())) {
					if (z.equals(x.getPositive())) {
						if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
							if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_9B(x) == null) {
								if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Branch) {
												Branch y = (Branch) tmpY;
												if (!x.equals(y)) {
													if (!c.equals(y)) {
														if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																c, z) == null) {
															if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																	c, z) == null) {
																if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(
																		z, y, x, c) == null) {
																	if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(
																			z, y, x, c) == null) {
																		if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_3B(
																				y) == null) {
																			if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(
																					y, x, c) == null) {
																				if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(
																						y, x, c) == null) {
																					if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_10BBB(
																							x, y, c) == null) {
																						if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_11BBB(
																								x, y, c) == null) {
																							if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(
																									y, z) == null) {
																								if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(
																										y, z) == null) {
																									if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(
																											y,
																											x) == null) {
																										if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(
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
																														if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_6B(
																																w) == null) {
																															if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_7BBBB(
																																	w,
																																	y,
																																	x,
																																	c) == null) {
																																if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_8BBBB(
																																		w,
																																		y,
																																		x,
																																		c) == null) {
																																	if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(
																																			y,
																																			w) == null) {
																																		if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(
																																				x,
																																				w) == null) {
																																			if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(
																																					c,
																																					w) == null) {
																																				if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(
																																						y,
																																						w) == null) {
																																					if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(
																																							x,
																																							w) == null) {
																																						if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(
																																								c,
																																								w) == null) {
																																							_result.add(
																																									new Object[] {
																																											z,
																																											y,
																																											w,
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			decull2branchubb _this, Match match, Command z, Branch y, Command w, Branch x, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, y, w, x, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decull2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decull2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decull2branchubb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_21_1_preparereturnvalue_bindingFB(decull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decull2branchubb _this) {
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

	public static final Object[] pattern_decull2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decull2branchubb _this) {
		Object[] result_pattern_decull2branchubb_21_1_preparereturnvalue_binding = pattern_decull2branchubb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decull2branchubb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decull2branchubb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decull2branchubb_21_1_preparereturnvalue_black = pattern_decull2branchubb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decull2branchubb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decull2branchubb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decull2branchubb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_899801 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_899801)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_269544 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_269544)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_900112 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_900112)) {
					if (!a.equals(__DEC_l_last_900112)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_553825 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_4BB(While b, Decision d) {
		for (Decision __DEC_b_positive_982624 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_982624)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_5BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_741268 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_741268)) {
					if (!a.equals(__DEC_b_first_741268)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_6BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_283115 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_283115)) {
					if (!a.equals(__DEC_b_last_283115)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_7B(While b) {
		for (Program __DEC_b_first_178978 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_8BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_785902 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_785902)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_9BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_1844 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_1844)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_10BBB(Assignment m,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_555202 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_555202)) {
					if (!a.equals(__DEC_m_first_555202)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_11BBB(Assignment m,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_594034 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_594034)) {
					if (!a.equals(__DEC_m_last_594034)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_12B(Assignment m) {
		for (Program __DEC_m_first_629757 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_13BB(While a,
			Decision d) {
		for (Decision __DEC_a_negative_810581 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_810581)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_14BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_559578 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_559578)) {
					if (!b.equals(__DEC_a_first_559578)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_217929 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_217929)) {
					if (!b.equals(__DEC_a_last_217929)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_16B(While a) {
		for (Program __DEC_a_first_923529 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(While b,
			Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(While a,
			Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_last.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpM = _edge_last.getTrg();
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (m.equals(b.getLast())) {
					if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_7B(b) == null) {
						if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_12B(m) == null) {
							if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(b, m) == null) {
								for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
										Decision.class, "negative")) {
									Statement tmpA = d.getPositive();
									if (tmpA instanceof While) {
										While a = (While) tmpA;
										if (!a.equals(b)) {
											Statement tmpL = a.getFirst();
											if (tmpL instanceof Assignment) {
												Assignment l = (Assignment) tmpL;
												if (!l.equals(m)) {
													if (l.equals(a.getLast())) {
														if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_4BB(
																b, d) == null) {
															if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_8BB(
																	m, d) == null) {
																if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_9BB(
																		m, d) == null) {
																	if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																			d, b) == null) {
																		if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(
																				d, m) == null) {
																			if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																					d, m) == null) {
																				if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_5BB(
																						b, a) == null) {
																					if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_6BB(
																							b, a) == null) {
																						if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_10BBB(
																								m, b, a) == null) {
																							if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_11BBB(
																									m, b, a) == null) {
																								if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_13BB(
																										a, d) == null) {
																									if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_14BB(
																											a,
																											b) == null) {
																										if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_15BB(
																												a,
																												b) == null) {
																											if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_16B(
																													a) == null) {
																												if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(
																														a,
																														m) == null) {
																													if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(
																															a,
																															m) == null) {
																														if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(
																																d,
																																a) == null) {
																															if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(
																																	b,
																																	a) == null) {
																																if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(
																																		b,
																																		a) == null) {
																																	if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_0BB(
																																			l,
																																			d) == null) {
																																		if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_1BB(
																																				l,
																																				d) == null) {
																																			if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(
																																					l,
																																					b,
																																					a) == null) {
																																				if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_3B(
																																						l) == null) {
																																					if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_17BB(
																																							d,
																																							l) == null) {
																																						if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																																								d,
																																								l) == null) {
																																							if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																																									b,
																																									l) == null) {
																																								_result.add(
																																										new Object[] {
																																												l,
																																												b,
																																												m,
																																												d,
																																												a,
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

		return _result;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			decull2branchubb _this, Match match, Assignment l, While b, Assignment m, Decision d, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, b, m, d, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decull2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decull2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decull2branchubb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_24_1_prepare_blackB(decull2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decull2branchubb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decull2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = targetMatch.getObject("z");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = targetMatch.getObject("w");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = sourceMatch.getObject("m");
		EObject _localVariable_6 = targetMatch.getObject("x");
		EObject _localVariable_7 = sourceMatch.getObject("d");
		EObject _localVariable_8 = sourceMatch.getObject("a");
		EObject _localVariable_9 = targetMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpM = _localVariable_5;
		EObject tmpX = _localVariable_6;
		EObject tmpD = _localVariable_7;
		EObject tmpA = _localVariable_8;
		EObject tmpC = _localVariable_9;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							if (tmpM instanceof Assignment) {
								Assignment m = (Assignment) tmpM;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									if (tmpD instanceof Decision) {
										Decision d = (Decision) tmpD;
										if (tmpA instanceof While) {
											While a = (While) tmpA;
											if (tmpC instanceof Branch) {
												Branch c = (Branch) tmpC;
												return new Object[] { l, z, y, w, b, m, x, d, a, c, sourceMatch,
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

	public static final Object[] pattern_decull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Assignment l,
			Command z, Branch y, Command w, While b, Assignment m, Branch x, Decision d, While a, Branch c,
			Match sourceMatch, Match targetMatch) {
		if (!l.equals(m)) {
			if (!w.equals(z)) {
				if (!x.equals(y)) {
					if (!a.equals(b)) {
						if (!c.equals(y)) {
							if (!c.equals(x)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding = pattern_decull2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding != null) {
			Assignment l = (Assignment) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[0];
			Command z = (Command) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[1];
			Branch y = (Branch) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[2];
			Command w = (Command) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[3];
			While b = (While) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[4];
			Assignment m = (Assignment) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[5];
			Branch x = (Branch) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[6];
			Decision d = (Decision) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[7];
			While a = (While) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[8];
			Branch c = (Branch) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_decull2branchubb_24_2_matchsrctrgcontext_black = pattern_decull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch);
			if (result_pattern_decull2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(decull2branchubb _this,
			Assignment l, Command z, Branch y, Command w, While b, Assignment m, Branch x, Decision d, While a,
			Branch c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			decull2branchubb _this, Assignment l, Command z, Branch y, Command w, While b, Assignment m, Branch x,
			Decision d, While a, Branch c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decull2branchubb_24_3_solvecsp_binding = pattern_decull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch);
		if (result_pattern_decull2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decull2branchubb_24_3_solvecsp_black = pattern_decull2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decull2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, z, y, w, b, m, x, d, a, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_24_5_matchcorrcontext_blackFBBBB(Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_decull2branchubb_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decull2branchubb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(Assignment l,
			Command z, Branch y, Command w, While b, Assignment m, Branch x, Decision d, While a, Branch c,
			CCMatch ccMatch) {
		if (!l.equals(m)) {
			if (!w.equals(z)) {
				if (!x.equals(y)) {
					if (!a.equals(b)) {
						if (!c.equals(y)) {
							if (!c.equals(x)) {
								return new Object[] { l, z, y, w, b, m, x, d, a, c, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_6_createcorrespondence_greenBFFFBFBBBBBBB(Assignment l,
			Command z, Branch y, Command w, While b, Assignment m, Branch x, While a, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		m2w.setTarget(w);
		m2w.setSource(m);
		ccMatch.getCreateCorr().add(m2w);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, a, ccMatch };
	}

	public static final Object[] pattern_decull2branchubb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decull2branchubb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decull2branchubb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decull2branchubb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_0BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_739171 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_739171)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_214292 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_214292)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_2BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_665387 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_665387)) {
					if (!a.equals(__DEC_l_last_665387)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_989056 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_4BB(While b, Decision d) {
		for (Decision __DEC_b_positive_196781 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_196781)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_5BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_285781 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_285781)) {
					if (!a.equals(__DEC_b_first_285781)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_6BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_501848 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_501848)) {
					if (!a.equals(__DEC_b_last_501848)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_7B(While b) {
		for (Program __DEC_b_first_402319 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_8BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_432354 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_432354)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_9BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_577742 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_577742)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_10BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_733849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!b.equals(__DEC_m_first_733849)) {
					if (!a.equals(__DEC_m_first_733849)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_11BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_484385 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_484385)) {
					if (!a.equals(__DEC_m_last_484385)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_12B(Assignment m) {
		for (Program __DEC_m_first_356718 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_13BB(While a, Decision d) {
		for (Decision __DEC_a_negative_607399 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_607399)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_14BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_700811 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_700811)) {
					if (!b.equals(__DEC_a_first_700811)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_82476 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_82476)) {
					if (!b.equals(__DEC_a_last_82476)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_16B(While a) {
		for (Program __DEC_a_first_99670 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_19BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_20BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_21BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_22BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_23BB(While b, Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_24BB(While a, Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_25BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_26BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_27BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_28BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_blackBBBBB(Assignment l, While b,
			Assignment m, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (m.equals(b.getLast())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (l.equals(a.getFirst())) {
								if (l.equals(a.getLast())) {
									if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
										if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
											if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_2BBB(l, b,
													a) == null) {
												if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_3B(
														l) == null) {
													if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_4BB(b,
															d) == null) {
														if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_5BB(
																b, a) == null) {
															if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_6BB(
																	b, a) == null) {
																if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_7B(
																		b) == null) {
																	if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_8BB(
																			m, d) == null) {
																		if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_9BB(
																				m, d) == null) {
																			if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_10BBB(
																					m, b, a) == null) {
																				if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_11BBB(
																						m, b, a) == null) {
																					if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_12B(
																							m) == null) {
																						if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_13BB(
																								a, d) == null) {
																							if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_14BB(
																									a, b) == null) {
																								if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_15BB(
																										a, b) == null) {
																									if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_16B(
																											a) == null) {
																										if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_17BB(
																												d,
																												l) == null) {
																											if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_18BB(
																													d,
																													l) == null) {
																												if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_19BB(
																														b,
																														l) == null) {
																													if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_20BB(
																															d,
																															b) == null) {
																														if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_21BB(
																																d,
																																m) == null) {
																															if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_22BB(
																																	d,
																																	m) == null) {
																																if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_23BB(
																																		b,
																																		m) == null) {
																																	if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_24BB(
																																			a,
																																			m) == null) {
																																		if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_25BB(
																																				a,
																																				m) == null) {
																																			if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_26BB(
																																					d,
																																					a) == null) {
																																				if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_27BB(
																																						b,
																																						a) == null) {
																																					if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_28BB(
																																							b,
																																							a) == null) {
																																						return new Object[] {
																																								l,
																																								b,
																																								m,
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
		return null;
	}

	public static final boolean pattern_decull2branchubb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decull2branchubb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_55431 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_776819 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_776819)) {
							if (!x.equals(__DEC_z_positive_776819)) {
								if (!c.equals(__DEC_z_positive_776819)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_2BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_511781 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_511781)) {
							if (!x.equals(__DEC_z_negative_511781)) {
								if (!c.equals(__DEC_z_negative_511781)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_563122 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_4BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_359896 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_359896)) {
							if (!x.equals(__DEC_y_positive_359896)) {
								if (!c.equals(__DEC_y_positive_359896)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_5BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_105934 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_105934)) {
							if (!x.equals(__DEC_y_negative_105934)) {
								if (!c.equals(__DEC_y_negative_105934)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_6B(Command w) {
		for (Graph __DEC_w_root_600428 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_7BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_positive_210501 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_210501)) {
							if (!x.equals(__DEC_w_positive_210501)) {
								if (!c.equals(__DEC_w_positive_210501)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_8BBBB(Command w, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_w_negative_893324 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_893324)) {
							if (!x.equals(__DEC_w_negative_893324)) {
								if (!c.equals(__DEC_w_negative_893324)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_493009 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_10BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_160847 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_160847)) {
							if (!y.equals(__DEC_x_positive_160847)) {
								if (!c.equals(__DEC_x_positive_160847)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_11BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_182140 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_182140)) {
							if (!y.equals(__DEC_x_negative_182140)) {
								if (!c.equals(__DEC_x_negative_182140)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_17BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_18BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_19BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_20BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_21BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_22BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_23BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_24BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_blackBBBBB(Command z, Branch y,
			Command w, Branch x, Branch c) {
		if (!w.equals(z)) {
			if (!x.equals(y)) {
				if (!c.equals(y)) {
					if (!c.equals(x)) {
						if (x.equals(z.getNext())) {
							if (y.equals(w.getNext())) {
								if (z.equals(x.getPositive())) {
									if (x.equals(c.getPositive())) {
										if (y.equals(c.getNegative())) {
											if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_0B(z) == null) {
												if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_1BBBB(z, y,
														x, c) == null) {
													if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_2BBBB(z,
															y, x, c) == null) {
														if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_3B(
																y) == null) {
															if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_4BBB(
																	y, x, c) == null) {
																if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_5BBB(
																		y, x, c) == null) {
																	if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_6B(
																			w) == null) {
																		if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_7BBBB(
																				w, y, x, c) == null) {
																			if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_8BBBB(
																					w, y, x, c) == null) {
																				if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_9B(
																						x) == null) {
																					if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_10BBB(
																							x, y, c) == null) {
																						if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_11BBB(
																								x, y, c) == null) {
																							if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_12BB(
																									y, z) == null) {
																								if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_13BB(
																										c, z) == null) {
																									if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_14BB(
																											y,
																											z) == null) {
																										if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_15BB(
																												x,
																												z) == null) {
																											if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_16BB(
																													c,
																													z) == null) {
																												if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_17BB(
																														y,
																														w) == null) {
																													if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_18BB(
																															x,
																															w) == null) {
																														if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_19BB(
																																c,
																																w) == null) {
																															if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_20BB(
																																	y,
																																	w) == null) {
																																if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_21BB(
																																		x,
																																		w) == null) {
																																	if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_22BB(
																																			c,
																																			w) == null) {
																																		if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_23BB(
																																				y,
																																				x) == null) {
																																			if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_24BB(
																																					y,
																																					x) == null) {
																																				return new Object[] {
																																						z,
																																						y,
																																						w,
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

	public static final boolean pattern_decull2branchubb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decull2branchubb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_29_1_createresult_blackB(decull2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decull2branchubb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decull2branchubb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decull2branchubb_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decull2branchubb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										d) == null) {
									if (pattern_decull2branchubb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decull2branchubb_29_3_solveCSP_bindingFBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, d, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decull2branchubb_29_3_solveCSP_binding = pattern_decull2branchubb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, d, c, ruleResult);
		if (result_pattern_decull2branchubb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_29_3_solveCSP_black = pattern_decull2branchubb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_29_4_checkCSP_expressionFBB(decull2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_29_5_checknacs_blackBBB(S2B d2c, Decision d, Branch c) {
		return new Object[] { d2c, d, c };
	}

	public static final Object[] pattern_decull2branchubb_29_6_perform_blackBBBB(S2B d2c, Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, d, c, ruleResult };
	}

	public static final Object[] pattern_decull2branchubb_29_6_perform_greenFFFFFFFFFFFBFBB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(l);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		ruleResult.getCorrObjects().add(m2w);
		ruleResult.getCorrObjects().add(b2y);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		w.setNext(y);
		m2w.setTarget(w);
		ruleResult.getTargetObjects().add(w);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		m2w.setSource(m);
		b.setLast(m);
		ruleResult.getSourceObjects().add(m);
		z.setNext(x);
		a2x.setTarget(x);
		x.setPositive(z);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setPositive(a);
		a2x.setSource(a);
		a.setFirst(l);
		a.setLast(l);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l, l2z, m2w, b2y, z, a2x, y, w, b, m, x, d, a, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decull2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decull2branchubbImpl
