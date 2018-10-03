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
	public boolean isAppropriate_FWD(Match match, Assignment m, While b, Assignment l, Decision d, While a) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_0_1_initialbindings_blackBBBBBBB(this,
				match, m, b, l, d, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[m] = " + m + ", " + "[b] = " + b + ", " + "[l] = " + l + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, m, b, l, d, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[m] = " + m + ", " + "[b] = " + b + ", " + "[l] = " + l + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = declul2branchbubImpl
					.pattern_declul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(match, m, b, l, d, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[m] = " + m + ", "
								+ "[b] = " + b + ", " + "[l] = " + l + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, m,
					b, l, d, a);
			//nothing EMoflonEdge b__m____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[10];

			Object[] result5_black = declul2branchbubImpl
					.pattern_declul2branchbub_0_5_collectcontextelements_blackBBBBBB(match, m, b, l, d, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[m] = " + m + ", "
								+ "[b] = " + b + ", " + "[l] = " + l + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_0_5_collectcontextelements_greenBB(match, d);

			// 
			declul2branchbubImpl.pattern_declul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, m,
					b, l, d, a);
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
		Assignment m = (Assignment) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Assignment l = (Assignment) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		While a = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_1_1_performtransformation_greenBFBFFBBFFFFFB(m, b, c, l, a);
		Command w = (Command) result1_green[1];
		S2B b2y = (S2B) result1_green[3];
		Command z = (Command) result1_green[4];
		S2N m2w = (S2N) result1_green[7];
		S2N l2z = (S2N) result1_green[8];
		Branch x = (Branch) result1_green[9];
		S2B a2x = (S2B) result1_green[10];
		Branch y = (Branch) result1_green[11];

		Object[] result2_black = declul2branchbubImpl
				.pattern_declul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(m, w, b, b2y, z, l, m2w, l2z,
						x, a2x, y, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m] = " + m + ", " + "[w] = " + w
					+ ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[l] = " + l + ", "
					+ "[m2w] = " + m2w + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = declul2branchbubImpl
				.pattern_declul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(m, w, b, b2y, z, l, m2w, l2z,
						x, a2x, y, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = declul2branchbubImpl
				.pattern_declul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, m, w, b, b2y, z,
						d2c, c, l, m2w, d, l2z, x, a2x, y, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m] = " + m + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", "
					+ "[z] = " + z + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
					+ "[m2w] = " + m2w + ", " + "[d] = " + d + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x + ", "
					+ "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[a] = " + a + ".");
		}
		declul2branchbubImpl.pattern_declul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, m, w, b, b2y, z, c, l, m2w, d, l2z, x, a2x, y, a);
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[32];

		// 
		// 
		declul2branchbubImpl.pattern_declul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				m, w, b, b2y, z, d2c, c, l, m2w, d, l2z, x, a2x, y, a);
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
		Assignment m = (Assignment) result2_binding[0];
		While b = (While) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : declul2branchbubImpl.pattern_declul2branchbub_2_2_corematch_blackBBFFBBBB(m, b, l,
				d, a, match)) {
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];
			// ForEach 
			for (Object[] result3_black : declul2branchbubImpl.pattern_declul2branchbub_2_3_findcontext_blackBBBBBBB(m,
					b, d2c, c, l, d, a)) {
				Object[] result3_green = declul2branchbubImpl
						.pattern_declul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(m, b, d2c, c, l, d, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = declul2branchbubImpl
						.pattern_declul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, m, b,
								d2c, c, l, d, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m] = " + m + ", " + "[b] = " + b
							+ ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[d] = " + d
							+ ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		match.registerObject("m", m);
		match.registerObject("b", b);
		match.registerObject("l", l);
		match.registerObject("d", d);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment m, While b, Assignment l, Decision d, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment m, While b, S2B d2c, Branch c,
			Assignment l, Decision d, While a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y,
			EObject z, EObject d2c, EObject c, EObject l, EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x,
			EObject y, EObject a) {
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command w, Command z, Branch c, Branch x, Branch y) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_10_1_initialbindings_blackBBBBBBB(this,
				match, w, z, c, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, w, z, c, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = declul2branchbubImpl
					.pattern_declul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(match, w, z, c, x, y);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, w,
					z, c, x, y);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result4_green[10];

			Object[] result5_black = declul2branchbubImpl
					.pattern_declul2branchbub_10_5_collectcontextelements_blackBBBBBB(match, w, z, c, x, y);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_10_5_collectcontextelements_greenBB(match, c);

			// 
			declul2branchbubImpl.pattern_declul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, w,
					z, c, x, y);
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
		Command w = (Command) result1_bindingAndBlack[0];
		Command z = (Command) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		Branch y = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_11_1_performtransformation_greenFBFFBFFBFBFBF(w, z, d, x, y);
		Assignment m = (Assignment) result1_green[0];
		While b = (While) result1_green[2];
		S2B b2y = (S2B) result1_green[3];
		Assignment l = (Assignment) result1_green[5];
		S2N m2w = (S2N) result1_green[6];
		S2N l2z = (S2N) result1_green[8];
		S2B a2x = (S2B) result1_green[10];
		While a = (While) result1_green[12];

		Object[] result2_black = declul2branchbubImpl
				.pattern_declul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(m, w, b, b2y, z, l, m2w, l2z,
						x, a2x, y, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m] = " + m + ", " + "[w] = " + w
					+ ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[l] = " + l + ", "
					+ "[m2w] = " + m2w + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = declul2branchbubImpl
				.pattern_declul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(m, w, b, b2y, z, l, m2w,
						l2z, x, a2x, y, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = declul2branchbubImpl
				.pattern_declul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, m, w, b, b2y, z,
						d2c, c, l, m2w, d, l2z, x, a2x, y, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m] = " + m + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", "
					+ "[z] = " + z + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
					+ "[m2w] = " + m2w + ", " + "[d] = " + d + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x + ", "
					+ "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[a] = " + a + ".");
		}
		declul2branchbubImpl.pattern_declul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, m, w, b, b2y, z, c, l, m2w, d, l2z, x, a2x, y, a);
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[32];

		// 
		// 
		declul2branchbubImpl.pattern_declul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				m, w, b, b2y, z, d2c, c, l, m2w, d, l2z, x, a2x, y, a);
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
		Command w = (Command) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch y = (Branch) result2_binding[4];
		for (Object[] result2_black : declul2branchbubImpl.pattern_declul2branchbub_12_2_corematch_blackBBFBFBBB(w, z,
				c, x, y, match)) {
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : declul2branchbubImpl.pattern_declul2branchbub_12_3_findcontext_blackBBBBBBB(w,
					z, d2c, c, d, x, y)) {
				Object[] result3_green = declul2branchbubImpl
						.pattern_declul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(w, z, d2c, c, d, x, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = declul2branchbubImpl
						.pattern_declul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, w, z,
								d2c, c, d, x, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[z] = " + z
							+ ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[x] = " + x
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
	public void registerObjectsToMatch_BWD(Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		match.registerObject("w", w);
		match.registerObject("z", z);
		match.registerObject("c", c);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command w, Command z, Branch c, Branch x, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command w, Command z, S2B d2c, Branch c,
			Decision d, Branch x, Branch y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y,
			EObject z, EObject d2c, EObject c, EObject l, EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x,
			EObject y, EObject a) {
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_29(EMoflonEdge _edge_negative) {

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
				.pattern_declul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(_edge_negative)) {
			Command w = (Command) result2_black[0];
			Command z = (Command) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch y = (Branch) result2_black[4];
			Object[] result2_green = declul2branchbubImpl
					.pattern_declul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (declul2branchbubImpl
					.pattern_declul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, w, z, c, x, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(EMoflonEdge _edge_first) {

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
				.pattern_declul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(_edge_first)) {
			Assignment m = (Assignment) result2_black[0];
			While b = (While) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = declul2branchbubImpl
					.pattern_declul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (declul2branchbubImpl
					.pattern_declul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, m, b, l, d, a)) {
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
		Assignment m = (Assignment) result2_bindingAndBlack[0];
		Command w = (Command) result2_bindingAndBlack[1];
		While b = (While) result2_bindingAndBlack[2];
		Command z = (Command) result2_bindingAndBlack[3];
		Branch c = (Branch) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];
		Branch y = (Branch) result2_bindingAndBlack[8];
		While a = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, m, w, b, z, c, l, d, x, y,
						a, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[m] = " + m + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[z] = " + z + ", " + "[c] = "
					+ c + ", " + "[l] = " + l + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[a] = " + a + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : declul2branchbubImpl
					.pattern_declul2branchbub_24_5_matchcorrcontext_blackFBBBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = declul2branchbubImpl
						.pattern_declul2branchbub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = declul2branchbubImpl
						.pattern_declul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(m, w, b, z, c, l, d, x, y,
								a, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m] = " + m + ", "
							+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
							+ "[l] = " + l + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
							+ "[a] = " + a + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				declul2branchbubImpl.pattern_declul2branchbub_24_6_createcorrespondence_greenBBBFBBFFBFBBB(m, w, b, z,
						l, x, y, a, ccMatch);
				//nothing S2B b2y = (S2B) result6_green[3];
				//nothing S2N m2w = (S2N) result6_green[6];
				//nothing S2N l2z = (S2N) result6_green[7];
				//nothing S2B a2x = (S2B) result6_green[9];

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
	public CSP isApplicable_solveCsp_CC(Assignment m, Command w, While b, Command z, Branch c, Assignment l, Decision d,
			Branch x, Branch y, While a, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment m, While b, Assignment l, Decision d, While a) {// 
		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_27_1_matchtggpattern_blackBBBBB(m, b, l,
				d, a);
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
	public boolean checkDEC_BWD(Command w, Command z, Branch c, Branch x, Branch y) {// 
		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_28_1_matchtggpattern_blackBBBBB(w, z, c,
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
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = declul2branchbubImpl
					.pattern_declul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (declul2branchbubImpl.pattern_declul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = declul2branchbubImpl.pattern_declul2branchbub_29_5_checknacs_blackBBB(d2c, c,
						d);
				if (result5_black != null) {

					Object[] result6_black = declul2branchbubImpl.pattern_declul2branchbub_29_6_perform_blackBBBB(d2c,
							c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_29_6_perform_greenFFFFFBFFBFFFFFB(c, d, ruleResult);
					//nothing Assignment m = (Assignment) result6_green[0];
					//nothing Command w = (Command) result6_green[1];
					//nothing While b = (While) result6_green[2];
					//nothing S2B b2y = (S2B) result6_green[3];
					//nothing Command z = (Command) result6_green[4];
					//nothing Assignment l = (Assignment) result6_green[6];
					//nothing S2N m2w = (S2N) result6_green[7];
					//nothing S2N l2z = (S2N) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];
					//nothing S2B a2x = (S2B) result6_green[11];
					//nothing Branch y = (Branch) result6_green[12];
					//nothing While a = (While) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
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
		isApplicableMatch.registerObject("c", c);
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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_S2B_BRANCH_ASSIGNMENT_DECISION_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_COMMAND_S2B_BRANCH_DECISION_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_COMMAND_WHILE_COMMAND_BRANCH_ASSIGNMENT_DECISION_BRANCH_BRANCH_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Command) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7),
					(Branch) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_DECISION_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_DEC_BWD__COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_declul2branchbub_0_1_initialbindings_blackBBBBBBB(declul2branchbub _this,
			Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, m, b, l, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(declul2branchbub _this,
			Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, m, b, l, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, m, b, l, d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(declul2branchbub _this,
			Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		Object[] result_pattern_declul2branchbub_0_2_SolveCSP_binding = pattern_declul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, m, b, l, d, a);
		if (result_pattern_declul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_0_2_SolveCSP_black = pattern_declul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, m, b, l, d, a };
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
			Assignment m, While b, Assignment l, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, m, b, l, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		String b__m____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String b__m____last_name_prime = "last";
		String a__l____last_name_prime = "last";
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		b__m____first.setName(b__m____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { match, m, b, l, d, a, b__m____first, d__b____negative, d__a____positive, b__m____last,
				a__l____last };
	}

	public static final Object[] pattern_declul2branchbub_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment m, While b, Assignment l, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, m, b, l, d, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_declul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(
			declul2branchbub _this, Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		_this.registerObjectsToMatch_FWD(match, m, b, l, d, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("m");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("l");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("a");
		EObject tmpM = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpL = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpA = _localVariable_6;
		if (tmpM instanceof Assignment) {
			Assignment m = (Assignment) tmpM;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									return new Object[] { m, b, d2c, c, l, d, a, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(Assignment m,
			While b, S2B d2c, Branch c, Assignment l, Decision d, While a, declul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { m, b, d2c, c, l, d, a, csp, _this, isApplicableMatch };
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
			Assignment m = (Assignment) result_pattern_declul2branchbub_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_declul2branchbub_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_declul2branchbub_1_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_declul2branchbub_1_1_performtransformation_binding[3];
			Assignment l = (Assignment) result_pattern_declul2branchbub_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_declul2branchbub_1_1_performtransformation_binding[5];
			While a = (While) result_pattern_declul2branchbub_1_1_performtransformation_binding[6];

			Object[] result_pattern_declul2branchbub_1_1_performtransformation_black = pattern_declul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(
					m, b, d2c, c, l, d, a, _this, isApplicableMatch);
			if (result_pattern_declul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_declul2branchbub_1_1_performtransformation_black[7];

				return new Object[] { m, b, d2c, c, l, d, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_greenBFBFFBBFFFFFB(Assignment m,
			While b, Branch c, Assignment l, While a) {
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		b2y.setSource(b);
		m2w.setSource(m);
		m2w.setTarget(w);
		l2z.setSource(l);
		l2z.setTarget(z);
		c.setPositive(x);
		z.setNext(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		c.setNegative(y);
		w.setNext(y);
		y.setPositive(w);
		b2y.setTarget(y);
		return new Object[] { m, w, b, b2y, z, c, l, m2w, l2z, x, a2x, y, a };
	}

	public static final Object[] pattern_declul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Assignment m,
			Command w, While b, S2B b2y, Command z, Assignment l, S2N m2w, S2N l2z, Branch x, S2B a2x, Branch y,
			While a) {
		if (!w.equals(z)) {
			if (!l.equals(m)) {
				if (!l2z.equals(m2w)) {
					if (!x.equals(y)) {
						if (!a2x.equals(b2y)) {
							if (!a.equals(b)) {
								return new Object[] { m, w, b, b2y, z, l, m2w, l2z, x, a2x, y, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Assignment m,
			Command w, While b, S2B b2y, Command z, Assignment l, S2N m2w, S2N l2z, Branch x, S2B a2x, Branch y,
			While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, m, w, b, b2y, z, l, m2w, l2z, x, a2x, y, a };
	}

	public static final Object[] pattern_declul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y, EObject z, EObject d2c,
			EObject c, EObject l, EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x, EObject y, EObject a) {
		if (!m.equals(w)) {
			if (!m.equals(z)) {
				if (!m.equals(m2w)) {
					if (!m.equals(x)) {
						if (!m.equals(y)) {
							if (!w.equals(z)) {
								if (!w.equals(x)) {
									if (!w.equals(y)) {
										if (!b.equals(m)) {
											if (!b.equals(w)) {
												if (!b.equals(b2y)) {
													if (!b.equals(z)) {
														if (!b.equals(d2c)) {
															if (!b.equals(c)) {
																if (!b.equals(l)) {
																	if (!b.equals(m2w)) {
																		if (!b.equals(d)) {
																			if (!b.equals(l2z)) {
																				if (!b.equals(x)) {
																					if (!b.equals(y)) {
																						if (!b2y.equals(m)) {
																							if (!b2y.equals(w)) {
																								if (!b2y.equals(z)) {
																									if (!b2y.equals(
																											d2c)) {
																										if (!b2y.equals(
																												c)) {
																											if (!b2y.equals(
																													l)) {
																												if (!b2y.equals(
																														m2w)) {
																													if (!b2y.equals(
																															d)) {
																														if (!b2y.equals(
																																l2z)) {
																															if (!b2y.equals(
																																	x)) {
																																if (!b2y.equals(
																																		y)) {
																																	if (!d2c.equals(
																																			m)) {
																																		if (!d2c.equals(
																																				w)) {
																																			if (!d2c.equals(
																																					z)) {
																																				if (!d2c.equals(
																																						l)) {
																																					if (!d2c.equals(
																																							m2w)) {
																																						if (!d2c.equals(
																																								l2z)) {
																																							if (!d2c.equals(
																																									x)) {
																																								if (!d2c.equals(
																																										y)) {
																																									if (!c.equals(
																																											m)) {
																																										if (!c.equals(
																																												w)) {
																																											if (!c.equals(
																																													z)) {
																																												if (!c.equals(
																																														d2c)) {
																																													if (!c.equals(
																																															l)) {
																																														if (!c.equals(
																																																m2w)) {
																																															if (!c.equals(
																																																	d)) {
																																																if (!c.equals(
																																																		l2z)) {
																																																	if (!c.equals(
																																																			x)) {
																																																		if (!c.equals(
																																																				y)) {
																																																			if (!l.equals(
																																																					m)) {
																																																				if (!l.equals(
																																																						w)) {
																																																					if (!l.equals(
																																																							z)) {
																																																						if (!l.equals(
																																																								m2w)) {
																																																							if (!l.equals(
																																																									l2z)) {
																																																								if (!l.equals(
																																																										x)) {
																																																									if (!l.equals(
																																																											y)) {
																																																										if (!m2w.equals(
																																																												w)) {
																																																											if (!m2w.equals(
																																																													z)) {
																																																												if (!m2w.equals(
																																																														x)) {
																																																													if (!m2w.equals(
																																																															y)) {
																																																														if (!d.equals(
																																																																m)) {
																																																															if (!d.equals(
																																																																	w)) {
																																																																if (!d.equals(
																																																																		z)) {
																																																																	if (!d.equals(
																																																																			d2c)) {
																																																																		if (!d.equals(
																																																																				l)) {
																																																																			if (!d.equals(
																																																																					m2w)) {
																																																																				if (!d.equals(
																																																																						l2z)) {
																																																																					if (!d.equals(
																																																																							x)) {
																																																																						if (!d.equals(
																																																																								y)) {
																																																																							if (!l2z.equals(
																																																																									m)) {
																																																																								if (!l2z.equals(
																																																																										w)) {
																																																																									if (!l2z.equals(
																																																																											z)) {
																																																																										if (!l2z.equals(
																																																																												m2w)) {
																																																																											if (!l2z.equals(
																																																																													x)) {
																																																																												if (!l2z.equals(
																																																																														y)) {
																																																																													if (!x.equals(
																																																																															z)) {
																																																																														if (!x.equals(
																																																																																y)) {
																																																																															if (!a2x.equals(
																																																																																	m)) {
																																																																																if (!a2x.equals(
																																																																																		w)) {
																																																																																	if (!a2x.equals(
																																																																																			b)) {
																																																																																		if (!a2x.equals(
																																																																																				b2y)) {
																																																																																			if (!a2x.equals(
																																																																																					z)) {
																																																																																				if (!a2x.equals(
																																																																																						d2c)) {
																																																																																					if (!a2x.equals(
																																																																																							c)) {
																																																																																						if (!a2x.equals(
																																																																																								l)) {
																																																																																							if (!a2x.equals(
																																																																																									m2w)) {
																																																																																								if (!a2x.equals(
																																																																																										d)) {
																																																																																									if (!a2x.equals(
																																																																																											l2z)) {
																																																																																										if (!a2x.equals(
																																																																																												x)) {
																																																																																											if (!a2x.equals(
																																																																																													y)) {
																																																																																												if (!y.equals(
																																																																																														z)) {
																																																																																													if (!a.equals(
																																																																																															m)) {
																																																																																														if (!a.equals(
																																																																																																w)) {
																																																																																															if (!a.equals(
																																																																																																	b)) {
																																																																																																if (!a.equals(
																																																																																																		b2y)) {
																																																																																																	if (!a.equals(
																																																																																																			z)) {
																																																																																																		if (!a.equals(
																																																																																																				d2c)) {
																																																																																																			if (!a.equals(
																																																																																																					c)) {
																																																																																																				if (!a.equals(
																																																																																																						l)) {
																																																																																																					if (!a.equals(
																																																																																																							m2w)) {
																																																																																																						if (!a.equals(
																																																																																																								d)) {
																																																																																																							if (!a.equals(
																																																																																																									l2z)) {
																																																																																																								if (!a.equals(
																																																																																																										x)) {
																																																																																																									if (!a.equals(
																																																																																																											a2x)) {
																																																																																																										if (!a.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													m,
																																																																																																													w,
																																																																																																													b,
																																																																																																													b2y,
																																																																																																													z,
																																																																																																													d2c,
																																																																																																													c,
																																																																																																													l,
																																																																																																													m2w,
																																																																																																													d,
																																																																																																													l2z,
																																																																																																													x,
																																																																																																													a2x,
																																																																																																													y,
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
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y, EObject z, EObject c, EObject l,
			EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x, EObject y, EObject a) {
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "declul2branchbub";
		String b__m____first_name_prime = "first";
		String c__y____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String w__y____next_name_prime = "next";
		String m2w__m____source_name_prime = "source";
		String m2w__w____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String b__m____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String y__w____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____first);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getCreatedEdges().add(y__w____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__m____first.setName(b__m____first_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, m, w, b, b2y, z, c, l, m2w, d, l2z, x, a2x, y, a, b__m____first,
				c__y____negative, b2y__b____source, w__y____next, m2w__m____source, m2w__w____target, c__x____positive,
				d__b____negative, d__a____positive, l2z__l____source, l2z__z____target, z__x____next, b__m____last,
				a2x__x____target, y__w____positive, b2y__y____target, a__l____last, a2x__a____source };
	}

	public static final void pattern_declul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			declul2branchbub _this, PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y,
			EObject z, EObject d2c, EObject c, EObject l, EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x,
			EObject y, EObject a) {
		_this.registerObjects_FWD(ruleresult, m, w, b, b2y, z, d2c, c, l, m2w, d, l2z, x, a2x, y, a);

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
		EObject _localVariable_0 = match.getObject("m");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("l");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpM = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpM instanceof Assignment) {
			Assignment m = (Assignment) tmpM;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { m, b, l, d, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_2_2_corematch_blackBBFFBBBB(Assignment m, While b,
			Assignment l, Decision d, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { m, b, d2c, c, l, d, a, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_2_3_findcontext_blackBBBBBBB(Assignment m, While b,
			S2B d2c, Branch c, Assignment l, Decision d, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (m.equals(b.getFirst())) {
					if (c.equals(d2c.getTarget())) {
						if (b.equals(d.getNegative())) {
							if (a.equals(d.getPositive())) {
								if (d.equals(d2c.getSource())) {
									if (m.equals(b.getLast())) {
										if (l.equals(a.getLast())) {
											_result.add(new Object[] { m, b, d2c, c, l, d, a });
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

	public static final Object[] pattern_declul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(Assignment m, While b,
			S2B d2c, Branch c, Assignment l, Decision d, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__m____first_name_prime = "first";
		String d2c__c____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String b__m____last_name_prime = "last";
		String a__l____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____first);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		b__m____first.setName(b__m____first_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { m, b, d2c, c, l, d, a, isApplicableMatch, b__m____first, d2c__c____target,
				d__b____negative, d__a____positive, d2c__d____source, b__m____last, a__l____last };
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Assignment m, While b, S2B d2c, Branch c, Assignment l, Decision d,
			While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, m, b, d2c, c, l, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m, b, d2c, c, l, d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Assignment m, While b, S2B d2c, Branch c, Assignment l, Decision d,
			While a) {
		Object[] result_pattern_declul2branchbub_2_4_solveCSP_binding = pattern_declul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, m, b, d2c, c, l, d, a);
		if (result_pattern_declul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_2_4_solveCSP_black = pattern_declul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m, b, d2c, c, l, d, a };
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
			Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { _this, match, w, z, c, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(declul2branchbub _this,
			Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, w, z, c, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, z, c, x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(declul2branchbub _this,
			Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		Object[] result_pattern_declul2branchbub_10_2_SolveCSP_binding = pattern_declul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, w, z, c, x, y);
		if (result_pattern_declul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_10_2_SolveCSP_black = pattern_declul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, z, c, x, y };
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
			Command w, Command z, Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { match, w, z, c, x, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		match.getToBeTranslatedEdges().add(y__w____positive);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		return new Object[] { match, w, z, c, x, y, c__y____negative, w__y____next, c__x____positive, z__x____next,
				y__w____positive };
	}

	public static final Object[] pattern_declul2branchbub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command w, Command z, Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { match, w, z, c, x, y };
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
			declul2branchbub _this, Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		_this.registerObjectsToMatch_BWD(match, w, z, c, x, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject _localVariable_6 = isApplicableMatch.getObject("y");
		EObject tmpW = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpY = _localVariable_6;
		if (tmpW instanceof Command) {
			Command w = (Command) tmpW;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpY instanceof Branch) {
									Branch y = (Branch) tmpY;
									return new Object[] { w, z, d2c, c, d, x, y, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(Command w,
			Command z, S2B d2c, Branch c, Decision d, Branch x, Branch y, declul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { w, z, d2c, c, d, x, y, csp, _this, isApplicableMatch };
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
			Command w = (Command) result_pattern_declul2branchbub_11_1_performtransformation_binding[0];
			Command z = (Command) result_pattern_declul2branchbub_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_declul2branchbub_11_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_declul2branchbub_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[5];
			Branch y = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[6];

			Object[] result_pattern_declul2branchbub_11_1_performtransformation_black = pattern_declul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(
					w, z, d2c, c, d, x, y, _this, isApplicableMatch);
			if (result_pattern_declul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_declul2branchbub_11_1_performtransformation_black[7];

				return new Object[] { w, z, d2c, c, d, x, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_greenFBFFBFFBFBFBF(Command w,
			Command z, Decision d, Branch x, Branch y) {
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		b.setFirst(m);
		d.setNegative(b);
		b.setLast(m);
		b2y.setSource(b);
		b2y.setTarget(y);
		m2w.setSource(m);
		m2w.setTarget(w);
		l2z.setSource(l);
		l2z.setTarget(z);
		a2x.setTarget(x);
		d.setPositive(a);
		a.setLast(l);
		a2x.setSource(a);
		return new Object[] { m, w, b, b2y, z, l, m2w, d, l2z, x, a2x, y, a };
	}

	public static final Object[] pattern_declul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Assignment m,
			Command w, While b, S2B b2y, Command z, Assignment l, S2N m2w, S2N l2z, Branch x, S2B a2x, Branch y,
			While a) {
		if (!w.equals(z)) {
			if (!l.equals(m)) {
				if (!l2z.equals(m2w)) {
					if (!x.equals(y)) {
						if (!a2x.equals(b2y)) {
							if (!a.equals(b)) {
								return new Object[] { m, w, b, b2y, z, l, m2w, l2z, x, a2x, y, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment m, Command w, While b, S2B b2y, Command z, Assignment l, S2N m2w, S2N l2z, Branch x, S2B a2x,
			Branch y, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(m);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, m, w, b, b2y, z, l, m2w, l2z, x, a2x, y, a };
	}

	public static final Object[] pattern_declul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y, EObject z, EObject d2c,
			EObject c, EObject l, EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x, EObject y, EObject a) {
		if (!m.equals(w)) {
			if (!m.equals(z)) {
				if (!m.equals(m2w)) {
					if (!m.equals(x)) {
						if (!m.equals(y)) {
							if (!w.equals(z)) {
								if (!w.equals(x)) {
									if (!w.equals(y)) {
										if (!b.equals(m)) {
											if (!b.equals(w)) {
												if (!b.equals(b2y)) {
													if (!b.equals(z)) {
														if (!b.equals(d2c)) {
															if (!b.equals(c)) {
																if (!b.equals(l)) {
																	if (!b.equals(m2w)) {
																		if (!b.equals(d)) {
																			if (!b.equals(l2z)) {
																				if (!b.equals(x)) {
																					if (!b.equals(y)) {
																						if (!b2y.equals(m)) {
																							if (!b2y.equals(w)) {
																								if (!b2y.equals(z)) {
																									if (!b2y.equals(
																											d2c)) {
																										if (!b2y.equals(
																												c)) {
																											if (!b2y.equals(
																													l)) {
																												if (!b2y.equals(
																														m2w)) {
																													if (!b2y.equals(
																															d)) {
																														if (!b2y.equals(
																																l2z)) {
																															if (!b2y.equals(
																																	x)) {
																																if (!b2y.equals(
																																		y)) {
																																	if (!d2c.equals(
																																			m)) {
																																		if (!d2c.equals(
																																				w)) {
																																			if (!d2c.equals(
																																					z)) {
																																				if (!d2c.equals(
																																						l)) {
																																					if (!d2c.equals(
																																							m2w)) {
																																						if (!d2c.equals(
																																								l2z)) {
																																							if (!d2c.equals(
																																									x)) {
																																								if (!d2c.equals(
																																										y)) {
																																									if (!c.equals(
																																											m)) {
																																										if (!c.equals(
																																												w)) {
																																											if (!c.equals(
																																													z)) {
																																												if (!c.equals(
																																														d2c)) {
																																													if (!c.equals(
																																															l)) {
																																														if (!c.equals(
																																																m2w)) {
																																															if (!c.equals(
																																																	d)) {
																																																if (!c.equals(
																																																		l2z)) {
																																																	if (!c.equals(
																																																			x)) {
																																																		if (!c.equals(
																																																				y)) {
																																																			if (!l.equals(
																																																					m)) {
																																																				if (!l.equals(
																																																						w)) {
																																																					if (!l.equals(
																																																							z)) {
																																																						if (!l.equals(
																																																								m2w)) {
																																																							if (!l.equals(
																																																									l2z)) {
																																																								if (!l.equals(
																																																										x)) {
																																																									if (!l.equals(
																																																											y)) {
																																																										if (!m2w.equals(
																																																												w)) {
																																																											if (!m2w.equals(
																																																													z)) {
																																																												if (!m2w.equals(
																																																														x)) {
																																																													if (!m2w.equals(
																																																															y)) {
																																																														if (!d.equals(
																																																																m)) {
																																																															if (!d.equals(
																																																																	w)) {
																																																																if (!d.equals(
																																																																		z)) {
																																																																	if (!d.equals(
																																																																			d2c)) {
																																																																		if (!d.equals(
																																																																				l)) {
																																																																			if (!d.equals(
																																																																					m2w)) {
																																																																				if (!d.equals(
																																																																						l2z)) {
																																																																					if (!d.equals(
																																																																							x)) {
																																																																						if (!d.equals(
																																																																								y)) {
																																																																							if (!l2z.equals(
																																																																									m)) {
																																																																								if (!l2z.equals(
																																																																										w)) {
																																																																									if (!l2z.equals(
																																																																											z)) {
																																																																										if (!l2z.equals(
																																																																												m2w)) {
																																																																											if (!l2z.equals(
																																																																													x)) {
																																																																												if (!l2z.equals(
																																																																														y)) {
																																																																													if (!x.equals(
																																																																															z)) {
																																																																														if (!x.equals(
																																																																																y)) {
																																																																															if (!a2x.equals(
																																																																																	m)) {
																																																																																if (!a2x.equals(
																																																																																		w)) {
																																																																																	if (!a2x.equals(
																																																																																			b)) {
																																																																																		if (!a2x.equals(
																																																																																				b2y)) {
																																																																																			if (!a2x.equals(
																																																																																					z)) {
																																																																																				if (!a2x.equals(
																																																																																						d2c)) {
																																																																																					if (!a2x.equals(
																																																																																							c)) {
																																																																																						if (!a2x.equals(
																																																																																								l)) {
																																																																																							if (!a2x.equals(
																																																																																									m2w)) {
																																																																																								if (!a2x.equals(
																																																																																										d)) {
																																																																																									if (!a2x.equals(
																																																																																											l2z)) {
																																																																																										if (!a2x.equals(
																																																																																												x)) {
																																																																																											if (!a2x.equals(
																																																																																													y)) {
																																																																																												if (!y.equals(
																																																																																														z)) {
																																																																																													if (!a.equals(
																																																																																															m)) {
																																																																																														if (!a.equals(
																																																																																																w)) {
																																																																																															if (!a.equals(
																																																																																																	b)) {
																																																																																																if (!a.equals(
																																																																																																		b2y)) {
																																																																																																	if (!a.equals(
																																																																																																			z)) {
																																																																																																		if (!a.equals(
																																																																																																				d2c)) {
																																																																																																			if (!a.equals(
																																																																																																					c)) {
																																																																																																				if (!a.equals(
																																																																																																						l)) {
																																																																																																					if (!a.equals(
																																																																																																							m2w)) {
																																																																																																						if (!a.equals(
																																																																																																								d)) {
																																																																																																							if (!a.equals(
																																																																																																									l2z)) {
																																																																																																								if (!a.equals(
																																																																																																										x)) {
																																																																																																									if (!a.equals(
																																																																																																											a2x)) {
																																																																																																										if (!a.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													m,
																																																																																																													w,
																																																																																																													b,
																																																																																																													b2y,
																																																																																																													z,
																																																																																																													d2c,
																																																																																																													c,
																																																																																																													l,
																																																																																																													m2w,
																																																																																																													d,
																																																																																																													l2z,
																																																																																																													x,
																																																																																																													a2x,
																																																																																																													y,
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
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y, EObject z, EObject c, EObject l,
			EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x, EObject y, EObject a) {
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "declul2branchbub";
		String b__m____first_name_prime = "first";
		String c__y____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String w__y____next_name_prime = "next";
		String m2w__m____source_name_prime = "source";
		String m2w__w____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String b__m____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String y__w____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____first);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getTranslatedEdges().add(y__w____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__m____first.setName(b__m____first_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, m, w, b, b2y, z, c, l, m2w, d, l2z, x, a2x, y, a, b__m____first,
				c__y____negative, b2y__b____source, w__y____next, m2w__m____source, m2w__w____target, c__x____positive,
				d__b____negative, d__a____positive, l2z__l____source, l2z__z____target, z__x____next, b__m____last,
				a2x__x____target, y__w____positive, b2y__y____target, a__l____last, a2x__a____source };
	}

	public static final void pattern_declul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			declul2branchbub _this, PerformRuleResult ruleresult, EObject m, EObject w, EObject b, EObject b2y,
			EObject z, EObject d2c, EObject c, EObject l, EObject m2w, EObject d, EObject l2z, EObject x, EObject a2x,
			EObject y, EObject a) {
		_this.registerObjects_BWD(ruleresult, m, w, b, b2y, z, d2c, c, l, m2w, d, l2z, x, a2x, y, a);

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
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("y");
		EObject tmpW = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpW instanceof Command) {
			Command w = (Command) tmpW;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							return new Object[] { w, z, c, x, y, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_12_2_corematch_blackBBFBFBBB(Command w, Command z,
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
								_result.add(new Object[] { w, z, d2c, c, d, x, y, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_12_3_findcontext_blackBBBBBBB(Command w, Command z,
			S2B d2c, Branch c, Decision d, Branch x, Branch y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						if (y.equals(c.getNegative())) {
							if (y.equals(w.getNext())) {
								if (c.equals(d2c.getTarget())) {
									if (x.equals(c.getPositive())) {
										if (d.equals(d2c.getSource())) {
											if (x.equals(z.getNext())) {
												if (w.equals(y.getPositive())) {
													_result.add(new Object[] { w, z, d2c, c, d, x, y });
												}
											}
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

	public static final Object[] pattern_declul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(Command w, Command z,
			S2B d2c, Branch c, Decision d, Branch x, Branch y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__y____negative_name_prime = "negative";
		String w__y____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		isApplicableMatch.getAllContextElements().add(y__w____positive);
		c__y____negative.setName(c__y____negative_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		return new Object[] { w, z, d2c, c, d, x, y, isApplicableMatch, c__y____negative, w__y____next,
				d2c__c____target, c__x____positive, d2c__d____source, z__x____next, y__w____positive };
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Command w, Command z, S2B d2c, Branch c, Decision d, Branch x,
			Branch y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, z, d2c, c, d, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, z, d2c, c, d, x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			declul2branchbub _this, IsApplicableMatch isApplicableMatch, Command w, Command z, S2B d2c, Branch c,
			Decision d, Branch x, Branch y) {
		Object[] result_pattern_declul2branchbub_12_4_solveCSP_binding = pattern_declul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, w, z, d2c, c, d, x, y);
		if (result_pattern_declul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_12_4_solveCSP_black = pattern_declul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, z, d2c, c, d, x, y };
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Command w) {
		for (Graph __DEC_w_root_925416 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_717159 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_717159)) {
							if (!x.equals(__DEC_w_positive_717159)) {
								if (!y.equals(__DEC_w_positive_717159)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_164046 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_164046)) {
							if (!x.equals(__DEC_w_negative_164046)) {
								if (!y.equals(__DEC_w_negative_164046)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_752403 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_325332 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_325332)) {
							if (!x.equals(__DEC_z_positive_325332)) {
								if (!y.equals(__DEC_z_positive_325332)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_710986 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_710986)) {
							if (!x.equals(__DEC_z_negative_710986)) {
								if (!y.equals(__DEC_z_negative_710986)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_853384 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_446948 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_446948)) {
							if (!c.equals(__DEC_x_positive_446948)) {
								if (!y.equals(__DEC_x_positive_446948)) {
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
					for (Branch __DEC_x_negative_759429 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_759429)) {
							if (!c.equals(__DEC_x_negative_759429)) {
								if (!y.equals(__DEC_x_negative_759429)) {
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
		for (Graph __DEC_y_root_608246 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_727374 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_727374)) {
							if (!c.equals(__DEC_y_positive_727374)) {
								if (!x.equals(__DEC_y_positive_727374)) {
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
					for (Branch __DEC_y_negative_223290 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_223290)) {
							if (!c.equals(__DEC_y_negative_223290)) {
								if (!x.equals(__DEC_y_negative_223290)) {
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
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch y,
			Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
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
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_negative.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpY = _edge_negative.getTrg();
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (!c.equals(y)) {
					if (y.equals(c.getNegative())) {
						Node tmpX = c.getPositive();
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (!c.equals(x)) {
								if (!x.equals(y)) {
									Node tmpW = y.getPositive();
									if (tmpW instanceof Command) {
										Command w = (Command) tmpW;
										if (y.equals(w.getNext())) {
											if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_9B(
													y) == null) {
												if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(c,
														y) == null) {
													if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_6B(
															x) == null) {
														if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(
																x, c, y) == null) {
															if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(
																	x, c, y) == null) {
																if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_10BBB(
																		y, c, x) == null) {
																	if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_11BBB(
																			y, c, x) == null) {
																		if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(
																				c, x) == null) {
																			if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_25BB(
																					x, y) == null) {
																				if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_26BB(
																						x, y) == null) {
																					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
																							w) == null) {
																						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(
																								w, c, x, y) == null) {
																							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(
																									w, c, x,
																									y) == null) {
																								if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																										c, w) == null) {
																									if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																											x,
																											w) == null) {
																										if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
																												c,
																												w) == null) {
																											if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																													x,
																													w) == null) {
																												if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(
																														y,
																														w) == null) {
																													for (Node tmpZ : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	x,
																																	Node.class,
																																	"next")) {
																														if (tmpZ instanceof Command) {
																															Command z = (Command) tmpZ;
																															if (!w.equals(
																																	z)) {
																																if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
																																		z) == null) {
																																	if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(
																																			z,
																																			c,
																																			x,
																																			y) == null) {
																																		if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(
																																				z,
																																				c,
																																				x,
																																				y) == null) {
																																			if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(
																																					c,
																																					z) == null) {
																																				if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(
																																						x,
																																						z) == null) {
																																					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(
																																							y,
																																							z) == null) {
																																						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(
																																								c,
																																								z) == null) {
																																							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(
																																									x,
																																									z) == null) {
																																								if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(
																																										y,
																																										z) == null) {
																																									_result.add(
																																											new Object[] {
																																													w,
																																													z,
																																													c,
																																													x,
																																													y,
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
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			declul2branchbub _this, Match match, Command w, Command z, Branch c, Branch x, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, w, z, c, x, y);
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

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_754662 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_754662)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_222912 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_222912)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment m,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_313368 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_313368)) {
					if (!a.equals(__DEC_m_last_313368)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_3B(Assignment m) {
		for (Program __DEC_m_first_189141 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(While b, Decision d) {
		for (Decision __DEC_b_positive_304465 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_304465)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_395197 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_395197)) {
					if (!a.equals(__DEC_b_first_395197)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_867820 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_867820)) {
					if (!a.equals(__DEC_b_last_867820)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_7B(While b) {
		for (Program __DEC_b_first_317455 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_530812 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_530812)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_893248 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_893248)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_10BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_750811 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_750811)) {
					if (!a.equals(__DEC_l_first_750811)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_11BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_111102 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_111102)) {
					if (!a.equals(__DEC_l_last_111102)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_28573 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(While a,
			Decision d) {
		for (Decision __DEC_a_negative_955750 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_955750)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_97666 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_97666)) {
					if (!b.equals(__DEC_a_first_97666)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_305812 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_305812)) {
					if (!b.equals(__DEC_a_last_305812)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_16B(While a) {
		for (Program __DEC_a_first_54426 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_27BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_28BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_first.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpM = _edge_first.getTrg();
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (m.equals(b.getFirst())) {
					if (m.equals(b.getLast())) {
						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_7B(b) == null) {
							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_3B(m) == null) {
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
													if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(
															m, d) == null) {
														if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(
																m, d) == null) {
															if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(
																	b, d) == null) {
																if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																		d, m) == null) {
																	if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																			d, m) == null) {
																		if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																				d, b) == null) {
																			if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(
																					m, b, a) == null) {
																				if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(
																						b, a) == null) {
																					if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(
																							b, a) == null) {
																						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																								a, d) == null) {
																							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																									a, b) == null) {
																								if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(
																										a, b) == null) {
																									if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_16B(
																											a) == null) {
																										if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																												a,
																												m) == null) {
																											if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(
																													d,
																													a) == null) {
																												if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_27BB(
																														b,
																														a) == null) {
																													if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_28BB(
																															b,
																															a) == null) {
																														if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(
																																l,
																																d) == null) {
																															if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(
																																	l,
																																	d) == null) {
																																if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_10BBB(
																																		l,
																																		b,
																																		a) == null) {
																																	if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_11BBB(
																																			l,
																																			b,
																																			a) == null) {
																																		if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_12B(
																																				l) == null) {
																																			if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
																																					d,
																																					l) == null) {
																																				if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(
																																						d,
																																						l) == null) {
																																					if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(
																																							b,
																																							l) == null) {
																																						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(
																																								a,
																																								l) == null) {
																																							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(
																																									b,
																																									l) == null) {
																																								_result.add(
																																										new Object[] {
																																												m,
																																												b,
																																												l,
																																												d,
																																												a,
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
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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
			declul2branchbub _this, Match match, Assignment m, While b, Assignment l, Decision d, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, m, b, l, d, a);
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

	public static final Object[] pattern_declul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("m");
		EObject _localVariable_1 = targetMatch.getObject("w");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = targetMatch.getObject("c");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject _localVariable_8 = targetMatch.getObject("y");
		EObject _localVariable_9 = sourceMatch.getObject("a");
		EObject tmpM = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpX = _localVariable_7;
		EObject tmpY = _localVariable_8;
		EObject tmpA = _localVariable_9;
		if (tmpM instanceof Assignment) {
			Assignment m = (Assignment) tmpM;
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										if (tmpY instanceof Branch) {
											Branch y = (Branch) tmpY;
											if (tmpA instanceof While) {
												While a = (While) tmpA;
												return new Object[] { m, w, b, z, c, l, d, x, y, a, sourceMatch,
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

	public static final Object[] pattern_declul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Assignment m,
			Command w, While b, Command z, Branch c, Assignment l, Decision d, Branch x, Branch y, While a,
			Match sourceMatch, Match targetMatch) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!l.equals(m)) {
						if (!x.equals(y)) {
							if (!a.equals(b)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch };
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
				sourceMatch, targetMatch);
		if (result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			Assignment m = (Assignment) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[0];
			Command w = (Command) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[1];
			While b = (While) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Command z = (Command) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Branch c = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[7];
			Branch y = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[8];
			While a = (While) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_declul2branchbub_24_2_matchsrctrgcontext_black = pattern_declul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch);
			if (result_pattern_declul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(declul2branchbub _this,
			Assignment m, Command w, While b, Command z, Branch c, Assignment l, Decision d, Branch x, Branch y,
			While a, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			declul2branchbub _this, Assignment m, Command w, While b, Command z, Branch c, Assignment l, Decision d,
			Branch x, Branch y, While a, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_declul2branchbub_24_3_solvecsp_binding = pattern_declul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch);
		if (result_pattern_declul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_declul2branchbub_24_3_solvecsp_black = pattern_declul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_declul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, m, w, b, z, c, l, d, x, y, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_24_5_matchcorrcontext_blackFBBBB(Branch c,
			Decision d, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d2c, c, d, sourceMatch, targetMatch });
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

	public static final Object[] pattern_declul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(Assignment m,
			Command w, While b, Command z, Branch c, Assignment l, Decision d, Branch x, Branch y, While a,
			CCMatch ccMatch) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!l.equals(m)) {
						if (!x.equals(y)) {
							if (!a.equals(b)) {
								return new Object[] { m, w, b, z, c, l, d, x, y, a, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_6_createcorrespondence_greenBBBFBBFFBFBBB(Assignment m,
			Command w, While b, Command z, Assignment l, Branch x, Branch y, While a, CCMatch ccMatch) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { m, w, b, b2y, z, l, m2w, l2z, x, a2x, y, a, ccMatch };
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

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_0BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_741483 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_741483)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_1BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_924831 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_924831)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_2BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_79956 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_79956)) {
					if (!a.equals(__DEC_m_last_79956)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_3B(Assignment m) {
		for (Program __DEC_m_first_227796 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_4BB(While b, Decision d) {
		for (Decision __DEC_b_positive_196241 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_196241)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_5BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_994176 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_994176)) {
					if (!a.equals(__DEC_b_first_994176)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_6BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_738140 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_738140)) {
					if (!a.equals(__DEC_b_last_738140)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_7B(While b) {
		for (Program __DEC_b_first_180882 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_8BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_933518 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_933518)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_9BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_30777 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_30777)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_10BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_942453 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_942453)) {
					if (!a.equals(__DEC_l_first_942453)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_11BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_988581 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_988581)) {
					if (!a.equals(__DEC_l_last_988581)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_662566 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_13BB(While a, Decision d) {
		for (Decision __DEC_a_negative_669264 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_669264)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_14BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_504442 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_504442)) {
					if (!b.equals(__DEC_a_first_504442)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_15BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_981769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_981769)) {
					if (!b.equals(__DEC_a_last_981769)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_16B(While a) {
		for (Program __DEC_a_first_707524 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_19BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_20BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_21BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_22BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_23BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_24BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_25BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_26BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_27BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_28BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_blackBBBBB(Assignment m, While b,
			Assignment l, Decision d, While a) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (m.equals(b.getFirst())) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (m.equals(b.getLast())) {
								if (l.equals(a.getLast())) {
									if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_0BB(m, d) == null) {
										if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_1BB(m, d) == null) {
											if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_2BBB(m, b,
													a) == null) {
												if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_3B(
														m) == null) {
													if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_4BB(b,
															d) == null) {
														if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_5BB(
																b, a) == null) {
															if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_6BB(
																	b, a) == null) {
																if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_7B(
																		b) == null) {
																	if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_8BB(
																			l, d) == null) {
																		if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_9BB(
																				l, d) == null) {
																			if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_10BBB(
																					l, b, a) == null) {
																				if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_11BBB(
																						l, b, a) == null) {
																					if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_12B(
																							l) == null) {
																						if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																								a, d) == null) {
																							if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																									a, b) == null) {
																								if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_15BB(
																										a, b) == null) {
																									if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_16B(
																											a) == null) {
																										if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																												d,
																												m) == null) {
																											if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																													d,
																													m) == null) {
																												if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																														a,
																														m) == null) {
																													if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																															d,
																															b) == null) {
																														if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_21BB(
																																d,
																																l) == null) {
																															if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_22BB(
																																	d,
																																	l) == null) {
																																if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_23BB(
																																		b,
																																		l) == null) {
																																	if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_24BB(
																																			a,
																																			l) == null) {
																																		if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_25BB(
																																				b,
																																				l) == null) {
																																			if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_26BB(
																																					d,
																																					a) == null) {
																																				if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_27BB(
																																						b,
																																						a) == null) {
																																					if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_28BB(
																																							b,
																																							a) == null) {
																																						return new Object[] {
																																								m,
																																								b,
																																								l,
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

	public static final boolean pattern_declul2branchbub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_declul2branchbub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_0B(Command w) {
		for (Graph __DEC_w_root_928751 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_338389 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_338389)) {
							if (!x.equals(__DEC_w_positive_338389)) {
								if (!y.equals(__DEC_w_positive_338389)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(Command w, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_830507 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_830507)) {
							if (!x.equals(__DEC_w_negative_830507)) {
								if (!y.equals(__DEC_w_negative_830507)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_352467 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_946857 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_946857)) {
							if (!x.equals(__DEC_z_positive_946857)) {
								if (!y.equals(__DEC_z_positive_946857)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_296925 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_296925)) {
							if (!x.equals(__DEC_z_negative_296925)) {
								if (!y.equals(__DEC_z_negative_296925)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_648553 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_67376 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_67376)) {
							if (!c.equals(__DEC_x_positive_67376)) {
								if (!y.equals(__DEC_x_positive_67376)) {
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
					for (Branch __DEC_x_negative_389483 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_389483)) {
							if (!c.equals(__DEC_x_negative_389483)) {
								if (!y.equals(__DEC_x_negative_389483)) {
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
		for (Graph __DEC_y_root_925556 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_988024 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_988024)) {
							if (!c.equals(__DEC_y_positive_988024)) {
								if (!x.equals(__DEC_y_positive_988024)) {
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
					for (Branch __DEC_y_negative_951010 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_951010)) {
							if (!c.equals(__DEC_y_negative_951010)) {
								if (!x.equals(__DEC_y_negative_951010)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_17BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_18BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_19BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_20BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_21BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_22BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_blackBBBBB(Command w, Command z,
			Branch c, Branch x, Branch y) {
		if (!w.equals(z)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						if (y.equals(c.getNegative())) {
							if (y.equals(w.getNext())) {
								if (x.equals(c.getPositive())) {
									if (x.equals(z.getNext())) {
										if (w.equals(y.getPositive())) {
											if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_0B(w) == null) {
												if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(w, c,
														x, y) == null) {
													if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(w,
															c, x, y) == null) {
														if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_3B(
																z) == null) {
															if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(
																	z, c, x, y) == null) {
																if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(
																		z, c, x, y) == null) {
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
																									c, w) == null) {
																								if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																										x, w) == null) {
																									if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																											c,
																											w) == null) {
																										if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																												x,
																												w) == null) {
																											if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																													y,
																													w) == null) {
																												if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																														c,
																														z) == null) {
																													if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_18BB(
																															x,
																															z) == null) {
																														if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_19BB(
																																y,
																																z) == null) {
																															if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_20BB(
																																	c,
																																	z) == null) {
																																if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_21BB(
																																		x,
																																		z) == null) {
																																	if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_22BB(
																																			y,
																																			z) == null) {
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
																																								w,
																																								z,
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
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
							if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											d) == null) {
										_result.add(
												new Object[] { d2cList, d2c, c, d, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_declul2branchbub_29_3_solveCSP_binding = pattern_declul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_declul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_29_3_solveCSP_black = pattern_declul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_29_4_checkCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_29_5_checknacs_blackBBB(S2B d2c, Branch c, Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_declul2branchbub_29_6_perform_blackBBBB(S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_declul2branchbub_29_6_perform_greenFFFFFBFFBFFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(m);
		ruleResult.getTargetObjects().add(w);
		b.setFirst(m);
		d.setNegative(b);
		b.setLast(m);
		ruleResult.getSourceObjects().add(b);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getSourceObjects().add(l);
		m2w.setSource(m);
		m2w.setTarget(w);
		ruleResult.getCorrObjects().add(m2w);
		l2z.setSource(l);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		c.setPositive(x);
		z.setNext(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		c.setNegative(y);
		w.setNext(y);
		y.setPositive(w);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		d.setPositive(a);
		a.setLast(l);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m, w, b, b2y, z, c, l, m2w, d, l2z, x, a2x, y, a, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_declul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //declul2branchbubImpl
