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
	public boolean isAppropriate_FWD(Match match, Assignment l, While a, Decision d, While b, Assignment m) {

		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_0_1_initialbindings_blackBBBBBBB(this,
				match, l, a, d, b, m);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[m] = " + m + ".");
		}

		Object[] result2_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, l, a, d, b, m);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[m] = " + m + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decull2branchubbImpl.pattern_decull2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decull2branchubbImpl
					.pattern_decull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(match, l, a, d, b, m);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[m] = " + m + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, l,
					a, d, b, m);
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[10];

			Object[] result5_black = decull2branchubbImpl
					.pattern_decull2branchubb_0_5_collectcontextelements_blackBBBBBB(match, l, a, d, b, m);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[m] = " + m + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decull2branchubbImpl.pattern_decull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, l,
					a, d, b, m);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		Assignment l = (Assignment) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		While b = (While) result1_bindingAndBlack[4];
		Assignment m = (Assignment) result1_bindingAndBlack[5];
		S2B d2c = (S2B) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decull2branchubbImpl
				.pattern_decull2branchubb_1_1_performtransformation_greenFBBBBFFFFBFFF(c, l, a, b, m);
		Branch y = (Branch) result1_green[0];
		Command w = (Command) result1_green[5];
		S2B a2x = (S2B) result1_green[6];
		S2N l2z = (S2N) result1_green[7];
		S2B b2y = (S2B) result1_green[8];
		Command z = (Command) result1_green[10];
		S2N m2w = (S2N) result1_green[11];
		Branch x = (Branch) result1_green[12];

		Object[] result2_black = decull2branchubbImpl
				.pattern_decull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(y, l, a, b, w, a2x, l2z, b2y,
						m, z, m2w, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[l] = " + l
					+ ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[m] = " + m + ", " + "[z] = " + z + ", "
					+ "[m2w] = " + m2w + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decull2branchubbImpl
				.pattern_decull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(y, l, a, b, w, a2x, l2z, b2y,
						m, z, m2w, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decull2branchubbImpl
				.pattern_decull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, y, c, l, a, d, b, w,
						a2x, l2z, b2y, m, z, m2w, d2c, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[m] = " + m + ", " + "[z] = " + z + ", "
					+ "[m2w] = " + m2w + ", " + "[d2c] = " + d2c + ", " + "[x] = " + x + ".");
		}
		decull2branchubbImpl.pattern_decull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, x);
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[32];

		// 
		// 
		decull2branchubbImpl.pattern_decull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, d2c, x);
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
		While a = (While) result2_binding[1];
		Decision d = (Decision) result2_binding[2];
		While b = (While) result2_binding[3];
		Assignment m = (Assignment) result2_binding[4];
		for (Object[] result2_black : decull2branchubbImpl.pattern_decull2branchubb_2_2_corematch_blackFBBBBBFB(l, a, d,
				b, m, match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[6];
			// ForEach 
			for (Object[] result3_black : decull2branchubbImpl.pattern_decull2branchubb_2_3_findcontext_blackBBBBBBB(c,
					l, a, d, b, m, d2c)) {
				Object[] result3_green = decull2branchubbImpl
						.pattern_decull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(c, l, a, d, b, m, d2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = decull2branchubbImpl
						.pattern_decull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, l,
								a, d, b, m, d2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[l] = " + l
							+ ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[m] = " + m
							+ ", " + "[d2c] = " + d2c + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		match.registerObject("l", l);
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("m", m);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, While a, Decision d, While b, Assignment m) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, Assignment l, While a,
			Decision d, While b, Assignment m, S2B d2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("m", m);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d,
			EObject b, EObject w, EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject d2c,
			EObject x) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch y, Branch c, Command w, Command z, Branch x) {

		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_10_1_initialbindings_blackBBBBBBB(this,
				match, y, c, w, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[z] = " + z + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, y, c, w, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[z] = " + z + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decull2branchubbImpl.pattern_decull2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decull2branchubbImpl
					.pattern_decull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(match, y, c, w, z, x);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, y,
					c, w, z, x);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[10];

			Object[] result5_black = decull2branchubbImpl
					.pattern_decull2branchubb_10_5_collectcontextelements_blackBBBBBB(match, y, c, w, z, x);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			decull2branchubbImpl.pattern_decull2branchubb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decull2branchubbImpl.pattern_decull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, y,
					c, w, z, x);
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
		Branch y = (Branch) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Command w = (Command) result1_bindingAndBlack[3];
		Command z = (Command) result1_bindingAndBlack[4];
		S2B d2c = (S2B) result1_bindingAndBlack[5];
		Branch x = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = decull2branchubbImpl
				.pattern_decull2branchubb_11_1_performtransformation_greenBFFBFBFFFFBFB(y, d, w, z, x);
		Assignment l = (Assignment) result1_green[1];
		While a = (While) result1_green[2];
		While b = (While) result1_green[4];
		S2B a2x = (S2B) result1_green[6];
		S2N l2z = (S2N) result1_green[7];
		S2B b2y = (S2B) result1_green[8];
		Assignment m = (Assignment) result1_green[9];
		S2N m2w = (S2N) result1_green[11];

		Object[] result2_black = decull2branchubbImpl
				.pattern_decull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(y, l, a, b, w, a2x, l2z, b2y,
						m, z, m2w, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[l] = " + l
					+ ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[m] = " + m + ", " + "[z] = " + z + ", "
					+ "[m2w] = " + m2w + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decull2branchubbImpl
				.pattern_decull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(y, l, a, b, w, a2x, l2z,
						b2y, m, z, m2w, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decull2branchubbImpl
				.pattern_decull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, y, c, l, a, d, b,
						w, a2x, l2z, b2y, m, z, m2w, d2c, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[m] = " + m + ", " + "[z] = " + z + ", "
					+ "[m2w] = " + m2w + ", " + "[d2c] = " + d2c + ", " + "[x] = " + x + ".");
		}
		decull2branchubbImpl.pattern_decull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, x);
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[32];

		// 
		// 
		decull2branchubbImpl.pattern_decull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, d2c, x);
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
		Branch y = (Branch) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Command w = (Command) result2_binding[2];
		Command z = (Command) result2_binding[3];
		Branch x = (Branch) result2_binding[4];
		for (Object[] result2_black : decull2branchubbImpl.pattern_decull2branchubb_12_2_corematch_blackBBFBBFBB(y, c,
				w, z, x, match)) {
			Decision d = (Decision) result2_black[2];
			S2B d2c = (S2B) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decull2branchubbImpl.pattern_decull2branchubb_12_3_findcontext_blackBBBBBBB(y,
					c, d, w, z, d2c, x)) {
				Object[] result3_green = decull2branchubbImpl
						.pattern_decull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(y, c, d, w, z, d2c, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = decull2branchubbImpl
						.pattern_decull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, y, c,
								d, w, z, d2c, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[c] = " + c
							+ ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[d2c] = " + d2c
							+ ", " + "[x] = " + x + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		match.registerObject("y", y);
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("z", z);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch y, Branch c, Command w, Command z, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch y, Branch c, Decision d, Command w,
			Command z, S2B d2c, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d,
			EObject b, EObject w, EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject d2c,
			EObject x) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_27(EMoflonEdge _edge_positive) {

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
				.pattern_decull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Branch y = (Branch) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Command w = (Command) result2_black[2];
			Command z = (Command) result2_black[3];
			Branch x = (Branch) result2_black[4];
			Object[] result2_green = decull2branchubbImpl
					.pattern_decull2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decull2branchubbImpl
					.pattern_decull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, y, c, w, z, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(EMoflonEdge _edge_last) {

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
			While a = (While) result2_black[1];
			Decision d = (Decision) result2_black[2];
			While b = (While) result2_black[3];
			Assignment m = (Assignment) result2_black[4];
			Object[] result2_green = decull2branchubbImpl
					.pattern_decull2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decull2branchubbImpl
					.pattern_decull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, l, a, d, b, m)) {
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
		Branch y = (Branch) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Assignment l = (Assignment) result2_bindingAndBlack[2];
		While a = (While) result2_bindingAndBlack[3];
		Decision d = (Decision) result2_bindingAndBlack[4];
		While b = (While) result2_bindingAndBlack[5];
		Command w = (Command) result2_bindingAndBlack[6];
		Assignment m = (Assignment) result2_bindingAndBlack[7];
		Command z = (Command) result2_bindingAndBlack[8];
		Branch x = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = decull2branchubbImpl
				.pattern_decull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, y, c, l, a, d, b, w, m, z,
						x, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = "
					+ d + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[m] = " + m + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decull2branchubbImpl.pattern_decull2branchubb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decull2branchubbImpl
					.pattern_decull2branchubb_24_5_matchcorrcontext_blackBBFBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decull2branchubbImpl
						.pattern_decull2branchubb_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decull2branchubbImpl
						.pattern_decull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(y, c, l, a, d, b, w, m, z,
								x, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[c] = " + c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
							+ "[b] = " + b + ", " + "[w] = " + w + ", " + "[m] = " + m + ", " + "[z] = " + z + ", "
							+ "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decull2branchubbImpl.pattern_decull2branchubb_24_6_createcorrespondence_greenBBBBBFFFBBFBB(y, l, a, b,
						w, m, z, x, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[5];
				//nothing S2N l2z = (S2N) result6_green[6];
				//nothing S2B b2y = (S2B) result6_green[7];
				//nothing S2N m2w = (S2N) result6_green[10];

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
	public CSP isApplicable_solveCsp_CC(Branch y, Branch c, Assignment l, While a, Decision d, While b, Command w,
			Assignment m, Command z, Branch x, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, While a, Decision d, While b, Assignment m) {// 
		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_27_1_matchtggpattern_blackBBBBB(l, a, d,
				b, m);
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
	public boolean checkDEC_BWD(Branch y, Branch c, Command w, Command z, Branch x) {// 
		Object[] result1_black = decull2branchubbImpl.pattern_decull2branchubb_28_1_matchtggpattern_blackBBBBB(y, c, w,
				z, x);
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
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decull2branchubbImpl
					.pattern_decull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d] = " + d
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decull2branchubbImpl.pattern_decull2branchubb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decull2branchubbImpl.pattern_decull2branchubb_29_5_checknacs_blackBBB(c, d,
						d2c);
				if (result5_black != null) {

					Object[] result6_black = decull2branchubbImpl.pattern_decull2branchubb_29_6_perform_blackBBBB(c, d,
							d2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d] = " + d + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decull2branchubbImpl.pattern_decull2branchubb_29_6_perform_greenFBFFBFFFFFFFFFB(c, d, ruleResult);
					//nothing Branch y = (Branch) result6_green[0];
					//nothing Assignment l = (Assignment) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing While b = (While) result6_green[5];
					//nothing Command w = (Command) result6_green[6];
					//nothing S2B a2x = (S2B) result6_green[7];
					//nothing S2N l2z = (S2N) result6_green[8];
					//nothing S2B b2y = (S2B) result6_green[9];
					//nothing Assignment m = (Assignment) result6_green[10];
					//nothing Command z = (Command) result6_green[11];
					//nothing S2N m2w = (S2N) result6_green[12];
					//nothing Branch x = (Branch) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c,
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
		isApplicableMatch.registerObject("d", d);
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
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_DECISION_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (While) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_DECISION_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
			return null;
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_DECISION_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_ASSIGNMENT_WHILE_DECISION_WHILE_ASSIGNMENT_S2B:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6), (S2B) arguments.get(7));
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
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_DECISION_COMMAND_COMMAND_S2B_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3), (Command) arguments.get(4),
					(Command) arguments.get(5), (S2B) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_27((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_BRANCH_ASSIGNMENT_WHILE_DECISION_WHILE_COMMAND_ASSIGNMENT_COMMAND_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5), (Command) arguments.get(6), (Assignment) arguments.get(7),
					(Command) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_DECISION_WHILE_ASSIGNMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECULL2BRANCHUBB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULL2BRANCHUBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULL2BRANCHUBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_DECISION_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULL2BRANCHUBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decull2branchubb_0_1_initialbindings_blackBBBBBBB(decull2branchubb _this,
			Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, l, a, d, b, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(decull2branchubb _this,
			Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, a, d, b, m);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, a, d, b, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(decull2branchubb _this,
			Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		Object[] result_pattern_decull2branchubb_0_2_SolveCSP_binding = pattern_decull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, l, a, d, b, m);
		if (result_pattern_decull2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_0_2_SolveCSP_black = pattern_decull2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, a, d, b, m };
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
			Assignment l, While a, Decision d, While b, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, a, d, b, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(m);
		String b__m____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
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
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, l, a, d, b, m, b__m____last, a__l____first, d__a____positive, a__l____last,
				d__b____negative };
	}

	public static final Object[] pattern_decull2branchubb_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment l, While a, Decision d, While b, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, a, d, b, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(
			decull2branchubb _this, Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		_this.registerObjectsToMatch_FWD(match, l, a, d, b, m);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("l");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("m");
		EObject _localVariable_6 = isApplicableMatch.getObject("d2c");
		EObject tmpC = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpM = _localVariable_5;
		EObject tmpD2c = _localVariable_6;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							if (tmpM instanceof Assignment) {
								Assignment m = (Assignment) tmpM;
								if (tmpD2c instanceof S2B) {
									S2B d2c = (S2B) tmpD2c;
									return new Object[] { c, l, a, d, b, m, d2c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(Branch c,
			Assignment l, While a, Decision d, While b, Assignment m, S2B d2c, decull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { c, l, a, d, b, m, d2c, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decull2branchubb_1_1_performtransformation_binding[0];
			Assignment l = (Assignment) result_pattern_decull2branchubb_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_decull2branchubb_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decull2branchubb_1_1_performtransformation_binding[3];
			While b = (While) result_pattern_decull2branchubb_1_1_performtransformation_binding[4];
			Assignment m = (Assignment) result_pattern_decull2branchubb_1_1_performtransformation_binding[5];
			S2B d2c = (S2B) result_pattern_decull2branchubb_1_1_performtransformation_binding[6];

			Object[] result_pattern_decull2branchubb_1_1_performtransformation_black = pattern_decull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(
					c, l, a, d, b, m, d2c, _this, isApplicableMatch);
			if (result_pattern_decull2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decull2branchubb_1_1_performtransformation_black[7];

				return new Object[] { c, l, a, d, b, m, d2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_1_performtransformation_greenFBBBBFFFFBFFF(Branch c,
			Assignment l, While a, While b, Assignment m) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		c.setNegative(y);
		w.setNext(y);
		a2x.setSource(a);
		l2z.setSource(l);
		b2y.setSource(b);
		b2y.setTarget(y);
		l2z.setTarget(z);
		m2w.setSource(m);
		m2w.setTarget(w);
		c.setPositive(x);
		z.setNext(x);
		a2x.setTarget(x);
		x.setPositive(z);
		return new Object[] { y, c, l, a, b, w, a2x, l2z, b2y, m, z, m2w, x };
	}

	public static final Object[] pattern_decull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Branch y,
			Assignment l, While a, While b, Command w, S2B a2x, S2N l2z, S2B b2y, Assignment m, Command z, S2N m2w,
			Branch x) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!a2x.equals(b2y)) {
						if (!l2z.equals(m2w)) {
							if (!x.equals(y)) {
								return new Object[] { y, l, a, b, w, a2x, l2z, b2y, m, z, m2w, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Branch y,
			Assignment l, While a, While b, Command w, S2B a2x, S2N l2z, S2B b2y, Assignment m, Command z, S2N m2w,
			Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, y, l, a, b, w, a2x, l2z, b2y, m, z, m2w, x };
	}

	public static final Object[] pattern_decull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d, EObject b, EObject w,
			EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject d2c, EObject x) {
		if (!y.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(l)) {
					if (!c.equals(d)) {
						if (!c.equals(w)) {
							if (!c.equals(l2z)) {
								if (!c.equals(m)) {
									if (!c.equals(z)) {
										if (!c.equals(m2w)) {
											if (!c.equals(d2c)) {
												if (!c.equals(x)) {
													if (!l.equals(y)) {
														if (!l.equals(w)) {
															if (!l.equals(l2z)) {
																if (!l.equals(m)) {
																	if (!l.equals(z)) {
																		if (!l.equals(m2w)) {
																			if (!l.equals(x)) {
																				if (!a.equals(y)) {
																					if (!a.equals(c)) {
																						if (!a.equals(l)) {
																							if (!a.equals(d)) {
																								if (!a.equals(b)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												a2x)) {
																											if (!a.equals(
																													l2z)) {
																												if (!a.equals(
																														b2y)) {
																													if (!a.equals(
																															m)) {
																														if (!a.equals(
																																z)) {
																															if (!a.equals(
																																	m2w)) {
																																if (!a.equals(
																																		d2c)) {
																																	if (!a.equals(
																																			x)) {
																																		if (!d.equals(
																																				y)) {
																																			if (!d.equals(
																																					l)) {
																																				if (!d.equals(
																																						w)) {
																																					if (!d.equals(
																																							l2z)) {
																																						if (!d.equals(
																																								m)) {
																																							if (!d.equals(
																																									z)) {
																																								if (!d.equals(
																																										m2w)) {
																																									if (!d.equals(
																																											d2c)) {
																																										if (!d.equals(
																																												x)) {
																																											if (!b.equals(
																																													y)) {
																																												if (!b.equals(
																																														c)) {
																																													if (!b.equals(
																																															l)) {
																																														if (!b.equals(
																																																d)) {
																																															if (!b.equals(
																																																	w)) {
																																																if (!b.equals(
																																																		l2z)) {
																																																	if (!b.equals(
																																																			b2y)) {
																																																		if (!b.equals(
																																																				m)) {
																																																			if (!b.equals(
																																																					z)) {
																																																				if (!b.equals(
																																																						m2w)) {
																																																					if (!b.equals(
																																																							d2c)) {
																																																						if (!b.equals(
																																																								x)) {
																																																							if (!w.equals(
																																																									y)) {
																																																								if (!w.equals(
																																																										z)) {
																																																									if (!w.equals(
																																																											x)) {
																																																										if (!a2x.equals(
																																																												y)) {
																																																											if (!a2x.equals(
																																																													c)) {
																																																												if (!a2x.equals(
																																																														l)) {
																																																													if (!a2x.equals(
																																																															d)) {
																																																														if (!a2x.equals(
																																																																b)) {
																																																															if (!a2x.equals(
																																																																	w)) {
																																																																if (!a2x.equals(
																																																																		l2z)) {
																																																																	if (!a2x.equals(
																																																																			b2y)) {
																																																																		if (!a2x.equals(
																																																																				m)) {
																																																																			if (!a2x.equals(
																																																																					z)) {
																																																																				if (!a2x.equals(
																																																																						m2w)) {
																																																																					if (!a2x.equals(
																																																																							d2c)) {
																																																																						if (!a2x.equals(
																																																																								x)) {
																																																																							if (!l2z.equals(
																																																																									y)) {
																																																																								if (!l2z.equals(
																																																																										w)) {
																																																																									if (!l2z.equals(
																																																																											m)) {
																																																																										if (!l2z.equals(
																																																																												z)) {
																																																																											if (!l2z.equals(
																																																																													m2w)) {
																																																																												if (!l2z.equals(
																																																																														x)) {
																																																																													if (!b2y.equals(
																																																																															y)) {
																																																																														if (!b2y.equals(
																																																																																c)) {
																																																																															if (!b2y.equals(
																																																																																	l)) {
																																																																																if (!b2y.equals(
																																																																																		d)) {
																																																																																	if (!b2y.equals(
																																																																																			w)) {
																																																																																		if (!b2y.equals(
																																																																																				l2z)) {
																																																																																			if (!b2y.equals(
																																																																																					m)) {
																																																																																				if (!b2y.equals(
																																																																																						z)) {
																																																																																					if (!b2y.equals(
																																																																																							m2w)) {
																																																																																						if (!b2y.equals(
																																																																																								d2c)) {
																																																																																							if (!b2y.equals(
																																																																																									x)) {
																																																																																								if (!m.equals(
																																																																																										y)) {
																																																																																									if (!m.equals(
																																																																																											w)) {
																																																																																										if (!m.equals(
																																																																																												z)) {
																																																																																											if (!m.equals(
																																																																																													m2w)) {
																																																																																												if (!m.equals(
																																																																																														x)) {
																																																																																													if (!m2w.equals(
																																																																																															y)) {
																																																																																														if (!m2w.equals(
																																																																																																w)) {
																																																																																															if (!m2w.equals(
																																																																																																	z)) {
																																																																																																if (!m2w.equals(
																																																																																																		x)) {
																																																																																																	if (!d2c.equals(
																																																																																																			y)) {
																																																																																																		if (!d2c.equals(
																																																																																																				l)) {
																																																																																																			if (!d2c.equals(
																																																																																																					w)) {
																																																																																																				if (!d2c.equals(
																																																																																																						l2z)) {
																																																																																																					if (!d2c.equals(
																																																																																																							m)) {
																																																																																																						if (!d2c.equals(
																																																																																																								z)) {
																																																																																																							if (!d2c.equals(
																																																																																																									m2w)) {
																																																																																																								if (!d2c.equals(
																																																																																																										x)) {
																																																																																																									if (!x.equals(
																																																																																																											y)) {
																																																																																																										if (!x.equals(
																																																																																																												z)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													y,
																																																																																																													c,
																																																																																																													l,
																																																																																																													a,
																																																																																																													d,
																																																																																																													b,
																																																																																																													w,
																																																																																																													a2x,
																																																																																																													l2z,
																																																																																																													b2y,
																																																																																																													m,
																																																																																																													z,
																																																																																																													m2w,
																																																																																																													d2c,
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
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d, EObject b, EObject w,
			EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject x) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decull2branchubb";
		String b__m____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String l2z__l____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String w__y____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String m2w__m____source_name_prime = "source";
		String m2w__w____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String d__b____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__m____last.setName(b__m____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { ruleresult, y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, x, b__m____last, a__l____first,
				d__a____positive, c__x____positive, a2x__a____source, l2z__l____source, b2y__b____source, a__l____last,
				w__y____next, b2y__y____target, l2z__z____target, z__x____next, m2w__m____source, m2w__w____target,
				a2x__x____target, c__y____negative, d__b____negative, x__z____positive };
	}

	public static final void pattern_decull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decull2branchubb _this, PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d,
			EObject b, EObject w, EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject d2c,
			EObject x) {
		_this.registerObjects_FWD(ruleresult, y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, d2c, x);

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
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("b");
		EObject _localVariable_4 = match.getObject("m");
		EObject tmpL = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpM = _localVariable_4;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						if (tmpM instanceof Assignment) {
							Assignment m = (Assignment) tmpM;
							return new Object[] { l, a, d, b, m, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_2_2_corematch_blackFBBBBBFB(Assignment l, While a,
			Decision d, While b, Assignment m, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { c, l, a, d, b, m, d2c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_2_3_findcontext_blackBBBBBBB(Branch c, Assignment l,
			While a, Decision d, While b, Assignment m, S2B d2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (m.equals(b.getLast())) {
					if (l.equals(a.getFirst())) {
						if (a.equals(d.getPositive())) {
							if (l.equals(a.getLast())) {
								if (c.equals(d2c.getTarget())) {
									if (d.equals(d2c.getSource())) {
										if (b.equals(d.getNegative())) {
											_result.add(new Object[] { c, l, a, d, b, m, d2c });
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

	public static final Object[] pattern_decull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(Branch c, Assignment l,
			While a, Decision d, While b, Assignment m, S2B d2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__m____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(d2c);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		b__m____last.setName(b__m____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { c, l, a, d, b, m, d2c, isApplicableMatch, b__m____last, a__l____first, d__a____positive,
				a__l____last, d2c__c____target, d2c__d____source, d__b____negative };
	}

	public static final Object[] pattern_decull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Assignment l, While a, Decision d, While b, Assignment m,
			S2B d2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, l, a, d, b, m, d2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, l, a, d, b, m, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Assignment l, While a, Decision d, While b, Assignment m,
			S2B d2c) {
		Object[] result_pattern_decull2branchubb_2_4_solveCSP_binding = pattern_decull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, l, a, d, b, m, d2c);
		if (result_pattern_decull2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_2_4_solveCSP_black = pattern_decull2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, l, a, d, b, m, d2c };
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
			Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { _this, match, y, c, w, z, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(decull2branchubb _this,
			Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, c, w, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, c, w, z, x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(decull2branchubb _this,
			Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		Object[] result_pattern_decull2branchubb_10_2_SolveCSP_binding = pattern_decull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, y, c, w, z, x);
		if (result_pattern_decull2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_10_2_SolveCSP_black = pattern_decull2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, c, w, z, x };
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
			Branch y, Branch c, Command w, Command z, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { match, y, c, w, z, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String c__x____positive_name_prime = "positive";
		String w__y____next_name_prime = "next";
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		c__x____positive.setName(c__x____positive_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { match, y, c, w, z, x, c__x____positive, w__y____next, z__x____next, c__y____negative,
				x__z____positive };
	}

	public static final Object[] pattern_decull2branchubb_10_5_collectcontextelements_blackBBBBBB(Match match, Branch y,
			Branch c, Command w, Command z, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { match, y, c, w, z, x };
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
			decull2branchubb _this, Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		_this.registerObjectsToMatch_BWD(match, y, c, w, z, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpD2c = _localVariable_5;
		EObject tmpX = _localVariable_6;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpZ instanceof Command) {
							Command z = (Command) tmpZ;
							if (tmpD2c instanceof S2B) {
								S2B d2c = (S2B) tmpD2c;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									return new Object[] { y, c, d, w, z, d2c, x, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(Branch y, Branch c,
			Decision d, Command w, Command z, S2B d2c, Branch x, decull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { y, c, d, w, z, d2c, x, csp, _this, isApplicableMatch };
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
			Branch y = (Branch) result_pattern_decull2branchubb_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decull2branchubb_11_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decull2branchubb_11_1_performtransformation_binding[2];
			Command w = (Command) result_pattern_decull2branchubb_11_1_performtransformation_binding[3];
			Command z = (Command) result_pattern_decull2branchubb_11_1_performtransformation_binding[4];
			S2B d2c = (S2B) result_pattern_decull2branchubb_11_1_performtransformation_binding[5];
			Branch x = (Branch) result_pattern_decull2branchubb_11_1_performtransformation_binding[6];

			Object[] result_pattern_decull2branchubb_11_1_performtransformation_black = pattern_decull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(
					y, c, d, w, z, d2c, x, _this, isApplicableMatch);
			if (result_pattern_decull2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decull2branchubb_11_1_performtransformation_black[7];

				return new Object[] { y, c, d, w, z, d2c, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_1_performtransformation_greenBFFBFBFFFFBFB(Branch y,
			Decision d, Command w, Command z, Branch x) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a.setFirst(l);
		d.setPositive(a);
		a.setLast(l);
		d.setNegative(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		l2z.setSource(l);
		l2z.setTarget(z);
		b2y.setSource(b);
		b2y.setTarget(y);
		b.setLast(m);
		m2w.setSource(m);
		m2w.setTarget(w);
		return new Object[] { y, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, x };
	}

	public static final Object[] pattern_decull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Branch y,
			Assignment l, While a, While b, Command w, S2B a2x, S2N l2z, S2B b2y, Assignment m, Command z, S2N m2w,
			Branch x) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!a2x.equals(b2y)) {
						if (!l2z.equals(m2w)) {
							if (!x.equals(y)) {
								return new Object[] { y, l, a, b, w, a2x, l2z, b2y, m, z, m2w, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Branch y,
			Assignment l, While a, While b, Command w, S2B a2x, S2N l2z, S2B b2y, Assignment m, Command z, S2N m2w,
			Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, y, l, a, b, w, a2x, l2z, b2y, m, z, m2w, x };
	}

	public static final Object[] pattern_decull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d, EObject b, EObject w,
			EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject d2c, EObject x) {
		if (!y.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(l)) {
					if (!c.equals(d)) {
						if (!c.equals(w)) {
							if (!c.equals(l2z)) {
								if (!c.equals(m)) {
									if (!c.equals(z)) {
										if (!c.equals(m2w)) {
											if (!c.equals(d2c)) {
												if (!c.equals(x)) {
													if (!l.equals(y)) {
														if (!l.equals(w)) {
															if (!l.equals(l2z)) {
																if (!l.equals(m)) {
																	if (!l.equals(z)) {
																		if (!l.equals(m2w)) {
																			if (!l.equals(x)) {
																				if (!a.equals(y)) {
																					if (!a.equals(c)) {
																						if (!a.equals(l)) {
																							if (!a.equals(d)) {
																								if (!a.equals(b)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												a2x)) {
																											if (!a.equals(
																													l2z)) {
																												if (!a.equals(
																														b2y)) {
																													if (!a.equals(
																															m)) {
																														if (!a.equals(
																																z)) {
																															if (!a.equals(
																																	m2w)) {
																																if (!a.equals(
																																		d2c)) {
																																	if (!a.equals(
																																			x)) {
																																		if (!d.equals(
																																				y)) {
																																			if (!d.equals(
																																					l)) {
																																				if (!d.equals(
																																						w)) {
																																					if (!d.equals(
																																							l2z)) {
																																						if (!d.equals(
																																								m)) {
																																							if (!d.equals(
																																									z)) {
																																								if (!d.equals(
																																										m2w)) {
																																									if (!d.equals(
																																											d2c)) {
																																										if (!d.equals(
																																												x)) {
																																											if (!b.equals(
																																													y)) {
																																												if (!b.equals(
																																														c)) {
																																													if (!b.equals(
																																															l)) {
																																														if (!b.equals(
																																																d)) {
																																															if (!b.equals(
																																																	w)) {
																																																if (!b.equals(
																																																		l2z)) {
																																																	if (!b.equals(
																																																			b2y)) {
																																																		if (!b.equals(
																																																				m)) {
																																																			if (!b.equals(
																																																					z)) {
																																																				if (!b.equals(
																																																						m2w)) {
																																																					if (!b.equals(
																																																							d2c)) {
																																																						if (!b.equals(
																																																								x)) {
																																																							if (!w.equals(
																																																									y)) {
																																																								if (!w.equals(
																																																										z)) {
																																																									if (!w.equals(
																																																											x)) {
																																																										if (!a2x.equals(
																																																												y)) {
																																																											if (!a2x.equals(
																																																													c)) {
																																																												if (!a2x.equals(
																																																														l)) {
																																																													if (!a2x.equals(
																																																															d)) {
																																																														if (!a2x.equals(
																																																																b)) {
																																																															if (!a2x.equals(
																																																																	w)) {
																																																																if (!a2x.equals(
																																																																		l2z)) {
																																																																	if (!a2x.equals(
																																																																			b2y)) {
																																																																		if (!a2x.equals(
																																																																				m)) {
																																																																			if (!a2x.equals(
																																																																					z)) {
																																																																				if (!a2x.equals(
																																																																						m2w)) {
																																																																					if (!a2x.equals(
																																																																							d2c)) {
																																																																						if (!a2x.equals(
																																																																								x)) {
																																																																							if (!l2z.equals(
																																																																									y)) {
																																																																								if (!l2z.equals(
																																																																										w)) {
																																																																									if (!l2z.equals(
																																																																											m)) {
																																																																										if (!l2z.equals(
																																																																												z)) {
																																																																											if (!l2z.equals(
																																																																													m2w)) {
																																																																												if (!l2z.equals(
																																																																														x)) {
																																																																													if (!b2y.equals(
																																																																															y)) {
																																																																														if (!b2y.equals(
																																																																																c)) {
																																																																															if (!b2y.equals(
																																																																																	l)) {
																																																																																if (!b2y.equals(
																																																																																		d)) {
																																																																																	if (!b2y.equals(
																																																																																			w)) {
																																																																																		if (!b2y.equals(
																																																																																				l2z)) {
																																																																																			if (!b2y.equals(
																																																																																					m)) {
																																																																																				if (!b2y.equals(
																																																																																						z)) {
																																																																																					if (!b2y.equals(
																																																																																							m2w)) {
																																																																																						if (!b2y.equals(
																																																																																								d2c)) {
																																																																																							if (!b2y.equals(
																																																																																									x)) {
																																																																																								if (!m.equals(
																																																																																										y)) {
																																																																																									if (!m.equals(
																																																																																											w)) {
																																																																																										if (!m.equals(
																																																																																												z)) {
																																																																																											if (!m.equals(
																																																																																													m2w)) {
																																																																																												if (!m.equals(
																																																																																														x)) {
																																																																																													if (!m2w.equals(
																																																																																															y)) {
																																																																																														if (!m2w.equals(
																																																																																																w)) {
																																																																																															if (!m2w.equals(
																																																																																																	z)) {
																																																																																																if (!m2w.equals(
																																																																																																		x)) {
																																																																																																	if (!d2c.equals(
																																																																																																			y)) {
																																																																																																		if (!d2c.equals(
																																																																																																				l)) {
																																																																																																			if (!d2c.equals(
																																																																																																					w)) {
																																																																																																				if (!d2c.equals(
																																																																																																						l2z)) {
																																																																																																					if (!d2c.equals(
																																																																																																							m)) {
																																																																																																						if (!d2c.equals(
																																																																																																								z)) {
																																																																																																							if (!d2c.equals(
																																																																																																									m2w)) {
																																																																																																								if (!d2c.equals(
																																																																																																										x)) {
																																																																																																									if (!x.equals(
																																																																																																											y)) {
																																																																																																										if (!x.equals(
																																																																																																												z)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													y,
																																																																																																													c,
																																																																																																													l,
																																																																																																													a,
																																																																																																													d,
																																																																																																													b,
																																																																																																													w,
																																																																																																													a2x,
																																																																																																													l2z,
																																																																																																													b2y,
																																																																																																													m,
																																																																																																													z,
																																																																																																													m2w,
																																																																																																													d2c,
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
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d, EObject b, EObject w,
			EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject x) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decull2branchubb";
		String b__m____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String l2z__l____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String w__y____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String m2w__m____source_name_prime = "source";
		String m2w__w____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String d__b____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__m____last.setName(b__m____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { ruleresult, y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, x, b__m____last, a__l____first,
				d__a____positive, c__x____positive, a2x__a____source, l2z__l____source, b2y__b____source, a__l____last,
				w__y____next, b2y__y____target, l2z__z____target, z__x____next, m2w__m____source, m2w__w____target,
				a2x__x____target, c__y____negative, d__b____negative, x__z____positive };
	}

	public static final void pattern_decull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			decull2branchubb _this, PerformRuleResult ruleresult, EObject y, EObject c, EObject l, EObject a, EObject d,
			EObject b, EObject w, EObject a2x, EObject l2z, EObject b2y, EObject m, EObject z, EObject m2w, EObject d2c,
			EObject x) {
		_this.registerObjects_BWD(ruleresult, y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, d2c, x);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { y, c, w, z, x, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_12_2_corematch_blackBBFBBFBB(Branch y, Branch c,
			Command w, Command z, Branch x, Match match) {
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
								_result.add(new Object[] { y, c, d, w, z, d2c, x, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_12_3_findcontext_blackBBBBBBB(Branch y, Branch c,
			Decision d, Command w, Command z, S2B d2c, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (x.equals(c.getPositive())) {
							if (y.equals(w.getNext())) {
								if (x.equals(z.getNext())) {
									if (c.equals(d2c.getTarget())) {
										if (d.equals(d2c.getSource())) {
											if (y.equals(c.getNegative())) {
												if (z.equals(x.getPositive())) {
													_result.add(new Object[] { y, c, d, w, z, d2c, x });
												}
											}
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

	public static final Object[] pattern_decull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(Branch y, Branch c,
			Decision d, Command w, Command z, S2B d2c, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String w__y____next_name_prime = "next";
		String z__x____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		c__x____positive.setName(c__x____positive_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { y, c, d, w, z, d2c, x, isApplicableMatch, c__x____positive, w__y____next, z__x____next,
				d2c__c____target, d2c__d____source, c__y____negative, x__z____positive };
	}

	public static final Object[] pattern_decull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Branch y, Branch c, Decision d, Command w, Command z, S2B d2c,
			Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, c, d, w, z, d2c, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, c, d, w, z, d2c, x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			decull2branchubb _this, IsApplicableMatch isApplicableMatch, Branch y, Branch c, Decision d, Command w,
			Command z, S2B d2c, Branch x) {
		Object[] result_pattern_decull2branchubb_12_4_solveCSP_binding = pattern_decull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, y, c, d, w, z, d2c, x);
		if (result_pattern_decull2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_12_4_solveCSP_black = pattern_decull2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, c, d, w, z, d2c, x };
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_14644 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_1BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_695891 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_695891)) {
							if (!c.equals(__DEC_y_positive_695891)) {
								if (!x.equals(__DEC_y_positive_695891)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_2BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_692562 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_692562)) {
							if (!c.equals(__DEC_y_negative_692562)) {
								if (!x.equals(__DEC_y_negative_692562)) {
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_241709 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_4BBBB(Command w, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_205230 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_205230)) {
							if (!c.equals(__DEC_w_positive_205230)) {
								if (!x.equals(__DEC_w_positive_205230)) {
									return new Object[] { w, y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_5BBBB(Command w, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_564858 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_564858)) {
							if (!c.equals(__DEC_w_negative_564858)) {
								if (!x.equals(__DEC_w_negative_564858)) {
									return new Object[] { w, y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_607355 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_7BBBB(Command z, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_953522 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_953522)) {
							if (!c.equals(__DEC_z_positive_953522)) {
								if (!x.equals(__DEC_z_positive_953522)) {
									return new Object[] { z, y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_8BBBB(Command z, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_108643 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_108643)) {
							if (!c.equals(__DEC_z_negative_108643)) {
								if (!x.equals(__DEC_z_negative_108643)) {
									return new Object[] { z, y, c, x };
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
		for (Graph __DEC_x_root_437203 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_848420 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_848420)) {
							if (!y.equals(__DEC_x_positive_848420)) {
								if (!c.equals(__DEC_x_positive_848420)) {
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
					for (Branch __DEC_x_negative_293296 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_293296)) {
							if (!y.equals(__DEC_x_negative_293296)) {
								if (!c.equals(__DEC_x_negative_293296)) {
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
			Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch c,
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch y,
			Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
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

	public static final Object[] pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_25BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_positive.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (!c.equals(x)) {
					if (x.equals(c.getPositive())) {
						Node tmpY = c.getNegative();
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (!c.equals(y)) {
								if (!x.equals(y)) {
									Node tmpZ = x.getPositive();
									if (tmpZ instanceof Command) {
										Command z = (Command) tmpZ;
										if (x.equals(z.getNext())) {
											if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_9B(
													x) == null) {
												if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_25BB(c,
														x) == null) {
													if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_0B(
															y) == null) {
														if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_1BBB(
																y, c, x) == null) {
															if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_2BBB(
																	y, c, x) == null) {
																if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_10BBB(
																		x, y, c) == null) {
																	if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_11BBB(
																			x, y, c) == null) {
																		if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(
																				y, x) == null) {
																			if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(
																					y, x) == null) {
																				if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_6B(
																						z) == null) {
																					if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_7BBBB(
																							z, y, c, x) == null) {
																						if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_8BBBB(
																								z, y, c, x) == null) {
																							if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(
																									y, z) == null) {
																								if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(
																										c, z) == null) {
																									if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(
																											y,
																											z) == null) {
																										if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(
																												c,
																												z) == null) {
																											if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(
																													x,
																													z) == null) {
																												for (Node tmpW : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																y,
																																Node.class,
																																"next")) {
																													if (tmpW instanceof Command) {
																														Command w = (Command) tmpW;
																														if (!w.equals(
																																z)) {
																															if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_3B(
																																	w) == null) {
																																if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_4BBBB(
																																		w,
																																		y,
																																		c,
																																		x) == null) {
																																	if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_5BBBB(
																																			w,
																																			y,
																																			c,
																																			x) == null) {
																																		if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(
																																				y,
																																				w) == null) {
																																			if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																																					c,
																																					w) == null) {
																																				if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(
																																						x,
																																						w) == null) {
																																					if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(
																																							y,
																																							w) == null) {
																																						if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																																								c,
																																								w) == null) {
																																							if (pattern_decull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(
																																									x,
																																									w) == null) {
																																								_result.add(
																																										new Object[] {
																																												y,
																																												c,
																																												w,
																																												z,
																																												x,
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
			decull2branchubb _this, Match match, Branch y, Branch c, Command w, Command z, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, c, w, z, x);
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
		for (Decision __DEC_l_positive_82173 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_82173)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_306960 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_306960)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment l,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_891926 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!a.equals(__DEC_l_last_891926)) {
					if (!b.equals(__DEC_l_last_891926)) {
						return new Object[] { l, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_150001 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_920712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_920712)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_419167 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_419167)) {
					if (!b.equals(__DEC_a_first_419167)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_40717 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_40717)) {
					if (!b.equals(__DEC_a_last_40717)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_782899 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_8BB(While b, Decision d) {
		for (Decision __DEC_b_positive_976142 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_976142)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_9BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_191164 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_191164)) {
					if (!a.equals(__DEC_b_first_191164)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_10BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_802347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_802347)) {
					if (!a.equals(__DEC_b_last_802347)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_11B(While b) {
		for (Program __DEC_b_first_33172 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_12BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_325900 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_325900)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_13BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_508111 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_508111)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_14BBB(Assignment m,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_472954 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!a.equals(__DEC_m_first_472954)) {
					if (!b.equals(__DEC_m_first_472954)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_15BBB(Assignment m,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_279865 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!a.equals(__DEC_m_last_279865)) {
					if (!b.equals(__DEC_m_last_279865)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_16B(Assignment m) {
		for (Program __DEC_m_first_363728 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
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
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(While a, While b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(While a, While b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(While a,
			Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(While b,
			Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
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
					if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_11B(b) == null) {
						if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_16B(m) == null) {
							if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(b, m) == null) {
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
														if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_8BB(
																b, d) == null) {
															if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_12BB(
																	m, d) == null) {
																if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_13BB(
																		m, d) == null) {
																	if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(
																			d, b) == null) {
																		if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(
																				d, m) == null) {
																			if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(
																					d, m) == null) {
																				if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_4BB(
																						a, d) == null) {
																					if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_5BB(
																							a, b) == null) {
																						if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_6BB(
																								a, b) == null) {
																							if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_7B(
																									a) == null) {
																								if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_9BB(
																										b, a) == null) {
																									if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_10BB(
																											b,
																											a) == null) {
																										if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_14BBB(
																												m, a,
																												b) == null) {
																											if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_15BBB(
																													m,
																													a,
																													b) == null) {
																												if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																														d,
																														a) == null) {
																													if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																															a,
																															b) == null) {
																														if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(
																																a,
																																b) == null) {
																															if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(
																																	a,
																																	m) == null) {
																																if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(
																																		a,
																																		m) == null) {
																																	if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_0BB(
																																			l,
																																			d) == null) {
																																		if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_1BB(
																																				l,
																																				d) == null) {
																																			if (pattern_decull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(
																																					l,
																																					a,
																																					b) == null) {
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
																																												a,
																																												d,
																																												b,
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
			decull2branchubb _this, Match match, Assignment l, While a, Decision d, While b, Assignment m) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, a, d, b, m);
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

	public static final Object[] pattern_decull2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = sourceMatch.getObject("l");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = sourceMatch.getObject("d");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject _localVariable_6 = targetMatch.getObject("w");
		EObject _localVariable_7 = sourceMatch.getObject("m");
		EObject _localVariable_8 = targetMatch.getObject("z");
		EObject _localVariable_9 = targetMatch.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpW = _localVariable_6;
		EObject tmpM = _localVariable_7;
		EObject tmpZ = _localVariable_8;
		EObject tmpX = _localVariable_9;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpB instanceof While) {
								While b = (While) tmpB;
								if (tmpW instanceof Command) {
									Command w = (Command) tmpW;
									if (tmpM instanceof Assignment) {
										Assignment m = (Assignment) tmpM;
										if (tmpZ instanceof Command) {
											Command z = (Command) tmpZ;
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												return new Object[] { y, c, l, a, d, b, w, m, z, x, targetMatch,
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

	public static final Object[] pattern_decull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Branch y, Branch c,
			Assignment l, While a, Decision d, While b, Command w, Assignment m, Command z, Branch x, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!l.equals(m)) {
					if (!a.equals(b)) {
						if (!w.equals(z)) {
							if (!x.equals(y)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch };
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
				targetMatch, sourceMatch);
		if (result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding != null) {
			Branch y = (Branch) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[1];
			Assignment l = (Assignment) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[2];
			While a = (While) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[3];
			Decision d = (Decision) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[4];
			While b = (While) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[5];
			Command w = (Command) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[6];
			Assignment m = (Assignment) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[7];
			Command z = (Command) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[8];
			Branch x = (Branch) result_pattern_decull2branchubb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_decull2branchubb_24_2_matchsrctrgcontext_black = pattern_decull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch);
			if (result_pattern_decull2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(decull2branchubb _this,
			Branch y, Branch c, Assignment l, While a, Decision d, While b, Command w, Assignment m, Command z,
			Branch x, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			decull2branchubb _this, Branch y, Branch c, Assignment l, While a, Decision d, While b, Command w,
			Assignment m, Command z, Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decull2branchubb_24_3_solvecsp_binding = pattern_decull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch);
		if (result_pattern_decull2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decull2branchubb_24_3_solvecsp_black = pattern_decull2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decull2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, c, l, a, d, b, w, m, z, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decull2branchubb_24_5_matchcorrcontext_blackBBFBB(Branch c,
			Decision d, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { c, d, d2c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(Branch y, Branch c,
			Assignment l, While a, Decision d, While b, Command w, Assignment m, Command z, Branch x, CCMatch ccMatch) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!l.equals(m)) {
					if (!a.equals(b)) {
						if (!w.equals(z)) {
							if (!x.equals(y)) {
								return new Object[] { y, c, l, a, d, b, w, m, z, x, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_24_6_createcorrespondence_greenBBBBBFFFBBFBB(Branch y,
			Assignment l, While a, While b, Command w, Assignment m, Command z, Branch x, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		return new Object[] { y, l, a, b, w, a2x, l2z, b2y, m, z, m2w, x, ccMatch };
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
		for (Decision __DEC_l_positive_160192 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_160192)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_431378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_431378)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_2BBB(Assignment l, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_632822 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!a.equals(__DEC_l_last_632822)) {
					if (!b.equals(__DEC_l_last_632822)) {
						return new Object[] { l, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_644560 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_461022 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_461022)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_399811 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_399811)) {
					if (!b.equals(__DEC_a_first_399811)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_919664 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_919664)) {
					if (!b.equals(__DEC_a_last_919664)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_156039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_8BB(While b, Decision d) {
		for (Decision __DEC_b_positive_187999 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_187999)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_9BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_653100 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_653100)) {
					if (!a.equals(__DEC_b_first_653100)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_10BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_228803 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_228803)) {
					if (!a.equals(__DEC_b_last_228803)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_11B(While b) {
		for (Program __DEC_b_first_422542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_12BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_874710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_874710)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_13BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_579001 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_579001)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_14BBB(Assignment m, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_first_698916 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "first")) {
				if (!a.equals(__DEC_m_first_698916)) {
					if (!b.equals(__DEC_m_first_698916)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_15BBB(Assignment m, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_503638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!a.equals(__DEC_m_last_503638)) {
					if (!b.equals(__DEC_m_last_503638)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_16B(Assignment m) {
		for (Program __DEC_m_first_517876 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
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

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_20BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_21BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_22BB(While a, While b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_23BB(While a, While b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_24BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_25BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_26BB(While a, Assignment m) {
		if (m.equals(a.getFirst())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_27BB(While b, Assignment m) {
		if (m.equals(b.getFirst())) {
			return new Object[] { b, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_black_nac_28BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_27_1_matchtggpattern_blackBBBBB(Assignment l, While a,
			Decision d, While b, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (m.equals(b.getLast())) {
					if (l.equals(a.getFirst())) {
						if (a.equals(d.getPositive())) {
							if (l.equals(a.getLast())) {
								if (b.equals(d.getNegative())) {
									if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
										if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
											if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_2BBB(l, a,
													b) == null) {
												if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_3B(
														l) == null) {
													if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_4BB(a,
															d) == null) {
														if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_5BB(
																a, b) == null) {
															if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_6BB(
																	a, b) == null) {
																if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_7B(
																		a) == null) {
																	if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_8BB(
																			b, d) == null) {
																		if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_9BB(
																				b, a) == null) {
																			if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_10BB(
																					b, a) == null) {
																				if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_11B(
																						b) == null) {
																					if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_12BB(
																							m, d) == null) {
																						if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_13BB(
																								m, d) == null) {
																							if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_14BBB(
																									m, a, b) == null) {
																								if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_15BBB(
																										m, a,
																										b) == null) {
																									if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_16B(
																											m) == null) {
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
																															a) == null) {
																														if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_21BB(
																																d,
																																b) == null) {
																															if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_22BB(
																																	a,
																																	b) == null) {
																																if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_23BB(
																																		a,
																																		b) == null) {
																																	if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_24BB(
																																			d,
																																			m) == null) {
																																		if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_25BB(
																																				d,
																																				m) == null) {
																																			if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_26BB(
																																					a,
																																					m) == null) {
																																				if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_27BB(
																																						b,
																																						m) == null) {
																																					if (pattern_decull2branchubb_27_1_matchtggpattern_black_nac_28BB(
																																							a,
																																							m) == null) {
																																						return new Object[] {
																																								l,
																																								a,
																																								d,
																																								b,
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_944486 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_1BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_815173 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_815173)) {
							if (!c.equals(__DEC_y_positive_815173)) {
								if (!x.equals(__DEC_y_positive_815173)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_2BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_579073 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_579073)) {
							if (!c.equals(__DEC_y_negative_579073)) {
								if (!x.equals(__DEC_y_negative_579073)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_457817 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_4BBBB(Command w, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_33428 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!y.equals(__DEC_w_positive_33428)) {
							if (!c.equals(__DEC_w_positive_33428)) {
								if (!x.equals(__DEC_w_positive_33428)) {
									return new Object[] { w, y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_5BBBB(Command w, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_534486 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!y.equals(__DEC_w_negative_534486)) {
							if (!c.equals(__DEC_w_negative_534486)) {
								if (!x.equals(__DEC_w_negative_534486)) {
									return new Object[] { w, y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_440568 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_7BBBB(Command z, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_230380 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_230380)) {
							if (!c.equals(__DEC_z_positive_230380)) {
								if (!x.equals(__DEC_z_positive_230380)) {
									return new Object[] { z, y, c, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_8BBBB(Command z, Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_703229 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_703229)) {
							if (!c.equals(__DEC_z_negative_703229)) {
								if (!x.equals(__DEC_z_negative_703229)) {
									return new Object[] { z, y, c, x };
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
		for (Graph __DEC_x_root_382236 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_943237 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_943237)) {
							if (!y.equals(__DEC_x_positive_943237)) {
								if (!c.equals(__DEC_x_positive_943237)) {
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
					for (Branch __DEC_x_negative_761671 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_761671)) {
							if (!y.equals(__DEC_x_negative_761671)) {
								if (!c.equals(__DEC_x_negative_761671)) {
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch y, Command w) {
		if (w.equals(y.getPositive())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_17BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_18BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_19BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_20BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_21BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_22BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
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

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_black_nac_25BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_28_1_matchtggpattern_blackBBBBB(Branch y, Branch c, Command w,
			Command z, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (x.equals(c.getPositive())) {
							if (y.equals(w.getNext())) {
								if (x.equals(z.getNext())) {
									if (y.equals(c.getNegative())) {
										if (z.equals(x.getPositive())) {
											if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_0B(y) == null) {
												if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_1BBB(y, c,
														x) == null) {
													if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_2BBB(y,
															c, x) == null) {
														if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_3B(
																w) == null) {
															if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_4BBBB(
																	w, y, c, x) == null) {
																if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_5BBBB(
																		w, y, c, x) == null) {
																	if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_6B(
																			z) == null) {
																		if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_7BBBB(
																				z, y, c, x) == null) {
																			if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_8BBBB(
																					z, y, c, x) == null) {
																				if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_9B(
																						x) == null) {
																					if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_10BBB(
																							x, y, c) == null) {
																						if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_11BBB(
																								x, y, c) == null) {
																							if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_12BB(
																									y, w) == null) {
																								if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_13BB(
																										c, w) == null) {
																									if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_14BB(
																											x,
																											w) == null) {
																										if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_15BB(
																												y,
																												w) == null) {
																											if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_16BB(
																													c,
																													w) == null) {
																												if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_17BB(
																														x,
																														w) == null) {
																													if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_18BB(
																															y,
																															z) == null) {
																														if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_19BB(
																																c,
																																z) == null) {
																															if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_20BB(
																																	y,
																																	z) == null) {
																																if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_21BB(
																																		c,
																																		z) == null) {
																																	if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_22BB(
																																			x,
																																			z) == null) {
																																		if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_23BB(
																																				y,
																																				x) == null) {
																																			if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_24BB(
																																					y,
																																					x) == null) {
																																				if (pattern_decull2branchubb_28_1_matchtggpattern_black_nac_25BB(
																																						c,
																																						x) == null) {
																																					return new Object[] {
																																							y,
																																							c,
																																							w,
																																							z,
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
					Branch c = d2c.getTarget();
					if (c != null) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (pattern_decull2branchubb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decull2branchubb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										c) == null) {
									if (pattern_decull2branchubb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decull2branchubb_29_3_solveCSP_bindingFBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decull2branchubb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(decull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decull2branchubb_29_3_solveCSP_binding = pattern_decull2branchubb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d, d2c, ruleResult);
		if (result_pattern_decull2branchubb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decull2branchubb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decull2branchubb_29_3_solveCSP_black = pattern_decull2branchubb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decull2branchubb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decull2branchubb_29_4_checkCSP_expressionFBB(decull2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decull2branchubb_29_5_checknacs_blackBBB(Branch c, Decision d, S2B d2c) {
		return new Object[] { c, d, d2c };
	}

	public static final Object[] pattern_decull2branchubb_29_6_perform_blackBBBB(Branch c, Decision d, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d, d2c, ruleResult };
	}

	public static final Object[] pattern_decull2branchubb_29_6_perform_greenFBFFBFFFFFFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.getSourceObjects().add(l);
		a.setFirst(l);
		d.setPositive(a);
		a.setLast(l);
		ruleResult.getSourceObjects().add(a);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		w.setNext(y);
		ruleResult.getTargetObjects().add(w);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		b.setLast(m);
		ruleResult.getSourceObjects().add(m);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		m2w.setSource(m);
		m2w.setTarget(w);
		ruleResult.getCorrObjects().add(m2w);
		c.setPositive(x);
		z.setNext(x);
		a2x.setTarget(x);
		x.setPositive(z);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { y, c, l, a, d, b, w, a2x, l2z, b2y, m, z, m2w, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decull2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decull2branchubbImpl
