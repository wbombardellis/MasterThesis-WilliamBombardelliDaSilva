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
	public boolean isAppropriate_FWD(Match match, While b, While a, Assignment m, Decision d, Assignment l) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_0_1_initialbindings_blackBBBBBBB(this,
				match, b, a, m, d, l);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[m] = " + m + ", "
					+ "[d] = " + d + ", " + "[l] = " + l + ".");
		}

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, b, a, m, d, l);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[m] = " + m + ", "
					+ "[d] = " + d + ", " + "[l] = " + l + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = declul2branchbubImpl
					.pattern_declul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(match, b, a, m, d, l);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[a] = " + a + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[l] = " + l + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, b,
					a, m, d, l);
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge b__m____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[10];

			Object[] result5_black = declul2branchbubImpl
					.pattern_declul2branchbub_0_5_collectcontextelements_blackBBBBBB(match, b, a, m, d, l);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[a] = " + a + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[l] = " + l + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_0_5_collectcontextelements_greenBB(match, d);

			// 
			declul2branchbubImpl.pattern_declul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, b,
					a, m, d, l);
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
		While b = (While) result1_bindingAndBlack[0];
		While a = (While) result1_bindingAndBlack[1];
		Assignment m = (Assignment) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Assignment l = (Assignment) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_1_1_performtransformation_greenFBFBFFBFFFBFB(b, a, m, l, c);
		Command z = (Command) result1_green[0];
		Branch x = (Branch) result1_green[2];
		Branch y = (Branch) result1_green[4];
		S2N m2w = (S2N) result1_green[5];
		S2N l2z = (S2N) result1_green[7];
		S2B b2y = (S2B) result1_green[8];
		Command w = (Command) result1_green[9];
		S2B a2x = (S2B) result1_green[11];

		Object[] result2_black = declul2branchbubImpl
				.pattern_declul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(z, b, x, a, y, m2w, m, l2z,
						b2y, w, l, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[b] = " + b
					+ ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[m2w] = " + m2w + ", "
					+ "[m] = " + m + ", " + "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[w] = " + w + ", "
					+ "[l] = " + l + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = declul2branchbubImpl
				.pattern_declul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(z, b, x, a, y, m2w, m, l2z,
						b2y, w, l, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = declul2branchbubImpl
				.pattern_declul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, z, b, x, a, y, m2w,
						m, d, l2z, b2y, w, d2c, l, a2x, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ", " + "[m2w] = " + m2w + ", " + "[m] = " + m + ", " + "[d] = " + d + ", "
					+ "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[w] = " + w + ", " + "[d2c] = " + d2c + ", "
					+ "[l] = " + l + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ".");
		}
		declul2branchbubImpl.pattern_declul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, z, b, x, a, y, m2w, m, d, l2z, b2y, w, l, a2x, c);
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[32];

		// 
		// 
		declul2branchbubImpl.pattern_declul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				z, b, x, a, y, m2w, m, d, l2z, b2y, w, d2c, l, a2x, c);
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
		While b = (While) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment m = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		Assignment l = (Assignment) result2_binding[4];
		for (Object[] result2_black : declul2branchbubImpl.pattern_declul2branchbub_2_2_corematch_blackBBBBFBFB(b, a, m,
				d, l, match)) {
			S2B d2c = (S2B) result2_black[4];
			Branch c = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : declul2branchbubImpl.pattern_declul2branchbub_2_3_findcontext_blackBBBBBBB(b,
					a, m, d, d2c, l, c)) {
				Object[] result3_green = declul2branchbubImpl
						.pattern_declul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(b, a, m, d, d2c, l, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = declul2branchbubImpl
						.pattern_declul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, b, a,
								m, d, d2c, l, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[a] = " + a
							+ ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[d2c] = " + d2c + ", " + "[l] = " + l
							+ ", " + "[c] = " + c + ".");
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While b, While a, Assignment m,
			Decision d, S2B d2c, Assignment l, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("l", l);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y,
			EObject m2w, EObject m, EObject d, EObject l2z, EObject b2y, EObject w, EObject d2c, EObject l, EObject a2x,
			EObject c) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);

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
	public boolean isAppropriate_BWD(Match match, Command z, Branch x, Branch y, Command w, Branch c) {

		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_10_1_initialbindings_blackBBBBBBB(this,
				match, z, x, y, w, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[w] = " + w + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, x, y, w, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[w] = " + w + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = declul2branchbubImpl
					.pattern_declul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(match, z, x, y, w, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match, z,
					x, y, w, c);
			//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[10];

			Object[] result5_black = declul2branchbubImpl
					.pattern_declul2branchbub_10_5_collectcontextelements_blackBBBBBB(match, z, x, y, w, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			declul2branchbubImpl.pattern_declul2branchbub_10_5_collectcontextelements_greenBB(match, c);

			// 
			declul2branchbubImpl.pattern_declul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, z,
					x, y, w, c);
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
		Branch x = (Branch) result1_bindingAndBlack[1];
		Branch y = (Branch) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Command w = (Command) result1_bindingAndBlack[4];
		S2B d2c = (S2B) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = declul2branchbubImpl
				.pattern_declul2branchbub_11_1_performtransformation_greenBFBFBFFBFFBFF(z, x, y, d, w);
		While b = (While) result1_green[1];
		While a = (While) result1_green[3];
		S2N m2w = (S2N) result1_green[5];
		Assignment m = (Assignment) result1_green[6];
		S2N l2z = (S2N) result1_green[8];
		S2B b2y = (S2B) result1_green[9];
		Assignment l = (Assignment) result1_green[11];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = declul2branchbubImpl
				.pattern_declul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(z, b, x, a, y, m2w, m, l2z,
						b2y, w, l, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[b] = " + b
					+ ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[m2w] = " + m2w + ", "
					+ "[m] = " + m + ", " + "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[w] = " + w + ", "
					+ "[l] = " + l + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = declul2branchbubImpl
				.pattern_declul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(z, b, x, a, y, m2w, m, l2z,
						b2y, w, l, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = declul2branchbubImpl
				.pattern_declul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, z, b, x, a, y, m2w,
						m, d, l2z, b2y, w, d2c, l, a2x, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ", " + "[m2w] = " + m2w + ", " + "[m] = " + m + ", " + "[d] = " + d + ", "
					+ "[l2z] = " + l2z + ", " + "[b2y] = " + b2y + ", " + "[w] = " + w + ", " + "[d2c] = " + d2c + ", "
					+ "[l] = " + l + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ".");
		}
		declul2branchbubImpl.pattern_declul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
				ruleresult, z, b, x, a, y, m2w, m, d, l2z, b2y, w, l, a2x, c);
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[32];

		// 
		// 
		declul2branchbubImpl.pattern_declul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				z, b, x, a, y, m2w, m, d, l2z, b2y, w, d2c, l, a2x, c);
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
		Branch x = (Branch) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		Command w = (Command) result2_binding[3];
		Branch c = (Branch) result2_binding[4];
		for (Object[] result2_black : declul2branchbubImpl.pattern_declul2branchbub_12_2_corematch_blackBBBFBFBB(z, x,
				y, w, c, match)) {
			Decision d = (Decision) result2_black[3];
			S2B d2c = (S2B) result2_black[5];
			// ForEach 
			for (Object[] result3_black : declul2branchbubImpl.pattern_declul2branchbub_12_3_findcontext_blackBBBBBBB(z,
					x, y, d, w, d2c, c)) {
				Object[] result3_green = declul2branchbubImpl
						.pattern_declul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(z, x, y, d, w, d2c, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = declul2branchbubImpl
						.pattern_declul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z, x,
								y, d, w, d2c, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[x] = " + x
							+ ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[d2c] = " + d2c
							+ ", " + "[c] = " + c + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("w", w);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch x, Branch y, Command w, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, Branch x, Branch y, Decision d,
			Command w, S2B d2c, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y,
			EObject m2w, EObject m, EObject d, EObject l2z, EObject b2y, EObject w, EObject d2c, EObject l, EObject a2x,
			EObject c) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a2x", a2x);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_257(EMoflonEdge _edge_positive) {

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
				.pattern_declul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Command z = (Command) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Command w = (Command) result2_black[3];
			Branch c = (Branch) result2_black[4];
			Object[] result2_green = declul2branchbubImpl
					.pattern_declul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (declul2branchbubImpl
					.pattern_declul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, x, y, w, c)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_265(EMoflonEdge _edge_last) {

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
				.pattern_declul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(_edge_last)) {
			While b = (While) result2_black[0];
			While a = (While) result2_black[1];
			Assignment m = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Assignment l = (Assignment) result2_black[4];
			Object[] result2_green = declul2branchbubImpl
					.pattern_declul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (declul2branchbubImpl
					.pattern_declul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, b, a, m, d, l)) {
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
		While b = (While) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		While a = (While) result2_bindingAndBlack[3];
		Branch y = (Branch) result2_bindingAndBlack[4];
		Assignment m = (Assignment) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Command w = (Command) result2_bindingAndBlack[7];
		Assignment l = (Assignment) result2_bindingAndBlack[8];
		Branch c = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = declul2branchbubImpl
				.pattern_declul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, z, b, x, a, y, m, d, w, l,
						c, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = "
					+ y + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[l] = " + l + ", "
					+ "[c] = " + c + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (declul2branchbubImpl.pattern_declul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : declul2branchbubImpl
					.pattern_declul2branchbub_24_5_matchcorrcontext_blackBFBBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = declul2branchbubImpl
						.pattern_declul2branchbub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = declul2branchbubImpl
						.pattern_declul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(z, b, x, a, y, m, d, w, l,
								c, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
							+ "[m] = " + m + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[l] = " + l + ", "
							+ "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				declul2branchbubImpl.pattern_declul2branchbub_24_6_createcorrespondence_greenBBBBBFBFFBBFB(z, b, x, a,
						y, m, w, l, ccMatch);
				//nothing S2N m2w = (S2N) result6_green[5];
				//nothing S2N l2z = (S2N) result6_green[7];
				//nothing S2B b2y = (S2B) result6_green[8];
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
	public CSP isApplicable_solveCsp_CC(Command z, While b, Branch x, While a, Branch y, Assignment m, Decision d,
			Command w, Assignment l, Branch c, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_27_1_matchtggpattern_blackBBBBB(b, a, m,
				d, l);
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
	public boolean checkDEC_BWD(Command z, Branch x, Branch y, Command w, Branch c) {// 
		Object[] result1_black = declul2branchbubImpl.pattern_declul2branchbub_28_1_matchtggpattern_blackBBBBB(z, x, y,
				w, c);
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
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = declul2branchbubImpl
					.pattern_declul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, d2c, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[d2c] = " + d2c
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (declul2branchbubImpl.pattern_declul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = declul2branchbubImpl.pattern_declul2branchbub_29_5_checknacs_blackBBB(d, d2c,
						c);
				if (result5_black != null) {

					Object[] result6_black = declul2branchbubImpl.pattern_declul2branchbub_29_6_perform_blackBBBB(d,
							d2c, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					declul2branchbubImpl.pattern_declul2branchbub_29_6_perform_greenFFFFFFFBFFFFFBB(d, c, ruleResult);
					//nothing Command z = (Command) result6_green[0];
					//nothing While b = (While) result6_green[1];
					//nothing Branch x = (Branch) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing Branch y = (Branch) result6_green[4];
					//nothing S2N m2w = (S2N) result6_green[5];
					//nothing Assignment m = (Assignment) result6_green[6];
					//nothing S2N l2z = (S2N) result6_green[8];
					//nothing S2B b2y = (S2B) result6_green[9];
					//nothing Command w = (Command) result6_green[10];
					//nothing Assignment l = (Assignment) result6_green[11];
					//nothing S2B a2x = (S2B) result6_green[12];

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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4), (Assignment) arguments.get(5));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_WHILE_ASSIGNMENT_DECISION_S2B_ASSIGNMENT_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(S2B) arguments.get(5), (Assignment) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_BRANCH_DECISION_COMMAND_S2B_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(Command) arguments.get(5), (S2B) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_257__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_257((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_265__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_265((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_WHILE_BRANCH_WHILE_BRANCH_ASSIGNMENT_DECISION_COMMAND_ASSIGNMENT_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (Command) arguments.get(7),
					(Assignment) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECLUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_DECISION_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_declul2branchbub_0_1_initialbindings_blackBBBBBBB(declul2branchbub _this,
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { _this, match, b, a, m, d, l };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(declul2branchbub _this,
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, m, d, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, m, d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(declul2branchbub _this,
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		Object[] result_pattern_declul2branchbub_0_2_SolveCSP_binding = pattern_declul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, b, a, m, d, l);
		if (result_pattern_declul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_0_2_SolveCSP_black = pattern_declul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, m, d, l };
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
			While b, While a, Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, b, a, m, d, l };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(l);
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____first);
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
		b__m____first.setName(b__m____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, b, a, m, d, l, b__m____last, b__m____first, d__a____positive, a__l____last,
				d__b____negative };
	}

	public static final Object[] pattern_declul2branchbub_0_5_collectcontextelements_blackBBBBBB(Match match, While b,
			While a, Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, b, a, m, d, l };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_declul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(
			declul2branchbub _this, Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		_this.registerObjectsToMatch_FWD(match, b, a, m, d, l);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("m");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("l");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { b, a, m, d, d2c, l, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(While b, While a,
			Assignment m, Decision d, S2B d2c, Assignment l, Branch c, declul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { b, a, m, d, d2c, l, c, csp, _this, isApplicableMatch };
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
			While b = (While) result_pattern_declul2branchbub_1_1_performtransformation_binding[0];
			While a = (While) result_pattern_declul2branchbub_1_1_performtransformation_binding[1];
			Assignment m = (Assignment) result_pattern_declul2branchbub_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_declul2branchbub_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_declul2branchbub_1_1_performtransformation_binding[4];
			Assignment l = (Assignment) result_pattern_declul2branchbub_1_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_declul2branchbub_1_1_performtransformation_binding[6];

			Object[] result_pattern_declul2branchbub_1_1_performtransformation_black = pattern_declul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(
					b, a, m, d, d2c, l, c, _this, isApplicableMatch);
			if (result_pattern_declul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_declul2branchbub_1_1_performtransformation_black[7];

				return new Object[] { b, a, m, d, d2c, l, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_1_performtransformation_greenFBFBFFBFFFBFB(While b, While a,
			Assignment m, Assignment l, Branch c) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		z.setNext(x);
		c.setPositive(x);
		c.setNegative(y);
		m2w.setSource(m);
		l2z.setTarget(z);
		l2z.setSource(l);
		b2y.setSource(b);
		b2y.setTarget(y);
		y.setPositive(w);
		w.setNext(y);
		m2w.setTarget(w);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { z, b, x, a, y, m2w, m, l2z, b2y, w, l, a2x, c };
	}

	public static final Object[] pattern_declul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Command z,
			While b, Branch x, While a, Branch y, S2N m2w, Assignment m, S2N l2z, S2B b2y, Command w, Assignment l,
			S2B a2x) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!l2z.equals(m2w)) {
					if (!w.equals(z)) {
						if (!l.equals(m)) {
							if (!a2x.equals(b2y)) {
								return new Object[] { z, b, x, a, y, m2w, m, l2z, b2y, w, l, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Command z,
			While b, Branch x, While a, Branch y, S2N m2w, Assignment m, S2N l2z, S2B b2y, Command w, Assignment l,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, z, b, x, a, y, m2w, m, l2z, b2y, w, l, a2x };
	}

	public static final Object[] pattern_declul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y, EObject m2w, EObject m,
			EObject d, EObject l2z, EObject b2y, EObject w, EObject d2c, EObject l, EObject a2x, EObject c) {
		if (!b.equals(z)) {
			if (!b.equals(x)) {
				if (!b.equals(y)) {
					if (!b.equals(m2w)) {
						if (!b.equals(m)) {
							if (!b.equals(d)) {
								if (!b.equals(l2z)) {
									if (!b.equals(b2y)) {
										if (!b.equals(w)) {
											if (!b.equals(d2c)) {
												if (!b.equals(l)) {
													if (!b.equals(c)) {
														if (!x.equals(z)) {
															if (!x.equals(y)) {
																if (!a.equals(z)) {
																	if (!a.equals(b)) {
																		if (!a.equals(x)) {
																			if (!a.equals(y)) {
																				if (!a.equals(m2w)) {
																					if (!a.equals(m)) {
																						if (!a.equals(d)) {
																							if (!a.equals(l2z)) {
																								if (!a.equals(b2y)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												d2c)) {
																											if (!a.equals(
																													l)) {
																												if (!a.equals(
																														a2x)) {
																													if (!a.equals(
																															c)) {
																														if (!y.equals(
																																z)) {
																															if (!m2w.equals(
																																	z)) {
																																if (!m2w.equals(
																																		x)) {
																																	if (!m2w.equals(
																																			y)) {
																																		if (!m2w.equals(
																																				w)) {
																																			if (!m.equals(
																																					z)) {
																																				if (!m.equals(
																																						x)) {
																																					if (!m.equals(
																																							y)) {
																																						if (!m.equals(
																																								m2w)) {
																																							if (!m.equals(
																																									w)) {
																																								if (!d.equals(
																																										z)) {
																																									if (!d.equals(
																																											x)) {
																																										if (!d.equals(
																																												y)) {
																																											if (!d.equals(
																																													m2w)) {
																																												if (!d.equals(
																																														m)) {
																																													if (!d.equals(
																																															l2z)) {
																																														if (!d.equals(
																																																w)) {
																																															if (!d.equals(
																																																	d2c)) {
																																																if (!d.equals(
																																																		l)) {
																																																	if (!l2z.equals(
																																																			z)) {
																																																		if (!l2z.equals(
																																																				x)) {
																																																			if (!l2z.equals(
																																																					y)) {
																																																				if (!l2z.equals(
																																																						m2w)) {
																																																					if (!l2z.equals(
																																																							m)) {
																																																						if (!l2z.equals(
																																																								w)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											y)) {
																																																										if (!b2y.equals(
																																																												m2w)) {
																																																											if (!b2y.equals(
																																																													m)) {
																																																												if (!b2y.equals(
																																																														d)) {
																																																													if (!b2y.equals(
																																																															l2z)) {
																																																														if (!b2y.equals(
																																																																w)) {
																																																															if (!b2y.equals(
																																																																	d2c)) {
																																																																if (!b2y.equals(
																																																																		l)) {
																																																																	if (!b2y.equals(
																																																																			c)) {
																																																																		if (!w.equals(
																																																																				z)) {
																																																																			if (!w.equals(
																																																																					x)) {
																																																																				if (!w.equals(
																																																																						y)) {
																																																																					if (!d2c.equals(
																																																																							z)) {
																																																																						if (!d2c.equals(
																																																																								x)) {
																																																																							if (!d2c.equals(
																																																																									y)) {
																																																																								if (!d2c.equals(
																																																																										m2w)) {
																																																																									if (!d2c.equals(
																																																																											m)) {
																																																																										if (!d2c.equals(
																																																																												l2z)) {
																																																																											if (!d2c.equals(
																																																																													w)) {
																																																																												if (!d2c.equals(
																																																																														l)) {
																																																																													if (!l.equals(
																																																																															z)) {
																																																																														if (!l.equals(
																																																																																x)) {
																																																																															if (!l.equals(
																																																																																	y)) {
																																																																																if (!l.equals(
																																																																																		m2w)) {
																																																																																	if (!l.equals(
																																																																																			m)) {
																																																																																		if (!l.equals(
																																																																																				l2z)) {
																																																																																			if (!l.equals(
																																																																																					w)) {
																																																																																				if (!a2x.equals(
																																																																																						z)) {
																																																																																					if (!a2x.equals(
																																																																																							b)) {
																																																																																						if (!a2x.equals(
																																																																																								x)) {
																																																																																							if (!a2x.equals(
																																																																																									y)) {
																																																																																								if (!a2x.equals(
																																																																																										m2w)) {
																																																																																									if (!a2x.equals(
																																																																																											m)) {
																																																																																										if (!a2x.equals(
																																																																																												d)) {
																																																																																											if (!a2x.equals(
																																																																																													l2z)) {
																																																																																												if (!a2x.equals(
																																																																																														b2y)) {
																																																																																													if (!a2x.equals(
																																																																																															w)) {
																																																																																														if (!a2x.equals(
																																																																																																d2c)) {
																																																																																															if (!a2x.equals(
																																																																																																	l)) {
																																																																																																if (!a2x.equals(
																																																																																																		c)) {
																																																																																																	if (!c.equals(
																																																																																																			z)) {
																																																																																																		if (!c.equals(
																																																																																																				x)) {
																																																																																																			if (!c.equals(
																																																																																																					y)) {
																																																																																																				if (!c.equals(
																																																																																																						m2w)) {
																																																																																																					if (!c.equals(
																																																																																																							m)) {
																																																																																																						if (!c.equals(
																																																																																																								d)) {
																																																																																																							if (!c.equals(
																																																																																																									l2z)) {
																																																																																																								if (!c.equals(
																																																																																																										w)) {
																																																																																																									if (!c.equals(
																																																																																																											d2c)) {
																																																																																																										if (!c.equals(
																																																																																																												l)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													z,
																																																																																																													b,
																																																																																																													x,
																																																																																																													a,
																																																																																																													y,
																																																																																																													m2w,
																																																																																																													m,
																																																																																																													d,
																																																																																																													l2z,
																																																																																																													b2y,
																																																																																																													w,
																																																																																																													d2c,
																																																																																																													l,
																																																																																																													a2x,
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

	public static final Object[] pattern_declul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y, EObject m2w, EObject m,
			EObject d, EObject l2z, EObject b2y, EObject w, EObject l, EObject a2x, EObject c) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "declul2branchbub";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		String m2w__m____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String b2y__b____source_name_prime = "source";
		String y__w____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String m2w__w____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____first);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getCreatedEdges().add(y__w____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { ruleresult, z, b, x, a, y, m2w, m, d, l2z, b2y, w, l, a2x, c, b__m____last, b__m____first,
				m2w__m____source, d__a____positive, l2z__z____target, a__l____last, b2y__b____source, y__w____positive,
				b2y__y____target, w__y____next, m2w__w____target, z__x____next, d__b____negative, a2x__a____source,
				a2x__x____target, l2z__l____source, c__y____negative, c__x____positive };
	}

	public static final void pattern_declul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			declul2branchbub _this, PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y,
			EObject m2w, EObject m, EObject d, EObject l2z, EObject b2y, EObject w, EObject d2c, EObject l, EObject a2x,
			EObject c) {
		_this.registerObjects_FWD(ruleresult, z, b, x, a, y, m2w, m, d, l2z, b2y, w, d2c, l, a2x, c);

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

	public static final Iterable<Object[]> pattern_declul2branchbub_2_2_corematch_blackBBBBFBFB(While b, While a,
			Assignment m, Decision d, Assignment l, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { b, a, m, d, d2c, l, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_2_3_findcontext_blackBBBBBBB(While b, While a,
			Assignment m, Decision d, S2B d2c, Assignment l, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (m.equals(b.getLast())) {
					if (m.equals(b.getFirst())) {
						if (a.equals(d.getPositive())) {
							if (l.equals(a.getLast())) {
								if (d.equals(d2c.getSource())) {
									if (b.equals(d.getNegative())) {
										if (c.equals(d2c.getTarget())) {
											_result.add(new Object[] { b, a, m, d, d2c, l, c });
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

	public static final Object[] pattern_declul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(While b, While a,
			Assignment m, Decision d, S2B d2c, Assignment l, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(c);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { b, a, m, d, d2c, l, c, isApplicableMatch, b__m____last, b__m____first, d__a____positive,
				a__l____last, d2c__d____source, d__b____negative, d2c__c____target };
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, While b, While a, Assignment m, Decision d, S2B d2c, Assignment l,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, a, m, d, d2c, l, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, a, m, d, d2c, l, c };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, While b, While a, Assignment m, Decision d, S2B d2c, Assignment l,
			Branch c) {
		Object[] result_pattern_declul2branchbub_2_4_solveCSP_binding = pattern_declul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, b, a, m, d, d2c, l, c);
		if (result_pattern_declul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_2_4_solveCSP_black = pattern_declul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, a, m, d, d2c, l, c };
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
			Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { _this, match, z, x, y, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(declul2branchbub _this,
			Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, x, y, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, x, y, w, c };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(declul2branchbub _this,
			Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		Object[] result_pattern_declul2branchbub_10_2_SolveCSP_binding = pattern_declul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, x, y, w, c);
		if (result_pattern_declul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_10_2_SolveCSP_black = pattern_declul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, x, y, w, c };
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
			Command z, Branch x, Branch y, Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { match, z, x, y, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(w);
		String y__w____positive_name_prime = "positive";
		String w__y____next_name_prime = "next";
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		match.getToBeTranslatedEdges().add(y__w____positive);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		y__w____positive.setName(y__w____positive_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { match, z, x, y, w, c, y__w____positive, w__y____next, z__x____next, c__y____negative,
				c__x____positive };
	}

	public static final Object[] pattern_declul2branchbub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command z, Branch x, Branch y, Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { match, z, x, y, w, c };
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
			declul2branchbub _this, Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		_this.registerObjectsToMatch_BWD(match, z, x, y, w, c);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpD2c = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpW instanceof Command) {
							Command w = (Command) tmpW;
							if (tmpD2c instanceof S2B) {
								S2B d2c = (S2B) tmpD2c;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { z, x, y, d, w, d2c, c, isApplicableMatch };
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
			Branch x, Branch y, Decision d, Command w, S2B d2c, Branch c, declul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, x, y, d, w, d2c, c, csp, _this, isApplicableMatch };
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
			Branch x = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[1];
			Branch y = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_declul2branchbub_11_1_performtransformation_binding[3];
			Command w = (Command) result_pattern_declul2branchbub_11_1_performtransformation_binding[4];
			S2B d2c = (S2B) result_pattern_declul2branchbub_11_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_declul2branchbub_11_1_performtransformation_binding[6];

			Object[] result_pattern_declul2branchbub_11_1_performtransformation_black = pattern_declul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(
					z, x, y, d, w, d2c, c, _this, isApplicableMatch);
			if (result_pattern_declul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_declul2branchbub_11_1_performtransformation_black[7];

				return new Object[] { z, x, y, d, w, d2c, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_1_performtransformation_greenBFBFBFFBFFBFF(Command z,
			Branch x, Branch y, Decision d, Command w) {
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d.setNegative(b);
		d.setPositive(a);
		m2w.setTarget(w);
		b.setLast(m);
		b.setFirst(m);
		m2w.setSource(m);
		l2z.setTarget(z);
		b2y.setSource(b);
		b2y.setTarget(y);
		a.setLast(l);
		l2z.setSource(l);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { z, b, x, a, y, m2w, m, d, l2z, b2y, w, l, a2x };
	}

	public static final Object[] pattern_declul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Command z,
			While b, Branch x, While a, Branch y, S2N m2w, Assignment m, S2N l2z, S2B b2y, Command w, Assignment l,
			S2B a2x) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!l2z.equals(m2w)) {
					if (!w.equals(z)) {
						if (!l.equals(m)) {
							if (!a2x.equals(b2y)) {
								return new Object[] { z, b, x, a, y, m2w, m, l2z, b2y, w, l, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Command z,
			While b, Branch x, While a, Branch y, S2N m2w, Assignment m, S2N l2z, S2B b2y, Command w, Assignment l,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, z, b, x, a, y, m2w, m, l2z, b2y, w, l, a2x };
	}

	public static final Object[] pattern_declul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y, EObject m2w, EObject m,
			EObject d, EObject l2z, EObject b2y, EObject w, EObject d2c, EObject l, EObject a2x, EObject c) {
		if (!b.equals(z)) {
			if (!b.equals(x)) {
				if (!b.equals(y)) {
					if (!b.equals(m2w)) {
						if (!b.equals(m)) {
							if (!b.equals(d)) {
								if (!b.equals(l2z)) {
									if (!b.equals(b2y)) {
										if (!b.equals(w)) {
											if (!b.equals(d2c)) {
												if (!b.equals(l)) {
													if (!b.equals(c)) {
														if (!x.equals(z)) {
															if (!x.equals(y)) {
																if (!a.equals(z)) {
																	if (!a.equals(b)) {
																		if (!a.equals(x)) {
																			if (!a.equals(y)) {
																				if (!a.equals(m2w)) {
																					if (!a.equals(m)) {
																						if (!a.equals(d)) {
																							if (!a.equals(l2z)) {
																								if (!a.equals(b2y)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												d2c)) {
																											if (!a.equals(
																													l)) {
																												if (!a.equals(
																														a2x)) {
																													if (!a.equals(
																															c)) {
																														if (!y.equals(
																																z)) {
																															if (!m2w.equals(
																																	z)) {
																																if (!m2w.equals(
																																		x)) {
																																	if (!m2w.equals(
																																			y)) {
																																		if (!m2w.equals(
																																				w)) {
																																			if (!m.equals(
																																					z)) {
																																				if (!m.equals(
																																						x)) {
																																					if (!m.equals(
																																							y)) {
																																						if (!m.equals(
																																								m2w)) {
																																							if (!m.equals(
																																									w)) {
																																								if (!d.equals(
																																										z)) {
																																									if (!d.equals(
																																											x)) {
																																										if (!d.equals(
																																												y)) {
																																											if (!d.equals(
																																													m2w)) {
																																												if (!d.equals(
																																														m)) {
																																													if (!d.equals(
																																															l2z)) {
																																														if (!d.equals(
																																																w)) {
																																															if (!d.equals(
																																																	d2c)) {
																																																if (!d.equals(
																																																		l)) {
																																																	if (!l2z.equals(
																																																			z)) {
																																																		if (!l2z.equals(
																																																				x)) {
																																																			if (!l2z.equals(
																																																					y)) {
																																																				if (!l2z.equals(
																																																						m2w)) {
																																																					if (!l2z.equals(
																																																							m)) {
																																																						if (!l2z.equals(
																																																								w)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											y)) {
																																																										if (!b2y.equals(
																																																												m2w)) {
																																																											if (!b2y.equals(
																																																													m)) {
																																																												if (!b2y.equals(
																																																														d)) {
																																																													if (!b2y.equals(
																																																															l2z)) {
																																																														if (!b2y.equals(
																																																																w)) {
																																																															if (!b2y.equals(
																																																																	d2c)) {
																																																																if (!b2y.equals(
																																																																		l)) {
																																																																	if (!b2y.equals(
																																																																			c)) {
																																																																		if (!w.equals(
																																																																				z)) {
																																																																			if (!w.equals(
																																																																					x)) {
																																																																				if (!w.equals(
																																																																						y)) {
																																																																					if (!d2c.equals(
																																																																							z)) {
																																																																						if (!d2c.equals(
																																																																								x)) {
																																																																							if (!d2c.equals(
																																																																									y)) {
																																																																								if (!d2c.equals(
																																																																										m2w)) {
																																																																									if (!d2c.equals(
																																																																											m)) {
																																																																										if (!d2c.equals(
																																																																												l2z)) {
																																																																											if (!d2c.equals(
																																																																													w)) {
																																																																												if (!d2c.equals(
																																																																														l)) {
																																																																													if (!l.equals(
																																																																															z)) {
																																																																														if (!l.equals(
																																																																																x)) {
																																																																															if (!l.equals(
																																																																																	y)) {
																																																																																if (!l.equals(
																																																																																		m2w)) {
																																																																																	if (!l.equals(
																																																																																			m)) {
																																																																																		if (!l.equals(
																																																																																				l2z)) {
																																																																																			if (!l.equals(
																																																																																					w)) {
																																																																																				if (!a2x.equals(
																																																																																						z)) {
																																																																																					if (!a2x.equals(
																																																																																							b)) {
																																																																																						if (!a2x.equals(
																																																																																								x)) {
																																																																																							if (!a2x.equals(
																																																																																									y)) {
																																																																																								if (!a2x.equals(
																																																																																										m2w)) {
																																																																																									if (!a2x.equals(
																																																																																											m)) {
																																																																																										if (!a2x.equals(
																																																																																												d)) {
																																																																																											if (!a2x.equals(
																																																																																													l2z)) {
																																																																																												if (!a2x.equals(
																																																																																														b2y)) {
																																																																																													if (!a2x.equals(
																																																																																															w)) {
																																																																																														if (!a2x.equals(
																																																																																																d2c)) {
																																																																																															if (!a2x.equals(
																																																																																																	l)) {
																																																																																																if (!a2x.equals(
																																																																																																		c)) {
																																																																																																	if (!c.equals(
																																																																																																			z)) {
																																																																																																		if (!c.equals(
																																																																																																				x)) {
																																																																																																			if (!c.equals(
																																																																																																					y)) {
																																																																																																				if (!c.equals(
																																																																																																						m2w)) {
																																																																																																					if (!c.equals(
																																																																																																							m)) {
																																																																																																						if (!c.equals(
																																																																																																								d)) {
																																																																																																							if (!c.equals(
																																																																																																									l2z)) {
																																																																																																								if (!c.equals(
																																																																																																										w)) {
																																																																																																									if (!c.equals(
																																																																																																											d2c)) {
																																																																																																										if (!c.equals(
																																																																																																												l)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													z,
																																																																																																													b,
																																																																																																													x,
																																																																																																													a,
																																																																																																													y,
																																																																																																													m2w,
																																																																																																													m,
																																																																																																													d,
																																																																																																													l2z,
																																																																																																													b2y,
																																																																																																													w,
																																																																																																													d2c,
																																																																																																													l,
																																																																																																													a2x,
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

	public static final Object[] pattern_declul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y, EObject m2w, EObject m,
			EObject d, EObject l2z, EObject b2y, EObject w, EObject l, EObject a2x, EObject c) {
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "declul2branchbub";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		String m2w__m____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String b2y__b____source_name_prime = "source";
		String y__w____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String m2w__w____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____first);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getTranslatedEdges().add(y__w____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { ruleresult, z, b, x, a, y, m2w, m, d, l2z, b2y, w, l, a2x, c, b__m____last, b__m____first,
				m2w__m____source, d__a____positive, l2z__z____target, a__l____last, b2y__b____source, y__w____positive,
				b2y__y____target, w__y____next, m2w__w____target, z__x____next, d__b____negative, a2x__a____source,
				a2x__x____target, l2z__l____source, c__y____negative, c__x____positive };
	}

	public static final void pattern_declul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			declul2branchbub _this, PerformRuleResult ruleresult, EObject z, EObject b, EObject x, EObject a, EObject y,
			EObject m2w, EObject m, EObject d, EObject l2z, EObject b2y, EObject w, EObject d2c, EObject l, EObject a2x,
			EObject c) {
		_this.registerObjects_BWD(ruleresult, z, b, x, a, y, m2w, m, d, l2z, b2y, w, d2c, l, a2x, c);

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
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("w");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							return new Object[] { z, x, y, w, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_12_2_corematch_blackBBBFBFBB(Command z, Branch x,
			Branch y, Command w, Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { z, x, y, d, w, d2c, c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_12_3_findcontext_blackBBBBBBB(Command z, Branch x,
			Branch y, Decision d, Command w, S2B d2c, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (w.equals(y.getPositive())) {
							if (y.equals(w.getNext())) {
								if (x.equals(z.getNext())) {
									if (d.equals(d2c.getSource())) {
										if (c.equals(d2c.getTarget())) {
											if (y.equals(c.getNegative())) {
												if (x.equals(c.getPositive())) {
													_result.add(new Object[] { z, x, y, d, w, d2c, c });
												}
											}
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

	public static final Object[] pattern_declul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(Command z, Branch x,
			Branch y, Decision d, Command w, S2B d2c, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__w____positive_name_prime = "positive";
		String w__y____next_name_prime = "next";
		String z__x____next_name_prime = "next";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		isApplicableMatch.getAllContextElements().add(y__w____positive);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		y__w____positive.setName(y__w____positive_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { z, x, y, d, w, d2c, c, isApplicableMatch, y__w____positive, w__y____next, z__x____next,
				d2c__d____source, d2c__c____target, c__y____negative, c__x____positive };
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch x, Branch y, Decision d, Command w, S2B d2c,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, x, y, d, w, d2c, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, x, y, d, w, d2c, c };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			declul2branchbub _this, IsApplicableMatch isApplicableMatch, Command z, Branch x, Branch y, Decision d,
			Command w, S2B d2c, Branch c) {
		Object[] result_pattern_declul2branchbub_12_4_solveCSP_binding = pattern_declul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, x, y, d, w, d2c, c);
		if (result_pattern_declul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_12_4_solveCSP_black = pattern_declul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, x, y, d, w, d2c, c };
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
		for (Graph __DEC_z_root_263824 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_753607 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_753607)) {
							if (!y.equals(__DEC_z_positive_753607)) {
								if (!c.equals(__DEC_z_positive_753607)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_481505 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_481505)) {
							if (!y.equals(__DEC_z_negative_481505)) {
								if (!c.equals(__DEC_z_negative_481505)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_970935 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_933503 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_933503)) {
							if (!y.equals(__DEC_x_positive_933503)) {
								if (!c.equals(__DEC_x_positive_933503)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_820560 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_820560)) {
							if (!y.equals(__DEC_x_negative_820560)) {
								if (!c.equals(__DEC_x_negative_820560)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_575764 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_744928 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_744928)) {
							if (!x.equals(__DEC_y_positive_744928)) {
								if (!c.equals(__DEC_y_positive_744928)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_121541 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_121541)) {
							if (!x.equals(__DEC_y_negative_121541)) {
								if (!c.equals(__DEC_y_negative_121541)) {
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

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_9B(Command w) {
		for (Graph __DEC_w_root_450994 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_10BBBB(Command w,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_positive_715699 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!x.equals(__DEC_w_positive_715699)) {
							if (!y.equals(__DEC_w_positive_715699)) {
								if (!c.equals(__DEC_w_positive_715699)) {
									return new Object[] { w, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_11BBBB(Command w,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_negative_208905 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!x.equals(__DEC_w_negative_208905)) {
							if (!y.equals(__DEC_w_negative_208905)) {
								if (!c.equals(__DEC_w_negative_208905)) {
									return new Object[] { w, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(Branch c,
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(Branch y,
			Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_positive.getSrc();
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			EObject tmpW = _edge_positive.getTrg();
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (w.equals(y.getPositive())) {
					if (y.equals(w.getNext())) {
						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_6B(y) == null) {
							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_9B(w) == null) {
								if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(y, w) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(y, Branch.class, "negative")) {
										if (!c.equals(y)) {
											Node tmpX = c.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!x.equals(y)) {
													if (!c.equals(x)) {
														if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(
																c, w) == null) {
															if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(
																	c, w) == null) {
																if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
																		x) == null) {
																	if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(
																			x, y, c) == null) {
																		if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(
																				x, y, c) == null) {
																			if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(
																					y, x, c) == null) {
																				if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(
																						y, x, c) == null) {
																					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_10BBBB(
																							w, x, y, c) == null) {
																						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_11BBBB(
																								w, x, y, c) == null) {
																							if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(
																									x, y) == null) {
																								if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(
																										x, y) == null) {
																									if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(
																											x,
																											w) == null) {
																										if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(
																												x,
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
																														if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
																																z) == null) {
																															if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(
																																	z,
																																	x,
																																	y,
																																	c) == null) {
																																if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(
																																		z,
																																		x,
																																		y,
																																		c) == null) {
																																	if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																																			x,
																																			z) == null) {
																																		if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																																				y,
																																				z) == null) {
																																			if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
																																					c,
																																					z) == null) {
																																				if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																																						x,
																																						z) == null) {
																																					if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(
																																							y,
																																							z) == null) {
																																						if (pattern_declul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(
																																								c,
																																								z) == null) {
																																							_result.add(
																																									new Object[] {
																																											z,
																																											x,
																																											y,
																																											w,
																																											c,
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
			declul2branchbub _this, Match match, Command z, Branch x, Branch y, Command w, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, x, y, w, c);
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

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(While b, Decision d) {
		for (Decision __DEC_b_positive_289627 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_289627)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_998858 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_998858)) {
					if (!a.equals(__DEC_b_first_998858)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_269703 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_269703)) {
					if (!a.equals(__DEC_b_last_269703)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_3B(While b) {
		for (Program __DEC_b_first_74394 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_256393 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_256393)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_963924 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_963924)) {
					if (!b.equals(__DEC_a_first_963924)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_565164 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_565164)) {
					if (!b.equals(__DEC_a_last_565164)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_676410 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_153488 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_153488)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_541227 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_541227)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_10BBB(Assignment m,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_52886 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_52886)) {
					if (!a.equals(__DEC_m_last_52886)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_11B(Assignment m) {
		for (Program __DEC_m_first_645673 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_223065 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_223065)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_250233 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_250233)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_14BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_982680 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_982680)) {
					if (!a.equals(__DEC_l_first_982680)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_15BBB(Assignment l,
			While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_483226 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_483226)) {
					if (!a.equals(__DEC_l_last_483226)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_16B(Assignment l) {
		for (Program __DEC_l_first_310515 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_27BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_28BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_last.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpM = _edge_last.getTrg();
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (m.equals(b.getLast())) {
					if (m.equals(b.getFirst())) {
						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_3B(b) == null) {
							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_11B(m) == null) {
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
															b, d) == null) {
														if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(
																m, d) == null) {
															if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(
																	m, d) == null) {
																if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																		d, b) == null) {
																	if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
																			d, m) == null) {
																		if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(
																				d, m) == null) {
																			if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(
																					b, a) == null) {
																				if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(
																						b, a) == null) {
																					if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(
																							a, d) == null) {
																						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(
																								a, b) == null) {
																							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(
																									a, b) == null) {
																								if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_7B(
																										a) == null) {
																									if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_10BBB(
																											m, b,
																											a) == null) {
																										if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																												d,
																												a) == null) {
																											if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																													b,
																													a) == null) {
																												if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																														b,
																														a) == null) {
																													if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(
																															a,
																															m) == null) {
																														if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(
																																l,
																																d) == null) {
																															if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																																	l,
																																	d) == null) {
																																if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_14BBB(
																																		l,
																																		b,
																																		a) == null) {
																																	if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_15BBB(
																																			l,
																																			b,
																																			a) == null) {
																																		if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_16B(
																																				l) == null) {
																																			if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(
																																					d,
																																					l) == null) {
																																				if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(
																																						d,
																																						l) == null) {
																																					if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(
																																							b,
																																							l) == null) {
																																						if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_27BB(
																																								a,
																																								l) == null) {
																																							if (pattern_declul2branchbub_21_2_testcorematchandDECs_black_nac_28BB(
																																									b,
																																									l) == null) {
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
			declul2branchbub _this, Match match, While b, While a, Assignment m, Decision d, Assignment l) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, m, d, l);
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
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = targetMatch.getObject("y");
		EObject _localVariable_5 = sourceMatch.getObject("m");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = targetMatch.getObject("w");
		EObject _localVariable_8 = sourceMatch.getObject("l");
		EObject _localVariable_9 = targetMatch.getObject("c");
		EObject tmpZ = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpM = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpW = _localVariable_7;
		EObject tmpL = _localVariable_8;
		EObject tmpC = _localVariable_9;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (tmpM instanceof Assignment) {
								Assignment m = (Assignment) tmpM;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpW instanceof Command) {
										Command w = (Command) tmpW;
										if (tmpL instanceof Assignment) {
											Assignment l = (Assignment) tmpL;
											if (tmpC instanceof Branch) {
												Branch c = (Branch) tmpC;
												return new Object[] { z, b, x, a, y, m, d, w, l, c, targetMatch,
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

	public static final Object[] pattern_declul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Command z, While b,
			Branch x, While a, Branch y, Assignment m, Decision d, Command w, Assignment l, Branch c, Match sourceMatch,
			Match targetMatch) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!l.equals(m)) {
						if (!c.equals(x)) {
							if (!c.equals(y)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch };
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
			While b = (While) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[2];
			While a = (While) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Branch y = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Assignment m = (Assignment) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Command w = (Command) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[7];
			Assignment l = (Assignment) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[8];
			Branch c = (Branch) result_pattern_declul2branchbub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_declul2branchbub_24_2_matchsrctrgcontext_black = pattern_declul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch);
			if (result_pattern_declul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(declul2branchbub _this,
			Command z, While b, Branch x, While a, Branch y, Assignment m, Decision d, Command w, Assignment l,
			Branch c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			declul2branchbub _this, Command z, While b, Branch x, While a, Branch y, Assignment m, Decision d,
			Command w, Assignment l, Branch c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_declul2branchbub_24_3_solvecsp_binding = pattern_declul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch);
		if (result_pattern_declul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_declul2branchbub_24_3_solvecsp_black = pattern_declul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_declul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, b, x, a, y, m, d, w, l, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_declul2branchbub_24_5_matchcorrcontext_blackBFBBB(Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { d, d2c, c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_declul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(Command z, While b,
			Branch x, While a, Branch y, Assignment m, Decision d, Command w, Assignment l, Branch c, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!l.equals(m)) {
						if (!c.equals(x)) {
							if (!c.equals(y)) {
								return new Object[] { z, b, x, a, y, m, d, w, l, c, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_24_6_createcorrespondence_greenBBBBBFBFFBBFB(Command z,
			While b, Branch x, While a, Branch y, Assignment m, Command w, Assignment l, CCMatch ccMatch) {
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { z, b, x, a, y, m2w, m, l2z, b2y, w, l, a2x, ccMatch };
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

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_0BB(While b, Decision d) {
		for (Decision __DEC_b_positive_736450 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_736450)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_1BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_29356 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_29356)) {
					if (!a.equals(__DEC_b_first_29356)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_2BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_355422 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_355422)) {
					if (!a.equals(__DEC_b_last_355422)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_3B(While b) {
		for (Program __DEC_b_first_366275 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_597769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_597769)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_984914 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_984914)) {
					if (!b.equals(__DEC_a_first_984914)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_155901 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_155901)) {
					if (!b.equals(__DEC_a_last_155901)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_515035 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_8BB(Assignment m, Decision d) {
		for (Decision __DEC_m_positive_719341 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_719341)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_9BB(Assignment m, Decision d) {
		for (Decision __DEC_m_negative_10089 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_10089)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_10BBB(Assignment m, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_593298 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!b.equals(__DEC_m_last_593298)) {
					if (!a.equals(__DEC_m_last_593298)) {
						return new Object[] { m, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_11B(Assignment m) {
		for (Program __DEC_m_first_929150 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_12BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_10063 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_10063)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_13BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_844326 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_844326)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_14BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_first_950047 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "first")) {
				if (!b.equals(__DEC_l_first_950047)) {
					if (!a.equals(__DEC_l_first_950047)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_15BBB(Assignment l, While b,
			While a) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_179640 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!b.equals(__DEC_l_last_179640)) {
					if (!a.equals(__DEC_l_last_179640)) {
						return new Object[] { l, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_16B(Assignment l) {
		for (Program __DEC_l_first_431937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_17BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_19BB(While b, While a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_20BB(While b, While a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_21BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_22BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_23BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_24BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_25BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_26BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_27BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_black_nac_28BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_27_1_matchtggpattern_blackBBBBB(While b, While a,
			Assignment m, Decision d, Assignment l) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (m.equals(b.getLast())) {
					if (m.equals(b.getFirst())) {
						if (a.equals(d.getPositive())) {
							if (l.equals(a.getLast())) {
								if (b.equals(d.getNegative())) {
									if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
										if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
											if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_2BB(b,
													a) == null) {
												if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_3B(
														b) == null) {
													if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_4BB(a,
															d) == null) {
														if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_5BB(
																a, b) == null) {
															if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_6BB(
																	a, b) == null) {
																if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_7B(
																		a) == null) {
																	if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_8BB(
																			m, d) == null) {
																		if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_9BB(
																				m, d) == null) {
																			if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_10BBB(
																					m, b, a) == null) {
																				if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_11B(
																						m) == null) {
																					if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_12BB(
																							l, d) == null) {
																						if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																								l, d) == null) {
																							if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_14BBB(
																									l, b, a) == null) {
																								if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_15BBB(
																										l, b,
																										a) == null) {
																									if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_16B(
																											l) == null) {
																										if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																												d,
																												b) == null) {
																											if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																													d,
																													a) == null) {
																												if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																														b,
																														a) == null) {
																													if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																															b,
																															a) == null) {
																														if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_21BB(
																																d,
																																m) == null) {
																															if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_22BB(
																																	d,
																																	m) == null) {
																																if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_23BB(
																																		a,
																																		m) == null) {
																																	if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_24BB(
																																			d,
																																			l) == null) {
																																		if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_25BB(
																																				d,
																																				l) == null) {
																																			if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_26BB(
																																					b,
																																					l) == null) {
																																				if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_27BB(
																																						a,
																																						l) == null) {
																																					if (pattern_declul2branchbub_27_1_matchtggpattern_black_nac_28BB(
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
		for (Graph __DEC_z_root_512237 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_476260 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_476260)) {
							if (!y.equals(__DEC_z_positive_476260)) {
								if (!c.equals(__DEC_z_positive_476260)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_319602 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_319602)) {
							if (!y.equals(__DEC_z_negative_319602)) {
								if (!c.equals(__DEC_z_negative_319602)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_286667 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_319541 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_319541)) {
							if (!y.equals(__DEC_x_positive_319541)) {
								if (!c.equals(__DEC_x_positive_319541)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_262412 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_262412)) {
							if (!y.equals(__DEC_x_negative_262412)) {
								if (!c.equals(__DEC_x_negative_262412)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_770845 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_778074 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_778074)) {
							if (!x.equals(__DEC_y_positive_778074)) {
								if (!c.equals(__DEC_y_positive_778074)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_845174 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_845174)) {
							if (!x.equals(__DEC_y_negative_845174)) {
								if (!c.equals(__DEC_y_negative_845174)) {
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

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_9B(Command w) {
		for (Graph __DEC_w_root_907732 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_10BBBB(Command w, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_positive_774092 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!x.equals(__DEC_w_positive_774092)) {
							if (!y.equals(__DEC_w_positive_774092)) {
								if (!c.equals(__DEC_w_positive_774092)) {
									return new Object[] { w, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_11BBBB(Command w, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_negative_486059 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!x.equals(__DEC_w_negative_486059)) {
							if (!y.equals(__DEC_w_negative_486059)) {
								if (!c.equals(__DEC_w_negative_486059)) {
									return new Object[] { w, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_17BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_18BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_19BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_20BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_21BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_22BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_23BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_black_nac_24BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_28_1_matchtggpattern_blackBBBBB(Command z, Branch x, Branch y,
			Command w, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (w.equals(y.getPositive())) {
							if (y.equals(w.getNext())) {
								if (x.equals(z.getNext())) {
									if (y.equals(c.getNegative())) {
										if (x.equals(c.getPositive())) {
											if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_0B(z) == null) {
												if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(z, x,
														y, c) == null) {
													if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(z,
															x, y, c) == null) {
														if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_3B(
																x) == null) {
															if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_4BBB(
																	x, y, c) == null) {
																if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_5BBB(
																		x, y, c) == null) {
																	if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_6B(
																			y) == null) {
																		if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_7BBB(
																				y, x, c) == null) {
																			if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_8BBB(
																					y, x, c) == null) {
																				if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_9B(
																						w) == null) {
																					if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_10BBBB(
																							w, x, y, c) == null) {
																						if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_11BBBB(
																								w, x, y, c) == null) {
																							if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																									x, z) == null) {
																								if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																										y, z) == null) {
																									if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																											c,
																											z) == null) {
																										if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																												x,
																												z) == null) {
																											if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																													y,
																													z) == null) {
																												if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																														c,
																														z) == null) {
																													if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_18BB(
																															x,
																															y) == null) {
																														if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_19BB(
																																x,
																																y) == null) {
																															if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_20BB(
																																	x,
																																	w) == null) {
																																if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_21BB(
																																		c,
																																		w) == null) {
																																	if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_22BB(
																																			x,
																																			w) == null) {
																																		if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_23BB(
																																				y,
																																				w) == null) {
																																			if (pattern_declul2branchbub_28_1_matchtggpattern_black_nac_24BB(
																																					c,
																																					w) == null) {
																																				return new Object[] {
																																						z,
																																						x,
																																						y,
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						Branch c = d2c.getTarget();
						if (c != null) {
							if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										d) == null) {
									if (pattern_declul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_bindingFBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, d2c, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_declul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(declul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_declul2branchbub_29_3_solveCSP_binding = pattern_declul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, d2c, c, ruleResult);
		if (result_pattern_declul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_declul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_declul2branchbub_29_3_solveCSP_black = pattern_declul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_declul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_declul2branchbub_29_4_checkCSP_expressionFBB(declul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_declul2branchbub_29_5_checknacs_blackBBB(Decision d, S2B d2c, Branch c) {
		return new Object[] { d, d2c, c };
	}

	public static final Object[] pattern_declul2branchbub_29_6_perform_blackBBBB(Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, d2c, c, ruleResult };
	}

	public static final Object[] pattern_declul2branchbub_29_6_perform_greenFFFFFFFBFFFFFBB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(z);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		z.setNext(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.getCorrObjects().add(m2w);
		b.setLast(m);
		b.setFirst(m);
		m2w.setSource(m);
		ruleResult.getSourceObjects().add(m);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		y.setPositive(w);
		w.setNext(y);
		m2w.setTarget(w);
		ruleResult.getTargetObjects().add(w);
		a.setLast(l);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { z, b, x, a, y, m2w, m, d, l2z, b2y, w, l, a2x, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_declul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //declul2branchbubImpl
