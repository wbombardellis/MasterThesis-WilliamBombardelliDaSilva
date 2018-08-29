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
import org.wbsilva.bx.sourcecode2controlflow.Rules.declul2branchbub;

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
 * An implementation of the model object '<em><b>declul2branchbub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class declul2branchbubImpl extends AbstractRuleImpl implements declul2branchbub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected declul2branchbubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdeclul2branchbub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision d, Assignment l, While b, While a, Assignment m) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_0_1_initialbindings_blackBBBBBBB(this,
				match, d, l, b, a, m);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ", " + "[m] = " + m + ".");
		}

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, d, l, b, a, m);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ", " + "[m] = " + m + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = declul2branchbubImpl
					.pattern_declul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(match, d, l, b, a, m);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[m] = " + m + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, d,
					l, b, a, m);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge b__m____first = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[10];

			Object[] result5_black = declul2branchbubImpl
					.pattern_declul2branchbub_0_5_collectcontextelements_blackBBBBBB(match, d, l, b, a, m);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[m] = " + m + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_0_5_collectcontextelements_greenBB(match, d);

			// 
			declul2branchbubImpl.pattern_declul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, d,
					l, b, a, m);
			return declul2branchbubImpl.pattern_declul2branchbub_0_7_expressionF();
		} else {
			return declul2branchbubImpl.pattern_declul2branchbub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch c = (Branch) result1_bindingAndBlack[0];
		Decision d = (Decision) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		While b = (While) result1_bindingAndBlack[4];
		While a = (While) result1_bindingAndBlack[5];
		Assignment m = (Assignment) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_1_1_performtransformation_greenFFBFFFFBFBBBF(c, l, b, a, m);
		S2N l2z = (S2N) result1_green[0];
		Command z = (Command) result1_green[1];
		Command w = (Command) result1_green[3];
		S2B b2y = (S2B) result1_green[4];
		S2N m2w = (S2N) result1_green[5];
		Branch x = (Branch) result1_green[6];
		Branch y = (Branch) result1_green[8];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = declul2branchbubImpl
				.pattern_declul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(l2z, z, w, b2y, m2w, x, l, y,
						b, a, m, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l2z] = " + l2z + ", " + "[z] = "
					+ z + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[m2w] = " + m2w + ", " + "[x] = " + x
					+ ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[m] = " + m + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = declul2branchbubImpl
				.pattern_declul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l2z, z, w, b2y, m2w, x, l, y,
						b, a, m, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = declul2branchbubImpl
				.pattern_declul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l2z, z, c, w, d,
						b2y, m2w, d2c, x, l, y, b, a, m, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[d] = " + d + ", " + "[b2y] = " + b2y + ", " + "[m2w] = " + m2w + ", " + "[d2c] = " + d2c + ", "
					+ "[x] = " + x + ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = "
					+ a + ", " + "[m] = " + m + ", " + "[a2x] = " + a2x + ".");
		}
		declul2branchbubImpl.pattern_declul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, l2z, z, c, w, d, b2y, m2w, x, l, y, b, a, m, a2x);
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[32];

		// 
		// 
		declul2branchbubImpl.pattern_declul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				l2z, z, c, w, d, b2y, m2w, d2c, x, l, y, b, a, m, a2x);
		return declul2branchbubImpl.pattern_declul2branchbub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = declul2branchbubImpl.pattern_declul2branchbub_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision d = (Decision) result2_binding[0];
		Assignment l = (Assignment) result2_binding[1];
		While b = (While) result2_binding[2];
		While a = (While) result2_binding[3];
		Assignment m = (Assignment) result2_binding[4];
		for (Object[] result2_black : declul2branchbubImpl.pattern_declul2branchbub_2_2_corematch_blackFBFBBBBB(d, l, b,
				a, m, match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : declul2branchbubImpl.pattern_declul2branchbub_2_3_findcontext_blackBBBBBBB(c,
					d, d2c, l, b, a, m)) {
				Object[] result3_green = declul2branchbubImpl
						.pattern_declul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(c, d, d2c, l, b, a, m);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = declul2branchbubImpl
						.pattern_declul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, d,
								d2c, l, b, a, m);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d] = " + d
							+ ", " + "[d2c] = " + d2c + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a
							+ ", " + "[m] = " + m + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (declul2branchbubImpl.pattern_declul2branchbub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = declul2branchbubImpl
							.pattern_declul2branchbub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return declul2branchbubImpl.pattern_declul2branchbub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		match.registerObject("d", d);
		match.registerObject("l", l);
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("m", m);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, Assignment l, While b, While a, Assignment m) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c,
			Assignment l, While b, While a, Assignment m) {// Create CSP
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
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w,
			EObject d, EObject b2y, EObject m2w, EObject d2c, EObject x, EObject l, EObject y, EObject b, EObject a,
			EObject m, EObject a2x) {
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("a2x", a2x);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Branch c, Command w, Branch x, Branch y) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_10_1_initialbindings_blackBBBBBBB(this,
				match, z, c, w, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, c, w, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = declul2branchbubImpl
					.pattern_declul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(match, z, c, w, x, y);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, z,
					c, w, x, y);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[10];

			Object[] result5_black = declul2branchbubImpl
					.pattern_declul2branchbub_10_5_collectcontextelements_blackBBBBBB(match, z, c, w, x, y);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_10_5_collectcontextelements_greenBB(match, c);

			// 
			declul2branchbubImpl.pattern_declul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, z,
					c, w, x, y);
			return declul2branchbubImpl.pattern_declul2branchbub_10_7_expressionF();
		} else {
			return declul2branchbubImpl.pattern_declul2branchbub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command z = (Command) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		Command w = (Command) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		Branch y = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_11_1_performtransformation_greenFBBBFFBFBFFFF(z, w, d, x, y);
		S2N l2z = (S2N) result1_green[0];
		S2B b2y = (S2B) result1_green[4];
		S2N m2w = (S2N) result1_green[5];
		Assignment l = (Assignment) result1_green[7];
		While b = (While) result1_green[9];
		While a = (While) result1_green[10];
		Assignment m = (Assignment) result1_green[11];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = declul2branchbubImpl
				.pattern_declul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(l2z, z, w, b2y, m2w, x, l, y,
						b, a, m, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l2z] = " + l2z + ", " + "[z] = "
					+ z + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[m2w] = " + m2w + ", " + "[x] = " + x
					+ ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[m] = " + m + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = declul2branchbubImpl
				.pattern_declul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l2z, z, w, b2y, m2w, x, l,
						y, b, a, m, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = declul2branchbubImpl
				.pattern_declul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l2z, z, c, w, d,
						b2y, m2w, d2c, x, l, y, b, a, m, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[d] = " + d + ", " + "[b2y] = " + b2y + ", " + "[m2w] = " + m2w + ", " + "[d2c] = " + d2c + ", "
					+ "[x] = " + x + ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = "
					+ a + ", " + "[m] = " + m + ", " + "[a2x] = " + a2x + ".");
		}
		declul2branchbubImpl.pattern_declul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, l2z, z, c, w, d, b2y, m2w, x, l, y, b, a, m, a2x);
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[32];

		// 
		// 
		declul2branchbubImpl.pattern_declul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				l2z, z, c, w, d, b2y, m2w, d2c, x, l, y, b, a, m, a2x);
		return declul2branchbubImpl.pattern_declul2branchbub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = declul2branchbubImpl.pattern_declul2branchbub_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command z = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Command w = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch y = (Branch) result2_binding[4];
		for (Object[] result2_black : declul2branchbubImpl.pattern_declul2branchbub_12_2_corematch_blackBBBFFBBB(z, c,
				w, x, y, match)) {
			Decision d = (Decision) result2_black[3];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : declul2branchbubImpl.pattern_declul2branchbub_12_3_findcontext_blackBBBBBBB(z,
					c, w, d, d2c, x, y)) {
				Object[] result3_green = declul2branchbubImpl
						.pattern_declul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(z, c, w, d, d2c, x, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = declul2branchbubImpl
						.pattern_declul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z, c,
								w, d, d2c, x, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[c] = " + c
							+ ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[d2c] = " + d2c + ", " + "[x] = " + x
							+ ", " + "[y] = " + y + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (declul2branchbubImpl.pattern_declul2branchbub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = declul2branchbubImpl
							.pattern_declul2branchbub_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return declul2branchbubImpl.pattern_declul2branchbub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		match.registerObject("z", z);
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch c, Command w, Branch x, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, Branch c, Command w,
			Decision d, S2B d2c, Branch x, Branch y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w,
			EObject d, EObject b2y, EObject m2w, EObject d2c, EObject x, EObject l, EObject y, EObject b, EObject a,
			EObject m, EObject a2x) {
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("a2x", a2x);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_62(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = declul2branchbubImpl.pattern_declul2branchbub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : declul2branchbubImpl
				.pattern_declul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Command z = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Command w = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch y = (Branch) result2_black[4];
			Object[] result2_green = declul2branchbubImpl
					.pattern_declul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (declul2branchbubImpl
					.pattern_declul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, c, w, x, y)) {
				// 
				if (declul2branchbubImpl
						.pattern_declul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = declul2branchbubImpl
							.pattern_declul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return declul2branchbubImpl.pattern_declul2branchbub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_62(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = declul2branchbubImpl.pattern_declul2branchbub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : declul2branchbubImpl
				.pattern_declul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Decision d = (Decision) result2_black[0];
			Assignment l = (Assignment) result2_black[1];
			While b = (While) result2_black[2];
			While a = (While) result2_black[3];
			Assignment m = (Assignment) result2_black[4];
			Object[] result2_green = declul2branchbubImpl
					.pattern_declul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (declul2branchbubImpl
					.pattern_declul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, d, l, b, a, m)) {
				// 
				if (declul2branchbubImpl
						.pattern_declul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = declul2branchbubImpl
							.pattern_declul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return declul2branchbubImpl.pattern_declul2branchbub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("declul2branchbub");
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
		ruleResult.setRule("declul2branchbub");
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

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = declul2branchbubImpl.pattern_declul2branchbub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Command z = (Command) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Command w = (Command) result2_bindingAndBlack[2];
		Decision d = (Decision) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];
		Branch y = (Branch) result2_bindingAndBlack[6];
		While b = (While) result2_bindingAndBlack[7];
		While a = (While) result2_bindingAndBlack[8];
		Assignment m = (Assignment) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, z, c, w, d, x, l, y, b, a,
						m, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[x] = "
					+ x + ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[m] = " + m + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : declul2branchbubImpl
					.pattern_declul2branchbub_24_5_matchcorrcontext_blackBBFBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = declul2branchbubImpl
						.pattern_declul2branchbub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = declul2branchbubImpl
						.pattern_declul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(z, c, w, d, x, l, y, b, a,
								m, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[x] = " + x + ", "
							+ "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
							+ "[m] = " + m + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				declul2branchbubImpl.pattern_declul2branchbub_24_6_createcorrespondence_greenFBBFFBBBBBBFB(z, w, x, l,
						y, b, a, m, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[0];
				//nothing S2B b2y = (S2B) result6_green[3];
				//nothing S2N m2w = (S2N) result6_green[4];
				//nothing S2B a2x = (S2B) result6_green[11];

				Object[] result7_black = declul2branchbubImpl
						.pattern_declul2branchbub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				declul2branchbubImpl.pattern_declul2branchbub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return declul2branchbubImpl.pattern_declul2branchbub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Command z, Branch c, Command w, Decision d, Branch x, Assignment l, Branch y,
			While b, While a, Assignment m, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, Assignment l, While b, While a, Assignment m) {// 
		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_27_1_matchtggpattern_blackBBBBB(d, l, b,
				a, m);
		if (result1_black != null) {
			return declul2branchbubImpl.pattern_declul2branchbub_27_2_expressionF();
		} else {
			return declul2branchbubImpl.pattern_declul2branchbub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command z, Branch c, Command w, Branch x, Branch y) {// 
		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_28_1_matchtggpattern_blackBBBBB(z, c, w,
				x, y);
		if (result1_black != null) {
			return declul2branchbubImpl.pattern_declul2branchbub_28_2_expressionF();
		} else {
			return declul2branchbubImpl.pattern_declul2branchbub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = declul2branchbubImpl.pattern_declul2branchbub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : declul2branchbubImpl
				.pattern_declul2branchbub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = declul2branchbubImpl
					.pattern_declul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d] = " + d
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (declul2branchbubImpl.pattern_declul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = declul2branchbubImpl.pattern_declul2branchbub_29_5_checknacs_blackBBB(c, d,
						d2c);
				if (result5_black != null) {

					Object[] result6_black = declul2branchbubImpl.pattern_declul2branchbub_29_6_perform_blackBBBB(c, d,
							d2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d] = " + d + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_29_6_perform_greenFFBFBFFFFFFFFFB(c, d, ruleResult);
					//nothing S2N l2z = (S2N) result6_green[0];
					//nothing Command z = (Command) result6_green[1];
					//nothing Command w = (Command) result6_green[3];
					//nothing S2B b2y = (S2B) result6_green[5];
					//nothing S2N m2w = (S2N) result6_green[6];
					//nothing Branch x = (Branch) result6_green[7];
					//nothing Assignment l = (Assignment) result6_green[8];
					//nothing Branch y = (Branch) result6_green[9];
					//nothing While b = (While) result6_green[10];
					//nothing While a = (While) result6_green[11];
					//nothing Assignment m = (Assignment) result6_green[12];
					//nothing S2B a2x = (S2B) result6_green[13];

				} else {
				}

			} else {
			}

		}
		return declul2branchbubImpl.pattern_declul2branchbub_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_DECISION_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_DECISION_S2B_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5), (While) arguments.get(6), (Assignment) arguments.get(7));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_COMMAND_DECISION_S2B_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Decision) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_62((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_62__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_62((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_COMMAND_DECISION_BRANCH_ASSIGNMENT_BRANCH_WHILE_WHILE_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7),
					(While) arguments.get(8), (Assignment) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_DEC_FWD__DECISION_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_DECISION_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_declul2branchbub_0_1_initialbindings_blackBBBBBBB(declul2branchbub _this,
			Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, d, l, b, a, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(declul2branchbub _this,
			Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, l, b, a, m);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, l, b, a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(declul2branchbub _this,
			Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		Object[] result_pattern_declul2branchbub_0_2_SolveCSP_binding = pattern_declul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, d, l, b, a, m);
		if (result_pattern_declul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_0_2_SolveCSP_black = pattern_declul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, l, b, a, m };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_0_3_CheckCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Decision d, Assignment l, While b, While a, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, d, l, b, a, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(m);
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String b__m____first_name_prime = "first";
		String b__m____last_name_prime = "last";
		String a__l____last_name_prime = "last";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____first);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { match, d, l, b, a, m, d__a____positive, d__b____negative, b__m____first, b__m____last,
				a__l____last };
	}

	public static final Object[] pattern_declul2branchbub_0_5_collectcontextelements_blackBBBBBB(Match match,
			Decision d, Assignment l, While b, While a, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, d, l, b, a, m };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_declul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(
			declul2branchbub _this, Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		_this.registerObjectsToMatch_FWD(match, d, l, b, a, m);

	}

	public static final boolean pattern_declul2branchbub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("l");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject _localVariable_6 = isApplicableMatch.getObject("m");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpA = _localVariable_5;
		EObject tmpM = _localVariable_6;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								if (tmpM instanceof Assignment) {
									Assignment m = (Assignment) tmpM;
									return new Object[] { c, d, d2c, l, b, a, m, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(Branch c,
			Decision d, S2B d2c, Assignment l, While b, While a, Assignment m, declul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { c, d, d2c, l, b, a, m, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			declul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_declul2branchbub_1_1_performtransformation_binding = pattern_declul2branchbub_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_declul2branchbub_1_1_performtransformation_binding != null) {
			Branch c = (Branch) result_pattern_declul2branchbub_1_1_performtransformation_binding[0];
			Decision d = (Decision) result_pattern_declul2branchbub_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_declul2branchbub_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_declul2branchbub_1_1_performtransformation_binding[3];
			While b = (While) result_pattern_declul2branchbub_1_1_performtransformation_binding[4];
			While a = (While) result_pattern_declul2branchbub_1_1_performtransformation_binding[5];
			Assignment m = (Assignment) result_pattern_declul2branchbub_1_1_performtransformation_binding[6];

			Object[] result_pattern_declul2branchbub_1_1_performtransformation_black = pattern_declul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(
					c, d, d2c, l, b, a, m, _this, isApplicableMatch);
			if (result_pattern_declul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_declul2branchbub_1_1_performtransformation_black[7];

				return new Object[] { c, d, d2c, l, b, a, m, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_greenFFBFFFFBFBBBF(Branch c,
			Assignment l, While b, While a, Assignment m) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		b2y.setSource(b);
		m2w.setTarget(w);
		m2w.setSource(m);
		z.setNext(x);
		c.setPositive(x);
		c.setNegative(y);
		w.setNext(y);
		b2y.setTarget(y);
		y.setPositive(w);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { l2z, z, c, w, b2y, m2w, x, l, y, b, a, m, a2x };
	}

	public static final Object[] pattern_declul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N l2z,
			Command z, Command w, S2B b2y, S2N m2w, Branch x, Assignment l, Branch y, While b, While a, Assignment m,
			S2B a2x) {
		if (!l2z.equals(m2w)) {
			if (!w.equals(z)) {
				if (!x.equals(y)) {
					if (!l.equals(m)) {
						if (!a.equals(b)) {
							if (!a2x.equals(b2y)) {
								return new Object[] { l2z, z, w, b2y, m2w, x, l, y, b, a, m, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N l2z,
			Command z, Command w, S2B b2y, S2N m2w, Branch x, Assignment l, Branch y, While b, While a, Assignment m,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, l2z, z, w, b2y, m2w, x, l, y, b, a, m, a2x };
	}

	public static final Object[] pattern_declul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w, EObject d, EObject b2y,
			EObject m2w, EObject d2c, EObject x, EObject l, EObject y, EObject b, EObject a, EObject m, EObject a2x) {
		if (!l2z.equals(z)) {
			if (!l2z.equals(w)) {
				if (!l2z.equals(m2w)) {
					if (!l2z.equals(x)) {
						if (!l2z.equals(y)) {
							if (!l2z.equals(m)) {
								if (!c.equals(l2z)) {
									if (!c.equals(z)) {
										if (!c.equals(w)) {
											if (!c.equals(d)) {
												if (!c.equals(m2w)) {
													if (!c.equals(d2c)) {
														if (!c.equals(x)) {
															if (!c.equals(l)) {
																if (!c.equals(y)) {
																	if (!c.equals(m)) {
																		if (!w.equals(z)) {
																			if (!w.equals(x)) {
																				if (!w.equals(y)) {
																					if (!d.equals(l2z)) {
																						if (!d.equals(z)) {
																							if (!d.equals(w)) {
																								if (!d.equals(m2w)) {
																									if (!d.equals(
																											d2c)) {
																										if (!d.equals(
																												x)) {
																											if (!d.equals(
																													l)) {
																												if (!d.equals(
																														y)) {
																													if (!d.equals(
																															m)) {
																														if (!b2y.equals(
																																l2z)) {
																															if (!b2y.equals(
																																	z)) {
																																if (!b2y.equals(
																																		c)) {
																																	if (!b2y.equals(
																																			w)) {
																																		if (!b2y.equals(
																																				d)) {
																																			if (!b2y.equals(
																																					m2w)) {
																																				if (!b2y.equals(
																																						d2c)) {
																																					if (!b2y.equals(
																																							x)) {
																																						if (!b2y.equals(
																																								l)) {
																																							if (!b2y.equals(
																																									y)) {
																																								if (!b2y.equals(
																																										m)) {
																																									if (!m2w.equals(
																																											z)) {
																																										if (!m2w.equals(
																																												w)) {
																																											if (!m2w.equals(
																																													x)) {
																																												if (!m2w.equals(
																																														y)) {
																																													if (!d2c.equals(
																																															l2z)) {
																																														if (!d2c.equals(
																																																z)) {
																																															if (!d2c.equals(
																																																	w)) {
																																																if (!d2c.equals(
																																																		m2w)) {
																																																	if (!d2c.equals(
																																																			x)) {
																																																		if (!d2c.equals(
																																																				l)) {
																																																			if (!d2c.equals(
																																																					y)) {
																																																				if (!d2c.equals(
																																																						m)) {
																																																					if (!x.equals(
																																																							z)) {
																																																						if (!x.equals(
																																																								y)) {
																																																							if (!l.equals(
																																																									l2z)) {
																																																								if (!l.equals(
																																																										z)) {
																																																									if (!l.equals(
																																																											w)) {
																																																										if (!l.equals(
																																																												m2w)) {
																																																											if (!l.equals(
																																																													x)) {
																																																												if (!l.equals(
																																																														y)) {
																																																													if (!l.equals(
																																																															m)) {
																																																														if (!y.equals(
																																																																z)) {
																																																															if (!b.equals(
																																																																	l2z)) {
																																																																if (!b.equals(
																																																																		z)) {
																																																																	if (!b.equals(
																																																																			c)) {
																																																																		if (!b.equals(
																																																																				w)) {
																																																																			if (!b.equals(
																																																																					d)) {
																																																																				if (!b.equals(
																																																																						b2y)) {
																																																																					if (!b.equals(
																																																																							m2w)) {
																																																																						if (!b.equals(
																																																																								d2c)) {
																																																																							if (!b.equals(
																																																																									x)) {
																																																																								if (!b.equals(
																																																																										l)) {
																																																																									if (!b.equals(
																																																																											y)) {
																																																																										if (!b.equals(
																																																																												m)) {
																																																																											if (!a.equals(
																																																																													l2z)) {
																																																																												if (!a.equals(
																																																																														z)) {
																																																																													if (!a.equals(
																																																																															c)) {
																																																																														if (!a.equals(
																																																																																w)) {
																																																																															if (!a.equals(
																																																																																	d)) {
																																																																																if (!a.equals(
																																																																																		b2y)) {
																																																																																	if (!a.equals(
																																																																																			m2w)) {
																																																																																		if (!a.equals(
																																																																																				d2c)) {
																																																																																			if (!a.equals(
																																																																																					x)) {
																																																																																				if (!a.equals(
																																																																																						l)) {
																																																																																					if (!a.equals(
																																																																																							y)) {
																																																																																						if (!a.equals(
																																																																																								b)) {
																																																																																							if (!a.equals(
																																																																																									m)) {
																																																																																								if (!a.equals(
																																																																																										a2x)) {
																																																																																									if (!m.equals(
																																																																																											z)) {
																																																																																										if (!m.equals(
																																																																																												w)) {
																																																																																											if (!m.equals(
																																																																																													m2w)) {
																																																																																												if (!m.equals(
																																																																																														x)) {
																																																																																													if (!m.equals(
																																																																																															y)) {
																																																																																														if (!a2x.equals(
																																																																																																l2z)) {
																																																																																															if (!a2x.equals(
																																																																																																	z)) {
																																																																																																if (!a2x.equals(
																																																																																																		c)) {
																																																																																																	if (!a2x.equals(
																																																																																																			w)) {
																																																																																																		if (!a2x.equals(
																																																																																																				d)) {
																																																																																																			if (!a2x.equals(
																																																																																																					b2y)) {
																																																																																																				if (!a2x.equals(
																																																																																																						m2w)) {
																																																																																																					if (!a2x.equals(
																																																																																																							d2c)) {
																																																																																																						if (!a2x.equals(
																																																																																																								x)) {
																																																																																																							if (!a2x.equals(
																																																																																																									l)) {
																																																																																																								if (!a2x.equals(
																																																																																																										y)) {
																																																																																																									if (!a2x.equals(
																																																																																																											b)) {
																																																																																																										if (!a2x.equals(
																																																																																																												m)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l2z,
																																																																																																													z,
																																																																																																													c,
																																																																																																													w,
																																																																																																													d,
																																																																																																													b2y,
																																																																																																													m2w,
																																																																																																													d2c,
																																																																																																													x,
																																																																																																													l,
																																																																																																													y,
																																																																																																													b,
																																																																																																													a,
																																																																																																													m,
																																																																																																													a2x };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_declul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w, EObject d, EObject b2y,
			EObject m2w, EObject x, EObject l, EObject y, EObject b, EObject a, EObject m, EObject a2x) {
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "declul2branchbub";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String d__b____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String y__w____positive_name_prime = "positive";
		String b__m____first_name_prime = "first";
		String b__m____last_name_prime = "last";
		String b2y__b____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String m2w__m____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getCreatedEdges().add(y__w____positive);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____first);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, l2z, z, c, w, d, b2y, m2w, x, l, y, b, a, m, a2x, l2z__z____target,
				z__x____next, c__y____negative, d__a____positive, m2w__w____target, w__y____next, d__b____negative,
				l2z__l____source, b2y__y____target, y__w____positive, b__m____first, b__m____last, b2y__b____source,
				c__x____positive, m2w__m____source, a__l____last, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_declul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			declul2branchbub _this, PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w,
			EObject d, EObject b2y, EObject m2w, EObject d2c, EObject x, EObject l, EObject y, EObject b, EObject a,
			EObject m, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, l2z, z, c, w, d, b2y, m2w, d2c, x, l, y, b, a, m, a2x);

	}

	public static final PerformRuleResult pattern_declul2branchbub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_2_1_preparereturnvalue_bindingFB(declul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			declul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(
			declul2branchbub _this) {
		Object[] result_pattern_declul2branchbub_2_1_preparereturnvalue_binding = pattern_declul2branchbub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_declul2branchbub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_declul2branchbub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_declul2branchbub_2_1_preparereturnvalue_black = pattern_declul2branchbub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_declul2branchbub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_declul2branchbub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "declul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_declul2branchbub_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("l");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("a");
		EObject _localVariable_4 = match.getObject("m");
		EObject tmpD = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpM = _localVariable_4;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpM instanceof Assignment) {
							Assignment m = (Assignment) tmpM;
							return new Object[] { d, l, b, a, m, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_2_2_corematch_blackFBFBBBBB(Decision d,
			Assignment l, While b, While a, Assignment m, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { c, d, d2c, l, b, a, m, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_2_3_findcontext_blackBBBBBBB(Branch c, Decision d,
			S2B d2c, Assignment l, While b, While a, Assignment m) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (a.equals(d.getPositive())) {
					if (b.equals(d.getNegative())) {
						if (d.equals(d2c.getSource())) {
							if (c.equals(d2c.getTarget())) {
								if (m.equals(b.getFirst())) {
									if (m.equals(b.getLast())) {
										if (l.equals(a.getLast())) {
											_result.add(new Object[] { c, d, d2c, l, b, a, m });
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

	public static final Object[] pattern_declul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(Branch c, Decision d,
			S2B d2c, Assignment l, While b, While a, Assignment m) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String b__m____first_name_prime = "first";
		String b__m____last_name_prime = "last";
		String a__l____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(m);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____first);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { c, d, d2c, l, b, a, m, isApplicableMatch, d__a____positive, d__b____negative,
				d2c__d____source, d2c__c____target, b__m____first, b__m____last, a__l____last };
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c, Assignment l, While b, While a,
			Assignment m) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, d, d2c, l, b, a, m);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d, d2c, l, b, a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c, Assignment l, While b, While a,
			Assignment m) {
		Object[] result_pattern_declul2branchbub_2_4_solveCSP_binding = pattern_declul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, d, d2c, l, b, a, m);
		if (result_pattern_declul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_2_4_solveCSP_black = pattern_declul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d, d2c, l, b, a, m };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_2_5_checkCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_declul2branchbub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "declul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_declul2branchbub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_10_1_initialbindings_blackBBBBBBB(declul2branchbub _this,
			Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { _this, match, z, c, w, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(declul2branchbub _this,
			Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, c, w, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, c, w, x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(declul2branchbub _this,
			Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		Object[] result_pattern_declul2branchbub_10_2_SolveCSP_binding = pattern_declul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, c, w, x, y);
		if (result_pattern_declul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_10_2_SolveCSP_black = pattern_declul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, c, w, x, y };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_10_3_CheckCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Command z, Branch c, Command w, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { match, z, c, w, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		match.getToBeTranslatedEdges().add(y__w____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { match, z, c, w, x, y, z__x____next, c__y____negative, w__y____next, y__w____positive,
				c__x____positive };
	}

	public static final Object[] pattern_declul2branchbub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command z, Branch c, Command w, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						return new Object[] { match, z, c, w, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_declul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(
			declul2branchbub _this, Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		_this.registerObjectsToMatch_BWD(match, z, c, w, x, y);

	}

	public static final boolean pattern_declul2branchbub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject _localVariable_6 = isApplicableMatch.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpY = _localVariable_6;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpY instanceof Branch) {
									Branch y = (Branch) tmpY;
									return new Object[] { z, c, w, d, d2c, x, y, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(Command z,
			Branch c, Command w, Decision d, S2B d2c, Branch x, Branch y, declul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, c, w, d, d2c, x, y, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			declul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_declul2branchbub_11_1_performtransformation_binding = pattern_declul2branchbub_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_declul2branchbub_11_1_performtransformation_binding != null) {
			Command z = (Command) result_pattern_declul2branchbub_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[1];
			Command w = (Command) result_pattern_declul2branchbub_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_declul2branchbub_11_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_declul2branchbub_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[5];
			Branch y = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[6];

			Object[] result_pattern_declul2branchbub_11_1_performtransformation_black = pattern_declul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(
					z, c, w, d, d2c, x, y, _this, isApplicableMatch);
			if (result_pattern_declul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_declul2branchbub_11_1_performtransformation_black[7];

				return new Object[] { z, c, w, d, d2c, x, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_greenFBBBFFBFBFFFF(Command z,
			Command w, Decision d, Branch x, Branch y) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setTarget(z);
		b2y.setTarget(y);
		m2w.setTarget(w);
		l2z.setSource(l);
		d.setNegative(b);
		b2y.setSource(b);
		d.setPositive(a);
		a.setLast(l);
		b.setFirst(m);
		b.setLast(m);
		m2w.setSource(m);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { l2z, z, w, d, b2y, m2w, x, l, y, b, a, m, a2x };
	}

	public static final Object[] pattern_declul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N l2z,
			Command z, Command w, S2B b2y, S2N m2w, Branch x, Assignment l, Branch y, While b, While a, Assignment m,
			S2B a2x) {
		if (!l2z.equals(m2w)) {
			if (!w.equals(z)) {
				if (!x.equals(y)) {
					if (!l.equals(m)) {
						if (!a.equals(b)) {
							if (!a2x.equals(b2y)) {
								return new Object[] { l2z, z, w, b2y, m2w, x, l, y, b, a, m, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N l2z,
			Command z, Command w, S2B b2y, S2N m2w, Branch x, Assignment l, Branch y, While b, While a, Assignment m,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, l2z, z, w, b2y, m2w, x, l, y, b, a, m, a2x };
	}

	public static final Object[] pattern_declul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w, EObject d, EObject b2y,
			EObject m2w, EObject d2c, EObject x, EObject l, EObject y, EObject b, EObject a, EObject m, EObject a2x) {
		if (!l2z.equals(z)) {
			if (!l2z.equals(w)) {
				if (!l2z.equals(m2w)) {
					if (!l2z.equals(x)) {
						if (!l2z.equals(y)) {
							if (!l2z.equals(m)) {
								if (!c.equals(l2z)) {
									if (!c.equals(z)) {
										if (!c.equals(w)) {
											if (!c.equals(d)) {
												if (!c.equals(m2w)) {
													if (!c.equals(d2c)) {
														if (!c.equals(x)) {
															if (!c.equals(l)) {
																if (!c.equals(y)) {
																	if (!c.equals(m)) {
																		if (!w.equals(z)) {
																			if (!w.equals(x)) {
																				if (!w.equals(y)) {
																					if (!d.equals(l2z)) {
																						if (!d.equals(z)) {
																							if (!d.equals(w)) {
																								if (!d.equals(m2w)) {
																									if (!d.equals(
																											d2c)) {
																										if (!d.equals(
																												x)) {
																											if (!d.equals(
																													l)) {
																												if (!d.equals(
																														y)) {
																													if (!d.equals(
																															m)) {
																														if (!b2y.equals(
																																l2z)) {
																															if (!b2y.equals(
																																	z)) {
																																if (!b2y.equals(
																																		c)) {
																																	if (!b2y.equals(
																																			w)) {
																																		if (!b2y.equals(
																																				d)) {
																																			if (!b2y.equals(
																																					m2w)) {
																																				if (!b2y.equals(
																																						d2c)) {
																																					if (!b2y.equals(
																																							x)) {
																																						if (!b2y.equals(
																																								l)) {
																																							if (!b2y.equals(
																																									y)) {
																																								if (!b2y.equals(
																																										m)) {
																																									if (!m2w.equals(
																																											z)) {
																																										if (!m2w.equals(
																																												w)) {
																																											if (!m2w.equals(
																																													x)) {
																																												if (!m2w.equals(
																																														y)) {
																																													if (!d2c.equals(
																																															l2z)) {
																																														if (!d2c.equals(
																																																z)) {
																																															if (!d2c.equals(
																																																	w)) {
																																																if (!d2c.equals(
																																																		m2w)) {
																																																	if (!d2c.equals(
																																																			x)) {
																																																		if (!d2c.equals(
																																																				l)) {
																																																			if (!d2c.equals(
																																																					y)) {
																																																				if (!d2c.equals(
																																																						m)) {
																																																					if (!x.equals(
																																																							z)) {
																																																						if (!x.equals(
																																																								y)) {
																																																							if (!l.equals(
																																																									l2z)) {
																																																								if (!l.equals(
																																																										z)) {
																																																									if (!l.equals(
																																																											w)) {
																																																										if (!l.equals(
																																																												m2w)) {
																																																											if (!l.equals(
																																																													x)) {
																																																												if (!l.equals(
																																																														y)) {
																																																													if (!l.equals(
																																																															m)) {
																																																														if (!y.equals(
																																																																z)) {
																																																															if (!b.equals(
																																																																	l2z)) {
																																																																if (!b.equals(
																																																																		z)) {
																																																																	if (!b.equals(
																																																																			c)) {
																																																																		if (!b.equals(
																																																																				w)) {
																																																																			if (!b.equals(
																																																																					d)) {
																																																																				if (!b.equals(
																																																																						b2y)) {
																																																																					if (!b.equals(
																																																																							m2w)) {
																																																																						if (!b.equals(
																																																																								d2c)) {
																																																																							if (!b.equals(
																																																																									x)) {
																																																																								if (!b.equals(
																																																																										l)) {
																																																																									if (!b.equals(
																																																																											y)) {
																																																																										if (!b.equals(
																																																																												m)) {
																																																																											if (!a.equals(
																																																																													l2z)) {
																																																																												if (!a.equals(
																																																																														z)) {
																																																																													if (!a.equals(
																																																																															c)) {
																																																																														if (!a.equals(
																																																																																w)) {
																																																																															if (!a.equals(
																																																																																	d)) {
																																																																																if (!a.equals(
																																																																																		b2y)) {
																																																																																	if (!a.equals(
																																																																																			m2w)) {
																																																																																		if (!a.equals(
																																																																																				d2c)) {
																																																																																			if (!a.equals(
																																																																																					x)) {
																																																																																				if (!a.equals(
																																																																																						l)) {
																																																																																					if (!a.equals(
																																																																																							y)) {
																																																																																						if (!a.equals(
																																																																																								b)) {
																																																																																							if (!a.equals(
																																																																																									m)) {
																																																																																								if (!a.equals(
																																																																																										a2x)) {
																																																																																									if (!m.equals(
																																																																																											z)) {
																																																																																										if (!m.equals(
																																																																																												w)) {
																																																																																											if (!m.equals(
																																																																																													m2w)) {
																																																																																												if (!m.equals(
																																																																																														x)) {
																																																																																													if (!m.equals(
																																																																																															y)) {
																																																																																														if (!a2x.equals(
																																																																																																l2z)) {
																																																																																															if (!a2x.equals(
																																																																																																	z)) {
																																																																																																if (!a2x.equals(
																																																																																																		c)) {
																																																																																																	if (!a2x.equals(
																																																																																																			w)) {
																																																																																																		if (!a2x.equals(
																																																																																																				d)) {
																																																																																																			if (!a2x.equals(
																																																																																																					b2y)) {
																																																																																																				if (!a2x.equals(
																																																																																																						m2w)) {
																																																																																																					if (!a2x.equals(
																																																																																																							d2c)) {
																																																																																																						if (!a2x.equals(
																																																																																																								x)) {
																																																																																																							if (!a2x.equals(
																																																																																																									l)) {
																																																																																																								if (!a2x.equals(
																																																																																																										y)) {
																																																																																																									if (!a2x.equals(
																																																																																																											b)) {
																																																																																																										if (!a2x.equals(
																																																																																																												m)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l2z,
																																																																																																													z,
																																																																																																													c,
																																																																																																													w,
																																																																																																													d,
																																																																																																													b2y,
																																																																																																													m2w,
																																																																																																													d2c,
																																																																																																													x,
																																																																																																													l,
																																																																																																													y,
																																																																																																													b,
																																																																																																													a,
																																																																																																													m,
																																																																																																													a2x };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_declul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w, EObject d, EObject b2y,
			EObject m2w, EObject x, EObject l, EObject y, EObject b, EObject a, EObject m, EObject a2x) {
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "declul2branchbub";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String d__b____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String y__w____positive_name_prime = "positive";
		String b__m____first_name_prime = "first";
		String b__m____last_name_prime = "last";
		String b2y__b____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String m2w__m____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getTranslatedEdges().add(y__w____positive);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____first);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, l2z, z, c, w, d, b2y, m2w, x, l, y, b, a, m, a2x, l2z__z____target,
				z__x____next, c__y____negative, d__a____positive, m2w__w____target, w__y____next, d__b____negative,
				l2z__l____source, b2y__y____target, y__w____positive, b__m____first, b__m____last, b2y__b____source,
				c__x____positive, m2w__m____source, a__l____last, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_declul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			declul2branchbub _this, PerformRuleResult ruleresult, EObject l2z, EObject z, EObject c, EObject w,
			EObject d, EObject b2y, EObject m2w, EObject d2c, EObject x, EObject l, EObject y, EObject b, EObject a,
			EObject m, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, l2z, z, c, w, d, b2y, m2w, d2c, x, l, y, b, a, m, a2x);

	}

	public static final PerformRuleResult pattern_declul2branchbub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_12_1_preparereturnvalue_bindingFB(declul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			declul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(
			declul2branchbub _this) {
		Object[] result_pattern_declul2branchbub_12_1_preparereturnvalue_binding = pattern_declul2branchbub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_declul2branchbub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_declul2branchbub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_declul2branchbub_12_1_preparereturnvalue_black = pattern_declul2branchbub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_declul2branchbub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_declul2branchbub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "declul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_declul2branchbub_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							return new Object[] { z, c, w, x, y, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_12_2_corematch_blackBBBFFBBB(Command z, Branch c,
			Command w, Branch x, Branch y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { z, c, w, d, d2c, x, y, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_12_3_findcontext_blackBBBBBBB(Command z, Branch c,
			Command w, Decision d, S2B d2c, Branch x, Branch y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (x.equals(z.getNext())) {
							if (y.equals(c.getNegative())) {
								if (y.equals(w.getNext())) {
									if (d.equals(d2c.getSource())) {
										if (c.equals(d2c.getTarget())) {
											if (w.equals(y.getPositive())) {
												if (x.equals(c.getPositive())) {
													_result.add(new Object[] { z, c, w, d, d2c, x, y });
												}
											}
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

	public static final Object[] pattern_declul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(Command z, Branch c,
			Command w, Decision d, S2B d2c, Branch x, Branch y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String y__w____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		isApplicableMatch.getAllContextElements().add(y__w____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { z, c, w, d, d2c, x, y, isApplicableMatch, z__x____next, c__y____negative, w__y____next,
				d2c__d____source, d2c__c____target, y__w____positive, c__x____positive };
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch c, Command w, Decision d, S2B d2c, Branch x,
			Branch y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, c, w, d, d2c, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, c, w, d, d2c, x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			declul2branchbub _this, IsApplicableMatch isApplicableMatch, Command z, Branch c, Command w, Decision d,
			S2B d2c, Branch x, Branch y) {
		Object[] result_pattern_declul2branchbub_12_4_solveCSP_binding = pattern_declul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, c, w, d, d2c, x, y);
		if (result_pattern_declul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_12_4_solveCSP_black = pattern_declul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, c, w, d, d2c, x, y };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_12_5_checkCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_declul2branchbub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "declul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_declul2branchbub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_20_1_preparereturnvalue_bindingFB(declul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			declul2branchbub _this) {
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

	public static final Object[] pattern_declul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			declul2branchbub _this) {
		Object[] result_pattern_declul2branchbub_20_1_preparereturnvalue_binding = pattern_declul2branchbub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_declul2branchbub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_declul2branchbub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_declul2branchbub_20_1_preparereturnvalue_black = pattern_declul2branchbub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_declul2branchbub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_declul2branchbub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_declul2branchbub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_648485 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_148517 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_148517)) {
							if (!x.equals(__DEC_z_positive_148517)) {
								if (!y.equals(__DEC_z_positive_148517)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_551515 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_551515)) {
							if (!x.equals(__DEC_z_negative_551515)) {
								if (!y.equals(__DEC_z_negative_551515)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_849204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_246357 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_246357)) {
							if (!x.equals(__DEC_w_positive_246357)) {
								if (!y.equals(__DEC_w_positive_246357)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_324310 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_324310)) {
							if (!x.equals(__DEC_w_negative_324310)) {
								if (!y.equals(__DEC_w_negative_324310)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_739038 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_568234 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_568234)) {
							if (!c.equals(__DEC_x_positive_568234)) {
								if (!y.equals(__DEC_x_positive_568234)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_995565 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_995565)) {
							if (!c.equals(__DEC_x_negative_995565)) {
								if (!y.equals(__DEC_x_negative_995565)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_9B(Branch y) {
		for (Graph __DEC_y_root_717002 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_10BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_453763 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_453763)) {
							if (!c.equals(__DEC_y_positive_453763)) {
								if (!x.equals(__DEC_y_positive_453763)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_11BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_165744 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_165744)) {
							if (!c.equals(__DEC_y_negative_165744)) {
								if (!x.equals(__DEC_y_negative_165744)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(Branch c,
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(Branch y,
			Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_25BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_26BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_next.getSrc();
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(z.getNext())) {
					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(x, z) == null) {
								if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Branch) {
												Branch y = (Branch) tmpY;
												if (!c.equals(y)) {
													if (!x.equals(y)) {
														Node tmpW = y.getPositive();
														if (tmpW instanceof Command) {
															Command w = (Command) tmpW;
															if (!w.equals(z)) {
																if (y.equals(w.getNext())) {
																	if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																			c, z) == null) {
																		if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																				c, z) == null) {
																			if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(
																					c, x) == null) {
																				if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(
																						z, c, x, y) == null) {
																					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(
																							z, c, x, y) == null) {
																						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(
																								x, c, y) == null) {
																							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(
																									x, c, y) == null) {
																								if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_9B(
																										y) == null) {
																									if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_10BBB(
																											y, c,
																											x) == null) {
																										if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_11BBB(
																												y, c,
																												x) == null) {
																											if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
																													y,
																													z) == null) {
																												if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(
																														y,
																														z) == null) {
																													if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(
																															c,
																															y) == null) {
																														if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_25BB(
																																x,
																																y) == null) {
																															if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_26BB(
																																	x,
																																	y) == null) {
																																if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
																																		w) == null) {
																																	if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(
																																			w,
																																			c,
																																			x,
																																			y) == null) {
																																		if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(
																																				w,
																																				c,
																																				x,
																																				y) == null) {
																																			if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(
																																					c,
																																					w) == null) {
																																				if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(
																																						x,
																																						w) == null) {
																																					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(
																																							c,
																																							w) == null) {
																																						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(
																																								x,
																																								w) == null) {
																																							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(
																																									y,
																																									w) == null) {
																																								_result.add(
																																										new Object[] {
																																												z,
																																												c,
																																												w,
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

		return _result;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_declul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			declul2branchbub _this, Match match, Command z, Branch c, Command w, Branch x, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, c, w, x, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			declul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_declul2branchbub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_21_1_preparereturnvalue_bindingFB(declul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			declul2branchbub _this) {
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

	public static final Object[] pattern_declul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			declul2branchbub _this) {
		Object[] result_pattern_declul2branchbub_21_1_preparereturnvalue_binding = pattern_declul2branchbub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_declul2branchbub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_declul2branchbub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_declul2branchbub_21_1_preparereturnvalue_black = pattern_declul2branchbub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_declul2branchbub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_declul2branchbub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_declul2branchbub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_821520 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_821520)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_694489 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_694489)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_82906 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_82906)) {
					if (!a.equals(__DEC_l_first_82906)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_3BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_681134 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_681134)) {
					if (!a.equals(__DEC_l_last_681134)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_25408 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(While b, Decision d) {
		for (Decision __DEC_b_positive_882834 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_882834)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_957427 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_957427)) {
					if (!a.equals(__DEC_b_first_957427)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_7BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_932057 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_932057)) {
					if (!a.equals(__DEC_b_last_932057)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_8B(While b) {
		for (Program __DEC_b_first_220734 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(While a, Decision d) {
		for (Decision __DEC_a_negative_87031 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_87031)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_375274 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_375274)) {
					if (!b.equals(__DEC_a_first_375274)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_11BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_866322 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_866322)) {
					if (!b.equals(__DEC_a_last_866322)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_12B(While a) {
		for (Program __DEC_a_first_715991 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_386980 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_386980)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_414357 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_414357)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_15BBB(Assignment m,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_870571 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_870571)) {
					if (!a.equals(__DEC_m_last_870571)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_16B(Assignment m) {
		for (Program __DEC_m_first_170564 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_27BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(
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
								Statement tmpM = b.getFirst();
								if (tmpM instanceof Assignment) {
									Assignment m = (Assignment) tmpM;
									if (!l.equals(m)) {
										if (m.equals(b.getLast())) {
											if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(a,
													d) == null) {
												if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_12B(
														a) == null) {
													if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(
															d, a) == null) {
														if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(
																b, d) == null) {
															if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(
																	b, a) == null) {
																if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_7BB(
																		b, a) == null) {
																	if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_8B(
																			b) == null) {
																		if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(
																				a, b) == null) {
																			if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_11BB(
																					a, b) == null) {
																				if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(
																						d, b) == null) {
																					if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(
																							b, a) == null) {
																						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(
																								b, a) == null) {
																							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(
																									l, d) == null) {
																								if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(
																										l, d) == null) {
																									if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(
																											l, b,
																											a) == null) {
																										if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_3BBB(
																												l, b,
																												a) == null) {
																											if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_4B(
																													l) == null) {
																												if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																														d,
																														l) == null) {
																													if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																															d,
																															l) == null) {
																														if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																																b,
																																l) == null) {
																															if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																																	a,
																																	l) == null) {
																																if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
																																		b,
																																		l) == null) {
																																	if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																																			m,
																																			d) == null) {
																																		if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																																				m,
																																				d) == null) {
																																			if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_15BBB(
																																					m,
																																					b,
																																					a) == null) {
																																				if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_16B(
																																						m) == null) {
																																					if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(
																																							d,
																																							m) == null) {
																																						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_27BB(
																																								d,
																																								m) == null) {
																																							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_28BB(
																																									a,
																																									m) == null) {
																																								_result.add(
																																										new Object[] {
																																												d,
																																												l,
																																												b,
																																												a,
																																												m,
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

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_declul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			declul2branchbub _this, Match match, Decision d, Assignment l, While b, While a, Assignment m) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, l, b, a, m);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			declul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_declul2branchbub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_24_1_prepare_blackB(declul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_declul2branchbub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_declul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("z");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("w");
		EObject _localVariable_3 = sourceMatch.getObject("d");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject _localVariable_6 = targetMatch.getObject("y");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject _localVariable_8 = sourceMatch.getObject("a");
		EObject _localVariable_9 = sourceMatch.getObject("m");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpY = _localVariable_6;
		EObject tmpB = _localVariable_7;
		EObject tmpA = _localVariable_8;
		EObject tmpM = _localVariable_9;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpY instanceof Branch) {
									Branch y = (Branch) tmpY;
									if (tmpB instanceof While) {
										While b = (While) tmpB;
										if (tmpA instanceof While) {
											While a = (While) tmpA;
											if (tmpM instanceof Assignment) {
												Assignment m = (Assignment) tmpM;
												return new Object[] { z, c, w, d, x, l, y, b, a, m, targetMatch,
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

	public static final Object[] pattern_declul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Command z, Branch c,
			Command w, Decision d, Branch x, Assignment l, Branch y, While b, While a, Assignment m, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (!l.equals(m)) {
							if (!a.equals(b)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding = pattern_declul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			Command z = (Command) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Command w = (Command) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Decision d = (Decision) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Branch y = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[6];
			While b = (While) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[7];
			While a = (While) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[8];
			Assignment m = (Assignment) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_declul2branchbub_24_2_matchsrctrgcontext_black = pattern_declul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch);
			if (result_pattern_declul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(declul2branchbub _this,
			Command z, Branch c, Command w, Decision d, Branch x, Assignment l, Branch y, While b, While a,
			Assignment m, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			declul2branchbub _this, Command z, Branch c, Command w, Decision d, Branch x, Assignment l, Branch y,
			While b, While a, Assignment m, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_declul2branchbub_24_3_solvecsp_binding = pattern_declul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch);
		if (result_pattern_declul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_declul2branchbub_24_3_solvecsp_black = pattern_declul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_declul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, c, w, d, x, l, y, b, a, m, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_24_5_matchcorrcontext_blackBBFBB(Branch c,
			Decision d, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { c, d, d2c, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "declul2branchbub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_declul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(Command z,
			Branch c, Command w, Decision d, Branch x, Assignment l, Branch y, While b, While a, Assignment m,
			CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (!l.equals(m)) {
							if (!a.equals(b)) {
								return new Object[] { z, c, w, d, x, l, y, b, a, m, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_6_createcorrespondence_greenFBBFFBBBBBBFB(Command z,
			Command w, Branch x, Assignment l, Branch y, While b, While a, Assignment m, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		m2w.setTarget(w);
		m2w.setSource(m);
		ccMatch.getCreateCorr().add(m2w);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { l2z, z, w, b2y, m2w, x, l, y, b, a, m, a2x, ccMatch };
	}

	public static final Object[] pattern_declul2branchbub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_declul2branchbub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "declul2branchbub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_declul2branchbub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_0BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_13722 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_13722)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_735012 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_735012)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_2BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_286264 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_286264)) {
					if (!a.equals(__DEC_l_first_286264)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_3BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_792470 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_792470)) {
					if (!a.equals(__DEC_l_last_792470)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_602105 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_5BB(While b, Decision d) {
		for (Decision __DEC_b_positive_196317 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_196317)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_6BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_519378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_519378)) {
					if (!a.equals(__DEC_b_first_519378)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_7BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_662942 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_662942)) {
					if (!a.equals(__DEC_b_last_662942)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_8B(While b) {
		for (Program __DEC_b_first_117811 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_9BB(While a, Decision d) {
		for (Decision __DEC_a_negative_715296 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_715296)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_10BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_538722 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_538722)) {
					if (!b.equals(__DEC_a_first_538722)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_11BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_489654 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_489654)) {
					if (!b.equals(__DEC_a_last_489654)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_12B(While a) {
		for (Program __DEC_a_first_808861 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_13BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_531488 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_531488)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_14BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_984562 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_984562)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_15BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_371314 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_371314)) {
					if (!a.equals(__DEC_m_last_371314)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_16B(Assignment m) {
		for (Program __DEC_m_first_771961 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_19BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_20BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_21BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_22BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_23BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_24BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_25BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_26BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_27BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_28BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_blackBBBBB(Decision d, Assignment l,
			While b, While a, Assignment m) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (a.equals(d.getPositive())) {
					if (b.equals(d.getNegative())) {
						if (m.equals(b.getFirst())) {
							if (m.equals(b.getLast())) {
								if (l.equals(a.getLast())) {
									if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
										if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
											if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_2BBB(l, b,
													a) == null) {
												if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_3BBB(l, b,
														a) == null) {
													if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_4B(
															l) == null) {
														if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_5BB(
																b, d) == null) {
															if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_6BB(
																	b, a) == null) {
																if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_7BB(
																		b, a) == null) {
																	if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_8B(
																			b) == null) {
																		if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_9BB(
																				a, d) == null) {
																			if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_10BB(
																					a, b) == null) {
																				if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_11BB(
																						a, b) == null) {
																					if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_12B(
																							a) == null) {
																						if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																								m, d) == null) {
																							if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																									m, d) == null) {
																								if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_15BBB(
																										m, b,
																										a) == null) {
																									if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_16B(
																											m) == null) {
																										if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																												d,
																												l) == null) {
																											if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																													d,
																													l) == null) {
																												if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																														b,
																														l) == null) {
																													if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																															a,
																															l) == null) {
																														if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_21BB(
																																b,
																																l) == null) {
																															if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_22BB(
																																	d,
																																	b) == null) {
																																if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_23BB(
																																		d,
																																		a) == null) {
																																	if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_24BB(
																																			b,
																																			a) == null) {
																																		if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_25BB(
																																				b,
																																				a) == null) {
																																			if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_26BB(
																																					d,
																																					m) == null) {
																																				if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_27BB(
																																						d,
																																						m) == null) {
																																					if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_28BB(
																																							a,
																																							m) == null) {
																																						return new Object[] {
																																								d,
																																								l,
																																								b,
																																								a,
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

	public static final boolean pattern_declul2branchbub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_353964 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_882596 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_882596)) {
							if (!x.equals(__DEC_z_positive_882596)) {
								if (!y.equals(__DEC_z_positive_882596)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_399379 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_399379)) {
							if (!x.equals(__DEC_z_negative_399379)) {
								if (!y.equals(__DEC_z_negative_399379)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_707198 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_311551 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_311551)) {
							if (!x.equals(__DEC_w_positive_311551)) {
								if (!y.equals(__DEC_w_positive_311551)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_184640 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_184640)) {
							if (!x.equals(__DEC_w_negative_184640)) {
								if (!y.equals(__DEC_w_negative_184640)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_277350 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_524571 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_524571)) {
							if (!c.equals(__DEC_x_positive_524571)) {
								if (!y.equals(__DEC_x_positive_524571)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_51630 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_51630)) {
							if (!c.equals(__DEC_x_negative_51630)) {
								if (!y.equals(__DEC_x_negative_51630)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_9B(Branch y) {
		for (Graph __DEC_y_root_243444 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_10BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_393213 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_393213)) {
							if (!c.equals(__DEC_y_positive_393213)) {
								if (!x.equals(__DEC_y_positive_393213)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_11BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_592190 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_592190)) {
							if (!c.equals(__DEC_y_negative_592190)) {
								if (!x.equals(__DEC_y_negative_592190)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_17BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_18BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_19BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_20BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_21BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_22BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_23BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_24BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_25BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_26BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_blackBBBBB(Command z, Branch c,
			Command w, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!w.equals(z)) {
					if (!x.equals(y)) {
						if (x.equals(z.getNext())) {
							if (y.equals(c.getNegative())) {
								if (y.equals(w.getNext())) {
									if (w.equals(y.getPositive())) {
										if (x.equals(c.getPositive())) {
											if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_0B(z) == null) {
												if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(z, c,
														x, y) == null) {
													if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(z,
															c, x, y) == null) {
														if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_3B(
																w) == null) {
															if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(
																	w, c, x, y) == null) {
																if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(
																		w, c, x, y) == null) {
																	if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_6B(
																			x) == null) {
																		if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_7BBB(
																				x, c, y) == null) {
																			if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_8BBB(
																					x, c, y) == null) {
																				if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_9B(
																						y) == null) {
																					if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_10BBB(
																							y, c, x) == null) {
																						if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_11BBB(
																								y, c, x) == null) {
																							if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																									c, z) == null) {
																								if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																										x, z) == null) {
																									if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																											y,
																											z) == null) {
																										if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																												c,
																												z) == null) {
																											if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																													x,
																													z) == null) {
																												if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																														y,
																														z) == null) {
																													if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_18BB(
																															c,
																															w) == null) {
																														if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_19BB(
																																x,
																																w) == null) {
																															if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_20BB(
																																	c,
																																	w) == null) {
																																if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_21BB(
																																		x,
																																		w) == null) {
																																	if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_22BB(
																																			y,
																																			w) == null) {
																																		if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_23BB(
																																				c,
																																				x) == null) {
																																			if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_24BB(
																																					c,
																																					y) == null) {
																																				if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_25BB(
																																						x,
																																						y) == null) {
																																					if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_26BB(
																																							x,
																																							y) == null) {
																																						return new Object[] {
																																								z,
																																								c,
																																								w,
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

	public static final boolean pattern_declul2branchbub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_29_1_createresult_blackB(declul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_declul2branchbub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_declul2branchbub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										c) == null) {
									if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_bindingFBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch c, Decision d, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_declul2branchbub_29_3_solveCSP_binding = pattern_declul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d, d2c, ruleResult);
		if (result_pattern_declul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_29_3_solveCSP_black = pattern_declul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_29_4_checkCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_29_5_checknacs_blackBBB(Branch c, Decision d, S2B d2c) {
		return new Object[] { c, d, d2c };
	}

	public static final Object[] pattern_declul2branchbub_29_6_perform_blackBBBB(Branch c, Decision d, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d, d2c, ruleResult };
	}

	public static final Object[] pattern_declul2branchbub_29_6_perform_greenFFBFBFFFFFFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(l2z);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getTargetObjects().add(w);
		ruleResult.getCorrObjects().add(b2y);
		m2w.setTarget(w);
		ruleResult.getCorrObjects().add(m2w);
		z.setNext(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		c.setNegative(y);
		w.setNext(y);
		b2y.setTarget(y);
		y.setPositive(w);
		ruleResult.getTargetObjects().add(y);
		d.setNegative(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		d.setPositive(a);
		a.setLast(l);
		ruleResult.getSourceObjects().add(a);
		b.setFirst(m);
		b.setLast(m);
		m2w.setSource(m);
		ruleResult.getSourceObjects().add(m);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l2z, z, c, w, d, b2y, m2w, x, l, y, b, a, m, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_declul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //declul2branchbubImpl
